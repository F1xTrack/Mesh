package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzu extends zzw {
    private final Callable zze;

    public /* synthetic */ zzu(Callable callable, zzv zzvVar) {
        super();
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzw
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
