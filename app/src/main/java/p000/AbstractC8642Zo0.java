package p000;

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
public abstract class AbstractC8642Zo0 {

    /* renamed from: a */
    public static final Pattern f15134a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap f15135b = new HashMap();

    /* renamed from: c */
    public static int f15136c = -1;

    /* renamed from: a */
    public static void m9599a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC7485Dh1.f2166a < 26 && AbstractC7485Dh1.f2167b.equals("R9") && arrayList.size() == 1 && ((C8018No0) arrayList.get(0)).f8009a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C8018No0.m5848h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C4209hv(2, new C7754Im0(5)));
        }
        int i = AbstractC7485Dh1.f2166a;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((C8018No0) arrayList.get(0)).f8009a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C4209hv(2, new C7754Im0(6)));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C8018No0) arrayList.get(0)).f8009a)) {
            return;
        }
        arrayList.add((C8018No0) arrayList.remove(0));
    }

    /* renamed from: b */
    public static String m9600b(C6686qX c6686qX) {
        Pair pairM9602d;
        if ("audio/eac3-joc".equals(c6686qX.f40974m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c6686qX.f40974m) || (pairM9602d = m9602d(c6686qX)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM9602d.first).intValue();
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

    /* renamed from: c */
    public static String m9601c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m9602d(p000.C6686qX r32) {
        /*
            Method dump skipped, instructions count: 2450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8642Zo0.m9602d(qX):android.util.Pair");
    }

    /* renamed from: e */
    public static C8018No0 m9603e(String str) {
        List listM9604f = m9604f(str, false, false);
        if (listM9604f.isEmpty()) {
            return null;
        }
        return (C8018No0) listM9604f.get(0);
    }

    /* renamed from: f */
    public static synchronized List m9604f(String str, boolean z, boolean z2) {
        try {
            C8434Vo0 c8434Vo0 = new C8434Vo0(str, z, z2);
            HashMap map = f15135b;
            List list = (List) map.get(c8434Vo0);
            if (list != null) {
                return list;
            }
            int i = AbstractC7485Dh1.f2166a;
            ArrayList arrayListM9605g = m9605g(c8434Vo0, i >= 21 ? new C0986Pf(z, z2) : new C7356Av0(17));
            if (z && arrayListM9605g.isEmpty() && 21 <= i && i <= 23) {
                arrayListM9605g = m9605g(c8434Vo0, new C7356Av0(17));
                if (!arrayListM9605g.isEmpty()) {
                    AbstractC10872rA1.m24175h("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C8018No0) arrayListM9605g.get(0)).f8009a);
                }
            }
            m9599a(str, arrayListM9605g);
            P70 p70M6234u = P70.m6234u(arrayListM9605g);
            map.put(c8434Vo0, p70M6234u);
            return p70M6234u;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m9605g(p000.C8434Vo0 r23, p000.InterfaceC8538Xo0 r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8642Zo0.m9605g(Vo0, Xo0):java.util.ArrayList");
    }

    /* renamed from: h */
    public static C9367fQ0 m9606h(C4262il c4262il, C6686qX c6686qX, boolean z, boolean z2) {
        List listM9604f;
        String str = c6686qX.f40974m;
        c4262il.getClass();
        List listM9604f2 = m9604f(str, z, z2);
        String strM9600b = m9600b(c6686qX);
        if (strM9600b == null) {
            listM9604f = C9367fQ0.f27184e;
        } else {
            c4262il.getClass();
            listM9604f = m9604f(strM9600b, z, z2);
        }
        M70 m70M6233t = P70.m6233t();
        m70M6233t.m3759e(listM9604f2);
        m70M6233t.m3759e(listM9604f);
        return m70M6233t.m5273h();
    }

    /* renamed from: i */
    public static boolean m9607i(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC7485Dh1.f2166a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC7485Dh1.f2168c))) {
            String str3 = AbstractC7485Dh1.f2167b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC7485Dh1.f2168c)) {
            String str4 = AbstractC7485Dh1.f2167b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i == 19 && AbstractC7485Dh1.f2167b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: j */
    public static boolean m9608j(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC7485Dh1.f2166a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC8544Xr0.m9167j(str)) {
            return true;
        }
        String strM6357c = PN1.m6357c(mediaCodecInfo.getName());
        if (strM6357c.startsWith("arc.")) {
            return false;
        }
        if (strM6357c.startsWith("omx.google.") || strM6357c.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM6357c.startsWith("omx.sec.") && strM6357c.contains(".sw.")) || strM6357c.equals("omx.qcom.video.decoder.hevcswvdec") || strM6357c.startsWith("c2.android.") || strM6357c.startsWith("c2.google.")) {
            return true;
        }
        return (strM6357c.startsWith("omx.") || strM6357c.startsWith("c2.")) ? false : true;
    }

    /* renamed from: k */
    public static int m9609k() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f15136c == -1) {
            C8018No0 c8018No0M9603e = m9603e("video/avc");
            int iMax = 0;
            if (c8018No0M9603e != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c8018No0M9603e.f8012d;
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
                iMax = Math.max(iMax2, AbstractC7485Dh1.f2166a >= 21 ? 345600 : 172800);
            }
            f15136c = iMax;
        }
        return f15136c;
    }
}
