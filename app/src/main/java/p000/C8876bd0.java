package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8876bd0 implements InterfaceC7520Dz0 {

    /* renamed from: a */
    public final C8582Yk0 f17097a;

    /* renamed from: b */
    public final C7454Cs0 f17098b;

    /* renamed from: c */
    public C7129xI f17099c;

    /* renamed from: d */
    public final C8478Wk0 f17100d;

    public C8876bd0(C8582Yk0 c8582Yk0, C8342Tu0 c8342Tu0, C7454Cs0 c7454Cs0) {
        this.f17097a = c8582Yk0;
        this.f17098b = c7454Cs0;
        this.f17100d = c8582Yk0.m9351c(new C7236z(2, this));
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: a */
    public final List mo939a(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        return AbstractC7230yu.m26276g(this.f17100d.invoke(c0664kx));
    }

    @Override // p000.InterfaceC7416Bz0
    /* renamed from: b */
    public final Collection mo940b(C0664KX c0664kx, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c0664kx, "fqName");
        O90.m5968f(interfaceC6497nZ, "nameFilter");
        return C1156SN.f10705a;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: c */
    public final boolean mo1483c(C0664KX c0664kx) {
        O90.m5968f(c0664kx, "fqName");
        C8478Wk0 c8478Wk0 = this.f17100d;
        Object obj = c8478Wk0.f13369b.get(c0664kx);
        return ((obj == null || obj == EnumC8530Xk0.f13943b) ? m10474e(c0664kx) : (InterfaceC11993zz0) c8478Wk0.invoke(c0664kx)) == null;
    }

    @Override // p000.InterfaceC7520Dz0
    /* renamed from: d */
    public final void mo1484d(C0664KX c0664kx, ArrayList arrayList) {
        O90.m5968f(c0664kx, "fqName");
        AbstractC9502gT1.m18571a(arrayList, this.f17100d.invoke(c0664kx));
    }

    /* renamed from: e */
    public final C1493Xj m10474e(C0664KX c0664kx) {
        InputStream inputStreamM9583a;
        O90.m5968f(c0664kx, "fqName");
        if (c0664kx.m4660h(AbstractC10732q41.f40587k)) {
            C1115Rj.f10401m.getClass();
            inputStreamM9583a = C1619Zj.m9583a(C1115Rj.m7109a(c0664kx));
        } else {
            inputStreamM9583a = null;
        }
        if (inputStreamM9583a != null) {
            return AbstractC9878jP1.m22031a(c0664kx, this.f17097a, this.f17098b, inputStreamM9583a);
        }
        return null;
    }
}
