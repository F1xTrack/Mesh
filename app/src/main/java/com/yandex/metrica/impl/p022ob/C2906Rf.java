package com.yandex.metrica.impl.p022ob;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Rf */
/* loaded from: classes2.dex */
public final class C2906Rf extends AbstractC3219e {

    /* renamed from: b */
    public int f22129b;

    /* renamed from: c */
    public q f22130c;

    /* renamed from: d */
    public o f22131d;

    /* renamed from: e */
    public p f22132e;

    /* renamed from: f */
    public b f22133f;

    /* renamed from: g */
    public h f22134g;

    public C2906Rf() {
        m14999b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        int i2 = this.f22129b;
        if (i2 != 0) {
            c3141b.m15654d(1, i2);
        }
        q qVar = this.f22130c;
        if (qVar != null) {
            c3141b.m15647b(2, qVar);
        }
        o oVar = this.f22131d;
        if (oVar != null) {
            c3141b.m15647b(3, oVar);
        }
        p pVar = this.f22132e;
        if (pVar != null) {
            c3141b.m15647b(4, pVar);
        }
        b bVar = this.f22133f;
        if (bVar != null) {
            c3141b.m15647b(5, bVar);
        }
        h hVar = this.f22134g;
        if (hVar != null) {
            c3141b.m15647b(6, hVar);
        }
    }

