package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ZU0 {
    public final C5272jE a;
    public final int b;
    public final C4103hA0 c;
    public H9 d;
    public H9 e;
    public H9 f;
    public long g;

    public ZU0(C5272jE c5272jE) {
        this.a = c5272jE;
        int i = c5272jE.a;
        this.b = i;
        this.c = new C4103hA0(32);
        H9 h9 = new H9(0L, i);
        this.d = h9;
        this.e = h9;
        this.f = h9;
    }

    public static H9 d(H9 h9, long j, ByteBuffer byteBuffer, int i) {
        while (j >= h9.b) {
            h9 = (H9) h9.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (h9.b - j));
            N3 n3 = (N3) h9.c;
            byteBuffer.put(n3.a, ((int) (j - h9.a)) + n3.b, iMin);
            i -= iMin;
            j += iMin;
            if (j == h9.b) {
                h9 = (H9) h9.d;
            }
        }
        return h9;
    }

    public static H9 e(H9 h9, long j, byte[] bArr, int i) {
        while (j >= h9.b) {
            h9 = (H9) h9.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (h9.b - j));
            N3 n3 = (N3) h9.c;
            System.arraycopy(n3.a, ((int) (j - h9.a)) + n3.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == h9.b) {
                h9 = (H9) h9.d;
            }
        }
        return h9;
    }

    public static H9 f(H9 h9, ZD zd, C0374Eo c0374Eo, C4103hA0 c4103hA0) {
        int iA;
        if (zd.g(1073741824)) {
            long j = c0374Eo.b;
            c4103hA0.D(1);
            H9 h9E = e(h9, j, c4103hA0.a, 1);
            long j2 = j + 1;
            byte b = c4103hA0.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            C6218oB c6218oB = zd.d;
            byte[] bArr = c6218oB.a;
            if (bArr == null) {
                c6218oB.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            h9 = e(h9E, j2, c6218oB.a, i);
            long j3 = j2 + i;
            if (z) {
                c4103hA0.D(2);
                h9 = e(h9, j3, c4103hA0.a, 2);
                j3 += 2;
                iA = c4103hA0.A();
            } else {
                iA = 1;
            }
            int[] iArr = c6218oB.d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = c6218oB.e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z) {
                int i2 = iA * 6;
                c4103hA0.D(i2);
                h9 = e(h9, j3, c4103hA0.a, i2);
                j3 += i2;
                c4103hA0.G(0);
                for (int i3 = 0; i3 < iA; i3++) {
                    iArr[i3] = c4103hA0.A();
                    iArr2[i3] = c4103hA0.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0374Eo.a - ((int) (j3 - c0374Eo.b));
            }
            C1506Tb1 c1506Tb1 = (C1506Tb1) c0374Eo.c;
            int i4 = AbstractC0277Dh1.a;
            byte[] bArr2 = c1506Tb1.b;
            byte[] bArr3 = c6218oB.a;
            c6218oB.f = iA;
            c6218oB.d = iArr;
            c6218oB.e = iArr2;
            c6218oB.b = bArr2;
            c6218oB.a = bArr3;
            int i5 = c1506Tb1.a;
            c6218oB.c = i5;
            int i6 = c1506Tb1.c;
            c6218oB.g = i6;
            int i7 = c1506Tb1.d;
            c6218oB.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = c6218oB.i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (AbstractC0277Dh1.a >= 24) {
                C0999Mo1 c0999Mo1 = c6218oB.j;
                c0999Mo1.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c0999Mo1.b).set(i6, i7);
                ((MediaCodec.CryptoInfo) c0999Mo1.a).setPattern((MediaCodec.CryptoInfo.Pattern) c0999Mo1.b);
            }
            long j4 = c0374Eo.b;
            int i8 = (int) (j3 - j4);
            c0374Eo.b = j4 + i8;
            c0374Eo.a -= i8;
        }
        if (!zd.g(268435456)) {
            zd.v(c0374Eo.a);
            return d(h9, c0374Eo.b, zd.e, c0374Eo.a);
        }
        c4103hA0.D(4);
        H9 h9E2 = e(h9, c0374Eo.b, c4103hA0.a, 4);
        int iY = c4103hA0.y();
        c0374Eo.b += 4;
        c0374Eo.a -= 4;
        zd.v(iY);
        H9 h9D = d(h9E2, c0374Eo.b, zd.e, iY);
        c0374Eo.b += iY;
        int i9 = c0374Eo.a - iY;
        c0374Eo.a = i9;
        ByteBuffer byteBuffer = zd.h;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            zd.h = ByteBuffer.allocate(i9);
        } else {
            zd.h.clear();
        }
        return d(h9D, c0374Eo.b, zd.h, c0374Eo.a);
    }

    public final void a(H9 h9) {
        if (((N3) h9.c) == null) {
            return;
        }
        C5272jE c5272jE = this.a;
        synchronized (c5272jE) {
            H9 h92 = h9;
            while (h92 != null) {
                try {
                    N3[] n3Arr = (N3[]) c5272jE.f;
                    int i = c5272jE.d;
                    c5272jE.d = i + 1;
                    N3 n3 = (N3) h92.c;
                    n3.getClass();
                    n3Arr[i] = n3;
                    c5272jE.c--;
                    h92 = (H9) h92.d;
                    if (h92 == null || ((N3) h92.c) == null) {
                        h92 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c5272jE.notifyAll();
        }
        h9.c = null;
        h9.d = null;
    }

    public final void b(long j) {
        H9 h9;
        if (j == -1) {
            return;
        }
        while (true) {
            h9 = this.d;
            if (j < h9.b) {
                break;
            }
            C5272jE c5272jE = this.a;
            N3 n3 = (N3) h9.c;
            synchronized (c5272jE) {
                N3[] n3Arr = (N3[]) c5272jE.f;
                int i = c5272jE.d;
                c5272jE.d = i + 1;
                n3Arr[i] = n3;
                c5272jE.c--;
                c5272jE.notifyAll();
            }
            H9 h92 = this.d;
            h92.c = null;
            H9 h93 = (H9) h92.d;
            h92.d = null;
            this.d = h93;
        }
        if (this.e.a < h9.a) {
            this.e = h9;
        }
    }

    public final int c(int i) {
        N3 n3;
        H9 h9 = this.f;
        if (((N3) h9.c) == null) {
            C5272jE c5272jE = this.a;
            synchronized (c5272jE) {
                try {
                    int i2 = c5272jE.c + 1;
                    c5272jE.c = i2;
                    int i3 = c5272jE.d;
                    if (i3 > 0) {
                        N3[] n3Arr = (N3[]) c5272jE.f;
                        int i4 = i3 - 1;
                        c5272jE.d = i4;
                        n3 = n3Arr[i4];
                        n3.getClass();
                        ((N3[]) c5272jE.f)[c5272jE.d] = null;
                    } else {
                        N3 n32 = new N3(new byte[c5272jE.a], 0);
                        N3[] n3Arr2 = (N3[]) c5272jE.f;
                        if (i2 > n3Arr2.length) {
                            c5272jE.f = (N3[]) Arrays.copyOf(n3Arr2, n3Arr2.length * 2);
                        }
                        n3 = n32;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            H9 h92 = new H9(this.f.b, this.b);
            h9.c = n3;
            h9.d = h92;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
