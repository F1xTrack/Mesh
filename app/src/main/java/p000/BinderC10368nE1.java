package p000;

import android.location.Location;
import com.google.android.gms.location.zzt;

/* renamed from: nE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC10368nE1 extends zzt {

    /* renamed from: a */
    public final OD1 f38191a;

    public BinderC10368nE1(OD1 od1) {
        this.f38191a = od1;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) {
        this.f38191a.zza().notifyListener(new C9216eE1(location));
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() {
        this.f38191a.zza().notifyListener(new C9856jE1(this));
    }
}
