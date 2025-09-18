package p000;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzq;

/* renamed from: aE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC8699aE1 extends zzq {

    /* renamed from: a */
    public final OD1 f15400a;

    public BinderC8699aE1(OD1 od1) {
        this.f15400a = od1;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) {
        this.f15400a.zza().notifyListener(new TD1(locationAvailability));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) {
        this.f15400a.zza().notifyListener(new RD1(locationResult));
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() {
        this.f15400a.zza().notifyListener(new XD1(this));
    }
}
