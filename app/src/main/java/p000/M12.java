package p000;

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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress m5213a(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.M12.m5213a(int, int, java.lang.String):java.net.InetAddress");
    }

    /* renamed from: b */
    public static final String m5214b(String str) {
        O90.m5968f(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!AbstractC11374v51.m25351p(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            try {
                String ascii = IDN.toASCII(str);
                O90.m5967e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                O90.m5967e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = lowerCase.charAt(i3);
                    if (O90.m5970h(cCharAt, 31) <= 0 || O90.m5970h(cCharAt, 127) >= 0 || AbstractC11374v51.m25361z(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM5213a = (D51.m1556o(str, "[", false) && D51.m1550i(str, "]")) ? m5213a(1, str.length() - 1, str) : m5213a(0, str.length(), str);
        if (inetAddressM5213a == null) {
            return null;
        }
        byte[] address = inetAddressM5213a.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM5213a.getHostAddress();
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
        C6507nj c6507nj = new C6507nj();
        while (i < address.length) {
            if (i == i2) {
                c6507nj.m23195r0(58);
                i += i5;
                if (i == 16) {
                    c6507nj.m23195r0(58);
                }
            } else {
                if (i > 0) {
                    c6507nj.m23195r0(58);
                }
                byte b = address[i];
                byte[] bArr = AbstractC7433Ch1.f1577a;
                c6507nj.m23197t0(((b & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c6507nj.m23183e0();
    }

    /* renamed from: c */
    public static InterfaceC7885Kz1 m5215c(InterfaceC8663Zy1 interfaceC8663Zy1, C8509Wz1 c8509Wz1, C10919rY0 c10919rY0, ArrayList arrayList) {
        String str = c8509Wz1.f13472a;
        if (interfaceC8663Zy1.mo1957d(str)) {
            InterfaceC7885Kz1 interfaceC7885Kz1Mo1956b = interfaceC8663Zy1.mo1956b(str);
            if (interfaceC7885Kz1Mo1956b instanceof AbstractC9694hz1) {
                return ((AbstractC9694hz1) interfaceC7885Kz1Mo1956b).mo6842a(c10919rY0, arrayList);
            }
            throw new IllegalArgumentException(AbstractC7222ym.m26232i(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(AbstractC7222ym.m26245v("Object has no function ", str));
        }
        AbstractC10983s22.m24590l(1, "hasOwnProperty", arrayList);
        return interfaceC8663Zy1.mo1957d(((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0)).zzf()) ? InterfaceC7885Kz1.f6422n1 : InterfaceC7885Kz1.f6423o1;
    }
}
