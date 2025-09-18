package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class Of extends AbstractC2714e {
    private static volatile Of[] h;
    public String b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public int g;

    public Of() {
        b();
    }

    public static Of[] c() {
        if (h == null) {
            synchronized (C2664c.a) {
                try {
                    if (h == null) {
                        h = new Of[0];
                    }
                } finally {
                }
            }
        }
        return h;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        if (!this.b.equals("")) {
            c2639b.b(1, this.b);
        }
        if (!this.c.equals("")) {
            c2639b.b(2, this.c);
        }
        int i = this.d;
        if (i != -1) {
            c2639b.e(3, i);
        }
        if (!this.e.equals("")) {
            c2639b.b(4, this.e);
        }
        boolean z = this.f;
        if (z) {
            c2639b.b(5, z);
        }
        int i2 = this.g;
        if (i2 != -1) {
            c2639b.e(6, i2);
        }
    }

    public Of b() {
        this.b = "";
        this.c = "";
        this.d = -1;
        this.e = "";
        this.f = false;
        this.g = -1;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int iA = !this.b.equals("") ? C2639b.a(1, this.b) : 0;
        if (!this.c.equals("")) {
            iA += C2639b.a(2, this.c);
        }
        int i = this.d;
        if (i != -1) {
            iA += C2639b.b(3, i);
        }
        if (!this.e.equals("")) {
            iA += C2639b.a(4, this.e);
        }
        boolean z = this.f;
        if (z) {
            iA += C2639b.a(5, z);
        }
        int i2 = this.g;
        return i2 != -1 ? iA + C2639b.b(6, i2) : iA;
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
            } else if (iL == 18) {
                this.c = c2614a.k();
            } else if (iL == 24) {
                this.d = c2614a.j();
            } else if (iL == 34) {
                this.e = c2614a.k();
            } else if (iL == 40) {
                this.f = c2614a.c();
            } else if (iL != 48) {
                if (!c2614a.f(iL)) {
                    break;
                }
            } else {
                this.g = c2614a.j();
            }
        }
        return this;
    }
}
