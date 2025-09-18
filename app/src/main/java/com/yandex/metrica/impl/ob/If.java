package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class If extends AbstractC2714e {
    public Pf b;
    public Pf[] c;
    public String d;

    public If() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        Pf pf = this.b;
        if (pf != null) {
            c2639b.b(1, pf);
        }
        Pf[] pfArr = this.c;
        if (pfArr != null && pfArr.length > 0) {
            int i = 0;
            while (true) {
                Pf[] pfArr2 = this.c;
                if (i >= pfArr2.length) {
                    break;
                }
                Pf pf2 = pfArr2[i];
                if (pf2 != null) {
                    c2639b.b(2, pf2);
                }
                i++;
            }
        }
        if (this.d.equals("")) {
            return;
        }
        c2639b.b(3, this.d);
    }

    public If b() {
        this.b = null;
        this.c = Pf.c();
        this.d = "";
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        Pf pf = this.b;
        int i = 0;
        int iA = pf != null ? C2639b.a(1, pf) : 0;
        Pf[] pfArr = this.c;
        if (pfArr != null && pfArr.length > 0) {
            while (true) {
                Pf[] pfArr2 = this.c;
                if (i >= pfArr2.length) {
                    break;
                }
                Pf pf2 = pfArr2[i];
                if (pf2 != null) {
                    iA = C2639b.a(2, pf2) + iA;
                }
                i++;
            }
        }
        return !this.d.equals("") ? iA + C2639b.a(3, this.d) : iA;
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
                    this.b = new Pf();
                }
                c2614a.a(this.b);
            } else if (iL == 18) {
                int iA = C2764g.a(c2614a, 18);
                Pf[] pfArr = this.c;
                int length = pfArr == null ? 0 : pfArr.length;
                int i = iA + length;
                Pf[] pfArr2 = new Pf[i];
                if (length != 0) {
                    System.arraycopy(pfArr, 0, pfArr2, 0, length);
                }
                while (length < i - 1) {
                    Pf pf = new Pf();
                    pfArr2[length] = pf;
                    c2614a.a(pf);
                    c2614a.l();
                    length++;
                }
                Pf pf2 = new Pf();
                pfArr2[length] = pf2;
                c2614a.a(pf2);
                this.c = pfArr2;
            } else if (iL != 26) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.d = c2614a.k();
            }
        }
        return this;
    }
}
