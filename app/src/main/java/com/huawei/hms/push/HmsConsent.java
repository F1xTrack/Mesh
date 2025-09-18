package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;
import p000.T81;

/* loaded from: classes.dex */
public class HmsConsent {

    /* renamed from: a */
    private HuaweiApi<Api.ApiOptions.NoOptions> f19355a;

    /* renamed from: b */
    private Context f19356b;

    private HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.f19356b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f19355a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f19355a = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f19355a.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m12393a(boolean z) throws ApiException {
        T81 t81;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.f19356b, PushNaming.PUSH_CONSENT);
        try {
            if (!AbstractC2218d.m12436d(this.f19356b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            EnableConsentReq enableConsentReq = new EnableConsentReq();
            enableConsentReq.setPackageName(this.f19356b.getPackageName());
            enableConsentReq.setEnable(z);
            return this.f19355a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), strReportEntry));
        } catch (ApiException e) {
            T81 t812 = new T81();
            t812.m7576a(e);
            externalCode = e.getStatusCode();
            t81 = t812;
            PushBiUtil.reportExit(this.f19356b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return t81.f11181a;
        } catch (Exception unused) {
            t81 = new T81();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            t81.m7576a(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.f19356b, PushNaming.PUSH_CONSENT, strReportEntry, externalCode);
            return t81.f11181a;
        }
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public Task consentOff() {
        return m12393a(false);
    }

    public Task consentOn() {
        return m12393a(true);
    }
}
