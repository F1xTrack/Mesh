package com.yandex.metrica.impl.p022ob;

import com.facebook.crypto.mac.NativeMac;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Zf */
/* loaded from: classes2.dex */
public final class C3106Zf extends AbstractC3219e {

    /* renamed from: b */
    public int f22957b;

    /* renamed from: c */
    public double f22958c;

    /* renamed from: d */
    public byte[] f22959d;

    /* renamed from: e */
    public byte[] f22960e;

    /* renamed from: f */
    public byte[] f22961f;

    /* renamed from: g */
    public a f22962g;

    /* renamed from: h */
    public long f22963h;

    /* renamed from: i */
    public boolean f22964i;

    /* renamed from: j */
    public int f22965j;

    /* renamed from: k */
    public int f22966k;

    /* renamed from: l */
    public c f22967l;

    /* renamed from: m */
    public b f22968m;

    public C3106Zf() {
        m15543b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        int i = this.f22957b;
        if (i != 1) {
            c3141b.m15659f(1, i);
        }
        if (Double.doubleToLongBits(this.f22958c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            c3141b.m15646b(2, this.f22958c);
        }
        c3141b.m15650b(3, this.f22959d);
        byte[] bArr = this.f22960e;
        byte[] bArr2 = C3271g.f23459d;
        if (!Arrays.equals(bArr, bArr2)) {
            c3141b.m15650b(4, this.f22960e);
        }
        if (!Arrays.equals(this.f22961f, bArr2)) {
            c3141b.m15650b(5, this.f22961f);
        }
        a aVar = this.f22962g;
        if (aVar != null) {
            c3141b.m15647b(6, aVar);
        }
        long j = this.f22963h;
        if (j != 0) {
            c3141b.m15652c(7, j);
        }
        boolean z = this.f22964i;
        if (z) {
            c3141b.m15649b(8, z);
        }
        int i2 = this.f22965j;
        if (i2 != 0) {
            c3141b.m15654d(9, i2);
        }
        int i3 = this.f22966k;
        if (i3 != 1) {
            c3141b.m15654d(10, i3);
        }
        c cVar = this.f22967l;
        if (cVar != null) {
            c3141b.m15647b(11, cVar);
        }
        b bVar = this.f22968m;
        if (bVar != null) {
            c3141b.m15647b(12, bVar);
        }
    }

    /* renamed from: b */
    public C3106Zf m15543b() {
        this.f22957b = 1;
        this.f22958c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        byte[] bArr = C3271g.f23459d;
        this.f22959d = bArr;
        this.f22960e = bArr;
        this.f22961f = bArr;
        this.f22962g = null;
        this.f22963h = 0L;
        this.f22964i = false;
        this.f22965j = 0;
        this.f22966k = 1;
        this.f22967l = null;
        this.f22968m = null;
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$b */
    public static final class b extends AbstractC3219e {

        /* renamed from: b */
        public boolean f22971b;

        /* renamed from: c */
        public C7305b f22972c;

        /* renamed from: d */
        public a f22973d;

        public b() {
            m15545b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            boolean z = this.f22971b;
            if (z) {
                c3141b.m15649b(1, z);
            }
            C7305b c7305b = this.f22972c;
            if (c7305b != null) {
                c3141b.m15647b(2, c7305b);
            }
            a aVar = this.f22973d;
            if (aVar != null) {
                c3141b.m15647b(3, aVar);
            }
        }

        /* renamed from: b */
        public b m15545b() {
            this.f22971b = false;
            this.f22972c = null;
            this.f22973d = null;
            this.f23283a = -1;
            return this;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$b, reason: collision with other inner class name */
        public static final class C7305b extends AbstractC3219e {

            /* renamed from: b */
            public int f22978b;

            /* renamed from: c */
            public int f22979c;

            public C7305b() {
                m15547b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                int i = this.f22978b;
                if (i != 0) {
                    c3141b.m15659f(1, i);
                }
                int i2 = this.f22979c;
                if (i2 != 0) {
                    c3141b.m15654d(2, i2);
                }
            }

            /* renamed from: b */
            public C7305b m15547b() {
                this.f22978b = 0;
                this.f22979c = 0;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                int i = this.f22978b;
                int iM15642c = i != 0 ? C3141b.m15642c(1, i) : 0;
                int i2 = this.f22979c;
                return i2 != 0 ? iM15642c + C3141b.m15628a(2, i2) : iM15642c;
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
                        this.f22978b = c3115a.m15590h();
                    } else if (iM15594l != 16) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        int iM15590h = c3115a.m15590h();
                        if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3 || iM15590h == 4) {
                            this.f22979c = iM15590h;
                        }
                    }
                }
                return this;
            }
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            boolean z = this.f22971b;
            int iM15632a = z ? C3141b.m15632a(1, z) : 0;
            C7305b c7305b = this.f22972c;
            if (c7305b != null) {
                iM15632a += C3141b.m15630a(2, c7305b);
            }
            a aVar = this.f22973d;
            return aVar != null ? iM15632a + C3141b.m15630a(3, aVar) : iM15632a;
        }

