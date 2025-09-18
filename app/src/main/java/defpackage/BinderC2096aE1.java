package defpackage;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzq;

/* renamed from: aE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2096aE1 extends zzq {
    public final OD1 a;

    public BinderC2096aE1(OD1 od1) {
        this.a = od1;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) {
        this.a.zza().notifyListener(new TD1(locationAvailability));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) {
        this.a.zza().notifyListener(new RD1(locationResult));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() {
        this.a.zza().notifyListener(new XD1(this));
    }
}
