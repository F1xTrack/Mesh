package p000;

import java.util.List;

/* renamed from: Vh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8420Vh0 implements InterfaceC11317uf0 {

    /* renamed from: a */
    public final InterfaceC8412Vd0 f12693a;

    /* renamed from: b */
    public final boolean f12694b;

    /* renamed from: c */
    public final InterfaceC6434mZ f12695c;

    /* renamed from: d */
    public InterfaceC11317uf0 f12696d;

    public C8420Vh0(InterfaceC8412Vd0 interfaceC8412Vd0, boolean z, InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC8412Vd0, "classifier");
        O90.m5968f(interfaceC6434mZ, "kTypeProvider");
        this.f12693a = interfaceC8412Vd0;
        this.f12694b = z;
        this.f12695c = interfaceC6434mZ;
    }

    /* renamed from: b */
    public final InterfaceC11317uf0 m8536b() {
        if (this.f12696d == null) {
            this.f12696d = (InterfaceC11317uf0) this.f12695c.invoke();
        }
        InterfaceC11317uf0 interfaceC11317uf0 = this.f12696d;
        O90.m5965c(interfaceC11317uf0);
        return interfaceC11317uf0;
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: e */
    public final boolean mo8537e() {
        return this.f12694b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8420Vh0)) {
            return m8536b().equals(obj);
        }
        C8420Vh0 c8420Vh0 = (C8420Vh0) obj;
        return O90.m5963a(this.f12693a, c8420Vh0.f12693a) && this.f12694b == c8420Vh0.f12694b;
    }

    @Override // p000.InterfaceC8100Pd0
    public final List getAnnotations() {
        return m8536b().getAnnotations();
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: h */
    public final List mo8538h() {
        return m8536b().mo8538h();
    }

    public final int hashCode() {
        return (this.f12693a.hashCode() * 31) + (this.f12694b ? 1231 : 1237);
    }

    @Override // p000.InterfaceC11317uf0
    /* renamed from: i */
    public final InterfaceC9779ie0 mo8539i() {
        return this.f12693a;
    }

    public final String toString() {
        return m8536b().toString();
    }
}
