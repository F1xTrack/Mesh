package com.yandex.metrica.impl.ob;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C4473c9;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class Tf extends AbstractC2714e {
    private static volatile Tf[] r;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g;
    public boolean h;
    public int i;
    public int j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    public Tf() {
        b();
    }

    public static Tf[] c() {
        if (r == null) {
            synchronized (C2664c.a) {
                try {
                    if (r == null) {
                        r = new Tf[0];
                    }
                } finally {
                }
            }
        }
        return r;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public void a(C2639b c2639b) throws IOException {
        int i = this.b;
        if (i != -1) {
            c2639b.f(1, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            c2639b.e(2, i2);
        }
        int i3 = this.d;
        if (i3 != -1) {
            c2639b.f(3, i3);
        }
        int i4 = this.e;
        if (i4 != -1) {
            c2639b.f(4, i4);
        }
        int i5 = this.f;
        if (i5 != -1) {
            c2639b.f(5, i5);
        }
        if (!this.g.equals("")) {
            c2639b.b(6, this.g);
        }
        boolean z = this.h;
        if (z) {
            c2639b.b(7, z);
        }
        int i6 = this.i;
        if (i6 != 0) {
            c2639b.d(8, i6);
        }
        int i7 = this.j;
        if (i7 != -1) {
            c2639b.f(9, i7);
        }
        long j = this.k;
        if (j != 0) {
            c2639b.e(10, j);
        }
        int i8 = this.l;
        if (i8 != Integer.MAX_VALUE) {
            c2639b.e(11, i8);
        }
        int i9 = this.m;
        if (i9 != Integer.MAX_VALUE) {
            c2639b.e(12, i9);
        }
        int i10 = this.n;
        if (i10 != Integer.MAX_VALUE) {
            c2639b.e(13, i10);
        }
        int i11 = this.o;
        if (i11 != -1) {
            c2639b.f(14, i11);
        }
        int i12 = this.p;
        if (i12 != -1) {
            c2639b.f(15, i12);
        }
        int i13 = this.q;
        if (i13 != -1) {
            c2639b.f(16, i13);
        }
    }

    public Tf b() {
        this.b = -1;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = "";
        this.h = false;
        this.i = 0;
        this.j = -1;
        this.k = 0L;
        this.l = Integer.MAX_VALUE;
        this.m = Integer.MAX_VALUE;
        this.n = Integer.MAX_VALUE;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.a = -1;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public int a() {
        int i = this.b;
        int iC = i != -1 ? C2639b.c(1, i) : 0;
        int i2 = this.c;
        if (i2 != 0) {
            iC += C2639b.b(2, i2);
        }
        int i3 = this.d;
        if (i3 != -1) {
            iC += C2639b.c(3, i3);
        }
        int i4 = this.e;
        if (i4 != -1) {
            iC += C2639b.c(4, i4);
        }
        int i5 = this.f;
        if (i5 != -1) {
            iC += C2639b.c(5, i5);
        }
        if (!this.g.equals("")) {
            iC += C2639b.a(6, this.g);
        }
        boolean z = this.h;
        if (z) {
            iC += C2639b.a(7, z);
        }
        int i6 = this.i;
        if (i6 != 0) {
            iC += C2639b.a(8, i6);
        }
        int i7 = this.j;
        if (i7 != -1) {
            iC += C2639b.c(9, i7);
        }
        long j = this.k;
        if (j != 0) {
            iC += C2639b.b(10, j);
        }
        int i8 = this.l;
        if (i8 != Integer.MAX_VALUE) {
            iC += C2639b.b(11, i8);
        }
        int i9 = this.m;
        if (i9 != Integer.MAX_VALUE) {
            iC += C2639b.b(12, i9);
        }
        int i10 = this.n;
        if (i10 != Integer.MAX_VALUE) {
            iC += C2639b.b(13, i10);
        }
        int i11 = this.o;
        if (i11 != -1) {
            iC += C2639b.c(14, i11);
        }
        int i12 = this.p;
        if (i12 != -1) {
            iC += C2639b.c(15, i12);
        }
        int i13 = this.q;
        return i13 != -1 ? iC + C2639b.c(16, i13) : iC;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2714e
    public AbstractC2714e a(C2614a c2614a) throws IOException {
        while (true) {
            int iL = c2614a.l();
            switch (iL) {
                case 0:
                    break;
                case 8:
                    this.b = c2614a.h();
                    break;
                case 16:
                    this.c = c2614a.j();
                    break;
                case 24:
                    this.d = c2614a.h();
                    break;
                case 32:
                    this.e = c2614a.h();
                    break;
                case C4473c9.L /* 40 */:
                    this.f = c2614a.h();
                    break;
                case 50:
                    this.g = c2614a.k();
                    break;
                case 56:
                    this.h = c2614a.c();
                    break;
                case NativeMac.KEY_LENGTH /* 64 */:
                    int iH = c2614a.h();
                    if (iH != 0 && iH != 1 && iH != 2 && iH != 3 && iH != 4) {
                        break;
                    } else {
                        this.i = iH;
                        break;
                    }
                case 72:
                    this.j = c2614a.h();
                    break;
                case 80:
                    this.k = c2614a.i();
                    break;
                case 88:
                    this.l = c2614a.j();
                    break;
                case 96:
                    this.m = c2614a.j();
                    break;
                case 104:
                    this.n = c2614a.j();
                    break;
                case 112:
                    this.o = c2614a.h();
                    break;
                case 120:
                    this.p = c2614a.h();
                    break;
                case 128:
                    this.q = c2614a.h();
                    break;
                default:
                    if (!c2614a.f(iL)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
