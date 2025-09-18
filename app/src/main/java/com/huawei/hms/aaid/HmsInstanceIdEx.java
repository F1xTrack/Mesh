package com.huawei.hms.aaid;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.opendevice.C2198b;
import com.huawei.hms.opendevice.C2203g;
import com.huawei.hms.opendevice.C2204h;
import com.huawei.hms.support.log.HMSLog;
import java.util.UUID;
import p000.AbstractC7222ym;
import p000.C8499Wu1;

@Deprecated
/* loaded from: classes.dex */
public class HmsInstanceIdEx {
    public static final String TAG = "HmsInstanceIdEx";

    /* renamed from: a */
    private Context f18682a;

    /* renamed from: b */
    private PushPreferences f18683b;

    /* renamed from: c */
    private HuaweiApi<Api.ApiOptions.NoOptions> f18684c;

    private HmsInstanceIdEx(Context context) {
        this.f18683b = null;
        this.f18682a = context;
        this.f18683b = new PushPreferences(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f18684c = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f18684c = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f18684c.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m11376a(Exception exc) {
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = exc;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
        return c8499Wu1;
    }

    public static HmsInstanceIdEx getInstance(Context context) {
        Preconditions.checkNotNull(context);
        return new HmsInstanceIdEx(context);
    }

    public void deleteAAID(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f18683b.containsKey(str)) {
                this.f18683b.removeKey(str);
                this.f18683b.removeKey(m11377a(str));
            }
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public String getAAId(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (this.f18683b.containsKey(str)) {
                return this.f18683b.getString(str);
            }
            String string = UUID.randomUUID().toString();
            this.f18683b.saveString(str, string);
            this.f18683b.saveLong(m11377a(str), Long.valueOf(System.currentTimeMillis()));
            return string;
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public long getCreationTime(String str) throws ApiException {
        if (str == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        try {
            if (!this.f18683b.containsKey(m11377a(str))) {
                getAAId(str);
            }
            return this.f18683b.getLong(m11377a(str));
        } catch (RuntimeException unused) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        } catch (Exception unused2) {
            throw ErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
    }

    public Task getToken() {
        if (ProxyCenter.getProxy() == null) {
            String strM12351a = C2204h.m12351a(this.f18682a, "push.gettoken");
            try {
                TokenReq tokenReqM12332b = C2198b.m12332b(this.f18682a, null, null);
                tokenReqM12332b.setAaid(HmsInstanceId.getInstance(this.f18682a).getId());
                return this.f18684c.doWrite(new C2203g("push.gettoken", tokenReqM12332b, this.f18682a, strM12351a));
            } catch (RuntimeException unused) {
                Context context = this.f18682a;
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                C2204h.m12354a(context, "push.gettoken", strM12351a, errorEnum);
                return m11376a(errorEnum.toApiException());
            } catch (Exception unused2) {
                Context context2 = this.f18682a;
                ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
                C2204h.m12354a(context2, "push.gettoken", strM12351a, errorEnum2);
                return m11376a(errorEnum2.toApiException());
            }
        }
        try {
            HMSLog.m12622i(TAG, "use proxy get token, please check HmsMessageService.onNewToken receive result.");
            ProxyCenter.getProxy().getToken(this.f18682a, null, null);
            C8499Wu1 c8499Wu1 = new C8499Wu1();
            TokenResult tokenResult = new TokenResult();
            synchronized (c8499Wu1.f13448a) {
                try {
                    if (!c8499Wu1.f13449b) {
                        c8499Wu1.f13449b = true;
                        c8499Wu1.f13450c = tokenResult;
                        c8499Wu1.f13448a.notifyAll();
                        c8499Wu1.m8879i();
                    }
                } finally {
                }
            }
            return c8499Wu1;
        } catch (ApiException e) {
            return m11376a(e);
        } catch (Exception unused3) {
            return m11376a(ErrorEnum.ERROR_INTERNAL_ERROR.toApiException());
        }
    }

    /* renamed from: a */
    private String m11377a(String str) {
        return AbstractC7222ym.m26245v("creationTime", str);
    }
}
