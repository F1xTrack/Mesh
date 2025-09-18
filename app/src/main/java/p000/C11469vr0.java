package p000;

/* renamed from: vr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11469vr0 implements DV0 {

    /* renamed from: a */
    public final AbstractC0568J0 f44565a;

    /* renamed from: b */
    public final C9784ig1 f44566b;

    /* renamed from: c */
    public final C0343FR f44567c;

    public C11469vr0(C9784ig1 c9784ig1, C0343FR c0343fr, AbstractC0568J0 abstractC0568J0) {
        this.f44566b = c9784ig1;
        c0343fr.getClass();
        this.f44567c = c0343fr;
        this.f44565a = abstractC0568J0;
    }

    @Override // p000.DV0
    /* renamed from: a */
    public final AbstractC11868z00 mo1708a() {
        AbstractC0568J0 abstractC0568J0 = this.f44565a;
        return abstractC0568J0 instanceof AbstractC11868z00 ? (AbstractC11868z00) ((AbstractC11868z00) abstractC0568J0).mo2061m(4) : ((AbstractC10719q00) ((AbstractC11868z00) abstractC0568J0).mo2061m(5)).m23921m();
    }

    @Override // p000.DV0
    /* renamed from: b */
    public final void mo1709b(Object obj) {
        this.f44566b.getClass();
        C9784ig1.m19066a(obj);
        this.f44567c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.DV0
    /* renamed from: c */
    public final boolean mo1710c(Object obj) {
        this.f44567c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.DV0
    /* renamed from: d */
    public final void mo1711d(Object obj, Object obj2) {
        HV0.m3497z(this.f44566b, obj, obj2);
    }

    @Override // p000.DV0
    /* renamed from: e */
    public final int mo1712e(AbstractC11868z00 abstractC11868z00) {
        this.f44566b.getClass();
        C9528gg1 c9528gg1 = abstractC11868z00.unknownFields;
        int i = c9528gg1.f27932d;
        if (i != -1) {
            return i;
        }
        int iM23245c = 0;
        for (int i2 = 0; i2 < c9528gg1.f27929a; i2++) {
            int i3 = c9528gg1.f27930b[i2] >>> 3;
            iM23245c += C6518nu.m23245c(3, (C0299Ek) c9528gg1.f27931c[i2]) + C6518nu.m23263u(2, i3) + (C6518nu.m23262t(1) * 2);
        }
        c9528gg1.f27932d = iM23245c;
        return iM23245c;
    }

    @Override // p000.DV0
    /* renamed from: f */
    public final boolean mo1713f(AbstractC11868z00 abstractC11868z00, Object obj) {
        this.f44566b.getClass();
        return abstractC11868z00.unknownFields.equals(((AbstractC11868z00) obj).unknownFields);
    }

    @Override // p000.DV0
    /* renamed from: g */
    public final void mo1714g(Object obj, C8342Tu0 c8342Tu0) {
        this.f44567c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.DV0
    /* renamed from: h */
    public final int mo1715h(AbstractC11868z00 abstractC11868z00) {
        this.f44566b.getClass();
        return abstractC11868z00.unknownFields.hashCode();
    }
}
