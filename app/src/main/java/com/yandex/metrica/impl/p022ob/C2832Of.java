package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Of */
/* loaded from: classes2.dex */
public final class C2832Of extends AbstractC3219e {

    /* renamed from: h */
    private static volatile C2832Of[] f21864h;

    /* renamed from: b */
    public String f21865b;

    /* renamed from: c */
    public String f21866c;

    /* renamed from: d */
    public int f21867d;

    /* renamed from: e */
    public String f21868e;

    /* renamed from: f */
    public boolean f21869f;

    /* renamed from: g */
    public int f21870g;

    public C2832Of() {
        m14702b();
    }

    /* renamed from: c */
    public static C2832Of[] m14701c() {
        if (f21864h == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f21864h == null) {
                        f21864h = new C2832Of[0];
                    }
                } finally {
                }
            }
        }
        return f21864h;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        if (!this.f21865b.equals("")) {
            c3141b.m15648b(1, this.f21865b);
        }
        if (!this.f21866c.equals("")) {
            c3141b.m15648b(2, this.f21866c);
        }
        int i = this.f21867d;
        if (i != -1) {
            c3141b.m15657e(3, i);
        }
        if (!this.f21868e.equals("")) {
            c3141b.m15648b(4, this.f21868e);
        }
        boolean z = this.f21869f;
        if (z) {
            c3141b.m15649b(5, z);
        }
        int i2 = this.f21870g;
        if (i2 != -1) {
            c3141b.m15657e(6, i2);
        }
    }

    /* renamed from: b */
    public C2832Of m14702b() {
        this.f21865b = "";
        this.f21866c = "";
        this.f21867d = -1;
        this.f21868e = "";
        this.f21869f = false;
        this.f21870g = -1;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15631a = !this.f21865b.equals("") ? C3141b.m15631a(1, this.f21865b) : 0;
        if (!this.f21866c.equals("")) {
            iM15631a += C3141b.m15631a(2, this.f21866c);
        }
        int i = this.f21867d;
        if (i != -1) {
            iM15631a += C3141b.m15639b(3, i);
        }
        if (!this.f21868e.equals("")) {
            iM15631a += C3141b.m15631a(4, this.f21868e);
        }
        boolean z = this.f21869f;
        if (z) {
            iM15631a += C3141b.m15632a(5, z);
        }
        int i2 = this.f21870g;
        return i2 != -1 ? iM15631a + C3141b.m15639b(6, i2) : iM15631a;
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
                this.f21865b = c3115a.m15593k();
            } else if (iM15594l == 18) {
                this.f21866c = c3115a.m15593k();
            } else if (iM15594l == 24) {
                this.f21867d = c3115a.m15592j();
            } else if (iM15594l == 34) {
                this.f21868e = c3115a.m15593k();
            } else if (iM15594l == 40) {
                this.f21869f = c3115a.m15581c();
            } else if (iM15594l != 48) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f21870g = c3115a.m15592j();
            }
        }
        return this;
    }
}
