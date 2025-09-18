package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.AbstractC2201e;
import com.huawei.hms.opendevice.AbstractC2208l;
import com.huawei.hms.opendevice.C2198b;
import com.huawei.hms.opendevice.C2202f;
import com.huawei.hms.opendevice.C2203g;
import com.huawei.hms.opendevice.C2204h;
import com.huawei.hms.opendevice.C2205i;
import com.huawei.hms.opendevice.CallableC2197a;
import com.huawei.hms.support.log.HMSLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import p000.C8499Wu1;
import p000.CJ1;

/* loaded from: classes.dex */
public class HmsInstanceId {
    public static final String TAG = "HmsInstanceId";

    /* renamed from: a */
    private Context f18679a;

    /* renamed from: b */
    private PushPreferences f18680b;

    /* renamed from: c */
    private HuaweiApi<Api.ApiOptions.NoOptions> f18681c;

    private HmsInstanceId(Context context) {
        this.f18679a = context.getApplicationContext();
        this.f18680b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f18681c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f18681c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f18681c.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private void m11374a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!AbstractC2201e.m12345e(this.f18679a)) {
            C2205i.m12355a(this.f18679a).removeKey("subjectId");
            return;
        }
        String string = C2205i.m12355a(this.f18679a).getString("subjectId");
        if (TextUtils.isEmpty(string)) {
            C2205i.m12355a(this.f18679a).saveString("subjectId", str);
            return;
        }
        if (string.contains(str)) {
            return;
        }
        C2205i.m12355a(this.f18679a).saveString("subjectId", string + StringUtils.COMMA + str);
    }

    /* renamed from: b */
    private void m11375b() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.toApiException();
        }
    }

    public static HmsInstanceId getInstance(Context context) {
        Preconditions.checkNotNull(context);
        AbstractC2208l.m12379c(context);
        return new HmsInstanceId(context);
    }

    public void deleteAAID() throws ApiException {
        m11375b();
        try {
            if (this.f18680b.containsKey("aaid")) {
                this.f18680b.removeKey("aaid");
                this.f18680b.removeKey("creationTime");
                if (C2198b.m12336d(this.f18679a)) {
                    if (ProxyCenter.getProxy() != null) {
                        HMSLog.m12622i(TAG, "use proxy delete all token after delete AaId.");
                        ProxyCenter.getProxy().deleteAllToken(this.f18679a);
                        return;
                    }
                    DeleteTokenReq deleteTokenReqM12327a = C2198b.m12327a(this.f18679a);
                    deleteTokenReqM12327a.setDeleteType(1);
                    deleteTokenReqM12327a.setMultiSender(false);
                    m11373a(deleteTokenReqM12327a, 1);
                    BaseUtils.deleteAllTokenCache(this.f18679a);
                }
            }
        } catch (ApiException e) {
            throw e;
        } catch (Exception unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public void deleteToken(String str, String str2) throws ApiException {
        m11375b();
        m11372a();
        DeleteTokenReq deleteTokenReqM12329a = C2198b.m12329a(this.f18679a, str, str2);
        deleteTokenReqM12329a.setMultiSender(false);
        m11373a(deleteTokenReqM12329a, 1);
    }

    public Task getAAID() {
        try {
            return CJ1.m1144d(new CallableC2197a(this.f18679a.getApplicationContext()));
        } catch (Exception unused) {
            C8499Wu1 c8499Wu1 = new C8499Wu1();
            ApiException apiException = ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
            synchronized (c8499Wu1.f13448a) {
                try {
                    if (!c8499Wu1.f13449b) {
                        c8499Wu1.f13449b = true;
                        c8499Wu1.f13451d = apiException;
                        c8499Wu1.f13448a.notifyAll();
                        c8499Wu1.m8879i();
                    }
                    return c8499Wu1;
                } finally {
                }
            }
        }
    }

    public long getCreationTime() {
        try {
            if (!this.f18680b.containsKey("creationTime")) {
                getAAID();
            }
            return this.f18680b.getLong("creationTime");
        } catch (Exception unused) {
            return 0L;
        }
    }

    public String getId() {
        return C2198b.m12334b(this.f18679a);
    }

    @Deprecated
    public String getToken() {
        try {
            return getToken(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getToken(String str, String str2) throws ApiException {
        m11375b();
        m11372a();
        TokenReq tokenReqM12332b = C2198b.m12332b(this.f18679a, null, str2);
        tokenReqM12332b.setAaid(getId());
        tokenReqM12332b.setMultiSender(false);
        C2205i.m12355a(this.f18679a).saveString(this.f18679a.getPackageName(), "1");
        return m11371a(tokenReqM12332b, 1);
    }

    public void deleteToken(String str) throws ApiException {
        m11375b();
        m11372a();
        if (!TextUtils.isEmpty(str)) {
            String strM12335c = C2198b.m12335c(this.f18679a);
            if (!TextUtils.isEmpty(strM12335c)) {
                if (str.equals(strM12335c)) {
                    deleteToken(null, null);
                    return;
                }
                DeleteTokenReq deleteTokenReqM12328a = C2198b.m12328a(this.f18679a, str);
                deleteTokenReqM12328a.setMultiSender(true);
                m11373a(deleteTokenReqM12328a, 2);
                return;
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    public String getToken(String str) throws ApiException {
        m11375b();
        m11372a();
        if (!TextUtils.isEmpty(str)) {
            String strM12335c = C2198b.m12335c(this.f18679a);
            if (!TextUtils.isEmpty(strM12335c)) {
                if (str.equals(strM12335c)) {
                    return getToken(null, null);
                }
                TokenReq tokenReqM12331b = C2198b.m12331b(this.f18679a, str);
                tokenReqM12331b.setAaid(getId());
                tokenReqM12331b.setMultiSender(true);
                return m11371a(tokenReqM12331b, 2);
            }
            throw ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }

    /* renamed from: a */
    private String m11371a(TokenReq tokenReq, int i) throws ApiException {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12622i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f18679a, tokenReq.getSubjectId(), null);
            return null;
        }
        m11374a(tokenReq.getSubjectId());
        String strM12351a = C2204h.m12351a(this.f18679a, "push.gettoken");
        try {
            HMSLog.m12617d(TAG, "getToken req :" + tokenReq.toString());
            C2203g c2203g = new C2203g("push.gettoken", tokenReq, this.f18679a, strM12351a);
            c2203g.setApiLevel(i);
            return ((TokenResult) CJ1.m1143c(this.f18681c.doWrite(c2203g))).getToken();
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                C2204h.m12353a(this.f18679a, "push.gettoken", strM12351a, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f18679a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            C2204h.m12354a(context, "push.gettoken", strM12351a, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    /* renamed from: a */
    private void m11373a(DeleteTokenReq deleteTokenReq, int i) throws ApiException {
        String subjectId = deleteTokenReq.getSubjectId();
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12622i(TAG, "use proxy delete token");
            ProxyCenter.getProxy().deleteToken(this.f18679a, subjectId, null);
            return;
        }
        String strM12351a = C2204h.m12351a(this.f18679a, "push.deletetoken");
        try {
            String strM12359b = C2205i.m12355a(this.f18679a).m12359b(subjectId);
            if (!deleteTokenReq.isMultiSender() || (!TextUtils.isEmpty(strM12359b) && !strM12359b.equals(C2205i.m12355a(this.f18679a).m12359b(null)))) {
                deleteTokenReq.setToken(strM12359b);
                C2202f c2202f = new C2202f("push.deletetoken", deleteTokenReq, strM12351a);
                c2202f.setApiLevel(i);
                CJ1.m1143c(this.f18681c.doWrite(c2202f));
                C2205i.m12355a(this.f18679a).m12361c(subjectId);
                return;
            }
            C2205i.m12355a(this.f18679a).removeKey(subjectId);
            HMSLog.m12622i(TAG, "The local subject token is null");
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e.getCause();
                C2204h.m12353a(this.f18679a, "push.deletetoken", strM12351a, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f18679a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            C2204h.m12354a(context, "push.deletetoken", strM12351a, errorEnum);
            throw errorEnum.toApiException();
        }
    }

    /* renamed from: a */
    private void m11372a() throws ApiException {
        if (BaseUtils.getProxyInit(this.f18679a) && ProxyCenter.getProxy() == null && !BaseUtils.isMainProc(this.f18679a)) {
            HMSLog.m12620e(TAG, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.toApiException();
        }
    }
}
