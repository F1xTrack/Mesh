package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SZ0 implements InterfaceC0326Dy {
    public final String a;
    public final List b;
    public final boolean c;

    public SZ0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        return new C7891wy(c5948mm0, abstractC6120ng, this, c1847Xl0);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
