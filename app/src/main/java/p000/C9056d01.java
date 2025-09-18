package p000;

/* renamed from: d01 */
/* loaded from: classes.dex */
public final class C9056d01 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final String f25760a;

    /* renamed from: b */
    public final int f25761b;

    /* renamed from: c */
    public final C0635K4 f25762c;

    /* renamed from: d */
    public final boolean f25763d;

    public C9056d01(String str, int i, C0635K4 c0635k4, boolean z) {
        this.f25760a = str;
        this.f25761b = i;
        this.f25762c = c0635k4;
        this.f25763d = z;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        return new NZ0(c10307mm0, abstractC6504ng, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f25760a);
        sb.append(", index=");
        return AbstractC7222ym.m26235l(sb, this.f25761b, '}');
    }
}
