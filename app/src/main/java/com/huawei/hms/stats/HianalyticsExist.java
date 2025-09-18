package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class HianalyticsExist {

    /* renamed from: a */
    private static final Object f19490a = new Object();

    /* renamed from: b */
    private static boolean f19491b = false;

    /* renamed from: c */
    private static boolean f19492c = false;

    public static boolean isHianalyticsExist() {
        synchronized (f19490a) {
            if (!f19491b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.m12622i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f19491b = true;
                HMSLog.m12622i("HianalyticsExist", "hianalytics exist: " + f19492c);
            }
        }
        return f19492c;
    }
}