        /* renamed from: com.yandex.metrica.impl.ob.Zf$b$a */
        public static final class a extends AbstractC3219e {

            /* renamed from: b */
            public long f22974b;

            /* renamed from: c */
            public C7305b f22975c;

            /* renamed from: d */
            public int f22976d;

            /* renamed from: e */
            public byte[] f22977e;

            public a() {
                m15546b();
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public void mo14343a(C3141b c3141b) throws IOException {
                long j = this.f22974b;
                if (j != 0) {
                    c3141b.m15652c(1, j);
                }
                C7305b c7305b = this.f22975c;
                if (c7305b != null) {
                    c3141b.m15647b(2, c7305b);
                }
                int i = this.f22976d;
                if (i != 0) {
                    c3141b.m15659f(3, i);
                }
                if (Arrays.equals(this.f22977e, C3271g.f23459d)) {
                    return;
                }
                c3141b.m15650b(4, this.f22977e);
            }

            /* renamed from: b */
            public a m15546b() {
                this.f22974b = 0L;
                this.f22975c = null;
                this.f22976d = 0;
                this.f22977e = C3271g.f23459d;
                this.f23283a = -1;
                return this;
            }

            @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
            /* renamed from: a */
            public int mo14341a() {
                long j = this.f22974b;
                int iM15629a = j != 0 ? C3141b.m15629a(1, j) : 0;
                C7305b c7305b = this.f22975c;
                if (c7305b != null) {
                    iM15629a += C3141b.m15630a(2, c7305b);
                }
                int i = this.f22976d;
                if (i != 0) {
                    iM15629a += C3141b.m15642c(3, i);
                }
                return !Arrays.equals(this.f22977e, C3271g.f23459d) ? iM15629a + C3141b.m15633a(4, this.f22977e) : iM15629a;
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
                        this.f22974b = c3115a.m15591i();
                    } else if (iM15594l == 18) {
                        if (this.f22975c == null) {
                            this.f22975c = new C7305b();
                        }
                        c3115a.m15577a(this.f22975c);
                    } else if (iM15594l == 24) {
                        this.f22976d = c3115a.m15590h();
                    } else if (iM15594l != 34) {
                        if (!c3115a.m15587f(iM15594l)) {
                            break;
                        }
                    } else {
                        this.f22977e = c3115a.m15582d();
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
                if (iM15594l == 8) {
                    this.f22971b = c3115a.m15581c();
                } else if (iM15594l == 18) {
                    if (this.f22972c == null) {
                        this.f22972c = new C7305b();
                    }
                    c3115a.m15577a(this.f22972c);
                } else if (iM15594l != 26) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f22973d == null) {
                        this.f22973d = new a();
                    }
                    c3115a.m15577a(this.f22973d);
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22969b;

        /* renamed from: c */
        public byte[] f22970c;

        public a() {
            m15544b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22969b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22969b);
            }
            if (Arrays.equals(this.f22970c, bArr2)) {
                return;
            }
            c3141b.m15650b(2, this.f22970c);
        }

