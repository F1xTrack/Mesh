package p000;

import android.net.Uri;
import android.util.Base64;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: x30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11623x30 implements InterfaceC10231mA0 {

    /* renamed from: a */
    public final C11240u30 f45336a;

    /* renamed from: b */
    public final C10728q30 f45337b;

    /* renamed from: c */
    public static final Pattern f45312c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    public static final Pattern f45313d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    public static final Pattern f45314e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f45315f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f45316g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    public static final Pattern f45317h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f45318i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    public static final Pattern f45319j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    public static final Pattern f45320k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    public static final Pattern f45321l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    public static final Pattern f45322m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    public static final Pattern f45323n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    public static final Pattern f45324o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f45325p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    public static final Pattern f45326q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    public static final Pattern f45327r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    public static final Pattern f45328s = m25742a("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    public static final Pattern f45329t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    public static final Pattern f45330u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    public static final Pattern f45331v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f45332w = m25742a("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    public static final Pattern f45333x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    public static final Pattern f45334y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    public static final Pattern f45335z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    public static final Pattern f45284A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    public static final Pattern f45285B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    public static final Pattern f45286C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    public static final Pattern f45287D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    public static final Pattern f45288E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    public static final Pattern f45289F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    public static final Pattern f45290G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    public static final Pattern f45291H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    public static final Pattern f45292I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    public static final Pattern f45293J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    public static final Pattern f45294K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    public static final Pattern f45295L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    public static final Pattern f45296M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    public static final Pattern f45297N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    public static final Pattern f45298O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    public static final Pattern f45299P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f45300Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f45301R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f45302S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    public static final Pattern f45303T = m25742a("AUTOSELECT");

    /* renamed from: U */
    public static final Pattern f45304U = m25742a("DEFAULT");

    /* renamed from: V */
    public static final Pattern f45305V = m25742a("FORCED");

    /* renamed from: W */
    public static final Pattern f45306W = m25742a("INDEPENDENT");

    /* renamed from: X */
    public static final Pattern f45307X = m25742a("GAP");

    /* renamed from: Y */
    public static final Pattern f45308Y = m25742a("PRECISE");

    /* renamed from: Z */
    public static final Pattern f45309Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0 */
    public static final Pattern f45310a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0 */
    public static final Pattern f45311b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C11623x30(C11240u30 c11240u30, C10728q30 c10728q30) {
        this.f45336a = c11240u30;
        this.f45337b = c10728q30;
    }

    /* renamed from: a */
    public static Pattern m25742a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* renamed from: b */
    public static C0589JL m25743b(String str, C0526IL[] c0526ilArr) {
        C0526IL[] c0526ilArr2 = new C0526IL[c0526ilArr.length];
        for (int i = 0; i < c0526ilArr.length; i++) {
            C0526IL c0526il = c0526ilArr[i];
            c0526ilArr2[i] = new C0526IL(c0526il.f4899b, c0526il.f4900c, c0526il.f4901d, null);
        }
        return new C0589JL(str, true, c0526ilArr2);
    }

    /* renamed from: c */
    public static C0526IL m25744c(String str, HashMap map, String str2) throws C10103lA0 {
        String strM25750j = m25750j(str, f45293J, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f45294K;
        if (zEquals) {
            String strM25751k = m25751k(str, pattern, map);
            return new C0526IL(AbstractC0865Nk.f7980d, null, "video/mp4", Base64.decode(strM25751k.substring(strM25751k.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0865Nk.f7980d;
            int i = AbstractC7485Dh1.f2166a;
            return new C0526IL(uuid, null, "hls", str.getBytes(AbstractC7227yr.f46511c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM25750j)) {
            return null;
        }
        String strM25751k2 = m25751k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM25751k2.substring(strM25751k2.indexOf(44)), 0);
        UUID uuid2 = AbstractC0865Nk.f7981e;
        return new C0526IL(uuid2, null, "video/mp4", AbstractC11154tN1.m24915a(uuid2, null, bArrDecode));
    }

    /* renamed from: d */
    public static C10728q30 m25745d(C11240u30 c11240u30, C10728q30 c10728q30, C10910rT1 c10910rT1, String str) throws C11496w30, C10103lA0, NumberFormatException {
        int i;
        String str2;
        HashMap map;
        HashMap map2;
        C10088l30 c10088l30;
        ArrayList arrayList;
        String str3;
        C10088l30 c10088l302;
        int i2;
        String str4;
        HashMap map3;
        int i3;
        long j;
        long j2;
        HashMap map4;
        C10344n30 c10344n30;
        C0589JL c0589jl;
        C11240u30 c11240u302 = c11240u30;
        C10728q30 c10728q302 = c10728q30;
        boolean z = c11240u302.f44121c;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C10600p30 c10600p30 = new C10600p30(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z2 = z;
        C10600p30 c10600p302 = c10600p30;
        String strM25750j = "";
        long j3 = -1;
        int i4 = 0;
        boolean zM25747f = false;
        long j4 = -9223372036854775807L;
        long jM1802Q = 0;
        boolean z3 = false;
        int i5 = 0;
        long j5 = 0;
        int i6 = 1;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        C0589JL c0589jlM25743b = null;
        long j8 = 0;
        C0589JL c0589jl2 = null;
        long j9 = 0;
        long j10 = 0;
        boolean z5 = false;
        String strM25751k = null;
        String str6 = null;
        String str7 = null;
        int i7 = 0;
        long j11 = 0;
        boolean z6 = false;
        C10344n30 c10344n302 = null;
        long jLongValue = 0;
        long j12 = 0;
        ArrayList arrayList6 = arrayList3;
        C10088l30 c10088l303 = null;
        while (c10910rT1.m24388z()) {
            String strM24370D = c10910rT1.m24370D();
            if (strM24370D.startsWith("#EXT")) {
                arrayList5.add(strM24370D);
            }
            if (strM24370D.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM25751k2 = m25751k(strM24370D, f45326q, map5);
                if ("VOD".equals(strM25751k2)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM25751k2)) {
                    i4 = 2;
                }
            } else if (strM24370D.equals("#EXT-X-I-FRAMES-ONLY")) {
                z6 = true;
            } else {
                if (strM24370D.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j13 = (long) (Double.parseDouble(m25751k(strM24370D, f45286C, Collections.emptyMap())) * 1000000.0d);
                    zM25747f = m25747f(strM24370D, f45308Y);
                    j4 = j13;
                } else {
                    str2 = str5;
                    if (strM24370D.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dM25748g = m25748g(strM24370D, f45327r);
                        long j14 = dM25748g == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM25748g * 1000000.0d);
                        boolean zM25747f2 = m25747f(strM24370D, f45328s);
                        double dM25748g2 = m25748g(strM24370D, f45330u);
                        long j15 = dM25748g2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM25748g2 * 1000000.0d);
                        double dM25748g3 = m25748g(strM24370D, f45331v);
                        c10600p302 = new C10600p30(j14, zM25747f2, j15, dM25748g3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM25748g3 * 1000000.0d), m25747f(strM24370D, f45332w));
                    } else if (strM24370D.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (Double.parseDouble(m25751k(strM24370D, f45324o, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strM24370D.startsWith("#EXT-X-MAP");
                        Pattern pattern = f45288E;
                        boolean z7 = zM25747f;
                        Pattern pattern2 = f45294K;
                        if (zStartsWith) {
                            String strM25751k3 = m25751k(strM24370D, pattern2, map5);
                            String strM25750j2 = m25750j(strM24370D, pattern, null, map5);
                            if (strM25750j2 != null) {
                                int i8 = AbstractC7485Dh1.f2166a;
                                String[] strArrSplit = strM25750j2.split("@", -1);
                                j3 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j8 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j3 == -1) {
                                j8 = 0;
                            }
                            if (strM25751k != null && str6 == null) {
                                throw C10103lA0.m22367b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c10344n302 = new C10344n30(strM25751k3, j8, j3, strM25751k, str6);
                            if (j3 != -1) {
                                j8 += j3;
                            }
                            j3 = -1;
                            str5 = str2;
                            zM25747f = z7;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strM24370D.startsWith("#EXT-X-TARGETDURATION")) {
                                j6 = Integer.parseInt(m25751k(strM24370D, f45322m, Collections.emptyMap())) * 1000000;
                            } else if (strM24370D.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j9 = Long.parseLong(m25751k(strM24370D, f45333x, Collections.emptyMap()));
                                j5 = j9;
                            } else if (strM24370D.startsWith("#EXT-X-VERSION")) {
                                i6 = Integer.parseInt(m25751k(strM24370D, f45325p, Collections.emptyMap()));
                            } else {
                                if (strM24370D.startsWith("#EXT-X-DEFINE")) {
                                    String strM25750j3 = m25750j(strM24370D, f45310a0, null, map5);
                                    if (strM25750j3 != null) {
                                        String str8 = (String) c11240u302.f43464l.get(strM25750j3);
                                        if (str8 != null) {
                                            map5.put(strM25750j3, str8);
                                        }
                                    } else {
                                        map5.put(m25751k(strM24370D, f45299P, map5), m25751k(strM24370D, f45309Z, map5));
                                    }
                                    map = map5;
                                    map2 = map6;
                                    c10088l30 = c10088l303;
                                    arrayList = arrayList7;
                                    str3 = str7;
                                } else if (strM24370D.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(m25751k(strM24370D, f45334y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strM25750j = m25750j(strM24370D, f45335z, str2, map5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    zM25747f = z7;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str9 = str2;
                                    if (strM24370D.startsWith("#EXT-X-SKIP")) {
                                        int i9 = Integer.parseInt(m25751k(strM24370D, f45329t, Collections.emptyMap()));
                                        YN1.m9281f(c10728q302 != null && arrayList2.isEmpty());
                                        int i10 = AbstractC7485Dh1.f2166a;
                                        int i11 = (int) (j5 - c10728q302.f40547k);
                                        int i12 = i9 + i11;
                                        if (i11 >= 0) {
                                            P70 p70 = c10728q302.f40554r;
                                            if (i12 <= p70.size()) {
                                                while (i11 < i12) {
                                                    C10344n30 c10344n303 = (C10344n30) p70.get(i11);
                                                    if (j5 != c10728q302.f40547k) {
                                                        int i13 = (c10728q302.f40546j - i5) + c10344n303.f38738d;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j16 = j11;
                                                        int i14 = 0;
                                                        while (true) {
                                                            P70 p702 = c10344n303.f38066m;
                                                            i2 = i12;
                                                            if (i14 >= p702.size()) {
                                                                break;
                                                            }
                                                            C10088l30 c10088l304 = (C10088l30) p702.get(i14);
                                                            arrayList9.add(new C10088l30(c10088l304.f38735a, c10088l304.f38736b, c10088l304.f38737c, i13, j16, c10088l304.f38740f, c10088l304.f38741g, c10088l304.f38742h, c10088l304.f38743i, c10088l304.f38744j, c10088l304.f38745k, c10088l304.f36844l, c10088l304.f36845m));
                                                            j16 += c10088l304.f38737c;
                                                            i14++;
                                                            map6 = map6;
                                                            i12 = i2;
                                                            str9 = str9;
                                                            c10088l303 = c10088l303;
                                                        }
                                                        c10088l302 = c10088l303;
                                                        str4 = str9;
                                                        map3 = map6;
                                                        c10344n303 = new C10344n30(c10344n303.f38735a, c10344n303.f38736b, c10344n303.f38065l, c10344n303.f38737c, i13, j11, c10344n303.f38740f, c10344n303.f38741g, c10344n303.f38742h, c10344n303.f38743i, c10344n303.f38744j, c10344n303.f38745k, arrayList9);
                                                    } else {
                                                        c10088l302 = c10088l303;
                                                        i2 = i12;
                                                        str4 = str9;
                                                        map3 = map6;
                                                    }
                                                    arrayList2.add(c10344n303);
                                                    j11 += c10344n303.f38737c;
                                                    long j17 = c10344n303.f38744j;
                                                    if (j17 != -1) {
                                                        j8 = c10344n303.f38743i + j17;
                                                    }
                                                    String str10 = c10344n303.f38742h;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j9))) {
                                                        str6 = str10;
                                                    }
                                                    j9++;
                                                    i11++;
                                                    i7 = c10344n303.f38738d;
                                                    c10344n302 = c10344n303.f38736b;
                                                    c0589jl2 = c10344n303.f38740f;
                                                    strM25751k = c10344n303.f38741g;
                                                    map6 = map3;
                                                    i12 = i2;
                                                    j10 = j11;
                                                    str9 = str4;
                                                    c10088l303 = c10088l302;
                                                    c10728q302 = c10728q30;
                                                }
                                                str2 = str9;
                                                c11240u302 = c11240u30;
                                                c10728q302 = c10728q30;
                                            }
                                        }
                                        throw new C11496w30();
                                    }
                                    c10088l30 = c10088l303;
                                    str2 = str9;
                                    HashMap map7 = map6;
                                    if (strM24370D.startsWith("#EXT-X-KEY")) {
                                        String strM25751k4 = m25751k(strM24370D, f45291H, map5);
                                        String strM25750j4 = m25750j(strM24370D, f45292I, "identity", map5);
                                        if ("NONE".equals(strM25751k4)) {
                                            treeMap.clear();
                                            c0589jl2 = null;
                                            strM25751k = null;
                                            str6 = null;
                                        } else {
                                            String strM25750j5 = m25750j(strM24370D, f45295L, null, map5);
                                            if (!"identity".equals(strM25750j4)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strM25751k4) || "SAMPLE-AES-CTR".equals(strM25751k4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                C0526IL c0526ilM25744c = m25744c(strM24370D, map5, strM25750j4);
                                                if (c0526ilM25744c != null) {
                                                    treeMap.put(strM25750j4, c0526ilM25744c);
                                                    str6 = strM25750j5;
                                                    c0589jl2 = null;
                                                }
                                                strM25751k = null;
                                            } else if ("AES-128".equals(strM25751k4)) {
                                                strM25751k = m25751k(strM24370D, pattern2, map5);
                                                str6 = strM25750j5;
                                            }
                                            str6 = strM25750j5;
                                            strM25751k = null;
                                        }
                                        c11240u302 = c11240u30;
                                        c10728q302 = c10728q30;
                                        map6 = map7;
                                    } else {
                                        str3 = str7;
                                        if (strM24370D.startsWith("#EXT-X-BYTERANGE")) {
                                            String strM25751k5 = m25751k(strM24370D, f45287D, map5);
                                            int i15 = AbstractC7485Dh1.f2166a;
                                            String[] strArrSplit2 = strM25751k5.split("@", -1);
                                            j3 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j8 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strM24370D.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i5 = Integer.parseInt(strM24370D.substring(strM24370D.indexOf(58) + 1));
                                            c11240u302 = c11240u30;
                                            c10728q302 = c10728q30;
                                            z3 = true;
                                            map6 = map7;
                                            str7 = str3;
                                        } else if (strM24370D.equals("#EXT-X-DISCONTINUITY")) {
                                            i7++;
                                        } else if (strM24370D.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jM1802Q == 0) {
                                                jM1802Q = AbstractC7485Dh1.m1802Q(AbstractC7485Dh1.m1805T(strM24370D.substring(strM24370D.indexOf(58) + 1))) - j11;
                                            } else {
                                                map = map5;
                                                arrayList = arrayList7;
                                                map2 = map7;
                                            }
                                        } else if (strM24370D.equals("#EXT-X-GAP")) {
                                            c11240u302 = c11240u30;
                                            c10728q302 = c10728q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zM25747f = z7;
                                            arrayList5 = arrayList8;
                                            c10088l303 = c10088l30;
                                            z5 = true;
                                        } else if (strM24370D.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c11240u302 = c11240u30;
                                            c10728q302 = c10728q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zM25747f = z7;
                                            arrayList5 = arrayList8;
                                            c10088l303 = c10088l30;
                                            z2 = true;
                                        } else if (strM24370D.equals("#EXT-X-ENDLIST")) {
                                            c11240u302 = c11240u30;
                                            c10728q302 = c10728q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zM25747f = z7;
                                            arrayList5 = arrayList8;
                                            c10088l303 = c10088l30;
                                            z4 = true;
                                        } else {
                                            if (strM24370D.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jM25749h = m25749h(strM24370D, f45284A);
                                                Matcher matcher = f45285B.matcher(strM24370D);
                                                if (matcher.find()) {
                                                    String strGroup = matcher.group(1);
                                                    strGroup.getClass();
                                                    i3 = Integer.parseInt(strGroup);
                                                } else {
                                                    i3 = -1;
                                                }
                                                arrayList4.add(new C10216m30(Uri.parse(AbstractC8668a02.m9659h(str, m25751k(strM24370D, pattern2, map5))), jM25749h, i3));
                                            } else if (strM24370D.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (c10088l30 == null && "PART".equals(m25751k(strM24370D, f45297N, map5))) {
                                                    String strM25751k6 = m25751k(strM24370D, pattern2, map5);
                                                    long jM25749h2 = m25749h(strM24370D, f45289F);
                                                    long jM25749h3 = m25749h(strM24370D, f45290G);
                                                    String hexString = strM25751k == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    if (c0589jl2 == null && !treeMap.isEmpty()) {
                                                        C0526IL[] c0526ilArr = (C0526IL[]) treeMap.values().toArray(new C0526IL[0]);
                                                        C0589JL c0589jl3 = new C0589JL(str3, true, c0526ilArr);
                                                        if (c0589jlM25743b == null) {
                                                            c0589jlM25743b = m25743b(str3, c0526ilArr);
                                                        }
                                                        c0589jl2 = c0589jl3;
                                                    }
                                                    if (jM25749h2 == -1 || jM25749h3 != -1) {
                                                        c10088l30 = new C10088l30(strM25751k6, c10344n302, 0L, i7, j10, c0589jl2, strM25751k, hexString, jM25749h2 != -1 ? jM25749h2 : 0L, jM25749h3, false, false, true);
                                                    }
                                                }
                                            } else if (strM24370D.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strM25751k == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                String strM25751k7 = m25751k(strM24370D, pattern2, map5);
                                                long j18 = (long) (Double.parseDouble(m25751k(strM24370D, f45323n, Collections.emptyMap())) * 1000000.0d);
                                                boolean zM25747f3 = m25747f(strM24370D, f45306W) | (z2 && arrayList7.isEmpty());
                                                boolean zM25747f4 = m25747f(strM24370D, f45307X);
                                                String strM25750j6 = m25750j(strM24370D, pattern, null, map5);
                                                if (strM25750j6 != null) {
                                                    int i16 = AbstractC7485Dh1.f2166a;
                                                    String[] strArrSplit3 = strM25750j6.split("@", -1);
                                                    j = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j12 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j = -1;
                                                }
                                                if (j == -1) {
                                                    j12 = 0;
                                                }
                                                if (c0589jl2 == null && !treeMap.isEmpty()) {
                                                    C0526IL[] c0526ilArr2 = (C0526IL[]) treeMap.values().toArray(new C0526IL[0]);
                                                    C0589JL c0589jl4 = new C0589JL(str3, true, c0526ilArr2);
                                                    if (c0589jlM25743b == null) {
                                                        c0589jlM25743b = m25743b(str3, c0526ilArr2);
                                                    }
                                                    c0589jl2 = c0589jl4;
                                                }
                                                arrayList7.add(new C10088l30(strM25751k7, c10344n302, j18, i7, j10, c0589jl2, strM25751k, hexString2, j12, j, zM25747f4, zM25747f3, false));
                                                j10 += j18;
                                                if (j != -1) {
                                                    j12 += j;
                                                }
                                                c11240u302 = c11240u30;
                                                c10728q302 = c10728q30;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zM25747f = z7;
                                                arrayList5 = arrayList8;
                                                c10088l303 = c10088l30;
                                            } else {
                                                arrayList = arrayList7;
                                                if (strM24370D.startsWith("#")) {
                                                    map = map5;
                                                    map2 = map7;
                                                } else {
                                                    String hexString3 = strM25751k == null ? null : str6 != null ? str6 : Long.toHexString(j9);
                                                    long j19 = j9 + 1;
                                                    String strM25752l = m25752l(strM24370D, map5);
                                                    C10344n30 c10344n304 = (C10344n30) map7.get(strM25752l);
                                                    if (j3 == -1) {
                                                        j2 = 0;
                                                    } else {
                                                        if (z6 && c10344n302 == null && c10344n304 == null) {
                                                            c10344n304 = new C10344n30(strM25752l, 0L, j8, null, null);
                                                            map7.put(strM25752l, c10344n304);
                                                        }
                                                        j2 = j8;
                                                    }
                                                    if (c0589jl2 != null || treeMap.isEmpty()) {
                                                        map4 = map5;
                                                        c10344n30 = c10344n304;
                                                        c0589jl = c0589jl2;
                                                    } else {
                                                        map4 = map5;
                                                        c10344n30 = c10344n304;
                                                        C0526IL[] c0526ilArr3 = (C0526IL[]) treeMap.values().toArray(new C0526IL[0]);
                                                        c0589jl = new C0589JL(str3, true, c0526ilArr3);
                                                        if (c0589jlM25743b == null) {
                                                            c0589jlM25743b = m25743b(str3, c0526ilArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new C10344n30(strM25752l, c10344n302 != null ? c10344n302 : c10344n30, strM25750j, jLongValue, i7, j11, c0589jl, strM25751k, hexString3, j2, j3, z5, arrayList));
                                                    j10 = j11 + jLongValue;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j3 != -1) {
                                                        j2 += j3;
                                                    }
                                                    j8 = j2;
                                                    c10728q302 = c10728q30;
                                                    arrayList6 = arrayList10;
                                                    map6 = map7;
                                                    str7 = str3;
                                                    c0589jl2 = c0589jl;
                                                    j3 = -1;
                                                    j11 = j10;
                                                    j9 = j19;
                                                    map5 = map4;
                                                    str5 = str2;
                                                    strM25750j = str5;
                                                    zM25747f = z7;
                                                    arrayList5 = arrayList8;
                                                    c10088l303 = c10088l30;
                                                    z5 = false;
                                                    jLongValue = 0;
                                                    c11240u302 = c11240u30;
                                                }
                                            }
                                            map = map5;
                                            arrayList = arrayList7;
                                            map2 = map7;
                                        }
                                        c11240u302 = c11240u30;
                                        c10728q302 = c10728q30;
                                        map6 = map7;
                                        str7 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    zM25747f = z7;
                                    arrayList5 = arrayList8;
                                    c10088l303 = c10088l30;
                                }
                                c11240u302 = c11240u30;
                                c10728q302 = c10728q30;
                                map6 = map2;
                                str7 = str3;
                                arrayList6 = arrayList;
                                map5 = map;
                                str5 = str2;
                                zM25747f = z7;
                                arrayList5 = arrayList8;
                                c10088l303 = c10088l30;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            zM25747f = z7;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        C10088l30 c10088l305 = c10088l303;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z8 = zM25747f;
        HashMap map8 = new HashMap();
        int i17 = 0;
        while (i17 < arrayList4.size()) {
            C10216m30 c10216m30 = (C10216m30) arrayList4.get(i17);
            long size = c10216m30.f37435b;
            if (size == -1) {
                size = (j5 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = c10216m30.f37436c;
            if (size2 != -1 || j7 == -9223372036854775807L) {
                i = 1;
            } else {
                i = 1;
                size2 = (arrayList11.isEmpty() ? ((C10344n30) AbstractC11239u22.m25079b(arrayList2)).f38066m : arrayList11).size() - 1;
            }
            Uri uri = c10216m30.f37434a;
            map8.put(uri, new C10216m30(uri, size, size2));
            i17 += i;
        }
        if (c10088l305 != null) {
            arrayList11.add(c10088l305);
        }
        return new C10728q30(i4, str, arrayList12, j4, z8, jM1802Q, z3, i5, j5, i6, j6, j7, z2, z4, jM1802Q != 0, c0589jlM25743b, arrayList2, arrayList11, c10600p302, map8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x03b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C11240u30 m25746e(p000.C10910rT1 r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11623x30.m25746e(rT1, java.lang.String):u30");
    }

    /* renamed from: f */
    public static boolean m25747f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: g */
    public static double m25748g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* renamed from: h */
    public static long m25749h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* renamed from: j */
    public static String m25750j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m25752l(str2, map);
    }

    /* renamed from: k */
    public static String m25751k(String str, Pattern pattern, Map map) throws C10103lA0 {
        String strM25750j = m25750j(str, pattern, null, map);
        if (strM25750j != null) {
            return strM25750j;
        }
        throw C10103lA0.m22367b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    /* renamed from: l */
    public static String m25752l(String str, Map map) {
        Matcher matcher = f45311b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:32:0x0069, B:34:0x006f, B:37:0x007a, B:39:0x0082, B:43:0x0098, B:45:0x00a0, B:47:0x00a8, B:49:0x00b0, B:51:0x00b8, B:53:0x00c0, B:55:0x00c8, B:57:0x00d0, B:60:0x00d9, B:61:0x00dd, B:66:0x00fd, B:67:0x0103, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f A[SYNTHETIC] */
    @Override // p000.InterfaceC10231mA0
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5748i(android.net.Uri r7, p000.C1771bD r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11623x30.mo5748i(android.net.Uri, bD):java.lang.Object");
    }
}
