package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2361bd0 implements InterfaceC0330Dz0 {
    public final C1922Yk0 a;
    public final C0231Cs0 b;
    public C7955xI c;
    public final C1766Wk0 d;

    public C2361bd0(C1922Yk0 c1922Yk0, C1562Tu0 c1562Tu0, C0231Cs0 c0231Cs0) {
        this.a = c1922Yk0;
        this.b = c0231Cs0;
        this.d = c1922Yk0.c(new C8277z(2, this));
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final List a(KX kx) {
        O90.f(kx, "fqName");
        return AbstractC8259yu.g(this.d.invoke(kx));
    }

    @Override // defpackage.InterfaceC0174Bz0
    public final Collection b(KX kx, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(kx, "fqName");
        O90.f(interfaceC6099nZ, "nameFilter");
        return SN.a;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final boolean c(KX kx) {
        O90.f(kx, "fqName");
        C1766Wk0 c1766Wk0 = this.d;
        Object obj = c1766Wk0.b.get(kx);
        return ((obj == null || obj == EnumC1844Xk0.b) ? e(kx) : (InterfaceC8465zz0) c1766Wk0.invoke(kx)) == null;
    }

    @Override // defpackage.InterfaceC0330Dz0
    public final void d(KX kx, ArrayList arrayList) {
        O90.f(kx, "fqName");
        AbstractC3970gT1.a(arrayList, this.d.invoke(kx));
    }

    public final C1840Xj e(KX kx) {
        InputStream inputStreamA;
        O90.f(kx, "fqName");
        if (kx.h(AbstractC6581q41.k)) {
            C1372Rj.m.getClass();
            inputStreamA = C1996Zj.a(C1372Rj.a(kx));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return AbstractC5307jP1.a(kx, this.a, this.b, inputStreamA);
        }
        return null;
    }
}
