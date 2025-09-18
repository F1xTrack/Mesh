package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q30 {
    public final C6129nj b;
    public boolean d;
    public int h;
    public int i;
    public final boolean a = true;
    public int c = Integer.MAX_VALUE;
    public int e = 4096;
    public I20[] f = new I20[8];
    public int g = 7;

    public Q30(C6129nj c6129nj) {
        this.b = c6129nj;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                I20 i20 = this.f[length];
                O90.c(i20);
                i -= i20.c;
                int i4 = this.i;
                I20 i202 = this.f[length];
                O90.c(i202);
                this.i = i4 - i202.c;
                this.h--;
                i3++;
                length--;
            }
            I20[] i20Arr = this.f;
            int i5 = i2 + 1;
            System.arraycopy(i20Arr, i5, i20Arr, i5 + i3, this.h);
            I20[] i20Arr2 = this.f;
            int i6 = this.g + 1;
            Arrays.fill(i20Arr2, i6, i6 + i3, (Object) null);
            this.g += i3;
        }
    }

    public final void b(I20 i20) {
        int i = this.e;
        int i2 = i20.c;
        if (i2 > i) {
            I20[] i20Arr = this.f;
            J8.k(i20Arr, 0, i20Arr.length);
            this.g = this.f.length - 1;
            this.h = 0;
            this.i = 0;
            return;
        }
        a((this.i + i2) - i);
        int i3 = this.h + 1;
        I20[] i20Arr2 = this.f;
        if (i3 > i20Arr2.length) {
            I20[] i20Arr3 = new I20[i20Arr2.length * 2];
            System.arraycopy(i20Arr2, 0, i20Arr3, i20Arr2.length, i20Arr2.length);
            this.g = this.f.length - 1;
            this.f = i20Arr3;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        this.f[i4] = i20;
        this.h++;
        this.i += i2;
    }

    public final void c(C0674Ik c0674Ik) throws EOFException {
        O90.f(c0674Ik, "data");
        C6129nj c6129nj = this.b;
        if (this.a) {
            int[] iArr = K40.a;
            int iC = c0674Ik.c();
            long j = 0;
            for (int i = 0; i < iC; i++) {
                byte bF = c0674Ik.f(i);
                byte[] bArr = AbstractC0199Ch1.a;
                j += K40.b[bF & 255];
            }
            if (((int) ((j + 7) >> 3)) < c0674Ik.c()) {
                C6129nj c6129nj2 = new C6129nj();
                int[] iArr2 = K40.a;
                int iC2 = c0674Ik.c();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iC2; i3++) {
                    byte bF2 = c0674Ik.f(i3);
                    byte[] bArr2 = AbstractC0199Ch1.a;
                    int i4 = bF2 & 255;
                    int i5 = K40.a[i4];
                    byte b = K40.b[i4];
                    j2 = (j2 << b) | i5;
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        c6129nj2.r0((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    c6129nj2.r0((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                C0674Ik c0674IkU = c6129nj2.U(c6129nj2.b);
                e(c0674IkU.c(), 127, 128);
                c6129nj.o0(c0674IkU);
                return;
            }
        }
        e(c0674Ik.c(), 127, 0);
        c6129nj.o0(c0674Ik);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q30.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        C6129nj c6129nj = this.b;
        if (i < i2) {
            c6129nj.r0(i | i3);
            return;
        }
        c6129nj.r0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6129nj.r0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6129nj.r0(i4);
    }
}
