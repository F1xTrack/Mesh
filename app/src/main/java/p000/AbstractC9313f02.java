package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f02 */
/* loaded from: classes.dex */
public abstract class AbstractC9313f02 {
    /* renamed from: a */
    public static final long m18148a(long j) {
        long j2 = (j << 1) + 1;
        int i = C6547oM.f38966d;
        int i2 = AbstractC6612pM.f40031a;
        return j2;
    }

    /* renamed from: b */
    public static byte[] m18149b(InputStream inputStream) throws IOException {
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

    /* renamed from: c */
    public static final long m18150c(double d, EnumC6738rM enumC6738rM) {
        O90.m5968f(enumC6738rM, "unit");
        double dM18377a = AbstractC9441g02.m18377a(d, enumC6738rM, EnumC6738rM.f41609b);
        if (Double.isNaN(dM18377a)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        if (Double.isNaN(dM18377a)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound = Math.round(dM18377a);
        if (-4611686018426999999L <= jRound && jRound < 4611686018427000000L) {
            long j = jRound << 1;
            int i = C6547oM.f38966d;
            int i2 = AbstractC6612pM.f40031a;
            return j;
        }
        double dM18377a2 = AbstractC9441g02.m18377a(d, enumC6738rM, EnumC6738rM.f41610c);
        if (Double.isNaN(dM18377a2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        long jRound2 = Math.round(dM18377a2);
        if (-4611686018426L > jRound2 || jRound2 >= 4611686018427L) {
            return m18148a(AbstractC10132lO1.m22419d(jRound2, -4611686018427387903L, 4611686018427387903L));
        }
        long j2 = (jRound2 * 1000000) << 1;
        int i3 = C6547oM.f38966d;
        int i4 = AbstractC6612pM.f40031a;
        return j2;
    }

    /* renamed from: d */
    public static final long m18151d(int i, EnumC6738rM enumC6738rM) {
        O90.m5968f(enumC6738rM, "unit");
        if (enumC6738rM.compareTo(EnumC6738rM.f41611d) > 0) {
            return m18152e(i, enumC6738rM);
        }
        long jM18378b = AbstractC9441g02.m18378b(i, enumC6738rM, EnumC6738rM.f41609b) << 1;
        int i2 = C6547oM.f38966d;
        int i3 = AbstractC6612pM.f40031a;
        return jM18378b;
    }

    /* renamed from: e */
    public static final long m18152e(long j, EnumC6738rM enumC6738rM) {
        O90.m5968f(enumC6738rM, "unit");
        EnumC6738rM enumC6738rM2 = EnumC6738rM.f41609b;
        long jM18378b = AbstractC9441g02.m18378b(4611686018426999999L, enumC6738rM2, enumC6738rM);
        if ((-jM18378b) > j || j > jM18378b) {
            EnumC6738rM enumC6738rM3 = EnumC6738rM.f41610c;
            O90.m5968f(enumC6738rM3, "targetUnit");
            return m18148a(AbstractC10132lO1.m22419d(enumC6738rM3.f41616a.convert(j, enumC6738rM.f41616a), -4611686018427387903L, 4611686018427387903L));
        }
        long jM18378b2 = AbstractC9441g02.m18378b(j, enumC6738rM, enumC6738rM2) << 1;
        int i = C6547oM.f38966d;
        int i2 = AbstractC6612pM.f40031a;
        return jM18378b2;
    }
}
