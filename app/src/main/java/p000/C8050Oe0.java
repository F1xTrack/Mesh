package p000;

import java.util.Collection;

/* renamed from: Oe0 */
/* loaded from: classes2.dex */
public final class C8050Oe0 extends AbstractC10675pe0 {

    /* renamed from: b */
    public final Class f8553b;

    /* renamed from: c */
    public final Object f8554c;

    public C8050Oe0(Class cls) {
        O90.m5968f(cls, "jClass");
        this.f8553b = cls;
        this.f8554c = AbstractC0705LB.m4916c(EnumC9659hi0.f28538b, new C7790Je0(this, 1));
    }

    @Override // p000.InterfaceC6644ps
    /* renamed from: b */
    public final Class mo2807b() {
        return this.f8553b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8050Oe0) {
            if (O90.m5963a(this.f8553b, ((C8050Oe0) obj).f8553b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8553b.hashCode();
    }

    @Override // p000.AbstractC10675pe0
    /* renamed from: n */
    public final Collection mo3831n() {
        return C0779MN.f7117a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC10675pe0
    /* renamed from: o */
    public final Collection mo3832o(C8340Tt0 c8340Tt0) {
        C7946Me0 c7946Me0 = (C7946Me0) this.f8554c.getValue();
        c7946Me0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C7946Me0.f7280g[1];
        Object objInvoke = c7946Me0.f7282d.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return ((InterfaceC10059kq0) objInvoke).mo1769a(c8340Tt0, EnumC11985zv0.f47095b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC10675pe0
    /* renamed from: p */
    public final CE0 mo3833p(int i) {
        C9394fd1 c9394fd1 = (C9394fd1) ((C7946Me0) this.f8554c.getValue()).f7284f.getValue();
        if (c9394fd1 == null) {
            return null;
        }
        C10545od0 c10545od0 = (C10545od0) c9394fd1.f27302a;
        C10241mF0 c10241mF0 = (C10241mF0) c9394fd1.f27303b;
        C10417nd0 c10417nd0 = (C10417nd0) c9394fd1.f27304c;
        C11741y00 c11741y00 = AbstractC7736Id0.f5062n;
        O90.m5967e(c11741y00, "packageLocalVariable");
        C10753qF0 c10753qF0 = (C10753qF0) XM1.m8994b(c10241mF0, c11741y00, i);
        if (c10753qF0 == null) {
            return null;
        }
        GF0 gf0 = c10241mF0.f37596g;
        O90.m5967e(gf0, "getTypeTable(...)");
        return (CE0) AbstractC7589Fh1.m2754f(this.f8553b, c10753qF0, c10545od0, new C10226m71(gf0), c10417nd0, C7998Ne0.f7934a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC10675pe0
    /* renamed from: r */
    public final Class mo6096r() {
        Class cls = (Class) ((C7946Me0) this.f8554c.getValue()).f7283e.getValue();
        return cls == null ? this.f8553b : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // p000.AbstractC10675pe0
    /* renamed from: s */
    public final Collection mo3834s(C8340Tt0 c8340Tt0) {
        C7946Me0 c7946Me0 = (C7946Me0) this.f8554c.getValue();
        c7946Me0.getClass();
        InterfaceC10293mf0 interfaceC10293mf0 = C7946Me0.f7280g[1];
        Object objInvoke = c7946Me0.f7282d.invoke();
        O90.m5967e(objInvoke, "getValue(...)");
        return ((InterfaceC10059kq0) objInvoke).mo1771e(c8340Tt0, EnumC11985zv0.f47095b);
    }

    public final String toString() {
        return "file class " + VO0.m8433a(this.f8553b).m359b();
    }
}
