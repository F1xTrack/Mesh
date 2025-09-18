package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ku */
/* loaded from: classes.dex */
public final class C5589ku {
    public int a;
    public C5971mu b;
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public C5589ku(FileInputStream fileInputStream) {
        Charset charset = AbstractC8309z90.a;
        this.c = fileInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void D(int i) throws Z90 {
        if (G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw Z90.f();
        }
        throw new Z90("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i) throws Z90 {
        int iZ;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw Z90.c();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    D(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw Z90.c();
            return true;
        }
        if (i2 == 1) {
            F(8);
            return true;
        }
        if (i2 == 2) {
            F(s());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw Z90.b();
            }
            F(4);
            return true;
        }
        do {
            iZ = z();
            if (iZ == 0) {
                break;
            }
        } while (E(iZ));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i) throws Z90 {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw Z90.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            F((i8 - i5) - i3);
            throw Z90.f();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } finally {
                this.i += i4;
                C();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        D(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                D(1);
            }
        }
    }

    public final boolean G(int i) throws IOException {
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC8235ym.g(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.i;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.j) {
            return false;
        }
        byte[] bArr = this.d;
        if (i2 > 0) {
            if (i4 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.i += i2;
            this.e -= i2;
            this.g = 0;
        }
        int i6 = this.e;
        int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6);
        FileInputStream fileInputStream = this.c;
        int i7 = fileInputStream.read(bArr, i6, iMin);
        if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
            throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        }
        if (i7 <= 0) {
            return false;
        }
        this.e += i7;
        C();
        if (this.e >= i) {
            return true;
        }
        return G(i);
    }

    public final void a(int i) throws Z90 {
        if (this.h != i) {
            throw new Z90("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.i + this.g;
    }

    public final boolean c() {
        return this.g == this.e && !G(1);
    }

    public final void d(int i) {
        this.j = i;
        C();
    }

    public final int e(int i) throws Z90 {
        if (i < 0) {
            throw Z90.d();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw Z90.f();
        }
        this.j = i2;
        C();
        return i3;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i) throws IOException {
        byte[] bArrO = o(i);
        if (bArrO != null) {
            return bArrO;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList arrayListP = p(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        Iterator it = arrayListP.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i) throws IOException {
        if (i == 0) {
            return AbstractC8309z90.b;
        }
        if (i < 0) {
            throw Z90.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new Z90("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            F((i5 - i2) - i3);
            throw Z90.f();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw Z90.f();
            }
            this.i += i8;
            i6 += i8;
        }
        return bArr;
    }

    public final ArrayList p(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw Z90.f();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() throws Z90 {
        int i = this.g;
        if (this.e - i < 4) {
            D(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long r() throws Z90 {
        int i = this.g;
        if (this.e - i < 8) {
            D(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int s() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return u();
    }

    public final long u() throws Z90 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                D(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            j |= (r3 & 127) << i;
            if ((this.d[i2] & 128) == 0) {
                return j;
            }
        }
        throw Z90.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int iS = s();
        return (-(iS & 1)) ^ (iS >>> 1);
    }

    public final long y() {
        long jT = t();
        return (-(jT & 1)) ^ (jT >>> 1);
    }

    public final int z() throws Z90 {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int iS = s();
        this.h = iS;
        if ((iS >>> 3) != 0) {
            return iS;
        }
        throw new Z90("Protocol message contained an invalid tag (zero).");
    }
}
