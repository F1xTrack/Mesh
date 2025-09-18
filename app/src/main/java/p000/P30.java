package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class P30 {

    /* renamed from: c */
    public final C11917zN0 f8812c;

    /* renamed from: f */
    public int f8815f;

    /* renamed from: g */
    public int f8816g;

    /* renamed from: a */
    public int f8810a = 4096;

    /* renamed from: b */
    public final ArrayList f8811b = new ArrayList();

    /* renamed from: d */
    public I20[] f8813d = new I20[8];

    /* renamed from: e */
    public int f8814e = 7;

    public P30(C9835j40 c9835j40) {
        this.f8812c = JI1.m4274b(c9835j40);
    }

    /* renamed from: a */
    public final int m6219a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f8813d.length;
            while (true) {
                length--;
                i2 = this.f8814e;
                if (length < i2 || i <= 0) {
                    break;
                }
                I20 i20 = this.f8813d[length];
                O90.m5965c(i20);
                int i4 = i20.f4669c;
                i -= i4;
                this.f8816g -= i4;
                this.f8815f--;
                i3++;
            }
            I20[] i20Arr = this.f8813d;
            System.arraycopy(i20Arr, i2 + 1, i20Arr, i2 + 1 + i3, this.f8815f);
            this.f8814e += i3;
        }
        return i3;
    }

    /* renamed from: b */
    public final C0551Ik m6220b(int i) throws IOException {
        if (i >= 0) {
            I20[] i20Arr = R30.f9967a;
            if (i <= i20Arr.length - 1) {
                return i20Arr[i].f4667a;
            }
        }
        int length = this.f8814e + 1 + (i - R30.f9967a.length);
        if (length >= 0) {
            I20[] i20Arr2 = this.f8813d;
            if (length < i20Arr2.length) {
                I20 i20 = i20Arr2[length];
                O90.m5965c(i20);
                return i20.f4667a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* renamed from: c */
    public final void m6221c(I20 i20) {
        this.f8811b.add(i20);
        int i = this.f8810a;
        int i2 = i20.f4669c;
        if (i2 > i) {
            I20[] i20Arr = this.f8813d;
            AbstractC0576J8.m4184k(i20Arr, 0, i20Arr.length);
            this.f8814e = this.f8813d.length - 1;
            this.f8815f = 0;
            this.f8816g = 0;
            return;
        }
        m6219a((this.f8816g + i2) - i);
        int i3 = this.f8815f + 1;
        I20[] i20Arr2 = this.f8813d;
        if (i3 > i20Arr2.length) {
            I20[] i20Arr3 = new I20[i20Arr2.length * 2];
            System.arraycopy(i20Arr2, 0, i20Arr3, i20Arr2.length, i20Arr2.length);
            this.f8814e = this.f8813d.length - 1;
            this.f8813d = i20Arr3;
        }
        int i4 = this.f8814e;
        this.f8814e = i4 - 1;
        this.f8813d[i4] = i20;
        this.f8815f++;
        this.f8816g += i2;
    }

    /* renamed from: d */
    public final C0551Ik m6222d() throws EOFException {
        int i;
        C11917zN0 c11917zN0 = this.f8812c;
        byte bM26390p = c11917zN0.m26390p();
        byte[] bArr = AbstractC7433Ch1.f1577a;
        int i2 = bM26390p & 255;
        int i3 = 0;
        boolean z = (bM26390p & 128) == 128;
        long jM6223e = m6223e(i2, 127);
        if (!z) {
            return c11917zN0.m26391w(jM6223e);
        }
        C6507nj c6507nj = new C6507nj();
        int[] iArr = K40.f5896a;
        O90.m5968f(c11917zN0, "source");
        C9817ix0 c9817ix0 = K40.f5898c;
        C9817ix0 c9817ix02 = c9817ix0;
        int i4 = 0;
        for (long j = 0; j < jM6223e; j++) {
            byte bM26390p2 = c11917zN0.m26390p();
            byte[] bArr2 = AbstractC7433Ch1.f1577a;
            i3 = (i3 << 8) | (bM26390p2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                int i5 = (i3 >>> (i4 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                C9817ix0[] c9817ix0Arr = (C9817ix0[]) c9817ix02.f34816c;
                O90.m5965c(c9817ix0Arr);
                c9817ix02 = c9817ix0Arr[i5];
                O90.m5965c(c9817ix02);
                if (((C9817ix0[]) c9817ix02.f34816c) == null) {
                    c6507nj.m23195r0(c9817ix02.f34814a);
                    i4 -= c9817ix02.f34815b;
                    c9817ix02 = c9817ix0;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            int i6 = (i3 << (8 - i4)) & KotlinVersion.MAX_COMPONENT_VALUE;
            C9817ix0[] c9817ix0Arr2 = (C9817ix0[]) c9817ix02.f34816c;
            O90.m5965c(c9817ix0Arr2);
            C9817ix0 c9817ix03 = c9817ix0Arr2[i6];
            O90.m5965c(c9817ix03);
            if (((C9817ix0[]) c9817ix03.f34816c) != null || (i = c9817ix03.f34815b) > i4) {
                break;
            }
            c6507nj.m23195r0(c9817ix03.f34814a);
            i4 -= i;
            c9817ix02 = c9817ix0;
        }
        return c6507nj.m23178U(c6507nj.f38488b);
    }

    /* renamed from: e */
    public final int m6223e(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bM26390p = this.f8812c.m26390p();
            byte[] bArr = AbstractC7433Ch1.f1577a;
            int i5 = bM26390p & 255;
            if ((bM26390p & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (bM26390p & 127) << i4;
            i4 += 7;
        }
    }
}
