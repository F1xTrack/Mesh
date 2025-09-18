package p000;

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
public abstract class AbstractC11276uK1 {

    /* renamed from: a */
    public static final String[] f43653a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f43654b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f43655c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: d */
    public static float f43656d;

    /* renamed from: e */
    public static int f43657e;

    /* renamed from: f */
    public static int f43658f;

    /* renamed from: g */
    public static String f43659g;

    /* renamed from: h */
    public static Path f43660h;

    /* renamed from: i */
    public static ArrayList f43661i;

    /* renamed from: j */
    public static float f43662j;

    /* renamed from: k */
    public static float f43663k;

    /* renamed from: l */
    public static float f43664l;

    /* renamed from: m */
    public static float f43665m;

    /* renamed from: n */
    public static float f43666n;

    /* renamed from: o */
    public static float f43667o;

    /* renamed from: p */
    public static boolean f43668p;

    /* JADX WARN: Removed duplicated region for block: B:56:0x01d5 A[LOOP:0: B:55:0x01d3->B:56:0x01d5, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25170a(float r29, float r30, float r31, boolean r32, boolean r33, float r34, float r35) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11276uK1.m25170a(float, float, float, boolean, boolean, float, float):void");
    }

    /* renamed from: b */
    public static void m25171b(float f, float f2, float f3, float f4, float f5, float f6) {
        m25179j();
        f43662j = f5;
        f43663k = f6;
        Path path = f43660h;
        float f7 = f43656d;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f6 * f7);
        f43661i.add(new C10743qA0(1, new TB0[]{new TB0(f, f2), new TB0(f3, f4), new TB0(f5, f6)}));
    }

    /* renamed from: c */
    public static void m25172c(float f, float f2) {
        m25179j();
        f43662j = f;
        f43664l = f;
        f43663k = f2;
        f43665m = f2;
        Path path = f43660h;
        float f3 = f43656d;
        path.lineTo(f * f3, f3 * f2);
        f43661i.add(new C10743qA0(4, new TB0[]{new TB0(f, f2)}));
    }

    /* renamed from: d */
    public static void m25173d(float f, float f2) {
        f43662j = f;
        f43664l = f;
        f43666n = f;
        f43663k = f2;
        f43665m = f2;
        f43667o = f2;
        Path path = f43660h;
        float f3 = f43656d;
        path.moveTo(f * f3, f3 * f2);
        f43661i.add(new C10743qA0(3, new TB0[]{new TB0(f, f2)}));
    }

    /* renamed from: e */
    public static C0495Hr m25174e(String str) throws XmlPullParserException, IOException, NumberFormatException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC11492w12.m25545d(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C10103lA0.m22366a(null, "Couldn't find xmp metadata");
        }
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0M25175f = C9367fQ0.f27184e;
        long j2 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f43653a;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String strM25542a = AbstractC11492w12.m25542a(xmlPullParserNewPullParser, strArr[i2]);
                    if (strM25542a == null) {
                        i2++;
                    } else if (Integer.parseInt(strM25542a) == 1) {
                        String[] strArr2 = f43654b;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String strM25542a2 = AbstractC11492w12.m25542a(xmlPullParserNewPullParser, strArr2[i3]);
                            if (strM25542a2 != null) {
                                j = Long.parseLong(strM25542a2);
                                if (j == -1) {
                                    break;
                                }
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = f43655c;
                        while (true) {
                            if (i >= 2) {
                                N70 n702 = P70.f8867b;
                                c9367fQ0M25175f = C9367fQ0.f27184e;
                                break;
                            }
                            String strM25542a3 = AbstractC11492w12.m25542a(xmlPullParserNewPullParser, strArr3[i]);
                            if (strM25542a3 != null) {
                                c9367fQ0M25175f = P70.m6230C(new C8338Ts0(0L, 0L, ClipboardModule.MIMETYPE_JPEG), new C8338Ts0(Long.parseLong(strM25542a3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
                return null;
            }
            if (AbstractC11492w12.m25545d(xmlPullParserNewPullParser, "Container:Directory")) {
                c9367fQ0M25175f = m25175f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC11492w12.m25545d(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c9367fQ0M25175f = m25175f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (c9367fQ0M25175f.isEmpty()) {
            return null;
        }
        return new C0495Hr(j2, c9367fQ0M25175f, 4);
    }

    /* renamed from: f */
    public static C9367fQ0 m25175f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        M70 m70M6233t = P70.m6233t();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM25542a = AbstractC11492w12.m25542a(xmlPullParser, strConcat3);
                String strM25542a2 = AbstractC11492w12.m25542a(xmlPullParser, strConcat4);
                String strM25542a3 = AbstractC11492w12.m25542a(xmlPullParser, strConcat5);
                String strM25542a4 = AbstractC11492w12.m25542a(xmlPullParser, strConcat6);
                if (strM25542a == null || strM25542a2 == null) {
                    return C9367fQ0.f27184e;
                }
                m70M6233t.m3755a(new C8338Ts0(strM25542a3 != null ? Long.parseLong(strM25542a3) : 0L, strM25542a4 != null ? Long.parseLong(strM25542a4) : 0L, strM25542a));
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, strConcat2));
        return m70M6233t.m5273h();
    }

    /* renamed from: g */
    public static boolean m25176g() {
        m25181l();
        char cCharAt = f43659g.charAt(f43657e);
        if (cCharAt != '0' && cCharAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(cCharAt), Integer.valueOf(f43657e), f43659g));
        }
        int i = f43657e + 1;
        f43657e = i;
        if (i < f43658f && f43659g.charAt(i) == ',') {
            f43657e++;
        }
        m25181l();
        return cCharAt == '1';
    }

    /* renamed from: h */
    public static float m25177h() throws NumberFormatException {
        int i;
        char cCharAt;
        if (f43657e == f43658f) {
            throw new Error(AbstractC7222ym.m26234k("Unexpected end (s=", f43659g, ")"));
        }
        m25181l();
        int i2 = f43657e;
        if (i2 == f43658f) {
            throw new Error(AbstractC7222ym.m26234k("Unexpected end (s=", f43659g, ")"));
        }
        char cCharAt2 = f43659g.charAt(i2);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i3 = f43657e + 1;
            f43657e = i3;
            cCharAt2 = f43659g.charAt(i3);
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            m25180k();
            int i4 = f43657e;
            if (i4 < f43658f) {
                cCharAt2 = f43659g.charAt(i4);
            }
        } else if (cCharAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt2), Integer.valueOf(f43657e), f43659g));
        }
        if (cCharAt2 == '.') {
            f43657e++;
            m25180k();
            int i5 = f43657e;
            if (i5 < f43658f) {
                cCharAt2 = f43659g.charAt(i5);
            }
        }
        if ((cCharAt2 == 'e' || cCharAt2 == 'E') && (i = f43657e + 1) < f43658f && (cCharAt = f43659g.charAt(i)) != 'm' && cCharAt != 'x') {
            int i6 = f43657e + 1;
            f43657e = i6;
            char cCharAt3 = f43659g.charAt(i6);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                f43657e++;
                m25180k();
            } else {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(cCharAt3), Integer.valueOf(f43657e), f43659g));
                }
                m25180k();
            }
        }
        String strSubstring = f43659g.substring(i2, f43657e);
        float f = Float.parseFloat(strSubstring);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", strSubstring, Integer.valueOf(i2), Integer.valueOf(f43657e), f43659g));
        }
        m25181l();
        int i7 = f43657e;
        if (i7 < f43658f && f43659g.charAt(i7) == ',') {
            f43657e++;
        }
        return f;
    }

    /* renamed from: i */
    public static void m25178i(float f, float f2, float f3, float f4) {
        f43664l = f;
        f43665m = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        m25171b((f43662j + f5) / 3.0f, (f43663k + f6) / 3.0f, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    /* renamed from: j */
    public static void m25179j() {
        if (f43668p) {
            return;
        }
        f43666n = f43662j;
        f43667o = f43663k;
        f43668p = true;
    }

    /* renamed from: k */
    public static void m25180k() {
        while (true) {
            int i = f43657e;
            if (i >= f43658f || !Character.isDigit(f43659g.charAt(i))) {
                return;
            } else {
                f43657e++;
            }
        }
    }

    /* renamed from: l */
    public static void m25181l() {
        while (true) {
            int i = f43657e;
            if (i >= f43658f || !Character.isWhitespace(f43659g.charAt(i))) {
                return;
            } else {
                f43657e++;
            }
        }
    }
}
