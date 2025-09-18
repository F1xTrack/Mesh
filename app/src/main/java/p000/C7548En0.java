package p000;

/* renamed from: En0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7548En0 extends AbstractC0412GX {

    /* renamed from: e */
    public static final Object f2900e = new Object();

    /* renamed from: c */
    public final Object f2901c;

    /* renamed from: d */
    public final Object f2902d;

    public C7548En0(AbstractC7419Ca1 abstractC7419Ca1, Object obj, Object obj2) {
        super(abstractC7419Ca1);
        this.f2901c = obj;
        this.f2902d = obj2;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: b */
    public final int mo1245b(Object obj) {
        Object obj2;
        if (f2900e.equals(obj) && (obj2 = this.f2902d) != null) {
            obj = obj2;
        }
        return this.f3796b.mo1245b(obj);
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: f */
    public final C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        this.f3796b.mo1249f(i, c7315Aa1, z);
        if (AbstractC7485Dh1.m1812a(c7315Aa1.f257b, this.f2902d) && z) {
            c7315Aa1.f257b = f2900e;
        }
        return c7315Aa1;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: l */
    public final Object mo1255l(int i) {
        Object objMo1255l = this.f3796b.mo1255l(i);
        return AbstractC7485Dh1.m1812a(objMo1255l, this.f2902d) ? f2900e : objMo1255l;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: m */
    public final C7367Ba1 mo1256m(int i, C7367Ba1 c7367Ba1, long j) {
        this.f3796b.mo1256m(i, c7367Ba1, j);
        if (AbstractC7485Dh1.m1812a(c7367Ba1.f914a, this.f2901c)) {
            c7367Ba1.f914a = C7367Ba1.f912q;
        }
        return c7367Ba1;
    }
}
