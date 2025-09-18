package defpackage;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: Kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0815Kf implements Serializable {
    public final String a;

    public C0815Kf(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.a = str;
    }

    public final byte[] a() {
        char c;
        String str = this.a;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(AbstractC5435k41.a);
        int length = bytes.length;
        long j = (length * 6) >> 3;
        int i = (int) j;
        if (i != j) {
            throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bytes.length) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < 4 && i2 < length) {
                int i6 = i2 + 1;
                byte b = bytes[i2];
                int iJ = AbstractC6259oO1.j(b, 64) & AbstractC6259oO1.k(b, 91);
                int iJ2 = AbstractC6259oO1.j(b, 96) & AbstractC6259oO1.k(b, 123);
                int iJ3 = AbstractC6259oO1.j(b, 47) & AbstractC6259oO1.k(b, 58);
                int i7 = AbstractC6259oO1.i(b, 43) | AbstractC6259oO1.i(b, 45);
                int i8 = AbstractC6259oO1.i(b, 47) | AbstractC6259oO1.i(b, 95);
                byte[] bArr2 = bytes;
                int iL = AbstractC6259oO1.l(iJ2, b - 71, 0) | AbstractC6259oO1.l(iJ, b - 65, 0) | AbstractC6259oO1.l(iJ3, b + 4, 0) | AbstractC6259oO1.l(i7, 62, 0) | AbstractC6259oO1.l(i8, 63, 0) | AbstractC6259oO1.l(iJ | iJ2 | iJ3 | i7 | i8, 0, -1);
                if (iL >= 0) {
                    i5 |= iL << (18 - (i4 * 6));
                    i4++;
                }
                i2 = i6;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i4 >= 2) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) (i5 >> 16);
                c = 3;
                if (i4 >= 3) {
                    int i10 = i3 + 2;
                    bArr[i9] = (byte) (i5 >> 8);
                    if (i4 >= 4) {
                        i3 += 3;
                        bArr[i10] = (byte) i5;
                    } else {
                        i3 = i10;
                    }
                } else {
                    i3 = i9;
                }
            } else {
                c = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i3);
    }

    public final BigInteger b() {
        return new BigInteger(1, a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0815Kf) {
            if (this.a.equals(((C0815Kf) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
