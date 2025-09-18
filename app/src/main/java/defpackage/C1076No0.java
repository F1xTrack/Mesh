package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* renamed from: No0 */
/* loaded from: classes.dex */
public final class C1076No0 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public C1076No0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = AbstractC1865Xr0.m(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC0277Dh1.g(i, widthAlignment) * widthAlignment, AbstractC0277Dh1.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C1076No0 h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            No0 r13 = new No0
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = defpackage.AbstractC0277Dh1.a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = defpackage.AbstractC0277Dh1.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L37
        L26:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L39
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L37
            goto L39
        L37:
            r6 = r0
            goto L3a
        L39:
            r6 = r14
        L3a:
            r1 = 21
            if (r11 == 0) goto L48
            int r2 = defpackage.AbstractC0277Dh1.a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = defpackage.AbstractC0277Dh1.a
            if (r15 < r1) goto L59
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L59
            goto L5b
        L59:
            r7 = r14
            goto L5c
        L5b:
            r7 = r0
        L5c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1076No0.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):No0");
    }

    public final C2285bE b(C6666qX c6666qX, C6666qX c6666qX2) {
        int i = !AbstractC0277Dh1.a(c6666qX.m, c6666qX2.m) ? 8 : 0;
        if (this.h) {
            if (c6666qX.v != c6666qX2.v) {
                i |= 1024;
            }
            if (!this.e && (c6666qX.s != c6666qX2.s || c6666qX.t != c6666qX2.t)) {
                i |= 512;
            }
            C0470Fu c0470Fu = c6666qX.z;
            boolean zE = C0470Fu.e(c0470Fu);
            C0470Fu c0470Fu2 = c6666qX2.z;
            if ((!zE || !C0470Fu.e(c0470Fu2)) && !AbstractC0277Dh1.a(c0470Fu, c0470Fu2)) {
                i |= 2048;
            }
            if (AbstractC0277Dh1.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !c6666qX.c(c6666qX2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C2285bE(this.a, c6666qX, c6666qX2, c6666qX.c(c6666qX2) ? 3 : 2, 0);
            }
        } else {
            if (c6666qX.A != c6666qX2.A) {
                i |= 4096;
            }
            if (c6666qX.B != c6666qX2.B) {
                i |= 8192;
            }
            if (c6666qX.C != c6666qX2.C) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = AbstractC2012Zo0.d(c6666qX);
                Pair pairD2 = AbstractC2012Zo0.d(c6666qX2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C2285bE(this.a, c6666qX, c6666qX2, 3, 0);
                    }
                }
            }
            if (!c6666qX.c(c6666qX2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C2285bE(this.a, c6666qX, c6666qX2, 1, 0);
            }
        }
        return new C2285bE(this.a, c6666qX, c6666qX2, 0, i);
    }

    public final boolean c(C6666qX c6666qX, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairD = AbstractC2012Zo0.d(c6666qX);
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c6666qX.m);
        int i = 8;
        String str = this.b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC0277Dh1.a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = AbstractC0277Dh1.b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + c6666qX.j + ", " + this.c);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.C6666qX r9) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1076No0.d(qX):boolean");
    }

    public final boolean e(C6666qX c6666qX) {
        if (this.h) {
            return this.e;
        }
        Pair pairD = AbstractC2012Zo0.d(c6666qX);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean f(double d, int i, int i2) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        int i3 = AbstractC0277Dh1.a;
        if (i3 >= 29) {
            int iA = (i3 < 29 || ((bool = AbstractC4295iA1.h) != null && bool.booleanValue())) ? 0 : AbstractC1154Oo0.a(videoCapabilities, i, i2, d);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbM = AbstractC1705Vq.m("sizeAndRate.cover, ", "x", i, i2, "@");
                sbM.append(d);
                g(sbM.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC0277Dh1.b)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbM2 = AbstractC1705Vq.m("sizeAndRate.rotated, ", "x", i, i2, "@");
                    sbM2.append(d);
                    StringBuilder sbX = F91.x("AssumedSupport [", sbM2.toString(), "] [", str, ", ");
                    sbX.append(this.b);
                    sbX.append("] [");
                    sbX.append(AbstractC0277Dh1.e);
                    sbX.append("]");
                    AbstractC6789rA1.c(sbX.toString());
                }
            }
            StringBuilder sbM3 = AbstractC1705Vq.m("sizeAndRate.support, ", "x", i, i2, "@");
            sbM3.append(d);
            g(sbM3.toString());
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder sbQ = AbstractC8235ym.q("NoSupport [", str, "] [");
        sbQ.append(this.a);
        sbQ.append(", ");
        sbQ.append(this.b);
        sbQ.append("] [");
        sbQ.append(AbstractC0277Dh1.e);
        sbQ.append("]");
        AbstractC6789rA1.c(sbQ.toString());
    }

    public final String toString() {
        return this.a;
    }
}