    /* renamed from: b */
    public C2906Rf m14999b() {
        this.f22129b = 0;
        this.f22130c = null;
        this.f22131d = null;
        this.f22132e = null;
        this.f22133f = null;
        this.f22134g = null;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public c f22138b;

        public b() {
            m15002b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c cVar = this.f22138b;
            if (cVar != null) {
                c3141b.m15647b(1, cVar);
            }
        }

        /* renamed from: b */
        public b m15002b() {
            this.f22138b = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            c cVar = this.f22138b;
            if (cVar != null) {
                return C3141b.m15630a(1, cVar);
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
                if (iM15594l != 10) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22138b == null) {
                        this.f22138b = new c();
                    }
                    c3115a.m15577a(this.f22138b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$h */
    public static final class h extends AbstractC3219e {

        /* renamed from: b */
        public f f22154b;

        public h() {
            m15009b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            f fVar = this.f22154b;
            if (fVar != null) {
                c3141b.m15647b(1, fVar);
            }
        }

        /* renamed from: b */
        public h m15009b() {
            this.f22154b = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            f fVar = this.f22154b;
            if (fVar != null) {
                return C3141b.m15630a(1, fVar);
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
                if (iM15594l != 10) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22154b == null) {
                        this.f22154b = new f();
                    }
                    c3115a.m15577a(this.f22154b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$l */
    public static final class l extends AbstractC3219e {

        /* renamed from: c */
        private static volatile l[] f22169c;

        /* renamed from: b */
        public byte[] f22170b;

        public l() {
            m15016b();
        }

        /* renamed from: c */
        public static l[] m15015c() {
            if (f22169c == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22169c == null) {
                            f22169c = new l[0];
                        }
                    } finally {
                    }
                }
            }
            return f22169c;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (Arrays.equals(this.f22170b, C3271g.f23459d)) {
                return;
            }
            c3141b.m15650b(1, this.f22170b);
        }

        /* renamed from: b */
        public l m15016b() {
            this.f22170b = C3271g.f23459d;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            if (Arrays.equals(this.f22170b, C3271g.f23459d)) {
                return 0;
            }
            return C3141b.m15633a(1, this.f22170b);
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
                    this.f22170b = c3115a.m15582d();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$q */
    public static final class q extends AbstractC3219e {

        /* renamed from: b */
        public n f22182b;

        public q() {
            m15021b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            n nVar = this.f22182b;
            if (nVar != null) {
                c3141b.m15647b(1, nVar);
            }
        }

        /* renamed from: b */
        public q m15021b() {
            this.f22182b = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            n nVar = this.f22182b;
            if (nVar != null) {
                return C3141b.m15630a(1, nVar);
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
                if (iM15594l != 10) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22182b == null) {
                        this.f22182b = new n();
                    }
                    c3115a.m15577a(this.f22182b);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$i */
    public static final class i extends AbstractC3219e {

        /* renamed from: b */
        public a[] f22155b;

        /* renamed from: c */
        public int f22156c;

        public i() {
            m15010b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            a[] aVarArr = this.f22155b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f22155b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c3141b.m15647b(1, aVar);
                    }
                    i++;
                }
            }
            int i2 = this.f22156c;
            if (i2 != 0) {
                c3141b.m15659f(2, i2);
            }
        }

        /* renamed from: b */
        public i m15010b() {
            this.f22155b = a.m15011c();
            this.f22156c = 0;
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Rf$i$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile a[] f22157d;

            /* renamed from: b */
            public byte[] f22158b;

            /* renamed from: c */
            public byte[] f22159c;

            public a() {
                m15012b();
            }

            /* renamed from: c */
            public static a[] m15011c() {
                if (f22157d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f22157d == null) {
                                f22157d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f22157d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                byte[] bArr = this.f22158b;
                byte[] bArr2 = C3271g.f23459d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c3141b.m15650b(1, this.f22158b);
                }
                if (Arrays.equals(this.f22159c, bArr2)) {
                    return;
                }
                c3141b.m15650b(2, this.f22159c);
            }

            /* renamed from: b */
            public a m15012b() {
                byte[] bArr = C3271g.f23459d;
                this.f22158b = bArr;
                this.f22159c = bArr;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                byte[] bArr = this.f22158b;
                byte[] bArr2 = C3271g.f23459d;
                int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22158b) : 0;
                return !Arrays.equals(this.f22159c, bArr2) ? iM15633a + C3141b.m15633a(2, this.f22159c) : iM15633a;
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
                        this.f22158b = c3115a.m15582d();
                    } else if (iM15594l != 18) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f22159c = c3115a.m15582d();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            a[] aVarArr = this.f22155b;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int iM15630a = 0;
                while (true) {
                    a[] aVarArr2 = this.f22155b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iM15630a = C3141b.m15630a(1, aVar) + iM15630a;
                    }
                    i++;
                }
                i = iM15630a;
            }
            int i2 = this.f22156c;
            return i2 != 0 ? i + C3141b.m15642c(2, i2) : i;
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
                    int iM15952a = C3271g.m15952a(c3115a, 10);
                    a[] aVarArr = this.f22155b;
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
                    this.f22155b = aVarArr2;
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22156c = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: d */
        private static volatile a[] f22135d;

        /* renamed from: b */
        public byte[] f22136b;

        /* renamed from: c */
        public e f22137c;

        public a() {
            m15001b();
        }

        /* renamed from: c */
        public static a[] m15000c() {
            if (f22135d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22135d == null) {
                            f22135d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f22135d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!Arrays.equals(this.f22136b, C3271g.f23459d)) {
                c3141b.m15650b(1, this.f22136b);
            }
            e eVar = this.f22137c;
            if (eVar != null) {
                c3141b.m15647b(2, eVar);
            }
        }

        /* renamed from: b */
        public a m15001b() {
            this.f22136b = C3271g.f23459d;
            this.f22137c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15633a = !Arrays.equals(this.f22136b, C3271g.f23459d) ? C3141b.m15633a(1, this.f22136b) : 0;
            e eVar = this.f22137c;
            return eVar != null ? iM15633a + C3141b.m15630a(2, eVar) : iM15633a;
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
                    this.f22136b = c3115a.m15582d();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22137c == null) {
                        this.f22137c = new e();
                    }
                    c3115a.m15577a(this.f22137c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$d */
    public static final class d extends AbstractC3219e {

        /* renamed from: b */
        public byte[][] f22143b;

        public d() {
            m15004b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[][] bArr = this.f22143b;
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f22143b;
                if (i >= bArr2.length) {
                    return;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    c3141b.m15650b(1, bArr3);
                }
                i++;
            }
        }

        /* renamed from: b */
        public d m15004b() {
            this.f22143b = C3271g.f23458c;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[][] bArr = this.f22143b;
            int i = 0;
            if (bArr == null || bArr.length <= 0) {
                return 0;
            }
            int iM15638b = 0;
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.f22143b;
                if (i >= bArr2.length) {
                    return iM15638b + i2;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i2++;
                    iM15638b = C3141b.m15638b(bArr3.length) + bArr3.length + iM15638b;
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
                    byte[][] bArr = this.f22143b;
                    int length = bArr == null ? 0 : bArr.length;
                    int i = iM15952a + length;
                    byte[][] bArr2 = new byte[i][];
                    if (length != 0) {
                        System.arraycopy(bArr, 0, bArr2, 0, length);
                    }
                    while (length < i - 1) {
                        bArr2[length] = c3115a.m15582d();
                        c3115a.m15594l();
                        length++;
                    }
                    bArr2[length] = c3115a.m15582d();
                    this.f22143b = bArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$e */
    public static final class e extends AbstractC3219e {

        /* renamed from: b */
        public long f22144b;

        /* renamed from: c */
        public int f22145c;

        public e() {
            m15005b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            long j = this.f22144b;
            if (j != 0) {
                c3141b.m15652c(1, j);
            }
            int i = this.f22145c;
            if (i != 0) {
                c3141b.m15654d(2, i);
            }
        }

        /* renamed from: b */
        public e m15005b() {
            this.f22144b = 0L;
            this.f22145c = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            long j = this.f22144b;
            int iM15629a = j != 0 ? C3141b.m15629a(1, j) : 0;
            int i = this.f22145c;
            return i != 0 ? iM15629a + C3141b.m15628a(2, i) : iM15629a;
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
                    this.f22144b = c3115a.m15591i();
                } else if (iM15594l != 16) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22145c = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$g */
    public static final class g extends AbstractC3219e {

        /* renamed from: d */
        private static volatile g[] f22151d;

        /* renamed from: b */
        public int f22152b;

        /* renamed from: c */
        public c f22153c;

        public g() {
            m15008b();
        }

        /* renamed from: c */
        public static g[] m15007c() {
            if (f22151d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22151d == null) {
                            f22151d = new g[0];
                        }
                    } finally {
                    }
                }
            }
            return f22151d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            int i = this.f22152b;
            if (i != 0) {
                c3141b.m15659f(1, i);
            }
            c cVar = this.f22153c;
            if (cVar != null) {
                c3141b.m15647b(2, cVar);
            }
        }

        /* renamed from: b */
        public g m15008b() {
            this.f22152b = 0;
            this.f22153c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = this.f22152b;
            int iM15642c = i != 0 ? C3141b.m15642c(1, i) : 0;
            c cVar = this.f22153c;
            return cVar != null ? iM15642c + C3141b.m15630a(2, cVar) : iM15642c;
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
                    this.f22152b = c3115a.m15590h();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22153c == null) {
                        this.f22153c = new c();
                    }
                    c3115a.m15577a(this.f22153c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$o */
    public static final class o extends AbstractC3219e {

        /* renamed from: b */
        public k f22178b;

        /* renamed from: c */
        public n f22179c;

        public o() {
            m15019b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            k kVar = this.f22178b;
            if (kVar != null) {
                c3141b.m15647b(1, kVar);
            }
            n nVar = this.f22179c;
            if (nVar != null) {
                c3141b.m15647b(2, nVar);
            }
        }

        /* renamed from: b */
        public o m15019b() {
            this.f22178b = null;
            this.f22179c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            k kVar = this.f22178b;
            int iM15630a = kVar != null ? C3141b.m15630a(1, kVar) : 0;
            n nVar = this.f22179c;
            return nVar != null ? iM15630a + C3141b.m15630a(2, nVar) : iM15630a;
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
                    if (this.f22178b == null) {
                        this.f22178b = new k();
                    }
                    c3115a.m15577a(this.f22178b);
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22179c == null) {
                        this.f22179c = new n();
                    }
                    c3115a.m15577a(this.f22179c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$p */
    public static final class p extends AbstractC3219e {

        /* renamed from: b */
        public k f22180b;

        /* renamed from: c */
        public m f22181c;

        public p() {
            m15020b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            k kVar = this.f22180b;
            if (kVar != null) {
                c3141b.m15647b(1, kVar);
            }
            m mVar = this.f22181c;
            if (mVar != null) {
                c3141b.m15647b(2, mVar);
            }
        }

        /* renamed from: b */
        public p m15020b() {
            this.f22180b = null;
            this.f22181c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            k kVar = this.f22180b;
            int iM15630a = kVar != null ? C3141b.m15630a(1, kVar) : 0;
            m mVar = this.f22181c;
            return mVar != null ? iM15630a + C3141b.m15630a(2, mVar) : iM15630a;
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
                    if (this.f22180b == null) {
                        this.f22180b = new k();
                    }
                    c3115a.m15577a(this.f22180b);
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22181c == null) {
                        this.f22181c = new m();
                    }
                    c3115a.m15577a(this.f22181c);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$j */
    public static final class j extends AbstractC3219e {

        /* renamed from: b */
        public a f22160b;

        /* renamed from: c */
        public a[] f22161c;

        public j() {
            m15013b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            a aVar = this.f22160b;
            if (aVar != null) {
                c3141b.m15647b(1, aVar);
            }
            a[] aVarArr = this.f22161c;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f22161c;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar2 = aVarArr2[i];
                if (aVar2 != null) {
                    c3141b.m15647b(2, aVar2);
                }
                i++;
            }
        }

        /* renamed from: b */
        public j m15013b() {
            this.f22160b = null;
            this.f22161c = a.m15000c();
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            a aVar = this.f22160b;
            int i = 0;
            int iM15630a = aVar != null ? C3141b.m15630a(1, aVar) : 0;
            a[] aVarArr = this.f22161c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f22161c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar2 = aVarArr2[i];
                    if (aVar2 != null) {
                        iM15630a = C3141b.m15630a(2, aVar2) + iM15630a;
                    }
                    i++;
                }
            }
            return iM15630a;
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
                    if (this.f22160b == null) {
                        this.f22160b = new a();
                    }
                    c3115a.m15577a(this.f22160b);
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 18);
                    a[] aVarArr = this.f22161c;
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
                    this.f22161c = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$m */
    public static final class m extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22171b;

        /* renamed from: c */
        public byte[] f22172c;

        /* renamed from: d */
        public n f22173d;

        public m() {
            m15017b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22171b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22171b);
            }
            if (!Arrays.equals(this.f22172c, bArr2)) {
                c3141b.m15650b(2, this.f22172c);
            }
            n nVar = this.f22173d;
            if (nVar != null) {
                c3141b.m15647b(3, nVar);
            }
        }

        /* renamed from: b */
        public m m15017b() {
            byte[] bArr = C3271g.f23459d;
            this.f22171b = bArr;
            this.f22172c = bArr;
            this.f22173d = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22171b;
            byte[] bArr2 = C3271g.f23459d;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22171b) : 0;
            if (!Arrays.equals(this.f22172c, bArr2)) {
                iM15633a += C3141b.m15633a(2, this.f22172c);
            }
            n nVar = this.f22173d;
            return nVar != null ? iM15633a + C3141b.m15630a(3, nVar) : iM15633a;
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
                    this.f22171b = c3115a.m15582d();
                } else if (iM15594l == 18) {
                    this.f22172c = c3115a.m15582d();
                } else if (iM15594l != 26) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22173d == null) {
                        this.f22173d = new n();
                    }
                    c3115a.m15577a(this.f22173d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$c */
    public static final class c extends AbstractC3219e {

        /* renamed from: b */
        public k f22139b;

        /* renamed from: c */
        public m f22140c;

        /* renamed from: d */
        public e f22141d;

        /* renamed from: e */
        public j f22142e;

        public c() {
            m15003b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            k kVar = this.f22139b;
            if (kVar != null) {
                c3141b.m15647b(1, kVar);
            }
            m mVar = this.f22140c;
            if (mVar != null) {
                c3141b.m15647b(2, mVar);
            }
            e eVar = this.f22141d;
            if (eVar != null) {
                c3141b.m15647b(3, eVar);
            }
            j jVar = this.f22142e;
            if (jVar != null) {
                c3141b.m15647b(4, jVar);
            }
        }

        /* renamed from: b */
        public c m15003b() {
            this.f22139b = null;
            this.f22140c = null;
            this.f22141d = null;
            this.f22142e = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            k kVar = this.f22139b;
            int iM15630a = kVar != null ? C3141b.m15630a(1, kVar) : 0;
            m mVar = this.f22140c;
            if (mVar != null) {
                iM15630a += C3141b.m15630a(2, mVar);
            }
            e eVar = this.f22141d;
            if (eVar != null) {
                iM15630a += C3141b.m15630a(3, eVar);
            }
            j jVar = this.f22142e;
            return jVar != null ? iM15630a + C3141b.m15630a(4, jVar) : iM15630a;
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
                    if (this.f22139b == null) {
                        this.f22139b = new k();
                    }
                    c3115a.m15577a(this.f22139b);
                } else if (iM15594l == 18) {
                    if (this.f22140c == null) {
                        this.f22140c = new m();
                    }
                    c3115a.m15577a(this.f22140c);
                } else if (iM15594l == 26) {
                    if (this.f22141d == null) {
                        this.f22141d = new e();
                    }
                    c3115a.m15577a(this.f22141d);
                } else if (iM15594l != 34) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22142e == null) {
                        this.f22142e = new j();
                    }
                    c3115a.m15577a(this.f22142e);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$n */
    public static final class n extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22174b;

        /* renamed from: c */
        public d f22175c;

        /* renamed from: d */
        public byte[] f22176d;

        /* renamed from: e */
        public i f22177e;

        public n() {
            m15018b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22174b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22174b);
            }
            d dVar = this.f22175c;
            if (dVar != null) {
                c3141b.m15647b(2, dVar);
            }
            if (!Arrays.equals(this.f22176d, bArr2)) {
                c3141b.m15650b(3, this.f22176d);
            }
            i iVar = this.f22177e;
            if (iVar != null) {
                c3141b.m15647b(4, iVar);
            }
        }

        /* renamed from: b */
        public n m15018b() {
            byte[] bArr = C3271g.f23459d;
            this.f22174b = bArr;
            this.f22175c = null;
            this.f22176d = bArr;
            this.f22177e = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22174b;
            byte[] bArr2 = C3271g.f23459d;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22174b) : 0;
            d dVar = this.f22175c;
            if (dVar != null) {
                iM15633a += C3141b.m15630a(2, dVar);
            }
            if (!Arrays.equals(this.f22176d, bArr2)) {
                iM15633a += C3141b.m15633a(3, this.f22176d);
            }
            i iVar = this.f22177e;
            return iVar != null ? iM15633a + C3141b.m15630a(4, iVar) : iM15633a;
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
                    this.f22174b = c3115a.m15582d();
                } else if (iM15594l == 18) {
                    if (this.f22175c == null) {
                        this.f22175c = new d();
                    }
                    c3115a.m15577a(this.f22175c);
                } else if (iM15594l == 26) {
                    this.f22176d = c3115a.m15582d();
                } else if (iM15594l != 34) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22177e == null) {
                        this.f22177e = new i();
                    }
                    c3115a.m15577a(this.f22177e);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$f */
    public static final class f extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22146b;

