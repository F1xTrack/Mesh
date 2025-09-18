package defpackage;

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
public abstract class AbstractC0199Ch1 {
    public static final byte[] a;
    public static final K20 b = K12.c(new String[0]);
    public static final HN0 c;
    public static final C0717Iy0 d;
    public static final TimeZone e;
    public static final C2512cQ0 f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        C6129nj c6129nj = new C6129nj();
        c6129nj.p0(bArr);
        long j = 0;
        c = new HN0(null, j, c6129nj, 1);
        c(j, j, j);
        C0674Ik c0674Ik = C0674Ik.d;
        d = IJ1.b(TE.C("efbbbf"), TE.C("feff"), TE.C("fffe"), TE.C("0000ffff"), TE.C("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        O90.c(timeZone);
        e = timeZone;
        f = new C2512cQ0("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = AbstractC7538v51.K("Client", AbstractC7538v51.J("okhttp3.", C6363ox0.class.getName()));
    }

    public static final String A(int i, int i2, String str) {
        int iO = o(i, i2, str);
        String strSubstring = str.substring(iO, p(iO, i2, str));
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final boolean a(D40 d40, D40 d402) {
        O90.f(d40, "<this>");
        O90.f(d402, "other");
        return O90.a(d40.d, d402.d) && d40.e == d402.e && O90.a(d40.a, d402.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
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

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) throws IOException {
        O90.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) throws IOException {
        O90.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!O90.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, String str, int i2, String str2) {
        O90.f(str, "<this>");
        while (i < i2) {
            if (AbstractC7538v51.q(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, char c2, int i, int i2) {
        O90.f(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int h(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return g(str, c2, i, i2);
    }

    public static final boolean i(U21 u21, TimeUnit timeUnit) {
        O90.f(timeUnit, "timeUnit");
        try {
            return v(u21, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String str, Object... objArr) {
        O90.f(str, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean k(String[] strArr, String[] strArr2, Comparator comparator) {
        O90.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C6563q0 c6563q0A = HN1.a(strArr2);
                while (c6563q0A.hasNext()) {
                    if (comparator.compare(str, (String) c6563q0A.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long l(HS0 hs0) {
        String strB = hs0.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List m(Object... objArr) {
        O90.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC8259yu.f(Arrays.copyOf(objArr2, objArr2.length)));
        O90.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int n(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (O90.h(cCharAt, 31) <= 0 || O90.h(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int o(int i, int i2, String str) {
        O90.f(str, "<this>");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int p(int i, int i2, String str) {
        O90.f(str, "<this>");
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

    public static final String[] q(String[] strArr, String[] strArr2, Comparator comparator) {
        O90.f(strArr2, "other");
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

    public static final boolean r(String str) {
        O90.f(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int s(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset t(InterfaceC0827Kj interfaceC0827Kj, Charset charset) {
        Charset charsetForName;
        O90.f(interfaceC0827Kj, "<this>");
        O90.f(charset, "default");
        int iB = interfaceC0827Kj.B(d);
        if (iB == -1) {
            return charset;
        }
        if (iB == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            O90.e(charset2, "UTF_8");
            return charset2;
        }
        if (iB == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            O90.e(charset3, "UTF_16BE");
            return charset3;
        }
        if (iB == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            O90.e(charset4, "UTF_16LE");
            return charset4;
        }
        if (iB == 3) {
            Charset charset5 = AbstractC7680vr.a;
            charsetForName = AbstractC7680vr.d;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32BE");
                O90.e(charsetForName, "forName(...)");
                AbstractC7680vr.d = charsetForName;
            }
        } else {
            if (iB != 4) {
                throw new AssertionError();
            }
            Charset charset6 = AbstractC7680vr.a;
            charsetForName = AbstractC7680vr.c;
            if (charsetForName == null) {
                charsetForName = Charset.forName("UTF-32LE");
                O90.e(charsetForName, "forName(...)");
                AbstractC7680vr.c = charsetForName;
            }
        }
        return charsetForName;
    }

    public static final int u(C8351zN0 c8351zN0) {
        O90.f(c8351zN0, "<this>");
        return (c8351zN0.p() & 255) | ((c8351zN0.p() & 255) << 16) | ((c8351zN0.p() & 255) << 8);
    }

    public static final boolean v(U21 u21, int i, TimeUnit timeUnit) {
        O90.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = u21.r().e() ? u21.r().c() - jNanoTime : Long.MAX_VALUE;
        u21.r().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6129nj c6129nj = new C6129nj();
            while (u21.H(c6129nj, 8192L) != -1) {
                c6129nj.m();
            }
            if (jC == Long.MAX_VALUE) {
                u21.r().a();
            } else {
                u21.r().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                u21.r().a();
            } else {
                u21.r().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                u21.r().a();
            } else {
                u21.r().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final K20 w(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I20 i20 = (I20) it.next();
            String strK = i20.a.k();
            String strK2 = i20.b.k();
            arrayList.add(strK);
            arrayList.add(AbstractC7538v51.Y(strK2).toString());
        }
        return new K20((String[]) arrayList.toArray(new String[0]));
    }

    public static final String x(D40 d40, boolean z) {
        O90.f(d40, "<this>");
        String str = d40.d;
        if (AbstractC7538v51.p(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            str = "[" + str + ']';
        }
        int i = d40.e;
        if (!z) {
            String str2 = d40.a;
            O90.f(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List y(List list) {
        O90.f(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(AbstractC8069xu.d0(list));
        O90.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int z(int i, String str) throws NumberFormatException {
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
