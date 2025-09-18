package p000;

import android.text.TextUtils;
import com.p019vk.push.core.base.AidlException;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Xr0 */
/* loaded from: classes.dex */
public abstract class AbstractC8544Xr0 {

    /* renamed from: a */
    public static final ArrayList f13994a = new ArrayList();

    /* renamed from: b */
    public static final Pattern f13995b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static String m9158a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC7485Dh1.m1817c0(str)) {
            String strM9161d = m9161d(str2);
            if (strM9161d != null && m9167j(strM9161d)) {
                return strM9161d;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m9159b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrM1817c0 = AbstractC7485Dh1.m1817c0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrM1817c0) {
            if (str2.equals(m9161d(str3))) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: c */
    public static int m9160c(String str, String str2) {
        C11649xG0 c11649xG0M9163f;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c11649xG0M9163f = m9163f(str2)) == null) {
                    return 0;
                }
                return c11649xG0M9163f.m25822b();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static String m9161d(String str) {
        C11649xG0 c11649xG0M9163f;
        String strM9162e = null;
        if (str == null) {
            return null;
        }
        String strM6357c = PN1.m6357c(str.trim());
        if (strM6357c.startsWith("avc1") || strM6357c.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM6357c.startsWith("hev1") || strM6357c.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strM6357c.startsWith("dvav") || strM6357c.startsWith("dva1") || strM6357c.startsWith("dvhe") || strM6357c.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strM6357c.startsWith("av01")) {
            return "video/av01";
        }
        if (strM6357c.startsWith("vp9") || strM6357c.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strM6357c.startsWith("vp8") || strM6357c.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strM6357c.startsWith("mp4a")) {
            if (strM6357c.startsWith("mp4a.") && (c11649xG0M9163f = m9163f(strM6357c)) != null) {
                strM9162e = m9162e(c11649xG0M9163f.f45508b);
            }
            return strM9162e == null ? "audio/mp4a-latm" : strM9162e;
        }
        if (strM6357c.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strM6357c.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strM6357c.startsWith("ac-3") || strM6357c.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strM6357c.startsWith("ec-3") || strM6357c.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strM6357c.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strM6357c.startsWith("ac-4") || strM6357c.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strM6357c.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strM6357c.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strM6357c.startsWith("dtsh") || strM6357c.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strM6357c.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strM6357c.startsWith("opus")) {
            return "audio/opus";
        }
        if (strM6357c.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strM6357c.startsWith("flac")) {
            return "audio/flac";
        }
        if (strM6357c.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strM6357c.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strM6357c.contains("cea708")) {
            return "application/cea-708";
        }
        if (strM6357c.contains("eia608") || strM6357c.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f13994a;
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC1374Vq.m8597p(arrayList.get(0));
        throw null;
    }

    /* renamed from: e */
    public static String m9162e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case AidlException.ILLEGAL_ARGUMENT_EXCEPTION /* 101 */:
                return "video/mpeg2";
            case 102:
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return ClipboardModule.MIMETYPE_JPEG;
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: f */
    public static C11649xG0 m9163f(String str) {
        Matcher matcher = f13995b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C11649xG0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m9164g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* renamed from: h */
    public static int m9165h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m9167j(str)) {
            return 1;
        }
        if (m9170m(str)) {
            return 2;
        }
        if (m9169l(str)) {
            return 3;
        }
        if (m9168k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f13994a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        AbstractC1374Vq.m8597p(arrayList.get(0));
        throw null;
    }

    /* renamed from: i */
    public static String m9166i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC7485Dh1.m1817c0(str)) {
            String strM9161d = m9161d(str2);
            if (strM9161d != null && m9170m(strM9161d)) {
                return strM9161d;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m9167j(String str) {
        return "audio".equals(m9164g(str));
    }

    /* renamed from: k */
    public static boolean m9168k(String str) {
        return "image".equals(m9164g(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: l */
    public static boolean m9169l(String str) {
        return "text".equals(m9164g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: m */
    public static boolean m9170m(String str) {
        return "video".equals(m9164g(str));
    }

    /* renamed from: n */
    public static String m9171n(String str) {
        String strM6357c;
        if (str == null) {
            return null;
        }
        strM6357c = PN1.m6357c(str);
        strM6357c.getClass();
        switch (strM6357c) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM6357c;
        }
    }
}
