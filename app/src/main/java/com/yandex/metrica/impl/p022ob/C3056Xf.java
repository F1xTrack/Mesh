package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Xf */
/* loaded from: classes2.dex */
public final class C3056Xf extends AbstractC3219e {

    /* renamed from: b */
    public byte[] f22812b;

    /* renamed from: c */
    public long f22813c;

    /* renamed from: d */
    public long f22814d;

    /* renamed from: e */
    public int f22815e;

    public C3056Xf() {
        m15423b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        c3141b.m15650b(1, this.f22812b);
        long j = this.f22813c;
        if (j != 0) {
            c3141b.m15658e(2, j);
        }
        long j2 = this.f22814d;
        if (j2 != 0) {
            c3141b.m15658e(3, j2);
        }
        int i = this.f22815e;
        if (i != 0) {
            c3141b.m15654d(4, i);
        }
    }

    /* renamed from: b */
    public C3056Xf m15423b() {
        this.f22812b = C3271g.f23459d;
        this.f22813c = 0L;
        this.f22814d = 0L;
        this.f22815e = 0;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int iM15633a = C3141b.m15633a(1, this.f22812b);
        long j = this.f22813c;
        if (j != 0) {
            iM15633a += C3141b.m15640b(2, j);
        }
        long j2 = this.f22814d;
        if (j2 != 0) {
            iM15633a += C3141b.m15640b(3, j2);
        }
        int i = this.f22815e;
        return i != 0 ? iM15633a + C3141b.m15628a(4, i) : iM15633a;
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
                this.f22812b = c3115a.m15582d();
            } else if (iM15594l == 16) {
                this.f22813c = c3115a.m15591i();
            } else if (iM15594l == 24) {
                this.f22814d = c3115a.m15591i();
            } else if (iM15594l != 32) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15590h = c3115a.m15590h();
                if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2) {
                    this.f22815e = iM15590h;
                }
            }
        }
        return this;
    }
}
