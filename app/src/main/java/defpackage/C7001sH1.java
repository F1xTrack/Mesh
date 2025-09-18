package defpackage;

/* renamed from: sH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7001sH1 implements PH1 {
    public final DB1 a;
    public final PI1 b;
    public final ID1 c;

    public C7001sH1(PI1 pi1, ID1 id1, DB1 db1) {
        this.b = pi1;
        this.c = id1;
        this.a = db1;
    }

    @Override // defpackage.PH1
    public final void a(Object obj) {
        this.b.getClass();
        PI1.c(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.PH1
    public final boolean b(Object obj) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.PH1
    public final void c(Object obj, Object obj2) {
        UH1.t(this.b, obj, obj2);
    }

    @Override // defpackage.PH1
    public final int d(EE1 ee1) {
        this.b.getClass();
        return ee1.zzc.hashCode();
    }

    @Override // defpackage.PH1
    public final boolean e(EE1 ee1, Object obj) {
        this.b.getClass();
        return ee1.zzc.equals(((EE1) obj).zzc);
    }

    @Override // defpackage.PH1
    public final int f(EE1 ee1) {
        this.b.getClass();
        MI1 mi1 = ee1.zzc;
        int i = mi1.d;
        if (i != -1) {
            return i;
        }
        int iE = 0;
        for (int i2 = 0; i2 < mi1.a; i2++) {
            int i3 = mi1.b[i2] >>> 3;
            C8129yC1 c8129yC1 = (C8129yC1) mi1.c[i2];
            int iR = C5271jD1.r(8);
            int iR2 = C5271jD1.r(i3) + C5271jD1.r(16);
            int iR3 = C5271jD1.r(24);
            int iH = c8129yC1.h();
            iE += iR + iR + iR2 + F91.E(iH, iH, iR3);
        }
        mi1.d = iE;
        return iE;
    }

    @Override // defpackage.PH1
    public final void g(Object obj, byte[] bArr, int i, int i2, C0374Eo c0374Eo) {
        EE1 ee1 = (EE1) obj;
        if (ee1.zzc == MI1.f) {
            ee1.zzc = MI1.b();
        }
        throw RI1.h(obj);
    }

    @Override // defpackage.PH1
    public final void h(Object obj, C6273oT0 c6273oT0) {
        this.c.getClass();
        AbstractC1705Vq.p(obj);
        throw null;
    }

    @Override // defpackage.PH1
    public final EE1 zze() {
        DB1 db1 = this.a;
        return db1 instanceof EE1 ? (EE1) ((EE1) db1).m(4) : ((AbstractC5847mE1) ((EE1) db1).m(5)).e();
    }
}
