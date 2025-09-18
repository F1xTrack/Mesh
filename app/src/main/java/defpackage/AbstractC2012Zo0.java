package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.facebook.crypto.mac.NativeMac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: Zo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2012Zo0 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC0277Dh1.a < 26 && AbstractC0277Dh1.b.equals("R9") && arrayList.size() == 1 && ((C1076No0) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C1076No0.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C4243hv(2, new C0681Im0(5)));
        }
        int i = AbstractC0277Dh1.a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C1076No0) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C4243hv(2, new C0681Im0(6)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C1076No0) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((C1076No0) arrayList.remove(0));
    }

    public static String b(C6666qX c6666qX) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c6666qX.m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c6666qX.m) || (pairD = d(c6666qX)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0395 A[PHI: r2
  0x0395: PHI (r2v136 int) = (r2v135 int), (r2v138 int), (r2v139 int), (r2v140 int), (r2v141 int) binds: [B:251:0x036c, B:254:0x0372, B:256:0x0376, B:258:0x037a, B:260:0x037e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(defpackage.C6666qX r32) {
        /*
            Method dump skipped, instructions count: 2450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2012Zo0.d(qX):android.util.Pair");
    }

    public static C1076No0 e(String str) {
        List listF = f(str, false, false);
        if (listF.isEmpty()) {
            return null;
        }
        return (C1076No0) listF.get(0);
    }

    public static synchronized List f(String str, boolean z, boolean z2) {
        try {
            C1700Vo0 c1700Vo0 = new C1700Vo0(str, z, z2);
            HashMap map = b;
            List list = (List) map.get(c1700Vo0);
            if (list != null) {
                return list;
            }
            int i = AbstractC0277Dh1.a;
            ArrayList arrayListG = g(c1700Vo0, i >= 21 ? new C1204Pf(z, z2) : new C0084Av0(17));
            if (z && arrayListG.isEmpty() && 21 <= i && i <= 23) {
                arrayListG = g(c1700Vo0, new C0084Av0(17));
                if (!arrayListG.isEmpty()) {
                    AbstractC6789rA1.h("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C1076No0) arrayListG.get(0)).a);
                }
            }
            a(str, arrayListG);
            P70 p70U = P70.u(arrayListG);
            map.put(c1700Vo0, p70U);
            return p70U;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList g(defpackage.C1700Vo0 r23, defpackage.InterfaceC1856Xo0 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2012Zo0.g(Vo0, Xo0):java.util.ArrayList");
    }

    public static C3769fQ0 h(C4403il c4403il, C6666qX c6666qX, boolean z, boolean z2) {
        List listF;
        String str = c6666qX.m;
        c4403il.getClass();
        List listF2 = f(str, z, z2);
        String strB = b(c6666qX);
        if (strB == null) {
            listF = C3769fQ0.e;
        } else {
            c4403il.getClass();
            listF = f(strB, z, z2);
        }
        M70 m70T = P70.t();
        m70T.e(listF2);
        m70T.e(listF);
        return m70T.h();
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC0277Dh1.a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC0277Dh1.c))) {
            String str3 = AbstractC0277Dh1.b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC0277Dh1.c)) {
            String str4 = AbstractC0277Dh1.b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i == 19 && AbstractC0277Dh1.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC0277Dh1.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC1865Xr0.j(str)) {
            return true;
        }
        String strC = PN1.c(mediaCodecInfo.getName());
        if (strC.startsWith("arc.")) {
            return false;
        }
        if (strC.startsWith("omx.google.") || strC.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strC.startsWith("omx.sec.") && strC.contains(".sw.")) || strC.equals("omx.qcom.video.decoder.hevcswvdec") || strC.startsWith("c2.android.") || strC.startsWith("c2.google.")) {
            return true;
        }
        return (strC.startsWith("omx.") || strC.startsWith("c2.")) ? false : true;
    }

    public static int k() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (c == -1) {
            C1076No0 c1076No0E = e("video/avc");
            int iMax = 0;
            if (c1076No0E != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c1076No0E.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case NativeMac.KEY_LENGTH /* 64 */:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC0277Dh1.a >= 21 ? 345600 : 172800);
            }
            c = iMax;
        }
        return c;
    }
}
