package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Jf extends AbstractC2714e {
    public If b;
    public String c;
    public int d;

    public Jf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        If r0 = this.b;
        if (r0 != null) {
            c2639b.b(1, r0);
        }
        if (!this.c.equals("")) {
            c2639b.b(2, this.c);
        }
        int i = this.d;
        if (i != -1) {
            c2639b.d(3, i);
        }
    }

    public Jf b() {
        this.b = null;
        this.c = "";
        this.d = -1;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        If r0 = this.b;
        int iA = r0 != null ? C2639b.a(1, r0) : 0;
        if (!this.c.equals("")) {
            iA += C2639b.a(2, this.c);
        }
        int i = this.d;
        return i != -1 ? iA + C2639b.a(3, i) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                if (this.b == null) {
                    this.b = new If();
                }
                c2614a.a(this.b);
            } else if (iL == 18) {
                this.c = c2614a.k();
            } else if (iL != 24) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iH = c2614a.h();
                if (iH == -1 || iH == 0 || iH == 1) {
                    this.d = iH;
                }
            }
        }
        return this;
    }
}
