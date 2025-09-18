package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ZU0 {

    /* renamed from: a */
    public final C6224jE f14903a;

    /* renamed from: b */
    public final int f14904b;

    /* renamed from: c */
    public final C9591hA0 f14905c;

    /* renamed from: d */
    public C0451H9 f14906d;

    /* renamed from: e */
    public C0451H9 f14907e;

    /* renamed from: f */
    public C0451H9 f14908f;

    /* renamed from: g */
    public long f14909g;

    public ZU0(C6224jE c6224jE) {
        this.f14903a = c6224jE;
        int i = c6224jE.f34989a;
        this.f14904b = i;
        this.f14905c = new C9591hA0(32);
        C0451H9 c0451h9 = new C0451H9(0L, i);
        this.f14906d = c0451h9;
        this.f14907e = c0451h9;
        this.f14908f = c0451h9;
    }

    /* renamed from: d */
    public static C0451H9 m9531d(C0451H9 c0451h9, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c0451h9.f4147b) {
            c0451h9 = (C0451H9) c0451h9.f4149d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c0451h9.f4147b - j));
            C0822N3 c0822n3 = (C0822N3) c0451h9.f4148c;
            byteBuffer.put(c0822n3.f7477a, ((int) (j - c0451h9.f4146a)) + c0822n3.f7478b, iMin);
            i -= iMin;
            j += iMin;
            if (j == c0451h9.f4147b) {
                c0451h9 = (C0451H9) c0451h9.f4149d;
            }
        }
        return c0451h9;
    }

    /* renamed from: e */
    public static C0451H9 m9532e(C0451H9 c0451h9, long j, byte[] bArr, int i) {
        while (j >= c0451h9.f4147b) {
            c0451h9 = (C0451H9) c0451h9.f4149d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c0451h9.f4147b - j));
            C0822N3 c0822n3 = (C0822N3) c0451h9.f4148c;
            System.arraycopy(c0822n3.f7477a, ((int) (j - c0451h9.f4146a)) + c0822n3.f7478b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == c0451h9.f4147b) {
                c0451h9 = (C0451H9) c0451h9.f4149d;
            }
        }
        return c0451h9;
    }

    /* renamed from: f */
    public static C0451H9 m9533f(C0451H9 c0451h9, C1587ZD c1587zd, C0303Eo c0303Eo, C9591hA0 c9591hA0) {
        int iM18735A;
        if (c1587zd.m2501g(1073741824)) {
            long j = c0303Eo.f2908b;
            c9591hA0.m18738D(1);
            C0451H9 c0451h9M9532e = m9532e(c0451h9, j, c9591hA0.f28293a, 1);
            long j2 = j + 1;
            byte b = c9591hA0.f28293a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            C6536oB c6536oB = c1587zd.f14797d;
            byte[] bArr = c6536oB.f38853a;
            if (bArr == null) {
                c6536oB.f38853a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c0451h9 = m9532e(c0451h9M9532e, j2, c6536oB.f38853a, i);
            long j3 = j2 + i;
            if (z) {
                c9591hA0.m18738D(2);
                c0451h9 = m9532e(c0451h9, j3, c9591hA0.f28293a, 2);
                j3 += 2;
                iM18735A = c9591hA0.m18735A();
            } else {
                iM18735A = 1;
            }
            int[] iArr = c6536oB.f38856d;
            if (iArr == null || iArr.length < iM18735A) {
                iArr = new int[iM18735A];
            }
            int[] iArr2 = c6536oB.f38857e;
            if (iArr2 == null || iArr2.length < iM18735A) {
                iArr2 = new int[iM18735A];
            }
            if (z) {
                int i2 = iM18735A * 6;
                c9591hA0.m18738D(i2);
                c0451h9 = m9532e(c0451h9, j3, c9591hA0.f28293a, i2);
                j3 += i2;
                c9591hA0.m18741G(0);
                for (int i3 = 0; i3 < iM18735A; i3++) {
                    iArr[i3] = c9591hA0.m18735A();
                    iArr2[i3] = c9591hA0.m18767y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0303Eo.f2907a - ((int) (j3 - c0303Eo.f2908b));
            }
            C8305Tb1 c8305Tb1 = (C8305Tb1) c0303Eo.f2909c;
            int i4 = AbstractC7485Dh1.f2166a;
            byte[] bArr2 = c8305Tb1.f11435b;
            byte[] bArr3 = c6536oB.f38853a;
            c6536oB.f38858f = iM18735A;
            c6536oB.f38856d = iArr;
            c6536oB.f38857e = iArr2;
            c6536oB.f38854b = bArr2;
            c6536oB.f38853a = bArr3;
            int i5 = c8305Tb1.f11434a;
            c6536oB.f38855c = i5;
            int i6 = c8305Tb1.f11436c;
            c6536oB.f38859g = i6;
            int i7 = c8305Tb1.f11437d;
            c6536oB.f38860h = i7;
            MediaCodec.CryptoInfo cryptoInfo = c6536oB.f38861i;
            cryptoInfo.numSubSamples = iM18735A;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (AbstractC7485Dh1.f2166a >= 24) {
                C7967Mo1 c7967Mo1 = c6536oB.f38862j;
                c7967Mo1.getClass();
                ((MediaCodec.CryptoInfo.Pattern) c7967Mo1.f7363b).set(i6, i7);
                ((MediaCodec.CryptoInfo) c7967Mo1.f7362a).setPattern((MediaCodec.CryptoInfo.Pattern) c7967Mo1.f7363b);
            }
            long j4 = c0303Eo.f2908b;
            int i8 = (int) (j3 - j4);
            c0303Eo.f2908b = j4 + i8;
            c0303Eo.f2907a -= i8;
        }
        if (!c1587zd.m2501g(268435456)) {
            c1587zd.m9506v(c0303Eo.f2907a);
            return m9531d(c0451h9, c0303Eo.f2908b, c1587zd.f14798e, c0303Eo.f2907a);
        }
        c9591hA0.m18738D(4);
        C0451H9 c0451h9M9532e2 = m9532e(c0451h9, c0303Eo.f2908b, c9591hA0.f28293a, 4);
        int iM18767y = c9591hA0.m18767y();
        c0303Eo.f2908b += 4;
        c0303Eo.f2907a -= 4;
        c1587zd.m9506v(iM18767y);
        C0451H9 c0451h9M9531d = m9531d(c0451h9M9532e2, c0303Eo.f2908b, c1587zd.f14798e, iM18767y);
        c0303Eo.f2908b += iM18767y;
        int i9 = c0303Eo.f2907a - iM18767y;
        c0303Eo.f2907a = i9;
        ByteBuffer byteBuffer = c1587zd.f14801h;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            c1587zd.f14801h = ByteBuffer.allocate(i9);
        } else {
            c1587zd.f14801h.clear();
        }
        return m9531d(c0451h9M9531d, c0303Eo.f2908b, c1587zd.f14801h, c0303Eo.f2907a);
    }

    /* renamed from: a */
    public final void m9534a(C0451H9 c0451h9) {
        if (((C0822N3) c0451h9.f4148c) == null) {
            return;
        }
        C6224jE c6224jE = this.f14903a;
        synchronized (c6224jE) {
            C0451H9 c0451h92 = c0451h9;
            while (c0451h92 != null) {
                try {
                    C0822N3[] c0822n3Arr = (C0822N3[]) c6224jE.f34994f;
                    int i = c6224jE.f34992d;
                    c6224jE.f34992d = i + 1;
                    C0822N3 c0822n3 = (C0822N3) c0451h92.f4148c;
                    c0822n3.getClass();
                    c0822n3Arr[i] = c0822n3;
                    c6224jE.f34991c--;
                    c0451h92 = (C0451H9) c0451h92.f4149d;
                    if (c0451h92 == null || ((C0822N3) c0451h92.f4148c) == null) {
                        c0451h92 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c6224jE.notifyAll();
        }
        c0451h9.f4148c = null;
        c0451h9.f4149d = null;
    }

    /* renamed from: b */
    public final void m9535b(long j) {
        C0451H9 c0451h9;
        if (j == -1) {
            return;
        }
        while (true) {
            c0451h9 = this.f14906d;
            if (j < c0451h9.f4147b) {
                break;
            }
            C6224jE c6224jE = this.f14903a;
            C0822N3 c0822n3 = (C0822N3) c0451h9.f4148c;
            synchronized (c6224jE) {
                C0822N3[] c0822n3Arr = (C0822N3[]) c6224jE.f34994f;
                int i = c6224jE.f34992d;
                c6224jE.f34992d = i + 1;
                c0822n3Arr[i] = c0822n3;
                c6224jE.f34991c--;
                c6224jE.notifyAll();
            }
            C0451H9 c0451h92 = this.f14906d;
            c0451h92.f4148c = null;
            C0451H9 c0451h93 = (C0451H9) c0451h92.f4149d;
            c0451h92.f4149d = null;
            this.f14906d = c0451h93;
        }
        if (this.f14907e.f4146a < c0451h9.f4146a) {
            this.f14907e = c0451h9;
        }
    }

    /* renamed from: c */
    public final int m9536c(int i) {
        C0822N3 c0822n3;
        C0451H9 c0451h9 = this.f14908f;
        if (((C0822N3) c0451h9.f4148c) == null) {
            C6224jE c6224jE = this.f14903a;
            synchronized (c6224jE) {
                try {
                    int i2 = c6224jE.f34991c + 1;
                    c6224jE.f34991c = i2;
                    int i3 = c6224jE.f34992d;
                    if (i3 > 0) {
                        C0822N3[] c0822n3Arr = (C0822N3[]) c6224jE.f34994f;
                        int i4 = i3 - 1;
                        c6224jE.f34992d = i4;
                        c0822n3 = c0822n3Arr[i4];
                        c0822n3.getClass();
                        ((C0822N3[]) c6224jE.f34994f)[c6224jE.f34992d] = null;
                    } else {
                        C0822N3 c0822n32 = new C0822N3(new byte[c6224jE.f34989a], 0);
                        C0822N3[] c0822n3Arr2 = (C0822N3[]) c6224jE.f34994f;
                        if (i2 > c0822n3Arr2.length) {
                            c6224jE.f34994f = (C0822N3[]) Arrays.copyOf(c0822n3Arr2, c0822n3Arr2.length * 2);
                        }
                        c0822n3 = c0822n32;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0451H9 c0451h92 = new C0451H9(this.f14908f.f4147b, this.f14904b);
            c0451h9.f4148c = c0822n3;
            c0451h9.f4149d = c0451h92;
        }
        return Math.min(i, (int) (this.f14908f.f4147b - this.f14909g));
    }
}
