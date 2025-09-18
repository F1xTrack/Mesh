package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Yf extends AbstractC2714e {
    public String b;
    public long c;
    public long d;
    public int e;

    public Yf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        if (!this.b.equals("")) {
            c2639b.b(1, this.b);
        }
        long j = this.c;
        if (j != 0) {
            c2639b.e(2, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            c2639b.e(3, j2);
        }
        int i = this.e;
        if (i != 0) {
            c2639b.d(4, i);
        }
    }

    public Yf b() {
        this.b = "";
        this.c = 0L;
        this.d = 0L;
        this.e = 0;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
        long j = this.c;
        if (j != 0) {
            iA += C2639b.b(2, j);
        }
        long j2 = this.d;
        if (j2 != 0) {
            iA += C2639b.b(3, j2);
        }
        int i = this.e;
        return i != 0 ? iA + C2639b.a(4, i) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.b = c2614a.k();
            } else if (iL == 16) {
                this.c = c2614a.i();
            } else if (iL == 24) {
                this.d = c2614a.i();
            } else if (iL != 32) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                int iH = c2614a.h();
                if (iH == 0 || iH == 1 || iH == 2) {
                    this.e = iH;
                }
            }
        }
        return this;
    }

    public static Yf a(byte[] bArr) throws C2689d {
        return (Yf) AbstractC2714e.a(new Yf(), bArr);
    }
}
