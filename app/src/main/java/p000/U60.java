package p000;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public final class U60 extends C1363Vf {

    /* renamed from: b */
    public long f11653b;

    /* renamed from: c */
    public C6998vD f11654c;

    @Override // p000.C1363Vf, p000.InterfaceC3899cz
    /* renamed from: h */
    public final void mo3353h(Object obj, String str) {
        this.f11653b = System.currentTimeMillis();
    }

    @Override // p000.C1363Vf, p000.InterfaceC3899cz
    /* renamed from: o */
    public final void mo3356o(String str, L60 l60, Animatable animatable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C6998vD c6998vD = this.f11654c;
        if (c6998vD != null) {
            c6998vD.f44271s = jCurrentTimeMillis - this.f11653b;
            c6998vD.invalidateSelf();
        }
    }
}
