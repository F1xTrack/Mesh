package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z, int i, int i2, String str, Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(String str) {
        return new zzw(false, 1, 5, str, null);
    }

    public static zzw zzd(String str, Throwable th) {
        return new zzw(false, 1, 5, str, th);
    }

    public static zzw zzf(int i) {
        return new zzw(true, i, 1, null, null);
    }

    public static zzw zzg(int i, int i2, String str, Throwable th) {
        return new zzw(false, i, i2, str, th);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }
}
