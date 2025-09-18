package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class SX0 extends C0674Ik {
    public final transient byte[][] e;
    public final transient int[] f;

    public SX0(byte[][] bArr, int[] iArr) {
        super(C0674Ik.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.C0674Ik
    public final String a() {
        return new C0674Ik(j()).a();
    }

    @Override // defpackage.C0674Ik
    public final C0674Ik b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        O90.c(bArrDigest);
        return new C0674Ik(bArrDigest);
    }

    @Override // defpackage.C0674Ik
    public final int c() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.C0674Ik
    public final String d() {
        return new C0674Ik(j()).d();
    }

    @Override // defpackage.C0674Ik
    public final byte[] e() {
        return j();
    }

    @Override // defpackage.C0674Ik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0674Ik) {
            C0674Ik c0674Ik = (C0674Ik) obj;
            if (c0674Ik.c() == c() && h(c0674Ik, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.C0674Ik
    public final byte f(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length - 1;
        int[] iArr = this.f;
        AbstractC1525Ti.b(iArr[length], i, 1L);
        int iG = ML1.g(this, i);
        return bArr[iG][(i - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // defpackage.C0674Ik
    public final boolean g(int i, byte[] bArr, int i2, int i3) {
        O90.f(bArr, "other");
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iG = ML1.g(this, i);
        while (i < i4) {
            int[] iArr = this.f;
            int i5 = iG == 0 ? 0 : iArr[iG - 1];
            int i6 = iArr[iG] - i5;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iG];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!AbstractC1525Ti.a(bArr2[iG], (i - i5) + i7, i2, bArr, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iG++;
        }
        return true;
    }

    @Override // defpackage.C0674Ik
    public final boolean h(C0674Ik c0674Ik, int i) {
        O90.f(c0674Ik, "other");
        if (c() - i < 0) {
            return false;
        }
        int iG = ML1.g(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i4 = iG == 0 ? 0 : iArr[iG - 1];
            int i5 = iArr[iG] - i4;
            byte[][] bArr = this.e;
            int i6 = iArr[bArr.length + iG];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!c0674Ik.g(i3, bArr[iG], (i2 - i4) + i6, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iG++;
        }
        return true;
    }

    @Override // defpackage.C0674Ik
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.C0674Ik
    public final C0674Ik i() {
        return new C0674Ik(j()).i();
    }

    @Override // defpackage.C0674Ik
    public final byte[] j() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            J8.h(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.C0674Ik
    public final void l(C6129nj c6129nj, int i) {
        O90.f(c6129nj, "buffer");
        int iG = ML1.g(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f;
            int i3 = iG == 0 ? 0 : iArr[iG - 1];
            int i4 = iArr[iG] - i3;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iG];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            JX0 jx0 = new JX0(bArr[iG], i6, i6 + iMin, true, false);
            JX0 jx02 = c6129nj.a;
            if (jx02 == null) {
                jx0.g = jx0;
                jx0.f = jx0;
                c6129nj.a = jx0;
            } else {
                JX0 jx03 = jx02.g;
                O90.c(jx03);
                jx03.b(jx0);
            }
            i2 += iMin;
            iG++;
        }
        c6129nj.b += i;
    }

    @Override // defpackage.C0674Ik
    public final String toString() {
        return new C0674Ik(j()).toString();
    }
}
