package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class P30 {
    public final C8351zN0 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public I20[] d = new I20[8];
    public int e = 7;

    public P30(C5243j40 c5243j40) {
        this.c = JI1.b(c5243j40);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                I20 i20 = this.d[length];
                O90.c(i20);
                int i4 = i20.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            I20[] i20Arr = this.d;
            System.arraycopy(i20Arr, i2 + 1, i20Arr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final C0674Ik b(int i) throws IOException {
        if (i >= 0) {
            I20[] i20Arr = R30.a;
            if (i <= i20Arr.length - 1) {
                return i20Arr[i].a;
            }
        }
        int length = this.e + 1 + (i - R30.a.length);
        if (length >= 0) {
            I20[] i20Arr2 = this.d;
            if (length < i20Arr2.length) {
                I20 i20 = i20Arr2[length];
                O90.c(i20);
                return i20.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(I20 i20) {
        this.b.add(i20);
        int i = this.a;
        int i2 = i20.c;
        if (i2 > i) {
            I20[] i20Arr = this.d;
            J8.k(i20Arr, 0, i20Arr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i2) - i);
        int i3 = this.f + 1;
        I20[] i20Arr2 = this.d;
        if (i3 > i20Arr2.length) {
            I20[] i20Arr3 = new I20[i20Arr2.length * 2];
            System.arraycopy(i20Arr2, 0, i20Arr3, i20Arr2.length, i20Arr2.length);
            this.e = this.d.length - 1;
            this.d = i20Arr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = i20;
        this.f++;
        this.g += i2;
    }

    public final C0674Ik d() throws EOFException {
        int i;
        C8351zN0 c8351zN0 = this.c;
        byte bP = c8351zN0.p();
        byte[] bArr = AbstractC0199Ch1.a;
        int i2 = bP & 255;
        int i3 = 0;
        boolean z = (bP & 128) == 128;
        long jE = e(i2, 127);
        if (!z) {
            return c8351zN0.w(jE);
        }
        C6129nj c6129nj = new C6129nj();
        int[] iArr = K40.a;
        O90.f(c8351zN0, "source");
        C5217ix0 c5217ix0 = K40.c;
        C5217ix0 c5217ix02 = c5217ix0;
        int i4 = 0;
        for (long j = 0; j < jE; j++) {
            byte bP2 = c8351zN0.p();
            byte[] bArr2 = AbstractC0199Ch1.a;
            i3 = (i3 << 8) | (bP2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                int i5 = (i3 >>> (i4 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                C5217ix0[] c5217ix0Arr = (C5217ix0[]) c5217ix02.c;
                O90.c(c5217ix0Arr);
                c5217ix02 = c5217ix0Arr[i5];
                O90.c(c5217ix02);
                if (((C5217ix0[]) c5217ix02.c) == null) {
                    c6129nj.r0(c5217ix02.a);
                    i4 -= c5217ix02.b;
                    c5217ix02 = c5217ix0;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            int i6 = (i3 << (8 - i4)) & KotlinVersion.MAX_COMPONENT_VALUE;
            C5217ix0[] c5217ix0Arr2 = (C5217ix0[]) c5217ix02.c;
            O90.c(c5217ix0Arr2);
            C5217ix0 c5217ix03 = c5217ix0Arr2[i6];
            O90.c(c5217ix03);
            if (((C5217ix0[]) c5217ix03.c) != null || (i = c5217ix03.b) > i4) {
                break;
            }
            c6129nj.r0(c5217ix03.a);
            i4 -= i;
            c5217ix02 = c5217ix0;
        }
        return c6129nj.U(c6129nj.b);
    }

    public final int e(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bP = this.c.p();
            byte[] bArr = AbstractC0199Ch1.a;
            int i5 = bP & 255;
            if ((bP & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bP & 127) << i4;
            i4 += 7;
        }
    }
}
