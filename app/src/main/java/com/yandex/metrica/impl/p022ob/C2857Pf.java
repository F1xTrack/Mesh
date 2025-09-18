package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Pf */
/* loaded from: classes2.dex */
public final class C2857Pf extends AbstractC3219e {

    /* renamed from: h */
    private static volatile C2857Pf[] f21954h;

    /* renamed from: b */
    public String f21955b;

    /* renamed from: c */
    public int f21956c;

    /* renamed from: d */
    public long f21957d;

    /* renamed from: e */
    public String f21958e;

    /* renamed from: f */
    public int f21959f;

    /* renamed from: g */
    public C2832Of[] f21960g;

    public C2857Pf() {
        m14788b();
    }

    /* renamed from: c */
    public static C2857Pf[] m14787c() {
        if (f21954h == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f21954h == null) {
                        f21954h = new C2857Pf[0];
                    }
                } finally {
                }
            }
        }
        return f21954h;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        c3141b.m15648b(1, this.f21955b);
        c3141b.m15657e(2, this.f21956c);
        c3141b.m15655d(3, this.f21957d);
        if (!this.f21958e.equals("")) {
            c3141b.m15648b(4, this.f21958e);
        }
        int i = this.f21959f;
        if (i != 0) {
            c3141b.m15659f(5, i);
        }
        C2832Of[] c2832OfArr = this.f21960g;
        if (c2832OfArr == null || c2832OfArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            C2832Of[] c2832OfArr2 = this.f21960g;
            if (i2 >= c2832OfArr2.length) {
                return;
            }
            C2832Of c2832Of = c2832OfArr2[i2];
            if (c2832Of != null) {
                c3141b.m15647b(6, c2832Of);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C2857Pf m14788b() {
        this.f21955b = "";
        this.f21956c = 0;
        this.f21957d = 0L;
        this.f21958e = "";
        this.f21959f = 0;
        this.f21960g = C2832Of.m14701c();
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15639b = C3141b.m15639b(2, this.f21956c) + C3141b.m15631a(1, this.f21955b);
        long j = this.f21957d;
        int iM15634a = C3141b.m15634a((j >> 63) ^ (j << 1)) + C3141b.m15641c(3) + iM15639b;
        if (!this.f21958e.equals("")) {
            iM15634a += C3141b.m15631a(4, this.f21958e);
        }
        int i = this.f21959f;
        if (i != 0) {
            iM15634a += C3141b.m15642c(5, i);
        }
        C2832Of[] c2832OfArr = this.f21960g;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f21960g;
                if (i2 >= c2832OfArr2.length) {
                    break;
                }
                C2832Of c2832Of = c2832OfArr2[i2];
                if (c2832Of != null) {
                    iM15634a = C3141b.m15630a(6, c2832Of) + iM15634a;
                }
                i2++;
            }
        }
        return iM15634a;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            if (iM15594l == 0) {
                break;
            }
            if (iM15594l == 10) {
                this.f21955b = c3115a.m15593k();
            } else if (iM15594l == 16) {
                this.f21956c = c3115a.m15592j();
            } else if (iM15594l == 24) {
                long jM15591i = c3115a.m15591i();
                this.f21957d = (-(jM15591i & 1)) ^ (jM15591i >>> 1);
            } else if (iM15594l == 34) {
                this.f21958e = c3115a.m15593k();
            } else if (iM15594l == 40) {
                this.f21959f = c3115a.m15590h();
            } else if (iM15594l != 50) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a = C3271g.m15952a(c3115a, 50);
                C2832Of[] c2832OfArr = this.f21960g;
                int length = c2832OfArr == null ? 0 : c2832OfArr.length;
                int i = iM15952a + length;
                C2832Of[] c2832OfArr2 = new C2832Of[i];
                if (length != 0) {
                    System.arraycopy(c2832OfArr, 0, c2832OfArr2, 0, length);
                }
                while (length < i - 1) {
                    C2832Of c2832Of = new C2832Of();
                    c2832OfArr2[length] = c2832Of;
                    c3115a.m15577a(c2832Of);
                    c3115a.m15594l();
                    length++;
                }
                C2832Of c2832Of2 = new C2832Of();
                c2832OfArr2[length] = c2832Of2;
                c3115a.m15577a(c2832Of2);
                this.f21960g = c2832OfArr2;
            }
        }
        return this;
    }
}
