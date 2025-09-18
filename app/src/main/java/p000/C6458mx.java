package p000;

/* renamed from: mx */
/* loaded from: classes2.dex */
public final class C6458mx extends C0109Bj {

    /* renamed from: m */
    public final EnumC6904tj f38000m;

    public C6458mx(int i, EnumC6904tj enumC6904tj, InterfaceC6497nZ interfaceC6497nZ) {
        super(i, interfaceC6497nZ);
        this.f38000m = enumC6904tj;
        if (enumC6904tj != EnumC6904tj.f43225a) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC7222ym.m26230g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + BP0.f799a.mo3846b(C0109Bj.class).mo2808f() + " instead").toString());
        }
    }

    /* renamed from: C */
    public final Object m23022C(Object obj, boolean z) {
        C6578or c6578or;
        InterfaceC6497nZ interfaceC6497nZ;
        C6838sg c6838sgM6629b;
        EnumC6904tj enumC6904tj = EnumC6904tj.f43227c;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (this.f38000m == enumC6904tj) {
            Object objMo821b = super.mo821b(obj);
            if (!(objMo821b instanceof C6515nr) || (objMo821b instanceof C6452mr)) {
                return objMo821b;
            }
            if (!z || (interfaceC6497nZ = this.f991c) == null || (c6838sgM6629b = QI1.m6629b(interfaceC6497nZ, obj, null)) == null) {
                return c8313Tf1;
            }
            throw c6838sgM6629b;
        }
        Object obj2 = AbstractC0235Dj.f2190d;
        C6578or c6578or2 = (C6578or) C0109Bj.f985h.get(this);
        while (true) {
            long andIncrement = C0109Bj.f981d.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zM833r = m833r(andIncrement, false);
            int i = AbstractC0235Dj.f2188b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c6578or2.f6149c != j3) {
                C6578or c6578orM813c = C0109Bj.m813c(this, j3, c6578or2);
                if (c6578orM813c != null) {
                    c6578or = c6578orM813c;
                } else if (zM833r) {
                    return new C6452mr(m831o());
                }
            } else {
                c6578or = c6578or2;
            }
            int iM815e = C0109Bj.m815e(this, c6578or, i2, obj, j, obj2, zM833r);
            if (iM815e == 0) {
                c6578or.m23885b();
                return c8313Tf1;
            }
            if (iM815e == 1) {
                return c8313Tf1;
            }
            if (iM815e == 2) {
                if (zM833r) {
                    c6578or.m4666i();
                    return new C6452mr(m831o());
                }
                InterfaceC10564om1 interfaceC10564om1 = obj2 instanceof InterfaceC10564om1 ? (InterfaceC10564om1) obj2 : null;
                if (interfaceC10564om1 != null) {
                    interfaceC10564om1.mo4425b(c6578or, i2 + i);
                }
                m826j((c6578or.f6149c * j2) + i2);
                return c8313Tf1;
            }
            if (iM815e == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM815e == 4) {
                if (j < C0109Bj.f982e.get(this)) {
                    c6578or.m23885b();
                }
                return new C6452mr(m831o());
            }
            if (iM815e == 5) {
                c6578or.m23885b();
            }
            c6578or2 = c6578or;
        }
    }

    @Override // p000.C0109Bj, p000.InterfaceC8738aY0
    /* renamed from: a */
    public final Object mo820a(AbstractC11986zv1 abstractC11986zv1, AbstractC1571Yy abstractC1571Yy) throws Throwable {
        C6838sg c6838sgM6629b;
        if (!(m23022C(abstractC11986zv1, true) instanceof C6452mr)) {
            return C8313Tf1.f11463a;
        }
        InterfaceC6497nZ interfaceC6497nZ = this.f991c;
        if (interfaceC6497nZ == null || (c6838sgM6629b = QI1.m6629b(interfaceC6497nZ, abstractC11986zv1, null)) == null) {
            throw m831o();
        }
        I02.m3687a(c6838sgM6629b, m831o());
        throw c6838sgM6629b;
    }

    @Override // p000.C0109Bj, p000.InterfaceC8738aY0
    /* renamed from: b */
    public final Object mo821b(Object obj) {
        return m23022C(obj, false);
    }

    @Override // p000.C0109Bj
    /* renamed from: s */
    public final boolean mo834s() {
        return this.f38000m == EnumC6904tj.f43226b;
    }
}
