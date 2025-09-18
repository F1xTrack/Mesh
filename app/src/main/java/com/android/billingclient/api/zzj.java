package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import p000.BA1;
import p000.BD1;
import p000.C10382nL1;

/* loaded from: classes.dex */
final class zzj extends BroadcastReceiver {
    final /* synthetic */ zzk zza;
    private boolean zzb;
    private final boolean zzc;
    private boolean zzd;

    public zzj(zzk zzkVar, boolean z) {
        this.zza = zzkVar;
        this.zzc = z;
    }

    private final void zzc(Bundle bundle, BillingResult billingResult, int i) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.zza.zze.zza(zzbx.zzb(23, i, billingResult));
            return;
        }
        try {
            this.zza.zze.zza(C10382nL1.m23126n(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), BD1.m560a()));
        } catch (Throwable unused) {
            int i2 = BA1.f614a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzj.onReceive(android.content.Context, android.content.Intent):void");
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.zzb) {
                return;
            }
            zzk zzkVar = this.zza;
            this.zzd = zzkVar.zzh;
            zzby zzbyVar = zzkVar.zze;
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < intentFilter.countActions(); i++) {
                arrayList.add(zzbx.zza(intentFilter.getAction(i)));
            }
            zzbyVar.zze(2, arrayList, false, this.zzd);
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context) {
        if (!this.zzb) {
            int i = BA1.f614a;
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
