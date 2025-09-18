package p000;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: Kf */
/* loaded from: classes2.dex */
public class C0672Kf implements Serializable {

    /* renamed from: a */
    public final String f6248a;

    public C0672Kf(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.f6248a = str;
    }

    /* renamed from: a */
    public final byte[] m4698a() {
        char c;
        String str = this.f6248a;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(AbstractC9964k41.f36286a);
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
                int iM23385j = AbstractC10516oO1.m23385j(b, 64) & AbstractC10516oO1.m23386k(b, 91);
                int iM23385j2 = AbstractC10516oO1.m23385j(b, 96) & AbstractC10516oO1.m23386k(b, 123);
                int iM23385j3 = AbstractC10516oO1.m23385j(b, 47) & AbstractC10516oO1.m23386k(b, 58);
                int iM23384i = AbstractC10516oO1.m23384i(b, 43) | AbstractC10516oO1.m23384i(b, 45);
                int iM23384i2 = AbstractC10516oO1.m23384i(b, 47) | AbstractC10516oO1.m23384i(b, 95);
                byte[] bArr2 = bytes;
                int iM23387l = AbstractC10516oO1.m23387l(iM23385j2, b - 71, 0) | AbstractC10516oO1.m23387l(iM23385j, b - 65, 0) | AbstractC10516oO1.m23387l(iM23385j3, b + 4, 0) | AbstractC10516oO1.m23387l(iM23384i, 62, 0) | AbstractC10516oO1.m23387l(iM23384i2, 63, 0) | AbstractC10516oO1.m23387l(iM23385j | iM23385j2 | iM23385j3 | iM23384i | iM23384i2, 0, -1);
                if (iM23387l >= 0) {
                    i5 |= iM23387l << (18 - (i4 * 6));
                    i4++;
                }
                i2 = i6;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i4 >= 2) {
                int i7 = i3 + 1;
                bArr[i3] = (byte) (i5 >> 16);
                c = 3;
                if (i4 >= 3) {
                    int i8 = i3 + 2;
                    bArr[i7] = (byte) (i5 >> 8);
                    if (i4 >= 4) {
                        i3 += 3;
                        bArr[i8] = (byte) i5;
                    } else {
                        i3 = i8;
                    }
                } else {
                    i3 = i7;
                }
            } else {
                c = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i3);
    }

    /* renamed from: b */
    public final BigInteger m4699b() {
        return new BigInteger(1, m4698a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0672Kf) {
            if (this.f6248a.equals(((C0672Kf) obj).f6248a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6248a.hashCode();
    }

    public final String toString() {
        return this.f6248a;
    }
}
