package com.yandex.metrica.impl.p022ob;

import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Mf */
/* loaded from: classes2.dex */
public final class C2782Mf extends AbstractC3219e {

    /* renamed from: m */
    private static byte[] f21737m;

    /* renamed from: n */
    private static volatile boolean f21738n;

    /* renamed from: b */
    public C2882Qf f21739b;

    /* renamed from: c */
    public C2682If f21740c;

    /* renamed from: d */
    public String f21741d;

    /* renamed from: e */
    public int f21742e;

    /* renamed from: f */
    public C2832Of[] f21743f;

    /* renamed from: g */
    public String f21744g;

    /* renamed from: h */
    public int f21745h;

    /* renamed from: i */
    public a f21746i;

    /* renamed from: j */
    public byte[] f21747j;

    /* renamed from: k */
    public byte[] f21748k;

    /* renamed from: l */
    public C2732Kf[] f21749l;

    /* renamed from: com.yandex.metrica.impl.ob.Mf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public String f21750b;

        public a() {
            m14625b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            c3141b.m15648b(1, this.f21750b);
        }

        /* renamed from: b */
        public a m14625b() {
            this.f21750b = "";
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            return C3141b.m15631a(1, this.f21750b);
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
                    this.f21750b = c3115a.m15593k();
                }
            }
            return this;
        }
    }

    public C2782Mf() {
        if (!f21738n) {
            synchronized (C3167c.f23164a) {
                try {
                    if (!f21738n) {
                        f21737m = C3167c.m15698a("JVM");
                        f21738n = true;
                    }
                } finally {
                }
            }
        }
        m14624b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        C2882Qf c2882Qf = this.f21739b;
        if (c2882Qf != null) {
            c3141b.m15647b(1, c2882Qf);
        }
        C2682If c2682If = this.f21740c;
        if (c2682If != null) {
            c3141b.m15647b(2, c2682If);
        }
        if (!this.f21741d.equals("")) {
            c3141b.m15648b(3, this.f21741d);
        }
        int i = this.f21742e;
        if (i != -1) {
            c3141b.m15654d(4, i);
        }
        C2832Of[] c2832OfArr = this.f21743f;
        int i2 = 0;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f21743f;
                if (i3 >= c2832OfArr2.length) {
                    break;
                }
                C2832Of c2832Of = c2832OfArr2[i3];
                if (c2832Of != null) {
                    c3141b.m15647b(5, c2832Of);
                }
                i3++;
            }
        }
        if (!this.f21744g.equals("")) {
            c3141b.m15648b(6, this.f21744g);
        }
        int i4 = this.f21745h;
        if (i4 != 0) {
            c3141b.m15654d(7, i4);
        }
        a aVar = this.f21746i;
        if (aVar != null) {
            c3141b.m15647b(8, aVar);
        }
        if (!Arrays.equals(this.f21747j, f21737m)) {
            c3141b.m15650b(9, this.f21747j);
        }
        if (!Arrays.equals(this.f21748k, C3271g.f23459d)) {
            c3141b.m15650b(10, this.f21748k);
        }
        C2732Kf[] c2732KfArr = this.f21749l;
        if (c2732KfArr == null || c2732KfArr.length <= 0) {
            return;
        }
        while (true) {
            C2732Kf[] c2732KfArr2 = this.f21749l;
            if (i2 >= c2732KfArr2.length) {
                return;
            }
            C2732Kf c2732Kf = c2732KfArr2[i2];
            if (c2732Kf != null) {
                c3141b.m15647b(11, c2732Kf);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C2782Mf m14624b() {
        this.f21739b = null;
        this.f21740c = null;
        this.f21741d = "";
        this.f21742e = -1;
        this.f21743f = C2832Of.m14701c();
        this.f21744g = "";
        this.f21745h = 0;
        this.f21746i = null;
        this.f21747j = (byte[]) f21737m.clone();
        this.f21748k = C3271g.f23459d;
        this.f21749l = C2732Kf.m14477c();
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        C2882Qf c2882Qf = this.f21739b;
        int i = 0;
        int iM15630a = c2882Qf != null ? C3141b.m15630a(1, c2882Qf) : 0;
        C2682If c2682If = this.f21740c;
        if (c2682If != null) {
            iM15630a += C3141b.m15630a(2, c2682If);
        }
        if (!this.f21741d.equals("")) {
            iM15630a += C3141b.m15631a(3, this.f21741d);
        }
        int i2 = this.f21742e;
        if (i2 != -1) {
            iM15630a += C3141b.m15628a(4, i2);
        }
        C2832Of[] c2832OfArr = this.f21743f;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f21743f;
                if (i3 >= c2832OfArr2.length) {
                    break;
                }
                C2832Of c2832Of = c2832OfArr2[i3];
                if (c2832Of != null) {
                    iM15630a = C3141b.m15630a(5, c2832Of) + iM15630a;
                }
                i3++;
            }
        }
        if (!this.f21744g.equals("")) {
            iM15630a += C3141b.m15631a(6, this.f21744g);
        }
        int i4 = this.f21745h;
        if (i4 != 0) {
            iM15630a += C3141b.m15628a(7, i4);
        }
        a aVar = this.f21746i;
        if (aVar != null) {
            iM15630a += C3141b.m15630a(8, aVar);
        }
        if (!Arrays.equals(this.f21747j, f21737m)) {
            iM15630a += C3141b.m15633a(9, this.f21747j);
        }
        if (!Arrays.equals(this.f21748k, C3271g.f23459d)) {
            iM15630a += C3141b.m15633a(10, this.f21748k);
        }
        C2732Kf[] c2732KfArr = this.f21749l;
        if (c2732KfArr != null && c2732KfArr.length > 0) {
            while (true) {
                C2732Kf[] c2732KfArr2 = this.f21749l;
                if (i >= c2732KfArr2.length) {
                    break;
                }
                C2732Kf c2732Kf = c2732KfArr2[i];
                if (c2732Kf != null) {
                    iM15630a = C3141b.m15630a(11, c2732Kf) + iM15630a;
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
            switch (iM15594l) {
                case 0:
                    break;
                case 10:
                    if (this.f21739b == null) {
                        this.f21739b = new C2882Qf();
                    }
                    c3115a.m15577a(this.f21739b);
                    break;
                case 18:
                    if (this.f21740c == null) {
                        this.f21740c = new C2682If();
                    }
                    c3115a.m15577a(this.f21740c);
                    break;
                case 26:
                    this.f21741d = c3115a.m15593k();
                    break;
                case 32:
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h != -1 && iM15590h != 0 && iM15590h != 1) {
                        break;
                    } else {
                        this.f21742e = iM15590h;
                        break;
                    }
                case C5043c9.f31377M /* 42 */:
                    int iM15952a = C3271g.m15952a(c3115a, 42);
                    C2832Of[] c2832OfArr = this.f21743f;
                    int length = c2832OfArr == null ? 0 : c2832OfArr.length;
                    int i = iM15952a + length;
                    C2832Of[] c2832OfArr2 = new C2832Of[i];
                    if (length != 0) {
                        System.arraycopy(c2832OfArr, 0, c2832OfArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C2832Of c2832Of = new C2832Of();
                        c2832OfArr2[length] = c2832Of;
                        c3115a.m15577a(c2832Of);
                        c3115a.m15594l();
                        length++;
                    }
                    C2832Of c2832Of2 = new C2832Of();
                    c2832OfArr2[length] = c2832Of2;
                    c3115a.m15577a(c2832Of2);
                    this.f21743f = c2832OfArr2;
                    break;
                case 50:
                    this.f21744g = c3115a.m15593k();
                    break;
                case 56:
                    int iM15590h2 = c3115a.m15590h();
                    if (iM15590h2 != 0 && iM15590h2 != 1) {
                        break;
                    } else {
                        this.f21745h = iM15590h2;
                        break;
                    }
                case 66:
                    if (this.f21746i == null) {
                        this.f21746i = new a();
                    }
                    c3115a.m15577a(this.f21746i);
                    break;
                case 74:
                    this.f21747j = c3115a.m15582d();
                    break;
                case 82:
                    this.f21748k = c3115a.m15582d();
                    break;
                case 90:
                    int iM15952a2 = C3271g.m15952a(c3115a, 90);
                    C2732Kf[] c2732KfArr = this.f21749l;
                    int length2 = c2732KfArr == null ? 0 : c2732KfArr.length;
                    int i2 = iM15952a2 + length2;
                    C2732Kf[] c2732KfArr2 = new C2732Kf[i2];
                    if (length2 != 0) {
                        System.arraycopy(c2732KfArr, 0, c2732KfArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C2732Kf c2732Kf = new C2732Kf();
                        c2732KfArr2[length2] = c2732Kf;
                        c3115a.m15577a(c2732Kf);
                        c3115a.m15594l();
                        length2++;
                    }
                    C2732Kf c2732Kf2 = new C2732Kf();
                    c2732KfArr2[length2] = c2732Kf2;
                    c3115a.m15577a(c2732Kf2);
                    this.f21749l = c2732KfArr2;
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
