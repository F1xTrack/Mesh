package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import p000.C8079Os1;
import p000.C8499Wu1;
import p000.CB1;
import p000.T81;

/* loaded from: classes.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;

    /* renamed from: c */
    private static final String f19365c = "HmsProfile";

    /* renamed from: a */
    private Context f19366a;

    /* renamed from: b */
    private HuaweiApi<Api.ApiOptions.NoOptions> f19367b;

    private HmsProfile(Context context) {
        this.f19366a = null;
        Preconditions.checkNotNull(context);
        this.f19366a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f19367b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f19367b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f19367b.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m12408a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            C8499Wu1 c8499Wu1 = new C8499Wu1();
            ApiException apiException = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            synchronized (c8499Wu1.f13448a) {
                try {
                    if (!c8499Wu1.f13449b) {
                        c8499Wu1.f13449b = true;
                        c8499Wu1.f13451d = apiException;
                        c8499Wu1.f13448a.notifyAll();
                        c8499Wu1.m8879i();
                    }
                } finally {
                }
            }
            return c8499Wu1;
        }
        if (!TextUtils.isEmpty(str)) {
            String strM12409a = m12409a(this.f19366a);
            if (TextUtils.isEmpty(strM12409a)) {
                HMSLog.m12622i(f19365c, "agc connect services config missing project id.");
                T81 t81 = new T81();
                t81.m7576a(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return t81.f11181a;
            }
            if (str.equals(strM12409a)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String strReportEntry = PushBiUtil.reportEntry(this.f19366a, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(CB1.m1003c(str2));
            profileReq.setPkgName(this.f19366a.getPackageName());
            return this.f19367b.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), strReportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                T81 t812 = new T81();
                ApiException apiException2 = (ApiException) e.getCause();
                t812.m7576a(apiException2);
                PushBiUtil.reportExit(this.f19366a, PushNaming.PUSH_PROFILE, strReportEntry, apiException2.getStatusCode());
                return t812.f11181a;
            }
            T81 t813 = new T81();
            Context context = this.f19366a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, strReportEntry, errorEnum);
            t813.m7576a(errorEnum.toApiException());
            return t813.f11181a;
        }
    }

    /* renamed from: b */
    private boolean m12410b(Context context) {
        return AbstractC2218d.m12432b(context) >= 110001400;
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public Task addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public Task deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (!AbstractC2218d.m12436d(this.f19366a)) {
            return true;
        }
        if (AbstractC2218d.m12435c()) {
            HMSLog.m12622i(f19365c, "current EMUI version below 9.1, not support profile operation.");
            return false;
        }
        if (m12410b(this.f19366a)) {
            return true;
        }
        HMSLog.m12622i(f19365c, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
        return false;
    }

    public Task addProfile(String str, int i, String str2) {
        if (i == 1 || i == 2) {
            if (!TextUtils.isEmpty(str2)) {
                return m12408a(0, str, i, str2);
            }
            HMSLog.m12622i(f19365c, "add profile params is empty.");
            T81 t81 = new T81();
            t81.m7576a(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return t81.f11181a;
        }
        HMSLog.m12622i(f19365c, "add profile type undefined.");
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = apiException;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
        return c8499Wu1;
    }

    public Task deleteProfile(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return m12408a(1, str, -1, str2);
        }
        HMSLog.m12620e(f19365c, "del profile params is empty.");
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        ApiException apiException = ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException();
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = apiException;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
        return c8499Wu1;
    }

    /* renamed from: a */
    private static String m12409a(Context context) {
        return C8079Os1.m6176c(context).getString("client/project_id");
    }
}
