package defpackage;

import android.location.Location;
import com.google.android.gms.location.zzt;

/* renamed from: nE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC6038nE1 extends zzt {
    public final OD1 a;

    public BinderC6038nE1(OD1 od1) {
        this.a = od1;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) {
        this.a.zza().notifyListener(new C3543eE1(location));
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() {
        this.a.zza().notifyListener(new C5274jE1(this));
    }
}
