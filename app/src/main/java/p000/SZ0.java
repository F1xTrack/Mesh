package p000;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SZ0 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final String f10856a;

    /* renamed from: b */
    public final List f10857b;

    /* renamed from: c */
    public final boolean f10858c;

    public SZ0(String str, List list, boolean z) {
        this.f10856a = str;
        this.f10857b = list;
        this.f10858c = z;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        return new C7108wy(c10307mm0, abstractC6504ng, this, c8532Xl0);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f10856a + "' Shapes: " + Arrays.toString(this.f10857b.toArray()) + '}';
    }
}
