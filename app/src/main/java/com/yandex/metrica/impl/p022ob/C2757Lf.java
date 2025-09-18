package com.yandex.metrica.impl.p022ob;

import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.Lf */
/* loaded from: classes2.dex */
public final class C2757Lf extends AbstractC3219e {

    /* renamed from: l */
    private static byte[] f21643l;

    /* renamed from: m */
    private static volatile boolean f21644m;

    /* renamed from: b */
    public C2882Qf f21645b;

    /* renamed from: c */
    public C2682If f21646c;

    /* renamed from: d */
    public String f21647d;

    /* renamed from: e */
    public int f21648e;

    /* renamed from: f */
    public C2832Of[] f21649f;

    /* renamed from: g */
    public int f21650g;

    /* renamed from: h */
    public a f21651h;

    /* renamed from: i */
    public byte[] f21652i;

    /* renamed from: j */
    public byte[] f21653j;

    /* renamed from: k */
    public C2732Kf[] f21654k;

    public C2757Lf() {
        if (!f21644m) {
            synchronized (C3167c.f23164a) {
                try {
                    if (!f21644m) {
                        f21643l = C3167c.m15698a("JVM");
                        f21644m = true;
                    }
                } finally {
                }
            }
        }
        m14538b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        C2882Qf c2882Qf = this.f21645b;
        if (c2882Qf != null) {
            c3141b.m15647b(1, c2882Qf);
        }
        C2682If c2682If = this.f21646c;
        if (c2682If != null) {
            c3141b.m15647b(2, c2682If);
        }
        if (!this.f21647d.equals("")) {
            c3141b.m15648b(3, this.f21647d);
        }
        int i = this.f21648e;
        if (i != -1) {
            c3141b.m15654d(4, i);
        }
        C2832Of[] c2832OfArr = this.f21649f;
        int i2 = 0;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f21649f;
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
        int i4 = this.f21650g;
        if (i4 != 0) {
            c3141b.m15654d(6, i4);
        }
        a aVar = this.f21651h;
        if (aVar != null) {
            c3141b.m15647b(7, aVar);
        }
        if (!Arrays.equals(this.f21652i, f21643l)) {
            c3141b.m15650b(8, this.f21652i);
        }
        if (!Arrays.equals(this.f21653j, C3271g.f23459d)) {
            c3141b.m15650b(9, this.f21653j);
        }
        C2732Kf[] c2732KfArr = this.f21654k;
        if (c2732KfArr == null || c2732KfArr.length <= 0) {
            return;
        }
        while (true) {
            C2732Kf[] c2732KfArr2 = this.f21654k;
            if (i2 >= c2732KfArr2.length) {
                return;
            }
            C2732Kf c2732Kf = c2732KfArr2[i2];
            if (c2732Kf != null) {
                c3141b.m15647b(10, c2732Kf);
            }
            i2++;
        }
    }

    /* renamed from: b */
    public C2757Lf m14538b() {
        this.f21645b = null;
        this.f21646c = null;
        this.f21647d = "";
        this.f21648e = -1;
        this.f21649f = C2832Of.m14701c();
        this.f21650g = 0;
        this.f21651h = null;
        this.f21652i = (byte[]) f21643l.clone();
        this.f21653j = C3271g.f23459d;
        this.f21654k = C2732Kf.m14477c();
        this.f23283a = -1;
        return this;
    }

    /* renamed from: com.yandex.metrica.impl.ob.Lf$a */
    public static final class a extends AbstractC3219e {

        /* renamed from: b */
        public byte[] f21655b;

        /* renamed from: c */
        public C2807Nf f21656c;

