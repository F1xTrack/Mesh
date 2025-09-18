package defpackage;

import android.text.TextUtils;
import com.reactnativecommunity.clipboard.ClipboardModule;
import com.vk.push.core.base.AidlException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Xr0 */
/* loaded from: classes.dex */
public abstract class AbstractC1865Xr0 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC0277Dh1.c0(str)) {
            String strD = d(str2);
            if (strD != null && j(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrC0 = AbstractC0277Dh1.c0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrC0) {
            if (str2.equals(d(str3))) {
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

    public static int c(String str, String str2) {
        C7950xG0 c7950xG0F;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c7950xG0F = f(str2)) == null) {
                    return 0;
                }
                return c7950xG0F.b();
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

    public static String d(String str) {
        C7950xG0 c7950xG0F;
        String strE = null;
        if (str == null) {
            return null;
        }
        String strC = PN1.c(str.trim());
        if (strC.startsWith("avc1") || strC.startsWith("avc3")) {
            return "video/avc";
        }
        if (strC.startsWith("hev1") || strC.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strC.startsWith("dvav") || strC.startsWith("dva1") || strC.startsWith("dvhe") || strC.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strC.startsWith("av01")) {
            return "video/av01";
        }
        if (strC.startsWith("vp9") || strC.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strC.startsWith("vp8") || strC.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strC.startsWith("mp4a")) {
            if (strC.startsWith("mp4a.") && (c7950xG0F = f(strC)) != null) {
                strE = e(c7950xG0F.b);
            }
            return strE == null ? "audio/mp4a-latm" : strE;
        }
        if (strC.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strC.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strC.startsWith("ac-3") || strC.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strC.startsWith("ec-3") || strC.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strC.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strC.startsWith("ac-4") || strC.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strC.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strC.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strC.startsWith("dtsh") || strC.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strC.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strC.startsWith("opus")) {
            return "audio/opus";
        }
        if (strC.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strC.startsWith("flac")) {
            return "audio/flac";
        }
        if (strC.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strC.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strC.contains("cea708")) {
            return "application/cea-708";
        }
        if (strC.contains("eia608") || strC.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC1705Vq.p(arrayList.get(0));
        throw null;
    }

    public static String e(int i) {
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

    public static C7950xG0 f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C7950xG0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        AbstractC1705Vq.p(arrayList.get(0));
        throw null;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : AbstractC0277Dh1.c0(str)) {
            String strD = d(str2);
            if (strD != null && m(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "audio".equals(g(str));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(g(str));
    }

    public static String n(String str) {
        String strC;
        if (str == null) {
            return null;
        }
        strC = PN1.c(str);
        strC.getClass();
        switch (strC) {
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
                return strC;
        }
    }
}
