package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class SX0 extends C0551Ik {

    /* renamed from: e */
    public final transient byte[][] f10843e;

    /* renamed from: f */
    public final transient int[] f10844f;

    public SX0(byte[][] bArr, int[] iArr) {
        super(C0551Ik.f5116d.f5117a);
        this.f10843e = bArr;
        this.f10844f = iArr;
    }

    @Override // p000.C0551Ik
    /* renamed from: a */
    public final String mo3981a() {
        return new C0551Ik(mo3990j()).mo3981a();
    }

    @Override // p000.C0551Ik
    /* renamed from: b */
    public final C0551Ik mo3982b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f10843e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10844f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        O90.m5965c(bArrDigest);
        return new C0551Ik(bArrDigest);
    }

    @Override // p000.C0551Ik
    /* renamed from: c */
    public final int mo3983c() {
        return this.f10844f[this.f10843e.length - 1];
    }

    @Override // p000.C0551Ik
    /* renamed from: d */
    public final String mo3984d() {
        return new C0551Ik(mo3990j()).mo3984d();
    }

    @Override // p000.C0551Ik
    /* renamed from: e */
    public final byte[] mo3985e() {
        return mo3990j();
    }

    @Override // p000.C0551Ik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0551Ik) {
            C0551Ik c0551Ik = (C0551Ik) obj;
            if (c0551Ik.mo3983c() == mo3983c() && mo3988h(c0551Ik, mo3983c())) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.C0551Ik
    /* renamed from: f */
    public final byte mo3986f(int i) {
        byte[][] bArr = this.f10843e;
        int length = bArr.length - 1;
        int[] iArr = this.f10844f;
        AbstractC1240Ti.m7729b(iArr[length], i, 1L);
        int iM5340g = ML1.m5340g(this, i);
        return bArr[iM5340g][(i - (iM5340g == 0 ? 0 : iArr[iM5340g - 1])) + iArr[bArr.length + iM5340g]];
    }

    @Override // p000.C0551Ik
    /* renamed from: g */
    public final boolean mo3987g(int i, byte[] bArr, int i2, int i3) {
        O90.m5968f(bArr, "other");
        if (i < 0 || i > mo3983c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM5340g = ML1.m5340g(this, i);
        while (i < i4) {
            int[] iArr = this.f10844f;
            int i5 = iM5340g == 0 ? 0 : iArr[iM5340g - 1];
            int i6 = iArr[iM5340g] - i5;
            byte[][] bArr2 = this.f10843e;
            int i7 = iArr[bArr2.length + iM5340g];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!AbstractC1240Ti.m7728a(bArr2[iM5340g], (i - i5) + i7, i2, bArr, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM5340g++;
        }
        return true;
    }

    @Override // p000.C0551Ik
    /* renamed from: h */
    public final boolean mo3988h(C0551Ik c0551Ik, int i) {
        O90.m5968f(c0551Ik, "other");
        if (mo3983c() - i < 0) {
            return false;
        }
        int iM5340g = ML1.m5340g(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.f10844f;
            int i4 = iM5340g == 0 ? 0 : iArr[iM5340g - 1];
            int i5 = iArr[iM5340g] - i4;
            byte[][] bArr = this.f10843e;
            int i6 = iArr[bArr.length + iM5340g];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!c0551Ik.mo3987g(i3, bArr[iM5340g], (i2 - i4) + i6, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iM5340g++;
        }
        return true;
    }

    @Override // p000.C0551Ik
    public final int hashCode() {
        int i = this.f5118b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f10843e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f10844f;
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
        this.f5118b = i3;
        return i3;
    }

    @Override // p000.C0551Ik
    /* renamed from: i */
    public final C0551Ik mo3989i() {
        return new C0551Ik(mo3990j()).mo3989i();
    }

    @Override // p000.C0551Ik
    /* renamed from: j */
    public final byte[] mo3990j() {
        byte[] bArr = new byte[mo3983c()];
        byte[][] bArr2 = this.f10843e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f10844f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            AbstractC0576J8.m4181h(bArr2[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // p000.C0551Ik
    /* renamed from: l */
    public final void mo3992l(C6507nj c6507nj, int i) {
        O90.m5968f(c6507nj, "buffer");
        int iM5340g = ML1.m5340g(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f10844f;
            int i3 = iM5340g == 0 ? 0 : iArr[iM5340g - 1];
            int i4 = iArr[iM5340g] - i3;
            byte[][] bArr = this.f10843e;
            int i5 = iArr[bArr.length + iM5340g];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            JX0 jx0 = new JX0(bArr[iM5340g], i6, i6 + iMin, true, false);
            JX0 jx02 = c6507nj.f38487a;
            if (jx02 == null) {
                jx0.f5585g = jx0;
                jx0.f5584f = jx0;
                c6507nj.f38487a = jx0;
            } else {
                JX0 jx03 = jx02.f5585g;
                O90.m5965c(jx03);
                jx03.m4340b(jx0);
            }
            i2 += iMin;
            iM5340g++;
        }
        c6507nj.f38488b += i;
    }

    @Override // p000.C0551Ik
    public final String toString() {
        return new C0551Ik(mo3990j()).toString();
    }
}
