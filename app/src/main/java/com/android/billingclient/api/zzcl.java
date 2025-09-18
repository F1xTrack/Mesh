package com.android.billingclient.api;

/* loaded from: classes.dex */
public final class zzcl {
    private boolean zza;

    private zzcl() {
    }

    public final zzcl zza() {
        this.zza = true;
        return this;
    }

    public final zzcn zzb() {
        if (this.zza) {
            return new zzcn(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }

    public /* synthetic */ zzcl(zzck zzckVar) {
    }
}
