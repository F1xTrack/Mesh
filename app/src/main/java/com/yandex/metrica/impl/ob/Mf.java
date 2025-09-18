package com.yandex.metrica.impl.ob;

import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Mf extends AbstractC2714e {
    private static byte[] m;
    private static volatile boolean n;
    public Qf b;
    public If c;
    public String d;
    public int e;
    public Of[] f;
    public String g;
    public int h;
    public a i;
    public byte[] j;
    public byte[] k;
    public Kf[] l;

    public static final class a extends AbstractC2714e {
        public String b;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
        }

        public a b() {
            this.b = "";
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(1, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 10) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.k();
                }
            }
            return this;
        }
    }

    public Mf() {
        if (!n) {
            synchronized (C2664c.a) {
                try {
                    if (!n) {
                        m = C2664c.a("JVM");
                        n = true;
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
        if (!this.g.equals("")) {
            c2639b.b(6, this.g);
        }
        int i4 = this.h;
        if (i4 != 0) {
            c2639b.d(7, i4);
        }
        a aVar = this.i;
        if (aVar != null) {
            c2639b.b(8, aVar);
        }
        if (!Arrays.equals(this.j, m)) {
            c2639b.b(9, this.j);
        }
        if (!Arrays.equals(this.k, C2764g.d)) {
            c2639b.b(10, this.k);
        }
        Kf[] kfArr = this.l;
        if (kfArr == null || kfArr.length <= 0) {
            return;
        }
        while (true) {
            Kf[] kfArr2 = this.l;
            if (i2 >= kfArr2.length) {
                return;
            }
            Kf kf = kfArr2[i2];
            if (kf != null) {
                c2639b.b(11, kf);
            }
            i2++;
        }
    }

    public Mf b() {
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = -1;
        this.f = Of.c();
        this.g = "";
        this.h = 0;
        this.i = null;
        this.j = (byte[]) m.clone();
        this.k = C2764g.d;
        this.l = Kf.c();
        this.a = -1;
        return this;
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
        if (!this.g.equals("")) {
            iA += C2639b.a(6, this.g);
        }
        int i4 = this.h;
        if (i4 != 0) {
            iA += C2639b.a(7, i4);
        }
        a aVar = this.i;
        if (aVar != null) {
            iA += C2639b.a(8, aVar);
        }
        if (!Arrays.equals(this.j, m)) {
            iA += C2639b.a(9, this.j);
        }
        if (!Arrays.equals(this.k, C2764g.d)) {
            iA += C2639b.a(10, this.k);
        }
        Kf[] kfArr = this.l;
        if (kfArr != null && kfArr.length > 0) {
            while (true) {
                Kf[] kfArr2 = this.l;
                if (i >= kfArr2.length) {
                    break;
                }
                Kf kf = kfArr2[i];
                if (kf != null) {
                    iA = C2639b.a(11, kf) + iA;
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
                case 50:
                    this.g = c2614a.k();
                    break;
                case 56:
                    int iH2 = c2614a.h();
                    if (iH2 != 0 && iH2 != 1) {
                        break;
                    } else {
                        this.h = iH2;
                        break;
                    }
                case 66:
                    if (this.i == null) {
                        this.i = new a();
                    }
                    c2614a.a(this.i);
                    break;
                case 74:
                    this.j = c2614a.d();
                    break;
                case 82:
                    this.k = c2614a.d();
                    break;
                case 90:
                    int iA2 = C2764g.a(c2614a, 90);
                    Kf[] kfArr = this.l;
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
                    this.l = kfArr2;
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
