package defpackage;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class U60 extends C1672Vf {
    public long b;
    public C7560vD c;

    @Override // defpackage.C1672Vf, defpackage.InterfaceC3301cz
    public final void h(Object obj, String str) {
        this.b = System.currentTimeMillis();
    }

    @Override // defpackage.C1672Vf, defpackage.InterfaceC3301cz
    public final void o(String str, L60 l60, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C7560vD c7560vD = this.c;
        if (c7560vD != null) {
            c7560vD.s = jCurrentTimeMillis - this.b;
            c7560vD.invalidateSelf();
        }
    }
}
