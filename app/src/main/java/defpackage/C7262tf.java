package defpackage;

import android.window.BackEvent;

/* renamed from: tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7262tf {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public C7262tf(BackEvent backEvent) {
        O90.f(backEvent, "backEvent");
        W5 w5 = W5.a;
        float fD = w5.d(backEvent);
        float fE = w5.e(backEvent);
        float fB = w5.b(backEvent);
        int iC = w5.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return AbstractC8235ym.l(sb, this.d, '}');
    }
}
