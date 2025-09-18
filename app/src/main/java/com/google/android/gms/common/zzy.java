package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import p000.AbstractC9438fz1;
import p000.C11230tz1;
import p000.C8195Qy1;

/* loaded from: classes.dex */
final class zzy {
    private String zza = null;
    private long zzb = -1;
    private AbstractC9438fz1 zzc;
    private AbstractC9438fz1 zzd;

    public zzy() {
        C8195Qy1 c8195Qy1 = AbstractC9438fz1.f27517b;
        C11230tz1 c11230tz1 = C11230tz1.f43437e;
        this.zzc = c11230tz1;
        this.zzd = c11230tz1;
    }

    public final zzy zza(long j) {
        this.zzb = j;
        return this;
    }

    public final zzy zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = AbstractC9438fz1.m18342t(list);
        return this;
    }

    public final zzy zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = AbstractC9438fz1.m18342t(list);
        return this;
    }

    public final zzy zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzaa zze() {
        if (this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzaa(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
