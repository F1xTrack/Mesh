package p000;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Q30 {

    /* renamed from: b */
    public final C6507nj f9438b;

    /* renamed from: d */
    public boolean f9440d;

    /* renamed from: h */
    public int f9444h;

    /* renamed from: i */
    public int f9445i;

    /* renamed from: a */
    public final boolean f9437a = true;

    /* renamed from: c */
    public int f9439c = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f9441e = 4096;

    /* renamed from: f */
    public I20[] f9442f = new I20[8];

    /* renamed from: g */
    public int f9443g = 7;

    public Q30(C6507nj c6507nj) {
        this.f9438b = c6507nj;
    }

    /* renamed from: a */
    public final void m6564a(int i) {
        int i2;
        if (i > 0) {
            int length = this.f9442f.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f9443g;
                if (length < i2 || i <= 0) {
                    break;
                }
                I20 i20 = this.f9442f[length];
                O90.m5965c(i20);
                i -= i20.f4669c;
                int i4 = this.f9445i;
                I20 i202 = this.f9442f[length];
                O90.m5965c(i202);
                this.f9445i = i4 - i202.f4669c;
                this.f9444h--;
                i3++;
                length--;
            }
            I20[] i20Arr = this.f9442f;
            int i5 = i2 + 1;
            System.arraycopy(i20Arr, i5, i20Arr, i5 + i3, this.f9444h);
            I20[] i20Arr2 = this.f9442f;
            int i6 = this.f9443g + 1;
            Arrays.fill(i20Arr2, i6, i6 + i3, (Object) null);
            this.f9443g += i3;
        }
    }

    /* renamed from: b */
    public final void m6565b(I20 i20) {
        int i = this.f9441e;
        int i2 = i20.f4669c;
        if (i2 > i) {
            I20[] i20Arr = this.f9442f;
            AbstractC0576J8.m4184k(i20Arr, 0, i20Arr.length);
            this.f9443g = this.f9442f.length - 1;
            this.f9444h = 0;
            this.f9445i = 0;
            return;
        }
        m6564a((this.f9445i + i2) - i);
        int i3 = this.f9444h + 1;
        I20[] i20Arr2 = this.f9442f;
        if (i3 > i20Arr2.length) {
            I20[] i20Arr3 = new I20[i20Arr2.length * 2];
            System.arraycopy(i20Arr2, 0, i20Arr3, i20Arr2.length, i20Arr2.length);
            this.f9443g = this.f9442f.length - 1;
            this.f9442f = i20Arr3;
        }
        int i4 = this.f9443g;
        this.f9443g = i4 - 1;
        this.f9442f[i4] = i20;
        this.f9444h++;
        this.f9445i += i2;
    }

    /* renamed from: c */
    public final void m6566c(C0551Ik c0551Ik) throws EOFException {
        O90.m5968f(c0551Ik, "data");
        C6507nj c6507nj = this.f9438b;
        if (this.f9437a) {
            int[] iArr = K40.f5896a;
            int iMo3983c = c0551Ik.mo3983c();
            long j = 0;
            for (int i = 0; i < iMo3983c; i++) {
                byte bMo3986f = c0551Ik.mo3986f(i);
                byte[] bArr = AbstractC7433Ch1.f1577a;
                j += K40.f5897b[bMo3986f & 255];
            }
            if (((int) ((j + 7) >> 3)) < c0551Ik.mo3983c()) {
                C6507nj c6507nj2 = new C6507nj();
                int[] iArr2 = K40.f5896a;
                int iMo3983c2 = c0551Ik.mo3983c();
                long j2 = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < iMo3983c2; i3++) {
                    byte bMo3986f2 = c0551Ik.mo3986f(i3);
                    byte[] bArr2 = AbstractC7433Ch1.f1577a;
                    int i4 = bMo3986f2 & 255;
                    int i5 = K40.f5896a[i4];
                    byte b = K40.f5897b[i4];
                    j2 = (j2 << b) | i5;
                    i2 += b;
                    while (i2 >= 8) {
                        i2 -= 8;
                        c6507nj2.m23195r0((int) (j2 >> i2));
                    }
                }
                if (i2 > 0) {
                    c6507nj2.m23195r0((int) ((255 >>> i2) | (j2 << (8 - i2))));
                }
                C0551Ik c0551IkM23178U = c6507nj2.m23178U(c6507nj2.f38488b);
                m6568e(c0551IkM23178U.mo3983c(), 127, 128);
                c6507nj.m23191o0(c0551IkM23178U);
                return;
            }
        }
        m6568e(c0551Ik.mo3983c(), 127, 0);
        c6507nj.m23191o0(c0551Ik);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0069  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6567d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Q30.m6567d(java.util.ArrayList):void");
    }

    /* renamed from: e */
    public final void m6568e(int i, int i2, int i3) {
        C6507nj c6507nj = this.f9438b;
        if (i < i2) {
            c6507nj.m23195r0(i | i3);
            return;
        }
        c6507nj.m23195r0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c6507nj.m23195r0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c6507nj.m23195r0(i4);
    }
}
