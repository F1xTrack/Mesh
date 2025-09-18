package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Wf extends AbstractC2714e {
    private static volatile Wf[] g;
    public String b;
    public int c;
    public String d;
    public boolean e;
    public long f;

    public Wf() {
        b();
    }

    public static Wf[] c() {
        if (g == null) {
            synchronized (C2664c.a) {
                try {
                    if (g == null) {
                        g = new Wf[0];
                    }
                } finally {
                }
            }
        }
        return g;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        c2639b.b(1, this.b);
        int i = this.c;
        if (i != 0) {
            c2639b.e(2, i);
        }
        if (!this.d.equals("")) {
            c2639b.b(3, this.d);
        }
        boolean z = this.e;
        if (z) {
            c2639b.b(4, z);
        }
        long j = this.f;
        if (j != 0) {
            c2639b.e(5, j);
        }
    }

    public Wf b() {
        this.b = "";
        this.c = 0;
        this.d = "";
        this.e = false;
        this.f = 0L;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA = C2639b.a(1, this.b);
        int i = this.c;
        if (i != 0) {
            iA += C2639b.b(2, i);
        }
        if (!this.d.equals("")) {
            iA += C2639b.a(3, this.d);
        }
        boolean z = this.e;
        if (z) {
            iA += C2639b.a(4, z);
        }
        long j = this.f;
        return j != 0 ? iA + C2639b.b(5, j) : iA;
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
                this.c = c2614a.j();
            } else if (iL == 26) {
                this.d = c2614a.k();
            } else if (iL == 32) {
                this.e = c2614a.c();
            } else if (iL != 40) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.f = c2614a.i();
            }
        }
        return this;
    }
}
