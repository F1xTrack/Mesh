package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Pf extends AbstractC2714e {
    private static volatile Pf[] h;
    public String b;
    public int c;
    public long d;
    public String e;
    public int f;
    public Of[] g;

    public Pf() {
        b();
    }

    public static Pf[] c() {
        if (h == null) {
            synchronized (C2664c.a) {
                try {
                    if (h == null) {
                        h = new Pf[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        c2639b.b(1, this.b);
        c2639b.e(2, this.c);
        c2639b.d(3, this.d);
        if (!this.e.equals("")) {
            c2639b.b(4, this.e);
        }
        int i = this.f;
        if (i != 0) {
            c2639b.f(5, i);
        }
        Of[] ofArr = this.g;
        if (ofArr == null || ofArr.length <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            Of[] ofArr2 = this.g;
            if (i2 >= ofArr2.length) {
                return;
            }
            Of of = ofArr2[i2];
            if (of != null) {
                c2639b.b(6, of);
            }
            i2++;
        }
    }

    public Pf b() {
        this.b = "";
        this.c = 0;
        this.d = 0L;
        this.e = "";
        this.f = 0;
        this.g = Of.c();
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iB = C2639b.b(2, this.c) + C2639b.a(1, this.b);
        long j = this.d;
        int iA = C2639b.a((j >> 63) ^ (j << 1)) + C2639b.c(3) + iB;
        if (!this.e.equals("")) {
            iA += C2639b.a(4, this.e);
        }
        int i = this.f;
        if (i != 0) {
            iA += C2639b.c(5, i);
        }
        Of[] ofArr = this.g;
        if (ofArr != null && ofArr.length > 0) {
            int i2 = 0;
            while (true) {
                Of[] ofArr2 = this.g;
                if (i2 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i2];
                if (of != null) {
                    iA = C2639b.a(6, of) + iA;
                }
                i2++;
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
            } else if (iL == 16) {
                this.c = c2614a.j();
            } else if (iL == 24) {
                long jI = c2614a.i();
                this.d = (-(jI & 1)) ^ (jI >>> 1);
            } else if (iL == 34) {
                this.e = c2614a.k();
            } else if (iL == 40) {
                this.f = c2614a.h();
            } else if (iL != 50) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA = C2764g.a(c2614a, 50);
                Of[] ofArr = this.g;
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
                this.g = ofArr2;
            }
        }
        return this;
    }
}
