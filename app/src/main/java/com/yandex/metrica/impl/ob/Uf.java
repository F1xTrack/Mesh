package com.yandex.metrica.impl.ob;

import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class Uf extends AbstractC2714e {
    public b[] b;
    public a[] c;

    public Uf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        b[] bVarArr = this.b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    c2639b.b(1, bVar);
                }
                i2++;
            }
        }
        a[] aVarArr = this.c;
        if (aVarArr == null || aVarArr.length <= 0) {
            return;
        }
        while (true) {
            a[] aVarArr2 = this.c;
            if (i >= aVarArr2.length) {
                return;
            }
            a aVar = aVarArr2[i];
            if (aVar != null) {
                c2639b.b(2, aVar);
            }
            i++;
        }
    }

    public Uf b() {
        this.b = b.c();
        this.c = a.c();
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA;
        b[] bVarArr = this.b;
        int i = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i2 = 0;
            iA = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i2];
                if (bVar != null) {
                    iA += C2639b.a(1, bVar);
                }
                i2++;
            }
        } else {
            iA = 0;
        }
        a[] aVarArr = this.c;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.c;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    iA = C2639b.a(2, aVar) + iA;
                }
                i++;
            }
        }
        return iA;
    }

    public static final class a extends AbstractC2714e {
        private static volatile a[] i;
        public long b;
        public long c;
        public Tf[] d;
        public Wf[] e;
        public long f;
        public int g;
        public int h;

        public a() {
            b();
        }

        public static a[] c() {
            if (i == null) {
                synchronized (C2664c.a) {
                    try {
                        if (i == null) {
                            i = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return i;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.e(1, this.b);
            c2639b.e(2, this.c);
            Tf[] tfArr = this.d;
            int i2 = 0;
            if (tfArr != null && tfArr.length > 0) {
                int i3 = 0;
                while (true) {
                    Tf[] tfArr2 = this.d;
                    if (i3 >= tfArr2.length) {
                        break;
                    }
                    Tf tf = tfArr2[i3];
                    if (tf != null) {
                        c2639b.b(3, tf);
                    }
                    i3++;
                }
            }
            Wf[] wfArr = this.e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    Wf[] wfArr2 = this.e;
                    if (i2 >= wfArr2.length) {
                        break;
                    }
                    Wf wf = wfArr2[i2];
                    if (wf != null) {
                        c2639b.b(4, wf);
                    }
                    i2++;
                }
            }
            long j = this.f;
            if (j != 0) {
                c2639b.e(5, j);
            }
            int i4 = this.g;
            if (i4 != 0) {
                c2639b.d(6, i4);
            }
            int i5 = this.h;
            if (i5 != 0) {
                c2639b.d(7, i5);
            }
        }

        public a b() {
            this.b = 0L;
            this.c = 0L;
            this.d = Tf.c();
            this.e = Wf.c();
            this.f = 0L;
            this.g = 0;
            this.h = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iB = C2639b.b(2, this.c) + C2639b.b(1, this.b);
            Tf[] tfArr = this.d;
            int i2 = 0;
            if (tfArr != null && tfArr.length > 0) {
                int i3 = 0;
                while (true) {
                    Tf[] tfArr2 = this.d;
                    if (i3 >= tfArr2.length) {
                        break;
                    }
                    Tf tf = tfArr2[i3];
                    if (tf != null) {
                        iB = C2639b.a(3, tf) + iB;
                    }
                    i3++;
                }
            }
            Wf[] wfArr = this.e;
            if (wfArr != null && wfArr.length > 0) {
                while (true) {
                    Wf[] wfArr2 = this.e;
                    if (i2 >= wfArr2.length) {
                        break;
                    }
                    Wf wf = wfArr2[i2];
                    if (wf != null) {
                        iB = C2639b.a(4, wf) + iB;
                    }
                    i2++;
                }
            }
            long j = this.f;
            if (j != 0) {
                iB += C2639b.b(5, j);
            }
            int i4 = this.g;
            if (i4 != 0) {
                iB += C2639b.a(6, i4);
            }
            int i5 = this.h;
            return i5 != 0 ? iB + C2639b.a(7, i5) : iB;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    this.b = c2614a.i();
                } else if (iL == 16) {
                    this.c = c2614a.i();
                } else if (iL == 26) {
                    int iA = C2764g.a(c2614a, 26);
                    Tf[] tfArr = this.d;
                    int length = tfArr == null ? 0 : tfArr.length;
                    int i2 = iA + length;
                    Tf[] tfArr2 = new Tf[i2];
                    if (length != 0) {
                        System.arraycopy(tfArr, 0, tfArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        Tf tf = new Tf();
                        tfArr2[length] = tf;
                        c2614a.a(tf);
                        c2614a.l();
                        length++;
                    }
                    Tf tf2 = new Tf();
                    tfArr2[length] = tf2;
                    c2614a.a(tf2);
                    this.d = tfArr2;
                } else if (iL == 34) {
                    int iA2 = C2764g.a(c2614a, 34);
                    Wf[] wfArr = this.e;
                    int length2 = wfArr == null ? 0 : wfArr.length;
                    int i3 = iA2 + length2;
                    Wf[] wfArr2 = new Wf[i3];
                    if (length2 != 0) {
                        System.arraycopy(wfArr, 0, wfArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        Wf wf = new Wf();
                        wfArr2[length2] = wf;
                        c2614a.a(wf);
                        c2614a.l();
                        length2++;
                    }
                    Wf wf2 = new Wf();
                    wfArr2[length2] = wf2;
                    c2614a.a(wf2);
                    this.e = wfArr2;
                } else if (iL == 40) {
                    this.f = c2614a.i();
                } else if (iL == 48) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                        this.g = iH;
                    }
                } else if (iL != 56) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iH2 = c2614a.h();
                    if (iH2 == 0 || iH2 == 1 || iH2 == 2 || iH2 == 3) {
                        this.h = iH2;
                    }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                int iA = C2764g.a(c2614a, 10);
                b[] bVarArr = this.b;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i = iA + length;
                b[] bVarArr2 = new b[i];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i - 1) {
                    b bVar = new b();
                    bVarArr2[length] = bVar;
                    c2614a.a(bVar);
                    c2614a.l();
                    length++;
                }
                b bVar2 = new b();
                bVarArr2[length] = bVar2;
                c2614a.a(bVar2);
                this.b = bVarArr2;
            } else if (iL != 18) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iA2 = C2764g.a(c2614a, 18);
                a[] aVarArr = this.c;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = iA2 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    c2614a.a(aVar);
                    c2614a.l();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                c2614a.a(aVar2);
                this.c = aVarArr2;
            }
        }
        return this;
    }

    public static final class b extends AbstractC2714e {
        private static volatile b[] o;
        public long b;
        public long c;
        public long d;
        public double e;
        public double f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public long m;
        public int n;

        public b() {
            b();
        }

        public static b[] c() {
            if (o == null) {
                synchronized (C2664c.a) {
                    try {
                        if (o == null) {
                            o = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return o;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.e(1, this.b);
            c2639b.e(2, this.c);
            long j = this.d;
            if (j != 0) {
                c2639b.e(3, j);
            }
            c2639b.b(4, this.e);
            c2639b.b(5, this.f);
            int i = this.g;
            if (i != 0) {
                c2639b.f(6, i);
            }
            int i2 = this.h;
            if (i2 != 0) {
                c2639b.f(7, i2);
            }
            int i3 = this.i;
            if (i3 != 0) {
                c2639b.f(8, i3);
            }
            int i4 = this.j;
            if (i4 != 0) {
                c2639b.d(9, i4);
            }
            int i5 = this.k;
            if (i5 != 0) {
                c2639b.d(10, i5);
            }
            int i6 = this.l;
            if (i6 != 0) {
                c2639b.d(11, i6);
            }
            long j2 = this.m;
            if (j2 != 0) {
                c2639b.e(12, j2);
            }
            int i7 = this.n;
            if (i7 != 0) {
                c2639b.d(13, i7);
            }
        }

        public b b() {
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0L;
            this.n = 0;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iB = C2639b.b(2, this.c) + C2639b.b(1, this.b);
            long j = this.d;
            if (j != 0) {
                iB += C2639b.b(3, j);
            }
            int iA = C2639b.a(5, this.f) + C2639b.a(4, this.e) + iB;
            int i = this.g;
            if (i != 0) {
                iA += C2639b.c(6, i);
            }
            int i2 = this.h;
            if (i2 != 0) {
                iA += C2639b.c(7, i2);
            }
            int i3 = this.i;
            if (i3 != 0) {
                iA += C2639b.c(8, i3);
            }
            int i4 = this.j;
            if (i4 != 0) {
                iA += C2639b.a(9, i4);
            }
            int i5 = this.k;
            if (i5 != 0) {
                iA += C2639b.a(10, i5);
            }
            int i6 = this.l;
            if (i6 != 0) {
                iA += C2639b.a(11, i6);
            }
            long j2 = this.m;
            if (j2 != 0) {
                iA += C2639b.b(12, j2);
            }
            int i7 = this.n;
            return i7 != 0 ? iA + C2639b.a(13, i7) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.b = c2614a.i();
                        break;
                    case 16:
                        this.c = c2614a.i();
                        break;
                    case 24:
                        this.d = c2614a.i();
                        break;
                    case 33:
                        this.e = Double.longBitsToDouble(c2614a.g());
                        break;
                    case 41:
                        this.f = Double.longBitsToDouble(c2614a.g());
                        break;
                    case 48:
                        this.g = c2614a.h();
                        break;
                    case 56:
                        this.h = c2614a.h();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.i = c2614a.h();
                        break;
                    case 72:
                        this.j = c2614a.h();
                        break;
                    case 80:
                        int iH = c2614a.h();
                        if (iH != 0 && iH != 1 && iH != 2 && iH != 3) {
                            break;
                        } else {
                            this.k = iH;
                            break;
                        }
                        break;
                    case 88:
                        int iH2 = c2614a.h();
                        if (iH2 != 0 && iH2 != 1 && iH2 != 2 && iH2 != 3) {
                            break;
                        } else {
                            this.l = iH2;
                            break;
                        }
                        break;
                    case 96:
                        this.m = c2614a.i();
                        break;
                    case 104:
                        int iH3 = c2614a.h();
                        if (iH3 != 0 && iH3 != 1 && iH3 != 2 && iH3 != 3 && iH3 != 4) {
                            break;
                        } else {
                            this.n = iH3;
                            break;
                        }
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
}
