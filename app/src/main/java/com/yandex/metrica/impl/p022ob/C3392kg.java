package com.yandex.metrica.impl.p022ob;

import com.facebook.crypto.mac.NativeMac;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.kg */
/* loaded from: classes2.dex */
public final class C3392kg extends AbstractC3219e {

    /* renamed from: A */
    public String f23923A;

    /* renamed from: B */
    public String f23924B;

    /* renamed from: C */
    public String f23925C;

    /* renamed from: D */
    public String f23926D;

    /* renamed from: E */
    public String f23927E;

    /* renamed from: F */
    public long f23928F;

    /* renamed from: G */
    public long f23929G;

    /* renamed from: H */
    public boolean f23930H;

    /* renamed from: I */
    public m f23931I;

    /* renamed from: J */
    public j f23932J;

    /* renamed from: K */
    public int f23933K;

    /* renamed from: L */
    public int f23934L;

    /* renamed from: M */
    public v f23935M;

    /* renamed from: N */
    public u f23936N;

    /* renamed from: O */
    public u f23937O;

    /* renamed from: P */
    public u f23938P;

    /* renamed from: Q */
    public s f23939Q;

    /* renamed from: R */
    public c f23940R;

    /* renamed from: S */
    public f f23941S;

    /* renamed from: T */
    public String[] f23942T;

    /* renamed from: U */
    public b f23943U;

    /* renamed from: V */
    public a f23944V;

    /* renamed from: W */
    public h f23945W;

    /* renamed from: X */
    public g f23946X;

    /* renamed from: Y */
    public q f23947Y;

    /* renamed from: b */
    public String f23948b;

    /* renamed from: c */
    public long f23949c;

    /* renamed from: d */
    public String[] f23950d;

    /* renamed from: e */
    public String f23951e;

    /* renamed from: f */
    public String f23952f;

    /* renamed from: g */
    public String[] f23953g;

    /* renamed from: h */
    public String[] f23954h;

    /* renamed from: i */
    public String[] f23955i;

    /* renamed from: j */
    public String[] f23956j;

    /* renamed from: k */
    public d[] f23957k;

    /* renamed from: l */
    public i f23958l;

    /* renamed from: m */
    public k[] f23959m;

    /* renamed from: n */
    public y f23960n;

    /* renamed from: o */
    public p f23961o;

    /* renamed from: p */
    public n[] f23962p;

    /* renamed from: q */
    public String f23963q;

    /* renamed from: r */
    public String f23964r;

    /* renamed from: s */
    public String f23965s;

    /* renamed from: t */
    public boolean f23966t;

    /* renamed from: u */
    public String f23967u;

    /* renamed from: v */
    public String[] f23968v;

    /* renamed from: w */
    public r f23969w;

    /* renamed from: x */
    public boolean f23970x;

    /* renamed from: y */
    public l[] f23971y;

    /* renamed from: z */
    public o f23972z;

    /* renamed from: com.yandex.metrica.impl.ob.kg$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public b[] f23973b;

        public a() {
            m16269b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            b[] bVarArr = this.f23973b;
            if (bVarArr == null || bVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                b[] bVarArr2 = this.f23973b;
                if (i >= bVarArr2.length) {
                    return;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    c3141b.m15647b(1, bVar);
                }
                i++;
            }
        }

        /* renamed from: b */
        public a m16269b() {
            this.f23973b = b.m16271c();
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$a */
        public static final class C7308a extends AbstractC3219e {

            /* renamed from: b */
            public String f23974b;

            public C7308a() {
                m16270b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                if (this.f23974b.equals("")) {
                    return;
                }
                c3141b.m15648b(1, this.f23974b);
            }

            /* renamed from: b */
            public C7308a m16270b() {
                this.f23974b = "";
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                if (this.f23974b.equals("")) {
                    return 0;
                }
                return C3141b.m15631a(1, this.f23974b);
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                while (true) {
                    int iM15594l = c3115a.m15594l();
                    if (iM15594l == 0) {
                        break;
                    }
                    if (iM15594l != 10) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f23974b = c3115a.m15593k();
                    }
                }
                return this;
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$a$b */
        public static final class b extends AbstractC3219e {

            /* renamed from: d */
            private static volatile b[] f23975d;

            /* renamed from: b */
            public String f23976b;

            /* renamed from: c */
            public C7308a f23977c;

            public b() {
                m16272b();
            }

            /* renamed from: c */
            public static b[] m16271c() {
                if (f23975d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f23975d == null) {
                                f23975d = new b[0];
                            }
                        } finally {
                        }
                    }
                }
                return f23975d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                if (!this.f23976b.equals("")) {
                    c3141b.m15648b(1, this.f23976b);
                }
                C7308a c7308a = this.f23977c;
                if (c7308a != null) {
                    c3141b.m15647b(2, c7308a);
                }
            }

            /* renamed from: b */
            public b m16272b() {
                this.f23976b = "";
                this.f23977c = null;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int iM15631a = !this.f23976b.equals("") ? C3141b.m15631a(1, this.f23976b) : 0;
                C7308a c7308a = this.f23977c;
                return c7308a != null ? iM15631a + C3141b.m15630a(2, c7308a) : iM15631a;
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
                        this.f23976b = c3115a.m15593k();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        if (this.f23977c == null) {
                            this.f23977c = new C7308a();
                        }
                        c3115a.m15577a(this.f23977c);
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            b[] bVarArr = this.f23973b;
            int i = 0;
            if (bVarArr == null || bVarArr.length <= 0) {
                return 0;
            }
            int iM15630a = 0;
            while (true) {
                b[] bVarArr2 = this.f23973b;
                if (i >= bVarArr2.length) {
                    return iM15630a;
                }
                b bVar = bVarArr2[i];
                if (bVar != null) {
                    iM15630a = C3141b.m15630a(1, bVar) + iM15630a;
                }
                i++;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l != 10) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 10);
                    b[] bVarArr = this.f23973b;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    int i = iM15952a + length;
                    b[] bVarArr2 = new b[i];
                    if (length != 0) {
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        b bVar = new b();
                        bVarArr2[length] = bVar;
                        c3115a.m15577a(bVar);
                        c3115a.m15594l();
                        length++;
                    }
                    b bVar2 = new b();
                    bVarArr2[length] = bVar2;
                    c3115a.m15577a(bVar2);
                    this.f23973b = bVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$j */
    public static final class j extends AbstractC3219e {

        /* renamed from: b */
        public long f24023b;

        public j() {
            m16282b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f24023b);
        }

