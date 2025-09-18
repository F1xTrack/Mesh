package defpackage;

/* renamed from: En0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372En0 extends GX {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public C0372En0(AbstractC0178Ca1 abstractC0178Ca1, Object obj, Object obj2) {
        super(abstractC0178Ca1);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final int b(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        this.b.f(i, c0022Aa1, z);
        if (AbstractC0277Dh1.a(c0022Aa1.b, this.d) && z) {
            c0022Aa1.b = e;
        }
        return c0022Aa1;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return AbstractC0277Dh1.a(objL, this.d) ? e : objL;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final C0100Ba1 m(int i, C0100Ba1 c0100Ba1, long j) {
        this.b.m(i, c0100Ba1, j);
        if (AbstractC0277Dh1.a(c0100Ba1.a, this.c)) {
            c0100Ba1.a = C0100Ba1.q;
        }
        return c0100Ba1;
    }
}
