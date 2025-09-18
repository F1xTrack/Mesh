package p000;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class D40 {

    /* renamed from: j */
    public static final char[] f1827j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f1828a;

    /* renamed from: b */
    public final String f1829b;

    /* renamed from: c */
    public final String f1830c;

    /* renamed from: d */
    public final String f1831d;

    /* renamed from: e */
    public final int f1832e;

    /* renamed from: f */
    public final ArrayList f1833f;

    /* renamed from: g */
    public final String f1834g;

    /* renamed from: h */
    public final String f1835h;

    /* renamed from: i */
    public final boolean f1836i;

    public D40(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        O90.m5968f(str, "scheme");
        O90.m5968f(str4, "host");
        this.f1828a = str;
        this.f1829b = str2;
        this.f1830c = str3;
        this.f1831d = str4;
        this.f1832e = i;
        this.f1833f = arrayList2;
        this.f1834g = str5;
        this.f1835h = str6;
        this.f1836i = str.equals("https");
    }

    /* renamed from: a */
    public final String m1528a() {
        if (this.f1830c.length() == 0) {
            return "";
        }
        int length = this.f1828a.length() + 3;
        String str = this.f1835h;
        String strSubstring = str.substring(AbstractC11374v51.m25361z(str, ':', length, false, 4) + 1, AbstractC11374v51.m25361z(str, '@', 0, false, 6));
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: b */
    public final String m1529b() {
        int length = this.f1828a.length() + 3;
        String str = this.f1835h;
        int iM25361z = AbstractC11374v51.m25361z(str, '/', length, false, 4);
        String strSubstring = str.substring(iM25361z, AbstractC7433Ch1.m1277f(iM25361z, str, str.length(), "?#"));
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: c */
    public final ArrayList m1530c() {
        int length = this.f1828a.length() + 3;
        String str = this.f1835h;
        int iM25361z = AbstractC11374v51.m25361z(str, '/', length, false, 4);
        int iM1277f = AbstractC7433Ch1.m1277f(iM25361z, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM25361z < iM1277f) {
            int i = iM25361z + 1;
            int iM1278g = AbstractC7433Ch1.m1278g(str, '/', i, iM1277f);
            String strSubstring = str.substring(i, iM1278g);
            O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM25361z = iM1278g;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m1531d() {
        if (this.f1833f == null) {
            return null;
        }
        String str = this.f1835h;
        int iM25361z = AbstractC11374v51.m25361z(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iM25361z, AbstractC7433Ch1.m1278g(str, '#', iM25361z, str.length()));
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: e */
    public final String m1532e() {
        if (this.f1829b.length() == 0) {
            return "";
        }
        int length = this.f1828a.length() + 3;
        String str = this.f1835h;
        String strSubstring = str.substring(length, AbstractC7433Ch1.m1277f(length, str, str.length(), ":@"));
        O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D40) && O90.m5963a(((D40) obj).f1835h, this.f1835h);
    }

    /* renamed from: f */
    public final C40 m1533f() {
        C40 c40 = new C40();
        String str = this.f1828a;
        c40.f1169a = str;
        c40.f1170b = m1532e();
        c40.f1171c = m1528a();
        c40.f1172d = this.f1831d;
        O90.m5968f(str, "scheme");
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.f1832e;
        c40.f1173e = i2 != i ? i2 : -1;
        ArrayList arrayList = c40.f1174f;
        arrayList.clear();
        arrayList.addAll(m1530c());
        String strM1531d = m1531d();
        String strSubstring = null;
        c40.f1175g = strM1531d != null ? C7356Av0.m379I(C7356Av0.m381v(strM1531d, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.f1834g != null) {
            String str2 = this.f1835h;
            strSubstring = str2.substring(AbstractC11374v51.m25361z(str2, '#', 0, false, 6) + 1);
            O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        c40.f1176h = strSubstring;
        return c40;
    }

    /* renamed from: g */
    public final String m1534g() {
        C40 c40;
        try {
            c40 = new C40();
            c40.m973f(this, "/...");
        } catch (IllegalArgumentException unused) {
            c40 = null;
        }
        O90.m5965c(c40);
        c40.f1170b = C7356Av0.m381v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        c40.f1171c = C7356Av0.m381v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return c40.m970c().f1835h;
    }

    /* renamed from: h */
    public final URI m1535h() {
        String strReplaceAll;
        C40 c40M1533f = m1533f();
        String str = c40M1533f.f1172d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            O90.m5967e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            O90.m5967e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c40M1533f.f1172d = strReplaceAll;
        ArrayList arrayList = c40M1533f.f1174f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, C7356Av0.m381v((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = c40M1533f.f1175g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? C7356Av0.m381v(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = c40M1533f.f1176h;
        c40M1533f.f1176h = str3 != null ? C7356Av0.m381v(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = c40M1533f.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                O90.m5967e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                O90.m5967e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                O90.m5967e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.f1835h.hashCode();
    }

    /* renamed from: i */
    public final URL m1536i() {
        try {
            return new URL(this.f1835h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.f1835h;
    }
}
