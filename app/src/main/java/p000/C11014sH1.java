package p000;

/* renamed from: sH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11014sH1 implements PH1 {

    /* renamed from: a */
    public final DB1 f42357a;

    /* renamed from: b */
    public final PI1 f42358b;

    /* renamed from: c */
    public final ID1 f42359c;

    public C11014sH1(PI1 pi1, ID1 id1, DB1 db1) {
        this.f42358b = pi1;
        this.f42359c = id1;
        this.f42357a = db1;
    }

    @Override // p000.PH1
    /* renamed from: a */
    public final void mo6286a(Object obj) {
        this.f42358b.getClass();
        PI1.m6299c(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.PH1
    /* renamed from: b */
    public final boolean mo6287b(Object obj) {
        this.f42359c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.PH1
    /* renamed from: c */
    public final void mo6288c(Object obj, Object obj2) {
        UH1.m7977t(this.f42358b, obj, obj2);
    }

    @Override // p000.PH1
    /* renamed from: d */
    public final int mo6289d(EE1 ee1) {
        this.f42358b.getClass();
        return ee1.zzc.hashCode();
    }

    @Override // p000.PH1
    /* renamed from: e */
    public final boolean mo6290e(EE1 ee1, Object obj) {
        this.f42358b.getClass();
        return ee1.zzc.equals(((EE1) obj).zzc);
    }

    @Override // p000.PH1
    /* renamed from: f */
    public final int mo6291f(EE1 ee1) {
        this.f42358b.getClass();
        MI1 mi1 = ee1.zzc;
        int i = mi1.f7086d;
        if (i != -1) {
            return i;
        }
        int iM2515E = 0;
        for (int i2 = 0; i2 < mi1.f7083a; i2++) {
            int i3 = mi1.f7084b[i2] >>> 3;
            C11769yC1 c11769yC1 = (C11769yC1) mi1.f7085c[i2];
            int iM21992r = C9854jD1.m21992r(8);
            int iM21992r2 = C9854jD1.m21992r(i3) + C9854jD1.m21992r(16);
            int iM21992r3 = C9854jD1.m21992r(24);
            int iMo23955h = c11769yC1.mo23955h();
            iM2515E += iM21992r + iM21992r + iM21992r2 + F91.m2515E(iMo23955h, iMo23955h, iM21992r3);
        }
        mi1.f7086d = iM2515E;
        return iM2515E;
    }

    @Override // p000.PH1
    /* renamed from: g */
    public final void mo6292g(Object obj, byte[] bArr, int i, int i2, C0303Eo c0303Eo) {
        EE1 ee1 = (EE1) obj;
        if (ee1.zzc == MI1.f7082f) {
            ee1.zzc = MI1.m5297b();
        }
        throw RI1.m6944h(obj);
    }

    @Override // p000.PH1
    /* renamed from: h */
    public final void mo6293h(Object obj, C10525oT0 c10525oT0) {
        this.f42359c.getClass();
        AbstractC1374Vq.m8597p(obj);
        throw null;
    }

    @Override // p000.PH1
    public final EE1 zze() {
        DB1 db1 = this.f42357a;
        return db1 instanceof EE1 ? (EE1) ((EE1) db1).mo1649m(4) : ((AbstractC10240mE1) ((EE1) db1).mo1649m(5)).m22707e();
    }
}
