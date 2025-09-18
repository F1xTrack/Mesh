package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: hB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9594hB1 {

    /* renamed from: a */
    public static final byte[] f28303a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f28304b = {112, 114, 109, 0};

    /* renamed from: a */
    public static byte[] m18769a(C7256zJ[] c7256zJArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C7256zJ c7256zJ : c7256zJArr) {
            length += ((((c7256zJ.f46783g * 2) + 7) & (-8)) / 8) + (c7256zJ.f46781e * 2) + m18771c(c7256zJ.f46777a, c7256zJ.f46778b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c7256zJ.f46782f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC10106lB1.f36947c)) {
            for (C7256zJ c7256zJ2 : c7256zJArr) {
                m18781m(byteArrayOutputStream, c7256zJ2, m18771c(c7256zJ2.f46777a, c7256zJ2.f46778b, bArr));
                m18783o(byteArrayOutputStream, c7256zJ2);
                int[] iArr = c7256zJ2.f46784h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    E02.m1980g(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m18782n(byteArrayOutputStream, c7256zJ2);
            }
        } else {
            for (C7256zJ c7256zJ3 : c7256zJArr) {
                m18781m(byteArrayOutputStream, c7256zJ3, m18771c(c7256zJ3.f46777a, c7256zJ3.f46778b, bArr));
            }
            for (C7256zJ c7256zJ4 : c7256zJArr) {
                m18783o(byteArrayOutputStream, c7256zJ4);
                int[] iArr2 = c7256zJ4.f46784h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    E02.m1980g(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m18782n(byteArrayOutputStream, c7256zJ4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* renamed from: b */
    public static String[] m18770b(InterfaceC6676qN interfaceC6676qN) {
        long jM18772d;
        long jM18772d2;
        long jM18772d3;
        long jM18772d4;
        long j;
        long jM18772d5;
        int i;
        long j2;
        long j3;
        long jM18772d6;
        long j4;
        char c;
        long jM18772d7;
        long j5;
        long jM18772d8;
        int i2;
        long jM18772d9;
        long jM18772d10;
        long jM18772d11;
        int i3 = 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jM18772d12 = m18772d(interfaceC6676qN, byteBufferAllocate, 0L);
        if (jM18772d12 != 1179403647) {
            throw new C8596Yr0("file is not ELF: magic is 0x" + Long.toHexString(jM18772d12) + ", it should be " + Long.toHexString(1179403647L));
        }
        m18773e(interfaceC6676qN, byteBufferAllocate, 1, 4L);
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 1;
        m18773e(interfaceC6676qN, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            jM18772d = m18772d(interfaceC6676qN, byteBufferAllocate, 28L);
        } else {
            m18773e(interfaceC6676qN, byteBufferAllocate, 8, 32L);
            jM18772d = byteBufferAllocate.getLong();
        }
        if (z) {
            m18773e(interfaceC6676qN, byteBufferAllocate, 2, 44L);
            jM18772d2 = byteBufferAllocate.getShort() & 65535;
        } else {
            m18773e(interfaceC6676qN, byteBufferAllocate, 2, 56L);
            jM18772d2 = byteBufferAllocate.getShort() & 65535;
        }
        m18773e(interfaceC6676qN, byteBufferAllocate, 2, z ? 42L : 54L);
        int i4 = byteBufferAllocate.getShort() & 65535;
        if (jM18772d2 == 65535) {
            if (z) {
                jM18772d11 = m18772d(interfaceC6676qN, byteBufferAllocate, 32L);
            } else {
                m18773e(interfaceC6676qN, byteBufferAllocate, 8, 40L);
                jM18772d11 = byteBufferAllocate.getLong();
            }
            jM18772d2 = z ? m18772d(interfaceC6676qN, byteBufferAllocate, jM18772d11 + 28) : m18772d(interfaceC6676qN, byteBufferAllocate, jM18772d11 + 44);
        }
        long j6 = jM18772d;
        long j7 = 0;
        while (true) {
            if (j7 >= jM18772d2) {
                jM18772d3 = 0;
                break;
            }
            if ((z ? m18772d(interfaceC6676qN, byteBufferAllocate, j6) : m18772d(interfaceC6676qN, byteBufferAllocate, j6)) != 2) {
                j6 += i4;
                j7++;
            } else if (z) {
                jM18772d3 = m18772d(interfaceC6676qN, byteBufferAllocate, j6 + 4);
            } else {
                m18773e(interfaceC6676qN, byteBufferAllocate, 8, j6 + 8);
                jM18772d3 = byteBufferAllocate.getLong();
            }
        }
        if (jM18772d3 == 0) {
            throw new C8596Yr0("ELF file does not contain dynamic linking information");
        }
        long j8 = jM18772d3;
        int i5 = 0;
        long j9 = 0;
        while (true) {
            if (z) {
                jM18772d4 = m18772d(interfaceC6676qN, byteBufferAllocate, j8);
            } else {
                m18773e(interfaceC6676qN, byteBufferAllocate, i3, j8);
                jM18772d4 = byteBufferAllocate.getLong();
            }
            char c2 = 65535;
            if (jM18772d4 != 1) {
                j = jM18772d3;
                if (jM18772d4 == 5) {
                    if (z) {
                        jM18772d5 = m18772d(interfaceC6676qN, byteBufferAllocate, j8 + 4);
                    } else {
                        m18773e(interfaceC6676qN, byteBufferAllocate, 8, j8 + 8);
                        jM18772d5 = byteBufferAllocate.getLong();
                    }
                    j9 = jM18772d5;
                }
            } else {
                if (i5 == Integer.MAX_VALUE) {
                    throw new C8596Yr0("malformed DT_NEEDED section");
                }
                i5++;
                j = jM18772d3;
            }
            j8 += z ? 8L : 16L;
            if (jM18772d4 != 0) {
                jM18772d2 = jM18772d2;
                jM18772d3 = j;
                i3 = 8;
            } else {
                if (j9 == 0) {
                    throw new C8596Yr0("Dynamic section string-table not found");
                }
                long j10 = jM18772d;
                int i6 = 0;
                while (true) {
                    if (i6 >= jM18772d2) {
                        i = i5;
                        j2 = 0;
                        j3 = 0;
                        break;
                    }
                    if ((z ? m18772d(interfaceC6676qN, byteBufferAllocate, j10) : m18772d(interfaceC6676qN, byteBufferAllocate, j10)) == 1) {
                        if (z) {
                            j5 = jM18772d2;
                            jM18772d8 = m18772d(interfaceC6676qN, byteBufferAllocate, j10 + 8);
                        } else {
                            j5 = jM18772d2;
                            m18773e(interfaceC6676qN, byteBufferAllocate, 8, j10 + 16);
                            jM18772d8 = byteBufferAllocate.getLong();
                        }
                        if (z) {
                            jM18772d9 = m18772d(interfaceC6676qN, byteBufferAllocate, j10 + 20);
                            i2 = i4;
                            i = i5;
                        } else {
                            i2 = i4;
                            i = i5;
                            m18773e(interfaceC6676qN, byteBufferAllocate, 8, j10 + 40);
                            jM18772d9 = byteBufferAllocate.getLong();
                        }
                        if (jM18772d8 > j9 || j9 >= jM18772d9 + jM18772d8) {
                            i4 = i2;
                        } else {
                            if (z) {
                                jM18772d10 = m18772d(interfaceC6676qN, byteBufferAllocate, j10 + 4);
                            } else {
                                m18773e(interfaceC6676qN, byteBufferAllocate, 8, j10 + 8);
                                jM18772d10 = byteBufferAllocate.getLong();
                            }
                            j3 = jM18772d10 + (j9 - jM18772d8);
                            j2 = 0;
                        }
                    } else {
                        i = i5;
                        j5 = jM18772d2;
                    }
                    j10 += i4;
                    i6++;
                    i5 = i;
                    jM18772d2 = j5;
                }
                if (j3 == j2) {
                    throw new C8596Yr0("did not find file offset of DT_STRTAB table");
                }
                int i7 = i;
                String[] strArr = new String[i7];
                long j11 = j;
                int i8 = 0;
                while (true) {
                    if (z) {
                        jM18772d6 = m18772d(interfaceC6676qN, byteBufferAllocate, j11);
                    } else {
                        m18773e(interfaceC6676qN, byteBufferAllocate, 8, j11);
                        jM18772d6 = byteBufferAllocate.getLong();
                    }
                    if (jM18772d6 == 1) {
                        if (z) {
                            jM18772d7 = m18772d(interfaceC6676qN, byteBufferAllocate, j11 + 4);
                        } else {
                            m18773e(interfaceC6676qN, byteBufferAllocate, 8, j11 + 8);
                            jM18772d7 = byteBufferAllocate.getLong();
                        }
                        long j12 = jM18772d7 + j3;
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            long j13 = j12 + 1;
                            j4 = j3;
                            m18773e(interfaceC6676qN, byteBufferAllocate, 1, j12);
                            short s = (short) (byteBufferAllocate.get() & 255);
                            if (s == 0) {
                                break;
                            }
                            sb.append((char) s);
                            j12 = j13;
                            j3 = j4;
                        }
                        strArr[i8] = sb.toString();
                        c = 65535;
                        if (i8 == Integer.MAX_VALUE) {
                            throw new C8596Yr0("malformed DT_NEEDED section");
                        }
                        i8++;
                    } else {
                        j4 = j3;
                        c = c2;
                    }
                    j11 += z ? 8L : 16L;
                    if (jM18772d6 == 0) {
                        if (i8 == i7) {
                            return strArr;
                        }
                        throw new C8596Yr0("malformed DT_NEEDED section");
                    }
                    c2 = c;
                    j3 = j4;
                }
            }
        }
    }

    /* renamed from: c */
    public static String m18771c(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC10106lB1.f36949e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC10106lB1.f36948d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            return "!".equals(obj) ? str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!") : StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj) ? str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AbstractC1374Vq.m8593l(AbstractC7222ym.m26238o(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
    }

    /* renamed from: d */
    public static long m18772d(InterfaceC6676qN interfaceC6676qN, ByteBuffer byteBuffer, long j) {
        m18773e(interfaceC6676qN, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    /* renamed from: e */
    public static void m18773e(InterfaceC6676qN interfaceC6676qN, ByteBuffer byteBuffer, int i, long j) {
        int iMo23993F;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iMo23993F = interfaceC6676qN.mo23993F(byteBuffer, j)) != -1) {
            j += iMo23993F;
        }
        if (byteBuffer.remaining() > 0) {
            throw new C8596Yr0("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    /* renamed from: f */
    public static int[] m18774f(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM1978e = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1978e += (int) E02.m1978e(byteArrayInputStream, 2);
            iArr[i2] = iM1978e;
        }
        return iArr;
    }

    /* renamed from: g */
    public static C7256zJ[] m18775g(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C7256zJ[] c7256zJArr) throws IOException {
        byte[] bArr3 = AbstractC10106lB1.f36950f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC10106lB1.f36951g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM1978e = (int) E02.m1978e(fileInputStream, 2);
            byte[] bArrM1977d = E02.m1977d(fileInputStream, (int) E02.m1978e(fileInputStream, 4), (int) E02.m1978e(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1977d);
            try {
                C7256zJ[] c7256zJArrM18777i = m18777i(byteArrayInputStream, bArr2, iM1978e, c7256zJArr);
                byteArrayInputStream.close();
                return c7256zJArrM18777i;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC10106lB1.f36945a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM1978e2 = (int) E02.m1978e(fileInputStream, 1);
        byte[] bArrM1977d2 = E02.m1977d(fileInputStream, (int) E02.m1978e(fileInputStream, 4), (int) E02.m1978e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM1977d2);
        try {
            C7256zJ[] c7256zJArrM18776h = m18776h(byteArrayInputStream2, iM1978e2, c7256zJArr);
            byteArrayInputStream2.close();
            return c7256zJArrM18776h;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: h */
    public static C7256zJ[] m18776h(ByteArrayInputStream byteArrayInputStream, int i, C7256zJ[] c7256zJArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C7256zJ[0];
        }
        if (i != c7256zJArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1978e = (int) E02.m1978e(byteArrayInputStream, 2);
            iArr[i2] = (int) E02.m1978e(byteArrayInputStream, 2);
            strArr[i2] = new String(E02.m1976c(byteArrayInputStream, iM1978e), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C7256zJ c7256zJ = c7256zJArr[i3];
            if (!c7256zJ.f46778b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c7256zJ.f46781e = i4;
            c7256zJ.f46784h = m18774f(byteArrayInputStream, i4);
        }
        return c7256zJArr;
    }

    /* renamed from: i */
    public static C7256zJ[] m18777i(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C7256zJ[] c7256zJArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C7256zJ[0];
        }
        if (i != c7256zJArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            E02.m1978e(byteArrayInputStream, 2);
            String str = new String(E02.m1976c(byteArrayInputStream, (int) E02.m1978e(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM1978e = E02.m1978e(byteArrayInputStream, 4);
            int iM1978e = (int) E02.m1978e(byteArrayInputStream, 2);
            C7256zJ c7256zJ = null;
            if (c7256zJArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c7256zJArr.length) {
                        break;
                    }
                    if (c7256zJArr[i3].f46778b.equals(strSubstring)) {
                        c7256zJ = c7256zJArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c7256zJ == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c7256zJ.f46780d = jM1978e;
            int[] iArrM18774f = m18774f(byteArrayInputStream, iM1978e);
            if (Arrays.equals(bArr, AbstractC10106lB1.f36949e)) {
                c7256zJ.f46781e = iM1978e;
                c7256zJ.f46784h = iArrM18774f;
            }
        }
        return c7256zJArr;
    }

    /* renamed from: j */
    public static C7256zJ[] m18778j(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC10106lB1.f36946b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM1978e = (int) E02.m1978e(fileInputStream, 1);
        byte[] bArrM1977d = E02.m1977d(fileInputStream, (int) E02.m1978e(fileInputStream, 4), (int) E02.m1978e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM1977d);
        try {
            C7256zJ[] c7256zJArrM18779k = m18779k(byteArrayInputStream, str, iM1978e);
            byteArrayInputStream.close();
            return c7256zJArrM18779k;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static C7256zJ[] m18779k(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C7256zJ[0];
        }
        C7256zJ[] c7256zJArr = new C7256zJ[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM1978e = (int) E02.m1978e(byteArrayInputStream, 2);
            int iM1978e2 = (int) E02.m1978e(byteArrayInputStream, 2);
            c7256zJArr[i2] = new C7256zJ(str, new String(E02.m1976c(byteArrayInputStream, iM1978e), StandardCharsets.UTF_8), E02.m1978e(byteArrayInputStream, 4), iM1978e2, (int) E02.m1978e(byteArrayInputStream, 4), (int) E02.m1978e(byteArrayInputStream, 4), new int[iM1978e2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C7256zJ c7256zJ = c7256zJArr[i3];
            int iAvailable = byteArrayInputStream.available() - c7256zJ.f46782f;
            int iM1978e3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c7256zJ.f46785i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM1978e3 += (int) E02.m1978e(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM1978e3), 1);
                for (int iM1978e4 = (int) E02.m1978e(byteArrayInputStream, 2); iM1978e4 > 0; iM1978e4--) {
                    E02.m1978e(byteArrayInputStream, 2);
                    int iM1978e5 = (int) E02.m1978e(byteArrayInputStream, 1);
                    if (iM1978e5 != 6 && iM1978e5 != 7) {
                        while (iM1978e5 > 0) {
                            E02.m1978e(byteArrayInputStream, 1);
                            for (int iM1978e6 = (int) E02.m1978e(byteArrayInputStream, 1); iM1978e6 > 0; iM1978e6--) {
                                E02.m1978e(byteArrayInputStream, 2);
                            }
                            iM1978e5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c7256zJ.f46784h = m18774f(byteArrayInputStream, c7256zJ.f46781e);
            int i4 = c7256zJ.f46783g;
            BitSet bitSetValueOf = BitSet.valueOf(E02.m1976c(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c7256zJArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: l */
    public static boolean m18780l(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C7256zJ[] c7256zJArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC10106lB1.f36945a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC10106lB1.f36946b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM18769a = m18769a(c7256zJArr, bArr3);
                E02.m1979f(byteArrayOutputStream, c7256zJArr.length, 1);
                E02.m1979f(byteArrayOutputStream, bArrM18769a.length, 4);
                byte[] bArrM1974a = E02.m1974a(bArrM18769a);
                E02.m1979f(byteArrayOutputStream, bArrM1974a.length, 4);
                byteArrayOutputStream.write(bArrM1974a);
                return true;
            }
            byte[] bArr4 = AbstractC10106lB1.f36948d;
            if (Arrays.equals(bArr, bArr4)) {
                E02.m1979f(byteArrayOutputStream, c7256zJArr.length, 1);
                for (C7256zJ c7256zJ : c7256zJArr) {
                    int size = c7256zJ.f46785i.size() * 4;
                    String strM18771c = m18771c(c7256zJ.f46777a, c7256zJ.f46778b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    E02.m1980g(byteArrayOutputStream, strM18771c.getBytes(charset).length);
                    E02.m1980g(byteArrayOutputStream, c7256zJ.f46784h.length);
                    E02.m1979f(byteArrayOutputStream, size, 4);
                    E02.m1979f(byteArrayOutputStream, c7256zJ.f46779c, 4);
                    byteArrayOutputStream.write(strM18771c.getBytes(charset));
                    Iterator it = c7256zJ.f46785i.keySet().iterator();
                    while (it.hasNext()) {
                        E02.m1980g(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        E02.m1980g(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c7256zJ.f46784h) {
                        E02.m1980g(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC10106lB1.f36947c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM18769a2 = m18769a(c7256zJArr, bArr5);
                E02.m1979f(byteArrayOutputStream, c7256zJArr.length, 1);
                E02.m1979f(byteArrayOutputStream, bArrM18769a2.length, 4);
                byte[] bArrM1974a2 = E02.m1974a(bArrM18769a2);
                E02.m1979f(byteArrayOutputStream, bArrM1974a2.length, 4);
                byteArrayOutputStream.write(bArrM1974a2);
                return true;
            }
            byte[] bArr6 = AbstractC10106lB1.f36949e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            E02.m1980g(byteArrayOutputStream, c7256zJArr.length);
            for (C7256zJ c7256zJ2 : c7256zJArr) {
                String strM18771c2 = m18771c(c7256zJ2.f46777a, c7256zJ2.f46778b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                E02.m1980g(byteArrayOutputStream, strM18771c2.getBytes(charset2).length);
                TreeMap treeMap = c7256zJ2.f46785i;
                E02.m1980g(byteArrayOutputStream, treeMap.size());
                E02.m1980g(byteArrayOutputStream, c7256zJ2.f46784h.length);
                E02.m1979f(byteArrayOutputStream, c7256zJ2.f46779c, 4);
                byteArrayOutputStream.write(strM18771c2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    E02.m1980g(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c7256zJ2.f46784h) {
                    E02.m1980g(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            E02.m1980g(byteArrayOutputStream2, c7256zJArr.length);
            int i4 = 2;
            int i5 = 2;
            for (C7256zJ c7256zJ3 : c7256zJArr) {
                E02.m1979f(byteArrayOutputStream2, c7256zJ3.f46779c, 4);
                E02.m1979f(byteArrayOutputStream2, c7256zJ3.f46780d, 4);
                E02.m1979f(byteArrayOutputStream2, c7256zJ3.f46783g, 4);
                String strM18771c3 = m18771c(c7256zJ3.f46777a, c7256zJ3.f46778b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM18771c3.getBytes(charset3).length;
                E02.m1980g(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM18771c3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C10058kp1 c10058kp1 = new C10058kp1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c10058kp1);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c7256zJArr.length) {
                try {
                    C7256zJ c7256zJ4 = c7256zJArr[i6];
                    E02.m1980g(byteArrayOutputStream3, i6);
                    E02.m1980g(byteArrayOutputStream3, c7256zJ4.f46781e);
                    i7 = i7 + 4 + (c7256zJ4.f46781e * 2);
                    int[] iArr = c7256zJ4.f46784h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        E02.m1980g(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C10058kp1 c10058kp12 = new C10058kp1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c10058kp12);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c7256zJArr.length) {
                try {
                    C7256zJ c7256zJ5 = c7256zJArr[i10];
                    Iterator it3 = c7256zJ5.f46785i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m18782n(byteArrayOutputStream4, c7256zJ5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m18783o(byteArrayOutputStream4, c7256zJ5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            E02.m1980g(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            E02.m1979f(byteArrayOutputStream3, length4, 4);
                            E02.m1980g(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i12 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                            i4 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            C10058kp1 c10058kp13 = new C10058kp1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c10058kp13);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            E02.m1979f(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                C10058kp1 c10058kp14 = (C10058kp1) arrayList2.get(i13);
                int i14 = c10058kp14.f36715a;
                if (i14 == 1) {
                    j = 0;
                } else if (i14 == 2) {
                    j = 1;
                } else if (i14 == 3) {
                    j = 2;
                } else if (i14 == 4) {
                    j = 3;
                } else {
                    if (i14 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                E02.m1979f(byteArrayOutputStream, j, 4);
                E02.m1979f(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c10058kp14.f36716b;
                if (c10058kp14.f36717c) {
                    long length5 = bArr7.length;
                    byte[] bArrM1974a3 = E02.m1974a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM1974a3);
                    E02.m1979f(byteArrayOutputStream, bArrM1974a3.length, 4);
                    E02.m1979f(byteArrayOutputStream, length5, 4);
                    length = bArrM1974a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    E02.m1979f(byteArrayOutputStream, bArr7.length, 4);
                    E02.m1979f(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: m */
    public static void m18781m(ByteArrayOutputStream byteArrayOutputStream, C7256zJ c7256zJ, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        E02.m1980g(byteArrayOutputStream, str.getBytes(charset).length);
        E02.m1980g(byteArrayOutputStream, c7256zJ.f46781e);
        E02.m1979f(byteArrayOutputStream, c7256zJ.f46782f, 4);
        E02.m1979f(byteArrayOutputStream, c7256zJ.f46779c, 4);
        E02.m1979f(byteArrayOutputStream, c7256zJ.f46783g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: n */
    public static void m18782n(ByteArrayOutputStream byteArrayOutputStream, C7256zJ c7256zJ) throws IOException {
        byte[] bArr = new byte[(((c7256zJ.f46783g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c7256zJ.f46785i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c7256zJ.f46783g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: o */
    public static void m18783o(ByteArrayOutputStream byteArrayOutputStream, C7256zJ c7256zJ) throws IOException {
        int i = 0;
        for (Map.Entry entry : c7256zJ.f46785i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                E02.m1980g(byteArrayOutputStream, iIntValue - i);
                E02.m1980g(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
