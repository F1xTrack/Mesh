package defpackage;

import android.graphics.Path;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: uK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7392uK1 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static float d;
    public static int e;
    public static int f;
    public static String g;
    public static Path h;
    public static ArrayList i;
    public static float j;
    public static float k;
    public static float l;
    public static float m;
    public static float n;
    public static float o;
    public static boolean p;

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d5 A[LOOP:0: B:55:0x01d3->B:56:0x01d5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(float r29, float r30, float r31, boolean r32, boolean r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7392uK1.a(float, float, float, boolean, boolean, float, float):void");
    }

    public static void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        j();
        j = f6;
        k = f7;
        Path path = h;
        float f8 = d;
        path.cubicTo(f2 * f8, f3 * f8, f4 * f8, f5 * f8, f6 * f8, f7 * f8);
        i.add(new C6598qA0(1, new TB0[]{new TB0(f2, f3), new TB0(f4, f5), new TB0(f6, f7)}));
    }

    public static void c(float f2, float f3) {
        j();
        j = f2;
        l = f2;
        k = f3;
        m = f3;
        Path path = h;
        float f4 = d;
        path.lineTo(f2 * f4, f4 * f3);
        i.add(new C6598qA0(4, new TB0[]{new TB0(f2, f3)}));
    }

    public static void d(float f2, float f3) {
        j = f2;
        l = f2;
        n = f2;
        k = f3;
        m = f3;
        o = f3;
        Path path = h;
        float f4 = d;
        path.moveTo(f2 * f4, f4 * f3);
        i.add(new C6598qA0(3, new TB0[]{new TB0(f2, f3)}));
    }

    public static C0617Hr e(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j2;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC7715w12.d(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C5643lA0.a(null, "Couldn't find xmp metadata");
        }
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0F = C3769fQ0.e;
        long j3 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC7715w12.d(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = a;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break loop0;
                    }
                    String strA = AbstractC7715w12.a(xmlPullParserNewPullParser, strArr[i3]);
                    if (strA == null) {
                        i3++;
                    } else if (Integer.parseInt(strA) == 1) {
                        String[] strArr2 = b;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String strA2 = AbstractC7715w12.a(xmlPullParserNewPullParser, strArr2[i4]);
                            if (strA2 != null) {
                                j2 = Long.parseLong(strA2);
                                if (j2 == -1) {
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        }
                        j2 = -9223372036854775807L;
                        String[] strArr3 = c;
                        while (true) {
                            if (i2 >= 2) {
                                N70 n702 = P70.b;
                                c3769fQ0F = C3769fQ0.e;
                                break;
                            }
                            String strA3 = AbstractC7715w12.a(xmlPullParserNewPullParser, strArr3[i2]);
                            if (strA3 != null) {
                                c3769fQ0F = P70.C(new C1556Ts0(0L, 0L, ClipboardModule.MIMETYPE_JPEG), new C1556Ts0(Long.parseLong(strA3), 0L, "video/mp4"));
                                break;
                            }
                            i2++;
                        }
                        j3 = j2;
                    }
                }
                return null;
            }
            if (AbstractC7715w12.d(xmlPullParserNewPullParser, "Container:Directory")) {
                c3769fQ0F = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC7715w12.d(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c3769fQ0F = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC7715w12.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c3769fQ0F.isEmpty()) {
            return null;
        }
        return new C0617Hr(j3, c3769fQ0F, 4);
    }

    public static C3769fQ0 f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        M70 m70T = P70.t();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC7715w12.d(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = AbstractC7715w12.a(xmlPullParser, strConcat3);
                String strA2 = AbstractC7715w12.a(xmlPullParser, strConcat4);
                String strA3 = AbstractC7715w12.a(xmlPullParser, strConcat5);
                String strA4 = AbstractC7715w12.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return C3769fQ0.e;
                }
                m70T.a(new C1556Ts0(strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L, strA));
            }
        } while (!AbstractC7715w12.b(xmlPullParser, strConcat2));
        return m70T.h();
    }

    public static boolean g() {
        l();
        char cCharAt = g.charAt(e);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(e), g));
        }
        int i2 = e + 1;
        e = i2;
        if (i2 < f && g.charAt(i2) == ',') {
            e++;
        }
        l();
        return cCharAt == '1';
    }

    public static float h() throws NumberFormatException {
        int i2;
        char cCharAt;
        if (e == f) {
            throw new Error(AbstractC8235ym.k("Unexpected end (s=", g, ")"));
        }
        l();
        int i3 = e;
        if (i3 == f) {
            throw new Error(AbstractC8235ym.k("Unexpected end (s=", g, ")"));
        }
        char cCharAt2 = g.charAt(i3);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i4 = e + 1;
            e = i4;
            cCharAt2 = g.charAt(i4);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            k();
            int i5 = e;
            if (i5 < f) {
                cCharAt2 = g.charAt(i5);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(e), g));
        }
        if (cCharAt2 == '.') {
            e++;
            k();
            int i6 = e;
            if (i6 < f) {
                cCharAt2 = g.charAt(i6);
            }
        }
        if ((cCharAt2 == 'e' || cCharAt2 == 'E') && (i2 = e + 1) < f && (cCharAt = g.charAt(i2)) != 'm' && cCharAt != 'x') {
            int i7 = e + 1;
            e = i7;
            char cCharAt3 = g.charAt(i7);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                e++;
                k();
            } else {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(e), g));
                }
                k();
            }
        }
        String strSubstring = g.substring(i3, e);
        float f2 = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i3), Integer.valueOf(e), g));
        }
        l();
        int i8 = e;
        if (i8 < f && g.charAt(i8) == ',') {
            e++;
        }
        return f2;
    }

    public static void i(float f2, float f3, float f4, float f5) {
        l = f2;
        m = f3;
        float f6 = f2 * 2.0f;
        float f7 = f3 * 2.0f;
        b((j + f6) / 3.0f, (k + f7) / 3.0f, (f4 + f6) / 3.0f, (f5 + f7) / 3.0f, f4, f5);
    }

    public static void j() {
        if (p) {
            return;
        }
        n = j;
        o = k;
        p = true;
    }

    public static void k() {
        while (true) {
            int i2 = e;
            if (i2 >= f || !Character.isDigit(g.charAt(i2))) {
                return;
            } else {
                e++;
            }
        }
    }

    public static void l() {
        while (true) {
            int i2 = e;
            if (i2 >= f || !Character.isWhitespace(g.charAt(i2))) {
                return;
            } else {
                e++;
            }
        }
    }
}
