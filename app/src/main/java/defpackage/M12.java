package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class M12 {
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a2 A[EDGE_INSN: B:85:0x00a2->B:54:0x00a2 BREAK  A[LOOP:2: B:25:0x004c->B:50:0x008e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M12.a(int, int, java.lang.String):java.net.InetAddress");
    }

    public static final String b(String str) {
        O90.f(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!AbstractC7538v51.p(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(str);
                O90.e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                O90.e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (O90.h(cCharAt, 31) <= 0 || O90.h(cCharAt, 127) >= 0 || AbstractC7538v51.z(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressA = (D51.o(str, "[", false) && D51.i(str, "]")) ? a(1, str.length() - 1, str) : a(0, str.length(), str);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressA.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        C6129nj c6129nj = new C6129nj();
        while (i < address.length) {
            if (i == i2) {
                c6129nj.r0(58);
                i += i5;
                if (i == 16) {
                    c6129nj.r0(58);
                }
            } else {
                if (i > 0) {
                    c6129nj.r0(58);
                }
                byte b = address[i];
                byte[] bArr = AbstractC0199Ch1.a;
                c6129nj.t0(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c6129nj.e0();
    }

    public static InterfaceC0877Kz1 c(InterfaceC2043Zy1 interfaceC2043Zy1, C1812Wz1 c1812Wz1, C6860rY0 c6860rY0, ArrayList arrayList) {
        String str = c1812Wz1.a;
        if (interfaceC2043Zy1.d(str)) {
            InterfaceC0877Kz1 interfaceC0877Kz1B = interfaceC2043Zy1.b(str);
            if (interfaceC0877Kz1B instanceof AbstractC4257hz1) {
                return ((AbstractC4257hz1) interfaceC0877Kz1B).a(c6860rY0, arrayList);
            }
            throw new IllegalArgumentException(AbstractC8235ym.i(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(AbstractC8235ym.v("Object has no function ", str));
        }
        AbstractC6955s22.l(1, "hasOwnProperty", arrayList);
        return interfaceC2043Zy1.d(((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0)).zzf()) ? InterfaceC0877Kz1.n1 : InterfaceC0877Kz1.o1;
    }
}
