package p000;

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
public final class C10290md1 implements InterfaceC9200e61 {

    /* renamed from: b */
    public static final Pattern f37800b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c */
    public static final Pattern f37801c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d */
    public static final Pattern f37802d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e */
    public static final Pattern f37803e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f */
    public static final Pattern f37804f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g */
    public static final Pattern f37805g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h */
    public static final Pattern f37806h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i */
    public static final KW0 f37807i = new KW0(1, 30.0f, 1);

    /* renamed from: a */
    public final XmlPullParserFactory f37808a;

    public C10290md1() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f37808a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    public static C10546od1 m22907a(C10546od1 c10546od1) {
        return c10546od1 == null ? new C10546od1() : c10546od1;
    }

    /* renamed from: b */
    public static boolean m22908b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: c */
    public static int m22909c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f37806h.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC10872rA1.m24175h("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            YN1.m9277b("Invalid cell resolution " + i + " " + i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            AbstractC10872rA1.m24175h("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* renamed from: e */
    public static void m22910e(String str, C10546od1 c10546od1) throws W51 {
        Matcher matcher;
        String strGroup;
        int i = AbstractC7485Dh1.f2166a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f37802d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new W51(AbstractC1374Vq.m8591j(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC10872rA1.m24175h("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new W51(AbstractC7222ym.m26234k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c10546od1.f39138j = 3;
                break;
            case "em":
                c10546od1.f39138j = 2;
                break;
            case "px":
                c10546od1.f39138j = 1;
                break;
            default:
                throw new W51(AbstractC7222ym.m26234k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c10546od1.f39139k = Float.parseFloat(strGroup2);
    }

    /* renamed from: f */
    public static KW0 m22911f(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = AbstractC7485Dh1.f2166a;
            YN1.m9277b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        KW0 kw0 = f37807i;
        int i3 = kw0.f6143b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new KW0(i3, i * f, attributeValue4 != null ? Integer.parseInt(attributeValue4) : kw0.f6144c);
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
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m22912h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, p000.C11649xG0 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10290md1.m22912h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, xG0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C10162ld1 m22913i(org.xmlpull.v1.XmlPullParser r21, p000.C10162ld1 r22, java.util.HashMap r23, p000.KW0 r24) throws p000.W51, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10290md1.m22913i(org.xmlpull.v1.XmlPullParser, ld1, java.util.HashMap, KW0):ld1");
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
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C10546od1 m22914j(org.xmlpull.v1.XmlPullParser r19, p000.C10546od1 r20) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10290md1.m22914j(org.xmlpull.v1.XmlPullParser, od1):od1");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m22915k(java.lang.String r13, p000.KW0 r14) throws p000.W51, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10290md1.m22915k(java.lang.String, KW0):long");
    }

    /* renamed from: l */
    public static C11649xG0 m22916l(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strM25542a = AbstractC11492w12.m25542a(xmlPullParser, "extent");
        if (strM25542a == null) {
            return null;
        }
        Matcher matcher = f37805g.matcher(strM25542a);
        if (!matcher.matches()) {
            AbstractC10872rA1.m24175h("Ignoring non-pixel tts extent: ".concat(strM25542a));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C11649xG0(i, Integer.parseInt(strGroup2), 10);
        } catch (NumberFormatException unused) {
            AbstractC10872rA1.m24175h("Ignoring malformed tts extent: ".concat(strM25542a));
            return null;
        }
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public final int mo4559G() {
        return 1;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public final /* synthetic */ void mo4560d() {
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public final U51 mo4561g(byte[] bArr, int i, int i2) throws XmlPullParserException, NumberFormatException, IOException {
        KW0 kw0;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f37808a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C10418nd1("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C11649xG0 c11649xG0M22916l = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            KW0 kw0M22911f = f37807i;
            int iM22909c = 15;
            C6937uF c6937uF = null;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C10162ld1 c10162ld1 = (C10162ld1) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            kw0M22911f = m22911f(xmlPullParserNewPullParser);
                            iM22909c = m22909c(xmlPullParserNewPullParser);
                            c11649xG0M22916l = m22916l(xmlPullParserNewPullParser);
                        }
                        C11649xG0 c11649xG0 = c11649xG0M22916l;
                        KW0 kw02 = kw0M22911f;
                        int i4 = iM22909c;
                        if (m22908b(name)) {
                            if ("head".equals(name)) {
                                kw0 = kw02;
                                m22912h(xmlPullParserNewPullParser, map, i4, c11649xG0, map2, map3);
                            } else {
                                kw0 = kw02;
                                try {
                                    C10162ld1 c10162ld1M22913i = m22913i(xmlPullParserNewPullParser, c10162ld1, map2, kw0);
                                    arrayDeque.push(c10162ld1M22913i);
                                    if (c10162ld1 != null) {
                                        if (c10162ld1.f37207m == null) {
                                            c10162ld1.f37207m = new ArrayList();
                                        }
                                        c10162ld1.f37207m.add(c10162ld1M22913i);
                                    }
                                } catch (W51 e) {
                                    AbstractC10872rA1.m24176i("Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            kw0M22911f = kw0;
                        } else {
                            AbstractC10872rA1.m24174g("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            kw0M22911f = kw02;
                        }
                        c11649xG0M22916l = c11649xG0;
                        iM22909c = i4;
                    } else if (eventType == 4) {
                        c10162ld1.getClass();
                        C10162ld1 c10162ld1M22515a = C10162ld1.m22515a(xmlPullParserNewPullParser.getText());
                        if (c10162ld1.f37207m == null) {
                            c10162ld1.f37207m = new ArrayList();
                        }
                        c10162ld1.f37207m.add(c10162ld1M22515a);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C10162ld1 c10162ld12 = (C10162ld1) arrayDeque.peek();
                            c10162ld12.getClass();
                            c6937uF = new C6937uF(c10162ld12, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            c6937uF.getClass();
            return c6937uF;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    public final void mo4562m(byte[] bArr, int i, int i2, C9072d61 c9072d61, InterfaceC6587oy interfaceC6587oy) {
        AbstractC3982eJ.m17906h(mo4561g(bArr, i, i2), c9072d61, interfaceC6587oy);
    }
}
