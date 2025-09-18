package defpackage;

import android.view.WindowInsetsAnimation;

/* renamed from: zn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8430zn1 {
    public final J80 a;
    public final J80 b;

    public C8430zn1(J80 j80, J80 j802) {
        this.a = j80;
        this.b = j802;
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public C8430zn1(WindowInsetsAnimation.Bounds bounds) {
        this.a = J80.c(bounds.getLowerBound());
        this.b = J80.c(bounds.getUpperBound());
    }
}
