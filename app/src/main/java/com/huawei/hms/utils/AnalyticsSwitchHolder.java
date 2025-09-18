package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.stats.C2246a;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;

/* loaded from: classes2.dex */
public class AnalyticsSwitchHolder {
    public static final int ANALYTICS_DISABLED = 2;
    public static final int ANALYTICS_ENABLED = 1;

    /* renamed from: a */
    private static volatile int f19598a;

    /* renamed from: b */
    private static final Object f19599b = new Object();

    /* renamed from: c */
    private static volatile Long f19600c = 0L;

    /* renamed from: d */
    private static volatile boolean f19601d = false;

    /* renamed from: e */
    private static volatile boolean f19602e = false;

    /* renamed from: com.huawei.hms.utils.AnalyticsSwitchHolder$a */
    public class RunnableC2276a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19603a;

        public RunnableC2276a(Context context) {
            this.f19603a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AnalyticsSwitchHolder.m12639f(this.f19603a);
            HMSLog.m12622i("AnalyticsSwitchHolder", "getStateForHmsAnalyticsProvider");
        }
    }

    /* renamed from: com.huawei.hms.utils.AnalyticsSwitchHolder$b */
    public class RunnableC2277b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f19604a;

        public RunnableC2277b(Context context) {
            this.f19604a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m12622i("AnalyticsSwitchHolder", "enter setAnalyticsStateAndTimestamp");
            AnalyticsSwitchHolder.m12639f(this.f19604a);
            HMSLog.m12622i("AnalyticsSwitchHolder", "quit setAnalyticsStateAndTimestamp");
        }
    }

    /* renamed from: b */
    private static boolean m12635b(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m12620e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.m12620e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            } catch (RuntimeException e) {
                HMSLog.m12621e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.", e);
            }
        }
        HMSLog.m12622i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    /* renamed from: c */
    private static void m12636c(Context context) {
        f19600c = Long.valueOf(new Timestamp(System.currentTimeMillis()).getTime());
        new Thread(new RunnableC2276a(context), "Thread-getStateForHmsAnalyticsProvider").start();
    }

    /* renamed from: d */
    private static boolean m12637d(Context context) {
        return RegionUtils.isChinaROM(context);
    }

    /* renamed from: e */
    private static void m12638e(Context context) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (timestamp.getTime() - f19600c.longValue() < 86400000 || f19600c.longValue() <= 0) {
            return;
        }
        f19600c = Long.valueOf(timestamp.getTime());
        new Thread(new RunnableC2277b(context), "Thread-refreshOobeAnalyticsState").start();
    }

    /* renamed from: f */
    public static void m12639f(Context context) {
        if (context == null) {
            HMSLog.m12620e("AnalyticsSwitchHolder", "In setAnalyticsState、, context is null.");
            return;
        }
        if (HiAnalyticsUtils.getInstance().getOobeAnalyticsState(context) != 1) {
            synchronized (f19599b) {
                f19598a = 2;
            }
            C2246a.m12561c().m12562a();
            return;
        }
        synchronized (f19599b) {
            f19598a = 1;
        }
        if (HiAnalyticsUtils.getInstance().getInitFlag() || f19601d) {
            return;
        }
        HMSBIInitializer.getInstance(context).initHaSDK();
        f19601d = true;
    }

    public static int getAndRefreshAnalyticsState(Context context) {
        int i;
        synchronized (f19599b) {
            isAnalyticsDisabled(context);
            i = f19598a;
        }
        return i;
    }

    public static boolean getBiSetting(Context context) {
        Bundle bundle;
        if (context == null) {
            HMSLog.m12620e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                    return bundle.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (AndroidException unused) {
                HMSLog.m12620e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            } catch (RuntimeException e) {
                HMSLog.m12621e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.", e);
            }
        }
        HMSLog.m12622i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    public static boolean isAnalyticsDisabled(Context context) {
        synchronized (f19599b) {
            try {
                if (f19598a == 0) {
                    if (context == null) {
                        return true;
                    }
                    if (m12635b(context)) {
                        HMSLog.m12622i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                        f19598a = 1;
                    } else if (getBiSetting(context)) {
                        HMSLog.m12622i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                        f19598a = 2;
                    } else if (m12637d(context)) {
                        f19598a = 1;
                    } else {
                        HMSLog.m12622i("AnalyticsSwitchHolder", "not ChinaROM");
                        f19598a = 3;
                        f19602e = true;
                        m12636c(context);
                    }
                } else if (f19602e) {
                    m12638e(context);
                }
                return f19598a != 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
