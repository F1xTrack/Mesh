package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class QZ0 implements InterfaceC0326Dy {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final K4 d;
    public final K4 e;
    public final boolean f;

    public QZ0(String str, boolean z, Path.FillType fillType, K4 k4, K4 k42, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = k4;
        this.e = k42;
        this.f = z2;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        return new C6084nU(c5948mm0, abstractC6120ng, this);
    }

    public final String toString() {
        return F91.w(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
