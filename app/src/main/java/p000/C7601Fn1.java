package p000;

import android.view.WindowInsetsAnimation;

/* renamed from: Fn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7601Fn1 extends AbstractC7653Gn1 {

    /* renamed from: e */
    public final WindowInsetsAnimation f3418e;

    public C7601Fn1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f3418e = windowInsetsAnimation;
    }

    @Override // p000.AbstractC7653Gn1
    /* renamed from: a */
    public final long mo2778a() {
        return this.f3418e.getDurationMillis();
    }

    @Override // p000.AbstractC7653Gn1
    /* renamed from: b */
    public final float mo2779b() {
        return this.f3418e.getInterpolatedFraction();
    }

    @Override // p000.AbstractC7653Gn1
    /* renamed from: c */
    public final int mo2780c() {
        return this.f3418e.getTypeMask();
    }

    @Override // p000.AbstractC7653Gn1
    /* renamed from: d */
    public final void mo2781d(float f) {
        this.f3418e.setFraction(f);
    }
}
