package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Qf */
/* loaded from: classes2.dex */
public final class C2882Qf extends AbstractC3219e {

    /* renamed from: g */
    private static volatile C2882Qf[] f22013g;

    /* renamed from: b */
    public String f22014b;

    /* renamed from: c */
    public String f22015c;

    /* renamed from: d */
    public C2832Of[] f22016d;

    /* renamed from: e */
    public C2882Qf f22017e;

    /* renamed from: f */
    public C2882Qf[] f22018f;

    public C2882Qf() {
        m14849b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        c3141b.m15648b(1, this.f22014b);
        if (!this.f22015c.equals("")) {
            c3141b.m15648b(2, this.f22015c);
        }
        C2832Of[] c2832OfArr = this.f22016d;
        int i = 0;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f22016d;
                if (i2 >= c2832OfArr2.length) {
                    break;
                }
                C2832Of c2832Of = c2832OfArr2[i2];
                if (c2832Of != null) {
                    c3141b.m15647b(3, c2832Of);
                }
                i2++;
            }
        }
        C2882Qf c2882Qf = this.f22017e;
        if (c2882Qf != null) {
            c3141b.m15647b(4, c2882Qf);
        }
        C2882Qf[] c2882QfArr = this.f22018f;
        if (c2882QfArr == null || c2882QfArr.length <= 0) {
            return;
        }
        while (true) {
            C2882Qf[] c2882QfArr2 = this.f22018f;
            if (i >= c2882QfArr2.length) {
                return;
            }
            C2882Qf c2882Qf2 = c2882QfArr2[i];
            if (c2882Qf2 != null) {
                c3141b.m15647b(5, c2882Qf2);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C2882Qf m14849b() {
        this.f22014b = "";
        this.f22015c = "";
        this.f22016d = C2832Of.m14701c();
        this.f22017e = null;
        if (f22013g == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f22013g == null) {
                        f22013g = new C2882Qf[0];
                    }
                } finally {
                }
            }
        }
        this.f22018f = f22013g;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15631a = C3141b.m15631a(1, this.f22014b);
        if (!this.f22015c.equals("")) {
            iM15631a += C3141b.m15631a(2, this.f22015c);
        }
        C2832Of[] c2832OfArr = this.f22016d;
        int i = 0;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i2 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f22016d;
                if (i2 >= c2832OfArr2.length) {
                    break;
                }
                C2832Of c2832Of = c2832OfArr2[i2];
                if (c2832Of != null) {
                    iM15631a = C3141b.m15630a(3, c2832Of) + iM15631a;
                }
                i2++;
            }
        }
        C2882Qf c2882Qf = this.f22017e;
        if (c2882Qf != null) {
            iM15631a += C3141b.m15630a(4, c2882Qf);
        }
        C2882Qf[] c2882QfArr = this.f22018f;
        if (c2882QfArr != null && c2882QfArr.length > 0) {
            while (true) {
                C2882Qf[] c2882QfArr2 = this.f22018f;
                if (i >= c2882QfArr2.length) {
                    break;
                }
                C2882Qf c2882Qf2 = c2882QfArr2[i];
                if (c2882Qf2 != null) {
                    iM15631a = C3141b.m15630a(5, c2882Qf2) + iM15631a;
                }
                i++;
            }
        }
        return iM15631a;
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
                this.f22014b = c3115a.m15593k();
            } else if (iM15594l == 18) {
                this.f22015c = c3115a.m15593k();
            } else if (iM15594l == 26) {
                int iM15952a = C3271g.m15952a(c3115a, 26);
                C2832Of[] c2832OfArr = this.f22016d;
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
                this.f22016d = c2832OfArr2;
            } else if (iM15594l == 34) {
                if (this.f22017e == null) {
                    this.f22017e = new C2882Qf();
                }
                c3115a.m15577a(this.f22017e);
            } else if (iM15594l != 42) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a2 = C3271g.m15952a(c3115a, 42);
                C2882Qf[] c2882QfArr = this.f22018f;
                int length2 = c2882QfArr == null ? 0 : c2882QfArr.length;
                int i2 = iM15952a2 + length2;
                C2882Qf[] c2882QfArr2 = new C2882Qf[i2];
                if (length2 != 0) {
                    System.arraycopy(c2882QfArr, 0, c2882QfArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C2882Qf c2882Qf = new C2882Qf();
                    c2882QfArr2[length2] = c2882Qf;
                    c3115a.m15577a(c2882Qf);
                    c3115a.m15594l();
                    length2++;
                }
                C2882Qf c2882Qf2 = new C2882Qf();
                c2882QfArr2[length2] = c2882Qf2;
                c3115a.m15577a(c2882Qf2);
                this.f22018f = c2882QfArr2;
            }
        }
        return this;
    }
}
