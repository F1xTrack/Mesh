package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Nf extends AbstractC2714e {
    public int b;
    public String c;

    public Nf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        int i = this.b;
        if (i != 0) {
            c2639b.d(1, i);
        }
        if (this.c.equals("")) {
            return;
        }
        c2639b.b(2, this.c);
    }

    public Nf b() {
        this.b = 0;
        this.c = "";
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int i = this.b;
        int iA = i != 0 ? C2639b.a(1, i) : 0;
        return !this.c.equals("") ? iA + C2639b.a(2, this.c) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 8) {
                int iH = c2614a.h();
                if (iH == 0 || iH == 1 || iH == 2 || iH == 3) {
                    this.b = iH;
                }
            } else if (iL != 18) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.c = c2614a.k();
            }
        }
        return this;
    }
}
