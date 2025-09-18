package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: w12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7715w12 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        return c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final KX e(KX kx, KX kx2) {
        O90.f(kx, "<this>");
        O90.f(kx2, "prefix");
        if (!kx.equals(kx2) && !kx2.d()) {
            String strB = kx.b();
            String strB2 = kx2.b();
            if (!D51.o(strB, strB2, false) || strB.charAt(strB2.length()) != '.') {
                return kx;
            }
        }
        if (kx2.d()) {
            return kx;
        }
        if (kx.equals(kx2)) {
            KX kx3 = KX.c;
            O90.e(kx3, "ROOT");
            return kx3;
        }
        String strSubstring = kx.b().substring(kx2.b().length() + 1);
        O90.e(strSubstring, "substring(...)");
        return new KX(strSubstring);
    }
}
