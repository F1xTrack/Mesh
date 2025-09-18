package defpackage;

/* renamed from: wr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7871wr0 implements EV0 {
    public final B00 a;
    public final C5358jg1 b;
    public final GR c;

    public C7871wr0(C5358jg1 c5358jg1, GR gr, B00 b00) {
        this.b = c5358jg1;
        gr.getClass();
        this.c = gr;
        this.a = b00;
    }

    @Override // defpackage.EV0
    public final Object a() {
        return ((AbstractC6945s00) this.a.d(5)).e();
    }

    @Override // defpackage.EV0
    public final void b(Object obj) {
        this.b.getClass();
        ((B00) obj).unknownFields.e = false;
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.EV0
    public final boolean c(Object obj) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.EV0
    public final void d(Object obj, C1304Qm0 c1304Qm0) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.EV0
    public final void e(Object obj, C5971mu c5971mu, ER er) {
        this.b.getClass();
        B00 b00 = (B00) obj;
        if (b00.unknownFields == C4200hg1.f) {
            b00.unknownFields = C4200hg1.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.EV0
    public final int f(B00 b00) {
        this.b.getClass();
        return b00.unknownFields.hashCode();
    }

    @Override // defpackage.EV0
    public final void g(B00 b00, B00 b002) {
        IV0.B(this.b, b00, b002);
    }

    @Override // defpackage.EV0
    public final boolean h(B00 b00, Object obj) {
        this.b.getClass();
        return b00.unknownFields.equals(((B00) obj).unknownFields);
    }

    @Override // defpackage.EV0
    public final int i(L0 l0) {
        this.b.getClass();
        C4200hg1 c4200hg1 = ((B00) l0).unknownFields;
        int i = c4200hg1.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c4200hg1.a; i3++) {
            int i4 = c4200hg1.b[i3] >>> 3;
            i2 += C6735qu.i(3, (C0440Fk) c4200hg1.c[i3]) + C6735qu.A(2, i4) + (C6735qu.z(1) * 2);
        }
        c4200hg1.d = i2;
        return i2;
    }
}
