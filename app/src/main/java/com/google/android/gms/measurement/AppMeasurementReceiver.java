package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p000.AbstractC11332um1;
import p000.C9110dP1;
import p000.GQ0;
import p000.OL1;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC11332um1 {

    /* renamed from: c */
    public GQ0 f18048c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f18048c == null) {
            this.f18048c = new GQ0(this);
        }
        GQ0 gq0 = this.f18048c;
        gq0.getClass();
        OL1 ol1 = C9110dP1.m17588a(context, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        if (intent == null) {
            ol1.f8381j.m24555d("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        ol1.f8386o.m24554c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                ol1.f8381j.m24555d("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        ol1.f8386o.m24555d("Starting wakeful intent.");
        ((AppMeasurementReceiver) gq0.f3735b).getClass();
        SparseArray sparseArray = AbstractC11332um1.f43860a;
        synchronized (sparseArray) {
            try {
                int i = AbstractC11332um1.f43861b;
                int i2 = i + 1;
                AbstractC11332um1.f43861b = i2;
                if (i2 <= 0) {
                    AbstractC11332um1.f43861b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } finally {
            }
        }
    }
}
