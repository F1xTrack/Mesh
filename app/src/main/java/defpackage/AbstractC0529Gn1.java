package defpackage;

import android.view.animation.Interpolator;

/* renamed from: Gn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529Gn1 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public AbstractC0529Gn1(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
    }

    public int c() {
        return this.a;
    }

    public void d(float f) {
        this.b = f;
    }
}
