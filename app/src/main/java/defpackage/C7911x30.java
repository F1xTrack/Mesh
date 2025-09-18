package defpackage;

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
public final class C7911x30 implements InterfaceC5834mA0 {
    public final C7339u30 a;
    public final C6576q30 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern s = a("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern w = a("CAN-BLOCK-RELOAD");
    public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = a("AUTOSELECT");
    public static final Pattern U = a("DEFAULT");
    public static final Pattern V = a("FORCED");
    public static final Pattern W = a("INDEPENDENT");
    public static final Pattern X = a("GAP");
    public static final Pattern Y = a("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public C7911x30(C7339u30 c7339u30, C6576q30 c6576q30) {
        this.a = c7339u30;
        this.b = c6576q30;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static JL b(String str, IL[] ilArr) {
        IL[] ilArr2 = new IL[ilArr.length];
        for (int i2 = 0; i2 < ilArr.length; i2++) {
            IL il = ilArr[i2];
            ilArr2[i2] = new IL(il.b, il.c, il.d, null);
        }
        return new JL(str, true, ilArr2);
    }

    public static IL c(String str, HashMap map, String str2) throws C5643lA0 {
        String strJ = j(str, J, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = K;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new IL(AbstractC1063Nk.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC1063Nk.d;
            int i2 = AbstractC0277Dh1.a;
            return new IL(uuid, null, "hls", str.getBytes(AbstractC8250yr.c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = AbstractC1063Nk.e;
        return new IL(uuid2, null, "video/mp4", AbstractC7210tN1.a(uuid2, null, bArrDecode));
    }

    public static C6576q30 d(C7339u30 c7339u30, C6576q30 c6576q30, C6846rT1 c6846rT1, String str) throws C7721w30, C5643lA0, NumberFormatException {
        int i2;
        String str2;
        HashMap map;
        HashMap map2;
        C5621l30 c5621l30;
        ArrayList arrayList;
        String str3;
        C5621l30 c5621l302;
        int i3;
        String str4;
        HashMap map3;
        int i4;
        long j2;
        long j3;
        HashMap map4;
        C6003n30 c6003n30;
        JL jl;
        C7339u30 c7339u302 = c7339u30;
        C6576q30 c6576q302 = c6576q30;
        boolean z2 = c7339u302.c;
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C6385p30 c6385p30 = new C6385p30(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z3 = z2;
        C6385p30 c6385p302 = c6385p30;
        String strJ = "";
        long j4 = -1;
        int i5 = 0;
        boolean zF = false;
        long j5 = -9223372036854775807L;
        long jQ = 0;
        boolean z4 = false;
        int i6 = 0;
        long j6 = 0;
        int i7 = 1;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        boolean z5 = false;
        JL jlB = null;
        long j9 = 0;
        JL jl2 = null;
        long j10 = 0;
        long j11 = 0;
        boolean z6 = false;
        String strK = null;
        String str6 = null;
        String str7 = null;
        int i8 = 0;
        long j12 = 0;
        boolean z7 = false;
        C6003n30 c6003n302 = null;
        long jLongValue = 0;
        long j13 = 0;
        ArrayList arrayList6 = arrayList3;
        C5621l30 c5621l303 = null;
        while (c6846rT1.z()) {
            String strD = c6846rT1.D();
            if (strD.startsWith("#EXT")) {
                arrayList5.add(strD);
            }
            if (strD.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strK2 = k(strD, q, map5);
                if ("VOD".equals(strK2)) {
                    i5 = 1;
                } else if ("EVENT".equals(strK2)) {
                    i5 = 2;
                }
            } else if (strD.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strD.startsWith("#EXT-X-START")) {
                    str2 = str5;
                    long j14 = (long) (Double.parseDouble(k(strD, C, Collections.emptyMap())) * 1000000.0d);
                    zF = f(strD, Y);
                    j5 = j14;
                } else {
                    str2 = str5;
                    if (strD.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double dG = g(strD, r);
                        long j15 = dG == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG * 1000000.0d);
                        boolean zF2 = f(strD, s);
                        double dG2 = g(strD, u);
                        long j16 = dG2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG2 * 1000000.0d);
                        double dG3 = g(strD, v);
                        c6385p302 = new C6385p30(j15, zF2, j16, dG3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dG3 * 1000000.0d), f(strD, w));
                    } else if (strD.startsWith("#EXT-X-PART-INF")) {
                        j8 = (long) (Double.parseDouble(k(strD, o, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean zStartsWith = strD.startsWith("#EXT-X-MAP");
                        Pattern pattern = E;
                        boolean z8 = zF;
                        Pattern pattern2 = K;
                        if (zStartsWith) {
                            String strK3 = k(strD, pattern2, map5);
                            String strJ2 = j(strD, pattern, null, map5);
                            if (strJ2 != null) {
                                int i9 = AbstractC0277Dh1.a;
                                String[] strArrSplit = strJ2.split("@", -1);
                                j4 = Long.parseLong(strArrSplit[0]);
                                if (strArrSplit.length > 1) {
                                    j9 = Long.parseLong(strArrSplit[1]);
                                }
                            }
                            if (j4 == -1) {
                                j9 = 0;
                            }
                            if (strK != null && str6 == null) {
                                throw C5643lA0.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            c6003n302 = new C6003n30(strK3, j9, j4, strK, str6);
                            if (j4 != -1) {
                                j9 += j4;
                            }
                            j4 = -1;
                            str5 = str2;
                            zF = z8;
                        } else {
                            ArrayList arrayList7 = arrayList6;
                            ArrayList arrayList8 = arrayList5;
                            if (strD.startsWith("#EXT-X-TARGETDURATION")) {
                                j7 = Integer.parseInt(k(strD, m, Collections.emptyMap())) * 1000000;
                            } else if (strD.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j10 = Long.parseLong(k(strD, x, Collections.emptyMap()));
                                j6 = j10;
                            } else if (strD.startsWith("#EXT-X-VERSION")) {
                                i7 = Integer.parseInt(k(strD, p, Collections.emptyMap()));
                            } else {
                                if (strD.startsWith("#EXT-X-DEFINE")) {
                                    String strJ3 = j(strD, a0, null, map5);
                                    if (strJ3 != null) {
                                        String str8 = (String) c7339u302.l.get(strJ3);
                                        if (str8 != null) {
                                            map5.put(strJ3, str8);
                                        }
                                    } else {
                                        map5.put(k(strD, P, map5), k(strD, Z, map5));
                                    }
                                    map = map5;
                                    map2 = map6;
                                    c5621l30 = c5621l303;
                                    arrayList = arrayList7;
                                    str3 = str7;
                                } else if (strD.startsWith("#EXTINF")) {
                                    jLongValue = new BigDecimal(k(strD, y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    strJ = j(strD, z, str2, map5);
                                    str5 = str2;
                                    arrayList6 = arrayList7;
                                    zF = z8;
                                    arrayList5 = arrayList8;
                                } else {
                                    String str9 = str2;
                                    if (strD.startsWith("#EXT-X-SKIP")) {
                                        int i10 = Integer.parseInt(k(strD, t, Collections.emptyMap()));
                                        YN1.f(c6576q302 != null && arrayList2.isEmpty());
                                        int i11 = AbstractC0277Dh1.a;
                                        int i12 = (int) (j6 - c6576q302.k);
                                        int i13 = i10 + i12;
                                        if (i12 >= 0) {
                                            P70 p70 = c6576q302.r;
                                            if (i13 <= p70.size()) {
                                                while (i12 < i13) {
                                                    C6003n30 c6003n303 = (C6003n30) p70.get(i12);
                                                    if (j6 != c6576q302.k) {
                                                        int i14 = (c6576q302.j - i6) + c6003n303.d;
                                                        ArrayList arrayList9 = new ArrayList();
                                                        long j17 = j12;
                                                        int i15 = 0;
                                                        while (true) {
                                                            P70 p702 = c6003n303.m;
                                                            i3 = i13;
                                                            if (i15 >= p702.size()) {
                                                                break;
                                                            }
                                                            C5621l30 c5621l304 = (C5621l30) p702.get(i15);
                                                            arrayList9.add(new C5621l30(c5621l304.a, c5621l304.b, c5621l304.c, i14, j17, c5621l304.f, c5621l304.g, c5621l304.h, c5621l304.i, c5621l304.j, c5621l304.k, c5621l304.l, c5621l304.m));
                                                            j17 += c5621l304.c;
                                                            i15++;
                                                            map6 = map6;
                                                            i13 = i3;
                                                            str9 = str9;
                                                            c5621l303 = c5621l303;
                                                        }
                                                        c5621l302 = c5621l303;
                                                        str4 = str9;
                                                        map3 = map6;
                                                        c6003n303 = new C6003n30(c6003n303.a, c6003n303.b, c6003n303.l, c6003n303.c, i14, j12, c6003n303.f, c6003n303.g, c6003n303.h, c6003n303.i, c6003n303.j, c6003n303.k, arrayList9);
                                                    } else {
                                                        c5621l302 = c5621l303;
                                                        i3 = i13;
                                                        str4 = str9;
                                                        map3 = map6;
                                                    }
                                                    arrayList2.add(c6003n303);
                                                    j12 += c6003n303.c;
                                                    long j18 = c6003n303.j;
                                                    if (j18 != -1) {
                                                        j9 = c6003n303.i + j18;
                                                    }
                                                    String str10 = c6003n303.h;
                                                    if (str10 == null || !str10.equals(Long.toHexString(j10))) {
                                                        str6 = str10;
                                                    }
                                                    j10++;
                                                    i12++;
                                                    i8 = c6003n303.d;
                                                    c6003n302 = c6003n303.b;
                                                    jl2 = c6003n303.f;
                                                    strK = c6003n303.g;
                                                    map6 = map3;
                                                    i13 = i3;
                                                    j11 = j12;
                                                    str9 = str4;
                                                    c5621l303 = c5621l302;
                                                    c6576q302 = c6576q30;
                                                }
                                                str2 = str9;
                                                c7339u302 = c7339u30;
                                                c6576q302 = c6576q30;
                                            }
                                        }
                                        throw new C7721w30();
                                    }
                                    c5621l30 = c5621l303;
                                    str2 = str9;
                                    HashMap map7 = map6;
                                    if (strD.startsWith("#EXT-X-KEY")) {
                                        String strK4 = k(strD, H, map5);
                                        String strJ4 = j(strD, I, "identity", map5);
                                        if ("NONE".equals(strK4)) {
                                            treeMap.clear();
                                            jl2 = null;
                                            strK = null;
                                            str6 = null;
                                        } else {
                                            String strJ5 = j(strD, L, null, map5);
                                            if (!"identity".equals(strJ4)) {
                                                String str11 = str7;
                                                if (str11 == null) {
                                                    str7 = ("SAMPLE-AES-CENC".equals(strK4) || "SAMPLE-AES-CTR".equals(strK4)) ? "cenc" : "cbcs";
                                                } else {
                                                    str7 = str11;
                                                }
                                                IL ilC = c(strD, map5, strJ4);
                                                if (ilC != null) {
                                                    treeMap.put(strJ4, ilC);
                                                    str6 = strJ5;
                                                    jl2 = null;
                                                }
                                                strK = null;
                                            } else if ("AES-128".equals(strK4)) {
                                                strK = k(strD, pattern2, map5);
                                                str6 = strJ5;
                                            }
                                            str6 = strJ5;
                                            strK = null;
                                        }
                                        c7339u302 = c7339u30;
                                        c6576q302 = c6576q30;
                                        map6 = map7;
                                    } else {
                                        str3 = str7;
                                        if (strD.startsWith("#EXT-X-BYTERANGE")) {
                                            String strK5 = k(strD, D, map5);
                                            int i16 = AbstractC0277Dh1.a;
                                            String[] strArrSplit2 = strK5.split("@", -1);
                                            j4 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j9 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (strD.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i6 = Integer.parseInt(strD.substring(strD.indexOf(58) + 1));
                                            c7339u302 = c7339u30;
                                            c6576q302 = c6576q30;
                                            z4 = true;
                                            map6 = map7;
                                            str7 = str3;
                                        } else if (strD.equals("#EXT-X-DISCONTINUITY")) {
                                            i8++;
                                        } else if (strD.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jQ == 0) {
                                                jQ = AbstractC0277Dh1.Q(AbstractC0277Dh1.T(strD.substring(strD.indexOf(58) + 1))) - j12;
                                            } else {
                                                map = map5;
                                                arrayList = arrayList7;
                                                map2 = map7;
                                            }
                                        } else if (strD.equals("#EXT-X-GAP")) {
                                            c7339u302 = c7339u30;
                                            c6576q302 = c6576q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList8;
                                            c5621l303 = c5621l30;
                                            z6 = true;
                                        } else if (strD.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            c7339u302 = c7339u30;
                                            c6576q302 = c6576q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList8;
                                            c5621l303 = c5621l30;
                                            z3 = true;
                                        } else if (strD.equals("#EXT-X-ENDLIST")) {
                                            c7339u302 = c7339u30;
                                            c6576q302 = c6576q30;
                                            map6 = map7;
                                            str7 = str3;
                                            arrayList6 = arrayList7;
                                            str5 = str2;
                                            zF = z8;
                                            arrayList5 = arrayList8;
                                            c5621l303 = c5621l30;
                                            z5 = true;
                                        } else {
                                            if (strD.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jH = h(strD, A);
                                                Matcher matcher = B.matcher(strD);
                                                if (matcher.find()) {
                                                    String strGroup = matcher.group(1);
                                                    strGroup.getClass();
                                                    i4 = Integer.parseInt(strGroup);
                                                } else {
                                                    i4 = -1;
                                                }
                                                arrayList4.add(new C5812m30(Uri.parse(AbstractC2051a02.h(str, k(strD, pattern2, map5))), jH, i4));
                                            } else if (strD.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (c5621l30 == null && "PART".equals(k(strD, N, map5))) {
                                                    String strK6 = k(strD, pattern2, map5);
                                                    long jH2 = h(strD, F);
                                                    long jH3 = h(strD, G);
                                                    String hexString = strK == null ? null : str6 != null ? str6 : Long.toHexString(j10);
                                                    if (jl2 == null && !treeMap.isEmpty()) {
                                                        IL[] ilArr = (IL[]) treeMap.values().toArray(new IL[0]);
                                                        JL jl3 = new JL(str3, true, ilArr);
                                                        if (jlB == null) {
                                                            jlB = b(str3, ilArr);
                                                        }
                                                        jl2 = jl3;
                                                    }
                                                    if (jH2 == -1 || jH3 != -1) {
                                                        c5621l30 = new C5621l30(strK6, c6003n302, 0L, i8, j11, jl2, strK, hexString, jH2 != -1 ? jH2 : 0L, jH3, false, false, true);
                                                    }
                                                }
                                            } else if (strD.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j10);
                                                String strK7 = k(strD, pattern2, map5);
                                                long j19 = (long) (Double.parseDouble(k(strD, n, Collections.emptyMap())) * 1000000.0d);
                                                boolean zF3 = f(strD, W) | (z3 && arrayList7.isEmpty());
                                                boolean zF4 = f(strD, X);
                                                String strJ6 = j(strD, pattern, null, map5);
                                                if (strJ6 != null) {
                                                    int i17 = AbstractC0277Dh1.a;
                                                    String[] strArrSplit3 = strJ6.split("@", -1);
                                                    j2 = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j13 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j2 = -1;
                                                }
                                                if (j2 == -1) {
                                                    j13 = 0;
                                                }
                                                if (jl2 == null && !treeMap.isEmpty()) {
                                                    IL[] ilArr2 = (IL[]) treeMap.values().toArray(new IL[0]);
                                                    JL jl4 = new JL(str3, true, ilArr2);
                                                    if (jlB == null) {
                                                        jlB = b(str3, ilArr2);
                                                    }
                                                    jl2 = jl4;
                                                }
                                                arrayList7.add(new C5621l30(strK7, c6003n302, j19, i8, j11, jl2, strK, hexString2, j13, j2, zF4, zF3, false));
                                                j11 += j19;
                                                if (j2 != -1) {
                                                    j13 += j2;
                                                }
                                                c7339u302 = c7339u30;
                                                c6576q302 = c6576q30;
                                                map6 = map7;
                                                str7 = str3;
                                                arrayList6 = arrayList7;
                                                str5 = str2;
                                                zF = z8;
                                                arrayList5 = arrayList8;
                                                c5621l303 = c5621l30;
                                            } else {
                                                arrayList = arrayList7;
                                                if (strD.startsWith("#")) {
                                                    map = map5;
                                                    map2 = map7;
                                                } else {
                                                    String hexString3 = strK == null ? null : str6 != null ? str6 : Long.toHexString(j10);
                                                    long j20 = j10 + 1;
                                                    String strL = l(strD, map5);
                                                    C6003n30 c6003n304 = (C6003n30) map7.get(strL);
                                                    if (j4 == -1) {
                                                        j3 = 0;
                                                    } else {
                                                        if (z7 && c6003n302 == null && c6003n304 == null) {
                                                            c6003n304 = new C6003n30(strL, 0L, j9, null, null);
                                                            map7.put(strL, c6003n304);
                                                        }
                                                        j3 = j9;
                                                    }
                                                    if (jl2 != null || treeMap.isEmpty()) {
                                                        map4 = map5;
                                                        c6003n30 = c6003n304;
                                                        jl = jl2;
                                                    } else {
                                                        map4 = map5;
                                                        c6003n30 = c6003n304;
                                                        IL[] ilArr3 = (IL[]) treeMap.values().toArray(new IL[0]);
                                                        jl = new JL(str3, true, ilArr3);
                                                        if (jlB == null) {
                                                            jlB = b(str3, ilArr3);
                                                        }
                                                    }
                                                    arrayList2.add(new C6003n30(strL, c6003n302 != null ? c6003n302 : c6003n30, strJ, jLongValue, i8, j12, jl, strK, hexString3, j3, j4, z6, arrayList));
                                                    j11 = j12 + jLongValue;
                                                    ArrayList arrayList10 = new ArrayList();
                                                    if (j4 != -1) {
                                                        j3 += j4;
                                                    }
                                                    j9 = j3;
                                                    c6576q302 = c6576q30;
                                                    arrayList6 = arrayList10;
                                                    map6 = map7;
                                                    str7 = str3;
                                                    jl2 = jl;
                                                    j4 = -1;
                                                    j12 = j11;
                                                    j10 = j20;
                                                    map5 = map4;
                                                    str5 = str2;
                                                    strJ = str5;
                                                    zF = z8;
                                                    arrayList5 = arrayList8;
                                                    c5621l303 = c5621l30;
                                                    z6 = false;
                                                    jLongValue = 0;
                                                    c7339u302 = c7339u30;
                                                }
                                            }
                                            map = map5;
                                            arrayList = arrayList7;
                                            map2 = map7;
                                        }
                                        c7339u302 = c7339u30;
                                        c6576q302 = c6576q30;
                                        map6 = map7;
                                        str7 = str3;
                                    }
                                    arrayList6 = arrayList7;
                                    str5 = str2;
                                    zF = z8;
                                    arrayList5 = arrayList8;
                                    c5621l303 = c5621l30;
                                }
                                c7339u302 = c7339u30;
                                c6576q302 = c6576q30;
                                map6 = map2;
                                str7 = str3;
                                arrayList6 = arrayList;
                                map5 = map;
                                str5 = str2;
                                zF = z8;
                                arrayList5 = arrayList8;
                                c5621l303 = c5621l30;
                            }
                            arrayList6 = arrayList7;
                            str5 = str2;
                            zF = z8;
                            arrayList5 = arrayList8;
                        }
                    }
                }
                str5 = str2;
            }
        }
        C5621l30 c5621l305 = c5621l303;
        ArrayList arrayList11 = arrayList6;
        ArrayList arrayList12 = arrayList5;
        boolean z9 = zF;
        HashMap map8 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList4.size()) {
            C5812m30 c5812m30 = (C5812m30) arrayList4.get(i18);
            long size = c5812m30.b;
            if (size == -1) {
                size = (j6 + arrayList2.size()) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = c5812m30.c;
            if (size2 != -1 || j8 == -9223372036854775807L) {
                i2 = 1;
            } else {
                i2 = 1;
                size2 = (arrayList11.isEmpty() ? ((C6003n30) AbstractC7337u22.b(arrayList2)).m : arrayList11).size() - 1;
            }
            Uri uri = c5812m30.a;
            map8.put(uri, new C5812m30(uri, size, size2));
            i18 += i2;
        }
        if (c5621l305 != null) {
            arrayList11.add(c5621l305);
        }
        return new C6576q30(i5, str, arrayList12, j5, z9, jQ, z4, i6, j6, i7, j7, j8, z3, z5, jQ != 0, jlB, arrayList2, arrayList11, c6385p302, map8);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C7339u30 e(defpackage.C6846rT1 r38, java.lang.String r39) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7911x30.e(rT1, java.lang.String):u30");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) throws C5643lA0 {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw C5643lA0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = b0.matcher(str);
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
    @Override // defpackage.InterfaceC5834mA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(android.net.Uri r7, defpackage.C2282bD r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7911x30.i(android.net.Uri, bD):java.lang.Object");
    }
}
