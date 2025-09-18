package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Yf */
/* loaded from: classes2.dex */
public final class C3081Yf extends AbstractC3219e {

    /* renamed from: b */
    public String f22891b;

    /* renamed from: c */
    public long f22892c;

    /* renamed from: d */
    public long f22893d;

    /* renamed from: e */
    public int f22894e;

    public C3081Yf() {
        m15509b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        if (!this.f22891b.equals("")) {
            c3141b.m15648b(1, this.f22891b);
        }
        long j = this.f22892c;
        if (j != 0) {
            c3141b.m15658e(2, j);
        }
        long j2 = this.f22893d;
        if (j2 != 0) {
            c3141b.m15658e(3, j2);
        }
        int i = this.f22894e;
        if (i != 0) {
            c3141b.m15654d(4, i);
        }
    }

    /* renamed from: b */
    public C3081Yf m15509b() {
        this.f22891b = "";
        this.f22892c = 0L;
        this.f22893d = 0L;
        this.f22894e = 0;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15631a = !this.f22891b.equals("") ? C3141b.m15631a(1, this.f22891b) : 0;
        long j = this.f22892c;
        if (j != 0) {
            iM15631a += C3141b.m15640b(2, j);
        }
        long j2 = this.f22893d;
        if (j2 != 0) {
            iM15631a += C3141b.m15640b(3, j2);
        }
        int i = this.f22894e;
        return i != 0 ? iM15631a + C3141b.m15628a(4, i) : iM15631a;
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
                this.f22891b = c3115a.m15593k();
            } else if (iM15594l == 16) {
                this.f22892c = c3115a.m15591i();
            } else if (iM15594l == 24) {
                this.f22893d = c3115a.m15591i();
            } else if (iM15594l != 32) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15590h = c3115a.m15590h();
                if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2) {
                    this.f22894e = iM15590h;
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public static C3081Yf m15508a(byte[] bArr) throws C3193d {
        return (C3081Yf) AbstractC3219e.m15808a(new C3081Yf(), bArr);
    }
}
