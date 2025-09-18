package p000;

import java.util.Locale;
import kotlin.Pair;

/* renamed from: Yp0 */
/* loaded from: classes.dex */
public abstract class AbstractC8592Yp0 {

    /* renamed from: a */
    public static final Object f14551a = AbstractC11077sn0.m24780h(new Pair("mkv", "video/x-matroska"), new Pair("glb", "model/gltf-binary"));

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static final String m9384a(String str) {
        String strSubstring;
        O90.m5968f(str, "path");
        int iM25331F = AbstractC11374v51.m25331F(str, '.', 0, 6);
        if (iM25331F < 0 || iM25331F == str.length() - 1) {
            strSubstring = null;
        } else {
            strSubstring = str.substring(iM25331F + 1);
            O90.m5967e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        if (strSubstring == null) {
            return null;
        }
        Locale locale = Locale.US;
        O90.m5967e(locale, "US");
        String lowerCase = strSubstring.toLowerCase(locale);
        O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String mimeTypeFromExtension = (String) AbstractC8492Wr0.f13421b.get(lowerCase);
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = AbstractC8492Wr0.f13420a.getMimeTypeFromExtension(lowerCase);
        }
        return mimeTypeFromExtension == null ? (String) f14551a.get(lowerCase) : mimeTypeFromExtension;
    }
}
