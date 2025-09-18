package com.yandex.metrica.impl.ob;

import com.facebook.crypto.mac.NativeMac;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kg */
/* loaded from: classes2.dex */
public final class C2880kg extends AbstractC2714e {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public long F;
    public long G;
    public boolean H;
    public m I;
    public j J;
    public int K;
    public int L;
    public v M;
    public u N;
    public u O;
    public u P;
    public s Q;
    public c R;
    public f S;
    public String[] T;
    public b U;
    public a V;
    public h W;
    public g X;
    public q Y;
    public String b;
    public long c;
    public String[] d;
    public String e;
    public String f;
    public String[] g;
    public String[] h;
    public String[] i;
    public String[] j;
    public d[] k;
    public i l;
    public k[] m;
    public y n;
    public p o;
    public n[] p;
    public String q;
    public String r;
    public String s;
    public boolean t;
    public String u;
    public String[] v;
    public r w;
    public boolean x;
    public l[] y;
    public o z;

    /* renamed from: com.yandex.metrica.impl.ob.kg$a */
    public static final class a extends AbstractC2714e {
        public b[] b;

        public a() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            b[] bVarArr = this.b;
            if (bVarArr == null || bVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i >= bVarArr2.length) {
                    return;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    c2639b.b(1, bVar);
                }
                i++;
            }
        }

        public a b() {
            this.b = b.c();
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$a */
        public static final class C0014a extends AbstractC2714e {
            public String b;

            public C0014a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                if (this.b.equals("")) {
                    return;
                }
                c2639b.b(1, this.b);
            }

            public C0014a b() {
                this.b = "";
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                if (this.b.equals("")) {
                    return 0;
                }
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

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$b */
        public static final class b extends AbstractC2714e {
            private static volatile b[] d;
            public String b;
            public C0014a c;

            public b() {
                b();
            }

            public static b[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new b[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                if (!this.b.equals("")) {
                    c2639b.b(1, this.b);
                }
                C0014a c0014a = this.c;
                if (c0014a != null) {
                    c2639b.b(2, c0014a);
                }
            }

            public b b() {
                this.b = "";
                this.c = null;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
                C0014a c0014a = this.c;
                return c0014a != null ? iA + C2639b.a(2, c0014a) : iA;
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
                    } else if (iL != 18) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        if (this.c == null) {
                            this.c = new C0014a();
                        }
                        c2614a.a(this.c);
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            b[] bVarArr = this.b;
            int i = 0;
            if (bVarArr == null || bVarArr.length <= 0) {
                return 0;
            }
            int iA = 0;
            while (true) {
                b[] bVarArr2 = this.b;
                if (i >= bVarArr2.length) {
                    return iA;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    iA = C2639b.a(1, bVar) + iA;
                }
                i++;
            }
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
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$j */
    public static final class j extends AbstractC2714e {
        public long b;

        public j() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
        }

        public j b() {
            this.b = 900L;
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
                if (iL != 8) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$n */
    public static final class n extends AbstractC2714e {
        private static volatile n[] h;
        public String b;
        public String c;
        public String d;
        public a[] e;
        public long f;
        public int[] g;

        public n() {
            b();
        }

        public static n[] c() {
            if (h == null) {
                synchronized (C2664c.a) {
                    try {
                        if (h == null) {
                            h = new n[0];
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
            c2639b.b(2, this.c);
            c2639b.b(3, this.d);
            a[] aVarArr = this.e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        c2639b.b(4, aVar);
                    }
                    i2++;
                }
            }
            c2639b.c(5, this.f);
            int[] iArr = this.g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.g;
                if (i >= iArr2.length) {
                    return;
                }
                c2639b.d(6, iArr2[i]);
                i++;
            }
        }

        public n b() {
            this.b = "";
            this.c = "";
            this.d = "";
            this.e = a.c();
            this.f = 0L;
            this.g = C2764g.a;
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$n$a */
        public static final class a extends AbstractC2714e {
            private static volatile a[] d;
            public String b;
            public String c;

            public a() {
                b();
            }

            public static a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.b(1, this.b);
                c2639b.b(2, this.c);
            }

            public a b() {
                this.b = "";
                this.c = "";
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                    } else if (iL != 18) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.c = c2614a.k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
            a[] aVarArr = this.e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        iA = C2639b.a(4, aVar) + iA;
                    }
                    i2++;
                }
            }
            int iA2 = C2639b.a(5, this.f) + iA;
            int[] iArr = this.g;
            if (iArr == null || iArr.length <= 0) {
                return iA2;
            }
            int iA3 = 0;
            while (true) {
                int[] iArr2 = this.g;
                if (i < iArr2.length) {
                    iA3 += C2639b.a(iArr2[i]);
                    i++;
                } else {
                    return iA2 + iA3 + iArr2.length;
                }
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
                    this.b = c2614a.k();
                } else if (iL == 18) {
                    this.c = c2614a.k();
                } else if (iL == 26) {
                    this.d = c2614a.k();
                } else if (iL == 34) {
                    int iA = C2764g.a(c2614a, 34);
                    a[] aVarArr = this.e;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = iA + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        c2614a.a(aVar);
                        c2614a.l();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    c2614a.a(aVar2);
                    this.e = aVarArr2;
                } else if (iL == 40) {
                    this.f = c2614a.i();
                } else if (iL == 48) {
                    int iA2 = C2764g.a(c2614a, 48);
                    int[] iArr = new int[iA2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iA2; i3++) {
                        if (i3 != 0) {
                            c2614a.l();
                        }
                        int iH = c2614a.h();
                        if (iH == 1 || iH == 2) {
                            iArr[i2] = iH;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == iA2) {
                            this.g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i2];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.g = iArr3;
                        }
                    }
                } else if (iL != 50) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iC = c2614a.c(c2614a.h());
                    int iB = c2614a.b();
                    int i4 = 0;
                    while (c2614a.a() > 0) {
                        int iH2 = c2614a.h();
                        if (iH2 == 1 || iH2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        c2614a.e(iB);
                        int[] iArr4 = this.g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i4 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c2614a.a() > 0) {
                            int iH3 = c2614a.h();
                            if (iH3 == 1 || iH3 == 2) {
                                iArr5[length3] = iH3;
                                length3++;
                            }
                        }
                        this.g = iArr5;
                    }
                    c2614a.b(iC);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$r */
    public static final class r extends AbstractC2714e {
        public long b;

        public r() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
        }

        public r b() {
            this.b = 18000000L;
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
                if (iL != 8) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$y */
    public static final class y extends AbstractC2714e {
        public long b;
        public boolean c;
        public a[] d;

        public y() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
            c2639b.b(2, this.c);
            a[] aVarArr = this.d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.d;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c2639b.b(5, aVar);
                }
                i++;
            }
        }

        public y b() {
            this.b = 60000L;
            this.c = false;
            this.d = a.c();
            this.a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$y$a */
        public static final class a extends AbstractC2714e {
            private static volatile a[] d;
            public long b;
            public long c;

            public a() {
                b();
            }

            public static a[] c() {
                if (d == null) {
                    synchronized (C2664c.a) {
                        try {
                            if (d == null) {
                                d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return d;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.c(1, this.b);
                c2639b.c(2, this.c);
            }

            public a b() {
                this.b = 0L;
                this.c = 0L;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                    } else if (iL != 16) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        this.c = c2614a.i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
            a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iA = C2639b.a(5, aVar) + iA;
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
                if (iL == 8) {
                    this.b = c2614a.i();
                } else if (iL == 16) {
                    this.c = c2614a.c();
                } else if (iL != 42) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 42);
                    a[] aVarArr = this.d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = iA + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        c2614a.a(aVar);
                        c2614a.l();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    c2614a.a(aVar2);
                    this.d = aVarArr2;
                }
            }
            return this;
        }
    }

    public C2880kg() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        if (!this.b.equals("")) {
            c2639b.b(1, this.b);
        }
        c2639b.c(3, this.c);
        String[] strArr = this.d;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    c2639b.b(4, str);
                }
                i3++;
            }
        }
        if (!this.e.equals("")) {
            c2639b.b(5, this.e);
        }
        if (!this.f.equals("")) {
            c2639b.b(6, this.f);
        }
        String[] strArr3 = this.g;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.g;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    c2639b.b(7, str2);
                }
                i4++;
            }
        }
        String[] strArr5 = this.h;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.h;
                if (i5 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i5];
                if (str3 != null) {
                    c2639b.b(8, str3);
                }
                i5++;
            }
        }
        String[] strArr7 = this.i;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.i;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    c2639b.b(9, str4);
                }
                i6++;
            }
        }
        i iVar = this.l;
        if (iVar != null) {
            c2639b.b(10, iVar);
        }
        k[] kVarArr = this.m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                k[] kVarArr2 = this.m;
                if (i7 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i7];
                if (kVar != null) {
                    c2639b.b(11, kVar);
                }
                i7++;
            }
        }
        y yVar = this.n;
        if (yVar != null) {
            c2639b.b(12, yVar);
        }
        p pVar = this.o;
        if (pVar != null) {
            c2639b.b(13, pVar);
        }
        n[] nVarArr = this.p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i8 = 0;
            while (true) {
                n[] nVarArr2 = this.p;
                if (i8 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i8];
                if (nVar != null) {
                    c2639b.b(14, nVar);
                }
                i8++;
            }
        }
        if (!this.q.equals("")) {
            c2639b.b(15, this.q);
        }
        if (!this.r.equals("")) {
            c2639b.b(16, this.r);
        }
        c2639b.b(17, this.t);
        if (!this.u.equals("")) {
            c2639b.b(19, this.u);
        }
        String[] strArr9 = this.v;
        if (strArr9 != null && strArr9.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr10 = this.v;
                if (i9 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i9];
                if (str5 != null) {
                    c2639b.b(20, str5);
                }
                i9++;
            }
        }
        r rVar = this.w;
        if (rVar != null) {
            c2639b.b(21, rVar);
        }
        boolean z = this.x;
        if (z) {
            c2639b.b(22, z);
        }
        l[] lVarArr = this.y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                l[] lVarArr2 = this.y;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i10];
                if (lVar != null) {
                    c2639b.b(23, lVar);
                }
                i10++;
            }
        }
        o oVar = this.z;
        if (oVar != null) {
            c2639b.b(24, oVar);
        }
        if (!this.A.equals("")) {
            c2639b.b(25, this.A);
        }
        if (!this.B.equals("")) {
            c2639b.b(26, this.B);
        }
        if (!this.D.equals("")) {
            c2639b.b(27, this.D);
        }
        c2639b.c(28, this.F);
        c2639b.c(29, this.G);
        boolean z2 = this.H;
        if (z2) {
            c2639b.b(30, z2);
        }
        if (!this.C.equals("")) {
            c2639b.b(31, this.C);
        }
        m mVar = this.I;
        if (mVar != null) {
            c2639b.b(32, mVar);
        }
        j jVar = this.J;
        if (jVar != null) {
            c2639b.b(33, jVar);
        }
        c2639b.d(35, this.K);
        c2639b.d(36, this.L);
        v vVar = this.M;
        if (vVar != null) {
            c2639b.b(37, vVar);
        }
        u uVar = this.N;
        if (uVar != null) {
            c2639b.b(38, uVar);
        }
        u uVar2 = this.O;
        if (uVar2 != null) {
            c2639b.b(39, uVar2);
        }
        s sVar = this.Q;
        if (sVar != null) {
            c2639b.b(41, sVar);
        }
        c cVar = this.R;
        if (cVar != null) {
            c2639b.b(42, cVar);
        }
        u uVar3 = this.P;
        if (uVar3 != null) {
            c2639b.b(43, uVar3);
        }
        if (!this.s.equals("")) {
            c2639b.b(44, this.s);
        }
        f fVar = this.S;
        if (fVar != null) {
            c2639b.b(45, fVar);
        }
        String[] strArr11 = this.j;
        if (strArr11 != null && strArr11.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr12 = this.j;
                if (i11 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i11];
                if (str6 != null) {
                    c2639b.b(46, str6);
                }
                i11++;
            }
        }
        String[] strArr13 = this.T;
        if (strArr13 != null && strArr13.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr14 = this.T;
                if (i12 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i12];
                if (str7 != null) {
                    c2639b.b(47, str7);
                }
                i12++;
            }
        }
        b bVar = this.U;
        if (bVar != null) {
            c2639b.b(48, bVar);
        }
        if (!this.E.equals("")) {
            c2639b.b(49, this.E);
        }
        a aVar = this.V;
        if (aVar != null) {
            c2639b.b(51, aVar);
        }
        h hVar = this.W;
        if (hVar != null) {
            c2639b.b(52, hVar);
        }
        g gVar = this.X;
        if (gVar != null) {
            c2639b.b(53, gVar);
        }
        d[] dVarArr = this.k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    c2639b.b(54, dVar);
                }
                i2++;
            }
        }
        q qVar = this.Y;
        if (qVar != null) {
            c2639b.b(55, qVar);
        }
    }

    public C2880kg b() {
        this.b = "";
        this.c = 0L;
        String[] strArr = C2764g.b;
        this.d = strArr;
        this.e = "";
        this.f = "";
        this.g = strArr;
        this.h = strArr;
        this.i = strArr;
        this.j = strArr;
        this.k = d.c();
        this.l = null;
        this.m = k.c();
        this.n = null;
        this.o = null;
        this.p = n.c();
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = false;
        this.u = "";
        this.v = strArr;
        this.w = null;
        this.x = false;
        this.y = l.c();
        this.z = null;
        this.A = "";
        this.B = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = 0L;
        this.G = 0L;
        this.H = false;
        this.I = null;
        this.J = null;
        this.K = 600;
        this.L = 1;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = strArr;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$g */
    public static final class g extends AbstractC2714e {
        public long b;

        public g() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            long j = this.b;
            if (j != 1209600) {
                c2639b.e(1, j);
            }
        }

        public g b() {
            this.b = 1209600L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            long j = this.b;
            if (j != 1209600) {
                return C2639b.b(1, j);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 8) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$l */
    public static final class l extends AbstractC2714e {
        private static volatile l[] d;
        public String b;
        public boolean c;

        public l() {
            b();
        }

        public static l[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
        }

        public l b() {
            this.b = "";
            this.c = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$m */
    public static final class m extends AbstractC2714e {
        public long b;
        public long c;

        public m() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
            c2639b.c(2, this.c);
        }

        public m b() {
            this.b = 86400L;
            this.c = 432000L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$q */
    public static final class q extends AbstractC2714e {
        public int b;

        public q() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            int i = this.b;
            if (i != 86400) {
                c2639b.f(1, i);
            }
        }

        public q b() {
            this.b = RemoteMessageConst.DEFAULT_TTL;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = this.b;
            if (i != 86400) {
                return C2639b.c(1, i);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL != 8) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.b = c2614a.h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$w */
    public static final class w extends AbstractC2714e {
        public boolean b;
        public boolean c;

        public w() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
        }

        public w b() {
            this.b = true;
            this.c = false;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$x */
    public static final class x extends AbstractC2714e {
        private static volatile x[] d;
        public int b;
        public String c;

        public x() {
            b();
        }

        public static x[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new x[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.d(1, this.b);
            c2639b.b(2, this.c);
        }

        public x b() {
            this.b = 0;
            this.c = "";
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            return C2639b.a(2, this.c) + C2639b.a(1, this.b);
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 8) {
                    int iH = c2614a.h();
                    if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                        this.b = iH;
                    }
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.k();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$e */
    public static final class e extends AbstractC2714e {
        public long b;
        public int c;

        public e() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
            int i = this.c;
            if (i != 86400) {
                c2639b.d(2, i);
            }
        }

        public e b() {
            this.b = 0L;
            this.c = RemoteMessageConst.DEFAULT_TTL;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(1, this.b);
            int i = this.c;
            return i != 86400 ? iA + C2639b.a(2, i) : iA;
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
                } else if (iL != 16) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.c = c2614a.h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$b */
    public static final class b extends AbstractC2714e {
        public int b;
        public int c;

        public b() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            int i = this.b;
            if (i != 86400) {
                c2639b.d(1, i);
            }
            int i2 = this.c;
            if (i2 != 86400) {
                c2639b.d(2, i2);
            }
        }

        public b b() {
            this.b = RemoteMessageConst.DEFAULT_TTL;
            this.c = RemoteMessageConst.DEFAULT_TTL;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = this.b;
            int iA = i != 86400 ? C2639b.a(1, i) : 0;
            int i2 = this.c;
            return i2 != 86400 ? iA + C2639b.a(2, i2) : iA;
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
                    this.c = c2614a.h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$k */
    public static final class k extends AbstractC2714e {
        private static volatile k[] d;
        public a b;
        public b c;

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$a */
        public static final class a extends AbstractC2714e {
            public long b;
            public float c;
            public int d;
            public int e;
            public long f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public long k;
            public C0015a l;
            public C0015a m;
            public C0015a n;
            public C0015a o;
            public b p;
            public boolean q;
            public boolean r;

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a */
            public static final class C0015a extends AbstractC2714e {
                public boolean b;
                public boolean c;
                public C0016a d;

                public C0015a() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public void a(C2639b c2639b) throws IOException {
                    c2639b.b(1, this.b);
                    c2639b.b(2, this.c);
                    C0016a c0016a = this.d;
                    if (c0016a != null) {
                        c2639b.b(3, c0016a);
                    }
                }

                public C0015a b() {
                    this.b = true;
                    this.c = false;
                    this.d = null;
                    this.a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a$a */
                public static final class C0016a extends AbstractC2714e {
                    public long b;
                    public long c;

                    public C0016a() {
                        b();
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                    public void a(C2639b c2639b) throws IOException {
                        c2639b.c(1, this.b);
                        c2639b.c(2, this.c);
                    }

                    public C0016a b() {
                        this.b = 0L;
                        this.c = 0L;
                        this.a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                    public int a() {
                        return C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                            } else if (iL != 16) {
                                if (!c2614a.f(iL)) {
                                    break;
                                }
                            } else {
                                this.c = c2614a.i();
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public int a() {
                    int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
                    C0016a c0016a = this.d;
                    return c0016a != null ? iA + C2639b.a(3, c0016a) : iA;
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
                        } else if (iL == 16) {
                            this.c = c2614a.c();
                        } else if (iL != 26) {
                            if (!c2614a.f(iL)) {
                                break;
                            }
                        } else {
                            if (this.d == null) {
                                this.d = new C0016a();
                            }
                            c2614a.a(this.d);
                        }
                    }
                    return this;
                }
            }

            public a() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                c2639b.c(1, this.b);
                c2639b.a(2, this.c);
                c2639b.d(3, this.d);
                c2639b.d(4, this.e);
                c2639b.c(5, this.f);
                c2639b.d(6, this.g);
                c2639b.b(7, this.h);
                c2639b.b(8, this.i);
                c2639b.c(9, this.k);
                C0015a c0015a = this.l;
                if (c0015a != null) {
                    c2639b.b(10, c0015a);
                }
                C0015a c0015a2 = this.m;
                if (c0015a2 != null) {
                    c2639b.b(11, c0015a2);
                }
                C0015a c0015a3 = this.n;
                if (c0015a3 != null) {
                    c2639b.b(12, c0015a3);
                }
                c2639b.b(13, this.j);
                C0015a c0015a4 = this.o;
                if (c0015a4 != null) {
                    c2639b.b(14, c0015a4);
                }
                b bVar = this.p;
                if (bVar != null) {
                    c2639b.b(15, bVar);
                }
                boolean z = this.q;
                if (z) {
                    c2639b.b(16, z);
                }
                boolean z2 = this.r;
                if (z2) {
                    c2639b.b(17, z2);
                }
            }

            public a b() {
                this.b = 5000L;
                this.c = 10.0f;
                this.d = 20;
                this.e = 200;
                this.f = 60000L;
                this.g = 10000;
                this.h = false;
                this.i = false;
                this.j = true;
                this.k = 60000L;
                this.l = null;
                this.m = null;
                this.n = null;
                this.o = null;
                this.p = null;
                this.q = false;
                this.r = false;
                this.a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b */
            public static final class b extends AbstractC2714e {
                public boolean b;
                public boolean c;
                public C0017a d;

                public b() {
                    b();
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public void a(C2639b c2639b) throws IOException {
                    c2639b.b(1, this.b);
                    c2639b.b(2, this.c);
                    C0017a c0017a = this.d;
                    if (c0017a != null) {
                        c2639b.b(3, c0017a);
                    }
                }

                public b b() {
                    this.b = true;
                    this.c = false;
                    this.d = null;
                    this.a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b$a */
                public static final class C0017a extends AbstractC2714e {
                    public long b;
                    public long c;
                    public int d;

                    public C0017a() {
                        b();
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                    public void a(C2639b c2639b) throws IOException {
                        c2639b.c(1, this.b);
                        c2639b.c(2, this.c);
                        c2639b.d(3, this.d);
                    }

                    public C0017a b() {
                        this.b = 0L;
                        this.c = 0L;
                        this.d = 0;
                        this.a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                    public int a() {
                        return C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
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
                            } else if (iL != 24) {
                                if (!c2614a.f(iL)) {
                                    break;
                                }
                            } else {
                                int iH = c2614a.h();
                                if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                                    this.d = iH;
                                }
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.ob.AbstractC2714e
                public int a() {
                    int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
                    C0017a c0017a = this.d;
                    return c0017a != null ? iA + C2639b.a(3, c0017a) : iA;
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
                        } else if (iL == 16) {
                            this.c = c2614a.c();
                        } else if (iL != 26) {
                            if (!c2614a.f(iL)) {
                                break;
                            }
                        } else {
                            if (this.d == null) {
                                this.d = new C0017a();
                            }
                            c2614a.a(this.d);
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int iA = C2639b.a(9, this.k) + C2639b.a(8, this.i) + C2639b.a(7, this.h) + C2639b.a(6, this.g) + C2639b.a(5, this.f) + C2639b.a(4, this.e) + C2639b.a(3, this.d) + C2639b.c(2) + 4 + C2639b.a(1, this.b);
                C0015a c0015a = this.l;
                if (c0015a != null) {
                    iA += C2639b.a(10, c0015a);
                }
                C0015a c0015a2 = this.m;
                if (c0015a2 != null) {
                    iA += C2639b.a(11, c0015a2);
                }
                C0015a c0015a3 = this.n;
                if (c0015a3 != null) {
                    iA += C2639b.a(12, c0015a3);
                }
                int iA2 = C2639b.a(13, this.j) + iA;
                C0015a c0015a4 = this.o;
                if (c0015a4 != null) {
                    iA2 += C2639b.a(14, c0015a4);
                }
                b bVar = this.p;
                if (bVar != null) {
                    iA2 += C2639b.a(15, bVar);
                }
                boolean z = this.q;
                if (z) {
                    iA2 += C2639b.a(16, z);
                }
                boolean z2 = this.r;
                return z2 ? iA2 + C2639b.a(17, z2) : iA2;
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
                        case 21:
                            this.c = Float.intBitsToFloat(c2614a.f());
                            break;
                        case 24:
                            this.d = c2614a.h();
                            break;
                        case 32:
                            this.e = c2614a.h();
                            break;
                        case C4473c9.L /* 40 */:
                            this.f = c2614a.i();
                            break;
                        case 48:
                            this.g = c2614a.h();
                            break;
                        case 56:
                            this.h = c2614a.c();
                            break;
                        case NativeMac.KEY_LENGTH /* 64 */:
                            this.i = c2614a.c();
                            break;
                        case 72:
                            this.k = c2614a.i();
                            break;
                        case 82:
                            if (this.l == null) {
                                this.l = new C0015a();
                            }
                            c2614a.a(this.l);
                            break;
                        case 90:
                            if (this.m == null) {
                                this.m = new C0015a();
                            }
                            c2614a.a(this.m);
                            break;
                        case 98:
                            if (this.n == null) {
                                this.n = new C0015a();
                            }
                            c2614a.a(this.n);
                            break;
                        case 104:
                            this.j = c2614a.c();
                            break;
                        case 114:
                            if (this.o == null) {
                                this.o = new C0015a();
                            }
                            c2614a.a(this.o);
                            break;
                        case 122:
                            if (this.p == null) {
                                this.p = new b();
                            }
                            c2614a.a(this.p);
                            break;
                        case 128:
                            this.q = c2614a.c();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                            this.r = c2614a.c();
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

        public k() {
            b();
        }

        public static k[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new k[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            a aVar = this.b;
            if (aVar != null) {
                c2639b.b(1, aVar);
            }
            b bVar = this.c;
            if (bVar != null) {
                c2639b.b(2, bVar);
            }
        }

        public k b() {
            this.b = null;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            a aVar = this.b;
            int iA = aVar != null ? C2639b.a(1, aVar) : 0;
            b bVar = this.c;
            return bVar != null ? iA + C2639b.a(2, bVar) : iA;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$b */
        public static final class b extends AbstractC2714e {
            public int[] b;
            public int[] c;

            public b() {
                b();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public void a(C2639b c2639b) throws IOException {
                int[] iArr = this.b;
                int i = 0;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.b;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        c2639b.d(1, iArr2[i2]);
                        i2++;
                    }
                }
                int[] iArr3 = this.c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return;
                }
                while (true) {
                    int[] iArr4 = this.c;
                    if (i >= iArr4.length) {
                        return;
                    }
                    c2639b.d(2, iArr4[i]);
                    i++;
                }
            }

            public b b() {
                int[] iArr = C2764g.a;
                this.b = iArr;
                this.c = iArr;
                this.a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC2714e
            public int a() {
                int length;
                int[] iArr;
                int[] iArr2 = this.b;
                int i = 0;
                if (iArr2 == null || iArr2.length <= 0) {
                    length = 0;
                } else {
                    int i2 = 0;
                    int iA = 0;
                    while (true) {
                        iArr = this.b;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        iA += C2639b.a(iArr[i2]);
                        i2++;
                    }
                    length = iA + iArr.length;
                }
                int[] iArr3 = this.c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return length;
                }
                int iA2 = 0;
                while (true) {
                    int[] iArr4 = this.c;
                    if (i < iArr4.length) {
                        iA2 += C2639b.a(iArr4[i]);
                        i++;
                    } else {
                        return length + iA2 + iArr4.length;
                    }
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
                        int iA = C2764g.a(c2614a, 8);
                        int[] iArr = new int[iA];
                        int i = 0;
                        for (int i2 = 0; i2 < iA; i2++) {
                            if (i2 != 0) {
                                c2614a.l();
                            }
                            int iH = c2614a.h();
                            if (iH == 0 || iH == 1 || iH == 2 || iH == 3 || iH == 4) {
                                iArr[i] = iH;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.b;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == iA) {
                                this.b = iArr;
                            } else {
                                int[] iArr3 = new int[length + i];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.b = iArr3;
                            }
                        }
                    } else if (iL == 10) {
                        int iC = c2614a.c(c2614a.h());
                        int iB = c2614a.b();
                        int i3 = 0;
                        while (c2614a.a() > 0) {
                            int iH2 = c2614a.h();
                            if (iH2 == 0 || iH2 == 1 || iH2 == 2 || iH2 == 3 || iH2 == 4) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            c2614a.e(iB);
                            int[] iArr4 = this.b;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i3 + length2];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (c2614a.a() > 0) {
                                int iH3 = c2614a.h();
                                if (iH3 == 0 || iH3 == 1 || iH3 == 2 || iH3 == 3 || iH3 == 4) {
                                    iArr5[length2] = iH3;
                                    length2++;
                                }
                            }
                            this.b = iArr5;
                        }
                        c2614a.b(iC);
                    } else if (iL == 16) {
                        int iA2 = C2764g.a(c2614a, 16);
                        int[] iArr6 = new int[iA2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < iA2; i5++) {
                            if (i5 != 0) {
                                c2614a.l();
                            }
                            int iH4 = c2614a.h();
                            if (iH4 == 0 || iH4 == 2 || iH4 == 3) {
                                iArr6[i4] = iH4;
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            int[] iArr7 = this.c;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i4 == iA2) {
                                this.c = iArr6;
                            } else {
                                int[] iArr8 = new int[length3 + i4];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i4);
                                this.c = iArr8;
                            }
                        }
                    } else if (iL != 18) {
                        if (!c2614a.f(iL)) {
                            break;
                        }
                    } else {
                        int iC2 = c2614a.c(c2614a.h());
                        int iB2 = c2614a.b();
                        int i6 = 0;
                        while (c2614a.a() > 0) {
                            int iH5 = c2614a.h();
                            if (iH5 == 0 || iH5 == 2 || iH5 == 3) {
                                i6++;
                            }
                        }
                        if (i6 != 0) {
                            c2614a.e(iB2);
                            int[] iArr9 = this.c;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[i6 + length4];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (c2614a.a() > 0) {
                                int iH6 = c2614a.h();
                                if (iH6 == 0 || iH6 == 2 || iH6 == 3) {
                                    iArr10[length4] = iH6;
                                    length4++;
                                }
                            }
                            this.c = iArr10;
                        }
                        c2614a.b(iC2);
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
                    if (this.b == null) {
                        this.b = new a();
                    }
                    c2614a.a(this.b);
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new b();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$s */
    public static final class s extends AbstractC2714e {
        public t b;
        public t c;

        public s() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            t tVar = this.b;
            if (tVar != null) {
                c2639b.b(1, tVar);
            }
            t tVar2 = this.c;
            if (tVar2 != null) {
                c2639b.b(2, tVar2);
            }
        }

        public s b() {
            this.b = null;
            this.c = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            t tVar = this.b;
            int iA = tVar != null ? C2639b.a(1, tVar) : 0;
            t tVar2 = this.c;
            return tVar2 != null ? iA + C2639b.a(2, tVar2) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.b == null) {
                        this.b = new t();
                    }
                    c2614a.a(this.b);
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.c == null) {
                        this.c = new t();
                    }
                    c2614a.a(this.c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$t */
    public static final class t extends AbstractC2714e {
        public int b;
        public long c;

        public t() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            int i = this.b;
            if (i != 100) {
                c2639b.d(1, i);
            }
            long j = this.c;
            if (j != 60) {
                c2639b.c(2, j);
            }
        }

        public t b() {
            this.b = 100;
            this.c = 60L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = this.b;
            int iA = i != 100 ? C2639b.a(1, i) : 0;
            long j = this.c;
            return j != 60 ? iA + C2639b.a(2, j) : iA;
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
                    this.c = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$d */
    public static final class d extends AbstractC2714e {
        private static volatile d[] d;
        public String b;
        public String[] c;

        public d() {
            b();
        }

        public static d[] c() {
            if (d == null) {
                synchronized (C2664c.a) {
                    try {
                        if (d == null) {
                            d = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return d;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!this.b.equals("")) {
                c2639b.b(1, this.b);
            }
            String[] strArr = this.c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    return;
                }
                String str = strArr2[i];
                if (str != null) {
                    c2639b.b(2, str);
                }
                i++;
            }
        }

        public d b() {
            this.b = "";
            this.c = C2764g.b;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int i = 0;
            int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
            String[] strArr = this.c;
            if (strArr == null || strArr.length <= 0) {
                return iA;
            }
            int iA2 = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    return iA + iA2 + i2;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    iA2 = C2639b.a(str) + iA2;
                }
                i++;
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
                    this.b = c2614a.k();
                } else if (iL != 18) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 18);
                    String[] strArr = this.c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iA + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = c2614a.k();
                        c2614a.l();
                        length++;
                    }
                    strArr2[length] = c2614a.k();
                    this.c = strArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$f */
    public static final class f extends AbstractC2714e {
        public e b;
        public e c;
        public e d;

        public f() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            e eVar = this.b;
            if (eVar != null) {
                c2639b.b(1, eVar);
            }
            e eVar2 = this.c;
            if (eVar2 != null) {
                c2639b.b(2, eVar2);
            }
            e eVar3 = this.d;
            if (eVar3 != null) {
                c2639b.b(3, eVar3);
            }
        }

        public f b() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            e eVar = this.b;
            int iA = eVar != null ? C2639b.a(1, eVar) : 0;
            e eVar2 = this.c;
            if (eVar2 != null) {
                iA += C2639b.a(2, eVar2);
            }
            e eVar3 = this.d;
            return eVar3 != null ? iA + C2639b.a(3, eVar3) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                if (iL == 0) {
                    break;
                }
                if (iL == 10) {
                    if (this.b == null) {
                        this.b = new e();
                    }
                    c2614a.a(this.b);
                } else if (iL == 18) {
                    if (this.c == null) {
                        this.c = new e();
                    }
                    c2614a.a(this.c);
                } else if (iL != 26) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    if (this.d == null) {
                        this.d = new e();
                    }
                    c2614a.a(this.d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$c */
    public static final class c extends AbstractC2714e {
        public long b;
        public long c;
        public long d;
        public long e;

        public c() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            long j = this.b;
            if (j != 10000) {
                c2639b.c(1, j);
            }
            long j2 = this.c;
            if (j2 != 10000) {
                c2639b.c(2, j2);
            }
            long j3 = this.d;
            if (j3 != 10000) {
                c2639b.c(3, j3);
            }
            long j4 = this.e;
            if (j4 != 10000) {
                c2639b.c(4, j4);
            }
        }

        public c b() {
            this.b = 10000L;
            this.c = 10000L;
            this.d = 10000L;
            this.e = 10000L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            long j = this.b;
            int iA = j != 10000 ? C2639b.a(1, j) : 0;
            long j2 = this.c;
            if (j2 != 10000) {
                iA += C2639b.a(2, j2);
            }
            long j3 = this.d;
            if (j3 != 10000) {
                iA += C2639b.a(3, j3);
            }
            long j4 = this.e;
            return j4 != 10000 ? iA + C2639b.a(4, j4) : iA;
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
                } else if (iL == 24) {
                    this.d = c2614a.i();
                } else if (iL != 32) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.e = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$o */
    public static final class o extends AbstractC2714e {
        public long b;
        public long c;
        public long d;
        public long e;

        public o() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            long j = this.b;
            if (j != 432000000) {
                c2639b.c(1, j);
            }
            long j2 = this.c;
            if (j2 != 86400000) {
                c2639b.c(2, j2);
            }
            long j3 = this.d;
            if (j3 != 10000) {
                c2639b.c(3, j3);
            }
            long j4 = this.e;
            if (j4 != 3600000) {
                c2639b.c(4, j4);
            }
        }

        public o b() {
            this.b = 432000000L;
            this.c = 86400000L;
            this.d = 10000L;
            this.e = 3600000L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            long j = this.b;
            int iA = j != 432000000 ? C2639b.a(1, j) : 0;
            long j2 = this.c;
            if (j2 != 86400000) {
                iA += C2639b.a(2, j2);
            }
            long j3 = this.d;
            if (j3 != 10000) {
                iA += C2639b.a(3, j3);
            }
            long j4 = this.e;
            return j4 != 3600000 ? iA + C2639b.a(4, j4) : iA;
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
                } else if (iL == 24) {
                    this.d = c2614a.i();
                } else if (iL != 32) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.e = c2614a.i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$h */
    public static final class h extends AbstractC2714e {
        public String b;
        public int c;
        public int d;
        public boolean e;
        public boolean f;

        public h() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            if (!this.b.equals("")) {
                c2639b.b(1, this.b);
            }
            int i = this.c;
            if (i != 600) {
                c2639b.f(2, i);
            }
            int i2 = this.d;
            if (i2 != 300) {
                c2639b.f(3, i2);
            }
            boolean z = this.e;
            if (z) {
                c2639b.b(4, z);
            }
            boolean z2 = this.f;
            if (!z2) {
                c2639b.b(5, z2);
            }
        }

        public h b() {
            this.b = "";
            this.c = 600;
            this.d = 300;
            this.e = false;
            this.f = true;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
            int i = this.c;
            if (i != 600) {
                iA += C2639b.c(2, i);
            }
            int i2 = this.d;
            if (i2 != 300) {
                iA += C2639b.c(3, i2);
            }
            boolean z = this.e;
            if (z) {
                iA += C2639b.a(4, z);
            }
            boolean z2 = this.f;
            return !z2 ? iA + C2639b.a(5, z2) : iA;
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
                    this.c = c2614a.h();
                } else if (iL == 24) {
                    this.d = c2614a.h();
                } else if (iL == 32) {
                    this.e = c2614a.c();
                } else if (iL != 40) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    this.f = c2614a.c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$v */
    public static final class v extends AbstractC2714e {
        public int b;
        public int c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public x[] i;

        public v() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.d(1, this.b);
            c2639b.d(2, this.c);
            c2639b.d(3, this.d);
            c2639b.c(4, this.e);
            c2639b.b(5, this.f);
            c2639b.b(6, this.g);
            c2639b.b(7, this.h);
            x[] xVarArr = this.i;
            if (xVarArr == null || xVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                x[] xVarArr2 = this.i;
                if (i >= xVarArr2.length) {
                    return;
                }
                x xVar = xVarArr2[i];
                if (xVar != null) {
                    c2639b.b(8, xVar);
                }
                i++;
            }
        }

        public v b() {
            this.b = 10000;
            this.c = 1000;
            this.d = 100;
            this.e = 5000L;
            this.f = true;
            this.g = false;
            this.h = true;
            this.i = x.c();
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(7, this.h) + C2639b.a(6, this.g) + C2639b.a(5, this.f) + C2639b.a(4, this.e) + C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
            x[] xVarArr = this.i;
            if (xVarArr != null && xVarArr.length > 0) {
                int i = 0;
                while (true) {
                    x[] xVarArr2 = this.i;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i];
                    if (xVar != null) {
                        iA = C2639b.a(8, xVar) + iA;
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
                if (iL == 8) {
                    this.b = c2614a.h();
                } else if (iL == 16) {
                    this.c = c2614a.h();
                } else if (iL == 24) {
                    this.d = c2614a.h();
                } else if (iL == 32) {
                    this.e = c2614a.i();
                } else if (iL == 40) {
                    this.f = c2614a.c();
                } else if (iL == 48) {
                    this.g = c2614a.c();
                } else if (iL == 56) {
                    this.h = c2614a.c();
                } else if (iL != 66) {
                    if (!c2614a.f(iL)) {
                        break;
                    }
                } else {
                    int iA = C2764g.a(c2614a, 66);
                    x[] xVarArr = this.i;
                    int length = xVarArr == null ? 0 : xVarArr.length;
                    int i = iA + length;
                    x[] xVarArr2 = new x[i];
                    if (length != 0) {
                        System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        x xVar = new x();
                        xVarArr2[length] = xVar;
                        c2614a.a(xVar);
                        c2614a.l();
                        length++;
                    }
                    x xVar2 = new x();
                    xVarArr2[length] = xVar2;
                    c2614a.a(xVar2);
                    this.i = xVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$p */
    public static final class p extends AbstractC2714e {
        public long b;
        public String c;
        public int[] d;
        public int[] e;
        public long f;
        public int g;
        public long h;
        public long i;
        public long j;
        public long k;

        public p() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.c(1, this.b);
            c2639b.b(2, this.c);
            int[] iArr = this.d;
            int i = 0;
            if (iArr != null && iArr.length > 0) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    c2639b.d(3, iArr2[i2]);
                    i2++;
                }
            }
            c2639b.c(4, this.f);
            c2639b.d(5, this.g);
            long j = this.h;
            if (j != 43200) {
                c2639b.c(6, j);
            }
            long j2 = this.i;
            if (j2 != 3600) {
                c2639b.c(7, j2);
            }
            long j3 = this.j;
            if (j3 != 86400) {
                c2639b.c(8, j3);
            }
            int[] iArr3 = this.e;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.e;
                    if (i >= iArr4.length) {
                        break;
                    }
                    c2639b.d(9, iArr4[i]);
                    i++;
                }
            }
            long j4 = this.k;
            if (j4 != 30) {
                c2639b.c(10, j4);
            }
        }

        public p b() {
            this.b = 0L;
            this.c = "";
            int[] iArr = C2764g.a;
            this.d = iArr;
            this.e = iArr;
            this.f = 259200L;
            this.g = 10;
            this.h = 43200L;
            this.i = 3600L;
            this.j = 86400L;
            this.k = 30L;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int[] iArr;
            int[] iArr2;
            int iA = C2639b.a(2, this.c) + C2639b.a(1, this.b);
            int[] iArr3 = this.d;
            int i = 0;
            if (iArr3 != null && iArr3.length > 0) {
                int i2 = 0;
                int iA2 = 0;
                while (true) {
                    iArr2 = this.d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    iA2 += C2639b.a(iArr2[i2]);
                    i2++;
                }
                iA = iA + iA2 + iArr2.length;
            }
            int iA3 = C2639b.a(5, this.g) + C2639b.a(4, this.f) + iA;
            long j = this.h;
            if (j != 43200) {
                iA3 += C2639b.a(6, j);
            }
            long j2 = this.i;
            if (j2 != 3600) {
                iA3 += C2639b.a(7, j2);
            }
            long j3 = this.j;
            if (j3 != 86400) {
                iA3 += C2639b.a(8, j3);
            }
            int[] iArr4 = this.e;
            if (iArr4 != null && iArr4.length > 0) {
                int iA4 = 0;
                while (true) {
                    iArr = this.e;
                    if (i >= iArr.length) {
                        break;
                    }
                    iA4 += C2639b.a(iArr[i]);
                    i++;
                }
                iA3 = iA3 + iA4 + iArr.length;
            }
            long j4 = this.k;
            return j4 != 30 ? iA3 + C2639b.a(10, j4) : iA3;
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
                    case 18:
                        this.c = c2614a.k();
                        break;
                    case 24:
                        int iA = C2764g.a(c2614a, 24);
                        int[] iArr = this.d;
                        int length = iArr == null ? 0 : iArr.length;
                        int i = iA + length;
                        int[] iArr2 = new int[i];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i - 1) {
                            iArr2[length] = c2614a.h();
                            c2614a.l();
                            length++;
                        }
                        iArr2[length] = c2614a.h();
                        this.d = iArr2;
                        break;
                    case 26:
                        int iC = c2614a.c(c2614a.h());
                        int iB = c2614a.b();
                        int i2 = 0;
                        while (c2614a.a() > 0) {
                            c2614a.h();
                            i2++;
                        }
                        c2614a.e(iB);
                        int[] iArr3 = this.d;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i3 = i2 + length2;
                        int[] iArr4 = new int[i3];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            iArr4[length2] = c2614a.h();
                            length2++;
                        }
                        this.d = iArr4;
                        c2614a.b(iC);
                        break;
                    case 32:
                        this.f = c2614a.i();
                        break;
                    case C4473c9.L /* 40 */:
                        this.g = c2614a.h();
                        break;
                    case 48:
                        this.h = c2614a.i();
                        break;
                    case 56:
                        this.i = c2614a.i();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.j = c2614a.i();
                        break;
                    case 72:
                        int iA2 = C2764g.a(c2614a, 72);
                        int[] iArr5 = this.e;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i4 = iA2 + length3;
                        int[] iArr6 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            iArr6[length3] = c2614a.h();
                            c2614a.l();
                            length3++;
                        }
                        iArr6[length3] = c2614a.h();
                        this.e = iArr6;
                        break;
                    case 74:
                        int iC2 = c2614a.c(c2614a.h());
                        int iB2 = c2614a.b();
                        int i5 = 0;
                        while (c2614a.a() > 0) {
                            c2614a.h();
                            i5++;
                        }
                        c2614a.e(iB2);
                        int[] iArr7 = this.e;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i6 = i5 + length4;
                        int[] iArr8 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            iArr8[length4] = c2614a.h();
                            length4++;
                        }
                        this.e = iArr8;
                        c2614a.b(iC2);
                        break;
                    case 80:
                        this.k = c2614a.i();
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

    /* renamed from: com.yandex.metrica.impl.ob.kg$i */
    public static final class i extends AbstractC2714e {
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public i() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            c2639b.b(1, this.b);
            c2639b.b(2, this.c);
            c2639b.b(3, this.d);
            c2639b.b(4, this.e);
            c2639b.b(6, this.f);
            c2639b.b(8, this.g);
            c2639b.b(9, this.h);
            c2639b.b(11, this.i);
            c2639b.b(12, this.j);
            c2639b.b(15, this.k);
            c2639b.b(16, this.l);
            c2639b.b(18, this.m);
            c2639b.b(19, this.n);
            c2639b.b(20, this.o);
            c2639b.b(21, this.p);
            c2639b.b(22, this.q);
            c2639b.b(23, this.r);
            c2639b.b(24, this.s);
            c2639b.b(25, this.t);
            c2639b.b(26, this.u);
            c2639b.b(27, this.v);
            c2639b.b(28, this.w);
            boolean z = this.x;
            if (z) {
                c2639b.b(29, z);
            }
            boolean z2 = this.y;
            if (z2) {
                c2639b.b(33, z2);
            }
            int i = this.z;
            if (i != -1) {
                c2639b.d(34, i);
            }
        }

        public i b() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = true;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = true;
            this.w = false;
            this.x = false;
            this.y = false;
            this.z = -1;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            int iA = C2639b.a(28, this.w) + C2639b.a(27, this.v) + C2639b.a(26, this.u) + C2639b.a(25, this.t) + C2639b.a(24, this.s) + C2639b.a(23, this.r) + C2639b.a(22, this.q) + C2639b.a(21, this.p) + C2639b.a(20, this.o) + C2639b.a(19, this.n) + C2639b.a(18, this.m) + C2639b.a(16, this.l) + C2639b.a(15, this.k) + C2639b.a(12, this.j) + C2639b.a(11, this.i) + C2639b.a(9, this.h) + C2639b.a(8, this.g) + C2639b.a(6, this.f) + C2639b.a(4, this.e) + C2639b.a(3, this.d) + C2639b.a(2, this.c) + C2639b.a(1, this.b);
            boolean z = this.x;
            if (z) {
                iA += C2639b.a(29, z);
            }
            boolean z2 = this.y;
            if (z2) {
                iA += C2639b.a(33, z2);
            }
            int i = this.z;
            return i != -1 ? iA + C2639b.a(34, i) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.b = c2614a.c();
                        break;
                    case 16:
                        this.c = c2614a.c();
                        break;
                    case 24:
                        this.d = c2614a.c();
                        break;
                    case 32:
                        this.e = c2614a.c();
                        break;
                    case 48:
                        this.f = c2614a.c();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.g = c2614a.c();
                        break;
                    case 72:
                        this.h = c2614a.c();
                        break;
                    case 88:
                        this.i = c2614a.c();
                        break;
                    case 96:
                        this.j = c2614a.c();
                        break;
                    case 120:
                        this.k = c2614a.c();
                        break;
                    case 128:
                        this.l = c2614a.c();
                        break;
                    case 144:
                        this.m = c2614a.c();
                        break;
                    case 152:
                        this.n = c2614a.c();
                        break;
                    case 160:
                        this.o = c2614a.c();
                        break;
                    case 168:
                        this.p = c2614a.c();
                        break;
                    case 176:
                        this.q = c2614a.c();
                        break;
                    case 184:
                        this.r = c2614a.c();
                        break;
                    case 192:
                        this.s = c2614a.c();
                        break;
                    case 200:
                        this.t = c2614a.c();
                        break;
                    case 208:
                        this.u = c2614a.c();
                        break;
                    case 216:
                        this.v = c2614a.c();
                        break;
                    case 224:
                        this.w = c2614a.c();
                        break;
                    case 232:
                        this.x = c2614a.c();
                        break;
                    case 264:
                        this.y = c2614a.c();
                        break;
                    case 272:
                        int iH = c2614a.h();
                        if (iH != -1 && iH != 0 && iH != 1) {
                            break;
                        } else {
                            this.z = iH;
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

    /* renamed from: com.yandex.metrica.impl.ob.kg$u */
    public static final class u extends AbstractC2714e {
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public x[] n;
        public boolean o;
        public boolean p;
        public int q;

        public u() {
            b();
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public void a(C2639b c2639b) throws IOException {
            boolean z = this.b;
            if (!z) {
                c2639b.b(1, z);
            }
            boolean z2 = this.c;
            if (!z2) {
                c2639b.b(2, z2);
            }
            boolean z3 = this.d;
            if (!z3) {
                c2639b.b(3, z3);
            }
            boolean z4 = this.e;
            if (!z4) {
                c2639b.b(4, z4);
            }
            int i = this.f;
            if (i != 10000) {
                c2639b.d(5, i);
            }
            int i2 = this.g;
            if (i2 != 1000) {
                c2639b.d(6, i2);
            }
            int i3 = this.h;
            if (i3 != 1000) {
                c2639b.d(7, i3);
            }
            int i4 = this.i;
            if (i4 != 200000) {
                c2639b.d(8, i4);
            }
            boolean z5 = this.j;
            if (z5) {
                c2639b.b(9, z5);
            }
            boolean z6 = this.k;
            if (z6) {
                c2639b.b(10, z6);
            }
            boolean z7 = this.l;
            if (z7) {
                c2639b.b(11, z7);
            }
            boolean z8 = this.m;
            if (z8) {
                c2639b.b(12, z8);
            }
            x[] xVarArr = this.n;
            if (xVarArr != null && xVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    x[] xVarArr2 = this.n;
                    if (i5 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i5];
                    if (xVar != null) {
                        c2639b.b(13, xVar);
                    }
                    i5++;
                }
            }
            boolean z9 = this.o;
            if (z9) {
                c2639b.b(14, z9);
            }
            boolean z10 = this.p;
            if (z10) {
                c2639b.b(15, z10);
            }
            int i6 = this.q;
            if (i6 != 4000) {
                c2639b.d(16, i6);
            }
        }

        public u b() {
            this.b = true;
            this.c = true;
            this.d = true;
            this.e = true;
            this.f = 10000;
            this.g = 1000;
            this.h = 1000;
            this.i = 200000;
            this.j = false;
            this.k = false;
            this.l = false;
            this.m = false;
            this.n = x.c();
            this.o = false;
            this.p = false;
            this.q = 4000;
            this.a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public int a() {
            boolean z = this.b;
            int i = 0;
            int iA = !z ? C2639b.a(1, z) : 0;
            boolean z2 = this.c;
            if (!z2) {
                iA += C2639b.a(2, z2);
            }
            boolean z3 = this.d;
            if (!z3) {
                iA += C2639b.a(3, z3);
            }
            boolean z4 = this.e;
            if (!z4) {
                iA += C2639b.a(4, z4);
            }
            int i2 = this.f;
            if (i2 != 10000) {
                iA += C2639b.a(5, i2);
            }
            int i3 = this.g;
            if (i3 != 1000) {
                iA += C2639b.a(6, i3);
            }
            int i4 = this.h;
            if (i4 != 1000) {
                iA += C2639b.a(7, i4);
            }
            int i5 = this.i;
            if (i5 != 200000) {
                iA += C2639b.a(8, i5);
            }
            boolean z5 = this.j;
            if (z5) {
                iA += C2639b.a(9, z5);
            }
            boolean z6 = this.k;
            if (z6) {
                iA += C2639b.a(10, z6);
            }
            boolean z7 = this.l;
            if (z7) {
                iA += C2639b.a(11, z7);
            }
            boolean z8 = this.m;
            if (z8) {
                iA += C2639b.a(12, z8);
            }
            x[] xVarArr = this.n;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.n;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i];
                    if (xVar != null) {
                        iA = C2639b.a(13, xVar) + iA;
                    }
                    i++;
                }
            }
            boolean z9 = this.o;
            if (z9) {
                iA += C2639b.a(14, z9);
            }
            boolean z10 = this.p;
            if (z10) {
                iA += C2639b.a(15, z10);
            }
            int i6 = this.q;
            return i6 != 4000 ? iA + C2639b.a(16, i6) : iA;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractC2714e
        public AbstractC2714e a(C2614a c2614a) throws IOException {
            while (true) {
                int iL = c2614a.l();
                switch (iL) {
                    case 0:
                        break;
                    case 8:
                        this.b = c2614a.c();
                        break;
                    case 16:
                        this.c = c2614a.c();
                        break;
                    case 24:
                        this.d = c2614a.c();
                        break;
                    case 32:
                        this.e = c2614a.c();
                        break;
                    case C4473c9.L /* 40 */:
                        this.f = c2614a.h();
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
                        this.j = c2614a.c();
                        break;
                    case 80:
                        this.k = c2614a.c();
                        break;
                    case 88:
                        this.l = c2614a.c();
                        break;
                    case 96:
                        this.m = c2614a.c();
                        break;
                    case 106:
                        int iA = C2764g.a(c2614a, 106);
                        x[] xVarArr = this.n;
                        int length = xVarArr == null ? 0 : xVarArr.length;
                        int i = iA + length;
                        x[] xVarArr2 = new x[i];
                        if (length != 0) {
                            System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            x xVar = new x();
                            xVarArr2[length] = xVar;
                            c2614a.a(xVar);
                            c2614a.l();
                            length++;
                        }
                        x xVar2 = new x();
                        xVarArr2[length] = xVar2;
                        c2614a.a(xVar2);
                        this.n = xVarArr2;
                        break;
                    case 112:
                        this.o = c2614a.c();
                        break;
                    case 120:
                        this.p = c2614a.c();
                        break;
                    case 128:
                        this.q = c2614a.h();
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

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int i2 = 0;
        int iA = C2639b.a(3, this.c) + (!this.b.equals("") ? C2639b.a(1, this.b) : 0);
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int iA2 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i4++;
                    iA2 += C2639b.a(str);
                }
                i3++;
            }
            iA = iA + iA2 + i4;
        }
        if (!this.e.equals("")) {
            iA += C2639b.a(5, this.e);
        }
        if (!this.f.equals("")) {
            iA += C2639b.a(6, this.f);
        }
        String[] strArr3 = this.g;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int iA3 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.g;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i6++;
                    iA3 += C2639b.a(str2);
                }
                i5++;
            }
            iA = iA + iA3 + i6;
        }
        String[] strArr5 = this.h;
        if (strArr5 != null && strArr5.length > 0) {
            int i7 = 0;
            int iA4 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr6 = this.h;
                if (i7 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i7];
                if (str3 != null) {
                    i8++;
                    iA4 += C2639b.a(str3);
                }
                i7++;
            }
            iA = iA + iA4 + i8;
        }
        String[] strArr7 = this.i;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            int iA5 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr8 = this.i;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    i10++;
                    iA5 += C2639b.a(str4);
                }
                i9++;
            }
            iA = iA + iA5 + i10;
        }
        i iVar = this.l;
        if (iVar != null) {
            iA += C2639b.a(10, iVar);
        }
        k[] kVarArr = this.m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                k[] kVarArr2 = this.m;
                if (i11 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i11];
                if (kVar != null) {
                    iA = C2639b.a(11, kVar) + iA;
                }
                i11++;
            }
        }
        y yVar = this.n;
        if (yVar != null) {
            iA += C2639b.a(12, yVar);
        }
        p pVar = this.o;
        if (pVar != null) {
            iA += C2639b.a(13, pVar);
        }
        n[] nVarArr = this.p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                n[] nVarArr2 = this.p;
                if (i12 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i12];
                if (nVar != null) {
                    iA = C2639b.a(14, nVar) + iA;
                }
                i12++;
            }
        }
        if (!this.q.equals("")) {
            iA += C2639b.a(15, this.q);
        }
        if (!this.r.equals("")) {
            iA += C2639b.a(16, this.r);
        }
        int iA6 = C2639b.a(17, this.t) + iA;
        if (!this.u.equals("")) {
            iA6 += C2639b.a(19, this.u);
        }
        String[] strArr9 = this.v;
        if (strArr9 != null && strArr9.length > 0) {
            int i13 = 0;
            int iA7 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr10 = this.v;
                if (i13 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i13];
                if (str5 != null) {
                    i14++;
                    iA7 += C2639b.a(str5);
                }
                i13++;
            }
            iA6 = iA6 + iA7 + (i14 * 2);
        }
        r rVar = this.w;
        if (rVar != null) {
            iA6 += C2639b.a(21, rVar);
        }
        boolean z = this.x;
        if (z) {
            iA6 += C2639b.a(22, z);
        }
        l[] lVarArr = this.y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                l[] lVarArr2 = this.y;
                if (i15 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i15];
                if (lVar != null) {
                    iA6 = C2639b.a(23, lVar) + iA6;
                }
                i15++;
            }
        }
        o oVar = this.z;
        if (oVar != null) {
            iA6 += C2639b.a(24, oVar);
        }
        if (!this.A.equals("")) {
            iA6 += C2639b.a(25, this.A);
        }
        if (!this.B.equals("")) {
            iA6 += C2639b.a(26, this.B);
        }
        if (!this.D.equals("")) {
            iA6 += C2639b.a(27, this.D);
        }
        int iA8 = C2639b.a(29, this.G) + C2639b.a(28, this.F) + iA6;
        boolean z2 = this.H;
        if (z2) {
            iA8 += C2639b.a(30, z2);
        }
        if (!this.C.equals("")) {
            iA8 += C2639b.a(31, this.C);
        }
        m mVar = this.I;
        if (mVar != null) {
            iA8 += C2639b.a(32, mVar);
        }
        j jVar = this.J;
        if (jVar != null) {
            iA8 += C2639b.a(33, jVar);
        }
        int iA9 = C2639b.a(36, this.L) + C2639b.a(35, this.K) + iA8;
        v vVar = this.M;
        if (vVar != null) {
            iA9 += C2639b.a(37, vVar);
        }
        u uVar = this.N;
        if (uVar != null) {
            iA9 += C2639b.a(38, uVar);
        }
        u uVar2 = this.O;
        if (uVar2 != null) {
            iA9 += C2639b.a(39, uVar2);
        }
        s sVar = this.Q;
        if (sVar != null) {
            iA9 += C2639b.a(41, sVar);
        }
        c cVar = this.R;
        if (cVar != null) {
            iA9 += C2639b.a(42, cVar);
        }
        u uVar3 = this.P;
        if (uVar3 != null) {
            iA9 += C2639b.a(43, uVar3);
        }
        if (!this.s.equals("")) {
            iA9 += C2639b.a(44, this.s);
        }
        f fVar = this.S;
        if (fVar != null) {
            iA9 += C2639b.a(45, fVar);
        }
        String[] strArr11 = this.j;
        if (strArr11 != null && strArr11.length > 0) {
            int i16 = 0;
            int iA10 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr12 = this.j;
                if (i16 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i16];
                if (str6 != null) {
                    i17++;
                    iA10 += C2639b.a(str6);
                }
                i16++;
            }
            iA9 = iA9 + iA10 + (i17 * 2);
        }
        String[] strArr13 = this.T;
        if (strArr13 != null && strArr13.length > 0) {
            int i18 = 0;
            int iA11 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr14 = this.T;
                if (i18 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i18];
                if (str7 != null) {
                    i19++;
                    iA11 += C2639b.a(str7);
                }
                i18++;
            }
            iA9 = iA9 + iA11 + (i19 * 2);
        }
        b bVar = this.U;
        if (bVar != null) {
            iA9 += C2639b.a(48, bVar);
        }
        if (!this.E.equals("")) {
            iA9 += C2639b.a(49, this.E);
        }
        a aVar = this.V;
        if (aVar != null) {
            iA9 += C2639b.a(51, aVar);
        }
        h hVar = this.W;
        if (hVar != null) {
            iA9 += C2639b.a(52, hVar);
        }
        g gVar = this.X;
        if (gVar != null) {
            iA9 += C2639b.a(53, gVar);
        }
        d[] dVarArr = this.k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    iA9 = C2639b.a(54, dVar) + iA9;
                }
                i2++;
            }
        }
        q qVar = this.Y;
        return qVar != null ? iA9 + C2639b.a(55, qVar) : iA9;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            switch (iL) {
                case 0:
                    break;
                case 10:
                    this.b = c2614a.k();
                    break;
                case 24:
                    this.c = c2614a.i();
                    break;
                case 34:
                    int iA = C2764g.a(c2614a, 34);
                    String[] strArr = this.d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = iA + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = c2614a.k();
                        c2614a.l();
                        length++;
                    }
                    strArr2[length] = c2614a.k();
                    this.d = strArr2;
                    break;
                case C4473c9.M /* 42 */:
                    this.e = c2614a.k();
                    break;
                case 50:
                    this.f = c2614a.k();
                    break;
                case 58:
                    int iA2 = C2764g.a(c2614a, 58);
                    String[] strArr3 = this.g;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = iA2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = c2614a.k();
                        c2614a.l();
                        length2++;
                    }
                    strArr4[length2] = c2614a.k();
                    this.g = strArr4;
                    break;
                case 66:
                    int iA3 = C2764g.a(c2614a, 66);
                    String[] strArr5 = this.h;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = iA3 + length3;
                    String[] strArr6 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = c2614a.k();
                        c2614a.l();
                        length3++;
                    }
                    strArr6[length3] = c2614a.k();
                    this.h = strArr6;
                    break;
                case 74:
                    int iA4 = C2764g.a(c2614a, 74);
                    String[] strArr7 = this.i;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = iA4 + length4;
                    String[] strArr8 = new String[i5];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        strArr8[length4] = c2614a.k();
                        c2614a.l();
                        length4++;
                    }
                    strArr8[length4] = c2614a.k();
                    this.i = strArr8;
                    break;
                case 82:
                    if (this.l == null) {
                        this.l = new i();
                    }
                    c2614a.a(this.l);
                    break;
                case 90:
                    int iA5 = C2764g.a(c2614a, 90);
                    k[] kVarArr = this.m;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i6 = iA5 + length5;
                    k[] kVarArr2 = new k[i6];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        k kVar = new k();
                        kVarArr2[length5] = kVar;
                        c2614a.a(kVar);
                        c2614a.l();
                        length5++;
                    }
                    k kVar2 = new k();
                    kVarArr2[length5] = kVar2;
                    c2614a.a(kVar2);
                    this.m = kVarArr2;
                    break;
                case 98:
                    if (this.n == null) {
                        this.n = new y();
                    }
                    c2614a.a(this.n);
                    break;
                case 106:
                    if (this.o == null) {
                        this.o = new p();
                    }
                    c2614a.a(this.o);
                    break;
                case 114:
                    int iA6 = C2764g.a(c2614a, 114);
                    n[] nVarArr = this.p;
                    int length6 = nVarArr == null ? 0 : nVarArr.length;
                    int i7 = iA6 + length6;
                    n[] nVarArr2 = new n[i7];
                    if (length6 != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        n nVar = new n();
                        nVarArr2[length6] = nVar;
                        c2614a.a(nVar);
                        c2614a.l();
                        length6++;
                    }
                    n nVar2 = new n();
                    nVarArr2[length6] = nVar2;
                    c2614a.a(nVar2);
                    this.p = nVarArr2;
                    break;
                case 122:
                    this.q = c2614a.k();
                    break;
                case 130:
                    this.r = c2614a.k();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.t = c2614a.c();
                    break;
                case 154:
                    this.u = c2614a.k();
                    break;
                case 162:
                    int iA7 = C2764g.a(c2614a, 162);
                    String[] strArr9 = this.v;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i8 = iA7 + length7;
                    String[] strArr10 = new String[i8];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i8 - 1) {
                        strArr10[length7] = c2614a.k();
                        c2614a.l();
                        length7++;
                    }
                    strArr10[length7] = c2614a.k();
                    this.v = strArr10;
                    break;
                case 170:
                    if (this.w == null) {
                        this.w = new r();
                    }
                    c2614a.a(this.w);
                    break;
                case 176:
                    this.x = c2614a.c();
                    break;
                case 186:
                    int iA8 = C2764g.a(c2614a, 186);
                    l[] lVarArr = this.y;
                    int length8 = lVarArr == null ? 0 : lVarArr.length;
                    int i9 = iA8 + length8;
                    l[] lVarArr2 = new l[i9];
                    if (length8 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length8);
                    }
                    while (length8 < i9 - 1) {
                        l lVar = new l();
                        lVarArr2[length8] = lVar;
                        c2614a.a(lVar);
                        c2614a.l();
                        length8++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length8] = lVar2;
                    c2614a.a(lVar2);
                    this.y = lVarArr2;
                    break;
                case 194:
                    if (this.z == null) {
                        this.z = new o();
                    }
                    c2614a.a(this.z);
                    break;
                case 202:
                    this.A = c2614a.k();
                    break;
                case 210:
                    this.B = c2614a.k();
                    break;
                case 218:
                    this.D = c2614a.k();
                    break;
                case 224:
                    this.F = c2614a.i();
                    break;
                case 232:
                    this.G = c2614a.i();
                    break;
                case 240:
                    this.H = c2614a.c();
                    break;
                case 250:
                    this.C = c2614a.k();
                    break;
                case 258:
                    if (this.I == null) {
                        this.I = new m();
                    }
                    c2614a.a(this.I);
                    break;
                case 266:
                    if (this.J == null) {
                        this.J = new j();
                    }
                    c2614a.a(this.J);
                    break;
                case 280:
                    this.K = c2614a.h();
                    break;
                case 288:
                    this.L = c2614a.h();
                    break;
                case 298:
                    if (this.M == null) {
                        this.M = new v();
                    }
                    c2614a.a(this.M);
                    break;
                case 306:
                    if (this.N == null) {
                        this.N = new u();
                    }
                    c2614a.a(this.N);
                    break;
                case 314:
                    if (this.O == null) {
                        this.O = new u();
                    }
                    c2614a.a(this.O);
                    break;
                case 330:
                    if (this.Q == null) {
                        this.Q = new s();
                    }
                    c2614a.a(this.Q);
                    break;
                case 338:
                    if (this.R == null) {
                        this.R = new c();
                    }
                    c2614a.a(this.R);
                    break;
                case 346:
                    if (this.P == null) {
                        this.P = new u();
                    }
                    c2614a.a(this.P);
                    break;
                case 354:
                    this.s = c2614a.k();
                    break;
                case 362:
                    if (this.S == null) {
                        this.S = new f();
                    }
                    c2614a.a(this.S);
                    break;
                case 370:
                    int iA9 = C2764g.a(c2614a, 370);
                    String[] strArr11 = this.j;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i10 = iA9 + length9;
                    String[] strArr12 = new String[i10];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i10 - 1) {
                        strArr12[length9] = c2614a.k();
                        c2614a.l();
                        length9++;
                    }
                    strArr12[length9] = c2614a.k();
                    this.j = strArr12;
                    break;
                case 378:
                    int iA10 = C2764g.a(c2614a, 378);
                    String[] strArr13 = this.T;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i11 = iA10 + length10;
                    String[] strArr14 = new String[i11];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i11 - 1) {
                        strArr14[length10] = c2614a.k();
                        c2614a.l();
                        length10++;
                    }
                    strArr14[length10] = c2614a.k();
                    this.T = strArr14;
                    break;
                case 386:
                    if (this.U == null) {
                        this.U = new b();
                    }
                    c2614a.a(this.U);
                    break;
                case 394:
                    this.E = c2614a.k();
                    break;
                case 410:
                    if (this.V == null) {
                        this.V = new a();
                    }
                    c2614a.a(this.V);
                    break;
                case 418:
                    if (this.W == null) {
                        this.W = new h();
                    }
                    c2614a.a(this.W);
                    break;
                case 426:
                    if (this.X == null) {
                        this.X = new g();
                    }
                    c2614a.a(this.X);
                    break;
                case 434:
                    int iA11 = C2764g.a(c2614a, 434);
                    d[] dVarArr = this.k;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i12 = iA11 + length11;
                    d[] dVarArr2 = new d[i12];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i12 - 1) {
                        d dVar = new d();
                        dVarArr2[length11] = dVar;
                        c2614a.a(dVar);
                        c2614a.l();
                        length11++;
                    }
                    d dVar2 = new d();
                    dVarArr2[length11] = dVar2;
                    c2614a.a(dVar2);
                    this.k = dVarArr2;
                    break;
                case 442:
                    if (this.Y == null) {
                        this.Y = new q();
                    }
                    c2614a.a(this.Y);
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
