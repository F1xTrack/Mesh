package defpackage;

/* renamed from: d01 */
/* loaded from: classes.dex */
public final class C3307d01 implements InterfaceC0326Dy {
    public final String a;
    public final int b;
    public final K4 c;
    public final boolean d;

    public C3307d01(String str, int i, K4 k4, boolean z) {
        this.a = str;
        this.b = i;
        this.c = k4;
        this.d = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        return new NZ0(c5948mm0, abstractC6120ng, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return AbstractC8235ym.l(sb, this.b, '}');
    }
}
