package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.p016ui.SafeBundle;
import com.huawei.hms.push.task.AttributionReportTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.AttributionReportReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import p000.T81;

/* loaded from: classes.dex */
public class AttributionReporter {
    public static final String APP_VERSION = "appVersion";
    public static final String SYSTEM_PERMISSION = "permission";

    /* renamed from: a */
    private HuaweiApi<Api.ApiOptions.NoOptions> f19351a;

    /* renamed from: b */
    private Context f19352b;

    private AttributionReporter(Context context) {
        Preconditions.checkNotNull(context);
        this.f19352b = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f19351a = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f19351a = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f19351a.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m12391a(AttributionEvent attributionEvent, Bundle bundle) throws ApiException {
        T81 t81;
        int externalCode;
        String strReportEntry = PushBiUtil.reportEntry(this.f19352b, PushNaming.PUSH_ANALYSIS_REPORT);
        if (bundle == null || attributionEvent == null) {
            PushBiUtil.reportExit(this.f19352b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.m12620e("AttributionReporter", "Invalid argument: argument should not be null");
            throw new IllegalArgumentException("Invalid argument: argument should not be null");
        }
        try {
            if (!AbstractC2218d.m12436d(this.f19352b)) {
                throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
            }
            long j = new PushPreferences(this.f19352b, "hwpush_local_config").getLong("analysis_last_failed_time");
            if (j > 0 && System.currentTimeMillis() - j < 86400000) {
                throw ErrorEnum.ERROR_NOT_IN_SERVICE.toApiException();
            }
            return this.f19351a.doWrite(new AttributionReportTask(PushNaming.PUSH_ANALYSIS_REPORT, JsonUtil.createJsonString(m12392a(attributionEvent, new SafeBundle(bundle))), strReportEntry));
        } catch (ApiException e) {
            T81 t812 = new T81();
            t812.m7576a(e);
            externalCode = e.getStatusCode();
            t81 = t812;
            PushBiUtil.reportExit(this.f19352b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, externalCode);
            return t81.f11181a;
        } catch (Exception unused) {
            t81 = new T81();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            t81.m7576a(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.f19352b, PushNaming.PUSH_ANALYSIS_REPORT, strReportEntry, externalCode);
            return t81.f11181a;
        }
    }

    public static AttributionReporter getInstance(Context context) {
        return new AttributionReporter(context);
    }

    public Task report(AttributionEvent attributionEvent, Bundle bundle) {
        return m12391a(attributionEvent, bundle);
    }

    /* renamed from: a */
    private AttributionReportReq m12392a(AttributionEvent attributionEvent, SafeBundle safeBundle) throws ApiException {
        Bundle bundle = safeBundle.getBundle().getBundle("analysisExt");
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("msgId");
            if (!TextUtils.isEmpty(string)) {
                String string2 = bundle.getString("hsId");
                if (!TextUtils.isEmpty(string2)) {
                    AttributionReportReq attributionReportReq = new AttributionReportReq();
                    attributionReportReq.setCampaignId(bundle.getString("cid"));
                    attributionReportReq.setMsgId(string);
                    attributionReportReq.setHaStorageId(string2);
                    attributionReportReq.setEventId(attributionEvent.getEventId());
                    attributionReportReq.setPkgName(this.f19352b.getPackageName());
                    if (attributionEvent.equals(AttributionEvent.PERMISSION_GRANTED) || attributionEvent.equals(AttributionEvent.PERMISSION_DENIED)) {
                        String string3 = safeBundle.getString(SYSTEM_PERMISSION);
                        if (!TextUtils.isEmpty(string3) && string3.startsWith("android.permission")) {
                            attributionReportReq.setReqPermission(string3);
                        } else {
                            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
                        }
                    }
                    attributionReportReq.setTimeStamp(System.currentTimeMillis());
                    attributionReportReq.setAppVersion(safeBundle.getString(APP_VERSION));
                    return attributionReportReq;
                }
                throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
            }
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }
}
