package com.yandex.metrica.impl.p022ob;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Vf */
/* loaded from: classes2.dex */
public final class C3006Vf extends AbstractC3219e {

    /* renamed from: b */
    public d[] f22537b;

    /* renamed from: c */
    public c f22538c;

    /* renamed from: d */
    public a[] f22539d;

    /* renamed from: e */
    public e[] f22540e;

    /* renamed from: f */
    public String[] f22541f;

    /* renamed from: com.yandex.metrica.impl.ob.Vf$c */
    public static final class c extends AbstractC3219e {

        /* renamed from: b */
        public String f22554b;

        /* renamed from: c */
        public String f22555c;

        /* renamed from: d */
        public String f22556d;

        /* renamed from: e */
        public int f22557e;

        /* renamed from: f */
        public String f22558f;

        /* renamed from: g */
        public String f22559g;

        /* renamed from: h */
        public boolean f22560h;

        /* renamed from: i */
        public int f22561i;

        /* renamed from: j */
        public String f22562j;

        /* renamed from: k */
        public String f22563k;

        /* renamed from: l */
        public int f22564l;

        /* renamed from: m */
        public a[] f22565m;

        /* renamed from: n */
        public String f22566n;

        public c() {
            m15313b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!this.f22554b.equals("")) {
                c3141b.m15648b(1, this.f22554b);
            }
            if (!this.f22555c.equals("")) {
                c3141b.m15648b(2, this.f22555c);
            }
            if (!this.f22556d.equals("")) {
                c3141b.m15648b(4, this.f22556d);
            }
            int i = this.f22557e;
            if (i != 0) {
                c3141b.m15659f(5, i);
            }
            if (!this.f22558f.equals("")) {
                c3141b.m15648b(10, this.f22558f);
            }
            if (!this.f22559g.equals("")) {
                c3141b.m15648b(15, this.f22559g);
            }
            boolean z = this.f22560h;
            if (z) {
                c3141b.m15649b(17, z);
            }
            int i2 = this.f22561i;
            if (i2 != 0) {
                c3141b.m15659f(18, i2);
            }
            if (!this.f22562j.equals("")) {
                c3141b.m15648b(19, this.f22562j);
            }
            if (!this.f22563k.equals("")) {
                c3141b.m15648b(21, this.f22563k);
            }
            int i3 = this.f22564l;
            if (i3 != 0) {
                c3141b.m15659f(22, i3);
            }
            a[] aVarArr = this.f22565m;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    a[] aVarArr2 = this.f22565m;
                    if (i4 >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i4];
                    if (aVar != null) {
                        c3141b.m15647b(23, aVar);
                    }
                    i4++;
                }
            }
            if (this.f22566n.equals("")) {
                return;
            }
            c3141b.m15648b(24, this.f22566n);
        }

        /* renamed from: b */
        public c m15313b() {
            this.f22554b = "";
            this.f22555c = "";
            this.f22556d = "";
            this.f22557e = 0;
            this.f22558f = "";
            this.f22559g = "";
            this.f22560h = false;
            this.f22561i = 0;
            this.f22562j = "";
            this.f22563k = "";
            this.f22564l = 0;
            this.f22565m = a.m15314c();
            this.f22566n = "";
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$c$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: d */
            private static volatile a[] f22567d;

            /* renamed from: b */
            public String f22568b;

            /* renamed from: c */
            public long f22569c;

            public a() {
                m15315b();
            }

            /* renamed from: c */
            public static a[] m15314c() {
                if (f22567d == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f22567d == null) {
                                f22567d = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f22567d;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15648b(1, this.f22568b);
                c3141b.m15658e(2, this.f22569c);
            }

            /* renamed from: b */
            public a m15315b() {
                this.f22568b = "";
                this.f22569c = 0L;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                return C3141b.m15640b(2, this.f22569c) + C3141b.m15631a(1, this.f22568b);
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
                        this.f22568b = c3115a.m15593k();
                    } else if (iM15594l != 16) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f22569c = c3115a.m15591i();
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = 0;
            int iM15631a = !this.f22554b.equals("") ? C3141b.m15631a(1, this.f22554b) : 0;
            if (!this.f22555c.equals("")) {
                iM15631a += C3141b.m15631a(2, this.f22555c);
            }
            if (!this.f22556d.equals("")) {
                iM15631a += C3141b.m15631a(4, this.f22556d);
            }
            int i2 = this.f22557e;
            if (i2 != 0) {
                iM15631a += C3141b.m15642c(5, i2);
            }
            if (!this.f22558f.equals("")) {
                iM15631a += C3141b.m15631a(10, this.f22558f);
            }
            if (!this.f22559g.equals("")) {
                iM15631a += C3141b.m15631a(15, this.f22559g);
            }
            boolean z = this.f22560h;
            if (z) {
                iM15631a += C3141b.m15632a(17, z);
            }
            int i3 = this.f22561i;
            if (i3 != 0) {
                iM15631a += C3141b.m15642c(18, i3);
            }
            if (!this.f22562j.equals("")) {
                iM15631a += C3141b.m15631a(19, this.f22562j);
            }
            if (!this.f22563k.equals("")) {
                iM15631a += C3141b.m15631a(21, this.f22563k);
            }
            int i4 = this.f22564l;
            if (i4 != 0) {
                iM15631a += C3141b.m15642c(22, i4);
            }
            a[] aVarArr = this.f22565m;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f22565m;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iM15631a = C3141b.m15630a(23, aVar) + iM15631a;
                    }
                    i++;
                }
            }
            return !this.f22566n.equals("") ? iM15631a + C3141b.m15631a(24, this.f22566n) : iM15631a;
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
                        this.f22554b = c3115a.m15593k();
                        break;
                    case 18:
                        this.f22555c = c3115a.m15593k();
                        break;
                    case 34:
                        this.f22556d = c3115a.m15593k();
                        break;
                    case C5043c9.f31376L /* 40 */:
                        this.f22557e = c3115a.m15590h();
                        break;
                    case 82:
                        this.f22558f = c3115a.m15593k();
                        break;
                    case 122:
                        this.f22559g = c3115a.m15593k();
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 136 */:
                        this.f22560h = c3115a.m15581c();
                        break;
                    case 144:
                        this.f22561i = c3115a.m15590h();
                        break;
                    case 154:
                        this.f22562j = c3115a.m15593k();
                        break;
                    case 170:
                        this.f22563k = c3115a.m15593k();
                        break;
                    case 176:
                        this.f22564l = c3115a.m15590h();
                        break;
                    case 186:
                        int iM15952a = C3271g.m15952a(c3115a, 186);
                        a[] aVarArr = this.f22565m;
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
                        this.f22565m = aVarArr2;
                        break;
                    case 194:
                        this.f22566n = c3115a.m15593k();
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

    public C3006Vf() {
        m15309b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        d[] dVarArr = this.f22537b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                d[] dVarArr2 = this.f22537b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    c3141b.m15647b(3, dVar);
                }
                i2++;
            }
        }
        c cVar = this.f22538c;
        if (cVar != null) {
            c3141b.m15647b(4, cVar);
        }
        a[] aVarArr = this.f22539d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f22539d;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    c3141b.m15647b(7, aVar);
                }
                i3++;
            }
        }
        e[] eVarArr = this.f22540e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.f22540e;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    c3141b.m15647b(10, eVar);
                }
                i4++;
            }
        }
        String[] strArr = this.f22541f;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        while (true) {
            String[] strArr2 = this.f22541f;
            if (i >= strArr2.length) {
                return;
            }
            String str = strArr2[i];
            if (str != null) {
                c3141b.m15648b(11, str);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C3006Vf m15309b() {
        this.f22537b = d.m15316c();
        this.f22538c = null;
        this.f22539d = a.m15310c();
        this.f22540e = e.m15323c();
        this.f22541f = C3271g.f23457b;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: d */
        private static volatile a[] f22542d;

        /* renamed from: b */
        public String f22543b;

        /* renamed from: c */
        public String f22544c;

        public a() {
            m15311b();
        }

        /* renamed from: c */
        public static a[] m15310c() {
            if (f22542d == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22542d == null) {
                            f22542d = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f22542d;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f22543b);
            c3141b.m15648b(2, this.f22544c);
        }

        /* renamed from: b */
        public a m15311b() {
            this.f22543b = "";
            this.f22544c = "";
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15631a(2, this.f22544c) + C3141b.m15631a(1, this.f22543b);
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
                    this.f22543b = c3115a.m15593k();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22544c = c3115a.m15593k();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$d */
    public static final class d extends AbstractC3219e {

        /* renamed from: e */
        private static volatile d[] f22570e;

        /* renamed from: b */
        public long f22571b;

        /* renamed from: c */
        public b f22572c;

        /* renamed from: d */
        public a[] f22573d;

        public d() {
            m15317b();
        }

        /* renamed from: c */
        public static d[] m15316c() {
            if (f22570e == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22570e == null) {
                            f22570e = new d[0];
                        }
                    } finally {
                    }
                }
            }
            return f22570e;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15658e(1, this.f22571b);
            b bVar = this.f22572c;
            if (bVar != null) {
                c3141b.m15647b(2, bVar);
            }
            a[] aVarArr = this.f22573d;
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                a[] aVarArr2 = this.f22573d;
                if (i >= aVarArr2.length) {
                    return;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    c3141b.m15647b(3, aVar);
                }
                i++;
            }
        }

        /* renamed from: b */
        public d m15317b() {
            this.f22571b = 0L;
            this.f22572c = null;
            this.f22573d = a.m15318c();
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: y */
            private static volatile a[] f22574y;

            /* renamed from: b */
            public long f22575b;

            /* renamed from: c */
            public long f22576c;

            /* renamed from: d */
            public int f22577d;

            /* renamed from: e */
            public String f22578e;

            /* renamed from: f */
            public byte[] f22579f;

            /* renamed from: g */
            public b f22580g;

            /* renamed from: h */
            public b f22581h;

            /* renamed from: i */
            public String f22582i;

            /* renamed from: j */
            public C7304a f22583j;

            /* renamed from: k */
            public int f22584k;

            /* renamed from: l */
            public int f22585l;

            /* renamed from: m */
            public int f22586m;

            /* renamed from: n */
            public byte[] f22587n;

            /* renamed from: o */
            public int f22588o;

            /* renamed from: p */
            public long f22589p;

            /* renamed from: q */
            public long f22590q;

            /* renamed from: r */
            public int f22591r;

            /* renamed from: s */
            public int f22592s;

            /* renamed from: t */
            public int f22593t;

            /* renamed from: u */
            public int f22594u;

            /* renamed from: v */
            public int f22595v;

            /* renamed from: w */
            public boolean f22596w;

            /* renamed from: x */
            public long f22597x;

            public a() {
                m15319b();
            }

            /* renamed from: c */
            public static a[] m15318c() {
                if (f22574y == null) {
                    synchronized (C3167c.f23164a) {
                        try {
                            if (f22574y == null) {
                                f22574y = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f22574y;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                c3141b.m15658e(1, this.f22575b);
                c3141b.m15658e(2, this.f22576c);
                c3141b.m15659f(3, this.f22577d);
                if (!this.f22578e.equals("")) {
                    c3141b.m15648b(4, this.f22578e);
                }
                byte[] bArr = this.f22579f;
                byte[] bArr2 = C3271g.f23459d;
                if (!Arrays.equals(bArr, bArr2)) {
                    c3141b.m15650b(5, this.f22579f);
                }
                b bVar = this.f22580g;
                if (bVar != null) {
                    c3141b.m15647b(6, bVar);
                }
                b bVar2 = this.f22581h;
                if (bVar2 != null) {
                    c3141b.m15647b(7, bVar2);
                }
                if (!this.f22582i.equals("")) {
                    c3141b.m15648b(8, this.f22582i);
                }
                C7304a c7304a = this.f22583j;
                if (c7304a != null) {
                    c3141b.m15647b(9, c7304a);
                }
                int i = this.f22584k;
                if (i != 0) {
                    c3141b.m15659f(10, i);
                }
                int i2 = this.f22585l;
                if (i2 != 0) {
                    c3141b.m15654d(12, i2);
                }
                int i3 = this.f22586m;
                if (i3 != -1) {
                    c3141b.m15654d(13, i3);
                }
                if (!Arrays.equals(this.f22587n, bArr2)) {
                    c3141b.m15650b(14, this.f22587n);
                }
                int i4 = this.f22588o;
                if (i4 != -1) {
                    c3141b.m15654d(15, i4);
                }
                long j = this.f22589p;
                if (j != 0) {
                    c3141b.m15658e(16, j);
                }
                long j2 = this.f22590q;
                if (j2 != 0) {
                    c3141b.m15658e(17, j2);
                }
                int i5 = this.f22591r;
                if (i5 != 0) {
                    c3141b.m15654d(18, i5);
                }
                int i6 = this.f22592s;
                if (i6 != 0) {
                    c3141b.m15654d(19, i6);
                }
                int i7 = this.f22593t;
                if (i7 != -1) {
                    c3141b.m15654d(20, i7);
                }
                int i8 = this.f22594u;
                if (i8 != 0) {
                    c3141b.m15654d(21, i8);
                }
                int i9 = this.f22595v;
                if (i9 != 0) {
                    c3141b.m15654d(22, i9);
                }
                boolean z = this.f22596w;
                if (z) {
                    c3141b.m15649b(23, z);
                }
                long j3 = this.f22597x;
                if (j3 != 1) {
                    c3141b.m15658e(24, j3);
                }
            }

            /* renamed from: b */
            public a m15319b() {
                this.f22575b = 0L;
                this.f22576c = 0L;
                this.f22577d = 0;
                this.f22578e = "";
                byte[] bArr = C3271g.f23459d;
                this.f22579f = bArr;
                this.f22580g = null;
                this.f22581h = null;
                this.f22582i = "";
                this.f22583j = null;
                this.f22584k = 0;
                this.f22585l = 0;
                this.f22586m = -1;
                this.f22587n = bArr;
                this.f22588o = -1;
                this.f22589p = 0L;
                this.f22590q = 0L;
                this.f22591r = 0;
                this.f22592s = 0;
                this.f22593t = -1;
                this.f22594u = 0;
                this.f22595v = 0;
                this.f22596w = false;
                this.f22597x = 1L;
                this.f23283a = -1;
                return this;
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$a */
            public static final class C7304a extends AbstractC3219e {

                /* renamed from: b */
                public String f22598b;

                /* renamed from: c */
                public String f22599c;

                /* renamed from: d */
                public String f22600d;

                public C7304a() {
                    m15320b();
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public void mo14343a(C3141b c3141b) throws IOException {
                    c3141b.m15648b(1, this.f22598b);
                    if (!this.f22599c.equals("")) {
                        c3141b.m15648b(2, this.f22599c);
                    }
                    if (this.f22600d.equals("")) {
                        return;
                    }
                    c3141b.m15648b(3, this.f22600d);
                }

                /* renamed from: b */
                public C7304a m15320b() {
                    this.f22598b = "";
                    this.f22599c = "";
                    this.f22600d = "";
                    this.f23283a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public int mo14341a() {
                    int iM15631a = C3141b.m15631a(1, this.f22598b);
                    if (!this.f22599c.equals("")) {
                        iM15631a += C3141b.m15631a(2, this.f22599c);
                    }
                    return !this.f22600d.equals("") ? iM15631a + C3141b.m15631a(3, this.f22600d) : iM15631a;
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
                            this.f22598b = c3115a.m15593k();
                        } else if (iM15594l == 18) {
                            this.f22599c = c3115a.m15593k();
                        } else if (iM15594l != 26) {
                            if (!c3115a.m15587f(iM15594l)) {
                                break;
                            }
                        } else {
                            this.f22600d = c3115a.m15593k();
                        }
                    }
                    return this;
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.Vf$d$a$b */
            public static final class b extends AbstractC3219e {

                /* renamed from: b */
                public C2956Tf[] f22601b;

                /* renamed from: c */
                public C3031Wf[] f22602c;

                /* renamed from: d */
                public int f22603d;

                /* renamed from: e */
                public String f22604e;

                public b() {
                    m15321b();
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public void mo14343a(C3141b c3141b) throws IOException {
                    C2956Tf[] c2956TfArr = this.f22601b;
                    int i = 0;
                    if (c2956TfArr != null && c2956TfArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            C2956Tf[] c2956TfArr2 = this.f22601b;
                            if (i2 >= c2956TfArr2.length) {
                                break;
                            }
                            C2956Tf c2956Tf = c2956TfArr2[i2];
                            if (c2956Tf != null) {
                                c3141b.m15647b(1, c2956Tf);
                            }
                            i2++;
                        }
                    }
                    C3031Wf[] c3031WfArr = this.f22602c;
                    if (c3031WfArr != null && c3031WfArr.length > 0) {
                        while (true) {
                            C3031Wf[] c3031WfArr2 = this.f22602c;
                            if (i >= c3031WfArr2.length) {
                                break;
                            }
                            C3031Wf c3031Wf = c3031WfArr2[i];
                            if (c3031Wf != null) {
                                c3141b.m15647b(2, c3031Wf);
                            }
                            i++;
                        }
                    }
                    int i3 = this.f22603d;
                    if (i3 != 2) {
                        c3141b.m15654d(3, i3);
                    }
                    if (this.f22604e.equals("")) {
                        return;
                    }
                    c3141b.m15648b(4, this.f22604e);
                }

                /* renamed from: b */
                public b m15321b() {
                    this.f22601b = C2956Tf.m15196c();
                    this.f22602c = C3031Wf.m15390c();
                    this.f22603d = 2;
                    this.f22604e = "";
                    this.f23283a = -1;
                    return this;
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public int mo14341a() {
                    int iM15628a;
                    C2956Tf[] c2956TfArr = this.f22601b;
                    int i = 0;
                    if (c2956TfArr != null && c2956TfArr.length > 0) {
                        int i2 = 0;
                        iM15628a = 0;
                        while (true) {
                            C2956Tf[] c2956TfArr2 = this.f22601b;
                            if (i2 >= c2956TfArr2.length) {
                                break;
                            }
                            C2956Tf c2956Tf = c2956TfArr2[i2];
                            if (c2956Tf != null) {
                                iM15628a += C3141b.m15630a(1, c2956Tf);
                            }
                            i2++;
                        }
                    } else {
                        iM15628a = 0;
                    }
                    C3031Wf[] c3031WfArr = this.f22602c;
                    if (c3031WfArr != null && c3031WfArr.length > 0) {
                        while (true) {
                            C3031Wf[] c3031WfArr2 = this.f22602c;
                            if (i >= c3031WfArr2.length) {
                                break;
                            }
                            C3031Wf c3031Wf = c3031WfArr2[i];
                            if (c3031Wf != null) {
                                iM15628a = C3141b.m15630a(2, c3031Wf) + iM15628a;
                            }
                            i++;
                        }
                    }
                    int i3 = this.f22603d;
                    if (i3 != 2) {
                        iM15628a += C3141b.m15628a(3, i3);
                    }
                    return !this.f22604e.equals("") ? iM15628a + C3141b.m15631a(4, this.f22604e) : iM15628a;
                }

                @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
                /* renamed from: a */
                public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
                    while (true) {
                        int iM15594l = c3115a.m15594l();
                        if (iM15594l != 0) {
                            if (iM15594l == 10) {
                                int iM15952a = C3271g.m15952a(c3115a, 10);
                                C2956Tf[] c2956TfArr = this.f22601b;
                                int length = c2956TfArr == null ? 0 : c2956TfArr.length;
                                int i = iM15952a + length;
                                C2956Tf[] c2956TfArr2 = new C2956Tf[i];
                                if (length != 0) {
                                    System.arraycopy(c2956TfArr, 0, c2956TfArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    C2956Tf c2956Tf = new C2956Tf();
                                    c2956TfArr2[length] = c2956Tf;
                                    c3115a.m15577a(c2956Tf);
                                    c3115a.m15594l();
                                    length++;
                                }
                                C2956Tf c2956Tf2 = new C2956Tf();
                                c2956TfArr2[length] = c2956Tf2;
                                c3115a.m15577a(c2956Tf2);
                                this.f22601b = c2956TfArr2;
                            } else if (iM15594l == 18) {
                                int iM15952a2 = C3271g.m15952a(c3115a, 18);
                                C3031Wf[] c3031WfArr = this.f22602c;
                                int length2 = c3031WfArr == null ? 0 : c3031WfArr.length;
                                int i2 = iM15952a2 + length2;
                                C3031Wf[] c3031WfArr2 = new C3031Wf[i2];
                                if (length2 != 0) {
                                    System.arraycopy(c3031WfArr, 0, c3031WfArr2, 0, length2);
                                }
                                while (length2 < i2 - 1) {
                                    C3031Wf c3031Wf = new C3031Wf();
                                    c3031WfArr2[length2] = c3031Wf;
                                    c3115a.m15577a(c3031Wf);
                                    c3115a.m15594l();
                                    length2++;
                                }
                                C3031Wf c3031Wf2 = new C3031Wf();
                                c3031WfArr2[length2] = c3031Wf2;
                                c3115a.m15577a(c3031Wf2);
                                this.f22602c = c3031WfArr2;
                            } else if (iM15594l == 24) {
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
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                        this.f22603d = iM15590h;
                                        break;
                                }
                            } else if (iM15594l != 34) {
                                if (!c3115a.m15587f(iM15594l)) {
                                }
                            } else {
                                this.f22604e = c3115a.m15593k();
                            }
                        }
                    }
                    return this;
                }
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int iM15642c = C3141b.m15642c(3, this.f22577d) + C3141b.m15640b(2, this.f22576c) + C3141b.m15640b(1, this.f22575b);
                if (!this.f22578e.equals("")) {
                    iM15642c += C3141b.m15631a(4, this.f22578e);
                }
                byte[] bArr = this.f22579f;
                byte[] bArr2 = C3271g.f23459d;
                if (!Arrays.equals(bArr, bArr2)) {
                    iM15642c += C3141b.m15633a(5, this.f22579f);
                }
                b bVar = this.f22580g;
                if (bVar != null) {
                    iM15642c += C3141b.m15630a(6, bVar);
                }
                b bVar2 = this.f22581h;
                if (bVar2 != null) {
                    iM15642c += C3141b.m15630a(7, bVar2);
                }
                if (!this.f22582i.equals("")) {
                    iM15642c += C3141b.m15631a(8, this.f22582i);
                }
                C7304a c7304a = this.f22583j;
                if (c7304a != null) {
                    iM15642c += C3141b.m15630a(9, c7304a);
                }
                int i = this.f22584k;
                if (i != 0) {
                    iM15642c += C3141b.m15642c(10, i);
                }
                int i2 = this.f22585l;
                if (i2 != 0) {
                    iM15642c += C3141b.m15628a(12, i2);
                }
                int i3 = this.f22586m;
                if (i3 != -1) {
                    iM15642c += C3141b.m15628a(13, i3);
                }
                if (!Arrays.equals(this.f22587n, bArr2)) {
                    iM15642c += C3141b.m15633a(14, this.f22587n);
                }
                int i4 = this.f22588o;
                if (i4 != -1) {
                    iM15642c += C3141b.m15628a(15, i4);
                }
                long j = this.f22589p;
                if (j != 0) {
                    iM15642c += C3141b.m15640b(16, j);
                }
                long j2 = this.f22590q;
                if (j2 != 0) {
                    iM15642c += C3141b.m15640b(17, j2);
                }
                int i5 = this.f22591r;
                if (i5 != 0) {
                    iM15642c += C3141b.m15628a(18, i5);
                }
                int i6 = this.f22592s;
                if (i6 != 0) {
                    iM15642c += C3141b.m15628a(19, i6);
                }
                int i7 = this.f22593t;
                if (i7 != -1) {
                    iM15642c += C3141b.m15628a(20, i7);
                }
                int i8 = this.f22594u;
                if (i8 != 0) {
                    iM15642c += C3141b.m15628a(21, i8);
                }
                int i9 = this.f22595v;
                if (i9 != 0) {
                    iM15642c += C3141b.m15628a(22, i9);
                }
                boolean z = this.f22596w;
                if (z) {
                    iM15642c += C3141b.m15632a(23, z);
                }
                long j3 = this.f22597x;
                return j3 != 1 ? iM15642c + C3141b.m15640b(24, j3) : iM15642c;
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
                            this.f22575b = c3115a.m15591i();
                            break;
                        case 16:
                            this.f22576c = c3115a.m15591i();
                            break;
                        case 24:
                            this.f22577d = c3115a.m15590h();
                            break;
                        case 34:
                            this.f22578e = c3115a.m15593k();
                            break;
                        case C5043c9.f31377M /* 42 */:
                            this.f22579f = c3115a.m15582d();
                            break;
                        case 50:
                            if (this.f22580g == null) {
                                this.f22580g = new b();
                            }
                            c3115a.m15577a(this.f22580g);
                            break;
                        case 58:
                            if (this.f22581h == null) {
                                this.f22581h = new b();
                            }
                            c3115a.m15577a(this.f22581h);
                            break;
                        case 66:
                            this.f22582i = c3115a.m15593k();
                            break;
                        case 74:
                            if (this.f22583j == null) {
                                this.f22583j = new C7304a();
                            }
                            c3115a.m15577a(this.f22583j);
                            break;
                        case 80:
                            this.f22584k = c3115a.m15590h();
                            break;
                        case 96:
                            int iM15590h = c3115a.m15590h();
                            if (iM15590h != 0 && iM15590h != 1 && iM15590h != 2) {
                                break;
                            } else {
                                this.f22585l = iM15590h;
                                break;
                            }
                            break;
                        case 104:
                            int iM15590h2 = c3115a.m15590h();
                            if (iM15590h2 != -1 && iM15590h2 != 0 && iM15590h2 != 1) {
                                break;
                            } else {
                                this.f22586m = iM15590h2;
                                break;
                            }
                        case 114:
                            this.f22587n = c3115a.m15582d();
                            break;
                        case 120:
                            int iM15590h3 = c3115a.m15590h();
                            if (iM15590h3 != -1 && iM15590h3 != 0 && iM15590h3 != 1) {
                                break;
                            } else {
                                this.f22588o = iM15590h3;
                                break;
                            }
                        case 128:
                            this.f22589p = c3115a.m15591i();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                            this.f22590q = c3115a.m15591i();
                            break;
                        case 144:
                            int iM15590h4 = c3115a.m15590h();
                            if (iM15590h4 != 0 && iM15590h4 != 1 && iM15590h4 != 2 && iM15590h4 != 3 && iM15590h4 != 4) {
                                break;
                            } else {
                                this.f22591r = iM15590h4;
                                break;
                            }
                            break;
                        case 152:
                            int iM15590h5 = c3115a.m15590h();
                            if (iM15590h5 != 0 && iM15590h5 != 1 && iM15590h5 != 2 && iM15590h5 != 3) {
                                break;
                            } else {
                                this.f22592s = iM15590h5;
                                break;
                            }
                            break;
                        case 160:
                            int iM15590h6 = c3115a.m15590h();
                            if (iM15590h6 != -1 && iM15590h6 != 0 && iM15590h6 != 1) {
                                break;
                            } else {
                                this.f22593t = iM15590h6;
                                break;
                            }
                            break;
                        case 168:
                            int iM15590h7 = c3115a.m15590h();
                            if (iM15590h7 != 0 && iM15590h7 != 1 && iM15590h7 != 2 && iM15590h7 != 3) {
                                break;
                            } else {
                                this.f22594u = iM15590h7;
                                break;
                            }
                            break;
                        case 176:
                            int iM15590h8 = c3115a.m15590h();
                            if (iM15590h8 != 0 && iM15590h8 != 1) {
                                break;
                            } else {
                                this.f22595v = iM15590h8;
                                break;
                            }
                            break;
                        case 184:
                            this.f22596w = c3115a.m15581c();
                            break;
                        case 192:
                            this.f22597x = c3115a.m15591i();
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

        /* renamed from: com.yandex.metrica.impl.ob.Vf$d$b */
        public static final class b extends AbstractC3219e {

            /* renamed from: b */
            public f f22605b;

            /* renamed from: c */
            public String f22606c;

            /* renamed from: d */
            public int f22607d;

            public b() {
                m15322b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                f fVar = this.f22605b;
                if (fVar != null) {
                    c3141b.m15647b(1, fVar);
                }
                c3141b.m15648b(2, this.f22606c);
                int i = this.f22607d;
                if (i != 0) {
                    c3141b.m15654d(5, i);
                }
            }

            /* renamed from: b */
            public b m15322b() {
                this.f22605b = null;
                this.f22606c = "";
                this.f22607d = 0;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                f fVar = this.f22605b;
                int iM15631a = C3141b.m15631a(2, this.f22606c) + (fVar != null ? C3141b.m15630a(1, fVar) : 0);
                int i = this.f22607d;
                return i != 0 ? iM15631a + C3141b.m15628a(5, i) : iM15631a;
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
                        if (this.f22605b == null) {
                            this.f22605b = new f();
                        }
                        c3115a.m15577a(this.f22605b);
                    } else if (iM15594l == 18) {
                        this.f22606c = c3115a.m15593k();
                    } else if (iM15594l != 40) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2) {
                            this.f22607d = iM15590h;
                        }
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15640b = C3141b.m15640b(1, this.f22571b);
            b bVar = this.f22572c;
            if (bVar != null) {
                iM15640b += C3141b.m15630a(2, bVar);
            }
            a[] aVarArr = this.f22573d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    a[] aVarArr2 = this.f22573d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        iM15640b = C3141b.m15630a(3, aVar) + iM15640b;
                    }
                    i++;
                }
            }
            return iM15640b;
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
                    this.f22571b = c3115a.m15591i();
                } else if (iM15594l == 18) {
                    if (this.f22572c == null) {
                        this.f22572c = new b();
                    }
                    c3115a.m15577a(this.f22572c);
                } else if (iM15594l != 26) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    int iM15952a = C3271g.m15952a(c3115a, 26);
                    a[] aVarArr = this.f22573d;
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
                    this.f22573d = aVarArr2;
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$f */
    public static final class f extends AbstractC3219e {

        /* renamed from: b */
        public long f22613b;

        /* renamed from: c */
        public int f22614c;

        /* renamed from: d */
        public long f22615d;

        /* renamed from: e */
        public boolean f22616e;

        public f() {
            m15325b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15658e(1, this.f22613b);
            c3141b.m15657e(2, this.f22614c);
            long j = this.f22615d;
            if (j != 0) {
                c3141b.m15652c(3, j);
            }
            boolean z = this.f22616e;
            if (z) {
                c3141b.m15649b(4, z);
            }
        }

        /* renamed from: b */
        public f m15325b() {
            this.f22613b = 0L;
            this.f22614c = 0;
            this.f22615d = 0L;
            this.f22616e = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15639b = C3141b.m15639b(2, this.f22614c) + C3141b.m15640b(1, this.f22613b);
            long j = this.f22615d;
            if (j != 0) {
                iM15639b += C3141b.m15629a(3, j);
            }
            boolean z = this.f22616e;
            return z ? iM15639b + C3141b.m15632a(4, z) : iM15639b;
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
                    this.f22613b = c3115a.m15591i();
                } else if (iM15594l == 16) {
                    this.f22614c = c3115a.m15592j();
                } else if (iM15594l == 24) {
                    this.f22615d = c3115a.m15591i();
                } else if (iM15594l != 32) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22616e = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$e */
    public static final class e extends AbstractC3219e {

        /* renamed from: f */
        private static volatile e[] f22608f;

        /* renamed from: b */
        public int f22609b;

        /* renamed from: c */
        public int f22610c;

        /* renamed from: d */
        public String f22611d;

        /* renamed from: e */
        public boolean f22612e;

        public e() {
            m15324b();
        }

        /* renamed from: c */
        public static e[] m15323c() {
            if (f22608f == null) {
                synchronized (C3167c.f23164a) {
                    try {
                        if (f22608f == null) {
                            f22608f = new e[0];
                        }
                    } finally {
                    }
                }
            }
            return f22608f;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            int i = this.f22609b;
            if (i != 0) {
                c3141b.m15659f(1, i);
            }
            int i2 = this.f22610c;
            if (i2 != 0) {
                c3141b.m15659f(2, i2);
            }
            if (!this.f22611d.equals("")) {
                c3141b.m15648b(3, this.f22611d);
            }
            boolean z = this.f22612e;
            if (z) {
                c3141b.m15649b(4, z);
            }
        }

        /* renamed from: b */
        public e m15324b() {
            this.f22609b = 0;
            this.f22610c = 0;
            this.f22611d = "";
            this.f22612e = false;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int i = this.f22609b;
            int iM15642c = i != 0 ? C3141b.m15642c(1, i) : 0;
            int i2 = this.f22610c;
            if (i2 != 0) {
                iM15642c += C3141b.m15642c(2, i2);
            }
            if (!this.f22611d.equals("")) {
                iM15642c += C3141b.m15631a(3, this.f22611d);
            }
            boolean z = this.f22612e;
            return z ? iM15642c + C3141b.m15632a(4, z) : iM15642c;
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
                    this.f22609b = c3115a.m15590h();
                } else if (iM15594l == 16) {
                    this.f22610c = c3115a.m15590h();
                } else if (iM15594l == 26) {
                    this.f22611d = c3115a.m15593k();
                } else if (iM15594l != 32) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22612e = c3115a.m15581c();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Vf$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public double f22545b;

        /* renamed from: c */
        public double f22546c;

        /* renamed from: d */
        public long f22547d;

        /* renamed from: e */
        public int f22548e;

        /* renamed from: f */
        public int f22549f;

        /* renamed from: g */
        public int f22550g;

        /* renamed from: h */
        public int f22551h;

        /* renamed from: i */
        public int f22552i;

        /* renamed from: j */
        public String f22553j;

        public b() {
            m15312b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15646b(1, this.f22545b);
            c3141b.m15646b(2, this.f22546c);
            long j = this.f22547d;
            if (j != 0) {
                c3141b.m15658e(3, j);
            }
            int i = this.f22548e;
            if (i != 0) {
                c3141b.m15659f(4, i);
            }
            int i2 = this.f22549f;
            if (i2 != 0) {
                c3141b.m15659f(5, i2);
            }
            int i3 = this.f22550g;
            if (i3 != 0) {
                c3141b.m15659f(6, i3);
            }
            int i4 = this.f22551h;
            if (i4 != 0) {
                c3141b.m15654d(7, i4);
            }
            int i5 = this.f22552i;
            if (i5 != 0) {
                c3141b.m15654d(8, i5);
            }
            if (this.f22553j.equals("")) {
                return;
            }
            c3141b.m15648b(9, this.f22553j);
        }

        /* renamed from: b */
        public b m15312b() {
            this.f22545b = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f22546c = ConfigValue.DOUBLE_DEFAULT_VALUE;
            this.f22547d = 0L;
            this.f22548e = 0;
            this.f22549f = 0;
            this.f22550g = 0;
            this.f22551h = 0;
            this.f22552i = 0;
            this.f22553j = "";
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15627a = C3141b.m15627a(2, this.f22546c) + C3141b.m15627a(1, this.f22545b);
            long j = this.f22547d;
            if (j != 0) {
                iM15627a += C3141b.m15640b(3, j);
            }
            int i = this.f22548e;
            if (i != 0) {
                iM15627a += C3141b.m15642c(4, i);
            }
            int i2 = this.f22549f;
            if (i2 != 0) {
                iM15627a += C3141b.m15642c(5, i2);
            }
            int i3 = this.f22550g;
            if (i3 != 0) {
                iM15627a += C3141b.m15642c(6, i3);
            }
            int i4 = this.f22551h;
            if (i4 != 0) {
                iM15627a += C3141b.m15628a(7, i4);
            }
            int i5 = this.f22552i;
            if (i5 != 0) {
                iM15627a += C3141b.m15628a(8, i5);
            }
            return !this.f22553j.equals("") ? iM15627a + C3141b.m15631a(9, this.f22553j) : iM15627a;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public AbstractC3219e mo14342a(C3115a c3115a) throws IOException {
            while (true) {
                int iM15594l = c3115a.m15594l();
                if (iM15594l == 0) {
                    break;
                }
                if (iM15594l == 9) {
                    this.f22545b = Double.longBitsToDouble(c3115a.m15588g());
                } else if (iM15594l == 17) {
                    this.f22546c = Double.longBitsToDouble(c3115a.m15588g());
                } else if (iM15594l == 24) {
                    this.f22547d = c3115a.m15591i();
                } else if (iM15594l == 32) {
                    this.f22548e = c3115a.m15590h();
                } else if (iM15594l == 40) {
                    this.f22549f = c3115a.m15590h();
                } else if (iM15594l == 48) {
                    this.f22550g = c3115a.m15590h();
                } else if (iM15594l == 56) {
                    this.f22551h = c3115a.m15590h();
                } else if (iM15594l == 64) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2) {
                        this.f22552i = iM15590h;
                    }
                } else if (iM15594l != 74) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22553j = c3115a.m15593k();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15630a;
        d[] dVarArr = this.f22537b;
        int i = 0;
        if (dVarArr != null && dVarArr.length > 0) {
            int i2 = 0;
            iM15630a = 0;
            while (true) {
                d[] dVarArr2 = this.f22537b;
                if (i2 >= dVarArr2.length) {
                    break;
                }
                d dVar = dVarArr2[i2];
                if (dVar != null) {
                    iM15630a += C3141b.m15630a(3, dVar);
                }
                i2++;
            }
        } else {
            iM15630a = 0;
        }
        c cVar = this.f22538c;
        if (cVar != null) {
            iM15630a += C3141b.m15630a(4, cVar);
        }
        a[] aVarArr = this.f22539d;
        if (aVarArr != null && aVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                a[] aVarArr2 = this.f22539d;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i3];
                if (aVar != null) {
                    iM15630a = C3141b.m15630a(7, aVar) + iM15630a;
                }
                i3++;
            }
        }
        e[] eVarArr = this.f22540e;
        if (eVarArr != null && eVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                e[] eVarArr2 = this.f22540e;
                if (i4 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i4];
                if (eVar != null) {
                    iM15630a = C3141b.m15630a(10, eVar) + iM15630a;
                }
                i4++;
            }
        }
        String[] strArr = this.f22541f;
        if (strArr == null || strArr.length <= 0) {
            return iM15630a;
        }
        int iM15636a = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f22541f;
            if (i >= strArr2.length) {
                return iM15630a + iM15636a + i5;
            }
            String str = strArr2[i];
            if (str != null) {
                i5++;
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
            if (iM15594l == 26) {
                int iM15952a = C3271g.m15952a(c3115a, 26);
                d[] dVarArr = this.f22537b;
                int length = dVarArr == null ? 0 : dVarArr.length;
                int i = iM15952a + length;
                d[] dVarArr2 = new d[i];
                if (length != 0) {
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                }
                while (length < i - 1) {
                    d dVar = new d();
                    dVarArr2[length] = dVar;
                    c3115a.m15577a(dVar);
                    c3115a.m15594l();
                    length++;
                }
                d dVar2 = new d();
                dVarArr2[length] = dVar2;
                c3115a.m15577a(dVar2);
                this.f22537b = dVarArr2;
            } else if (iM15594l == 34) {
                if (this.f22538c == null) {
                    this.f22538c = new c();
                }
                c3115a.m15577a(this.f22538c);
            } else if (iM15594l == 58) {
                int iM15952a2 = C3271g.m15952a(c3115a, 58);
                a[] aVarArr = this.f22539d;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i2 = iM15952a2 + length2;
                a[] aVarArr2 = new a[i2];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    c3115a.m15577a(aVar);
                    c3115a.m15594l();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                c3115a.m15577a(aVar2);
                this.f22539d = aVarArr2;
            } else if (iM15594l == 82) {
                int iM15952a3 = C3271g.m15952a(c3115a, 82);
                e[] eVarArr = this.f22540e;
                int length3 = eVarArr == null ? 0 : eVarArr.length;
                int i3 = iM15952a3 + length3;
                e[] eVarArr2 = new e[i3];
                if (length3 != 0) {
                    System.arraycopy(eVarArr, 0, eVarArr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    e eVar = new e();
                    eVarArr2[length3] = eVar;
                    c3115a.m15577a(eVar);
                    c3115a.m15594l();
                    length3++;
                }
                e eVar2 = new e();
                eVarArr2[length3] = eVar2;
                c3115a.m15577a(eVar2);
                this.f22540e = eVarArr2;
            } else if (iM15594l != 90) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15952a4 = C3271g.m15952a(c3115a, 90);
                String[] strArr = this.f22541f;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = iM15952a4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = c3115a.m15593k();
                    c3115a.m15594l();
                    length4++;
                }
                strArr2[length4] = c3115a.m15593k();
                this.f22541f = strArr2;
            }
        }
        return this;
    }
}
