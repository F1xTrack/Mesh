package com.huawei.hms.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.HandlerC2220f;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0852NX;

/* loaded from: classes.dex */
public class HmsMessageService extends Service {
    public static final String PROXY_TYPE = "proxy_type";
    public static final String SUBJECT_ID = "subject_id";

    /* renamed from: a */
    private final Messenger f19357a = new Messenger(new HandlerC2220f(new C2213b(this, null)));

    /* renamed from: com.huawei.hms.push.HmsMessageService$a */
    public class RunnableC2212a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f19358a;

        /* renamed from: b */
        final /* synthetic */ String f19359b;

        public RunnableC2212a(String str, String str2) {
            this.f19358a = str;
            this.f19359b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context applicationContext = HmsMessageService.this.getApplicationContext();
            if (this.f19359b.equals(BaseUtils.getLocalToken(applicationContext, this.f19358a))) {
                return;
            }
            HMSLog.m12622i("HmsMessageService", "receive a new token, refresh the local token");
            BaseUtils.saveToken(applicationContext, this.f19358a, this.f19359b);
        }
    }

    /* renamed from: com.huawei.hms.push.HmsMessageService$b */
    public class C2213b implements HandlerC2220f.a {
        private C2213b() {
        }

        @Override // com.huawei.hms.push.HandlerC2220f.a
        /* renamed from: a */
        public void mo12403a(Message message) {
            if (message == null) {
                HMSLog.m12620e("HmsMessageService", "receive message is null");
                return;
            }
            HMSLog.m12622i("HmsMessageService", "handle message start...");
            Bundle data = Message.obtain(message).getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                intent.putExtra(RemoteMessageConst.INPUT_TYPE, data.getInt(RemoteMessageConst.INPUT_TYPE, -1));
                HmsMessageService.this.handleIntentMessage(intent);
            }
        }

        public /* synthetic */ C2213b(HmsMessageService hmsMessageService, RunnableC2212a runnableC2212a) {
            this();
        }
    }

    /* renamed from: a */
    private void m12398a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AsyncExec.submitSeqIO(new RunnableC2212a(str2, str));
    }

    /* renamed from: b */
    private void m12400b(Intent intent) throws JSONException {
        HMSLog.m12622i("HmsMessageService", "parse batch response.");
        String stringExtra = intent.getStringExtra("batchMsgbody");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(stringExtra);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("transactionId");
                String strOptString2 = jSONObject.optString("msgId");
                int iOptInt = jSONObject.optInt("ret", ErrorEnum.ERROR_UNKNOWN.getInternalCode());
                if (ErrorEnum.SUCCESS.getInternalCode() == iOptInt) {
                    m12401b(strOptString, strOptString2);
                } else {
                    m12402b(strOptString, strOptString2, iOptInt);
                }
            }
        } catch (JSONException unused) {
            HMSLog.m12623w("HmsMessageService", "parse batch response failed.");
        }
    }

    public void doMsgReceived(Intent intent) {
        onMessageReceived(new RemoteMessage(m12394a(intent)));
    }

    public void handleIntentMessage(Intent intent) {
        if (intent == null) {
            HMSLog.m12620e("HmsMessageService", "receive message is null");
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("message_id");
            String stringExtra2 = intent.getStringExtra(RemoteMessageConst.MSGTYPE);
            String stringExtra3 = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
            if ("new_token".equals(stringExtra2)) {
                HMSLog.m12622i("HmsMessageService", "onNewToken");
                m12397a(intent, stringExtra3);
            } else if ("received_message".equals(stringExtra2)) {
                HMSLog.m12622i("HmsMessageService", "onMessageReceived, message id:" + stringExtra);
                m12399a(PushNaming.RECEIVE_MSG_RSP, stringExtra, ErrorEnum.SUCCESS.getInternalCode());
                doMsgReceived(intent);
            } else if ("sent_message".equals(stringExtra2)) {
                m12401b(stringExtra3, stringExtra);
            } else if ("send_error".equals(stringExtra2)) {
                m12402b(stringExtra3, stringExtra, intent.getIntExtra("error", ErrorEnum.ERROR_UNKNOWN.getInternalCode()));
            } else if ("delivery".equals(stringExtra2)) {
                int intExtra = intent.getIntExtra("error", ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode());
                HMSLog.m12622i("HmsMessageService", "onMessageDelivery, message id:" + stringExtra + ", status:" + intExtra + ", transactionId: " + stringExtra3);
                m12399a(PushNaming.UPSEND_RECEIPT, stringExtra3, intExtra);
                onMessageDelivered(stringExtra, new SendException(intExtra));
            } else if ("server_deleted_message".equals(stringExtra2)) {
                HMSLog.m12622i("HmsMessageService", "delete message, message id:" + stringExtra);
                onDeletedMessages();
            } else if ("batchSent".equals(stringExtra2)) {
                m12400b(intent);
            } else {
                HMSLog.m12620e("HmsMessageService", "Receive unknown message: " + stringExtra2);
            }
        } catch (RuntimeException e) {
            HMSLog.m12620e("HmsMessageService", "handle intent RuntimeException: " + e.getMessage());
        } catch (Exception e2) {
            AbstractC0852NX.m5766o(e2, new StringBuilder("handle intent exception: "), "HmsMessageService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.m12622i("HmsMessageService", "start to bind");
        return this.f19357a.getBinder();
    }

    public void onDeletedMessages() {
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLog.m12622i("HmsMessageService", "start to destroy");
        super.onDestroy();
    }

    public void onMessageDelivered(String str, Exception exc) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.m12622i("HmsMessageService", "start to command , startId = " + i2);
        handleIntentMessage(intent);
        return 2;
    }

    public void onTokenError(Exception exc) {
    }

    public void onNewToken(String str, Bundle bundle) {
    }

    public void onTokenError(Exception exc, Bundle bundle) {
    }

    /* renamed from: a */
    private Bundle m12394a(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("message_id", intent.getStringExtra("message_id"));
        bundle.putByteArray(RemoteMessageConst.MSGBODY, intent.getByteArrayExtra(RemoteMessageConst.MSGBODY));
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN));
        if (intent.getIntExtra(RemoteMessageConst.INPUT_TYPE, -1) == 1) {
            bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private void m12397a(Intent intent, String str) {
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        int intExtra = intent.getIntExtra("error", errorEnum.getInternalCode());
        m12399a(PushNaming.GETTOKEN_ASYNC_RSP, str, intExtra);
        String stringExtra = intent.getStringExtra("subjectId");
        String stringExtra2 = intent.getStringExtra("message_proxy_type");
        HMSLog.m12622i("HmsMessageService", "doOnNewToken:transactionId = " + str + " , internalCode = " + intExtra + ",subjectId:" + stringExtra + ",proxyType:" + stringExtra2);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(stringExtra)) {
            bundle.putString(SUBJECT_ID, stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle.putString(PROXY_TYPE, stringExtra2);
        }
        if (intExtra == errorEnum.getInternalCode()) {
            HMSLog.m12622i("HmsMessageService", "Apply token OnNewToken, subId: " + stringExtra);
            m12395a(intent, bundle, stringExtra);
            return;
        }
        HMSLog.m12622i("HmsMessageService", "Apply token failed, subId: " + stringExtra);
        m12396a(intent, bundle, stringExtra, intExtra);
    }

    /* renamed from: b */
    private void m12401b(String str, String str2) {
        HMSLog.m12622i("HmsMessageService", "onMessageSent, message id:" + str2 + ", transactionId: " + str);
        m12399a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, ErrorEnum.SUCCESS.getInternalCode());
        onMessageSent(str2);
    }

    /* renamed from: b */
    private void m12402b(String str, String str2, int i) {
        HMSLog.m12622i("HmsMessageService", "onSendError, message id:" + str2 + " error:" + i + ", transactionId: " + str);
        m12399a(PushNaming.UPSEND_MSG_ASYNC_RSP, str, i);
        onSendError(str2, new SendException(i));
    }

    /* renamed from: a */
    private synchronized void m12396a(Intent intent, Bundle bundle, String str, int i) {
        try {
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.m12622i("HmsMessageService", "onTokenError to host app.");
                onTokenError(new BaseException(i));
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i2 = 0; i2 < subjectIds.length; i2++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i2]);
                        HMSLog.m12622i("HmsMessageService", "onTokenError to sub app, subjectId:" + subjectIds[i2]);
                        onTokenError(new BaseException(i), bundle2);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.m12622i("HmsMessageService", "onTokenError to host app with bundle.");
                onTokenError(new BaseException(i), bundle);
                return;
            }
            HMSLog.m12622i("HmsMessageService", "onTokenError to sub app, subjectId:" + str);
            onTokenError(new BaseException(i), bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private synchronized void m12395a(Intent intent, Bundle bundle, String str) {
        try {
            String stringExtra = intent.getStringExtra(RemoteMessageConst.DEVICE_TOKEN);
            m12398a(stringExtra, str);
            Context applicationContext = getApplicationContext();
            boolean zIsEmpty = TextUtils.isEmpty(BaseUtils.getCacheData(applicationContext, applicationContext.getPackageName(), false));
            if (bundle.isEmpty() && !zIsEmpty) {
                HMSLog.m12622i("HmsMessageService", "onNewToken to host app.");
                onNewToken(stringExtra);
                BaseUtils.deleteCacheData(applicationContext, applicationContext.getPackageName());
            }
            if (TextUtils.isEmpty(str)) {
                String[] subjectIds = BaseUtils.getSubjectIds(applicationContext);
                if (subjectIds != null && subjectIds.length != 0) {
                    for (int i = 0; i < subjectIds.length; i++) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(SUBJECT_ID, subjectIds[i]);
                        HMSLog.m12622i("HmsMessageService", "onNewToken to sub app, subjectId:" + subjectIds[i]);
                        onNewToken(stringExtra, bundle2);
                        m12398a(stringExtra, subjectIds[i]);
                    }
                    BaseUtils.clearSubjectIds(applicationContext);
                }
                HMSLog.m12622i("HmsMessageService", "onNewToken to host app with bundle.");
                bundle.putString("belongId", intent.getStringExtra("belongId"));
                onNewToken(stringExtra, bundle);
                return;
            }
            HMSLog.m12622i("HmsMessageService", "onNewToken to sub app, subjectId:" + str);
            onNewToken(stringExtra, bundle);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    private void m12399a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        PushBiUtil.reportExit(getApplicationContext(), str, str2, i);
    }
}
