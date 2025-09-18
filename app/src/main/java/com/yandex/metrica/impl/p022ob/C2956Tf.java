package com.yandex.metrica.impl.p022ob;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Tf */
/* loaded from: classes2.dex */
public final class C2956Tf extends AbstractC3219e {

    /* renamed from: r */
    private static volatile C2956Tf[] f22387r;

    /* renamed from: b */
    public int f22388b;

    /* renamed from: c */
    public int f22389c;

    /* renamed from: d */
    public int f22390d;

    /* renamed from: e */
    public int f22391e;

    /* renamed from: f */
    public int f22392f;

    /* renamed from: g */
    public String f22393g;

    /* renamed from: h */
    public boolean f22394h;

    /* renamed from: i */
    public int f22395i;

    /* renamed from: j */
    public int f22396j;

    /* renamed from: k */
    public long f22397k;

    /* renamed from: l */
    public int f22398l;

    /* renamed from: m */
    public int f22399m;

    /* renamed from: n */
    public int f22400n;

    /* renamed from: o */
    public int f22401o;

    /* renamed from: p */
    public int f22402p;

    /* renamed from: q */
    public int f22403q;

    public C2956Tf() {
        m15197b();
    }

    /* renamed from: c */
    public static C2956Tf[] m15196c() {
        if (f22387r == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f22387r == null) {
                        f22387r = new C2956Tf[0];
                    }
                } finally {
                }
            }
        }
        return f22387r;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        int i = this.f22388b;
        if (i != -1) {
            c3141b.m15659f(1, i);
        }
        int i2 = this.f22389c;
        if (i2 != 0) {
            c3141b.m15657e(2, i2);
        }
        int i3 = this.f22390d;
        if (i3 != -1) {
            c3141b.m15659f(3, i3);
        }
        int i4 = this.f22391e;
        if (i4 != -1) {
            c3141b.m15659f(4, i4);
        }
        int i5 = this.f22392f;
        if (i5 != -1) {
            c3141b.m15659f(5, i5);
        }
        if (!this.f22393g.equals("")) {
            c3141b.m15648b(6, this.f22393g);
        }
        boolean z = this.f22394h;
        if (z) {
            c3141b.m15649b(7, z);
        }
        int i6 = this.f22395i;
        if (i6 != 0) {
            c3141b.m15654d(8, i6);
        }
        int i7 = this.f22396j;
        if (i7 != -1) {
            c3141b.m15659f(9, i7);
        }
        long j = this.f22397k;
        if (j != 0) {
            c3141b.m15658e(10, j);
        }
        int i8 = this.f22398l;
        if (i8 != Integer.MAX_VALUE) {
            c3141b.m15657e(11, i8);
        }
        int i9 = this.f22399m;
        if (i9 != Integer.MAX_VALUE) {
            c3141b.m15657e(12, i9);
        }
        int i10 = this.f22400n;
        if (i10 != Integer.MAX_VALUE) {
            c3141b.m15657e(13, i10);
        }
        int i11 = this.f22401o;
        if (i11 != -1) {
            c3141b.m15659f(14, i11);
        }
        int i12 = this.f22402p;
        if (i12 != -1) {
            c3141b.m15659f(15, i12);
        }
        int i13 = this.f22403q;
        if (i13 != -1) {
            c3141b.m15659f(16, i13);
        }
    }

    /* renamed from: b */
    public C2956Tf m15197b() {
        this.f22388b = -1;
        this.f22389c = 0;
        this.f22390d = -1;
        this.f22391e = -1;
        this.f22392f = -1;
        this.f22393g = "";
        this.f22394h = false;
        this.f22395i = 0;
        this.f22396j = -1;
        this.f22397k = 0L;
        this.f22398l = Integer.MAX_VALUE;
        this.f22399m = Integer.MAX_VALUE;
        this.f22400n = Integer.MAX_VALUE;
        this.f22401o = -1;
        this.f22402p = -1;
        this.f22403q = -1;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int i = this.f22388b;
        int iM15642c = i != -1 ? C3141b.m15642c(1, i) : 0;
        int i2 = this.f22389c;
        if (i2 != 0) {
            iM15642c += C3141b.m15639b(2, i2);
        }
        int i3 = this.f22390d;
        if (i3 != -1) {
            iM15642c += C3141b.m15642c(3, i3);
        }
        int i4 = this.f22391e;
        if (i4 != -1) {
            iM15642c += C3141b.m15642c(4, i4);
        }
        int i5 = this.f22392f;
        if (i5 != -1) {
            iM15642c += C3141b.m15642c(5, i5);
        }
        if (!this.f22393g.equals("")) {
            iM15642c += C3141b.m15631a(6, this.f22393g);
        }
        boolean z = this.f22394h;
        if (z) {
            iM15642c += C3141b.m15632a(7, z);
        }
        int i6 = this.f22395i;
        if (i6 != 0) {
            iM15642c += C3141b.m15628a(8, i6);
        }
        int i7 = this.f22396j;
        if (i7 != -1) {
            iM15642c += C3141b.m15642c(9, i7);
        }
        long j = this.f22397k;
        if (j != 0) {
            iM15642c += C3141b.m15640b(10, j);
        }
        int i8 = this.f22398l;
        if (i8 != Integer.MAX_VALUE) {
            iM15642c += C3141b.m15639b(11, i8);
        }
        int i9 = this.f22399m;
        if (i9 != Integer.MAX_VALUE) {
            iM15642c += C3141b.m15639b(12, i9);
        }
        int i10 = this.f22400n;
        if (i10 != Integer.MAX_VALUE) {
            iM15642c += C3141b.m15639b(13, i10);
        }
        int i11 = this.f22401o;
        if (i11 != -1) {
            iM15642c += C3141b.m15642c(14, i11);
        }
        int i12 = this.f22402p;
        if (i12 != -1) {
            iM15642c += C3141b.m15642c(15, i12);
        }
        int i13 = this.f22403q;
        return i13 != -1 ? iM15642c + C3141b.m15642c(16, i13) : iM15642c;
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
                    this.f22388b = c3115a.m15590h();
                    break;
                case 16:
                    this.f22389c = c3115a.m15592j();
                    break;
                case 24:
                    this.f22390d = c3115a.m15590h();
                    break;
                case 32:
                    this.f22391e = c3115a.m15590h();
                    break;
                case C5043c9.f31376L /* 40 */:
                    this.f22392f = c3115a.m15590h();
                    break;
                case 50:
                    this.f22393g = c3115a.m15593k();
                    break;
                case 56:
                    this.f22394h = c3115a.m15581c();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    int iM15590h = c3115a.m15590h();
                    if (iM15590h != 0 && iM15590h != 1 && iM15590h != 2 && iM15590h != 3 && iM15590h != 4) {
                        break;
                    } else {
                        this.f22395i = iM15590h;
                        break;
                    }
                case 72:
                    this.f22396j = c3115a.m15590h();
                    break;
                case 80:
                    this.f22397k = c3115a.m15591i();
                    break;
                case 88:
                    this.f22398l = c3115a.m15592j();
                    break;
                case 96:
                    this.f22399m = c3115a.m15592j();
                    break;
                case 104:
                    this.f22400n = c3115a.m15592j();
                    break;
                case 112:
                    this.f22401o = c3115a.m15590h();
                    break;
                case 120:
                    this.f22402p = c3115a.m15590h();
                    break;
                case 128:
                    this.f22403q = c3115a.m15590h();
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
