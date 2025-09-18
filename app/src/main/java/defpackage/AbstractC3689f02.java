package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f02 */
/* loaded from: classes.dex */
public abstract class AbstractC3689f02 {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = C6251oM.d;
        int i2 = AbstractC6442pM.a;
        return j2;
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final long c(double d, EnumC6823rM enumC6823rM) {
        O90.f(enumC6823rM, "unit");
        double dA = AbstractC3880g02.a(d, enumC6823rM, EnumC6823rM.b);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dA);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            long j = jRound << 1;
            int i = C6251oM.d;
            int i2 = AbstractC6442pM.a;
            return j;
        }
        double dA2 = AbstractC3880g02.a(d, enumC6823rM, EnumC6823rM.c);
        if (Double.isNaN(dA2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound2 = Math.round(dA2);
        if (-4611686018426L > jRound2 || jRound2 >= 4611686018427L) {
            return a(AbstractC5686lO1.d(jRound2, -4611686018427387903L, 4611686018427387903L));
        }
        long j2 = (jRound2 * 1000000) << 1;
        int i3 = C6251oM.d;
        int i4 = AbstractC6442pM.a;
        return j2;
    }

    public static final long d(int i, EnumC6823rM enumC6823rM) {
        O90.f(enumC6823rM, "unit");
        if (enumC6823rM.compareTo(EnumC6823rM.d) > 0) {
            return e(i, enumC6823rM);
        }
        long jB = AbstractC3880g02.b(i, enumC6823rM, EnumC6823rM.b) << 1;
        int i2 = C6251oM.d;
        int i3 = AbstractC6442pM.a;
        return jB;
    }

    public static final long e(long j, EnumC6823rM enumC6823rM) {
        O90.f(enumC6823rM, "unit");
        EnumC6823rM enumC6823rM2 = EnumC6823rM.b;
        long jB = AbstractC3880g02.b(4611686018426999999L, enumC6823rM2, enumC6823rM);
        if ((-jB) > j || j > jB) {
            EnumC6823rM enumC6823rM3 = EnumC6823rM.c;
            O90.f(enumC6823rM3, "targetUnit");
            return a(AbstractC5686lO1.d(enumC6823rM3.a.convert(j, enumC6823rM.a), -4611686018427387903L, 4611686018427387903L));
        }
        long jB2 = AbstractC3880g02.b(j, enumC6823rM, enumC6823rM2) << 1;
        int i = C6251oM.d;
        int i2 = AbstractC6442pM.a;
        return jB2;
    }
}
