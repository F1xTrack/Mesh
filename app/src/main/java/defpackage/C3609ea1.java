package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: ea1 */
/* loaded from: classes2.dex */
public final class C3609ea1 extends C3574eP {
    @Override // defpackage.C3574eP, defpackage.InterfaceC5578kq0
    public final /* bridge */ /* synthetic */ Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        a(c1559Tt0, (EnumC8453zv0) interfaceC0600Hl0);
        throw null;
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC5578kq0
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        throw new IllegalStateException(this.b + ", required name: " + c1559Tt0);
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC5578kq0
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC5578kq0
    public final /* bridge */ /* synthetic */ Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        e(c1559Tt0, enumC8453zv0);
        throw null;
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC5578kq0
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C3574eP, defpackage.InterfaceC3584eS0
    public final Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        throw new IllegalStateException(this.b);
    }

    @Override // defpackage.C3574eP
    /* renamed from: h */
    public final Set a(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        throw new IllegalStateException(this.b + ", required name: " + c1559Tt0);
    }

    @Override // defpackage.C3574eP
    /* renamed from: i */
    public final Set e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        throw new IllegalStateException(this.b + ", required name: " + c1559Tt0);
    }

    @Override // defpackage.C3574eP
    public final String toString() {
        return F91.v(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
