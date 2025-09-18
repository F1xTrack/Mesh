package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.p019vk.push.core.base.AidlException;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: Dh1 */
/* loaded from: classes.dex */
public abstract class AbstractC7485Dh1 {

    /* renamed from: a */
    public static final int f2166a;

    /* renamed from: b */
    public static final String f2167b;

    /* renamed from: c */
    public static final String f2168c;

    /* renamed from: d */
    public static final String f2169d;

    /* renamed from: e */
    public static final String f2170e;

    /* renamed from: f */
    public static final byte[] f2171f;

    /* renamed from: g */
    public static final long[] f2172g;

    /* renamed from: h */
    public static final Pattern f2173h;

    /* renamed from: i */
    public static final Pattern f2174i;

    /* renamed from: j */
    public static final Pattern f2175j;

    /* renamed from: k */
    public static final Pattern f2176k;

    /* renamed from: l */
    public static HashMap f2177l;

    /* renamed from: m */
    public static final String[] f2178m;

    /* renamed from: n */
    public static final String[] f2179n;

    /* renamed from: o */
    public static final int[] f2180o;

    /* renamed from: p */
    public static final int[] f2181p;

    /* renamed from: q */
    public static final int[] f2182q;

    static {
        int i = Build.VERSION.SDK_INT;
        f2166a = i;
        String str = Build.DEVICE;
        f2167b = str;
        String str2 = Build.MANUFACTURER;
        f2168c = str2;
        String str3 = Build.MODEL;
        f2169d = str3;
        f2170e = str + ", " + str3 + ", " + str2 + ", " + i;
        f2171f = new byte[0];
        f2172g = new long[0];
        f2173h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f2174i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f2175j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f2176k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f2178m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", UcumUtils.UCUM_MILLISECODS, "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", NotificationConstants.f19487ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f2179n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f2180o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f2181p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f2182q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, AidlException.ILLEGAL_ARGUMENT_EXCEPTION, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, ModuleDescriptor.MODULE_VERSION, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, BuildConfig.API_LEVEL, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, AidlException.HOST_IS_NOT_MASTER, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static int m1786A(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* renamed from: B */
    public static int m1787B(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i2 * 3;
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: C */
    public static long m1788C(long j, float f) {
        return f == 1.0f ? j : Math.round(j / f);
    }

    /* renamed from: D */
    public static String m1789D(StringBuilder sb, Formatter formatter, long j) {
        long j2 = j == -9223372036854775807L ? 0L : j;
        String str = j2 < 0 ? "-" : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    /* renamed from: E */
    public static String[] m1790E() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f2166a;
        if (i >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            strArrSplit[i2] = m1803R(strArrSplit[i2]);
        }
        return strArrSplit;
    }

    /* renamed from: F */
    public static String m1791F(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            AbstractC10872rA1.m24172e("Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: G */
    public static String m1792G(int i) {
        switch (i) {
            case -2:
                return LocalNotification.Importance.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? AbstractC7222ym.m26230g(i, "custom (", ")") : "?";
        }
    }

    /* renamed from: H */
    public static boolean m1793H(IB0 ib0) {
        if (ib0 != null) {
            AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) ib0;
            if (abstractC1259U0.m7840i1(1)) {
                ((C1474XQ) abstractC1259U0).m9025W1(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1794I(p000.IB0 r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = r6
            XQ r1 = (p000.C1474XQ) r1
            int r2 = r1.m9014K1()
            r3 = 1
            if (r2 != r3) goto L1d
            r4 = 2
            r5 = r6
            U0 r5 = (p000.AbstractC1259U0) r5
            boolean r4 = r5.m7840i1(r4)
            if (r4 == 0) goto L1d
            r1.m9019Q1()
        L1b:
            r0 = r3
            goto L39
        L1d:
            r1 = 4
            if (r2 != r1) goto L39
            r2 = r6
            U0 r2 = (p000.AbstractC1259U0) r2
            boolean r1 = r2.m7840i1(r1)
            if (r1 == 0) goto L39
            r1 = r2
            XQ r1 = (p000.C1474XQ) r1
            int r1 = r1.m9007D1()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.mo7846o1(r1, r4, r0)
            goto L1b
        L39:
            U0 r6 = (p000.AbstractC1259U0) r6
            boolean r1 = r6.m7840i1(r3)
            if (r1 == 0) goto L47
            XQ r6 = (p000.C1474XQ) r6
            r6.m9025W1(r3)
            goto L48
        L47:
            r3 = r0
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7485Dh1.m1794I(IB0):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0037  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m1795J(android.net.Uri r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = r8.getScheme()
            if (r4 == 0) goto L13
            java.lang.String r5 = "rtsp"
            boolean r4 = p000.PN1.m6356b(r5, r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            java.lang.String r4 = r8.getLastPathSegment()
            r5 = 4
            if (r4 != 0) goto L1b
            return r5
        L1b:
            r6 = 46
            int r6 = r4.lastIndexOf(r6)
            if (r6 < 0) goto L6f
            int r6 = r6 + r0
            java.lang.String r4 = r4.substring(r6)
            java.lang.String r4 = p000.PN1.m6357c(r4)
            r4.getClass()
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case 104579: goto L58;
                case 108321: goto L4d;
                case 3242057: goto L42;
                case 3299913: goto L39;
                default: goto L37;
            }
        L37:
            r3 = r6
            goto L62
        L39:
            java.lang.String r7 = "m3u8"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L62
            goto L37
        L42:
            java.lang.String r3 = "isml"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4b
            goto L37
        L4b:
            r3 = r1
            goto L62
        L4d:
            java.lang.String r3 = "mpd"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L56
            goto L37
        L56:
            r3 = r0
            goto L62
        L58:
            java.lang.String r3 = "ism"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L61
            goto L37
        L61:
            r3 = r2
        L62:
            switch(r3) {
                case 0: goto L6b;
                case 1: goto L69;
                case 2: goto L6b;
                case 3: goto L67;
                default: goto L65;
            }
        L65:
            r3 = r5
            goto L6c
        L67:
            r3 = r1
            goto L6c
        L69:
            r3 = r2
            goto L6c
        L6b:
            r3 = r0
        L6c:
            if (r3 == r5) goto L6f
            return r3
        L6f:
            java.lang.String r8 = r8.getPath()
            r8.getClass()
            java.util.regex.Pattern r3 = p000.AbstractC7485Dh1.f2176k
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L9b
            java.lang.String r8 = r8.group(r1)
            if (r8 == 0) goto L9a
            java.lang.String r3 = "format=mpd-time-csf"
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L91
            return r2
        L91:
            java.lang.String r2 = "format=m3u8-aapl"
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L9a
            return r1
        L9a:
            return r0
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7485Dh1.m1795J(android.net.Uri):int");
    }

    /* renamed from: K */
    public static boolean m1796K(C9591hA0 c9591hA0, C9591hA0 c9591hA02, Inflater inflater) {
        if (c9591hA0.m18743a() <= 0) {
            return false;
        }
        if (c9591hA02.f28293a.length < c9591hA0.m18743a()) {
            c9591hA02.m18744b(c9591hA0.m18743a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c9591hA0.f28293a, c9591hA0.f28294b, c9591hA0.m18743a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = c9591hA02.f28293a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = c9591hA02.f28293a;
                    if (iInflate == bArr2.length) {
                        c9591hA02.m18744b(bArr2.length * 2);
                    }
                } else {
                    c9591hA02.m18740F(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: L */
    public static void m1797L(int i) {
        Integer.toString(i, 36);
    }

    /* renamed from: M */
    public static boolean m1798M(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    /* renamed from: N */
    public static boolean m1799N(Context context) {
        int i = f2166a;
        if (i >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i == 30) {
                String str = f2169d;
                if (PN1.m6356b(str, "moto g(20)") || PN1.m6356b(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public static boolean m1800O(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: P */
    public static boolean m1801P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: Q */
    public static long m1802Q(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: R */
    public static String m1803R(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strM6357c = PN1.m6357c(str);
        int i = 0;
        String str2 = strM6357c.split("-", 2)[0];
        if (f2177l == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f2178m;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                map.put(strArr[i2], strArr[i2 + 1]);
            }
            f2177l = map;
        }
        String str4 = (String) f2177l.get(str2);
        if (str4 != null) {
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(str4);
            sbM26238o.append(strM6357c.substring(str2.length()));
            strM6357c = sbM26238o.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strM6357c;
        }
        while (true) {
            String[] strArr2 = f2179n;
            if (i >= strArr2.length) {
                return strM6357c;
            }
            if (strM6357c.startsWith(strArr2[i])) {
                return strArr2[i + 1] + strM6357c.substring(strArr2[i].length());
            }
            i += 2;
        }
    }

    /* renamed from: S */
    public static Object[] m1804S(int i, Object[] objArr) {
        YN1.m9278c(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: T */
    public static long m1805T(String str) throws C10103lA0 {
        Matcher matcher = f2173h.matcher(str);
        if (!matcher.matches()) {
            throw C10103lA0.m22366a(null, "Invalid date/time format: " + str);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (i * 60000) : timeInMillis;
    }

    /* renamed from: U */
    public static void m1806U(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: V */
    public static void m1807V(ArrayList arrayList, int i, int i2) {
        if (i < 0 || i2 > arrayList.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            arrayList.subList(i, i2).clear();
        }
    }

    /* renamed from: W */
    public static long m1808W(int i, long j) {
        return m1810Y(j, 1000000L, i, RoundingMode.FLOOR);
    }

    /* renamed from: X */
    public static void m1809X(long[] jArr, long j) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long jM1903d = AbstractC7500Dp0.m1903d(j, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC7500Dp0.m1903d(jArr[i], jM1903d, roundingMode);
                i++;
            }
            return;
        }
        if (j < 1000000 && 1000000 % j == 0) {
            long jM1903d2 = AbstractC7500Dp0.m1903d(1000000L, j, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = AbstractC7500Dp0.m1905f(jArr[i], jM1903d2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                if (j >= j2 && j % j2 == 0) {
                    jArr[i2] = AbstractC7500Dp0.m1903d(1000000L, AbstractC7500Dp0.m1903d(j, j2, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j >= j2 || j2 % j != 0) {
                    jArr[i2] = m1811Z(j2, 1000000L, j, roundingMode);
                } else {
                    jArr[i2] = AbstractC7500Dp0.m1905f(1000000L, AbstractC7500Dp0.m1903d(j2, j, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    /* renamed from: Y */
    public static long m1810Y(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? m1811Z(j, j2, j3, roundingMode) : AbstractC7500Dp0.m1905f(j2, AbstractC7500Dp0.m1903d(j, j3, RoundingMode.UNNECESSARY)) : AbstractC7500Dp0.m1903d(j2, AbstractC7500Dp0.m1903d(j3, j, RoundingMode.UNNECESSARY), roundingMode) : AbstractC7500Dp0.m1905f(j, AbstractC7500Dp0.m1903d(j2, j3, RoundingMode.UNNECESSARY)) : AbstractC7500Dp0.m1903d(j, AbstractC7500Dp0.m1903d(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ff  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m1811Z(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7485Dh1.m1811Z(long, long, long, java.math.RoundingMode):long");
    }

    /* renamed from: a */
    public static boolean m1812a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a0 */
    public static boolean m1813a0(IB0 ib0, boolean z) {
        if (ib0 == null) {
            return true;
        }
        C1474XQ c1474xq = (C1474XQ) ib0;
        if (!c1474xq.m9013J1() || c1474xq.m9014K1() == 1 || c1474xq.m9014K1() == 4) {
            return true;
        }
        if (z) {
            c1474xq.m9035g2();
            if (c1474xq.f13743u1.f636n != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m1814b(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return z ? iBinarySearch : i;
    }

    /* renamed from: b0 */
    public static String[] m1815b0(String str) {
        return str.split("/", -1);
    }

    /* renamed from: c */
    public static int m1816c(C0986Pf c0986Pf, long j) {
        int i = c0986Pf.f9216b - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (c0986Pf.m6397h(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < c0986Pf.f9216b && c0986Pf.m6397h(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: c0 */
    public static String[] m1817c0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    /* renamed from: d */
    public static int m1818d(P70 p70, Long l, boolean z) {
        int i;
        int iBinarySearch = Collections.binarySearch(p70, l);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || ((Comparable) p70.get(i2)).compareTo(l) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: d0 */
    public static long m1819d0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: e */
    public static int m1820e(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    /* renamed from: f */
    public static int m1821f(long[] jArr, long j, boolean z) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: g */
    public static int m1822g(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: h */
    public static void m1823h(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: i */
    public static float m1824i(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: j */
    public static int m1825j(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: k */
    public static long m1826k(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: l */
    public static boolean m1827l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (m1812a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static int m1828m(int i, byte[] bArr, int i2, int i3) {
        while (i < i2) {
            i3 = f2180o[((i3 >>> 24) ^ (bArr[i] & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: n */
    public static Handler m1829n(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        YN1.m9283h(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    /* renamed from: o */
    public static String m1830o(byte[] bArr) {
        return new String(bArr, AbstractC7227yr.f46511c);
    }

    /* renamed from: p */
    public static int m1831p(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* renamed from: q */
    public static AudioFormat m1832q(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[RETURN] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m1833r(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = p000.AbstractC7485Dh1.f2166a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7485Dh1.m1833r(int):int");
    }

    /* renamed from: s */
    public static int m1834s(int i, String str) {
        int i2 = 0;
        for (String str2 : m1817c0(str)) {
            if (i == AbstractC8544Xr0.m9165h(AbstractC8544Xr0.m9161d(str2))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public static String m1835t(int i, String str) {
        String[] strArrM1817c0 = m1817c0(str);
        if (strArrM1817c0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM1817c0) {
            if (i == AbstractC8544Xr0.m9165h(AbstractC8544Xr0.m9161d(str2))) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: u */
    public static Drawable m1836u(Context context, Resources resources, int i) {
        return f2166a >= 21 ? AbstractC11958zh1.m26515a(context, resources, i) : resources.getDrawable(i);
    }

    /* renamed from: v */
    public static int m1837v(int i) {
        if (i == 2 || i == 4) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i == 10) {
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        if (i == 7) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i == 8) {
            return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
        }
        switch (i) {
            case 15:
                return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
            case 16:
            case 18:
                return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return AuthCode.StatusCode.AUTH_INFO_NOT_EXIST;
                    default:
                        return AuthCode.StatusCode.PERMISSION_EXPIRED;
                }
        }
    }

    /* renamed from: w */
    public static int m1838w(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            int i = Integer.parseInt(str2);
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: x */
    public static String m1839x(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: y */
    public static long m1840y(long j, float f) {
        return f == 1.0f ? j : Math.round(j * f);
    }

    /* renamed from: z */
    public static long m1841z(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }
}
