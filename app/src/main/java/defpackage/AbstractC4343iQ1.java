package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: iQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4343iQ1 {
    public static ArrayList a(O01 o01) {
        try {
            ArrayList arrayList = new ArrayList(1);
            o01.getClass();
            arrayList.add(e(o01));
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String b(C1559Tt0 c1559Tt0) {
        O90.f(c1559Tt0, "<this>");
        String strB = c1559Tt0.b();
        O90.e(strB, "asString(...)");
        if (!AbstractC7838wg0.a.contains(strB)) {
            int i = 0;
            while (true) {
                if (i < strB.length()) {
                    char cCharAt = strB.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                    String strB2 = c1559Tt0.b();
                    O90.e(strB2, "asString(...)");
                    return strB2;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String strB3 = c1559Tt0.b();
        O90.e(strB3, "asString(...)");
        sb.append("`".concat(strB3));
        sb.append('`');
        return sb.toString();
    }

    public static final String c(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1559Tt0 c1559Tt0 = (C1559Tt0) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(b(c1559Tt0));
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static final String d(String str, String str2, String str3, String str4, String str5) {
        O90.f(str, "lowerRendered");
        O90.f(str2, "lowerPrefix");
        O90.f(str3, "upperRendered");
        O90.f(str4, "upperPrefix");
        O90.f(str5, "foldedPrefix");
        if (!D51.o(str, str2, false) || !D51.o(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        O90.e(strSubstring, "substring(...)");
        String strSubstring2 = str3.substring(str4.length());
        O90.e(strSubstring2, "substring(...)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!f(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static String e(InterfaceC4213hl interfaceC4213hl) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes = interfaceC4213hl.b().getBytes("UTF-8");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final boolean f(String str, String str2) {
        O90.f(str, "lower");
        O90.f(str2, "upper");
        if (!str.equals(D51.m(str2, "?", "")) && (!D51.i(str2, "?") || !O90.a(str.concat("?"), str2))) {
            if (!O90.a("(" + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }
}
