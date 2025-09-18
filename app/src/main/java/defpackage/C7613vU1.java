package defpackage;

/* renamed from: vU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7613vU1 implements InterfaceC3404dV1 {
    public final IP1 a;

    public C7613vU1(IP1 ip1) {
        this.a = ip1;
    }

    @Override // defpackage.InterfaceC3404dV1
    public final boolean a(AbstractC6843rS1 abstractC6843rS1, Object obj) {
        return abstractC6843rS1.zzb.equals(((AbstractC6843rS1) obj).zzb);
    }

    @Override // defpackage.InterfaceC3404dV1
    public final boolean b(Object obj) {
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void c(Object obj, byte[] bArr, int i, int i2, VP1 vp1) {
        AbstractC6843rS1 abstractC6843rS1 = (AbstractC6843rS1) obj;
        if (abstractC6843rS1.zzb == PV1.f) {
            abstractC6843rS1.zzb = PV1.e();
        }
        throw RI1.h(obj);
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void d(Object obj) {
        C5396jt0.u(obj);
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3404dV1
    public final int e(AbstractC6843rS1 abstractC6843rS1) {
        PV1 pv1 = abstractC6843rS1.zzb;
        int i = pv1.d;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < pv1.a; i2++) {
            int i3 = pv1.b[i2] >>> 3;
            iE += C3964gR1.e(3, (JQ1) pv1.c[i2]) + C3964gR1.x(2, i3) + (C3964gR1.A(8) << 1);
        }
        pv1.d = iE;
        return iE;
    }

    @Override // defpackage.InterfaceC3404dV1
    public final int f(AbstractC6843rS1 abstractC6843rS1) {
        return abstractC6843rS1.zzb.hashCode();
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void g(Object obj, C6446pN0 c6446pN0) {
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3404dV1
    public final void h(Object obj, Object obj2) {
        BL1.j(obj, obj2);
    }

    @Override // defpackage.InterfaceC3404dV1
    public final AbstractC6843rS1 zza() {
        IP1 ip1 = this.a;
        return ip1 instanceof AbstractC6843rS1 ? (AbstractC6843rS1) ((AbstractC6843rS1) ip1).d(4) : ((AbstractC6271oS1) ((AbstractC6843rS1) ip1).d(5)).h();
    }
}