        /* renamed from: c */
        public byte[] f22147c;

        /* renamed from: d */
        public i f22148d;

        /* renamed from: e */
        public g[] f22149e;

        /* renamed from: f */
        public int f22150f;

        public f() {
            m15006b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22146b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22146b);
            }
            if (!Arrays.equals(this.f22147c, bArr2)) {
                c3141b.m15650b(2, this.f22147c);
            }
            i iVar = this.f22148d;
            if (iVar != null) {
                c3141b.m15647b(3, iVar);
            }
            g[] gVarArr = this.f22149e;
            if (gVarArr != null && gVarArr.length > 0) {
                int i = 0;
                while (true) {
                    g[] gVarArr2 = this.f22149e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        c3141b.m15647b(4, gVar);
                    }
                    i++;
                }
            }
            int i2 = this.f22150f;
            if (i2 != 0) {
                c3141b.m15659f(5, i2);
            }
        }

        /* renamed from: b */
        public f m15006b() {
            byte[] bArr = C3271g.f23459d;
            this.f22146b = bArr;
            this.f22147c = bArr;
            this.f22148d = null;
            this.f22149e = g.m15007c();
            this.f22150f = 0;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22146b;
            byte[] bArr2 = C3271g.f23459d;
            int i = 0;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22146b) : 0;
            if (!Arrays.equals(this.f22147c, bArr2)) {
                iM15633a += C3141b.m15633a(2, this.f22147c);
            }
            i iVar = this.f22148d;
            if (iVar != null) {
                iM15633a += C3141b.m15630a(3, iVar);
            }
            g[] gVarArr = this.f22149e;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.f22149e;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        iM15633a = C3141b.m15630a(4, gVar) + iM15633a;
                    }
                    i++;
                }
            }
            int i2 = this.f22150f;
            return i2 != 0 ? iM15633a + C3141b.m15642c(5, i2) : iM15633a;
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
                    this.f22146b = c3115a.m15582d();
                } else if (iM15594l == 18) {
                    this.f22147c = c3115a.m15582d();
                } else if (iM15594l == 26) {
                    if (this.f22148d == null) {
                        this.f22148d = new i();
                    }
                    c3115a.m15577a(this.f22148d);
                } else if (iM15594l == 34) {
                    int iM15952a = C3271g.m15952a(c3115a, 34);
                    g[] gVarArr = this.f22149e;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    int i = iM15952a + length;
                    g[] gVarArr2 = new g[i];
                    if (length != 0) {
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        g gVar = new g();
                        gVarArr2[length] = gVar;
                        c3115a.m15577a(gVar);
                        c3115a.m15594l();
                        length++;
                    }
                    g gVar2 = new g();
                    gVarArr2[length] = gVar2;
                    c3115a.m15577a(gVar2);
                    this.f22149e = gVarArr2;
                } else if (iM15594l != 40) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22150f = c3115a.m15590h();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int i2 = this.f22129b;
        int iM15628a = i2 != 0 ? C3141b.m15628a(1, i2) : 0;
        q qVar = this.f22130c;
        if (qVar != null) {
            iM15628a += C3141b.m15630a(2, qVar);
        }
        o oVar = this.f22131d;
        if (oVar != null) {
            iM15628a += C3141b.m15630a(3, oVar);
        }
        p pVar = this.f22132e;
        if (pVar != null) {
            iM15628a += C3141b.m15630a(4, pVar);
        }
        b bVar = this.f22133f;
        if (bVar != null) {
            iM15628a += C3141b.m15630a(5, bVar);
        }
        h hVar = this.f22134g;
        return hVar != null ? iM15628a + C3141b.m15630a(6, hVar) : iM15628a;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Rf$k */
    public static final class k extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22162b;

        /* renamed from: c */
        public byte[] f22163c;

        /* renamed from: d */
        public d f22164d;

        /* renamed from: e */
        public i f22165e;

        /* renamed from: f */
        public j f22166f;

        /* renamed from: g */
        public j f22167g;

        /* renamed from: h */
        public l[] f22168h;

        public k() {
            m15014b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22162b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22162b);
            }
            if (!Arrays.equals(this.f22163c, bArr2)) {
                c3141b.m15650b(2, this.f22163c);
            }
            d dVar = this.f22164d;
            if (dVar != null) {
                c3141b.m15647b(3, dVar);
            }
            i iVar = this.f22165e;
            if (iVar != null) {
                c3141b.m15647b(4, iVar);
            }
            j jVar = this.f22166f;
            if (jVar != null) {
                c3141b.m15647b(5, jVar);
            }
            j jVar2 = this.f22167g;
            if (jVar2 != null) {
                c3141b.m15647b(6, jVar2);
            }
            l[] lVarArr = this.f22168h;
            if (lVarArr == null || lVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                l[] lVarArr2 = this.f22168h;
                if (i >= lVarArr2.length) {
                    return;
                }
                l lVar = lVarArr2[i];
                if (lVar != null) {
                    c3141b.m15647b(7, lVar);
                }
                i++;
            }
        }

        /* renamed from: b */
        public k m15014b() {
            byte[] bArr = C3271g.f23459d;
            this.f22162b = bArr;
            this.f22163c = bArr;
            this.f22164d = null;
            this.f22165e = null;
            this.f22166f = null;
            this.f22167g = null;
            this.f22168h = l.m15015c();
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22162b;
            byte[] bArr2 = C3271g.f23459d;
            int i = 0;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22162b) : 0;
            if (!Arrays.equals(this.f22163c, bArr2)) {
                iM15633a += C3141b.m15633a(2, this.f22163c);
            }
            d dVar = this.f22164d;
            if (dVar != null) {
                iM15633a += C3141b.m15630a(3, dVar);
            }
            i iVar = this.f22165e;
            if (iVar != null) {
                iM15633a += C3141b.m15630a(4, iVar);
            }
            j jVar = this.f22166f;
            if (jVar != null) {
                iM15633a += C3141b.m15630a(5, jVar);
            }
            j jVar2 = this.f22167g;
            if (jVar2 != null) {
                iM15633a += C3141b.m15630a(6, jVar2);
            }
            l[] lVarArr = this.f22168h;
            if (lVarArr != null && lVarArr.length > 0) {
                while (true) {
                    l[] lVarArr2 = this.f22168h;
                    if (i >= lVarArr2.length) {
                        break;
                    }
                    l lVar = lVarArr2[i];
                    if (lVar != null) {
                        iM15633a = C3141b.m15630a(7, lVar) + iM15633a;
                    }
                    i++;
                }
            }
            return iM15633a;
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
                    this.f22162b = c3115a.m15582d();
                } else if (iM15594l == 18) {
                    this.f22163c = c3115a.m15582d();
                } else if (iM15594l == 26) {
                    if (this.f22164d == null) {
                        this.f22164d = new d();
                    }
                    c3115a.m15577a(this.f22164d);
                } else if (iM15594l == 34) {
                    if (this.f22165e == null) {
                        this.f22165e = new i();
                    }
                    c3115a.m15577a(this.f22165e);
                } else if (iM15594l == 42) {
                    if (this.f22166f == null) {
                        this.f22166f = new j();
                    }
                    c3115a.m15577a(this.f22166f);
                } else if (iM15594l == 50) {
                    if (this.f22167g == null) {
                        this.f22167g = new j();
                    }
                    c3115a.m15577a(this.f22167g);
                } else if (iM15594l != 58) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 58);
                    l[] lVarArr = this.f22168h;
                    int length = lVarArr == null ? 0 : lVarArr.length;
                    int i = iM15952a + length;
                    l[] lVarArr2 = new l[i];
                    if (length != 0) {
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        l lVar = new l();
                        lVarArr2[length] = lVar;
                        c3115a.m15577a(lVar);
                        c3115a.m15594l();
                        length++;
                    }
                    l lVar2 = new l();
                    lVarArr2[length] = lVar2;
                    c3115a.m15577a(lVar2);
                    this.f22168h = lVarArr2;
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
            if (iM15594l != 0) {
                if (iM15594l == 8) {
                    int iM15590h = c3115a.m15590h();
                    switch (iM15590h) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f22129b = iM15590h;
                            break;
                    }
                } else if (iM15594l == 18) {
                    if (this.f22130c == null) {
                        this.f22130c = new q();
                    }
                    c3115a.m15577a(this.f22130c);
                } else if (iM15594l == 26) {
                    if (this.f22131d == null) {
                        this.f22131d = new o();
                    }
                    c3115a.m15577a(this.f22131d);
                } else if (iM15594l == 34) {
                    if (this.f22132e == null) {
                        this.f22132e = new p();
                    }
                    c3115a.m15577a(this.f22132e);
                } else if (iM15594l == 42) {
                    if (this.f22133f == null) {
                        this.f22133f = new b();
                    }
                    c3115a.m15577a(this.f22133f);
                } else if (iM15594l != 50) {
                    if (!c3115a.m15587f(iM15594l)) {
                    }
                } else {
                    if (this.f22134g == null) {
                        this.f22134g = new h();
                    }
                    c3115a.m15577a(this.f22134g);
                }
            }
        }
        return this;
    }
}
