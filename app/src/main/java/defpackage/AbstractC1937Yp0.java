package defpackage;

import java.util.Locale;
import kotlin.Pair;

/* renamed from: Yp0 */
/* loaded from: classes.dex */
public abstract class AbstractC1937Yp0 {
    public static final Object a = AbstractC7096sn0.h(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    public static final String a(String str) {
        String strSubstring;
        O90.f(str, "path");
        int iF = AbstractC7538v51.F(str, '.', 0, 6);
        if (iF < 0 || iF == str.length() - 1) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(iF + 1);
            O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        if (strSubstring == null) {
            return null;
        }
        Locale locale = Locale.US;
        O90.e(locale, "US");
        String lowerCase = strSubstring.toLowerCase(locale);
        O90.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String mimeTypeFromExtension = (String) AbstractC1787Wr0.b.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = AbstractC1787Wr0.a.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) a.get(lowerCase) : mimeTypeFromExtension;
    }
}
