package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Nf */
/* loaded from: classes2.dex */
public final class C2807Nf extends AbstractC3219e {

    /* renamed from: b */
    public int f21778b;

    /* renamed from: c */
    public String f21779c;

    public C2807Nf() {
        m14646b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        int i = this.f21778b;
        if (i != 0) {
            c3141b.m15654d(1, i);
        }
        if (this.f21779c.equals("")) {
            return;
        }
        c3141b.m15648b(2, this.f21779c);
    }

    /* renamed from: b */
    public C2807Nf m14646b() {
        this.f21778b = 0;
        this.f21779c = "";
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        int i = this.f21778b;
        int iM15628a = i != 0 ? C3141b.m15628a(1, i) : 0;
        return !this.f21779c.equals("") ? iM15628a + C3141b.m15631a(2, this.f21779c) : iM15628a;
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
                int iM15590h = c3115a.m15590h();
                if (iM15590h == 0 || iM15590h == 1 || iM15590h == 2 || iM15590h == 3) {
                    this.f21778b = iM15590h;
                }
            } else if (iM15594l != 18) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f21779c = c3115a.m15593k();
            }
        }
        return this;
    }
}
