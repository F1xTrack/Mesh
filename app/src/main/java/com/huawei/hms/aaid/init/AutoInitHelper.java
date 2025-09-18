package com.huawei.hms.aaid.init;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.opendevice.C2205i;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class AutoInitHelper {
    public static void doAutoInit(Context context) {
        try {
            if (isAutoInitEnabled(context)) {
                HMSLog.m12622i("AutoInit", "Push init start");
                new Thread(new RunnableC2013a(context)).start();
            }
        } catch (Exception e) {
            HMSLog.m12621e("AutoInit", "Push init failed", e);
        }
    }

    public static boolean isAutoInitEnabled(Context context) {
        C2205i c2205iM12355a = C2205i.m12355a(context);
        if (c2205iM12355a.containsKey("push_kit_auto_init_enabled")) {
            return c2205iM12355a.getBoolean("push_kit_auto_init_enabled");
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("push_kit_auto_init_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void setAutoInitEnabled(Context context, boolean z) {
        C2205i c2205iM12355a = C2205i.m12355a(context);
        boolean z2 = c2205iM12355a.getBoolean("push_kit_auto_init_enabled");
        c2205iM12355a.saveBoolean("push_kit_auto_init_enabled", z);
        if (!z || z2) {
            return;
        }
        doAutoInit(context);
    }
}
