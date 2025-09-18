package p000;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: iQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9752iQ1 {
    /* renamed from: a */
    public static ArrayList m19031a(O01 o01) {
        try {
            ArrayList arrayList = new ArrayList(1);
            o01.getClass();
            arrayList.add(m19035e(o01));
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static final String m19032b(C8340Tt0 c8340Tt0) {
        O90.m5968f(c8340Tt0, "<this>");
        String strM7801b = c8340Tt0.m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        if (!AbstractC11574wg0.f45023a.contains(strM7801b)) {
            int i = 0;
            while (true) {
                if (i < strM7801b.length()) {
                    char cCharAt = strM7801b.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strM7801b.length() != 0 && Character.isJavaIdentifierStart(strM7801b.codePointAt(0))) {
                    String strM7801b2 = c8340Tt0.m7801b();
                    O90.m5967e(strM7801b2, "asString(...)");
                    return strM7801b2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String strM7801b3 = c8340Tt0.m7801b();
        O90.m5967e(strM7801b3, "asString(...)");
        sb.append("`".concat(strM7801b3));
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: c */
    public static final String m19033c(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8340Tt0 c8340Tt0 = (C8340Tt0) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m19032b(c8340Tt0));
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: d */
    public static final String m19034d(String str, String str2, String str3, String str4, String str5) {
        O90.m5968f(str, "lowerRendered");
        O90.m5968f(str2, "lowerPrefix");
        O90.m5968f(str3, "upperRendered");
        O90.m5968f(str4, "upperPrefix");
        O90.m5968f(str5, "foldedPrefix");
        if (!D51.m1556o(str, str2, false) || !D51.m1556o(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        O90.m5967e(strSubstring, "substring(...)");
        String strSubstring2 = str3.substring(str4.length());
        O90.m5967e(strSubstring2, "substring(...)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!m19036f(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    /* renamed from: e */
    public static String m19035e(InterfaceC4199hl interfaceC4199hl) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes = interfaceC4199hl.mo5925b().getBytes("UTF-8");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public static final boolean m19036f(String str, String str2) {
        O90.m5968f(str, "lower");
        O90.m5968f(str2, "upper");
        if (!str.equals(D51.m1554m(str2, "?", "")) && (!D51.m1550i(str2, "?") || !O90.m5963a(str.concat("?"), str2))) {
            if (!O90.m5963a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }
}
