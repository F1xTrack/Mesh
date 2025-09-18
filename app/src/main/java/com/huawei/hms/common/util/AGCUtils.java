package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.p015rn.push.constants.Core;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC6461n;
import p000.C8129Pr1;
import p000.C8545Xr1;

/* loaded from: classes.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m11637a(android.content.Context r8, java.lang.String r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "AGCUtils"
            java.lang.String r1 = "Get "
            java.lang.String r2 = ""
            r3 = 0
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            r4.<init>()     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            r5.<init>()     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            android.content.res.Resources r6 = r8.getResources()     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            java.lang.String r7 = "agconnect-services.json"
            java.io.InputStream r3 = r6.open(r7)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            Pr1 r6 = new Pr1     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            r6.<init>(r8, r3, r4, r5)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            java.lang.String r8 = r6.getString(r9)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L2b java.io.IOException -> L2d
            goto L60
        L29:
            r8 = move-exception
            goto L81
        L2b:
            r8 = move-exception
            goto L2f
        L2d:
            r8 = move-exception
            goto L48
        L2f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r9)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = " with AGConnectServicesConfig failed: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L29
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r8)     // Catch: java.lang.Throwable -> L29
        L46:
            r8 = r2
            goto L60
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r9)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = " failed: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L29
            r4.append(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L29
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r8)     // Catch: java.lang.Throwable -> L29
            goto L46
        L60:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L6a
            return r8
        L6a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r9 = " is null."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r8)
            return r2
        L81:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.m11637a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static String m11638b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m12620e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.m12622i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (AndroidException unused) {
            HMSLog.m12620e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.m12621e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e);
            return "";
        }
    }

    /* renamed from: c */
    private static boolean m11639c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) throws IOException {
        String string;
        if (context == null) {
            HMSLog.m12623w("AGCUtils", "getAppId context is null");
            return "";
        }
        if (m11639c(context)) {
            string = m11637a(context, Core.CLIENT_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            string = null;
        }
        try {
            String str = C8545Xr1.f13998d;
            if (str == null) {
                str = "DEFAULT_INSTANCE";
            }
            AbstractC6461n abstractC6461nM9173b = C8545Xr1.m9173b(str);
            if (((C8545Xr1) abstractC6461nM9173b).f13999a.getContext() != context) {
                abstractC6461nM9173b = C8545Xr1.m9172a(new C8129Pr1(context, null, new HashMap(), new ArrayList()), false);
            }
            string = ((C8545Xr1) abstractC6461nM9173b).f13999a.getString(Core.CLIENT_APP_ID);
        } catch (NullPointerException unused) {
            HMSLog.m12620e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM11636a = m11636a(context);
        return !TextUtils.isEmpty(strM11636a) ? strM11636a : m11637a(context, Core.CLIENT_APP_ID);
    }

    public static String getCpId(Context context) {
        if (context == null) {
            HMSLog.m12623w("AGCUtils", "getCpId context is null");
            return "";
        }
        if (m11639c(context)) {
            return m11637a(context, "client/cp_id");
        }
        String string = null;
        try {
            String str = C8545Xr1.f13998d;
            if (str == null) {
                str = "DEFAULT_INSTANCE";
            }
            AbstractC6461n abstractC6461nM9173b = C8545Xr1.m9173b(str);
            if (((C8545Xr1) abstractC6461nM9173b).f13999a.getContext() != context) {
                abstractC6461nM9173b = C8545Xr1.m9172a(new C8129Pr1(context, null, new HashMap(), new ArrayList()), false);
            }
            string = ((C8545Xr1) abstractC6461nM9173b).f13999a.getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.m12620e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strM11638b = m11638b(context);
        return !TextUtils.isEmpty(strM11638b) ? strM11638b : m11637a(context, "client/cp_id");
    }

    /* renamed from: a */
    private static String m11636a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m12620e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.appid")) != null) {
                String strValueOf = String.valueOf(obj);
                return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
            }
            HMSLog.m12620e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (AndroidException unused) {
            HMSLog.m12620e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e) {
            HMSLog.m12621e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e);
            return "";
        }
    }
}
