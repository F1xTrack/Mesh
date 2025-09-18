package p000;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: w12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11492w12 {
    /* renamed from: a */
    public static String m25542a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m25543b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* renamed from: c */
    public static boolean m25544c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: d */
    public static boolean m25545d(XmlPullParser xmlPullParser, String str) {
        return m25544c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static final C0664KX m25546e(C0664KX c0664kx, C0664KX c0664kx2) {
        O90.m5968f(c0664kx, "<this>");
        O90.m5968f(c0664kx2, "prefix");
        if (!c0664kx.equals(c0664kx2) && !c0664kx2.m4656d()) {
            String strM4654b = c0664kx.m4654b();
            String strM4654b2 = c0664kx2.m4654b();
            if (!D51.m1556o(strM4654b, strM4654b2, false) || strM4654b.charAt(strM4654b2.length()) != '.') {
                return c0664kx;
            }
        }
        if (c0664kx2.m4656d()) {
            return c0664kx;
        }
        if (c0664kx.equals(c0664kx2)) {
            C0664KX c0664kx3 = C0664KX.f6145c;
            O90.m5967e(c0664kx3, "ROOT");
            return c0664kx3;
        }
        String strSubstring = c0664kx.m4654b().substring(c0664kx2.m4654b().length() + 1);
        O90.m5967e(strSubstring, "substring(...)");
        return new C0664KX(strSubstring);
    }
}
