package com.yandex.metrica.impl.p022ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.If */
/* loaded from: classes2.dex */
public final class C2682If extends AbstractC3219e {

    /* renamed from: b */
    public C2857Pf f21430b;

    /* renamed from: c */
    public C2857Pf[] f21431c;

    /* renamed from: d */
    public String f21432d;

    public C2682If() {
        m14344b();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public void mo14343a(C3141b c3141b) throws IOException {
        C2857Pf c2857Pf = this.f21430b;
        if (c2857Pf != null) {
            c3141b.m15647b(1, c2857Pf);
        }
        C2857Pf[] c2857PfArr = this.f21431c;
        if (c2857PfArr != null && c2857PfArr.length > 0) {
            int i = 0;
            while (true) {
                C2857Pf[] c2857PfArr2 = this.f21431c;
                if (i >= c2857PfArr2.length) {
                    break;
                }
                C2857Pf c2857Pf2 = c2857PfArr2[i];
                if (c2857Pf2 != null) {
                    c3141b.m15647b(2, c2857Pf2);
                }
                i++;
            }
        }
        if (this.f21432d.equals("")) {
            return;
        }
        c3141b.m15648b(3, this.f21432d);
    }

    /* renamed from: b */
    public C2682If m14344b() {
        this.f21430b = null;
        this.f21431c = C2857Pf.m14787c();
        this.f21432d = "";
        this.f23283a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3219e
    /* renamed from: a */
    public int mo14341a() {
        C2857Pf c2857Pf = this.f21430b;
        int i = 0;
        int iM15630a = c2857Pf != null ? C3141b.m15630a(1, c2857Pf) : 0;
        C2857Pf[] c2857PfArr = this.f21431c;
        if (c2857PfArr != null && c2857PfArr.length > 0) {
            while (true) {
                C2857Pf[] c2857PfArr2 = this.f21431c;
                if (i >= c2857PfArr2.length) {
                    break;
                }
                C2857Pf c2857Pf2 = c2857PfArr2[i];
                if (c2857Pf2 != null) {
                    iM15630a = C3141b.m15630a(2, c2857Pf2) + iM15630a;
                }
                i++;
            }
        }
        return !this.f21432d.equals("") ? iM15630a + C3141b.m15631a(3, this.f21432d) : iM15630a;
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
                if (this.f21430b == null) {
                    this.f21430b = new C2857Pf();
                }
                c3115a.m15577a(this.f21430b);
            } else if (iM15594l == 18) {
                int iM15952a = C3271g.m15952a(c3115a, 18);
                C2857Pf[] c2857PfArr = this.f21431c;
                int length = c2857PfArr == null ? 0 : c2857PfArr.length;
                int i = iM15952a + length;
                C2857Pf[] c2857PfArr2 = new C2857Pf[i];
                if (length != 0) {
                    System.arraycopy(c2857PfArr, 0, c2857PfArr2, 0, length);
                }
                while (length < i - 1) {
                    C2857Pf c2857Pf = new C2857Pf();
                    c2857PfArr2[length] = c2857Pf;
                    c3115a.m15577a(c2857Pf);
                    c3115a.m15594l();
                    length++;
                }
                C2857Pf c2857Pf2 = new C2857Pf();
                c2857PfArr2[length] = c2857Pf2;
                c3115a.m15577a(c2857Pf2);
                this.f21431c = c2857PfArr2;
            } else if (iM15594l != 26) {
                if (!c3115a.m15587f(iM15594l)) {
                    break;
                }
            } else {
                this.f21432d = c3115a.m15593k();
            }
        }
        return this;
    }
}
