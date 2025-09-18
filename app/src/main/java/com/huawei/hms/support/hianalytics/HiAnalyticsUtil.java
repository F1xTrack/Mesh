package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC7222ym;

/* loaded from: classes2.dex */
public class HiAnalyticsUtil {

    /* renamed from: a */
    private static final Object f19535a = new Object();

    /* renamed from: b */
    private static HiAnalyticsUtil f19536b;

    /* renamed from: c */
    private static HiAnalyticsUtils f19537c;

    /* renamed from: a */
    private String m12599a(Context context, String str) {
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("01||", context.getPackageName(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sbM26240q.append(Util.getAppId(context));
        sbM26240q.append("|61200300|");
        sbM26240q.append(str);
        return sbM26240q.toString();
    }

    public static HiAnalyticsUtil getInstance() {
        HiAnalyticsUtil hiAnalyticsUtil;
        synchronized (f19535a) {
            try {
                if (f19536b == null) {
                    f19536b = new HiAnalyticsUtil();
                    f19537c = HiAnalyticsUtils.getInstance();
                }
                hiAnalyticsUtil = f19536b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hiAnalyticsUtil;
    }

    public static Map<String, String> getMapFromForegroundResponseHeader(ResponseHeader responseHeader) {
        HashMap map = new HashMap();
        if (responseHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        map.put("service", responseHeader.getSrvName());
        map.put("apiName", responseHeader.getApiName());
        map.put("package", responseHeader.getPkgName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        map.put("result", String.valueOf(responseHeader.getErrorCode()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.12.0.300");
        return map;
    }

    public static Map<String, String> getMapFromRequestHeader(ResponseHeader responseHeader) {
        HashMap map = new HashMap();
        if (responseHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, responseHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, responseHeader.getActualAppID());
        map.put("service", responseHeader.getSrvName());
        String apiName = responseHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] strArrSplit = apiName.split("\\.");
            if (strArrSplit.length >= 2) {
                map.put("apiName", strArrSplit[1]);
            }
        }
        map.put("package", responseHeader.getPkgName());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(responseHeader.getStatusCode()));
        map.put("result", String.valueOf(responseHeader.getErrorCode()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, responseHeader.getErrorReason());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.12.0.300");
        return map;
    }

    public static String versionCodeToName(String str) {
        return HiAnalyticsUtils.versionCodeToName(str);
    }

    @Deprecated
    public Map<String, String> getMapForBi(Context context, String str) {
        HashMap map = new HashMap();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length >= 2) {
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            String appId = Util.getAppId(context);
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, TransactionIdCreater.getId(appId, str));
            map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            map.put("service", str2);
            map.put("apiName", str3);
            if (context != null) {
                map.put("package", context.getPackageName());
            }
            map.put("version", "6.12.0.300");
            map.put("callTime", String.valueOf(System.currentTimeMillis()));
        }
        return map;
    }

    public Map<String, String> getMapFromForegroundRequestHeader(RequestHeader requestHeader) {
        HashMap map = new HashMap();
        if (requestHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        map.put("service", requestHeader.getSrvName());
        map.put("apiName", requestHeader.getApiName());
        map.put("package", requestHeader.getPkgName());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.12.0.300");
        return map;
    }

    @Deprecated
    public boolean hasError() {
        if (SystemUtils.isChinaROM()) {
            return false;
        }
        HMSLog.m12622i("HiAnalyticsUtil", "not ChinaROM ");
        return true;
    }

    public void onBuoyEvent(Context context, String str, String str2) {
        f19537c.onBuoyEvent(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        f19537c.onEvent(context, str, map);
    }

    public void onEvent2(Context context, String str, String str2) {
        f19537c.onEvent2(context, str, str2);
    }

    public void onNewEvent(Context context, String str, Map map) {
        f19537c.onNewEvent(context, str, map);
    }

    public void onEvent(Context context, String str, String str2) {
        if (context != null) {
            onEvent2(context, str, m12599a(context, str2));
        }
    }

    public boolean hasError(Context context) {
        return f19537c.hasError(context);
    }

    public Map<String, String> getMapFromRequestHeader(RequestHeader requestHeader) {
        HashMap map = new HashMap();
        if (requestHeader == null) {
            return map;
        }
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, requestHeader.getTransactionId());
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, requestHeader.getActualAppID());
        map.put("service", requestHeader.getSrvName());
        String apiName = requestHeader.getApiName();
        if (!TextUtils.isEmpty(apiName)) {
            String[] strArrSplit = apiName.split("\\.");
            if (strArrSplit.length >= 2) {
                map.put("apiName", strArrSplit[1]);
            }
        }
        map.put("package", requestHeader.getPkgName());
        map.put("callTime", String.valueOf(System.currentTimeMillis()));
        map.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.12.0.300");
        return map;
    }
}
