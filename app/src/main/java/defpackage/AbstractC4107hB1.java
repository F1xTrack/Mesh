package defpackage;

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
public abstract class AbstractC4107hB1 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(C8338zJ[] c8338zJArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C8338zJ c8338zJ : c8338zJArr) {
            length += ((((c8338zJ.g * 2) + 7) & (-8)) / 8) + (c8338zJ.e * 2) + c(c8338zJ.a, c8338zJ.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c8338zJ.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, AbstractC5647lB1.c)) {
            for (C8338zJ c8338zJ2 : c8338zJArr) {
                m(byteArrayOutputStream, c8338zJ2, c(c8338zJ2.a, c8338zJ2.b, bArr));
                o(byteArrayOutputStream, c8338zJ2);
                int[] iArr = c8338zJ2.h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    E02.g(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                n(byteArrayOutputStream, c8338zJ2);
            }
        } else {
            for (C8338zJ c8338zJ3 : c8338zJArr) {
                m(byteArrayOutputStream, c8338zJ3, c(c8338zJ3.a, c8338zJ3.b, bArr));
            }
            for (C8338zJ c8338zJ4 : c8338zJArr) {
                o(byteArrayOutputStream, c8338zJ4);
                int[] iArr2 = c8338zJ4.h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    E02.g(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                n(byteArrayOutputStream, c8338zJ4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String[] b(InterfaceC6636qN interfaceC6636qN) {
        long jD;
        long jD2;
        long jD3;
        long jD4;
        long j;
        long jD5;
        int i;
        long j2;
        long j3;
        long jD6;
        long j4;
        char c;
        long jD7;
        long j5;
        long jD8;
        int i2;
        long jD9;
        long jD10;
        long jD11;
        int i3 = 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jD12 = d(interfaceC6636qN, byteBufferAllocate, 0L);
        if (jD12 != 1179403647) {
            throw new C1943Yr0("file is not ELF: magic is 0x" + Long.toHexString(jD12) + ", it should be " + Long.toHexString(1179403647L));
        }
        e(interfaceC6636qN, byteBufferAllocate, 1, 4L);
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 1;
        e(interfaceC6636qN, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            jD = d(interfaceC6636qN, byteBufferAllocate, 28L);
        } else {
            e(interfaceC6636qN, byteBufferAllocate, 8, 32L);
            jD = byteBufferAllocate.getLong();
        }
        if (z) {
            e(interfaceC6636qN, byteBufferAllocate, 2, 44L);
            jD2 = byteBufferAllocate.getShort() & 65535;
        } else {
            e(interfaceC6636qN, byteBufferAllocate, 2, 56L);
            jD2 = byteBufferAllocate.getShort() & 65535;
        }
        e(interfaceC6636qN, byteBufferAllocate, 2, z ? 42L : 54L);
        int i4 = byteBufferAllocate.getShort() & 65535;
        if (jD2 == 65535) {
            if (z) {
                jD11 = d(interfaceC6636qN, byteBufferAllocate, 32L);
            } else {
                e(interfaceC6636qN, byteBufferAllocate, 8, 40L);
                jD11 = byteBufferAllocate.getLong();
            }
            jD2 = z ? d(interfaceC6636qN, byteBufferAllocate, jD11 + 28) : d(interfaceC6636qN, byteBufferAllocate, jD11 + 44);
        }
        long j6 = jD;
        long j7 = 0;
        while (true) {
            if (j7 >= jD2) {
                jD3 = 0;
                break;
            }
            if ((z ? d(interfaceC6636qN, byteBufferAllocate, j6) : d(interfaceC6636qN, byteBufferAllocate, j6)) != 2) {
                j6 += i4;
                j7++;
            } else if (z) {
                jD3 = d(interfaceC6636qN, byteBufferAllocate, j6 + 4);
            } else {
                e(interfaceC6636qN, byteBufferAllocate, 8, j6 + 8);
                jD3 = byteBufferAllocate.getLong();
            }
        }
        if (jD3 == 0) {
            throw new C1943Yr0("ELF file does not contain dynamic linking information");
        }
        long j8 = jD3;
        int i5 = 0;
        long j9 = 0;
        while (true) {
            if (z) {
                jD4 = d(interfaceC6636qN, byteBufferAllocate, j8);
            } else {
                e(interfaceC6636qN, byteBufferAllocate, i3, j8);
                jD4 = byteBufferAllocate.getLong();
            }
            char c2 = 65535;
            if (jD4 != 1) {
                j = jD3;
                if (jD4 == 5) {
                    if (z) {
                        jD5 = d(interfaceC6636qN, byteBufferAllocate, j8 + 4);
                    } else {
                        e(interfaceC6636qN, byteBufferAllocate, 8, j8 + 8);
                        jD5 = byteBufferAllocate.getLong();
                    }
                    j9 = jD5;
                }
            } else {
                if (i5 == Integer.MAX_VALUE) {
                    throw new C1943Yr0("malformed DT_NEEDED section");
                }
                i5++;
                j = jD3;
            }
            j8 += z ? 8L : 16L;
            if (jD4 != 0) {
                jD2 = jD2;
                jD3 = j;
                i3 = 8;
            } else {
                if (j9 == 0) {
                    throw new C1943Yr0("Dynamic section string-table not found");
                }
                long j10 = jD;
                int i6 = 0;
                while (true) {
                    if (i6 >= jD2) {
                        i = i5;
                        j2 = 0;
                        j3 = 0;
                        break;
                    }
                    if ((z ? d(interfaceC6636qN, byteBufferAllocate, j10) : d(interfaceC6636qN, byteBufferAllocate, j10)) == 1) {
                        if (z) {
                            j5 = jD2;
                            jD8 = d(interfaceC6636qN, byteBufferAllocate, j10 + 8);
                        } else {
                            j5 = jD2;
                            e(interfaceC6636qN, byteBufferAllocate, 8, j10 + 16);
                            jD8 = byteBufferAllocate.getLong();
                        }
                        if (z) {
                            jD9 = d(interfaceC6636qN, byteBufferAllocate, j10 + 20);
                            i2 = i4;
                            i = i5;
                        } else {
                            i2 = i4;
                            i = i5;
                            e(interfaceC6636qN, byteBufferAllocate, 8, j10 + 40);
                            jD9 = byteBufferAllocate.getLong();
                        }
                        if (jD8 > j9 || j9 >= jD9 + jD8) {
                            i4 = i2;
                        } else {
                            if (z) {
                                jD10 = d(interfaceC6636qN, byteBufferAllocate, j10 + 4);
                            } else {
                                e(interfaceC6636qN, byteBufferAllocate, 8, j10 + 8);
                                jD10 = byteBufferAllocate.getLong();
                            }
                            j3 = jD10 + (j9 - jD8);
                            j2 = 0;
                        }
                    } else {
                        i = i5;
                        j5 = jD2;
                    }
                    j10 += i4;
                    i6++;
                    i5 = i;
                    jD2 = j5;
                }
                if (j3 == j2) {
                    throw new C1943Yr0("did not find file offset of DT_STRTAB table");
                }
                int i7 = i;
                String[] strArr = new String[i7];
                long j11 = j;
                int i8 = 0;
                while (true) {
                    if (z) {
                        jD6 = d(interfaceC6636qN, byteBufferAllocate, j11);
                    } else {
                        e(interfaceC6636qN, byteBufferAllocate, 8, j11);
                        jD6 = byteBufferAllocate.getLong();
                    }
                    if (jD6 == 1) {
                        if (z) {
                            jD7 = d(interfaceC6636qN, byteBufferAllocate, j11 + 4);
                        } else {
                            e(interfaceC6636qN, byteBufferAllocate, 8, j11 + 8);
                            jD7 = byteBufferAllocate.getLong();
                        }
                        long j12 = jD7 + j3;
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            long j13 = j12 + 1;
                            j4 = j3;
                            e(interfaceC6636qN, byteBufferAllocate, 1, j12);
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
                            throw new C1943Yr0("malformed DT_NEEDED section");
                        }
                        i8++;
                    } else {
                        j4 = j3;
                        c = c2;
                    }
                    j11 += z ? 8L : 16L;
                    if (jD6 == 0) {
                        if (i8 == i7) {
                            return strArr;
                        }
                        throw new C1943Yr0("malformed DT_NEEDED section");
                    }
                    c2 = c;
                    j3 = j4;
                }
            }
        }
    }

    public static String c(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC5647lB1.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = AbstractC5647lB1.d;
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
        return AbstractC1705Vq.l(AbstractC8235ym.o(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
    }

    public static long d(InterfaceC6636qN interfaceC6636qN, ByteBuffer byteBuffer, long j) {
        e(interfaceC6636qN, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void e(InterfaceC6636qN interfaceC6636qN, ByteBuffer byteBuffer, int i, long j) {
        int iF;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iF = interfaceC6636qN.F(byteBuffer, j)) != -1) {
            j += iF;
        }
        if (byteBuffer.remaining() > 0) {
            throw new C1943Yr0("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    public static int[] f(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iE = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iE += (int) E02.e(byteArrayInputStream, 2);
            iArr[i2] = iE;
        }
        return iArr;
    }

    public static C8338zJ[] g(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C8338zJ[] c8338zJArr) throws IOException {
        byte[] bArr3 = AbstractC5647lB1.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, AbstractC5647lB1.g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iE = (int) E02.e(fileInputStream, 2);
            byte[] bArrD = E02.d(fileInputStream, (int) E02.e(fileInputStream, 4), (int) E02.e(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrD);
            try {
                C8338zJ[] c8338zJArrI = i(byteArrayInputStream, bArr2, iE, c8338zJArr);
                byteArrayInputStream.close();
                return c8338zJArrI;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(AbstractC5647lB1.a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iE2 = (int) E02.e(fileInputStream, 1);
        byte[] bArrD2 = E02.d(fileInputStream, (int) E02.e(fileInputStream, 4), (int) E02.e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrD2);
        try {
            C8338zJ[] c8338zJArrH = h(byteArrayInputStream2, iE2, c8338zJArr);
            byteArrayInputStream2.close();
            return c8338zJArrH;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C8338zJ[] h(ByteArrayInputStream byteArrayInputStream, int i, C8338zJ[] c8338zJArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C8338zJ[0];
        }
        if (i != c8338zJArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iE = (int) E02.e(byteArrayInputStream, 2);
            iArr[i2] = (int) E02.e(byteArrayInputStream, 2);
            strArr[i2] = new String(E02.c(byteArrayInputStream, iE), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C8338zJ c8338zJ = c8338zJArr[i3];
            if (!c8338zJ.b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c8338zJ.e = i4;
            c8338zJ.h = f(byteArrayInputStream, i4);
        }
        return c8338zJArr;
    }

    public static C8338zJ[] i(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C8338zJ[] c8338zJArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C8338zJ[0];
        }
        if (i != c8338zJArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            E02.e(byteArrayInputStream, 2);
            String str = new String(E02.c(byteArrayInputStream, (int) E02.e(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jE = E02.e(byteArrayInputStream, 4);
            int iE = (int) E02.e(byteArrayInputStream, 2);
            C8338zJ c8338zJ = null;
            if (c8338zJArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c8338zJArr.length) {
                        break;
                    }
                    if (c8338zJArr[i3].b.equals(strSubstring)) {
                        c8338zJ = c8338zJArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c8338zJ == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c8338zJ.d = jE;
            int[] iArrF = f(byteArrayInputStream, iE);
            if (Arrays.equals(bArr, AbstractC5647lB1.e)) {
                c8338zJ.e = iE;
                c8338zJ.h = iArrF;
            }
        }
        return c8338zJArr;
    }

    public static C8338zJ[] j(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC5647lB1.b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iE = (int) E02.e(fileInputStream, 1);
        byte[] bArrD = E02.d(fileInputStream, (int) E02.e(fileInputStream, 4), (int) E02.e(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrD);
        try {
            C8338zJ[] c8338zJArrK = k(byteArrayInputStream, str, iE);
            byteArrayInputStream.close();
            return c8338zJArrK;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C8338zJ[] k(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C8338zJ[0];
        }
        C8338zJ[] c8338zJArr = new C8338zJ[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iE = (int) E02.e(byteArrayInputStream, 2);
            int iE2 = (int) E02.e(byteArrayInputStream, 2);
            c8338zJArr[i2] = new C8338zJ(str, new String(E02.c(byteArrayInputStream, iE), StandardCharsets.UTF_8), E02.e(byteArrayInputStream, 4), iE2, (int) E02.e(byteArrayInputStream, 4), (int) E02.e(byteArrayInputStream, 4), new int[iE2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C8338zJ c8338zJ = c8338zJArr[i3];
            int iAvailable = byteArrayInputStream.available() - c8338zJ.f;
            int iE3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c8338zJ.i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iE3 += (int) E02.e(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iE3), 1);
                for (int iE4 = (int) E02.e(byteArrayInputStream, 2); iE4 > 0; iE4--) {
                    E02.e(byteArrayInputStream, 2);
                    int iE5 = (int) E02.e(byteArrayInputStream, 1);
                    if (iE5 != 6 && iE5 != 7) {
                        while (iE5 > 0) {
                            E02.e(byteArrayInputStream, 1);
                            for (int iE6 = (int) E02.e(byteArrayInputStream, 1); iE6 > 0; iE6--) {
                                E02.e(byteArrayInputStream, 2);
                            }
                            iE5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c8338zJ.h = f(byteArrayInputStream, c8338zJ.e);
            int i4 = c8338zJ.g;
            BitSet bitSetValueOf = BitSet.valueOf(E02.c(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
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
        return c8338zJArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean l(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C8338zJ[] c8338zJArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = AbstractC5647lB1.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = AbstractC5647lB1.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(c8338zJArr, bArr3);
                E02.f(byteArrayOutputStream, c8338zJArr.length, 1);
                E02.f(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = E02.a(bArrA);
                E02.f(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = AbstractC5647lB1.d;
            if (Arrays.equals(bArr, bArr4)) {
                E02.f(byteArrayOutputStream, c8338zJArr.length, 1);
                for (C8338zJ c8338zJ : c8338zJArr) {
                    int size = c8338zJ.i.size() * 4;
                    String strC = c(c8338zJ.a, c8338zJ.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    E02.g(byteArrayOutputStream, strC.getBytes(charset).length);
                    E02.g(byteArrayOutputStream, c8338zJ.h.length);
                    E02.f(byteArrayOutputStream, size, 4);
                    E02.f(byteArrayOutputStream, c8338zJ.c, 4);
                    byteArrayOutputStream.write(strC.getBytes(charset));
                    Iterator it = c8338zJ.i.keySet().iterator();
                    while (it.hasNext()) {
                        E02.g(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        E02.g(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c8338zJ.h) {
                        E02.g(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = AbstractC5647lB1.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(c8338zJArr, bArr5);
                E02.f(byteArrayOutputStream, c8338zJArr.length, 1);
                E02.f(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = E02.a(bArrA3);
                E02.f(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = AbstractC5647lB1.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            E02.g(byteArrayOutputStream, c8338zJArr.length);
            for (C8338zJ c8338zJ2 : c8338zJArr) {
                String strC2 = c(c8338zJ2.a, c8338zJ2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                E02.g(byteArrayOutputStream, strC2.getBytes(charset2).length);
                TreeMap treeMap = c8338zJ2.i;
                E02.g(byteArrayOutputStream, treeMap.size());
                E02.g(byteArrayOutputStream, c8338zJ2.h.length);
                E02.f(byteArrayOutputStream, c8338zJ2.c, 4);
                byteArrayOutputStream.write(strC2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    E02.g(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c8338zJ2.h) {
                    E02.g(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            E02.g(byteArrayOutputStream2, c8338zJArr.length);
            int i4 = 2;
            int i5 = 2;
            for (C8338zJ c8338zJ3 : c8338zJArr) {
                E02.f(byteArrayOutputStream2, c8338zJ3.c, 4);
                E02.f(byteArrayOutputStream2, c8338zJ3.d, 4);
                E02.f(byteArrayOutputStream2, c8338zJ3.g, 4);
                String strC3 = c(c8338zJ3.a, c8338zJ3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strC3.getBytes(charset3).length;
                E02.g(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strC3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C5576kp1 c5576kp1 = new C5576kp1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c5576kp1);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c8338zJArr.length) {
                try {
                    C8338zJ c8338zJ4 = c8338zJArr[i6];
                    E02.g(byteArrayOutputStream3, i6);
                    E02.g(byteArrayOutputStream3, c8338zJ4.e);
                    i7 = i7 + 4 + (c8338zJ4.e * 2);
                    int[] iArr = c8338zJ4.h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        E02.g(byteArrayOutputStream3, i9 - i8);
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
            C5576kp1 c5576kp12 = new C5576kp1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c5576kp12);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c8338zJArr.length) {
                try {
                    C8338zJ c8338zJ5 = c8338zJArr[i10];
                    Iterator it3 = c8338zJ5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        n(byteArrayOutputStream4, c8338zJ5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            o(byteArrayOutputStream4, c8338zJ5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            E02.g(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i12 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            E02.f(byteArrayOutputStream3, length4, 4);
                            E02.g(byteArrayOutputStream3, iIntValue);
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
            C5576kp1 c5576kp13 = new C5576kp1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c5576kp13);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            E02.f(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                C5576kp1 c5576kp14 = (C5576kp1) arrayList2.get(i13);
                int i14 = c5576kp14.a;
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
                E02.f(byteArrayOutputStream, j, 4);
                E02.f(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c5576kp14.b;
                if (c5576kp14.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = E02.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    E02.f(byteArrayOutputStream, bArrA5.length, 4);
                    E02.f(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    E02.f(byteArrayOutputStream, bArr7.length, 4);
                    E02.f(byteArrayOutputStream, 0L, 4);
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

    public static void m(ByteArrayOutputStream byteArrayOutputStream, C8338zJ c8338zJ, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        E02.g(byteArrayOutputStream, str.getBytes(charset).length);
        E02.g(byteArrayOutputStream, c8338zJ.e);
        E02.f(byteArrayOutputStream, c8338zJ.f, 4);
        E02.f(byteArrayOutputStream, c8338zJ.c, 4);
        E02.f(byteArrayOutputStream, c8338zJ.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, C8338zJ c8338zJ) throws IOException {
        byte[] bArr = new byte[(((c8338zJ.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c8338zJ.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c8338zJ.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void o(ByteArrayOutputStream byteArrayOutputStream, C8338zJ c8338zJ) throws IOException {
        int i = 0;
        for (Map.Entry entry : c8338zJ.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                E02.g(byteArrayOutputStream, iIntValue - i);
                E02.g(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
