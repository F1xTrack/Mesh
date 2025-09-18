package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class S10 implements InterfaceC0326Dy {
    public final int a;
    public final Path.FillType b;
    public final K4 c;
    public final K4 d;
    public final K4 e;
    public final K4 f;
    public final String g;
    public final boolean h;

    public S10(String str, int i, Path.FillType fillType, K4 k4, K4 k42, K4 k43, K4 k44, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = k4;
        this.d = k42;
        this.e = k43;
        this.f = k44;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        return new T10(c5948mm0, c1847Xl0, abstractC6120ng, this);
    }
}