        /* renamed from: b */
        public a m15544b() {
            byte[] bArr = C3271g.f23459d;
            this.f22969b = bArr;
            this.f22970c = bArr;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22969b;
            byte[] bArr2 = C3271g.f23459d;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22969b) : 0;
            return !Arrays.equals(this.f22970c, bArr2) ? iM15633a + C3141b.m15633a(2, this.f22970c) : iM15633a;
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
                    this.f22969b = c3115a.m15582d();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22970c = c3115a.m15582d();
                }
            }
            return this;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Zf$c */
    public static final class c extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f22980b;

        /* renamed from: c */
        public long f22981c;

        /* renamed from: d */
        public int f22982d;

        /* renamed from: e */
        public byte[] f22983e;

        /* renamed from: f */
        public long f22984f;

        public c() {
            m15548b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            byte[] bArr = this.f22980b;
            byte[] bArr2 = C3271g.f23459d;
            if (!Arrays.equals(bArr, bArr2)) {
                c3141b.m15650b(1, this.f22980b);
            }
            long j = this.f22981c;
            if (j != 0) {
                c3141b.m15658e(2, j);
            }
            int i = this.f22982d;
            if (i != 0) {
                c3141b.m15654d(3, i);
            }
            if (!Arrays.equals(this.f22983e, bArr2)) {
                c3141b.m15650b(4, this.f22983e);
            }
            long j2 = this.f22984f;
            if (j2 != 0) {
                c3141b.m15658e(5, j2);
            }
        }

        /* renamed from: b */
        public c m15548b() {
            byte[] bArr = C3271g.f23459d;
            this.f22980b = bArr;
            this.f22981c = 0L;
            this.f22982d = 0;
            this.f22983e = bArr;
            this.f22984f = 0L;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            byte[] bArr = this.f22980b;
            byte[] bArr2 = C3271g.f23459d;
            int iM15633a = !Arrays.equals(bArr, bArr2) ? C3141b.m15633a(1, this.f22980b) : 0;
            long j = this.f22981c;
            if (j != 0) {
                iM15633a += C3141b.m15640b(2, j);
            }
            int i = this.f22982d;
            if (i != 0) {
                iM15633a += C3141b.m15628a(3, i);
            }
            if (!Arrays.equals(this.f22983e, bArr2)) {
                iM15633a += C3141b.m15633a(4, this.f22983e);
            }
            long j2 = this.f22984f;
            return j2 != 0 ? iM15633a + C3141b.m15640b(5, j2) : iM15633a;
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
                    this.f22980b = c3115a.m15582d();
                } else if (iM15594l == 16) {
                    this.f22981c = c3115a.m15591i();
                } else if (iM15594l == 24) {
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2) {
                        this.f22982d = iM15590h;
                    }
                } else if (iM15594l == 34) {
                    this.f22983e = c3115a.m15582d();
                } else if (iM15594l != 40) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    this.f22984f = c3115a.m15591i();
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int i = this.f22957b;
        int iM15642c = i != 1 ? C3141b.m15642c(1, i) : 0;
        if (Double.doubleToLongBits(this.f22958c) != Double.doubleToLongBits(ConfigValue.DOUBLE_DEFAULT_VALUE)) {
            iM15642c += C3141b.m15627a(2, this.f22958c);
        }
        int iM15633a = C3141b.m15633a(3, this.f22959d) + iM15642c;
        byte[] bArr = this.f22960e;
        byte[] bArr2 = C3271g.f23459d;
        if (!Arrays.equals(bArr, bArr2)) {
            iM15633a += C3141b.m15633a(4, this.f22960e);
        }
        if (!Arrays.equals(this.f22961f, bArr2)) {
            iM15633a += C3141b.m15633a(5, this.f22961f);
        }
        a aVar = this.f22962g;
        if (aVar != null) {
            iM15633a += C3141b.m15630a(6, aVar);
        }
        long j = this.f22963h;
        if (j != 0) {
            iM15633a += C3141b.m15629a(7, j);
        }
        boolean z = this.f22964i;
        if (z) {
            iM15633a += C3141b.m15632a(8, z);
        }
        int i2 = this.f22965j;
        if (i2 != 0) {
            iM15633a += C3141b.m15628a(9, i2);
        }
        int i3 = this.f22966k;
        if (i3 != 1) {
            iM15633a += C3141b.m15628a(10, i3);
        }
        c cVar = this.f22967l;
        if (cVar != null) {
            iM15633a += C3141b.m15630a(11, cVar);
        }
        b bVar = this.f22968m;
        return bVar != null ? iM15633a + C3141b.m15630a(12, bVar) : iM15633a;
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
                    this.f22957b = c3115a.m15590h();
                    break;
                case 17:
                    this.f22958c = Double.longBitsToDouble(c3115a.m15588g());
                    break;
                case 26:
                    this.f22959d = c3115a.m15582d();
                    break;
                case 34:
                    this.f22960e = c3115a.m15582d();
                    break;
                case C5043c9.f31377M /* 42 */:
                    this.f22961f = c3115a.m15582d();
                    break;
                case 50:
                    if (this.f22962g == null) {
                        this.f22962g = new a();
                    }
                    c3115a.m15577a(this.f22962g);
                    break;
                case 56:
                    this.f22963h = c3115a.m15591i();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    this.f22964i = c3115a.m15581c();
                    break;
                case 72:
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h != 0 && iM15590h != 1 && iM15590h != 2) {
                        break;
                    } else {
                        this.f22965j = iM15590h;
                        break;
                    }
                    break;
                case 80:
                    int iM15590h2 = c3115a.m15590h();
                    if (iM15590h2 != 1 && iM15590h2 != 2) {
                        break;
                    } else {
                        this.f22966k = iM15590h2;
                        break;
                    }
                    break;
                case 90:
                    if (this.f22967l == null) {
                        this.f22967l = new c();
                    }
                    c3115a.m15577a(this.f22967l);
                    break;
                case 98:
                    if (this.f22968m == null) {
                        this.f22968m = new b();
                    }
                    c3115a.m15577a(this.f22968m);
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