        public a() {
            m14539b();
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public void mo14343a(C3141b c3141b) throws IOException {
            if (!Arrays.equals(this.f21655b, C3271g.f23459d)) {
                c3141b.m15650b(1, this.f21655b);
            }
            C2807Nf c2807Nf = this.f21656c;
            if (c2807Nf != null) {
                c3141b.m15647b(2, c2807Nf);
            }
        }

        /* renamed from: b */
        public a m14539b() {
            this.f21655b = C3271g.f23459d;
            this.f21656c = null;
            this.f23283a = -1;
            return this;
        }

        @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
        /* renamed from: a */
        public int mo14341a() {
            int iM15633a = !Arrays.equals(this.f21655b, C3271g.f23459d) ? C3141b.m15633a(1, this.f21655b) : 0;
            C2807Nf c2807Nf = this.f21656c;
            return c2807Nf != null ? iM15633a + C3141b.m15630a(2, c2807Nf) : iM15633a;
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
                    this.f21655b = c3115a.m15582d();
                } else if (iM15594l != 18) {
                    if (!c3115a.m15587f(iM15594l)) {
                        break;
                    }
                } else {
                    if (this.f21656c == null) {
                        this.f21656c = new C2807Nf();
                    }
                    c3115a.m15577a(this.f21656c);
                }
            }
            return this;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        C2882Qf c2882Qf = this.f21645b;
        int i = 0;
        int iM15630a = c2882Qf != null ? C3141b.m15630a(1, c2882Qf) : 0;
        C2682If c2682If = this.f21646c;
        if (c2682If != null) {
            iM15630a += C3141b.m15630a(2, c2682If);
        }
        if (!this.f21647d.equals("")) {
            iM15630a += C3141b.m15631a(3, this.f21647d);
        }
        int i2 = this.f21648e;
        if (i2 != -1) {
            iM15630a += C3141b.m15628a(4, i2);
        }
        C2832Of[] c2832OfArr = this.f21649f;
        if (c2832OfArr != null && c2832OfArr.length > 0) {
            int i3 = 0;
            while (true) {
                C2832Of[] c2832OfArr2 = this.f21649f;
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
        int i4 = this.f21650g;
        if (i4 != 0) {
            iM15630a += C3141b.m15628a(6, i4);
        }
        a aVar = this.f21651h;
        if (aVar != null) {
            iM15630a += C3141b.m15630a(7, aVar);
        }
        if (!Arrays.equals(this.f21652i, f21643l)) {
            iM15630a += C3141b.m15633a(8, this.f21652i);
        }
        if (!Arrays.equals(this.f21653j, C3271g.f23459d)) {
            iM15630a += C3141b.m15633a(9, this.f21653j);
        }
        C2732Kf[] c2732KfArr = this.f21654k;
        if (c2732KfArr != null && c2732KfArr.length > 0) {
            while (true) {
                C2732Kf[] c2732KfArr2 = this.f21654k;
                if (i >= c2732KfArr2.length) {
                    break;
                }
                C2732Kf c2732Kf = c2732KfArr2[i];
                if (c2732Kf != null) {
                    iM15630a = C3141b.m15630a(10, c2732Kf) + iM15630a;
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
                    if (this.f21645b == null) {
                        this.f21645b = new C2882Qf();
                    }
                    c3115a.m15577a(this.f21645b);
                    break;
                case 18:
                    if (this.f21646c == null) {
                        this.f21646c = new C2682If();
                    }
                    c3115a.m15577a(this.f21646c);
                    break;
                case 26:
                    this.f21647d = c3115a.m15593k();
                    break;
                case 32:
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h != -1 && iM15590h != 0 && iM15590h != 1) {
                        break;
                    } else {
                        this.f21648e = iM15590h;
                        break;
                    }
                    break;
                case C5043c9.f31377M /* 42 */:
                    int iM15952a = C3271g.m15952a(c3115a, 42);
                    C2832Of[] c2832OfArr = this.f21649f;
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
                    this.f21649f = c2832OfArr2;
                    break;
                case 48:
                    int iM15590h2 = c3115a.m15590h();
                    if (iM15590h2 != 0 && iM15590h2 != 1) {
                        break;
                    } else {
                        this.f21650g = iM15590h2;
                        break;
                    }
                    break;
                case 58:
                    if (this.f21651h == null) {
                        this.f21651h = new a();
                    }
                    c3115a.m15577a(this.f21651h);
                    break;
                case 66:
                    this.f21652i = c3115a.m15582d();
                    break;
                case 74:
                    this.f21653j = c3115a.m15582d();
                    break;
                case 82:
                    int iM15952a2 = C3271g.m15952a(c3115a, 82);
                    C2732Kf[] c2732KfArr = this.f21654k;
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
                    this.f21654k = c2732KfArr2;
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
