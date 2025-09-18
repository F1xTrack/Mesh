package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class D40 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final String g;
    public final String h;
    public final boolean i;

    public D40(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        O90.f(str, "scheme");
        O90.f(str4, "host");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList2;
        this.g = str5;
        this.h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(AbstractC7538v51.z(str, ':', length, false, 4) + 1, AbstractC7538v51.z(str, '@', 0, false, 6));
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iZ = AbstractC7538v51.z(str, '/', length, false, 4);
        String strSubstring = str.substring(iZ, AbstractC0199Ch1.f(iZ, str, str.length(), "?#"));
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.h;
        int iZ = AbstractC7538v51.z(str, '/', length, false, 4);
        int iF = AbstractC0199Ch1.f(iZ, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iZ < iF) {
            int i = iZ + 1;
            int iG = AbstractC0199Ch1.g(str, '/', i, iF);
            String strSubstring = str.substring(i, iG);
            O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iZ = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f == null) {
            return null;
        }
        String str = this.h;
        int iZ = AbstractC7538v51.z(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iZ, AbstractC0199Ch1.g(str, '#', iZ, str.length()));
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(length, AbstractC0199Ch1.f(length, str, str.length(), ":@"));
        O90.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D40) && O90.a(((D40) obj).h, this.h);
    }

    public final C40 f() {
        C40 c40 = new C40();
        String str = this.a;
        c40.a = str;
        c40.b = e();
        c40.c = a();
        c40.d = this.d;
        O90.f(str, "scheme");
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        c40.e = i2 != i ? i2 : -1;
        ArrayList arrayList = c40.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        c40.g = strD != null ? C0084Av0.I(C0084Av0.v(strD, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.g != null) {
            String str2 = this.h;
            strSubstring = str2.substring(AbstractC7538v51.z(str2, '#', 0, false, 6) + 1);
            O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        c40.h = strSubstring;
        return c40;
    }

    public final String g() {
        C40 c40;
        try {
            c40 = new C40();
            c40.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            c40 = null;
        }
        O90.c(c40);
        c40.b = C0084Av0.v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        c40.c = C0084Av0.v("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return c40.c().h;
    }

    public final URI h() {
        String strReplaceAll;
        C40 c40F = f();
        String str = c40F.d;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            O90.e(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            O90.e(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c40F.d = strReplaceAll;
        ArrayList arrayList = c40F.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, C0084Av0.v((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = c40F.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? C0084Av0.v(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str3 = c40F.h;
        c40F.h = str3 != null ? C0084Av0.v(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
        String string = c40F.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                O90.e(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                O90.e(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                O90.e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final URL i() {
        try {
            return new URL(this.h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.h;
    }
}
