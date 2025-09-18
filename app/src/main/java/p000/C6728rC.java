package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: rC */
/* loaded from: classes.dex */
public final class C6728rC extends DefaultHandler implements InterfaceC10231mA0 {

    /* renamed from: b */
    public static final Pattern f41371b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f41372c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f41373d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f41374e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f41375a;

    public C6728rC() {
        try {
            this.f41375a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    public static long m24214a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = AbstractC7485Dh1.f2166a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new OX0(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: b */
    public static void m24215b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (AbstractC11492w12.m25544c(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (AbstractC11492w12.m25544c(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ad  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m24216c(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6728rC.m24216c(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: d */
    public static long m24217d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: e */
    public static ArrayList m24218e(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                m24215b(xmlPullParser);
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC8668a02.m9656e(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC10978s10.m24576a(new C0735Lg(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0735Lg c0735Lg = (C0735Lg) list.get(i3);
            String strM9659h = AbstractC8668a02.m9659h(c0735Lg.f6792a, text);
            String str = attributeValue3 == null ? strM9659h : attributeValue3;
            if (z) {
                i = c0735Lg.f6794c;
                i2 = c0735Lg.f6795d;
                str = c0735Lg.f6793b;
            }
            arrayList.add(new C0735Lg(strM9659h, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x015c  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m24219f(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6728rC.m24219f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: g */
    public static int m24220g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* renamed from: h */
    public static C1776bI m24221h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, NotificationConstants.f19487ID);
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC11492w12.m25543b(xmlPullParser, str));
        return new C1776bI(attributeValue, attributeValue2, str2);
    }

    /* renamed from: j */
    public static long m24222j(XmlPullParser xmlPullParser, String str, long j) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = AbstractC7485Dh1.f2174i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d = Double.parseDouble(strGroup6);
        }
        long j2 = (long) ((d6 + d) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    /* renamed from: k */
    public static float m24223k(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f41371b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    /* renamed from: l */
    public static int m24224l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    /* renamed from: m */
    public static long m24225m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x0977, code lost:
    
        r0 = "audio/eac3-joc";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x0a24  */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:1116:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:1120:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:1121:0x0c21  */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:1126:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x0c70 A[LOOP:11: B:891:0x069c->B:1135:0x0c70, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1232:0x0fa1 A[LOOP:5: B:827:0x03ee->B:1232:0x0fa1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1333:0x138d A[LOOP:1: B:741:0x00cf->B:1333:0x138d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1341:0x1359 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1345:0x0e05 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1362:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1368:0x09c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:956:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:974:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x0996  */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C6602pC m24226n(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6728rC.m24226n(org.xmlpull.v1.XmlPullParser, android.net.Uri):pC");
    }

    /* renamed from: o */
    public static C9481gJ0 m24227o(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new C9481gJ0(j, j2, attributeValue);
        }
        j = 0;
        j2 = -1;
        return new C9481gJ0(j, j2, attributeValue);
    }

    /* renamed from: p */
    public static int m24228p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: q */
    public static int m24229q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (PN1.m6356b("http://dashif.org/guidelines/trickmode", ((C1776bI) arrayList.get(i2)).f16929a)) {
                i = 16384;
            }
        }
        return i;
    }

    /* renamed from: r */
    public static PX0 m24230r(XmlPullParser xmlPullParser, PX0 px0) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM24225m = m24225m(xmlPullParser, "timescale", px0 != null ? px0.f9657b : 1L);
        long jM24225m2 = m24225m(xmlPullParser, "presentationTimeOffset", px0 != null ? px0.f9658c : 0L);
        long j3 = px0 != null ? px0.f9108d : 0L;
        long j4 = px0 != null ? px0.f9109e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j5 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            j2 = j5;
        } else {
            j = j4;
            j2 = j3;
        }
        C9481gJ0 c9481gJ0M24227o = px0 != null ? px0.f9656a : null;
        do {
            xmlPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParser, "Initialization")) {
                c9481gJ0M24227o = m24227o(xmlPullParser, "sourceURL", "range");
            } else {
                m24215b(xmlPullParser);
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, "SegmentBase"));
        return new PX0(c9481gJ0M24227o, jM24225m, jM24225m2, j2, j);
    }

    /* renamed from: s */
    public static MX0 m24231s(XmlPullParser xmlPullParser, MX0 mx0, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long jM24225m = m24225m(xmlPullParser, "timescale", mx0 != null ? mx0.f9657b : 1L);
        long jM24225m2 = m24225m(xmlPullParser, "presentationTimeOffset", mx0 != null ? mx0.f9658c : 0L);
        long jM24225m3 = m24225m(xmlPullParser, "duration", mx0 != null ? mx0.f6696e : -9223372036854775807L);
        long jM24225m4 = m24225m(xmlPullParser, "startNumber", mx0 != null ? mx0.f6695d : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        C9481gJ0 c9481gJ0M24227o = null;
        List listM24233u = null;
        do {
            xmlPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParser, "Initialization")) {
                c9481gJ0M24227o = m24227o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC11492w12.m25545d(xmlPullParser, "SegmentTimeline")) {
                listM24233u = m24233u(xmlPullParser, jM24225m, j2);
            } else if (AbstractC11492w12.m25545d(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m24227o(xmlPullParser, "media", "mediaRange"));
            } else {
                m24215b(xmlPullParser);
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, "SegmentList"));
        if (mx0 != null) {
            if (c9481gJ0M24227o == null) {
                c9481gJ0M24227o = mx0.f9656a;
            }
            if (listM24233u == null) {
                listM24233u = mx0.f6697f;
            }
            if (arrayList == null) {
                arrayList = mx0.f7216j;
            }
        }
        return new MX0(c9481gJ0M24227o, jM24225m, jM24225m2, jM24225m4, jM24225m3, listM24233u, j7, arrayList, AbstractC7485Dh1.m1802Q(j5), AbstractC7485Dh1.m1802Q(j));
    }

    /* renamed from: t */
    public static NX0 m24232t(XmlPullParser xmlPullParser, NX0 nx0, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jM24225m = m24225m(xmlPullParser, "timescale", nx0 != null ? nx0.f9657b : 1L);
        long jM24225m2 = m24225m(xmlPullParser, "presentationTimeOffset", nx0 != null ? nx0.f9658c : 0L);
        long jM24225m3 = m24225m(xmlPullParser, "duration", nx0 != null ? nx0.f6696e : -9223372036854775807L);
        long jM24225m4 = m24225m(xmlPullParser, "startNumber", nx0 != null ? nx0.f6695d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C1776bI c1776bI = (C1776bI) list.get(i);
            if (PN1.m6356b("http://dashif.org/guidelines/last-segment-number", c1776bI.f16929a)) {
                j6 = Long.parseLong(c1776bI.f16930b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        C9481gJ0 c9481gJ0M24227o = null;
        C8539Xo1 c8539Xo1M24234v = m24234v(xmlPullParser, "media", nx0 != null ? nx0.f7858k : null);
        C8539Xo1 c8539Xo1M24234v2 = m24234v(xmlPullParser, "initialization", nx0 != null ? nx0.f7857j : null);
        List listM24233u = null;
        do {
            xmlPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParser, "Initialization")) {
                c9481gJ0M24227o = m24227o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC11492w12.m25545d(xmlPullParser, "SegmentTimeline")) {
                listM24233u = m24233u(xmlPullParser, jM24225m, j2);
            } else {
                m24215b(xmlPullParser);
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, "SegmentTemplate"));
        if (nx0 != null) {
            if (c9481gJ0M24227o == null) {
                c9481gJ0M24227o = nx0.f9656a;
            }
            if (listM24233u == null) {
                listM24233u = nx0.f6697f;
            }
        }
        return new NX0(c9481gJ0M24227o, jM24225m, jM24225m2, jM24225m4, j7, jM24225m3, listM24233u, j9, c8539Xo1M24234v2, c8539Xo1M24234v, AbstractC7485Dh1.m1802Q(j5), AbstractC7485Dh1.m1802Q(j));
    }

    /* renamed from: u */
    public static ArrayList m24233u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jM24214a = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int iM24224l = 0;
        do {
            xmlPullParser.next();
            if (AbstractC11492w12.m25545d(xmlPullParser, "S")) {
                long jM24225m = m24225m(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jM24214a = m24214a(arrayList, jM24214a, j3, iM24224l, jM24225m);
                }
                if (jM24225m == -9223372036854775807L) {
                    jM24225m = jM24214a;
                }
                long jM24225m2 = m24225m(xmlPullParser, UcumUtils.UCUM_DAYS, -9223372036854775807L);
                iM24224l = m24224l(xmlPullParser, "r", 0);
                z = true;
                j3 = jM24225m2;
                jM24214a = jM24225m;
            } else {
                m24215b(xmlPullParser);
            }
        } while (!AbstractC11492w12.m25543b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            int i = AbstractC7485Dh1.f2166a;
            m24214a(arrayList, jM24214a, j3, iM24224l, AbstractC7485Dh1.m1810Y(j2, j, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0125 A[SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C8539Xo1 m24234v(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, p000.C8539Xo1 r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6728rC.m24234v(org.xmlpull.v1.XmlPullParser, java.lang.String, Xo1):Xo1");
    }

    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    public final Object mo5748i(Uri uri, C1771bD c1771bD) throws XmlPullParserException, C10103lA0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f41375a.newPullParser();
            xmlPullParserNewPullParser.setInput(c1771bD, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return m24226n(xmlPullParserNewPullParser, uri);
            }
            throw C10103lA0.m22367b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw C10103lA0.m22367b(null, e);
        }
    }
}
