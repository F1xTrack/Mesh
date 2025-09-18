package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: ea1 */
/* loaded from: classes2.dex */
public final class C9260ea1 extends C3988eP {
    @Override // p000.C3988eP, p000.InterfaceC10059kq0
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo1769a(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        mo1769a(c8340Tt0, (EnumC11985zv0) interfaceC7700Hl0);
        throw null;
    }

    @Override // p000.C3988eP, p000.InterfaceC10059kq0
    /* renamed from: b */
    public final Set mo6677b() {
        throw new IllegalStateException();
    }

    @Override // p000.C3988eP, p000.InterfaceC9243eS0
    /* renamed from: c */
    public final InterfaceC0873Ns mo1770c(C8340Tt0 c8340Tt0, InterfaceC7700Hl0 interfaceC7700Hl0) {
        O90.m5968f(c8340Tt0, "name");
        O90.m5968f(interfaceC7700Hl0, "location");
        throw new IllegalStateException(this.f26694b + ", required name: " + c8340Tt0);
    }

    @Override // p000.C3988eP, p000.InterfaceC10059kq0
    /* renamed from: d */
    public final Set mo4153d() {
        throw new IllegalStateException();
    }

    @Override // p000.C3988eP, p000.InterfaceC10059kq0
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Collection mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        mo1771e(c8340Tt0, enumC11985zv0);
        throw null;
    }

    @Override // p000.C3988eP, p000.InterfaceC10059kq0
    /* renamed from: f */
    public final Set mo6678f() {
        throw new IllegalStateException();
    }

    @Override // p000.C3988eP, p000.InterfaceC9243eS0
    /* renamed from: g */
    public final Collection mo2108g(C4233iI c4233iI, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c4233iI, "kindFilter");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        throw new IllegalStateException(this.f26694b);
    }

    @Override // p000.C3988eP
    /* renamed from: h */
    public final Set mo1769a(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        throw new IllegalStateException(this.f26694b + ", required name: " + c8340Tt0);
    }

    @Override // p000.C3988eP
    /* renamed from: i */
    public final Set mo1771e(C8340Tt0 c8340Tt0, EnumC11985zv0 enumC11985zv0) {
        O90.m5968f(c8340Tt0, "name");
        throw new IllegalStateException(this.f26694b + ", required name: " + c8340Tt0);
    }

    @Override // p000.C3988eP
    public final String toString() {
        return F91.m2539v(new StringBuilder("ThrowingScope{"), this.f26694b, '}');
    }
}
