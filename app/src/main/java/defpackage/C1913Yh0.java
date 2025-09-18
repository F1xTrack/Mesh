package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: Yh0 */
/* loaded from: classes2.dex */
public final class C1913Yh0 implements InterfaceC5578kq0 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public C1913Yh0(InterfaceC5578kq0 interfaceC5578kq0) {
        this.c = interfaceC5578kq0;
    }

    @Override // defpackage.InterfaceC5578kq0
    public Collection a(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        switch (this.b) {
            case 1:
                O90.f(c1559Tt0, "name");
                return UJ1.b(j(c1559Tt0, interfaceC0600Hl0), XS0.D);
            default:
                return j(c1559Tt0, interfaceC0600Hl0);
        }
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set b() {
        return l().b();
    }

    @Override // defpackage.InterfaceC3584eS0
    public final InterfaceC1087Ns c(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        O90.f(interfaceC0600Hl0, "location");
        return l().c(c1559Tt0, interfaceC0600Hl0);
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set d() {
        return l().d();
    }

    @Override // defpackage.InterfaceC5578kq0
    public Collection e(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        switch (this.b) {
            case 1:
                O90.f(c1559Tt0, "name");
                return UJ1.b(k(c1559Tt0, enumC8453zv0), XS0.E);
            default:
                return k(c1559Tt0, enumC8453zv0);
        }
    }

    @Override // defpackage.InterfaceC5578kq0
    public final Set f() {
        return l().f();
    }

    @Override // defpackage.InterfaceC3584eS0
    public Collection g(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        switch (this.b) {
            case 1:
                O90.f(c4317iI, "kindFilter");
                O90.f(interfaceC6099nZ, "nameFilter");
                Collection collectionI = i(c4317iI, interfaceC6099nZ);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((CD) obj) instanceof InterfaceC7662vl) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC8069xu.N(UJ1.b(arrayList, XS0.C), arrayList2);
            default:
                return i(c4317iI, interfaceC6099nZ);
        }
    }

    public final InterfaceC5578kq0 h() {
        if (!(l() instanceof C1913Yh0)) {
            return l();
        }
        InterfaceC5578kq0 interfaceC5578kq0L = l();
        O90.d(interfaceC5578kq0L, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C1913Yh0) interfaceC5578kq0L).h();
    }

    public final Collection i(C4317iI c4317iI, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(c4317iI, "kindFilter");
        O90.f(interfaceC6099nZ, "nameFilter");
        return l().g(c4317iI, interfaceC6099nZ);
    }

    public final Collection j(C1559Tt0 c1559Tt0, InterfaceC0600Hl0 interfaceC0600Hl0) {
        O90.f(c1559Tt0, "name");
        return l().a(c1559Tt0, interfaceC0600Hl0);
    }

    public final Collection k(C1559Tt0 c1559Tt0, EnumC8453zv0 enumC8453zv0) {
        O90.f(c1559Tt0, "name");
        return l().e(c1559Tt0, enumC8453zv0);
    }

    public final InterfaceC5578kq0 l() {
        switch (this.b) {
            case 0:
                return (InterfaceC5578kq0) ((C1688Vk0) this.c).invoke();
            default:
                return (InterfaceC5578kq0) this.c;
        }
    }

    public C1913Yh0(Z41 z41, InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(z41, "storageManager");
        this.c = new C1688Vk0((C1922Yk0) z41, new C6685qd0(8, interfaceC5908mZ));
    }
}
