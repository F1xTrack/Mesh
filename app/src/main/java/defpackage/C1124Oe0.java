package defpackage;

import java.util.Collection;

/* renamed from: Oe0 */
/* loaded from: classes2.dex */
public final class C1124Oe0 extends AbstractC6497pe0 {
    public final Class b;
    public final Object c;

    public C1124Oe0(Class cls) {
        O90.f(cls, "jClass");
        this.b = cls;
        this.c = LB.c(EnumC4205hi0.b, new C0735Je0(this, 1));
    }

    @Override // defpackage.InterfaceC6538ps
    public final Class b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1124Oe0) {
            if (O90.a(this.b, ((C1124Oe0) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.AbstractC6497pe0
    public final Collection n() {
        return MN.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC6497pe0
    public final Collection o(C1559Tt0 c1559Tt0) {
        C0968Me0 c0968Me0 = (C0968Me0) this.c.getValue();
        c0968Me0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C0968Me0.g[1];
        Object objInvoke = c0968Me0.d.invoke();
        O90.e(objInvoke, "getValue(...)");
        return ((InterfaceC5578kq0) objInvoke).a(c1559Tt0, EnumC8453zv0.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC6497pe0
    public final CE0 p(int i) {
        C3809fd1 c3809fd1 = (C3809fd1) ((C0968Me0) this.c.getValue()).f.getValue();
        if (c3809fd1 == null) {
            return null;
        }
        C6303od0 c6303od0 = (C6303od0) c3809fd1.a;
        C5849mF0 c5849mF0 = (C5849mF0) c3809fd1.b;
        C6112nd0 c6112nd0 = (C6112nd0) c3809fd1.c;
        C8089y00 c8089y00 = AbstractC0654Id0.n;
        O90.e(c8089y00, "packageLocalVariable");
        C6613qF0 c6613qF0 = (C6613qF0) XM1.b(c5849mF0, c8089y00, i);
        if (c6613qF0 == null) {
            return null;
        }
        GF0 gf0 = c5849mF0.g;
        O90.e(gf0, "getTypeTable(...)");
        return (CE0) AbstractC0433Fh1.f(this.b, c6613qF0, c6303od0, new C5826m71(gf0), c6112nd0, C1046Ne0.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC6497pe0
    public final Class r() {
        Class cls = (Class) ((C0968Me0) this.c.getValue()).e.getValue();
        return cls == null ? this.b : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // defpackage.AbstractC6497pe0
    public final Collection s(C1559Tt0 c1559Tt0) {
        C0968Me0 c0968Me0 = (C0968Me0) this.c.getValue();
        c0968Me0.getClass();
        InterfaceC5927mf0 interfaceC5927mf0 = C0968Me0.g[1];
        Object objInvoke = c0968Me0.d.invoke();
        O90.e(objInvoke, "getValue(...)");
        return ((InterfaceC5578kq0) objInvoke).e(c1559Tt0, EnumC8453zv0.b);
    }

    public final String toString() {
        return "file class " + VO0.a(this.b).b();
    }
}
