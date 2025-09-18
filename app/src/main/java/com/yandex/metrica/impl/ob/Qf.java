package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Qf extends AbstractC2714e {
    private static volatile Qf[] g;
    public String b;
    public String c;
    public Of[] d;
    public Qf e;
    public Qf[] f;

    public Qf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        c2639b.b(1, this.b);
        if (!this.c.equals("")) {
            c2639b.b(2, this.c);
        }
        Of[] ofArr = this.d;
        int i = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                Of[] ofArr2 = this.d;
                if (i2 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i2];
                if (of != null) {
                    c2639b.b(3, of);
                }
                i2++;
            }
        }
        Qf qf = this.e;
        if (qf != null) {
            c2639b.b(4, qf);
        }
        Qf[] qfArr = this.f;
        if (qfArr == null || qfArr.length <= 0) {
            return;
        }
        while (true) {
            Qf[] qfArr2 = this.f;
            if (i >= qfArr2.length) {
                return;
            }
            Qf qf2 = qfArr2[i];
            if (qf2 != null) {
                c2639b.b(5, qf2);
            }
            i++;
        }
    }

    public Qf b() {
        this.b = "";
        this.c = "";
        this.d = Of.c();
        this.e = null;
        if (g == null) {
            synchronized (C2664c.a) {
                try {
                    if (g == null) {
                        g = new Qf[0];
                    }
                } finally {
                }
            }
        }
        this.f = g;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA = C2639b.a(1, this.b);
        if (!this.c.equals("")) {
            iA += C2639b.a(2, this.c);
        }
        Of[] ofArr = this.d;
        int i = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                Of[] ofArr2 = this.d;
                if (i2 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i2];
                if (of != null) {
                    iA = C2639b.a(3, of) + iA;
                }
                i2++;
            }
        }
        Qf qf = this.e;
        if (qf != null) {
            iA += C2639b.a(4, qf);
        }
        Qf[] qfArr = this.f;
        if (qfArr != null && qfArr.length > 0) {
            while (true) {
                Qf[] qfArr2 = this.f;
                if (i >= qfArr2.length) {
                    break;
                }
                Qf qf2 = qfArr2[i];
                if (qf2 != null) {
                    iA = C2639b.a(5, qf2) + iA;
                }
                i++;
            }
        }
        return iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.b = c2614a.k();
            } else if (iL == 18) {
                this.c = c2614a.k();
            } else if (iL == 26) {
                int iA = C2764g.a(c2614a, 26);
                Of[] ofArr = this.d;
                int length = ofArr == null ? 0 : ofArr.length;
                int i = iA + length;
                Of[] ofArr2 = new Of[i];
                if (length != 0) {
                    System.arraycopy(ofArr, 0, ofArr2, 0, length);
                }
                while (length < i - 1) {
                    Of of = new Of();
                    ofArr2[length] = of;
                    c2614a.a(of);
                    c2614a.l();
                    length++;
                }
                Of of2 = new Of();
                ofArr2[length] = of2;
                c2614a.a(of2);
                this.d = ofArr2;
            } else if (iL == 34) {
                if (this.e == null) {
                    this.e = new Qf();
                }
                c2614a.a(this.e);
            } else if (iL != 42) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA2 = C2764g.a(c2614a, 42);
                Qf[] qfArr = this.f;
                int length2 = qfArr == null ? 0 : qfArr.length;
                int i2 = iA2 + length2;
                Qf[] qfArr2 = new Qf[i2];
                if (length2 != 0) {
                    System.arraycopy(qfArr, 0, qfArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    Qf qf = new Qf();
                    qfArr2[length2] = qf;
                    c2614a.a(qf);
                    c2614a.l();
                    length2++;
                }
                Qf qf2 = new Qf();
                qfArr2[length2] = qf2;
                c2614a.a(qf2);
                this.f = qfArr2;
            }
        }
        return this;
    }
}
