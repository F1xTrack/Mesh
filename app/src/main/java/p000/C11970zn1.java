package p000;

import android.view.WindowInsetsAnimation;

/* renamed from: zn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11970zn1 {

    /* renamed from: a */
    public final J80 f47008a;

    /* renamed from: b */
    public final J80 f47009b;

    public C11970zn1(J80 j80, J80 j802) {
        this.f47008a = j80;
        this.f47009b = j802;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f47008a + " upper=" + this.f47009b + "}";
    }

    public C11970zn1(WindowInsetsAnimation.Bounds bounds) {
        this.f47008a = J80.m4202c(bounds.getLowerBound());
        this.f47009b = J80.m4202c(bounds.getUpperBound());
    }
}
