package defpackage;

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
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: rC */
/* loaded from: classes.dex */
public final class C6793rC extends DefaultHandler implements InterfaceC5834mA0 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public C6793rC() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = AbstractC0277Dh1.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new OX0(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (AbstractC7715w12.c(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (AbstractC7715w12.c(xmlPullParser)) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6793rC.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z) throws XmlPullParserException, IOException {
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
                b(xmlPullParser);
            }
        } while (!AbstractC7715w12.b(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC2051a02.e(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC6949s10.a(new C0896Lg(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0896Lg c0896Lg = (C0896Lg) list.get(i3);
            String strH = AbstractC2051a02.h(c0896Lg.a, text);
            String str = attributeValue3 == null ? strH : attributeValue3;
            if (z) {
                i = c0896Lg.c;
                i2 = c0896Lg.d;
                str = c0896Lg.b;
            }
            arrayList.add(new C0896Lg(strH, str, i, i2));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6793rC.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
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

    public static C2297bI h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, NotificationConstants.ID);
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC7715w12.b(xmlPullParser, str));
        return new C2297bI(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = AbstractC0277Dh1.i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = ConfigValue.DOUBLE_DEFAULT_VALUE;
        double d3 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d4 = d3 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d5 = d4 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d6 = d5 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d7 = d6 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d2 = Double.parseDouble(strGroup6);
        }
        long j2 = (long) ((d7 + d2) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6412pC n(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6793rC.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):pC");
    }

    public static C3939gJ0 o(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
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
            return new C3939gJ0(j, j2, attributeValue);
        }
        j = 0;
        j2 = -1;
        return new C3939gJ0(j, j2, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (PN1.b("http://dashif.org/guidelines/trickmode", ((C2297bI) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static PX0 r(XmlPullParser xmlPullParser, PX0 px0) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2;
        long jM = m(xmlPullParser, "timescale", px0 != null ? px0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", px0 != null ? px0.c : 0L);
        long j3 = px0 != null ? px0.d : 0L;
        long j4 = px0 != null ? px0.e : 0L;
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
        C3939gJ0 c3939gJ0O = px0 != null ? px0.a : null;
        do {
            xmlPullParser.next();
            if (AbstractC7715w12.d(xmlPullParser, "Initialization")) {
                c3939gJ0O = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC7715w12.b(xmlPullParser, "SegmentBase"));
        return new PX0(c3939gJ0O, jM, jM2, j2, j);
    }

    public static MX0 s(XmlPullParser xmlPullParser, MX0 mx0, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long jM = m(xmlPullParser, "timescale", mx0 != null ? mx0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", mx0 != null ? mx0.c : 0L);
        long jM3 = m(xmlPullParser, "duration", mx0 != null ? mx0.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", mx0 != null ? mx0.d : 1L);
        long j6 = j4 == -9223372036854775807L ? j3 : j4;
        long j7 = j6 == Long.MAX_VALUE ? -9223372036854775807L : j6;
        List arrayList = null;
        C3939gJ0 c3939gJ0O = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC7715w12.d(xmlPullParser, "Initialization")) {
                c3939gJ0O = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC7715w12.d(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else if (AbstractC7715w12.d(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC7715w12.b(xmlPullParser, "SegmentList"));
        if (mx0 != null) {
            if (c3939gJ0O == null) {
                c3939gJ0O = mx0.a;
            }
            if (listU == null) {
                listU = mx0.f;
            }
            if (arrayList == null) {
                arrayList = mx0.j;
            }
        }
        return new MX0(c3939gJ0O, jM, jM2, jM4, jM3, listU, j7, arrayList, AbstractC0277Dh1.Q(j5), AbstractC0277Dh1.Q(j));
    }

    public static NX0 t(XmlPullParser xmlPullParser, NX0 nx0, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long jM = m(xmlPullParser, "timescale", nx0 != null ? nx0.b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", nx0 != null ? nx0.c : 0L);
        long jM3 = m(xmlPullParser, "duration", nx0 != null ? nx0.e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", nx0 != null ? nx0.d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C2297bI c2297bI = (C2297bI) list.get(i);
            if (PN1.b("http://dashif.org/guidelines/last-segment-number", c2297bI.a)) {
                j6 = Long.parseLong(c2297bI.b);
                break;
            }
            i++;
        }
        long j7 = j6;
        long j8 = j4 == -9223372036854775807L ? j3 : j4;
        long j9 = j8 == Long.MAX_VALUE ? -9223372036854775807L : j8;
        C3939gJ0 c3939gJ0O = null;
        C1857Xo1 c1857Xo1V = v(xmlPullParser, "media", nx0 != null ? nx0.k : null);
        C1857Xo1 c1857Xo1V2 = v(xmlPullParser, "initialization", nx0 != null ? nx0.j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC7715w12.d(xmlPullParser, "Initialization")) {
                c3939gJ0O = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC7715w12.d(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC7715w12.b(xmlPullParser, "SegmentTemplate"));
        if (nx0 != null) {
            if (c3939gJ0O == null) {
                c3939gJ0O = nx0.a;
            }
            if (listU == null) {
                listU = nx0.f;
            }
        }
        return new NX0(c3939gJ0O, jM, jM2, jM4, j7, jM3, listU, j9, c1857Xo1V2, c1857Xo1V, AbstractC0277Dh1.Q(j5), AbstractC0277Dh1.Q(j));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int iL = 0;
        do {
            xmlPullParser.next();
            if (AbstractC7715w12.d(xmlPullParser, "S")) {
                long jM = m(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jA = a(arrayList, jA, j3, iL, jM);
                }
                if (jM == -9223372036854775807L) {
                    jM = jA;
                }
                long jM2 = m(xmlPullParser, UcumUtils.UCUM_DAYS, -9223372036854775807L);
                iL = l(xmlPullParser, "r", 0);
                z = true;
                j3 = jM2;
                jA = jM;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC7715w12.b(xmlPullParser, "SegmentTimeline"));
        if (z) {
            int i = AbstractC0277Dh1.a;
            a(arrayList, jA, j3, iL, AbstractC0277Dh1.Y(j2, j, 1000L, RoundingMode.FLOOR));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1857Xo1 v(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, defpackage.C1857Xo1 r14) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6793rC.v(org.xmlpull.v1.XmlPullParser, java.lang.String, Xo1):Xo1");
    }

    @Override // defpackage.InterfaceC5834mA0
    public final Object i(Uri uri, C2282bD c2282bD) throws XmlPullParserException, C5643lA0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(c2282bD, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return n(xmlPullParserNewPullParser, uri);
            }
            throw C5643lA0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw C5643lA0.b(null, e2);
        }
    }
}
