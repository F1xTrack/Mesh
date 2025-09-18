package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* renamed from: com.huawei.hms.opendevice.h */
/* loaded from: classes.dex */
public final class C2204h {
    /* renamed from: a */
    public static String m12351a(Context context, String str) {
        return HiAnalyticsClient.reportEntry(context, str, 61200300);
    }

    /* renamed from: a */
    public static void m12352a(Context context, String str, ResponseErrorCode responseErrorCode) {
        HiAnalyticsClient.reportExit(context, str, responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 61200300);
    }

    /* renamed from: a */
    public static void m12354a(Context context, String str, String str2, ErrorEnum errorEnum) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), errorEnum.getExternalCode(), 61200300);
    }

    /* renamed from: a */
    public static void m12353a(Context context, String str, String str2, int i) {
        HiAnalyticsClient.reportExit(context, str, str2, Status.SUCCESS.getStatusCode(), i, 61200300);
    }
}
