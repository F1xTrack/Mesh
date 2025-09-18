package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: md1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5922md1 implements InterfaceC3519e61 {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final KW0 i = new KW0(1, 30.0f, 1);
    public final XmlPullParserFactory a;

    public C5922md1() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static C6304od1 a(C6304od1 c6304od1) {
        return c6304od1 == null ? new C6304od1() : c6304od1;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC6789rA1.h("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            YN1.b("Invalid cell resolution " + i2 + " " + i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            AbstractC6789rA1.h("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, C6304od1 c6304od1) throws W51 {
        Matcher matcher;
        String strGroup;
        int i2 = AbstractC0277Dh1.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new W51(AbstractC1705Vq.j(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC6789rA1.h("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new W51(AbstractC8235ym.k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c6304od1.j = 3;
                break;
            case "em":
                c6304od1.j = 2;
                break;
            case "px":
                c6304od1.j = 1;
                break;
            default:
                throw new W51(AbstractC8235ym.k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c6304od1.k = Float.parseFloat(strGroup2);
    }

    public static KW0 f(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = AbstractC0277Dh1.a;
            YN1.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        KW0 kw0 = i;
        int i4 = kw0.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new KW0(i4, i2 * f2, attributeValue4 != null ? Integer.parseInt(attributeValue4) : kw0.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b A[LOOP:0: B:3:0x000a->B:104:0x024b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.C7950xG0 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5922md1.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, xG0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C5731ld1 i(org.xmlpull.v1.XmlPullParser r21, defpackage.C5731ld1 r22, java.util.HashMap r23, defpackage.KW0 r24) throws defpackage.W51, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5922md1.i(org.xmlpull.v1.XmlPullParser, ld1, java.util.HashMap, KW0):ld1");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00ea. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v66, types: [o91] */
    /* JADX WARN: Type inference failed for: r11v77 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v15, types: [o91] */
    /* JADX WARN: Type inference failed for: r12v21, types: [o91] */
    /* JADX WARN: Type inference failed for: r1v52, types: [o91] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6304od1 j(org.xmlpull.v1.XmlPullParser r19, defpackage.C6304od1 r20) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5922md1.j(org.xmlpull.v1.XmlPullParser, od1):od1");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long k(java.lang.String r13, defpackage.KW0 r14) throws defpackage.W51, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5922md1.k(java.lang.String, KW0):long");
    }

    public static C7950xG0 l(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strA = AbstractC7715w12.a(xmlPullParser, "extent");
        if (strA == null) {
            return null;
        }
        Matcher matcher = g.matcher(strA);
        if (!matcher.matches()) {
            AbstractC6789rA1.h("Ignoring non-pixel tts extent: ".concat(strA));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C7950xG0(i2, Integer.parseInt(strGroup2), 10);
        } catch (NumberFormatException unused) {
            AbstractC6789rA1.h("Ignoring malformed tts extent: ".concat(strA));
            return null;
        }
    }

    @Override // defpackage.InterfaceC3519e61
    public final int G() {
        return 1;
    }

    @Override // defpackage.InterfaceC3519e61
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC3519e61
    public final U51 g(byte[] bArr, int i2, int i3) throws XmlPullParserException, NumberFormatException, IOException {
        KW0 kw0;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C6113nd1("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C7950xG0 c7950xG0L = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            KW0 kw0F = i;
            int iC = 15;
            C7375uF c7375uF = null;
            int i4 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C5731ld1 c5731ld1 = (C5731ld1) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            kw0F = f(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            c7950xG0L = l(xmlPullParserNewPullParser);
                        }
                        C7950xG0 c7950xG0 = c7950xG0L;
                        KW0 kw02 = kw0F;
                        int i5 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                kw0 = kw02;
                                h(xmlPullParserNewPullParser, map, i5, c7950xG0, map2, map3);
                            } else {
                                kw0 = kw02;
                                try {
                                    C5731ld1 c5731ld1I = i(xmlPullParserNewPullParser, c5731ld1, map2, kw0);
                                    arrayDeque.push(c5731ld1I);
                                    if (c5731ld1 != null) {
                                        if (c5731ld1.m == null) {
                                            c5731ld1.m = new ArrayList();
                                        }
                                        c5731ld1.m.add(c5731ld1I);
                                    }
                                } catch (W51 e2) {
                                    AbstractC6789rA1.i("Suppressing parser error", e2);
                                    i4++;
                                }
                            }
                            kw0F = kw0;
                        } else {
                            AbstractC6789rA1.g("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i4++;
                            kw0F = kw02;
                        }
                        c7950xG0L = c7950xG0;
                        iC = i5;
                    } else if (eventType == 4) {
                        c5731ld1.getClass();
                        C5731ld1 c5731ld1A = C5731ld1.a(xmlPullParserNewPullParser.getText());
                        if (c5731ld1.m == null) {
                            c5731ld1.m = new ArrayList();
                        }
                        c5731ld1.m.add(c5731ld1A);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C5731ld1 c5731ld12 = (C5731ld1) arrayDeque.peek();
                            c5731ld12.getClass();
                            c7375uF = new C7375uF(c5731ld12, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                xmlPullParserNewPullParser.next();
            }
            c7375uF.getClass();
            return c7375uF;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }

    @Override // defpackage.InterfaceC3519e61
    public final void m(byte[] bArr, int i2, int i3, C3329d61 c3329d61, InterfaceC6365oy interfaceC6365oy) {
        AbstractC3556eJ.h(g(bArr, i2, i3), c3329d61, interfaceC6365oy);
    }
}
