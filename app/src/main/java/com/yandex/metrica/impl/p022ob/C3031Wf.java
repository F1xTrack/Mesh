package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Wf */
/* loaded from: classes2.dex */
public final class C3031Wf extends AbstractC3219e {

    /* renamed from: g */
    private static volatile C3031Wf[] f22692g;

    /* renamed from: b */
    public String f22693b;

    /* renamed from: c */
    public int f22694c;

    /* renamed from: d */
    public String f22695d;

    /* renamed from: e */
    public boolean f22696e;

    /* renamed from: f */
    public long f22697f;

    public C3031Wf() {
        m15391b();
    }

    /* renamed from: c */
    public static C3031Wf[] m15390c() {
        if (f22692g == null) {
            synchronized (C3167c.f23164a) {
                try {
                    if (f22692g == null) {
                        f22692g = new C3031Wf[0];
                    }
                } finally {
                }
            }
        }
        return f22692g;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        c3141b.m15648b(1, this.f22693b);
        int i = this.f22694c;
        if (i != 0) {
            c3141b.m15657e(2, i);
        }
        if (!this.f22695d.equals("")) {
            c3141b.m15648b(3, this.f22695d);
        }
        boolean z = this.f22696e;
        if (z) {
            c3141b.m15649b(4, z);
        }
        long j = this.f22697f;
        if (j != 0) {
            c3141b.m15658e(5, j);
        }
    }

    /* renamed from: b */
    public C3031Wf m15391b() {
        this.f22693b = "";
        this.f22694c = 0;
        this.f22695d = "";
        this.f22696e = false;
        this.f22697f = 0L;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15631a = C3141b.m15631a(1, this.f22693b);
        int i = this.f22694c;
        if (i != 0) {
            iM15631a += C3141b.m15639b(2, i);
        }
        if (!this.f22695d.equals("")) {
            iM15631a += C3141b.m15631a(3, this.f22695d);
        }
        boolean z = this.f22696e;
        if (z) {
            iM15631a += C3141b.m15632a(4, z);
        }
        long j = this.f22697f;
        return j != 0 ? iM15631a + C3141b.m15640b(5, j) : iM15631a;
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
                this.f22693b = c3115a.m15593k();
            } else if (iM15594l == 16) {
                this.f22694c = c3115a.m15592j();
            } else if (iM15594l == 26) {
                this.f22695d = c3115a.m15593k();
            } else if (iM15594l == 32) {
                this.f22696e = c3115a.m15581c();
            } else if (iM15594l != 40) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f22697f = c3115a.m15591i();
            }
        }
        return this;
    }
}
