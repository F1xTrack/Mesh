package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class UV {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final ES1 k;
    public final C0540Gr0 l;

    public UV(byte[] bArr, int i) {
        C0848Kq c0848Kq = new C0848Kq(bArr, bArr.length);
        c0848Kq.t(i * 8);
        this.a = c0848Kq.l(16);
        this.b = c0848Kq.l(16);
        this.c = c0848Kq.l(24);
        this.d = c0848Kq.l(24);
        int iL = c0848Kq.l(20);
        this.e = iL;
        this.f = d(iL);
        this.g = c0848Kq.l(3) + 1;
        int iL2 = c0848Kq.l(5) + 1;
        this.h = iL2;
        this.i = a(iL2);
        this.j = c0848Kq.n(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final C6666qX c(byte[] bArr, C0540Gr0 c0540Gr0) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        C0540Gr0 c0540Gr02 = this.l;
        if (c0540Gr02 != null) {
            c0540Gr0 = c0540Gr02.b(c0540Gr0);
        }
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("audio/flac");
        c6475pX.m = i;
        c6475pX.z = this.g;
        c6475pX.A = this.e;
        c6475pX.B = AbstractC0277Dh1.A(this.h);
        c6475pX.o = Collections.singletonList(bArr);
        c6475pX.j = c0540Gr0;
        return new C6666qX(c6475pX);
    }

    public UV(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ES1 es1, C0540Gr0 c0540Gr0) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = es1;
        this.l = c0540Gr0;
    }
}
