package p000;

/* renamed from: wr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11596wr0 implements EV0 {

    /* renamed from: a */
    public final B00 f45142a;

    /* renamed from: b */
    public final C9912jg1 f45143b;

    /* renamed from: c */
    public final C0406GR f45144c;

    public C11596wr0(C9912jg1 c9912jg1, C0406GR c0406gr, B00 b00) {
        this.f45143b = c9912jg1;
        c0406gr.getClass();
        this.f45144c = c0406gr;
        this.f45142a = b00;
    }

    @Override // p000.EV0
    /* renamed from: a */
    public final Object mo2317a() {
        return ((AbstractC10975s00) this.f45142a.mo432d(5)).m24568e();
    }

    @Override // p000.EV0
    /* renamed from: b */
    public final void mo2318b(Object obj) {
        this.f45143b.getClass();
        ((B00) obj).unknownFields.f28527e = false;
        this.f45144c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.EV0
    /* renamed from: c */
    public final boolean mo2319c(Object obj) {
        this.f45144c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.EV0
    /* renamed from: d */
    public final void mo2320d(Object obj, C8170Qm0 c8170Qm0) {
        this.f45144c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.EV0
    /* renamed from: e */
    public final void mo2321e(Object obj, C6455mu c6455mu, C0280ER c0280er) {
        this.f45143b.getClass();
        B00 b00 = (B00) obj;
        if (b00.unknownFields == C9656hg1.f28522f) {
            b00.unknownFields = C9656hg1.m18844b();
        }
        this.f45144c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.EV0
    /* renamed from: f */
    public final int mo2322f(B00 b00) {
        this.f45143b.getClass();
        return b00.unknownFields.hashCode();
    }

    @Override // p000.EV0
    /* renamed from: g */
    public final void mo2323g(B00 b00, B00 b002) {
        IV0.m3883B(this.f45143b, b00, b002);
    }

    @Override // p000.EV0
    /* renamed from: h */
    public final boolean mo2324h(B00 b00, Object obj) {
        this.f45143b.getClass();
        return b00.unknownFields.equals(((B00) obj).unknownFields);
    }

    @Override // p000.EV0
    /* renamed from: i */
    public final int mo2325i(AbstractC0694L0 abstractC0694L0) {
        this.f45143b.getClass();
        C9656hg1 c9656hg1 = ((B00) abstractC0694L0).unknownFields;
        int i = c9656hg1.f28526d;
        if (i != -1) {
            return i;
        }
        int iM24084i = 0;
        for (int i2 = 0; i2 < c9656hg1.f28523a; i2++) {
            int i3 = c9656hg1.f28524b[i2] >>> 3;
            iM24084i += C6709qu.m24084i(3, (C0362Fk) c9656hg1.f28525c[i2]) + C6709qu.m24079A(2, i3) + (C6709qu.m24101z(1) * 2);
        }
        c9656hg1.f28526d = iM24084i;
        return iM24084i;
    }
}
