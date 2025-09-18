package com.yandex.metrica.impl.ob;

import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Lf extends AbstractC2714e {
    private static byte[] l;
    private static volatile boolean m;
    public Qf b;
    public If c;
    public String d;
    public int e;
    public Of[] f;
    public int g;
    public a h;
    public byte[] i;
    public byte[] j;
    public Kf[] k;

    public Lf() {
        if (!m) {
            synchronized (C2664c.a) {
                try {
                    if (!m) {
                        l = C2664c.a("JVM");
                        m = true;
                    }
                } finally {
                }
            }
        }
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        Qf qf = this.b;
        if (qf != null) {
            c2639b.b(1, qf);
        }
        If r0 = this.c;
        if (r0 != null) {
            c2639b.b(2, r0);
        }
        if (!this.d.equals("")) {
            c2639b.b(3, this.d);
        }
        int i = this.e;
        if (i != -1) {
            c2639b.d(4, i);
        }
        Of[] ofArr = this.f;
        int i2 = 0;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                Of[] ofArr2 = this.f;
                if (i3 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i3];
                if (of != null) {
                    c2639b.b(5, of);
                }
                i3++;
            }
        }
        int i4 = this.g;
        if (i4 != 0) {
            c2639b.d(6, i4);
        }
        a aVar = this.h;
        if (aVar != null) {
            c2639b.b(7, aVar);
        }
        if (!Arrays.equals(this.i, l)) {
            c2639b.b(8, this.i);
        }
        if (!Arrays.equals(this.j, C2764g.d)) {
            c2639b.b(9, this.j);
        }
        Kf[] kfArr = this.k;
        if (kfArr == null || kfArr.length <= 0) {
            return;
        }
        while (true) {
            Kf[] kfArr2 = this.k;
            if (i2 >= kfArr2.length) {
                return;
            }
            Kf kf = kfArr2[i2];
            if (kf != null) {
                c2639b.b(10, kf);
            }
            i2++;
        }
    }

    public Lf b() {
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = -1;
        this.f = Of.c();
        this.g = 0;
        this.h = null;
        this.i = (byte[]) l.clone();
        this.j = C2764g.d;
        this.k = Kf.c();
        this.a = -1;
        return this;
    }

    public static final class a extends AbstractC2714e {
        public byte[] b;
        public Nf c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!Arrays.equals(this.b, C2764g.d)) {
                c2639b.b(1, this.b);
            }
            Nf nf = this.c;
            if (nf != null) {
                c2639b.b(2, nf);
            }
        }

        public a b() {
            this.b = C2764g.d;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !Arrays.equals(this.b, C2764g.d) ? C2639b.a(1, this.b) : 0;
            Nf nf = this.c;
            return nf != null ? iA + C2639b.a(2, nf) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    this.b = c2614a.d();
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new Nf();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        Qf qf = this.b;
        int i = 0;
        int iA = qf != null ? C2639b.a(1, qf) : 0;
        If r2 = this.c;
        if (r2 != null) {
            iA += C2639b.a(2, r2);
        }
        if (!this.d.equals("")) {
            iA += C2639b.a(3, this.d);
        }
        int i2 = this.e;
        if (i2 != -1) {
            iA += C2639b.a(4, i2);
        }
        Of[] ofArr = this.f;
        if (ofArr != null && ofArr.length > 0) {
            int i3 = 0;
            while (true) {
                Of[] ofArr2 = this.f;
                if (i3 >= ofArr2.length) {
                    break;
                }
                Of of = ofArr2[i3];
                if (of != null) {
                    iA = C2639b.a(5, of) + iA;
                }
                i3++;
            }
        }
        int i4 = this.g;
        if (i4 != 0) {
            iA += C2639b.a(6, i4);
        }
        a aVar = this.h;
        if (aVar != null) {
            iA += C2639b.a(7, aVar);
        }
        if (!Arrays.equals(this.i, l)) {
            iA += C2639b.a(8, this.i);
        }
        if (!Arrays.equals(this.j, C2764g.d)) {
            iA += C2639b.a(9, this.j);
        }
        Kf[] kfArr = this.k;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                Kf[] kfArr2 = this.k;
                if (i >= kfArr2.length) {
                    break;
                }
                Kf kf = kfArr2[i];
                if (kf != null) {
                    iA = C2639b.a(10, kf) + iA;
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
            switch (iL) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new Qf();
                    }
                    c2614a.a(this.b);
                    break;
                case 18:
                    if (this.c == null) {
                        this.c = new If();
                    }
                    c2614a.a(this.c);
                    break;
                case 26:
                    this.d = c2614a.k();
                    break;
                case 32:
                    int iH = c2614a.h();
                    if (iH != -1 && iH != 0 && iH != 1) {
                        break;
                    } else {
                        this.e = iH;
                        break;
                    }
                    break;
                case C4473c9.M /* 42 */:
                    int iA = C2764g.a(c2614a, 42);
                    Of[] ofArr = this.f;
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
                    this.f = ofArr2;
                    break;
                case 48:
                    int iH2 = c2614a.h();
                    if (iH2 != 0 && iH2 != 1) {
                        break;
                    } else {
                        this.g = iH2;
                        break;
                    }
                    break;
                case 58:
                    if (this.h == null) {
                        this.h = new a();
                    }
                    c2614a.a(this.h);
                    break;
                case 66:
                    this.i = c2614a.d();
                    break;
                case 74:
                    this.j = c2614a.d();
                    break;
                case 82:
                    int iA2 = C2764g.a(c2614a, 82);
                    Kf[] kfArr = this.k;
                    int length2 = kfArr == null ? 0 : kfArr.length;
                    int i2 = iA2 + length2;
                    Kf[] kfArr2 = new Kf[i2];
                    if (length2 != 0) {
                        System.arraycopy(kfArr, 0, kfArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        Kf kf = new Kf();
                        kfArr2[length2] = kf;
                        c2614a.a(kf);
                        c2614a.l();
                        length2++;
                    }
                    Kf kf2 = new Kf();
                    kfArr2[length2] = kf2;
                    c2614a.a(kf2);
                    this.k = kfArr2;
                    break;
                default:
                    if (!c2614a.f(iL)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
