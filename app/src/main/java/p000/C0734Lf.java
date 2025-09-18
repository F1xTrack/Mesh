package p000;

/* renamed from: Lf */
/* loaded from: classes2.dex */
public final class C0734Lf extends C0672Kf {
    /* renamed from: c */
    public static C0734Lf m5051c(byte[] bArr) {
        int i;
        String str;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i2 = length / 3;
            int i3 = i2 * 3;
            if (length == 0) {
                i = 0;
            } else {
                i = i2 << 2;
                int i4 = length % 3;
                if (i4 != 0) {
                    i = i + i4 + 1;
                }
            }
            byte[] bArr2 = new byte[i];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                int i7 = i5 + 2;
                int i8 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16);
                i5 += 3;
                int i9 = i8 | (bArr[i7] & 255);
                bArr2[i6] = AbstractC10516oO1.m23376a((i9 >>> 18) & 63);
                bArr2[i6 + 1] = AbstractC10516oO1.m23376a((i9 >>> 12) & 63);
                int i10 = i6 + 3;
                bArr2[i6 + 2] = AbstractC10516oO1.m23376a((i9 >>> 6) & 63);
                i6 += 4;
                bArr2[i10] = AbstractC10516oO1.m23376a(i9 & 63);
            }
            int i11 = length - i3;
            if (i11 > 0) {
                int i12 = ((bArr[i3] & 255) << 10) | (i11 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
                if (i11 == 2) {
                    bArr2[i - 3] = AbstractC10516oO1.m23376a(i12 >> 12);
                    bArr2[i - 2] = AbstractC10516oO1.m23376a((i12 >>> 6) & 63);
                    bArr2[i - 1] = AbstractC10516oO1.m23376a(i12 & 63);
                } else {
                    bArr2[i - 2] = AbstractC10516oO1.m23376a(i12 >> 12);
                    bArr2[i - 1] = AbstractC10516oO1.m23376a((i12 >>> 6) & 63);
                }
            }
            str = new String(bArr2, AbstractC9964k41.f36286a);
        }
        return new C0734Lf(str);
    }

    @Override // p000.C0672Kf
    public final boolean equals(Object obj) {
        if (obj instanceof C0734Lf) {
            if (this.f6248a.equals(((C0672Kf) obj).f6248a)) {
                return true;
            }
        }
        return false;
    }
}
