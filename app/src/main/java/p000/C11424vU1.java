package p000;

/* renamed from: vU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11424vU1 implements InterfaceC9122dV1 {

    /* renamed from: a */
    public final IP1 f44390a;

    public C11424vU1(IP1 ip1) {
        this.f44390a = ip1;
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: a */
    public final boolean mo17693a(AbstractC10908rS1 abstractC10908rS1, Object obj) {
        return abstractC10908rS1.zzb.equals(((AbstractC10908rS1) obj).zzb);
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: b */
    public final boolean mo17694b(Object obj) {
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: c */
    public final void mo17695c(Object obj, byte[] bArr, int i, int i2, VP1 vp1) {
        AbstractC10908rS1 abstractC10908rS1 = (AbstractC10908rS1) obj;
        if (abstractC10908rS1.zzb == PV1.f9096f) {
            abstractC10908rS1.zzb = PV1.m6377e();
        }
        throw RI1.m6944h(obj);
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: d */
    public final void mo17696d(Object obj) {
        C9937jt0.m22117u(obj);
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: e */
    public final int mo17697e(AbstractC10908rS1 abstractC10908rS1) {
        PV1 pv1 = abstractC10908rS1.zzb;
        int i = pv1.f9100d;
        if (i != -1) {
            return i;
        }
        int iM18527e = 0;
        for (int i2 = 0; i2 < pv1.f9097a; i2++) {
            int i3 = pv1.f9098b[i2] >>> 3;
            iM18527e += C9498gR1.m18527e(3, (JQ1) pv1.f9099c[i2]) + C9498gR1.m18542x(2, i3) + (C9498gR1.m18522A(8) << 1);
        }
        pv1.f9100d = iM18527e;
        return iM18527e;
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: f */
    public final int mo17698f(AbstractC10908rS1 abstractC10908rS1) {
        return abstractC10908rS1.zzb.hashCode();
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: g */
    public final void mo17699g(Object obj, C10641pN0 c10641pN0) {
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.InterfaceC9122dV1
    /* renamed from: h */
    public final void mo17700h(Object obj, Object obj2) {
        BL1.m677j(obj, obj2);
    }

    @Override // p000.InterfaceC9122dV1
    public final AbstractC10908rS1 zza() {
        IP1 ip1 = this.f44390a;
        return ip1 instanceof AbstractC10908rS1 ? (AbstractC10908rS1) ((AbstractC10908rS1) ip1).mo644d(4) : ((AbstractC10524oS1) ((AbstractC10908rS1) ip1).mo644d(5)).m23413h();
    }
}
