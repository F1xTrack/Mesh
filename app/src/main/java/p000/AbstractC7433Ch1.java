package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: Ch1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7433Ch1 {

    /* renamed from: a */
    public static final byte[] f1577a;

    /* renamed from: b */
    public static final K20 f1578b = K12.m4522c(new String[0]);

    /* renamed from: c */
    public static final HN0 f1579c;

    /* renamed from: d */
    public static final C7778Iy0 f1580d;

    /* renamed from: e */
    public static final TimeZone f1581e;

    /* renamed from: f */
    public static final C8978cQ0 f1582f;

    /* renamed from: g */
    public static final String f1583g;

    static {
        byte[] bArr = new byte[0];
        f1577a = bArr;
        C6507nj c6507nj = new C6507nj();
        c6507nj.m23193p0(bArr);
        long j = 0;
        f1579c = new HN0(null, j, c6507nj, 1);
        m1274c(j, j, j);
        C0551Ik c0551Ik = C0551Ik.f5116d;
        f1580d = IJ1.m3815b(C1210TE.m7630C("efbbbf"), C1210TE.m7630C("feff"), C1210TE.m7630C("fffe"), C1210TE.m7630C("0000ffff"), C1210TE.m7630C("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        O90.m5965c(timeZone);
        f1581e = timeZone;
        f1582f = new C8978cQ0("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f1583g = AbstractC11374v51.m25336K("Client", AbstractC11374v51.m25335J("okhttp3.", C10585ox0.class.getName()));
    }

    /* renamed from: A */
    public static final String m1271A(int i, int i2, String str) {
        int iM1286o = m1286o(i, i2, str);
        String strSubstring = str.substring(iM1286o, m1287p(iM1286o, i2, str));
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: a */
    public static final boolean m1272a(D40 d40, D40 d402) {
        O90.m5968f(d40, "<this>");
        O90.m5968f(d402, "other");
        return O90.m5963a(d40.f1831d, d402.f1831d) && d40.f1832e == d402.f1832e && O90.m5963a(d40.f1828a, d402.f1828a);
    }

    /* renamed from: b */
    public static final int m1273b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    /* renamed from: c */
    public static final void m1274c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: d */
    public static final void m1275d(Closeable closeable) throws IOException {
        O90.m5968f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final void m1276e(Socket socket) throws IOException {
        O90.m5968f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!O90.m5963a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static final int m1277f(int i, String str, int i2, String str2) {
        O90.m5968f(str, "<this>");
        while (i < i2) {
            if (AbstractC11374v51.m25352q(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: g */
    public static final int m1278g(String str, char c, int i, int i2) {
        O90.m5968f(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: h */
    public static /* synthetic */ int m1279h(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m1278g(str, c, i, i2);
    }

    /* renamed from: i */
    public static final boolean m1280i(U21 u21, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "timeUnit");
        try {
            return m1293v(u21, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static final String m1281j(String str, Object... objArr) {
        O90.m5968f(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: k */
    public static final boolean m1282k(String[] strArr, String[] strArr2, Comparator comparator) {
        O90.m5968f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C6653q0 c6653q0M3386a = HN1.m3386a(strArr2);
                while (c6653q0M3386a.hasNext()) {
                    if (comparator.compare(str, (String) c6653q0M3386a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final long m1283l(HS0 hs0) {
        String strM4524b = hs0.f4300f.m4524b("Content-Length");
        if (strM4524b == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM4524b);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: m */
    public static final List m1284m(Object... objArr) {
        O90.m5968f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC7230yu.m26275f(Arrays.copyOf(objArr2, objArr2.length)));
        O90.m5967e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    /* renamed from: n */
    public static final int m1285n(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (O90.m5970h(cCharAt, 31) <= 0 || O90.m5970h(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public static final int m1286o(int i, int i2, String str) {
        O90.m5968f(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: p */
    public static final int m1287p(int i, int i2, String str) {
        O90.m5968f(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* renamed from: q */
    public static final String[] m1288q(String[] strArr, String[] strArr2, Comparator comparator) {
        O90.m5968f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: r */
    public static final boolean m1289r(String str) {
        O90.m5968f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: s */
    public static final int m1290s(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: t */
    public static final Charset m1291t(InterfaceC0676Kj interfaceC0676Kj, Charset charset) {
        Charset charsetForName;
        O90.m5968f(interfaceC0676Kj, "<this>");
        O90.m5968f(charset, "default");
        int iMo4702B = interfaceC0676Kj.mo4702B(f1580d);
        if (iMo4702B == -1) {
            return charset;
        }
        if (iMo4702B == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            O90.m5967e(charset2, "UTF_8");
            return charset2;
        }
        if (iMo4702B == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            O90.m5967e(charset3, "UTF_16BE");
            return charset3;
        }
        if (iMo4702B == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            O90.m5967e(charset4, "UTF_16LE");
            return charset4;
        }
        if (iMo4702B == 3) {
            Charset charset5 = AbstractC7038vr.f44561a;
            charsetForName = AbstractC7038vr.f44564d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                O90.m5967e(charsetForName, "forName(...)");
                AbstractC7038vr.f44564d = charsetForName;
            }
        } else {
            if (iMo4702B != 4) {
                throw new AssertionError();
            }
            Charset charset6 = AbstractC7038vr.f44561a;
            charsetForName = AbstractC7038vr.f44563c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                O90.m5967e(charsetForName, "forName(...)");
                AbstractC7038vr.f44563c = charsetForName;
            }
        }
        return charsetForName;
    }

    /* renamed from: u */
    public static final int m1292u(C11917zN0 c11917zN0) {
        O90.m5968f(c11917zN0, "<this>");
        return (c11917zN0.m26390p() & 255) | ((c11917zN0.m26390p() & 255) << 16) | ((c11917zN0.m26390p() & 255) << 8);
    }

    /* renamed from: v */
    public static final boolean m1293v(U21 u21, int i, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jMo2358c = u21.mo97r().mo2359e() ? u21.mo97r().mo2358c() - jNanoTime : Long.MAX_VALUE;
        u21.mo97r().mo1728d(Math.min(jMo2358c, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6507nj c6507nj = new C6507nj();
            while (u21.mo96H(c6507nj, 8192L) != -1) {
                c6507nj.m23186m();
            }
            if (jMo2358c == Long.MAX_VALUE) {
                u21.mo97r().mo2356a();
            } else {
                u21.mo97r().mo1728d(jNanoTime + jMo2358c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo2358c == Long.MAX_VALUE) {
                u21.mo97r().mo2356a();
            } else {
                u21.mo97r().mo1728d(jNanoTime + jMo2358c);
            }
            return false;
        } catch (Throwable th) {
            if (jMo2358c == Long.MAX_VALUE) {
                u21.mo97r().mo2356a();
            } else {
                u21.mo97r().mo1728d(jNanoTime + jMo2358c);
            }
            throw th;
        }
    }

    /* renamed from: w */
    public static final K20 m1294w(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I20 i20 = (I20) it.next();
            String strM3991k = i20.f4667a.m3991k();
            String strM3991k2 = i20.f4668b.m3991k();
            arrayList.add(strM3991k);
            arrayList.add(AbstractC11374v51.m25350Y(strM3991k2).toString());
        }
        return new K20((String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: x */
    public static final String m1295x(D40 d40, boolean z) {
        O90.m5968f(d40, "<this>");
        String str = d40.f1831d;
        if (AbstractC11374v51.m25351p(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = "[" + str + ']';
        }
        int i = d40.f1832e;
        if (!z) {
            String str2 = d40.f1828a;
            O90.m5968f(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    /* renamed from: y */
    public static final List m1296y(List list) {
        O90.m5968f(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC7167xu.m25984d0(list));
        O90.m5967e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    /* renamed from: z */
    public static final int m1297z(int i, String str) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
