package com.yandex.metrica.impl.ob;

import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Zf extends AbstractC2714e {
    public int b;
    public double c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public a g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public c l;
    public b m;

    public Zf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        int i = this.b;
        if (i != 1) {
            c2639b.f(1, i);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            c2639b.b(2, this.c);
        }
        c2639b.b(3, this.d);
        byte[] bArr = this.e;
        byte[] bArr2 = C2764g.d;
        if (!Arrays.equals(bArr, bArr2)) {
            c2639b.b(4, this.e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            c2639b.b(5, this.f);
        }
        a aVar = this.g;
        if (aVar != null) {
            c2639b.b(6, aVar);
        }
        long j = this.h;
        if (j != 0) {
            c2639b.c(7, j);
        }
        boolean z = this.i;
        if (z) {
            c2639b.b(8, z);
        }
        int i2 = this.j;
        if (i2 != 0) {
            c2639b.d(9, i2);
        }
        int i3 = this.k;
        if (i3 != 1) {
            c2639b.d(10, i3);
        }
        c cVar = this.l;
        if (cVar != null) {
            c2639b.b(11, cVar);
        }
        b bVar = this.m;
        if (bVar != null) {
            c2639b.b(12, bVar);
        }
    }

    public Zf b() {
        this.b = 1;
        this.c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        byte[] bArr = C2764g.d;
        this.d = bArr;
        this.e = bArr;
        this.f = bArr;
        this.g = null;
        this.h = 0L;
        this.i = false;
        this.j = 0;
        this.k = 1;
        this.l = null;
        this.m = null;
        this.a = -1;
        return this;
    }

    public static final class b extends AbstractC2714e {
        public boolean b;
        public C0011b c;
        public a d;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            boolean z = this.b;
            if (z) {
                c2639b.b(1, z);
            }
            C0011b c0011b = this.c;
            if (c0011b != null) {
                c2639b.b(2, c0011b);
            }
            a aVar = this.d;
            if (aVar != null) {
                c2639b.b(3, aVar);
            }
        }

        public b b() {
            this.b = false;
            this.c = null;
            this.d = null;
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$b, reason: collision with other inner class name */
        public static final class C0011b extends AbstractC2714e {
            public int b;
            public int c;

            public C0011b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                int i = this.b;
                if (i != 0) {
                    c2639b.f(1, i);
                }
                int i2 = this.c;
                if (i2 != 0) {
                    c2639b.d(2, i2);
                }
            }

            public C0011b b() {
                this.b = 0;
                this.c = 0;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int i = this.b;
                int iC = i != 0 ? C2639b.c(1, i) : 0;
                int i2 = this.c;
                return i2 != 0 ? iC + C2639b.a(2, i2) : iC;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public AbstractC2714e a(C2614a c2614a) throws IOException {
                while (true) {
                    int iL = c2614a.l();
                    if (iL == 0) {
                        break;
                    }
                    if (iL == 8) {
                        this.b = c2614a.h();
                    } else if (iL != 16) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        int iH = c2614a.h();
                        if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                            this.c = iH;
                        }
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            boolean z = this.b;
            int iA = z ? C2639b.a(1, z) : 0;
            C0011b c0011b = this.c;
            if (c0011b != null) {
                iA += C2639b.a(2, c0011b);
            }
            a aVar = this.d;
            return aVar != null ? iA + C2639b.a(3, aVar) : iA;
        }

        public static final class a extends AbstractC2714e {
            public long b;
            public C0011b c;
            public int d;
            public byte[] e;

            public a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                long j = this.b;
                if (j != 0) {
                    c2639b.c(1, j);
                }
                C0011b c0011b = this.c;
                if (c0011b != null) {
                    c2639b.b(2, c0011b);
                }
                int i = this.d;
                if (i != 0) {
                    c2639b.f(3, i);
                }
                if (Arrays.equals(this.e, C2764g.d)) {
                    return;
                }
                c2639b.b(4, this.e);
            }

            public a b() {
                this.b = 0L;
                this.c = null;
                this.d = 0;
                this.e = C2764g.d;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                long j = this.b;
                int iA = j != 0 ? C2639b.a(1, j) : 0;
                C0011b c0011b = this.c;
                if (c0011b != null) {
                    iA += C2639b.a(2, c0011b);
                }
                int i = this.d;
                if (i != 0) {
                    iA += C2639b.c(3, i);
                }
                return !Arrays.equals(this.e, C2764g.d) ? iA + C2639b.a(4, this.e) : iA;
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
                    } else if (iL == 18) {
                        if (this.c == null) {
                            this.c = new C0011b();
                        }
                        c2614a.a(this.c);
                    } else if (iL == 24) {
                        this.d = c2614a.h();
                    } else if (iL != 34) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.e = c2614a.d();
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
                if (iL == 8) {
                    this.b = c2614a.c();
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new C0011b();
                    }
                    c2614a.a(this.c);
                } else if (iL != 26) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.d == null) {
                        this.d = new a();
                    }
                    c2614a.a(this.d);
                }
            }
            return this;
        }
    }

    public static final class a extends AbstractC2714e {
        public byte[] b;
        public byte[] c;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            if (Arrays.equals(this.c, bArr2)) {
                return;
            }
            c2639b.b(2, this.c);
        }

        public a b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = bArr;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            return !Arrays.equals(this.c, bArr2) ? iA + C2639b.a(2, this.c) : iA;
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
                    this.c = c2614a.d();
                }
            }
            return this;
        }
    }

    public static final class c extends AbstractC2714e {
        public byte[] b;
        public long c;
        public int d;
        public byte[] e;
        public long f;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            if (!Arrays.equals(bArr, bArr2)) {
                c2639b.b(1, this.b);
            }
            long j = this.c;
            if (j != 0) {
                c2639b.e(2, j);
            }
            int i = this.d;
            if (i != 0) {
                c2639b.d(3, i);
            }
            if (!Arrays.equals(this.e, bArr2)) {
                c2639b.b(4, this.e);
            }
            long j2 = this.f;
            if (j2 != 0) {
                c2639b.e(5, j2);
            }
        }

        public c b() {
            byte[] bArr = C2764g.d;
            this.b = bArr;
            this.c = 0L;
            this.d = 0;
            this.e = bArr;
            this.f = 0L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            byte[] bArr = this.b;
            byte[] bArr2 = C2764g.d;
            int iA = !Arrays.equals(bArr, bArr2) ? C2639b.a(1, this.b) : 0;
            long j = this.c;
            if (j != 0) {
                iA += C2639b.b(2, j);
            }
            int i = this.d;
            if (i != 0) {
                iA += C2639b.a(3, i);
            }
            if (!Arrays.equals(this.e, bArr2)) {
                iA += C2639b.a(4, this.e);
            }
            long j2 = this.f;
            return j2 != 0 ? iA + C2639b.b(5, j2) : iA;
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
                } else if (iL == 16) {
                    this.c = c2614a.i();
                } else if (iL == 24) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2) {
                        this.d = iH;
                    }
                } else if (iL == 34) {
                    this.e = c2614a.d();
                } else if (iL != 40) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.f = c2614a.i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int i = this.b;
        int iC = i != 1 ? C2639b.c(1, i) : 0;
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iC += C2639b.a(2, this.c);
        }
        int iA = C2639b.a(3, this.d) + iC;
        byte[] bArr = this.e;
        byte[] bArr2 = C2764g.d;
        if (!Arrays.equals(bArr, bArr2)) {
            iA += C2639b.a(4, this.e);
        }
        if (!Arrays.equals(this.f, bArr2)) {
            iA += C2639b.a(5, this.f);
        }
        a aVar = this.g;
        if (aVar != null) {
            iA += C2639b.a(6, aVar);
        }
        long j = this.h;
        if (j != 0) {
            iA += C2639b.a(7, j);
        }
        boolean z = this.i;
        if (z) {
            iA += C2639b.a(8, z);
        }
        int i2 = this.j;
        if (i2 != 0) {
            iA += C2639b.a(9, i2);
        }
        int i3 = this.k;
        if (i3 != 1) {
            iA += C2639b.a(10, i3);
        }
        c cVar = this.l;
        if (cVar != null) {
            iA += C2639b.a(11, cVar);
        }
        b bVar = this.m;
        return bVar != null ? iA + C2639b.a(12, bVar) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            switch (iL) {
                case 0:
                    break;
                case 8:
                    this.b = c2614a.h();
                    break;
                case 17:
                    this.c = Double.longBitsToDouble(c2614a.g());
                    break;
                case 26:
                    this.d = c2614a.d();
                    break;
                case 34:
                    this.e = c2614a.d();
                    break;
                case C4473c9.M /* 42 */:
                    this.f = c2614a.d();
                    break;
                case 50:
                    if (this.g == null) {
                        this.g = new a();
                    }
                    c2614a.a(this.g);
                    break;
                case 56:
                    this.h = c2614a.i();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    this.i = c2614a.c();
                    break;
                case 72:
                    int iH = c2614a.h();
                    if (iH != 0 && iH != 1 && iH != 2) {
                        break;
                    } else {
                        this.j = iH;
                        break;
                    }
                    break;
                case 80:
                    int iH2 = c2614a.h();
                    if (iH2 != 1 && iH2 != 2) {
                        break;
                    } else {
                        this.k = iH2;
                        break;
                    }
                    break;
                case 90:
                    if (this.l == null) {
                        this.l = new c();
                    }
                    c2614a.a(this.l);
                    break;
                case 98:
                    if (this.m == null) {
                        this.m = new b();
                    }
                    c2614a.a(this.m);
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
