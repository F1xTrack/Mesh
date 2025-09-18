package defpackage;

import android.view.WindowInsetsAnimation;

/* renamed from: Fn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451Fn1 extends AbstractC0529Gn1 {
    public final WindowInsetsAnimation e;

    public C0451Fn1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.AbstractC0529Gn1
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.AbstractC0529Gn1
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.AbstractC0529Gn1
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.AbstractC0529Gn1
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
