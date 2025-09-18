package p000;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class QZ0 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final boolean f9670a;

    /* renamed from: b */
    public final Path.FillType f9671b;

    /* renamed from: c */
    public final String f9672c;

    /* renamed from: d */
    public final C0635K4 f9673d;

    /* renamed from: e */
    public final C0635K4 f9674e;

    /* renamed from: f */
    public final boolean f9675f;

    public QZ0(String str, boolean z, Path.FillType fillType, C0635K4 c0635k4, C0635K4 c0635k42, boolean z2) {
        this.f9672c = str;
        this.f9670a = z;
        this.f9671b = fillType;
        this.f9673d = c0635k4;
        this.f9674e = c0635k42;
        this.f9675f = z2;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        return new C6492nU(c10307mm0, abstractC6504ng, this);
    }

    public final String toString() {
        return F91.m2540w(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f9670a, '}');
    }
}
