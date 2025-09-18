package defpackage;

/* renamed from: vr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7681vr0 implements DV0 {
    public final J0 a;
    public final C4390ig1 b;
    public final FR c;

    public C7681vr0(C4390ig1 c4390ig1, FR fr, J0 j0) {
        this.b = c4390ig1;
        fr.getClass();
        this.c = fr;
        this.a = j0;
    }

    @Override // defpackage.DV0
    public final AbstractC8279z00 a() {
        J0 j0 = this.a;
        return j0 instanceof AbstractC8279z00 ? (AbstractC8279z00) ((AbstractC8279z00) j0).m(4) : ((AbstractC6564q00) ((AbstractC8279z00) j0).m(5)).m();
    }

    @Override // defpackage.DV0
    public final void b(Object obj) {
        this.b.getClass();
        C4390ig1.a(obj);
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.DV0
    public final boolean c(Object obj) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.DV0
    public final void d(Object obj, Object obj2) {
        HV0.z(this.b, obj, obj2);
    }

    @Override // defpackage.DV0
    public final int e(AbstractC8279z00 abstractC8279z00) {
        this.b.getClass();
        C4009gg1 c4009gg1 = abstractC8279z00.unknownFields;
        int i = c4009gg1.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < c4009gg1.a; i2++) {
            int i3 = c4009gg1.b[i2] >>> 3;
            iC += C6162nu.c(3, (C0362Ek) c4009gg1.c[i2]) + C6162nu.u(2, i3) + (C6162nu.t(1) * 2);
        }
        c4009gg1.d = iC;
        return iC;
    }

    @Override // defpackage.DV0
    public final boolean f(AbstractC8279z00 abstractC8279z00, Object obj) {
        this.b.getClass();
        return abstractC8279z00.unknownFields.equals(((AbstractC8279z00) obj).unknownFields);
    }

    @Override // defpackage.DV0
    public final void g(Object obj, C1562Tu0 c1562Tu0) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.DV0
    public final int h(AbstractC8279z00 abstractC8279z00) {
        this.b.getClass();
        return abstractC8279z00.unknownFields.hashCode();
    }
}