        /* renamed from: b */
        public j m16282b() {
            this.f24023b = 900L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15629a(1, this.f24023b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l != 8) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24023b = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$n */
    public static final class n extends AbstractC3219e {

        /* renamed from: h */
        private static volatile n[] f24062h;

        /* renamed from: b */
        public String f24063b;

        /* renamed from: c */
        public String f24064c;

        /* renamed from: d */
        public String f24065d;

        /* renamed from: e */
        public a[] f24066e;

        /* renamed from: f */
        public long f24067f;

        /* renamed from: g */
        public int[] f24068g;

        public n() {
            m16295b();
        }

        /* renamed from: c */
        public static n[] m16294c() {
            if (f24062h == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f24062h == null) {
                            f24062h = new n[0];
                        }
                    } finally {
                    }
                }
            }
            return f24062h;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f24063b);
            c3141b.m15648b(2, this.f24064c);
            c3141b.m15648b(3, this.f24065d);
            a[] aVarArr = this.f24066e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.f24066e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        c3141b.m15647b(4, aVar);
                    }
                    i2++;
                }
            }
            c3141b.m15652c(5, this.f24067f);
            int[] iArr = this.f24068g;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            while (true) {
                int[] iArr2 = this.f24068g;
                if (i >= iArr2.length) {
                    return;
                }
                c3141b.m15654d(6, iArr2[i]);
                i++;
            }
        }

        /* renamed from: b */
        public n m16295b() {
            this.f24063b = "";
            this.f24064c = "";
            this.f24065d = "";
            this.f24066e = a.m16296c();
            this.f24067f = 0L;
            this.f24068g = C3271g.f23456a;
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$n$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile a[] f24069d;

            /* renamed from: b */
            public String f24070b;

            /* renamed from: c */
            public String f24071c;

            public a() {
                m16297b();
            }

            /* renamed from: c */
            public static a[] m16296c() {
                if (f24069d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f24069d == null) {
                                f24069d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f24069d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15648b(1, this.f24070b);
                c3141b.m15648b(2, this.f24071c);
            }

            /* renamed from: b */
            public a m16297b() {
                this.f24070b = "";
                this.f24071c = "";
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                return C3141b.m15631a(2, this.f24071c) + C3141b.m15631a(1, this.f24070b);
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
                        this.f24070b = c3115a.m15593k();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f24071c = c3115a.m15593k();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = C3141b.m15631a(3, this.f24065d) + C3141b.m15631a(2, this.f24064c) + C3141b.m15631a(1, this.f24063b);
            a[] aVarArr = this.f24066e;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    a[] aVarArr2 = this.f24066e;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        iM15631a = C3141b.m15630a(4, aVar) + iM15631a;
                    }
                    i2++;
                }
            }
            int iM15629a = C3141b.m15629a(5, this.f24067f) + iM15631a;
            int[] iArr = this.f24068g;
            if (iArr == null || iArr.length <= 0) {
                return iM15629a;
            }
            int iM15626a = 0;
            while (true) {
                int[] iArr2 = this.f24068g;
                if (i < iArr2.length) {
                    iM15626a += C3141b.m15626a(iArr2[i]);
                    i++;
                } else {
                    return iM15629a + iM15626a + iArr2.length;
                }
            }
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
                    this.f24063b = c3115a.m15593k();
                } else if (iM15594l == 18) {
                    this.f24064c = c3115a.m15593k();
                } else if (iM15594l == 26) {
                    this.f24065d = c3115a.m15593k();
                } else if (iM15594l == 34) {
                    int iM15952a = C3271g.m15952a(c3115a, 34);
                    a[] aVarArr = this.f24066e;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = iM15952a + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        c3115a.m15577a(aVar);
                        c3115a.m15594l();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    c3115a.m15577a(aVar2);
                    this.f24066e = aVarArr2;
                } else if (iM15594l == 40) {
                    this.f24067f = c3115a.m15591i();
                } else if (iM15594l == 48) {
                    int iM15952a2 = C3271g.m15952a(c3115a, 48);
                    int[] iArr = new int[iM15952a2];
                    int i2 = 0;
                    for (int i3 = 0; i3 < iM15952a2; i3++) {
                        if (i3 != 0) {
                            c3115a.m15594l();
                        }
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h == 1 || iM15590h == 2) {
                            iArr[i2] = iM15590h;
                            i2++;
                        }
                    }
                    if (i2 != 0) {
                        int[] iArr2 = this.f24068g;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 == 0 && i2 == iM15952a2) {
                            this.f24068g = iArr;
                        } else {
                            int[] iArr3 = new int[length2 + i2];
                            if (length2 != 0) {
                                System.arraycopy(iArr2, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i2);
                            this.f24068g = iArr3;
                        }
                    }
                } else if (iM15594l != 50) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15580c = c3115a.m15580c(c3115a.m15590h());
                    int iM15578b = c3115a.m15578b();
                    int i4 = 0;
                    while (c3115a.m15575a() > 0) {
                        int iM15590h2 = c3115a.m15590h();
                        if (iM15590h2 == 1 || iM15590h2 == 2) {
                            i4++;
                        }
                    }
                    if (i4 != 0) {
                        c3115a.m15585e(iM15578b);
                        int[] iArr4 = this.f24068g;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i4 + length3];
                        if (length3 != 0) {
                            System.arraycopy(iArr4, 0, iArr5, 0, length3);
                        }
                        while (c3115a.m15575a() > 0) {
                            int iM15590h3 = c3115a.m15590h();
                            if (iM15590h3 == 1 || iM15590h3 == 2) {
                                iArr5[length3] = iM15590h3;
                                length3++;
                            }
                        }
                        this.f24068g = iArr5;
                    }
                    c3115a.m15579b(iM15580c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$r */
    public static final class r extends AbstractC3219e {

        /* renamed from: b */
        public long f24087b;

        public r() {
            m16301b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f24087b);
        }

        /* renamed from: b */
        public r m16301b() {
            this.f24087b = 18000000L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15629a(1, this.f24087b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l != 8) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24087b = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$y */
    public static final class y extends AbstractC3219e {

        /* renamed from: b */
        public long f24121b;

        /* renamed from: c */
        public boolean f24122c;

        /* renamed from: d */
        public a[] f24123d;

        public y() {
            m16309b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f24121b);
            c3141b.m15649b(2, this.f24122c);
            a[] aVarArr = this.f24123d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f24123d;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c3141b.m15647b(5, aVar);
                }
                i++;
            }
        }

        /* renamed from: b */
        public y m16309b() {
            this.f24121b = 60000L;
            this.f24122c = false;
            this.f24123d = a.m16310c();
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$y$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile a[] f24124d;

            /* renamed from: b */
            public long f24125b;

            /* renamed from: c */
            public long f24126c;

            public a() {
                m16311b();
            }

            /* renamed from: c */
            public static a[] m16310c() {
                if (f24124d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f24124d == null) {
                                f24124d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f24124d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15652c(1, this.f24125b);
                c3141b.m15652c(2, this.f24126c);
            }

            /* renamed from: b */
            public a m16311b() {
                this.f24125b = 0L;
                this.f24126c = 0L;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                return C3141b.m15629a(2, this.f24126c) + C3141b.m15629a(1, this.f24125b);
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                while (true) {
                    int iM15594l = c3115a.m15594l();
                    if (iM15594l == 0) {
                        break;
                    }
                    if (iM15594l == 8) {
                        this.f24125b = c3115a.m15591i();
                    } else if (iM15594l != 16) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f24126c = c3115a.m15591i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15632a = C3141b.m15632a(2, this.f24122c) + C3141b.m15629a(1, this.f24121b);
            a[] aVarArr = this.f24123d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f24123d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iM15632a = C3141b.m15630a(5, aVar) + iM15632a;
                    }
                    i++;
                }
            }
            return iM15632a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24121b = c3115a.m15591i();
                } else if (iM15594l == 16) {
                    this.f24122c = c3115a.m15581c();
                } else if (iM15594l != 42) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 42);
                    a[] aVarArr = this.f24123d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    int i = iM15952a + length;
                    a[] aVarArr2 = new a[i];
                    if (length != 0) {
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        a aVar = new a();
                        aVarArr2[length] = aVar;
                        c3115a.m15577a(aVar);
                        c3115a.m15594l();
                        length++;
                    }
                    a aVar2 = new a();
                    aVarArr2[length] = aVar2;
                    c3115a.m15577a(aVar2);
                    this.f24123d = aVarArr2;
                }
            }
            return this;
        }
    }

    public C3392kg() {
        m16268b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        if (!this.f23948b.equals("")) {
            c3141b.m15648b(1, this.f23948b);
        }
        c3141b.m15652c(3, this.f23949c);
        String[] strArr = this.f23950d;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f23950d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    c3141b.m15648b(4, str);
                }
                i3++;
            }
        }
        if (!this.f23951e.equals("")) {
            c3141b.m15648b(5, this.f23951e);
        }
        if (!this.f23952f.equals("")) {
            c3141b.m15648b(6, this.f23952f);
        }
        String[] strArr3 = this.f23953g;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f23953g;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    c3141b.m15648b(7, str2);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f23954h;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.f23954h;
                if (i5 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i5];
                if (str3 != null) {
                    c3141b.m15648b(8, str3);
                }
                i5++;
            }
        }
        String[] strArr7 = this.f23955i;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f23955i;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    c3141b.m15648b(9, str4);
                }
                i6++;
            }
        }
        i iVar = this.f23958l;
        if (iVar != null) {
            c3141b.m15647b(10, iVar);
        }
        k[] kVarArr = this.f23959m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i7 = 0;
            while (true) {
                k[] kVarArr2 = this.f23959m;
                if (i7 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i7];
                if (kVar != null) {
                    c3141b.m15647b(11, kVar);
                }
                i7++;
            }
        }
        y yVar = this.f23960n;
        if (yVar != null) {
            c3141b.m15647b(12, yVar);
        }
        p pVar = this.f23961o;
        if (pVar != null) {
            c3141b.m15647b(13, pVar);
        }
        n[] nVarArr = this.f23962p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i8 = 0;
            while (true) {
                n[] nVarArr2 = this.f23962p;
                if (i8 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i8];
                if (nVar != null) {
                    c3141b.m15647b(14, nVar);
                }
                i8++;
            }
        }
        if (!this.f23963q.equals("")) {
            c3141b.m15648b(15, this.f23963q);
        }
        if (!this.f23964r.equals("")) {
            c3141b.m15648b(16, this.f23964r);
        }
        c3141b.m15649b(17, this.f23966t);
        if (!this.f23967u.equals("")) {
            c3141b.m15648b(19, this.f23967u);
        }
        String[] strArr9 = this.f23968v;
        if (strArr9 != null && strArr9.length > 0) {
            int i9 = 0;
            while (true) {
                String[] strArr10 = this.f23968v;
                if (i9 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i9];
                if (str5 != null) {
                    c3141b.m15648b(20, str5);
                }
                i9++;
            }
        }
        r rVar = this.f23969w;
        if (rVar != null) {
            c3141b.m15647b(21, rVar);
        }
        boolean z = this.f23970x;
        if (z) {
            c3141b.m15649b(22, z);
        }
        l[] lVarArr = this.f23971y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                l[] lVarArr2 = this.f23971y;
                if (i10 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i10];
                if (lVar != null) {
                    c3141b.m15647b(23, lVar);
                }
                i10++;
            }
        }
        o oVar = this.f23972z;
        if (oVar != null) {
            c3141b.m15647b(24, oVar);
        }
        if (!this.f23923A.equals("")) {
            c3141b.m15648b(25, this.f23923A);
        }
        if (!this.f23924B.equals("")) {
            c3141b.m15648b(26, this.f23924B);
        }
        if (!this.f23926D.equals("")) {
            c3141b.m15648b(27, this.f23926D);
        }
        c3141b.m15652c(28, this.f23928F);
        c3141b.m15652c(29, this.f23929G);
        boolean z2 = this.f23930H;
        if (z2) {
            c3141b.m15649b(30, z2);
        }
        if (!this.f23925C.equals("")) {
            c3141b.m15648b(31, this.f23925C);
        }
        m mVar = this.f23931I;
        if (mVar != null) {
            c3141b.m15647b(32, mVar);
        }
        j jVar = this.f23932J;
        if (jVar != null) {
            c3141b.m15647b(33, jVar);
        }
        c3141b.m15654d(35, this.f23933K);
        c3141b.m15654d(36, this.f23934L);
        v vVar = this.f23935M;
        if (vVar != null) {
            c3141b.m15647b(37, vVar);
        }
        u uVar = this.f23936N;
        if (uVar != null) {
            c3141b.m15647b(38, uVar);
        }
        u uVar2 = this.f23937O;
        if (uVar2 != null) {
            c3141b.m15647b(39, uVar2);
        }
        s sVar = this.f23939Q;
        if (sVar != null) {
            c3141b.m15647b(41, sVar);
        }
        c cVar = this.f23940R;
        if (cVar != null) {
            c3141b.m15647b(42, cVar);
        }
        u uVar3 = this.f23938P;
        if (uVar3 != null) {
            c3141b.m15647b(43, uVar3);
        }
        if (!this.f23965s.equals("")) {
            c3141b.m15648b(44, this.f23965s);
        }
        f fVar = this.f23941S;
        if (fVar != null) {
            c3141b.m15647b(45, fVar);
        }
        String[] strArr11 = this.f23956j;
        if (strArr11 != null && strArr11.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr12 = this.f23956j;
                if (i11 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i11];
                if (str6 != null) {
                    c3141b.m15648b(46, str6);
                }
                i11++;
            }
        }
        String[] strArr13 = this.f23942T;
        if (strArr13 != null && strArr13.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr14 = this.f23942T;
                if (i12 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i12];
                if (str7 != null) {
                    c3141b.m15648b(47, str7);
                }
                i12++;
            }
        }
        b bVar = this.f23943U;
        if (bVar != null) {
            c3141b.m15647b(48, bVar);
        }
        if (!this.f23927E.equals("")) {
            c3141b.m15648b(49, this.f23927E);
        }
        a aVar = this.f23944V;
        if (aVar != null) {
            c3141b.m15647b(51, aVar);
        }
        h hVar = this.f23945W;
        if (hVar != null) {
            c3141b.m15647b(52, hVar);
        }
        g gVar = this.f23946X;
        if (gVar != null) {
            c3141b.m15647b(53, gVar);
        }
        d[] dVarArr = this.f23957k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f23957k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    c3141b.m15647b(54, dVar);
                }
                i2++;
            }
        }
        q qVar = this.f23947Y;
        if (qVar != null) {
            c3141b.m15647b(55, qVar);
        }
    }

    /* renamed from: b */
    public C3392kg m16268b() {
        this.f23948b = "";
        this.f23949c = 0L;
        String[] strArr = C3271g.f23457b;
        this.f23950d = strArr;
        this.f23951e = "";
        this.f23952f = "";
        this.f23953g = strArr;
        this.f23954h = strArr;
        this.f23955i = strArr;
        this.f23956j = strArr;
        this.f23957k = d.m16275c();
        this.f23958l = null;
        this.f23959m = k.m16283c();
        this.f23960n = null;
        this.f23961o = null;
        this.f23962p = n.m16294c();
        this.f23963q = "";
        this.f23964r = "";
        this.f23965s = "";
        this.f23966t = false;
        this.f23967u = "";
        this.f23968v = strArr;
        this.f23969w = null;
        this.f23970x = false;
        this.f23971y = l.m16291c();
        this.f23972z = null;
        this.f23923A = "";
        this.f23924B = "";
        this.f23925C = "";
        this.f23926D = "";
        this.f23927E = "";
        this.f23928F = 0L;
        this.f23929G = 0L;
        this.f23930H = false;
        this.f23931I = null;
        this.f23932J = null;
        this.f23933K = 600;
        this.f23934L = 1;
        this.f23935M = null;
        this.f23936N = null;
        this.f23937O = null;
        this.f23938P = null;
        this.f23939Q = null;
        this.f23940R = null;
        this.f23941S = null;
        this.f23942T = strArr;
        this.f23943U = null;
        this.f23944V = null;
        this.f23945W = null;
        this.f23946X = null;
        this.f23947Y = null;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$g */
    public static final class g extends AbstractC3219e {

        /* renamed from: b */
        public long f23992b;

        public g() {
            m16279b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            long j = this.f23992b;
            if (j != 1209600) {
                c3141b.m15658e(1, j);
            }
        }

        /* renamed from: b */
        public g m16279b() {
            this.f23992b = 1209600L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            long j = this.f23992b;
            if (j != 1209600) {
                return C3141b.m15640b(1, j);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l != 8) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23992b = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$l */
    public static final class l extends AbstractC3219e {

        /* renamed from: d */
        private static volatile l[] f24057d;

        /* renamed from: b */
        public String f24058b;

        /* renamed from: c */
        public boolean f24059c;

        public l() {
            m16292b();
        }

        /* renamed from: c */
        public static l[] m16291c() {
            if (f24057d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f24057d == null) {
                            f24057d = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return f24057d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f24058b);
            c3141b.m15649b(2, this.f24059c);
        }

        /* renamed from: b */
        public l m16292b() {
            this.f24058b = "";
            this.f24059c = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15632a(2, this.f24059c) + C3141b.m15631a(1, this.f24058b);
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
                    this.f24058b = c3115a.m15593k();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24059c = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$m */
    public static final class m extends AbstractC3219e {

        /* renamed from: b */
        public long f24060b;

        /* renamed from: c */
        public long f24061c;

        public m() {
            m16293b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f24060b);
            c3141b.m15652c(2, this.f24061c);
        }

        /* renamed from: b */
        public m m16293b() {
            this.f24060b = 86400L;
            this.f24061c = 432000L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15629a(2, this.f24061c) + C3141b.m15629a(1, this.f24060b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24060b = c3115a.m15591i();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24061c = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$q */
    public static final class q extends AbstractC3219e {

        /* renamed from: b */
        public int f24086b;

        public q() {
            m16300b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            int i = this.f24086b;
            if (i != 86400) {
                c3141b.m15659f(1, i);
            }
        }

        /* renamed from: b */
        public q m16300b() {
            this.f24086b = RemoteMessageConst.DEFAULT_TTL;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = this.f24086b;
            if (i != 86400) {
                return C3141b.m15642c(1, i);
            }
            return 0;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l != 8) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24086b = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$w */
    public static final class w extends AbstractC3219e {

        /* renamed from: b */
        public boolean f24116b;

        /* renamed from: c */
        public boolean f24117c;

        public w() {
            m16306b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15649b(1, this.f24116b);
            c3141b.m15649b(2, this.f24117c);
        }

        /* renamed from: b */
        public w m16306b() {
            this.f24116b = true;
            this.f24117c = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15632a(2, this.f24117c) + C3141b.m15632a(1, this.f24116b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24116b = c3115a.m15581c();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24117c = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$x */
    public static final class x extends AbstractC3219e {

        /* renamed from: d */
        private static volatile x[] f24118d;

        /* renamed from: b */
        public int f24119b;

        /* renamed from: c */
        public String f24120c;

        public x() {
            m16308b();
        }

        /* renamed from: c */
        public static x[] m16307c() {
            if (f24118d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f24118d == null) {
                            f24118d = new x[0];
                        }
                    } finally {
                    }
                }
            }
            return f24118d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15654d(1, this.f24119b);
            c3141b.m15648b(2, this.f24120c);
        }

        /* renamed from: b */
        public x m16308b() {
            this.f24119b = 0;
            this.f24120c = "";
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15631a(2, this.f24120c) + C3141b.m15628a(1, this.f24119b);
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                        this.f24119b = iM15590h;
                    }
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24120c = c3115a.m15593k();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$e */
    public static final class e extends AbstractC3219e {

        /* renamed from: b */
        public long f23987b;

        /* renamed from: c */
        public int f23988c;

        public e() {
            m16277b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f23987b);
            int i = this.f23988c;
            if (i != 86400) {
                c3141b.m15654d(2, i);
            }
        }

        /* renamed from: b */
        public e m16277b() {
            this.f23987b = 0L;
            this.f23988c = RemoteMessageConst.DEFAULT_TTL;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15629a = C3141b.m15629a(1, this.f23987b);
            int i = this.f23988c;
            return i != 86400 ? iM15629a + C3141b.m15628a(2, i) : iM15629a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f23987b = c3115a.m15591i();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23988c = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public int f23978b;

        /* renamed from: c */
        public int f23979c;

        public b() {
            m16273b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            int i = this.f23978b;
            if (i != 86400) {
                c3141b.m15654d(1, i);
            }
            int i2 = this.f23979c;
            if (i2 != 86400) {
                c3141b.m15654d(2, i2);
            }
        }

        /* renamed from: b */
        public b m16273b() {
            this.f23978b = RemoteMessageConst.DEFAULT_TTL;
            this.f23979c = RemoteMessageConst.DEFAULT_TTL;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = this.f23978b;
            int iM15628a = i != 86400 ? C3141b.m15628a(1, i) : 0;
            int i2 = this.f23979c;
            return i2 != 86400 ? iM15628a + C3141b.m15628a(2, i2) : iM15628a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f23978b = c3115a.m15590h();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23979c = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$k */
    public static final class k extends AbstractC3219e {

        /* renamed from: d */
        private static volatile k[] f24024d;

        /* renamed from: b */
        public a f24025b;

        /* renamed from: c */
        public b f24026c;

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: b */
            public long f24027b;

            /* renamed from: c */
            public float f24028c;

            /* renamed from: d */
            public int f24029d;

            /* renamed from: e */
            public int f24030e;

            /* renamed from: f */
            public long f24031f;

            /* renamed from: g */
            public int f24032g;

            /* renamed from: h */
            public boolean f24033h;

            /* renamed from: i */
            public boolean f24034i;

            /* renamed from: j */
            public boolean f24035j;

            /* renamed from: k */
            public long f24036k;

            /* renamed from: l */
            public C7309a f24037l;

            /* renamed from: m */
            public C7309a f24038m;

            /* renamed from: n */
            public C7309a f24039n;

            /* renamed from: o */
            public C7309a f24040o;

            /* renamed from: p */
            public b f24041p;

            /* renamed from: q */
            public boolean f24042q;

            /* renamed from: r */
            public boolean f24043r;

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a */
            public static final class C7309a extends AbstractC3219e {

                /* renamed from: b */
                public boolean f24044b;

                /* renamed from: c */
                public boolean f24045c;

                /* renamed from: d */
                public C7310a f24046d;

                public C7309a() {
                    m16286b();
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public void mo14343a(C3141b c3141b) throws IOException {
                    c3141b.m15649b(1, this.f24044b);
                    c3141b.m15649b(2, this.f24045c);
                    C7310a c7310a = this.f24046d;
                    if (c7310a != null) {
                        c3141b.m15647b(3, c7310a);
                    }
                }

                /* renamed from: b */
                public C7309a m16286b() {
                    this.f24044b = true;
                    this.f24045c = false;
                    this.f24046d = null;
                    this.f23283a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$a$a */
                public static final class C7310a extends AbstractC3219e {

                    /* renamed from: b */
                    public long f24047b;

                    /* renamed from: c */
                    public long f24048c;

                    public C7310a() {
                        m16287b();
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public void mo14343a(C3141b c3141b) throws IOException {
                        c3141b.m15652c(1, this.f24047b);
                        c3141b.m15652c(2, this.f24048c);
                    }

                    /* renamed from: b */
                    public C7310a m16287b() {
                        this.f24047b = 0L;
                        this.f24048c = 0L;
                        this.f23283a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public int mo14341a() {
                        return C3141b.m15629a(2, this.f24048c) + C3141b.m15629a(1, this.f24047b);
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                        while (true) {
                            int iM15594l = c3115a.m15594l();
                            if (iM15594l == 0) {
                                break;
                            }
                            if (iM15594l == 8) {
                                this.f24047b = c3115a.m15591i();
                            } else if (iM15594l != 16) {
                                if (!c3115a.m15587f(iM15594l)) {
                                    break;
                                }
                            } else {
                                this.f24048c = c3115a.m15591i();
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public int mo14341a() {
                    int iM15632a = C3141b.m15632a(2, this.f24045c) + C3141b.m15632a(1, this.f24044b);
                    C7310a c7310a = this.f24046d;
                    return c7310a != null ? iM15632a + C3141b.m15630a(3, c7310a) : iM15632a;
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                    while (true) {
                        int iM15594l = c3115a.m15594l();
                        if (iM15594l == 0) {
                            break;
                        }
                        if (iM15594l == 8) {
                            this.f24044b = c3115a.m15581c();
                        } else if (iM15594l == 16) {
                            this.f24045c = c3115a.m15581c();
                        } else if (iM15594l != 26) {
                            if (!c3115a.m15587f(iM15594l)) {
                                break;
                            }
                        } else {
                            if (this.f24046d == null) {
                                this.f24046d = new C7310a();
                            }
                            c3115a.m15577a(this.f24046d);
                        }
                    }
                    return this;
                }
            }

            public a() {
                m16285b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15652c(1, this.f24027b);
                c3141b.m15644a(2, this.f24028c);
                c3141b.m15654d(3, this.f24029d);
                c3141b.m15654d(4, this.f24030e);
                c3141b.m15652c(5, this.f24031f);
                c3141b.m15654d(6, this.f24032g);
                c3141b.m15649b(7, this.f24033h);
                c3141b.m15649b(8, this.f24034i);
                c3141b.m15652c(9, this.f24036k);
                C7309a c7309a = this.f24037l;
                if (c7309a != null) {
                    c3141b.m15647b(10, c7309a);
                }
                C7309a c7309a2 = this.f24038m;
                if (c7309a2 != null) {
                    c3141b.m15647b(11, c7309a2);
                }
                C7309a c7309a3 = this.f24039n;
                if (c7309a3 != null) {
                    c3141b.m15647b(12, c7309a3);
                }
                c3141b.m15649b(13, this.f24035j);
                C7309a c7309a4 = this.f24040o;
                if (c7309a4 != null) {
                    c3141b.m15647b(14, c7309a4);
                }
                b bVar = this.f24041p;
                if (bVar != null) {
                    c3141b.m15647b(15, bVar);
                }
                boolean z = this.f24042q;
                if (z) {
                    c3141b.m15649b(16, z);
                }
                boolean z2 = this.f24043r;
                if (z2) {
                    c3141b.m15649b(17, z2);
                }
            }

            /* renamed from: b */
            public a m16285b() {
                this.f24027b = 5000L;
                this.f24028c = 10.0f;
                this.f24029d = 20;
                this.f24030e = 200;
                this.f24031f = 60000L;
                this.f24032g = 10000;
                this.f24033h = false;
                this.f24034i = false;
                this.f24035j = true;
                this.f24036k = 60000L;
                this.f24037l = null;
                this.f24038m = null;
                this.f24039n = null;
                this.f24040o = null;
                this.f24041p = null;
                this.f24042q = false;
                this.f24043r = false;
                this.f23283a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b */
            public static final class b extends AbstractC3219e {

                /* renamed from: b */
                public boolean f24049b;

                /* renamed from: c */
                public boolean f24050c;

                /* renamed from: d */
                public C7311a f24051d;

                public b() {
                    m16288b();
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public void mo14343a(C3141b c3141b) throws IOException {
                    c3141b.m15649b(1, this.f24049b);
                    c3141b.m15649b(2, this.f24050c);
                    C7311a c7311a = this.f24051d;
                    if (c7311a != null) {
                        c3141b.m15647b(3, c7311a);
                    }
                }

                /* renamed from: b */
                public b m16288b() {
                    this.f24049b = true;
                    this.f24050c = false;
                    this.f24051d = null;
                    this.f23283a = -1;
                    return this;
                }

                /* renamed from: com.yandex.metrica.impl.ob.kg$k$a$b$a */
                public static final class C7311a extends AbstractC3219e {

                    /* renamed from: b */
                    public long f24052b;

                    /* renamed from: c */
                    public long f24053c;

                    /* renamed from: d */
                    public int f24054d;

                    public C7311a() {
                        m16289b();
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public void mo14343a(C3141b c3141b) throws IOException {
                        c3141b.m15652c(1, this.f24052b);
                        c3141b.m15652c(2, this.f24053c);
                        c3141b.m15654d(3, this.f24054d);
                    }

                    /* renamed from: b */
                    public C7311a m16289b() {
                        this.f24052b = 0L;
                        this.f24053c = 0L;
                        this.f24054d = 0;
                        this.f23283a = -1;
                        return this;
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public int mo14341a() {
                        return C3141b.m15628a(3, this.f24054d) + C3141b.m15629a(2, this.f24053c) + C3141b.m15629a(1, this.f24052b);
                    }

                    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                    /* renamed from: a */
                    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                        while (true) {
                            int iM15594l = c3115a.m15594l();
                            if (iM15594l == 0) {
                                break;
                            }
                            if (iM15594l == 8) {
                                this.f24052b = c3115a.m15591i();
                            } else if (iM15594l == 16) {
                                this.f24053c = c3115a.m15591i();
                            } else if (iM15594l != 24) {
                                if (!c3115a.m15587f(iM15594l)) {
                                    break;
                                }
                            } else {
                                int iM15590h = c3115a.m15590h();
                                if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                                    this.f24054d = iM15590h;
                                }
                            }
                        }
                        return this;
                    }
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public int mo14341a() {
                    int iM15632a = C3141b.m15632a(2, this.f24050c) + C3141b.m15632a(1, this.f24049b);
                    C7311a c7311a = this.f24051d;
                    return c7311a != null ? iM15632a + C3141b.m15630a(3, c7311a) : iM15632a;
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                    while (true) {
                        int iM15594l = c3115a.m15594l();
                        if (iM15594l == 0) {
                            break;
                        }
                        if (iM15594l == 8) {
                            this.f24049b = c3115a.m15581c();
                        } else if (iM15594l == 16) {
                            this.f24050c = c3115a.m15581c();
                        } else if (iM15594l != 26) {
                            if (!c3115a.m15587f(iM15594l)) {
                                break;
                            }
                        } else {
                            if (this.f24051d == null) {
                                this.f24051d = new C7311a();
                            }
                            c3115a.m15577a(this.f24051d);
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int iM15629a = C3141b.m15629a(9, this.f24036k) + C3141b.m15632a(8, this.f24034i) + C3141b.m15632a(7, this.f24033h) + C3141b.m15628a(6, this.f24032g) + C3141b.m15629a(5, this.f24031f) + C3141b.m15628a(4, this.f24030e) + C3141b.m15628a(3, this.f24029d) + C3141b.m15641c(2) + 4 + C3141b.m15629a(1, this.f24027b);
                C7309a c7309a = this.f24037l;
                if (c7309a != null) {
                    iM15629a += C3141b.m15630a(10, c7309a);
                }
                C7309a c7309a2 = this.f24038m;
                if (c7309a2 != null) {
                    iM15629a += C3141b.m15630a(11, c7309a2);
                }
                C7309a c7309a3 = this.f24039n;
                if (c7309a3 != null) {
                    iM15629a += C3141b.m15630a(12, c7309a3);
                }
                int iM15632a = C3141b.m15632a(13, this.f24035j) + iM15629a;
                C7309a c7309a4 = this.f24040o;
                if (c7309a4 != null) {
                    iM15632a += C3141b.m15630a(14, c7309a4);
                }
                b bVar = this.f24041p;
                if (bVar != null) {
                    iM15632a += C3141b.m15630a(15, bVar);
                }
                boolean z = this.f24042q;
                if (z) {
                    iM15632a += C3141b.m15632a(16, z);
                }
                boolean z2 = this.f24043r;
                return z2 ? iM15632a + C3141b.m15632a(17, z2) : iM15632a;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                while (true) {
                    int iM15594l = c3115a.m15594l();
                    switch (iM15594l) {
                        case 0:
                            break;
                        case 8:
                            this.f24027b = c3115a.m15591i();
                            break;
                        case 21:
                            this.f24028c = Float.intBitsToFloat(c3115a.m15586f());
                            break;
                        case 24:
                            this.f24029d = c3115a.m15590h();
                            break;
                        case 32:
                            this.f24030e = c3115a.m15590h();
                            break;
                        case C5043c9.f31376L /* 40 */:
                            this.f24031f = c3115a.m15591i();
                            break;
                        case 48:
                            this.f24032g = c3115a.m15590h();
                            break;
                        case 56:
                            this.f24033h = c3115a.m15581c();
                            break;
                        case NativeMac.KEY_LENGTH /* 64 */:
                            this.f24034i = c3115a.m15581c();
                            break;
                        case 72:
                            this.f24036k = c3115a.m15591i();
                            break;
                        case 82:
                            if (this.f24037l == null) {
                                this.f24037l = new C7309a();
                            }
                            c3115a.m15577a(this.f24037l);
                            break;
                        case 90:
                            if (this.f24038m == null) {
                                this.f24038m = new C7309a();
                            }
                            c3115a.m15577a(this.f24038m);
                            break;
                        case 98:
                            if (this.f24039n == null) {
                                this.f24039n = new C7309a();
                            }
                            c3115a.m15577a(this.f24039n);
                            break;
                        case 104:
                            this.f24035j = c3115a.m15581c();
                            break;
                        case 114:
                            if (this.f24040o == null) {
                                this.f24040o = new C7309a();
                            }
                            c3115a.m15577a(this.f24040o);
                            break;
                        case 122:
                            if (this.f24041p == null) {
                                this.f24041p = new b();
                            }
                            c3115a.m15577a(this.f24041p);
                            break;
                        case 128:
                            this.f24042q = c3115a.m15581c();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                            this.f24043r = c3115a.m15581c();
                            break;
                        default:
                            if (!c3115a.m15587f(iM15594l)) {
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
            m16284b();
        }

        /* renamed from: c */
        public static k[] m16283c() {
            if (f24024d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f24024d == null) {
                            f24024d = new k[0];
                        }
                    } finally {
                    }
                }
            }
            return f24024d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            a aVar = this.f24025b;
            if (aVar != null) {
                c3141b.m15647b(1, aVar);
            }
            b bVar = this.f24026c;
            if (bVar != null) {
                c3141b.m15647b(2, bVar);
            }
        }

        /* renamed from: b */
        public k m16284b() {
            this.f24025b = null;
            this.f24026c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            a aVar = this.f24025b;
            int iM15630a = aVar != null ? C3141b.m15630a(1, aVar) : 0;
            b bVar = this.f24026c;
            return bVar != null ? iM15630a + C3141b.m15630a(2, bVar) : iM15630a;
        }

        /* renamed from: com.yandex.metrica.impl.ob.kg$k$b */
        public static final class b extends AbstractC3219e {

            /* renamed from: b */
            public int[] f24055b;

            /* renamed from: c */
            public int[] f24056c;

            public b() {
                m16290b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                int[] iArr = this.f24055b;
                int i = 0;
                if (iArr != null && iArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr2 = this.f24055b;
                        if (i2 >= iArr2.length) {
                            break;
                        }
                        c3141b.m15654d(1, iArr2[i2]);
                        i2++;
                    }
                }
                int[] iArr3 = this.f24056c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return;
                }
                while (true) {
                    int[] iArr4 = this.f24056c;
                    if (i >= iArr4.length) {
                        return;
                    }
                    c3141b.m15654d(2, iArr4[i]);
                    i++;
                }
            }

            /* renamed from: b */
            public b m16290b() {
                int[] iArr = C3271g.f23456a;
                this.f24055b = iArr;
                this.f24056c = iArr;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int length;
                int[] iArr;
                int[] iArr2 = this.f24055b;
                int i = 0;
                if (iArr2 == null || iArr2.length <= 0) {
                    length = 0;
                } else {
                    int i2 = 0;
                    int iM15626a = 0;
                    while (true) {
                        iArr = this.f24055b;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        iM15626a += C3141b.m15626a(iArr[i2]);
                        i2++;
                    }
                    length = iM15626a + iArr.length;
                }
                int[] iArr3 = this.f24056c;
                if (iArr3 == null || iArr3.length <= 0) {
                    return length;
                }
                int iM15626a2 = 0;
                while (true) {
                    int[] iArr4 = this.f24056c;
                    if (i < iArr4.length) {
                        iM15626a2 += C3141b.m15626a(iArr4[i]);
                        i++;
                    } else {
                        return length + iM15626a2 + iArr4.length;
                    }
                }
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                while (true) {
                    int iM15594l = c3115a.m15594l();
                    if (iM15594l == 0) {
                        break;
                    }
                    if (iM15594l == 8) {
                        int iM15952a = C3271g.m15952a(c3115a, 8);
                        int[] iArr = new int[iM15952a];
                        int i = 0;
                        for (int i2 = 0; i2 < iM15952a; i2++) {
                            if (i2 != 0) {
                                c3115a.m15594l();
                            }
                            int iM15590h = c3115a.m15590h();
                            if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3 || iM15590h == 4) {
                                iArr[i] = iM15590h;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.f24055b;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == iM15952a) {
                                this.f24055b = iArr;
                            } else {
                                int[] iArr3 = new int[length + i];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.f24055b = iArr3;
                            }
                        }
                    } else if (iM15594l == 10) {
                        int iM15580c = c3115a.m15580c(c3115a.m15590h());
                        int iM15578b = c3115a.m15578b();
                        int i3 = 0;
                        while (c3115a.m15575a() > 0) {
                            int iM15590h2 = c3115a.m15590h();
                            if (iM15590h2 == 0 || iM15590h2 == 1 || iM15590h2 == 2 || iM15590h2 == 3 || iM15590h2 == 4) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            c3115a.m15585e(iM15578b);
                            int[] iArr4 = this.f24055b;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i3 + length2];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (c3115a.m15575a() > 0) {
                                int iM15590h3 = c3115a.m15590h();
                                if (iM15590h3 == 0 || iM15590h3 == 1 || iM15590h3 == 2 || iM15590h3 == 3 || iM15590h3 == 4) {
                                    iArr5[length2] = iM15590h3;
                                    length2++;
                                }
                            }
                            this.f24055b = iArr5;
                        }
                        c3115a.m15579b(iM15580c);
                    } else if (iM15594l == 16) {
                        int iM15952a2 = C3271g.m15952a(c3115a, 16);
                        int[] iArr6 = new int[iM15952a2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < iM15952a2; i5++) {
                            if (i5 != 0) {
                                c3115a.m15594l();
                            }
                            int iM15590h4 = c3115a.m15590h();
                            if (iM15590h4 == 0 || iM15590h4 == 2 || iM15590h4 == 3) {
                                iArr6[i4] = iM15590h4;
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            int[] iArr7 = this.f24056c;
                            int length3 = iArr7 == null ? 0 : iArr7.length;
                            if (length3 == 0 && i4 == iM15952a2) {
                                this.f24056c = iArr6;
                            } else {
                                int[] iArr8 = new int[length3 + i4];
                                if (length3 != 0) {
                                    System.arraycopy(iArr7, 0, iArr8, 0, length3);
                                }
                                System.arraycopy(iArr6, 0, iArr8, length3, i4);
                                this.f24056c = iArr8;
                            }
                        }
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        int iM15580c2 = c3115a.m15580c(c3115a.m15590h());
                        int iM15578b2 = c3115a.m15578b();
                        int i6 = 0;
                        while (c3115a.m15575a() > 0) {
                            int iM15590h5 = c3115a.m15590h();
                            if (iM15590h5 == 0 || iM15590h5 == 2 || iM15590h5 == 3) {
                                i6++;
                            }
                        }
                        if (i6 != 0) {
                            c3115a.m15585e(iM15578b2);
                            int[] iArr9 = this.f24056c;
                            int length4 = iArr9 == null ? 0 : iArr9.length;
                            int[] iArr10 = new int[i6 + length4];
                            if (length4 != 0) {
                                System.arraycopy(iArr9, 0, iArr10, 0, length4);
                            }
                            while (c3115a.m15575a() > 0) {
                                int iM15590h6 = c3115a.m15590h();
                                if (iM15590h6 == 0 || iM15590h6 == 2 || iM15590h6 == 3) {
                                    iArr10[length4] = iM15590h6;
                                    length4++;
                                }
                            }
                            this.f24056c = iArr10;
                        }
                        c3115a.m15579b(iM15580c2);
                    }
                }
                return this;
            }
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
                    if (this.f24025b == null) {
                        this.f24025b = new a();
                    }
                    c3115a.m15577a(this.f24025b);
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f24026c == null) {
                        this.f24026c = new b();
                    }
                    c3115a.m15577a(this.f24026c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$s */
    public static final class s extends AbstractC3219e {

        /* renamed from: b */
        public t f24088b;

        /* renamed from: c */
        public t f24089c;

        public s() {
            m16302b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            t tVar = this.f24088b;
            if (tVar != null) {
                c3141b.m15647b(1, tVar);
            }
            t tVar2 = this.f24089c;
            if (tVar2 != null) {
                c3141b.m15647b(2, tVar2);
            }
        }

        /* renamed from: b */
        public s m16302b() {
            this.f24088b = null;
            this.f24089c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            t tVar = this.f24088b;
            int iM15630a = tVar != null ? C3141b.m15630a(1, tVar) : 0;
            t tVar2 = this.f24089c;
            return tVar2 != null ? iM15630a + C3141b.m15630a(2, tVar2) : iM15630a;
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
                    if (this.f24088b == null) {
                        this.f24088b = new t();
                    }
                    c3115a.m15577a(this.f24088b);
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f24089c == null) {
                        this.f24089c = new t();
                    }
                    c3115a.m15577a(this.f24089c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$t */
    public static final class t extends AbstractC3219e {

        /* renamed from: b */
        public int f24090b;

        /* renamed from: c */
        public long f24091c;

        public t() {
            m16303b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            int i = this.f24090b;
            if (i != 100) {
                c3141b.m15654d(1, i);
            }
            long j = this.f24091c;
            if (j != 60) {
                c3141b.m15652c(2, j);
            }
        }

        /* renamed from: b */
        public t m16303b() {
            this.f24090b = 100;
            this.f24091c = 60L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = this.f24090b;
            int iM15628a = i != 100 ? C3141b.m15628a(1, i) : 0;
            long j = this.f24091c;
            return j != 60 ? iM15628a + C3141b.m15629a(2, j) : iM15628a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24090b = c3115a.m15590h();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24091c = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$d */
    public static final class d extends AbstractC3219e {

        /* renamed from: d */
        private static volatile d[] f23984d;

        /* renamed from: b */
        public String f23985b;

        /* renamed from: c */
        public String[] f23986c;

        public d() {
            m16276b();
        }

        /* renamed from: c */
        public static d[] m16275c() {
            if (f23984d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f23984d == null) {
                            f23984d = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return f23984d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!this.f23985b.equals("")) {
                c3141b.m15648b(1, this.f23985b);
            }
            String[] strArr = this.f23986c;
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                String[] strArr2 = this.f23986c;
                if (i >= strArr2.length) {
                    return;
                }
                String str = strArr2[i];
                if (str != null) {
                    c3141b.m15648b(2, str);
                }
                i++;
            }
        }

        /* renamed from: b */
        public d m16276b() {
            this.f23985b = "";
            this.f23986c = C3271g.f23457b;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = 0;
            int iM15631a = !this.f23985b.equals("") ? C3141b.m15631a(1, this.f23985b) : 0;
            String[] strArr = this.f23986c;
            if (strArr == null || strArr.length <= 0) {
                return iM15631a;
            }
            int iM15636a = 0;
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f23986c;
                if (i >= strArr2.length) {
                    return iM15631a + iM15636a + i2;
                }
                String str = strArr2[i];
                if (str != null) {
                    i2++;
                    iM15636a = C3141b.m15636a(str) + iM15636a;
                }
                i++;
            }
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
                    this.f23985b = c3115a.m15593k();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 18);
                    String[] strArr = this.f23986c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = iM15952a + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = c3115a.m15593k();
                        c3115a.m15594l();
                        length++;
                    }
                    strArr2[length] = c3115a.m15593k();
                    this.f23986c = strArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$f */
    public static final class f extends AbstractC3219e {

        /* renamed from: b */
        public e f23989b;

        /* renamed from: c */
        public e f23990c;

        /* renamed from: d */
        public e f23991d;

        public f() {
            m16278b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            e eVar = this.f23989b;
            if (eVar != null) {
                c3141b.m15647b(1, eVar);
            }
            e eVar2 = this.f23990c;
            if (eVar2 != null) {
                c3141b.m15647b(2, eVar2);
            }
            e eVar3 = this.f23991d;
            if (eVar3 != null) {
                c3141b.m15647b(3, eVar3);
            }
        }

        /* renamed from: b */
        public f m16278b() {
            this.f23989b = null;
            this.f23990c = null;
            this.f23991d = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            e eVar = this.f23989b;
            int iM15630a = eVar != null ? C3141b.m15630a(1, eVar) : 0;
            e eVar2 = this.f23990c;
            if (eVar2 != null) {
                iM15630a += C3141b.m15630a(2, eVar2);
            }
            e eVar3 = this.f23991d;
            return eVar3 != null ? iM15630a + C3141b.m15630a(3, eVar3) : iM15630a;
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
                    if (this.f23989b == null) {
                        this.f23989b = new e();
                    }
                    c3115a.m15577a(this.f23989b);
                } else if (iM15594l == 18) {
                    if (this.f23990c == null) {
                        this.f23990c = new e();
                    }
                    c3115a.m15577a(this.f23990c);
                } else if (iM15594l != 26) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f23991d == null) {
                        this.f23991d = new e();
                    }
                    c3115a.m15577a(this.f23991d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$c */
    public static final class c extends AbstractC3219e {

        /* renamed from: b */
        public long f23980b;

        /* renamed from: c */
        public long f23981c;

        /* renamed from: d */
        public long f23982d;

        /* renamed from: e */
        public long f23983e;

        public c() {
            m16274b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            long j = this.f23980b;
            if (j != 10000) {
                c3141b.m15652c(1, j);
            }
            long j2 = this.f23981c;
            if (j2 != 10000) {
                c3141b.m15652c(2, j2);
            }
            long j3 = this.f23982d;
            if (j3 != 10000) {
                c3141b.m15652c(3, j3);
            }
            long j4 = this.f23983e;
            if (j4 != 10000) {
                c3141b.m15652c(4, j4);
            }
        }

        /* renamed from: b */
        public c m16274b() {
            this.f23980b = 10000L;
            this.f23981c = 10000L;
            this.f23982d = 10000L;
            this.f23983e = 10000L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            long j = this.f23980b;
            int iM15629a = j != 10000 ? C3141b.m15629a(1, j) : 0;
            long j2 = this.f23981c;
            if (j2 != 10000) {
                iM15629a += C3141b.m15629a(2, j2);
            }
            long j3 = this.f23982d;
            if (j3 != 10000) {
                iM15629a += C3141b.m15629a(3, j3);
            }
            long j4 = this.f23983e;
            return j4 != 10000 ? iM15629a + C3141b.m15629a(4, j4) : iM15629a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f23980b = c3115a.m15591i();
                } else if (iM15594l == 16) {
                    this.f23981c = c3115a.m15591i();
                } else if (iM15594l == 24) {
                    this.f23982d = c3115a.m15591i();
                } else if (iM15594l != 32) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23983e = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$o */
    public static final class o extends AbstractC3219e {

        /* renamed from: b */
        public long f24072b;

        /* renamed from: c */
        public long f24073c;

        /* renamed from: d */
        public long f24074d;

        /* renamed from: e */
        public long f24075e;

        public o() {
            m16298b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            long j = this.f24072b;
            if (j != 432000000) {
                c3141b.m15652c(1, j);
            }
            long j2 = this.f24073c;
            if (j2 != 86400000) {
                c3141b.m15652c(2, j2);
            }
            long j3 = this.f24074d;
            if (j3 != 10000) {
                c3141b.m15652c(3, j3);
            }
            long j4 = this.f24075e;
            if (j4 != 3600000) {
                c3141b.m15652c(4, j4);
            }
        }

        /* renamed from: b */
        public o m16298b() {
            this.f24072b = 432000000L;
            this.f24073c = 86400000L;
            this.f24074d = 10000L;
            this.f24075e = 3600000L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            long j = this.f24072b;
            int iM15629a = j != 432000000 ? C3141b.m15629a(1, j) : 0;
            long j2 = this.f24073c;
            if (j2 != 86400000) {
                iM15629a += C3141b.m15629a(2, j2);
            }
            long j3 = this.f24074d;
            if (j3 != 10000) {
                iM15629a += C3141b.m15629a(3, j3);
            }
            long j4 = this.f24075e;
            return j4 != 3600000 ? iM15629a + C3141b.m15629a(4, j4) : iM15629a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24072b = c3115a.m15591i();
                } else if (iM15594l == 16) {
                    this.f24073c = c3115a.m15591i();
                } else if (iM15594l == 24) {
                    this.f24074d = c3115a.m15591i();
                } else if (iM15594l != 32) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f24075e = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$h */
    public static final class h extends AbstractC3219e {

        /* renamed from: b */
        public String f23993b;

        /* renamed from: c */
        public int f23994c;

        /* renamed from: d */
        public int f23995d;

        /* renamed from: e */
        public boolean f23996e;

        /* renamed from: f */
        public boolean f23997f;

        public h() {
            m16280b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!this.f23993b.equals("")) {
                c3141b.m15648b(1, this.f23993b);
            }
            int i = this.f23994c;
            if (i != 600) {
                c3141b.m15659f(2, i);
            }
            int i2 = this.f23995d;
            if (i2 != 300) {
                c3141b.m15659f(3, i2);
            }
            boolean z = this.f23996e;
            if (z) {
                c3141b.m15649b(4, z);
            }
            boolean z2 = this.f23997f;
            if (!z2) {
                c3141b.m15649b(5, z2);
            }
        }

        /* renamed from: b */
        public h m16280b() {
            this.f23993b = "";
            this.f23994c = 600;
            this.f23995d = 300;
            this.f23996e = false;
            this.f23997f = true;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15631a = !this.f23993b.equals("") ? C3141b.m15631a(1, this.f23993b) : 0;
            int i = this.f23994c;
            if (i != 600) {
                iM15631a += C3141b.m15642c(2, i);
            }
            int i2 = this.f23995d;
            if (i2 != 300) {
                iM15631a += C3141b.m15642c(3, i2);
            }
            boolean z = this.f23996e;
            if (z) {
                iM15631a += C3141b.m15632a(4, z);
            }
            boolean z2 = this.f23997f;
            return !z2 ? iM15631a + C3141b.m15632a(5, z2) : iM15631a;
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
                    this.f23993b = c3115a.m15593k();
                } else if (iM15594l == 16) {
                    this.f23994c = c3115a.m15590h();
                } else if (iM15594l == 24) {
                    this.f23995d = c3115a.m15590h();
                } else if (iM15594l == 32) {
                    this.f23996e = c3115a.m15581c();
                } else if (iM15594l != 40) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f23997f = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$v */
    public static final class v extends AbstractC3219e {

        /* renamed from: b */
        public int f24108b;

        /* renamed from: c */
        public int f24109c;

        /* renamed from: d */
        public int f24110d;

        /* renamed from: e */
        public long f24111e;

        /* renamed from: f */
        public boolean f24112f;

        /* renamed from: g */
        public boolean f24113g;

        /* renamed from: h */
        public boolean f24114h;

        /* renamed from: i */
        public x[] f24115i;

        public v() {
            m16305b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15654d(1, this.f24108b);
            c3141b.m15654d(2, this.f24109c);
            c3141b.m15654d(3, this.f24110d);
            c3141b.m15652c(4, this.f24111e);
            c3141b.m15649b(5, this.f24112f);
            c3141b.m15649b(6, this.f24113g);
            c3141b.m15649b(7, this.f24114h);
            x[] xVarArr = this.f24115i;
            if (xVarArr == null || xVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                x[] xVarArr2 = this.f24115i;
                if (i >= xVarArr2.length) {
                    return;
                }
                x xVar = xVarArr2[i];
                if (xVar != null) {
                    c3141b.m15647b(8, xVar);
                }
                i++;
            }
        }

        /* renamed from: b */
        public v m16305b() {
            this.f24108b = 10000;
            this.f24109c = 1000;
            this.f24110d = 100;
            this.f24111e = 5000L;
            this.f24112f = true;
            this.f24113g = false;
            this.f24114h = true;
            this.f24115i = x.m16307c();
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15632a = C3141b.m15632a(7, this.f24114h) + C3141b.m15632a(6, this.f24113g) + C3141b.m15632a(5, this.f24112f) + C3141b.m15629a(4, this.f24111e) + C3141b.m15628a(3, this.f24110d) + C3141b.m15628a(2, this.f24109c) + C3141b.m15628a(1, this.f24108b);
            x[] xVarArr = this.f24115i;
            if (xVarArr != null && xVarArr.length > 0) {
                int i = 0;
                while (true) {
                    x[] xVarArr2 = this.f24115i;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i];
                    if (xVar != null) {
                        iM15632a = C3141b.m15630a(8, xVar) + iM15632a;
                    }
                    i++;
                }
            }
            return iM15632a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 8) {
                    this.f24108b = c3115a.m15590h();
                } else if (iM15594l == 16) {
                    this.f24109c = c3115a.m15590h();
                } else if (iM15594l == 24) {
                    this.f24110d = c3115a.m15590h();
                } else if (iM15594l == 32) {
                    this.f24111e = c3115a.m15591i();
                } else if (iM15594l == 40) {
                    this.f24112f = c3115a.m15581c();
                } else if (iM15594l == 48) {
                    this.f24113g = c3115a.m15581c();
                } else if (iM15594l == 56) {
                    this.f24114h = c3115a.m15581c();
                } else if (iM15594l != 66) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 66);
                    x[] xVarArr = this.f24115i;
                    int length = xVarArr == null ? 0 : xVarArr.length;
                    int i = iM15952a + length;
                    x[] xVarArr2 = new x[i];
                    if (length != 0) {
                        System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        x xVar = new x();
                        xVarArr2[length] = xVar;
                        c3115a.m15577a(xVar);
                        c3115a.m15594l();
                        length++;
                    }
                    x xVar2 = new x();
                    xVarArr2[length] = xVar2;
                    c3115a.m15577a(xVar2);
                    this.f24115i = xVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.kg$p */
    public static final class p extends AbstractC3219e {

        /* renamed from: b */
        public long f24076b;

        /* renamed from: c */
        public String f24077c;

        /* renamed from: d */
        public int[] f24078d;

        /* renamed from: e */
        public int[] f24079e;

        /* renamed from: f */
        public long f24080f;

        /* renamed from: g */
        public int f24081g;

        /* renamed from: h */
        public long f24082h;

        /* renamed from: i */
        public long f24083i;

        /* renamed from: j */
        public long f24084j;

        /* renamed from: k */
        public long f24085k;

        public p() {
            m16299b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15652c(1, this.f24076b);
            c3141b.m15648b(2, this.f24077c);
            int[] iArr = this.f24078d;
            int i = 0;
            if (iArr != null && iArr.length > 0) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.f24078d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    c3141b.m15654d(3, iArr2[i2]);
                    i2++;
                }
            }
            c3141b.m15652c(4, this.f24080f);
            c3141b.m15654d(5, this.f24081g);
            long j = this.f24082h;
            if (j != 43200) {
                c3141b.m15652c(6, j);
            }
            long j2 = this.f24083i;
            if (j2 != 3600) {
                c3141b.m15652c(7, j2);
            }
            long j3 = this.f24084j;
            if (j3 != 86400) {
                c3141b.m15652c(8, j3);
            }
            int[] iArr3 = this.f24079e;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.f24079e;
                    if (i >= iArr4.length) {
                        break;
                    }
                    c3141b.m15654d(9, iArr4[i]);
                    i++;
                }
            }
            long j4 = this.f24085k;
            if (j4 != 30) {
                c3141b.m15652c(10, j4);
            }
        }

        /* renamed from: b */
        public p m16299b() {
            this.f24076b = 0L;
            this.f24077c = "";
            int[] iArr = C3271g.f23456a;
            this.f24078d = iArr;
            this.f24079e = iArr;
            this.f24080f = 259200L;
            this.f24081g = 10;
            this.f24082h = 43200L;
            this.f24083i = 3600L;
            this.f24084j = 86400L;
            this.f24085k = 30L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int[] iArr;
            int[] iArr2;
            int iM15631a = C3141b.m15631a(2, this.f24077c) + C3141b.m15629a(1, this.f24076b);
            int[] iArr3 = this.f24078d;
            int i = 0;
            if (iArr3 != null && iArr3.length > 0) {
                int i2 = 0;
                int iM15626a = 0;
                while (true) {
                    iArr2 = this.f24078d;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    iM15626a += C3141b.m15626a(iArr2[i2]);
                    i2++;
                }
                iM15631a = iM15631a + iM15626a + iArr2.length;
            }
            int iM15628a = C3141b.m15628a(5, this.f24081g) + C3141b.m15629a(4, this.f24080f) + iM15631a;
            long j = this.f24082h;
            if (j != 43200) {
                iM15628a += C3141b.m15629a(6, j);
            }
            long j2 = this.f24083i;
            if (j2 != 3600) {
                iM15628a += C3141b.m15629a(7, j2);
            }
            long j3 = this.f24084j;
            if (j3 != 86400) {
                iM15628a += C3141b.m15629a(8, j3);
            }
            int[] iArr4 = this.f24079e;
            if (iArr4 != null && iArr4.length > 0) {
                int iM15626a2 = 0;
                while (true) {
                    iArr = this.f24079e;
                    if (i >= iArr.length) {
                        break;
                    }
                    iM15626a2 += C3141b.m15626a(iArr[i]);
                    i++;
                }
                iM15628a = iM15628a + iM15626a2 + iArr.length;
            }
            long j4 = this.f24085k;
            return j4 != 30 ? iM15628a + C3141b.m15629a(10, j4) : iM15628a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                switch (iM15594l) {
                    case 0:
                        break;
                    case 8:
                        this.f24076b = c3115a.m15591i();
                        break;
                    case 18:
                        this.f24077c = c3115a.m15593k();
                        break;
                    case 24:
                        int iM15952a = C3271g.m15952a(c3115a, 24);
                        int[] iArr = this.f24078d;
                        int length = iArr == null ? 0 : iArr.length;
                        int i = iM15952a + length;
                        int[] iArr2 = new int[i];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i - 1) {
                            iArr2[length] = c3115a.m15590h();
                            c3115a.m15594l();
                            length++;
                        }
                        iArr2[length] = c3115a.m15590h();
                        this.f24078d = iArr2;
                        break;
                    case 26:
                        int iM15580c = c3115a.m15580c(c3115a.m15590h());
                        int iM15578b = c3115a.m15578b();
                        int i2 = 0;
                        while (c3115a.m15575a() > 0) {
                            c3115a.m15590h();
                            i2++;
                        }
                        c3115a.m15585e(iM15578b);
                        int[] iArr3 = this.f24078d;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i3 = i2 + length2;
                        int[] iArr4 = new int[i3];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            iArr4[length2] = c3115a.m15590h();
                            length2++;
                        }
                        this.f24078d = iArr4;
                        c3115a.m15579b(iM15580c);
                        break;
                    case 32:
                        this.f24080f = c3115a.m15591i();
                        break;
                    case C5043c9.f31376L /* 40 */:
                        this.f24081g = c3115a.m15590h();
                        break;
                    case 48:
                        this.f24082h = c3115a.m15591i();
                        break;
                    case 56:
                        this.f24083i = c3115a.m15591i();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.f24084j = c3115a.m15591i();
                        break;
                    case 72:
                        int iM15952a2 = C3271g.m15952a(c3115a, 72);
                        int[] iArr5 = this.f24079e;
                        int length3 = iArr5 == null ? 0 : iArr5.length;
                        int i4 = iM15952a2 + length3;
                        int[] iArr6 = new int[i4];
                        if (length3 != 0) {
                            System.arraycopy(iArr5, 0, iArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            iArr6[length3] = c3115a.m15590h();
                            c3115a.m15594l();
                            length3++;
                        }
                        iArr6[length3] = c3115a.m15590h();
                        this.f24079e = iArr6;
                        break;
                    case 74:
                        int iM15580c2 = c3115a.m15580c(c3115a.m15590h());
                        int iM15578b2 = c3115a.m15578b();
                        int i5 = 0;
                        while (c3115a.m15575a() > 0) {
                            c3115a.m15590h();
                            i5++;
                        }
                        c3115a.m15585e(iM15578b2);
                        int[] iArr7 = this.f24079e;
                        int length4 = iArr7 == null ? 0 : iArr7.length;
                        int i6 = i5 + length4;
                        int[] iArr8 = new int[i6];
                        if (length4 != 0) {
                            System.arraycopy(iArr7, 0, iArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            iArr8[length4] = c3115a.m15590h();
                            length4++;
                        }
                        this.f24079e = iArr8;
                        c3115a.m15579b(iM15580c2);
                        break;
                    case 80:
                        this.f24085k = c3115a.m15591i();
                        break;
                    default:
                        if (!c3115a.m15587f(iM15594l)) {
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
    public static final class i extends AbstractC3219e {

        /* renamed from: b */
        public boolean f23998b;

        /* renamed from: c */
        public boolean f23999c;

        /* renamed from: d */
        public boolean f24000d;

        /* renamed from: e */
        public boolean f24001e;

        /* renamed from: f */
        public boolean f24002f;

        /* renamed from: g */
        public boolean f24003g;

        /* renamed from: h */
        public boolean f24004h;

        /* renamed from: i */
        public boolean f24005i;

        /* renamed from: j */
        public boolean f24006j;

        /* renamed from: k */
        public boolean f24007k;

        /* renamed from: l */
        public boolean f24008l;

        /* renamed from: m */
        public boolean f24009m;

        /* renamed from: n */
        public boolean f24010n;

        /* renamed from: o */
        public boolean f24011o;

        /* renamed from: p */
        public boolean f24012p;

        /* renamed from: q */
        public boolean f24013q;

        /* renamed from: r */
        public boolean f24014r;

        /* renamed from: s */
        public boolean f24015s;

        /* renamed from: t */
        public boolean f24016t;

        /* renamed from: u */
        public boolean f24017u;

        /* renamed from: v */
        public boolean f24018v;

        /* renamed from: w */
        public boolean f24019w;

        /* renamed from: x */
        public boolean f24020x;

        /* renamed from: y */
        public boolean f24021y;

        /* renamed from: z */
        public int f24022z;

        public i() {
            m16281b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15649b(1, this.f23998b);
            c3141b.m15649b(2, this.f23999c);
            c3141b.m15649b(3, this.f24000d);
            c3141b.m15649b(4, this.f24001e);
            c3141b.m15649b(6, this.f24002f);
            c3141b.m15649b(8, this.f24003g);
            c3141b.m15649b(9, this.f24004h);
            c3141b.m15649b(11, this.f24005i);
            c3141b.m15649b(12, this.f24006j);
            c3141b.m15649b(15, this.f24007k);
            c3141b.m15649b(16, this.f24008l);
            c3141b.m15649b(18, this.f24009m);
            c3141b.m15649b(19, this.f24010n);
            c3141b.m15649b(20, this.f24011o);
            c3141b.m15649b(21, this.f24012p);
            c3141b.m15649b(22, this.f24013q);
            c3141b.m15649b(23, this.f24014r);
            c3141b.m15649b(24, this.f24015s);
            c3141b.m15649b(25, this.f24016t);
            c3141b.m15649b(26, this.f24017u);
            c3141b.m15649b(27, this.f24018v);
            c3141b.m15649b(28, this.f24019w);
            boolean z = this.f24020x;
            if (z) {
                c3141b.m15649b(29, z);
            }
            boolean z2 = this.f24021y;
            if (z2) {
                c3141b.m15649b(33, z2);
            }
            int i = this.f24022z;
            if (i != -1) {
                c3141b.m15654d(34, i);
            }
        }

        /* renamed from: b */
        public i m16281b() {
            this.f23998b = false;
            this.f23999c = false;
            this.f24000d = false;
            this.f24001e = false;
            this.f24002f = false;
            this.f24003g = false;
            this.f24004h = false;
            this.f24005i = false;
            this.f24006j = false;
            this.f24007k = false;
            this.f24008l = true;
            this.f24009m = false;
            this.f24010n = false;
            this.f24011o = false;
            this.f24012p = false;
            this.f24013q = false;
            this.f24014r = false;
            this.f24015s = false;
            this.f24016t = false;
            this.f24017u = false;
            this.f24018v = true;
            this.f24019w = false;
            this.f24020x = false;
            this.f24021y = false;
            this.f24022z = -1;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15632a = C3141b.m15632a(28, this.f24019w) + C3141b.m15632a(27, this.f24018v) + C3141b.m15632a(26, this.f24017u) + C3141b.m15632a(25, this.f24016t) + C3141b.m15632a(24, this.f24015s) + C3141b.m15632a(23, this.f24014r) + C3141b.m15632a(22, this.f24013q) + C3141b.m15632a(21, this.f24012p) + C3141b.m15632a(20, this.f24011o) + C3141b.m15632a(19, this.f24010n) + C3141b.m15632a(18, this.f24009m) + C3141b.m15632a(16, this.f24008l) + C3141b.m15632a(15, this.f24007k) + C3141b.m15632a(12, this.f24006j) + C3141b.m15632a(11, this.f24005i) + C3141b.m15632a(9, this.f24004h) + C3141b.m15632a(8, this.f24003g) + C3141b.m15632a(6, this.f24002f) + C3141b.m15632a(4, this.f24001e) + C3141b.m15632a(3, this.f24000d) + C3141b.m15632a(2, this.f23999c) + C3141b.m15632a(1, this.f23998b);
            boolean z = this.f24020x;
            if (z) {
                iM15632a += C3141b.m15632a(29, z);
            }
            boolean z2 = this.f24021y;
            if (z2) {
                iM15632a += C3141b.m15632a(33, z2);
            }
            int i = this.f24022z;
            return i != -1 ? iM15632a + C3141b.m15628a(34, i) : iM15632a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                switch (iM15594l) {
                    case 0:
                        break;
                    case 8:
                        this.f23998b = c3115a.m15581c();
                        break;
                    case 16:
                        this.f23999c = c3115a.m15581c();
                        break;
                    case 24:
                        this.f24000d = c3115a.m15581c();
                        break;
                    case 32:
                        this.f24001e = c3115a.m15581c();
                        break;
                    case 48:
                        this.f24002f = c3115a.m15581c();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.f24003g = c3115a.m15581c();
                        break;
                    case 72:
                        this.f24004h = c3115a.m15581c();
                        break;
                    case 88:
                        this.f24005i = c3115a.m15581c();
                        break;
                    case 96:
                        this.f24006j = c3115a.m15581c();
                        break;
                    case 120:
                        this.f24007k = c3115a.m15581c();
                        break;
                    case 128:
                        this.f24008l = c3115a.m15581c();
                        break;
                    case 144:
                        this.f24009m = c3115a.m15581c();
                        break;
                    case 152:
                        this.f24010n = c3115a.m15581c();
                        break;
                    case 160:
                        this.f24011o = c3115a.m15581c();
                        break;
                    case 168:
                        this.f24012p = c3115a.m15581c();
                        break;
                    case 176:
                        this.f24013q = c3115a.m15581c();
                        break;
                    case 184:
                        this.f24014r = c3115a.m15581c();
                        break;
                    case 192:
                        this.f24015s = c3115a.m15581c();
                        break;
                    case 200:
                        this.f24016t = c3115a.m15581c();
                        break;
                    case 208:
                        this.f24017u = c3115a.m15581c();
                        break;
                    case 216:
                        this.f24018v = c3115a.m15581c();
                        break;
                    case 224:
                        this.f24019w = c3115a.m15581c();
                        break;
                    case 232:
                        this.f24020x = c3115a.m15581c();
                        break;
                    case 264:
                        this.f24021y = c3115a.m15581c();
                        break;
                    case 272:
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h != -1 && iM15590h != 0 && iM15590h != 1) {
                            break;
                        } else {
                            this.f24022z = iM15590h;
                            break;
                        }
                        break;
                    default:
                        if (!c3115a.m15587f(iM15594l)) {
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
    public static final class u extends AbstractC3219e {

        /* renamed from: b */
        public boolean f24092b;

        /* renamed from: c */
        public boolean f24093c;

        /* renamed from: d */
        public boolean f24094d;

        /* renamed from: e */
        public boolean f24095e;

        /* renamed from: f */
        public int f24096f;

        /* renamed from: g */
        public int f24097g;

        /* renamed from: h */
        public int f24098h;

        /* renamed from: i */
        public int f24099i;

        /* renamed from: j */
        public boolean f24100j;

        /* renamed from: k */
        public boolean f24101k;

        /* renamed from: l */
        public boolean f24102l;

        /* renamed from: m */
        public boolean f24103m;

        /* renamed from: n */
        public x[] f24104n;

        /* renamed from: o */
        public boolean f24105o;

        /* renamed from: p */
        public boolean f24106p;

        /* renamed from: q */
        public int f24107q;

        public u() {
            m16304b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            boolean z = this.f24092b;
            if (!z) {
                c3141b.m15649b(1, z);
            }
            boolean z2 = this.f24093c;
            if (!z2) {
                c3141b.m15649b(2, z2);
            }
            boolean z3 = this.f24094d;
            if (!z3) {
                c3141b.m15649b(3, z3);
            }
            boolean z4 = this.f24095e;
            if (!z4) {
                c3141b.m15649b(4, z4);
            }
            int i = this.f24096f;
            if (i != 10000) {
                c3141b.m15654d(5, i);
            }
            int i2 = this.f24097g;
            if (i2 != 1000) {
                c3141b.m15654d(6, i2);
            }
            int i3 = this.f24098h;
            if (i3 != 1000) {
                c3141b.m15654d(7, i3);
            }
            int i4 = this.f24099i;
            if (i4 != 200000) {
                c3141b.m15654d(8, i4);
            }
            boolean z5 = this.f24100j;
            if (z5) {
                c3141b.m15649b(9, z5);
            }
            boolean z6 = this.f24101k;
            if (z6) {
                c3141b.m15649b(10, z6);
            }
            boolean z7 = this.f24102l;
            if (z7) {
                c3141b.m15649b(11, z7);
            }
            boolean z8 = this.f24103m;
            if (z8) {
                c3141b.m15649b(12, z8);
            }
            x[] xVarArr = this.f24104n;
            if (xVarArr != null && xVarArr.length > 0) {
                int i5 = 0;
                while (true) {
                    x[] xVarArr2 = this.f24104n;
                    if (i5 >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i5];
                    if (xVar != null) {
                        c3141b.m15647b(13, xVar);
                    }
                    i5++;
                }
            }
            boolean z9 = this.f24105o;
            if (z9) {
                c3141b.m15649b(14, z9);
            }
            boolean z10 = this.f24106p;
            if (z10) {
                c3141b.m15649b(15, z10);
            }
            int i6 = this.f24107q;
            if (i6 != 4000) {
                c3141b.m15654d(16, i6);
            }
        }

        /* renamed from: b */
        public u m16304b() {
            this.f24092b = true;
            this.f24093c = true;
            this.f24094d = true;
            this.f24095e = true;
            this.f24096f = 10000;
            this.f24097g = 1000;
            this.f24098h = 1000;
            this.f24099i = 200000;
            this.f24100j = false;
            this.f24101k = false;
            this.f24102l = false;
            this.f24103m = false;
            this.f24104n = x.m16307c();
            this.f24105o = false;
            this.f24106p = false;
            this.f24107q = 4000;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            boolean z = this.f24092b;
            int i = 0;
            int iM15632a = !z ? C3141b.m15632a(1, z) : 0;
            boolean z2 = this.f24093c;
            if (!z2) {
                iM15632a += C3141b.m15632a(2, z2);
            }
            boolean z3 = this.f24094d;
            if (!z3) {
                iM15632a += C3141b.m15632a(3, z3);
            }
            boolean z4 = this.f24095e;
            if (!z4) {
                iM15632a += C3141b.m15632a(4, z4);
            }
            int i2 = this.f24096f;
            if (i2 != 10000) {
                iM15632a += C3141b.m15628a(5, i2);
            }
            int i3 = this.f24097g;
            if (i3 != 1000) {
                iM15632a += C3141b.m15628a(6, i3);
            }
            int i4 = this.f24098h;
            if (i4 != 1000) {
                iM15632a += C3141b.m15628a(7, i4);
            }
            int i5 = this.f24099i;
            if (i5 != 200000) {
                iM15632a += C3141b.m15628a(8, i5);
            }
            boolean z5 = this.f24100j;
            if (z5) {
                iM15632a += C3141b.m15632a(9, z5);
            }
            boolean z6 = this.f24101k;
            if (z6) {
                iM15632a += C3141b.m15632a(10, z6);
            }
            boolean z7 = this.f24102l;
            if (z7) {
                iM15632a += C3141b.m15632a(11, z7);
            }
            boolean z8 = this.f24103m;
            if (z8) {
                iM15632a += C3141b.m15632a(12, z8);
            }
            x[] xVarArr = this.f24104n;
            if (xVarArr != null && xVarArr.length > 0) {
                while (true) {
                    x[] xVarArr2 = this.f24104n;
                    if (i >= xVarArr2.length) {
                        break;
                    }
                    x xVar = xVarArr2[i];
                    if (xVar != null) {
                        iM15632a = C3141b.m15630a(13, xVar) + iM15632a;
                    }
                    i++;
                }
            }
            boolean z9 = this.f24105o;
            if (z9) {
                iM15632a += C3141b.m15632a(14, z9);
            }
            boolean z10 = this.f24106p;
            if (z10) {
                iM15632a += C3141b.m15632a(15, z10);
            }
            int i6 = this.f24107q;
            return i6 != 4000 ? iM15632a + C3141b.m15628a(16, i6) : iM15632a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                switch (iM15594l) {
                    case 0:
                        break;
                    case 8:
                        this.f24092b = c3115a.m15581c();
                        break;
                    case 16:
                        this.f24093c = c3115a.m15581c();
                        break;
                    case 24:
                        this.f24094d = c3115a.m15581c();
                        break;
                    case 32:
                        this.f24095e = c3115a.m15581c();
                        break;
                    case C5043c9.f31376L /* 40 */:
                        this.f24096f = c3115a.m15590h();
                        break;
                    case 48:
                        this.f24097g = c3115a.m15590h();
                        break;
                    case 56:
                        this.f24098h = c3115a.m15590h();
                        break;
                    case NativeMac.KEY_LENGTH /* 64 */:
                        this.f24099i = c3115a.m15590h();
                        break;
                    case 72:
                        this.f24100j = c3115a.m15581c();
                        break;
                    case 80:
                        this.f24101k = c3115a.m15581c();
                        break;
                    case 88:
                        this.f24102l = c3115a.m15581c();
                        break;
                    case 96:
                        this.f24103m = c3115a.m15581c();
                        break;
                    case 106:
                        int iM15952a = C3271g.m15952a(c3115a, 106);
                        x[] xVarArr = this.f24104n;
                        int length = xVarArr == null ? 0 : xVarArr.length;
                        int i = iM15952a + length;
                        x[] xVarArr2 = new x[i];
                        if (length != 0) {
                            System.arraycopy(xVarArr, 0, xVarArr2, 0, length);
                        }
                        while (length < i - 1) {
                            x xVar = new x();
                            xVarArr2[length] = xVar;
                            c3115a.m15577a(xVar);
                            c3115a.m15594l();
                            length++;
                        }
                        x xVar2 = new x();
                        xVarArr2[length] = xVar2;
                        c3115a.m15577a(xVar2);
                        this.f24104n = xVarArr2;
                        break;
                    case 112:
                        this.f24105o = c3115a.m15581c();
                        break;
                    case 120:
                        this.f24106p = c3115a.m15581c();
                        break;
                    case 128:
                        this.f24107q = c3115a.m15590h();
                        break;
                    default:
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int i2 = 0;
        int iM15629a = C3141b.m15629a(3, this.f23949c) + (!this.f23948b.equals("") ? C3141b.m15631a(1, this.f23948b) : 0);
        String[] strArr = this.f23950d;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int iM15636a = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f23950d;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i4++;
                    iM15636a += C3141b.m15636a(str);
                }
                i3++;
            }
            iM15629a = iM15629a + iM15636a + i4;
        }
        if (!this.f23951e.equals("")) {
            iM15629a += C3141b.m15631a(5, this.f23951e);
        }
        if (!this.f23952f.equals("")) {
            iM15629a += C3141b.m15631a(6, this.f23952f);
        }
        String[] strArr3 = this.f23953g;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int iM15636a2 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.f23953g;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i5];
                if (str2 != null) {
                    i6++;
                    iM15636a2 += C3141b.m15636a(str2);
                }
                i5++;
            }
            iM15629a = iM15629a + iM15636a2 + i6;
        }
        String[] strArr5 = this.f23954h;
        if (strArr5 != null && strArr5.length > 0) {
            int i7 = 0;
            int iM15636a3 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr6 = this.f23954h;
                if (i7 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i7];
                if (str3 != null) {
                    i8++;
                    iM15636a3 += C3141b.m15636a(str3);
                }
                i7++;
            }
            iM15629a = iM15629a + iM15636a3 + i8;
        }
        String[] strArr7 = this.f23955i;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            int iM15636a4 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr8 = this.f23955i;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    i10++;
                    iM15636a4 += C3141b.m15636a(str4);
                }
                i9++;
            }
            iM15629a = iM15629a + iM15636a4 + i10;
        }
        i iVar = this.f23958l;
        if (iVar != null) {
            iM15629a += C3141b.m15630a(10, iVar);
        }
        k[] kVarArr = this.f23959m;
        if (kVarArr != null && kVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                k[] kVarArr2 = this.f23959m;
                if (i11 >= kVarArr2.length) {
                    break;
                }
                k kVar = kVarArr2[i11];
                if (kVar != null) {
                    iM15629a = C3141b.m15630a(11, kVar) + iM15629a;
                }
                i11++;
            }
        }
        y yVar = this.f23960n;
        if (yVar != null) {
            iM15629a += C3141b.m15630a(12, yVar);
        }
        p pVar = this.f23961o;
        if (pVar != null) {
            iM15629a += C3141b.m15630a(13, pVar);
        }
        n[] nVarArr = this.f23962p;
        if (nVarArr != null && nVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                n[] nVarArr2 = this.f23962p;
                if (i12 >= nVarArr2.length) {
                    break;
                }
                n nVar = nVarArr2[i12];
                if (nVar != null) {
                    iM15629a = C3141b.m15630a(14, nVar) + iM15629a;
                }
                i12++;
            }
        }
        if (!this.f23963q.equals("")) {
            iM15629a += C3141b.m15631a(15, this.f23963q);
        }
        if (!this.f23964r.equals("")) {
            iM15629a += C3141b.m15631a(16, this.f23964r);
        }
        int iM15632a = C3141b.m15632a(17, this.f23966t) + iM15629a;
        if (!this.f23967u.equals("")) {
            iM15632a += C3141b.m15631a(19, this.f23967u);
        }
        String[] strArr9 = this.f23968v;
        if (strArr9 != null && strArr9.length > 0) {
            int i13 = 0;
            int iM15636a5 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr10 = this.f23968v;
                if (i13 >= strArr10.length) {
                    break;
                }
                String str5 = strArr10[i13];
                if (str5 != null) {
                    i14++;
                    iM15636a5 += C3141b.m15636a(str5);
                }
                i13++;
            }
            iM15632a = iM15632a + iM15636a5 + (i14 * 2);
        }
        r rVar = this.f23969w;
        if (rVar != null) {
            iM15632a += C3141b.m15630a(21, rVar);
        }
        boolean z = this.f23970x;
        if (z) {
            iM15632a += C3141b.m15632a(22, z);
        }
        l[] lVarArr = this.f23971y;
        if (lVarArr != null && lVarArr.length > 0) {
            int i15 = 0;
            while (true) {
                l[] lVarArr2 = this.f23971y;
                if (i15 >= lVarArr2.length) {
                    break;
                }
                l lVar = lVarArr2[i15];
                if (lVar != null) {
                    iM15632a = C3141b.m15630a(23, lVar) + iM15632a;
                }
                i15++;
            }
        }
        o oVar = this.f23972z;
        if (oVar != null) {
            iM15632a += C3141b.m15630a(24, oVar);
        }
        if (!this.f23923A.equals("")) {
            iM15632a += C3141b.m15631a(25, this.f23923A);
        }
        if (!this.f23924B.equals("")) {
            iM15632a += C3141b.m15631a(26, this.f23924B);
        }
        if (!this.f23926D.equals("")) {
            iM15632a += C3141b.m15631a(27, this.f23926D);
        }
        int iM15629a2 = C3141b.m15629a(29, this.f23929G) + C3141b.m15629a(28, this.f23928F) + iM15632a;
        boolean z2 = this.f23930H;
        if (z2) {
            iM15629a2 += C3141b.m15632a(30, z2);
        }
        if (!this.f23925C.equals("")) {
            iM15629a2 += C3141b.m15631a(31, this.f23925C);
        }
        m mVar = this.f23931I;
        if (mVar != null) {
            iM15629a2 += C3141b.m15630a(32, mVar);
        }
        j jVar = this.f23932J;
        if (jVar != null) {
            iM15629a2 += C3141b.m15630a(33, jVar);
        }
        int iM15628a = C3141b.m15628a(36, this.f23934L) + C3141b.m15628a(35, this.f23933K) + iM15629a2;
        v vVar = this.f23935M;
        if (vVar != null) {
            iM15628a += C3141b.m15630a(37, vVar);
        }
        u uVar = this.f23936N;
        if (uVar != null) {
            iM15628a += C3141b.m15630a(38, uVar);
        }
        u uVar2 = this.f23937O;
        if (uVar2 != null) {
            iM15628a += C3141b.m15630a(39, uVar2);
        }
        s sVar = this.f23939Q;
        if (sVar != null) {
            iM15628a += C3141b.m15630a(41, sVar);
        }
        c cVar = this.f23940R;
        if (cVar != null) {
            iM15628a += C3141b.m15630a(42, cVar);
        }
        u uVar3 = this.f23938P;
        if (uVar3 != null) {
            iM15628a += C3141b.m15630a(43, uVar3);
        }
        if (!this.f23965s.equals("")) {
            iM15628a += C3141b.m15631a(44, this.f23965s);
        }
        f fVar = this.f23941S;
        if (fVar != null) {
            iM15628a += C3141b.m15630a(45, fVar);
        }
        String[] strArr11 = this.f23956j;
        if (strArr11 != null && strArr11.length > 0) {
            int i16 = 0;
            int iM15636a6 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr12 = this.f23956j;
                if (i16 >= strArr12.length) {
                    break;
                }
                String str6 = strArr12[i16];
                if (str6 != null) {
                    i17++;
                    iM15636a6 += C3141b.m15636a(str6);
                }
                i16++;
            }
            iM15628a = iM15628a + iM15636a6 + (i17 * 2);
        }
        String[] strArr13 = this.f23942T;
        if (strArr13 != null && strArr13.length > 0) {
            int i18 = 0;
            int iM15636a7 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr14 = this.f23942T;
                if (i18 >= strArr14.length) {
                    break;
                }
                String str7 = strArr14[i18];
                if (str7 != null) {
                    i19++;
                    iM15636a7 += C3141b.m15636a(str7);
                }
                i18++;
            }
            iM15628a = iM15628a + iM15636a7 + (i19 * 2);
        }
        b bVar = this.f23943U;
        if (bVar != null) {
            iM15628a += C3141b.m15630a(48, bVar);
        }
        if (!this.f23927E.equals("")) {
            iM15628a += C3141b.m15631a(49, this.f23927E);
        }
        a aVar = this.f23944V;
        if (aVar != null) {
            iM15628a += C3141b.m15630a(51, aVar);
        }
        h hVar = this.f23945W;
        if (hVar != null) {
            iM15628a += C3141b.m15630a(52, hVar);
        }
        g gVar = this.f23946X;
        if (gVar != null) {
            iM15628a += C3141b.m15630a(53, gVar);
        }
        d[] dVarArr = this.f23957k;
        if (dVarArr != null && dVarArr.length > 0) {
            while (true) {
                d[] dVarArr2 = this.f23957k;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    iM15628a = C3141b.m15630a(54, dVar) + iM15628a;
                }
                i2++;
            }
        }
        q qVar = this.f23947Y;
        return qVar != null ? iM15628a + C3141b.m15630a(55, qVar) : iM15628a;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
        while (true) {
            int iM15594l = c3115a.m15594l();
            switch (iM15594l) {
                case 0:
                    break;
                case 10:
                    this.f23948b = c3115a.m15593k();
                    break;
                case 24:
                    this.f23949c = c3115a.m15591i();
                    break;
                case 34:
                    int iM15952a = C3271g.m15952a(c3115a, 34);
                    String[] strArr = this.f23950d;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = iM15952a + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = c3115a.m15593k();
                        c3115a.m15594l();
                        length++;
                    }
                    strArr2[length] = c3115a.m15593k();
                    this.f23950d = strArr2;
                    break;
                case C5043c9.f31377M /* 42 */:
                    this.f23951e = c3115a.m15593k();
                    break;
                case 50:
                    this.f23952f = c3115a.m15593k();
                    break;
                case 58:
                    int iM15952a2 = C3271g.m15952a(c3115a, 58);
                    String[] strArr3 = this.f23953g;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = iM15952a2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = c3115a.m15593k();
                        c3115a.m15594l();
                        length2++;
                    }
                    strArr4[length2] = c3115a.m15593k();
                    this.f23953g = strArr4;
                    break;
                case 66:
                    int iM15952a3 = C3271g.m15952a(c3115a, 66);
                    String[] strArr5 = this.f23954h;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = iM15952a3 + length3;
                    String[] strArr6 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = c3115a.m15593k();
                        c3115a.m15594l();
                        length3++;
                    }
                    strArr6[length3] = c3115a.m15593k();
                    this.f23954h = strArr6;
                    break;
                case 74:
                    int iM15952a4 = C3271g.m15952a(c3115a, 74);
                    String[] strArr7 = this.f23955i;
                    int length4 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = iM15952a4 + length4;
                    String[] strArr8 = new String[i5];
                    if (length4 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        strArr8[length4] = c3115a.m15593k();
                        c3115a.m15594l();
                        length4++;
                    }
                    strArr8[length4] = c3115a.m15593k();
                    this.f23955i = strArr8;
                    break;
                case 82:
                    if (this.f23958l == null) {
                        this.f23958l = new i();
                    }
                    c3115a.m15577a(this.f23958l);
                    break;
                case 90:
                    int iM15952a5 = C3271g.m15952a(c3115a, 90);
                    k[] kVarArr = this.f23959m;
                    int length5 = kVarArr == null ? 0 : kVarArr.length;
                    int i6 = iM15952a5 + length5;
                    k[] kVarArr2 = new k[i6];
                    if (length5 != 0) {
                        System.arraycopy(kVarArr, 0, kVarArr2, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        k kVar = new k();
                        kVarArr2[length5] = kVar;
                        c3115a.m15577a(kVar);
                        c3115a.m15594l();
                        length5++;
                    }
                    k kVar2 = new k();
                    kVarArr2[length5] = kVar2;
                    c3115a.m15577a(kVar2);
                    this.f23959m = kVarArr2;
                    break;
                case 98:
                    if (this.f23960n == null) {
                        this.f23960n = new y();
                    }
                    c3115a.m15577a(this.f23960n);
                    break;
                case 106:
                    if (this.f23961o == null) {
                        this.f23961o = new p();
                    }
                    c3115a.m15577a(this.f23961o);
                    break;
                case 114:
                    int iM15952a6 = C3271g.m15952a(c3115a, 114);
                    n[] nVarArr = this.f23962p;
                    int length6 = nVarArr == null ? 0 : nVarArr.length;
                    int i7 = iM15952a6 + length6;
                    n[] nVarArr2 = new n[i7];
                    if (length6 != 0) {
                        System.arraycopy(nVarArr, 0, nVarArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        n nVar = new n();
                        nVarArr2[length6] = nVar;
                        c3115a.m15577a(nVar);
                        c3115a.m15594l();
                        length6++;
                    }
                    n nVar2 = new n();
                    nVarArr2[length6] = nVar2;
                    c3115a.m15577a(nVar2);
                    this.f23962p = nVarArr2;
                    break;
                case 122:
                    this.f23963q = c3115a.m15593k();
                    break;
                case 130:
                    this.f23964r = c3115a.m15593k();
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 136 */:
                    this.f23966t = c3115a.m15581c();
                    break;
                case 154:
                    this.f23967u = c3115a.m15593k();
                    break;
                case 162:
                    int iM15952a7 = C3271g.m15952a(c3115a, 162);
                    String[] strArr9 = this.f23968v;
                    int length7 = strArr9 == null ? 0 : strArr9.length;
                    int i8 = iM15952a7 + length7;
                    String[] strArr10 = new String[i8];
                    if (length7 != 0) {
                        System.arraycopy(strArr9, 0, strArr10, 0, length7);
                    }
                    while (length7 < i8 - 1) {
                        strArr10[length7] = c3115a.m15593k();
                        c3115a.m15594l();
                        length7++;
                    }
                    strArr10[length7] = c3115a.m15593k();
                    this.f23968v = strArr10;
                    break;
                case 170:
                    if (this.f23969w == null) {
                        this.f23969w = new r();
                    }
                    c3115a.m15577a(this.f23969w);
                    break;
                case 176:
                    this.f23970x = c3115a.m15581c();
                    break;
                case 186:
                    int iM15952a8 = C3271g.m15952a(c3115a, 186);
                    l[] lVarArr = this.f23971y;
                    int length8 = lVarArr == null ? 0 : lVarArr.length;
                    int i9 = iM15952a8 + length8;
                    l[] lVarArr2 = new l[i9];
                    if (length8 != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length8);
                    }
                    while (length8 < i9 - 1) {
                        l lVar = new l();
                        lVarArr2[length8] = lVar;
                        c3115a.m15577a(lVar);
                        c3115a.m15594l();
                        length8++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length8] = lVar2;
                    c3115a.m15577a(lVar2);
                    this.f23971y = lVarArr2;
                    break;
                case 194:
                    if (this.f23972z == null) {
                        this.f23972z = new o();
                    }
                    c3115a.m15577a(this.f23972z);
                    break;
                case 202:
                    this.f23923A = c3115a.m15593k();
                    break;
                case 210:
                    this.f23924B = c3115a.m15593k();
                    break;
                case 218:
                    this.f23926D = c3115a.m15593k();
                    break;
                case 224:
                    this.f23928F = c3115a.m15591i();
                    break;
                case 232:
                    this.f23929G = c3115a.m15591i();
                    break;
                case 240:
                    this.f23930H = c3115a.m15581c();
                    break;
                case 250:
                    this.f23925C = c3115a.m15593k();
                    break;
                case 258:
                    if (this.f23931I == null) {
                        this.f23931I = new m();
                    }
                    c3115a.m15577a(this.f23931I);
                    break;
                case 266:
                    if (this.f23932J == null) {
                        this.f23932J = new j();
                    }
                    c3115a.m15577a(this.f23932J);
                    break;
                case 280:
                    this.f23933K = c3115a.m15590h();
                    break;
                case 288:
                    this.f23934L = c3115a.m15590h();
                    break;
                case 298:
                    if (this.f23935M == null) {
                        this.f23935M = new v();
                    }
                    c3115a.m15577a(this.f23935M);
                    break;
                case 306:
                    if (this.f23936N == null) {
                        this.f23936N = new u();
                    }
                    c3115a.m15577a(this.f23936N);
                    break;
                case 314:
                    if (this.f23937O == null) {
                        this.f23937O = new u();
                    }
                    c3115a.m15577a(this.f23937O);
                    break;
                case 330:
                    if (this.f23939Q == null) {
                        this.f23939Q = new s();
                    }
                    c3115a.m15577a(this.f23939Q);
                    break;
                case 338:
                    if (this.f23940R == null) {
                        this.f23940R = new c();
                    }
                    c3115a.m15577a(this.f23940R);
                    break;
                case 346:
                    if (this.f23938P == null) {
                        this.f23938P = new u();
                    }
                    c3115a.m15577a(this.f23938P);
                    break;
                case 354:
                    this.f23965s = c3115a.m15593k();
                    break;
                case 362:
                    if (this.f23941S == null) {
                        this.f23941S = new f();
                    }
                    c3115a.m15577a(this.f23941S);
                    break;
                case 370:
                    int iM15952a9 = C3271g.m15952a(c3115a, 370);
                    String[] strArr11 = this.f23956j;
                    int length9 = strArr11 == null ? 0 : strArr11.length;
                    int i10 = iM15952a9 + length9;
                    String[] strArr12 = new String[i10];
                    if (length9 != 0) {
                        System.arraycopy(strArr11, 0, strArr12, 0, length9);
                    }
                    while (length9 < i10 - 1) {
                        strArr12[length9] = c3115a.m15593k();
                        c3115a.m15594l();
                        length9++;
                    }
                    strArr12[length9] = c3115a.m15593k();
                    this.f23956j = strArr12;
                    break;
                case 378:
                    int iM15952a10 = C3271g.m15952a(c3115a, 378);
                    String[] strArr13 = this.f23942T;
                    int length10 = strArr13 == null ? 0 : strArr13.length;
                    int i11 = iM15952a10 + length10;
                    String[] strArr14 = new String[i11];
                    if (length10 != 0) {
                        System.arraycopy(strArr13, 0, strArr14, 0, length10);
                    }
                    while (length10 < i11 - 1) {
                        strArr14[length10] = c3115a.m15593k();
                        c3115a.m15594l();
                        length10++;
                    }
                    strArr14[length10] = c3115a.m15593k();
                    this.f23942T = strArr14;
                    break;
                case 386:
                    if (this.f23943U == null) {
                        this.f23943U = new b();
                    }
                    c3115a.m15577a(this.f23943U);
                    break;
                case 394:
                    this.f23927E = c3115a.m15593k();
                    break;
                case 410:
                    if (this.f23944V == null) {
                        this.f23944V = new a();
                    }
                    c3115a.m15577a(this.f23944V);
                    break;
                case 418:
                    if (this.f23945W == null) {
                        this.f23945W = new h();
                    }
                    c3115a.m15577a(this.f23945W);
                    break;
                case 426:
                    if (this.f23946X == null) {
                        this.f23946X = new g();
                    }
                    c3115a.m15577a(this.f23946X);
                    break;
                case 434:
                    int iM15952a11 = C3271g.m15952a(c3115a, 434);
                    d[] dVarArr = this.f23957k;
                    int length11 = dVarArr == null ? 0 : dVarArr.length;
                    int i12 = iM15952a11 + length11;
                    d[] dVarArr2 = new d[i12];
                    if (length11 != 0) {
                        System.arraycopy(dVarArr, 0, dVarArr2, 0, length11);
                    }
                    while (length11 < i12 - 1) {
                        d dVar = new d();
                        dVarArr2[length11] = dVar;
                        c3115a.m15577a(dVar);
                        c3115a.m15594l();
                        length11++;
                    }
                    d dVar2 = new d();
                    dVarArr2[length11] = dVar2;
                    c3115a.m15577a(dVar2);
                    this.f23957k = dVarArr2;
                    break;
                case 442:
                    if (this.f23947Y == null) {
                        this.f23947Y = new q();
                    }
                    c3115a.m15577a(this.f23947Y);
                    break;
                default:
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
