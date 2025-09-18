package defpackage;

import java.util.Set;

/* renamed from: zs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8443zs {
    public static final Set c = AbstractC7627vZ0.e(C0074As.j(AbstractC6390p41.c.g()));
    public final C7955xI a;
    public final C1766Wk0 b;

    public C8443zs(C7955xI c7955xI) {
        O90.f(c7955xI, "components");
        this.a = c7955xI;
        this.b = ((C1922Yk0) c7955xI.a).c(new C8277z(9, this));
    }

    public final InterfaceC7492us a(C0074As c0074As, C6919rs c6919rs) {
        O90.f(c0074As, "classId");
        return (InterfaceC7492us) this.b.invoke(new C8253ys(c0074As, c6919rs));
    }
}
