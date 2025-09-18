package p000;

import android.view.animation.Interpolator;

/* renamed from: Gn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7653Gn1 {

    /* renamed from: a */
    public final int f3901a;

    /* renamed from: b */
    public float f3902b;

    /* renamed from: c */
    public final Interpolator f3903c;

    /* renamed from: d */
    public final long f3904d;

    public AbstractC7653Gn1(int i, Interpolator interpolator, long j) {
        this.f3901a = i;
        this.f3903c = interpolator;
        this.f3904d = j;
    }

    /* renamed from: a */
    public long mo2778a() {
        return this.f3904d;
    }

    /* renamed from: b */
    public float mo2779b() {
        Interpolator interpolator = this.f3903c;
        return interpolator != null ? interpolator.getInterpolation(this.f3902b) : this.f3902b;
    }

    /* renamed from: c */
    public int mo2780c() {
        return this.f3901a;
    }

    /* renamed from: d */
    public void mo2781d(float f) {
        this.f3902b = f;
    }
}
