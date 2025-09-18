package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.Jf */
/* loaded from: classes2.dex */
public final class C2707Jf extends AbstractC3219e {

    /* renamed from: b */
    public C2682If f21552b;

    /* renamed from: c */
    public String f21553c;

    /* renamed from: d */
    public int f21554d;

    public C2707Jf() {
        m14442b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        C2682If c2682If = this.f21552b;
        if (c2682If != null) {
            c3141b.m15647b(1, c2682If);
        }
        if (!this.f21553c.equals("")) {
            c3141b.m15648b(2, this.f21553c);
        }
        int i = this.f21554d;
        if (i != -1) {
            c3141b.m15654d(3, i);
        }
    }

    /* renamed from: b */
    public C2707Jf m14442b() {
        this.f21552b = null;
        this.f21553c = "";
        this.f21554d = -1;
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        C2682If c2682If = this.f21552b;
        int iM15630a = c2682If != null ? C3141b.m15630a(1, c2682If) : 0;
        if (!this.f21553c.equals("")) {
            iM15630a += C3141b.m15631a(2, this.f21553c);
        }
        int i = this.f21554d;
        return i != -1 ? iM15630a + C3141b.m15628a(3, i) : iM15630a;
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
                if (this.f21552b == null) {
                    this.f21552b = new C2682If();
                }
                c3115a.m15577a(this.f21552b);
            } else if (iM15594l == 18) {
                this.f21553c = c3115a.m15593k();
            } else if (iM15594l != 24) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                int iM15590h = c3115a.m15590h();
                if (iM15590h == -1 || iM15590h == 0 || iM15590h == 1) {
                    this.f21554d = iM15590h;
                }
            }
        }
        return this;
    }
}
