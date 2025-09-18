package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* renamed from: No0 */
/* loaded from: classes.dex */
public final class C8018No0 {

    /* renamed from: a */
    public final String f8009a;

    /* renamed from: b */
    public final String f8010b;

    /* renamed from: c */
    public final String f8011c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f8012d;

    /* renamed from: e */
    public final boolean f8013e;

    /* renamed from: f */
    public final boolean f8014f;

    /* renamed from: g */
    public final boolean f8015g;

    /* renamed from: h */
    public final boolean f8016h;

    public C8018No0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f8009a = str;
        this.f8010b = str2;
        this.f8011c = str3;
        this.f8012d = codecCapabilities;
        this.f8015g = z;
        this.f8013e = z2;
        this.f8014f = z3;
        this.f8016h = AbstractC8544Xr0.m9170m(str2);
    }

    /* renamed from: a */
    public static boolean m5847a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC7485Dh1.m1822g(i, widthAlignment) * widthAlignment, AbstractC7485Dh1.m1822g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0039  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C8018No0 m5848h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            No0 r13 = new No0
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L39
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L39
            int r1 = p000.AbstractC7485Dh1.f2166a
            r2 = 22
            if (r1 > r2) goto L37
            java.lang.String r1 = p000.AbstractC7485Dh1.f2169d
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
            int r2 = p000.AbstractC7485Dh1.f2166a
            if (r2 < r1) goto L48
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L48:
            if (r15 != 0) goto L5b
            if (r11 == 0) goto L59
            int r15 = p000.AbstractC7485Dh1.f2166a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C8018No0.m5848h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):No0");
    }

    /* renamed from: b */
    public final C1772bE m5849b(C6686qX c6686qX, C6686qX c6686qX2) {
        int i = !AbstractC7485Dh1.m1812a(c6686qX.f40974m, c6686qX2.f40974m) ? 8 : 0;
        if (this.f8016h) {
            if (c6686qX.f40983v != c6686qX2.f40983v) {
                i |= 1024;
            }
            if (!this.f8013e && (c6686qX.f40980s != c6686qX2.f40980s || c6686qX.f40981t != c6686qX2.f40981t)) {
                i |= 512;
            }
            C0372Fu c0372Fu = c6686qX.f40987z;
            boolean zM2819e = C0372Fu.m2819e(c0372Fu);
            C0372Fu c0372Fu2 = c6686qX2.f40987z;
            if ((!zM2819e || !C0372Fu.m2819e(c0372Fu2)) && !AbstractC7485Dh1.m1812a(c0372Fu, c0372Fu2)) {
                i |= 2048;
            }
            if (AbstractC7485Dh1.f2169d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f8009a) && !c6686qX.m24022c(c6686qX2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C1772bE(this.f8009a, c6686qX, c6686qX2, c6686qX.m24022c(c6686qX2) ? 3 : 2, 0);
            }
        } else {
            if (c6686qX.f40951A != c6686qX2.f40951A) {
                i |= 4096;
            }
            if (c6686qX.f40952B != c6686qX2.f40952B) {
                i |= 8192;
            }
            if (c6686qX.f40953C != c6686qX2.f40953C) {
                i |= 16384;
            }
            String str = this.f8010b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairM9602d = AbstractC8642Zo0.m9602d(c6686qX);
                Pair pairM9602d2 = AbstractC8642Zo0.m9602d(c6686qX2);
                if (pairM9602d != null && pairM9602d2 != null) {
                    int iIntValue = ((Integer) pairM9602d.first).intValue();
                    int iIntValue2 = ((Integer) pairM9602d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1772bE(this.f8009a, c6686qX, c6686qX2, 3, 0);
                    }
                }
            }
            if (!c6686qX.m24022c(c6686qX2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new C1772bE(this.f8009a, c6686qX, c6686qX2, 1, 0);
            }
        }
        return new C1772bE(this.f8009a, c6686qX, c6686qX2, 0, i);
    }

    /* renamed from: c */
    public final boolean m5850c(C6686qX c6686qX, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM9602d = AbstractC8642Zo0.m9602d(c6686qX);
        if (pairM9602d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM9602d.first).intValue();
        int iIntValue2 = ((Integer) pairM9602d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c6686qX.f40974m);
        int i = 8;
        String str = this.f8010b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.f8016h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8012d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC7485Dh1.f2166a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
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
                    String str2 = AbstractC7485Dh1.f2167b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        m5854g("codec.profileLevel, " + c6686qX.f40971j + ", " + this.f8011c);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x009f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5851d(p000.C6686qX r9) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8018No0.m5851d(qX):boolean");
    }

    /* renamed from: e */
    public final boolean m5852e(C6686qX c6686qX) {
        if (this.f8016h) {
            return this.f8013e;
        }
        Pair pairM9602d = AbstractC8642Zo0.m9602d(c6686qX);
        return pairM9602d != null && ((Integer) pairM9602d.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean m5853f(double d, int i, int i2) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8012d;
        if (codecCapabilities == null) {
            m5854g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m5854g("sizeAndRate.vCaps");
            return false;
        }
        int i3 = AbstractC7485Dh1.f2166a;
        if (i3 >= 29) {
            int iM6144a = (i3 < 29 || ((bool = AbstractC9720iA1.f28872h) != null && bool.booleanValue())) ? 0 : AbstractC8070Oo0.m6144a(videoCapabilities, i, i2, d);
            if (iM6144a == 2) {
                return true;
            }
            if (iM6144a == 1) {
                StringBuilder sbM8594m = AbstractC1374Vq.m8594m("sizeAndRate.cover, ", "x", i, i2, "@");
                sbM8594m.append(d);
                m5854g(sbM8594m.toString());
                return false;
            }
        }
        if (!m5847a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.f8009a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC7485Dh1.f2167b)) && m5847a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbM8594m2 = AbstractC1374Vq.m8594m("sizeAndRate.rotated, ", "x", i, i2, "@");
                    sbM8594m2.append(d);
                    StringBuilder sbM2541x = F91.m2541x("AssumedSupport [", sbM8594m2.toString(), "] [", str, ", ");
                    sbM2541x.append(this.f8010b);
                    sbM2541x.append("] [");
                    sbM2541x.append(AbstractC7485Dh1.f2170e);
                    sbM2541x.append("]");
                    AbstractC10872rA1.m24170c(sbM2541x.toString());
                }
            }
            StringBuilder sbM8594m3 = AbstractC1374Vq.m8594m("sizeAndRate.support, ", "x", i, i2, "@");
            sbM8594m3.append(d);
            m5854g(sbM8594m3.toString());
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m5854g(String str) {
        StringBuilder sbM26240q = AbstractC7222ym.m26240q("NoSupport [", str, "] [");
        sbM26240q.append(this.f8009a);
        sbM26240q.append(", ");
        sbM26240q.append(this.f8010b);
        sbM26240q.append("] [");
        sbM26240q.append(AbstractC7485Dh1.f2170e);
        sbM26240q.append("]");
        AbstractC10872rA1.m24170c(sbM26240q.toString());
    }

    public final String toString() {
        return this.f8009a;
    }
}
