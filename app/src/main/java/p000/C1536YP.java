package p000;

import java.io.IOException;

/* renamed from: YP */
/* loaded from: classes2.dex */
public final class C1536YP {

    /* renamed from: a */
    public int f14283a;

    /* renamed from: b */
    public int f14284b;

    /* renamed from: c */
    public int f14285c;

    /* renamed from: d */
    public final Object f14286d;

    /* renamed from: e */
    public Object f14287e;

    /* renamed from: f */
    public Object f14288f;

    /* renamed from: g */
    public Object f14289g;

    /* renamed from: h */
    public Object f14290h;

    /* renamed from: i */
    public Object f14291i;

    public C1536YP(C0974PT c0974pt, C6656q3 c6656q3, DN0 dn0) {
        O90.m5968f(c0974pt, "connectionPool");
        O90.m5968f(dn0, "call");
        this.f14286d = c0974pt;
        this.f14287e = c6656q3;
        this.f14288f = dn0;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0182  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.FN0 m9291a(int r13, boolean r14, boolean r15, int r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1536YP.m9291a(int, boolean, boolean, int, int):FN0");
    }

    /* renamed from: b */
    public boolean m9292b(D40 d40) {
        O90.m5968f(d40, "url");
        D40 d402 = ((C6656q3) this.f14287e).f40537i;
        return d40.f1832e == d402.f1832e && O90.m5963a(d40.f1831d, d402.f1831d);
    }

    /* renamed from: c */
    public void m9293c(IOException iOException) {
        O90.m5968f(iOException, "e");
        this.f14291i = null;
        if ((iOException instanceof C9710i51) && ((C9710i51) iOException).f28817a == 8) {
            this.f14283a++;
        } else if (iOException instanceof C6586ox) {
            this.f14284b++;
        } else {
            this.f14285c++;
        }
    }

    public C1536YP(C9315f11 c9315f11) {
        this.f14283a = 0;
        this.f14284b = 0;
        this.f14288f = null;
        this.f14289g = null;
        this.f14290h = null;
        this.f14291i = null;
        this.f14285c = 0;
        this.f14286d = c9315f11;
    }
}
