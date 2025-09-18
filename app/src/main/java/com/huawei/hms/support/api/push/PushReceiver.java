package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.push.AbstractC2215a;
import com.huawei.hms.push.AbstractC2218d;
import com.huawei.hms.push.C2231q;
import com.huawei.hms.push.C2232r;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PushReceiver extends BroadcastReceiver {

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$b */
    public static class RunnableC2259b implements Runnable {

        /* renamed from: a */
        private Context f19529a;

        /* renamed from: b */
        private Intent f19530b;

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
            intent.setPackage(this.f19530b.getPackage());
            try {
                JSONObject jSONObjectM12591b = PushReceiver.m12591b(this.f19530b);
                String string = JsonUtil.getString(jSONObjectM12591b, "moduleName", "");
                int i = JsonUtil.getInt(jSONObjectM12591b, "msgType", 0);
                int internalCode = JsonUtil.getInt(jSONObjectM12591b, "status", 0);
                if (ErrorEnum.SUCCESS.getInternalCode() != internalCode) {
                    internalCode = ErrorEnum.ERROR_APP_SERVER_NOT_ONLINE.getInternalCode();
                }
                Bundle bundle = new Bundle();
                if ("Push".equals(string) && i == 1) {
                    bundle.putString(RemoteMessageConst.MSGTYPE, "delivery");
                    bundle.putString("message_id", JsonUtil.getString(jSONObjectM12591b, "msgId", ""));
                    bundle.putInt("error", internalCode);
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, JsonUtil.getString(jSONObjectM12591b, "transactionId", ""));
                } else {
                    if (this.f19530b.getExtras() != null) {
                        bundle.putAll(this.f19530b.getExtras());
                    }
                    bundle.putString(RemoteMessageConst.MSGTYPE, "received_message");
                    bundle.putString("message_id", this.f19530b.getStringExtra("msgIdStr"));
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, this.f19530b.getByteArrayExtra("msg_data"));
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, AbstractC2215a.m12424a(this.f19530b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN)));
                    bundle.putInt(RemoteMessageConst.INPUT_TYPE, 1);
                    bundle.putString("message_proxy_type", this.f19530b.getStringExtra("message_proxy_type"));
                }
                if (new C2232r().m12519a(this.f19529a, bundle, intent)) {
                    HMSLog.m12622i("PushReceiver", "receive " + this.f19530b.getAction() + " and start service success");
                    return;
                }
                HMSLog.m12620e("PushReceiver", "receive " + this.f19530b.getAction() + " and start service failed");
            } catch (RuntimeException unused) {
                HMSLog.m12620e("PushReceiver", "handle push message occur exception.");
            }
        }

        private RunnableC2259b(Context context, Intent intent) {
            this.f19529a = context;
            this.f19530b = intent;
        }
    }

    /* renamed from: com.huawei.hms.support.api.push.PushReceiver$c */
    public static class RunnableC2260c implements Runnable {

        /* renamed from: a */
        private Context f19531a;

        /* renamed from: b */
        private Intent f19532b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                byte[] byteArrayExtra = this.f19532b.getByteArrayExtra(RemoteMessageConst.DEVICE_TOKEN);
                if (byteArrayExtra != null && byteArrayExtra.length != 0) {
                    HMSLog.m12622i("PushReceiver", "receive a push token: " + this.f19531a.getPackageName());
                    Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
                    intent.setPackage(this.f19532b.getPackage());
                    Bundle bundle = new Bundle();
                    bundle.putString(RemoteMessageConst.MSGTYPE, "new_token");
                    bundle.putString(RemoteMessageConst.DEVICE_TOKEN, AbstractC2215a.m12424a(byteArrayExtra));
                    bundle.putString(CommonCode.MapKey.TRANSACTION_ID, this.f19532b.getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
                    bundle.putString("subjectId", this.f19532b.getStringExtra("subjectId"));
                    bundle.putInt("error", this.f19532b.getIntExtra("error", ErrorEnum.SUCCESS.getInternalCode()));
                    bundle.putString("belongId", this.f19532b.getStringExtra("belongId"));
                    if (new C2232r().m12519a(this.f19531a, bundle, intent)) {
                        return;
                    }
                    HMSLog.m12620e("PushReceiver", "receive " + this.f19532b.getAction() + " and start service failed");
                    return;
                }
                HMSLog.m12622i("PushReceiver", "get a deviceToken, but it is null or empty");
            } catch (RejectedExecutionException unused) {
                HMSLog.m12620e("PushReceiver", "execute task error");
            } catch (Exception unused2) {
                HMSLog.m12620e("PushReceiver", "handle push token error");
            }
        }

        private RunnableC2260c(Context context, Intent intent) {
            this.f19531a = context;
            this.f19532b = intent;
        }
    }

    /* renamed from: b */
    private void m12593b(Context context, Intent intent) {
        try {
            if (intent.hasExtra(RemoteMessageConst.DEVICE_TOKEN)) {
                C2231q.m12515a().execute(new RunnableC2260c(context, intent));
            } else {
                HMSLog.m12622i("PushReceiver", "This message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.m12620e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.m12620e("PushReceiver", "handlePushTokenEvent execute task error");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.m12622i("PushReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.android.push.intent.REGISTRATION".equals(action)) {
                m12593b(context, intent);
            } else if ("com.huawei.android.push.intent.RECEIVE".equals(action)) {
                m12590a(context, intent);
            } else {
                HMSLog.m12622i("PushReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.m12620e("PushReceiver", "intent has some error");
        }
    }

    /* renamed from: a */
    private void m12590a(Context context, Intent intent) {
        try {
            if (intent.hasExtra("msg_data")) {
                C2231q.m12515a().execute(new RunnableC2259b(context, intent));
            } else {
                HMSLog.m12622i("PushReceiver", "This push message dose not sent by hwpush.");
            }
        } catch (RuntimeException unused) {
            HMSLog.m12620e("PushReceiver", "handlePushMessageEvent execute task runtime exception.");
        } catch (Exception unused2) {
            HMSLog.m12620e("PushReceiver", "handlePushMessageEvent execute task error");
        }
    }

    /* renamed from: b */
    private static JSONObject m12592b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m12589a(byte[] bArr) {
        try {
            return new JSONObject(AbstractC2215a.m12424a(bArr));
        } catch (JSONException unused) {
            HMSLog.m12623w("PushReceiver", "JSONException:parse message body failed.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static JSONObject m12591b(Intent intent) throws RuntimeException {
        JSONObject jSONObjectM12589a = m12589a(intent.getByteArrayExtra("msg_data"));
        JSONObject jSONObjectM12588a = m12588a(jSONObjectM12589a);
        String string = JsonUtil.getString(jSONObjectM12588a, "data", null);
        if (AbstractC2218d.m12431a(jSONObjectM12588a, m12592b(jSONObjectM12588a), string)) {
            return jSONObjectM12589a;
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static JSONObject m12588a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
