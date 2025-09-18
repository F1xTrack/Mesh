package defpackage;

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
import com.huawei.hms.rn.push.constants.LocalNotification;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.vk.push.core.base.AidlException;
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
import ru.ok.tracer.base.ucum.UcumUtils;

/* renamed from: Dh1 */
/* loaded from: classes.dex */
public abstract class AbstractC0277Dh1 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final long[] g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Pattern k;
    public static HashMap l;
    public static final String[] m;
    public static final String[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", UcumUtils.UCUM_MILLISECODS, "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", NotificationConstants.ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, AidlException.ILLEGAL_ARGUMENT_EXCEPTION, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, ModuleDescriptor.MODULE_VERSION, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, BuildConfig.API_LEVEL, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, AidlException.HOST_IS_NOT_MASTER, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int B(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i3 * 3;
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long C(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static String D(StringBuilder sb, Formatter formatter, long j2) {
        long j3 = j2 == -9223372036854775807L ? 0L : j2;
        String str = j3 < 0 ? "-" : "";
        long jAbs = (Math.abs(j3) + 500) / 1000;
        long j4 = jAbs % 60;
        long j5 = (jAbs / 60) % 60;
        long j6 = jAbs / 3600;
        sb.setLength(0);
        return j6 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    public static String[] E() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = a;
        if (i2 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(StringUtils.COMMA, -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i2 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            strArrSplit[i3] = R(strArrSplit[i3]);
        }
        return strArrSplit;
    }

    public static String F(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            AbstractC6789rA1.e("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String G(int i2) {
        switch (i2) {
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
                return i2 >= 10000 ? AbstractC8235ym.g(i2, "custom (", ")") : "?";
        }
    }

    public static boolean H(IB0 ib0) {
        if (ib0 != null) {
            U0 u0 = (U0) ib0;
            if (u0.i1(1)) {
                ((XQ) u0).W1(false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean I(defpackage.IB0 r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = r6
            XQ r1 = (defpackage.XQ) r1
            int r2 = r1.K1()
            r3 = 1
            if (r2 != r3) goto L1d
            r4 = 2
            r5 = r6
            U0 r5 = (defpackage.U0) r5
            boolean r4 = r5.i1(r4)
            if (r4 == 0) goto L1d
            r1.Q1()
        L1b:
            r0 = r3
            goto L39
        L1d:
            r1 = 4
            if (r2 != r1) goto L39
            r2 = r6
            U0 r2 = (defpackage.U0) r2
            boolean r1 = r2.i1(r1)
            if (r1 == 0) goto L39
            r1 = r2
            XQ r1 = (defpackage.XQ) r1
            int r1 = r1.D1()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.o1(r1, r4, r0)
            goto L1b
        L39:
            U0 r6 = (defpackage.U0) r6
            boolean r1 = r6.i1(r3)
            if (r1 == 0) goto L47
            XQ r6 = (defpackage.XQ) r6
            r6.W1(r3)
            goto L48
        L47:
            r3 = r0
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0277Dh1.I(IB0):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J(android.net.Uri r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = r8.getScheme()
            if (r4 == 0) goto L13
            java.lang.String r5 = "rtsp"
            boolean r4 = defpackage.PN1.b(r5, r4)
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
            java.lang.String r4 = defpackage.PN1.c(r4)
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
            java.util.regex.Pattern r3 = defpackage.AbstractC0277Dh1.k
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0277Dh1.J(android.net.Uri):int");
    }

    public static boolean K(C4103hA0 c4103hA0, C4103hA0 c4103hA02, Inflater inflater) {
        if (c4103hA0.a() <= 0) {
            return false;
        }
        if (c4103hA02.a.length < c4103hA0.a()) {
            c4103hA02.b(c4103hA0.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c4103hA0.a, c4103hA0.b, c4103hA0.a());
        int iInflate = 0;
        while (true) {
            try {
                byte[] bArr = c4103hA02.a;
                iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = c4103hA02.a;
                    if (iInflate == bArr2.length) {
                        c4103hA02.b(bArr2.length * 2);
                    }
                } else {
                    c4103hA02.F(iInflate);
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

    public static void L(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean M(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean N(Context context) {
        int i2 = a;
        if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i2 == 30) {
                String str = d;
                if (PN1.b(str, "moto g(20)") || PN1.b(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean O(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long Q(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String R(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strC = PN1.c(str);
        int i2 = 0;
        String str2 = strC.split("-", 2)[0];
        if (l == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = m;
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
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                map.put(strArr[i3], strArr[i3 + 1]);
            }
            l = map;
        }
        String str4 = (String) l.get(str2);
        if (str4 != null) {
            StringBuilder sbO = AbstractC8235ym.o(str4);
            sbO.append(strC.substring(str2.length()));
            strC = sbO.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strC;
        }
        while (true) {
            String[] strArr2 = n;
            if (i2 >= strArr2.length) {
                return strC;
            }
            if (strC.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + strC.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] S(int i2, Object[] objArr) {
        YN1.c(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long T(String str) throws C5643lA0 {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            throw C5643lA0.a(null, "Invalid date/time format: " + str);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }

    public static void U(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void V(ArrayList arrayList, int i2, int i3) {
        if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            arrayList.subList(i2, i3).clear();
        }
    }

    public static long W(int i2, long j2) {
        return Y(j2, 1000000L, i2, RoundingMode.FLOOR);
    }

    public static void X(long[] jArr, long j2) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jD = AbstractC0300Dp0.d(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = AbstractC0300Dp0.d(jArr[i2], jD, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jD2 = AbstractC0300Dp0.d(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = AbstractC0300Dp0.f(jArr[i2], jD2);
                i2++;
            }
            return;
        }
        for (int i3 = 0; i3 < jArr.length; i3++) {
            long j3 = jArr[i3];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i3] = AbstractC0300Dp0.d(1000000L, AbstractC0300Dp0.d(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i3] = Z(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i3] = AbstractC0300Dp0.f(1000000L, AbstractC0300Dp0.d(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static long Y(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? Z(j2, j3, j4, roundingMode) : AbstractC0300Dp0.f(j3, AbstractC0300Dp0.d(j2, j4, RoundingMode.UNNECESSARY)) : AbstractC0300Dp0.d(j3, AbstractC0300Dp0.d(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : AbstractC0300Dp0.f(j2, AbstractC0300Dp0.d(j3, j4, RoundingMode.UNNECESSARY)) : AbstractC0300Dp0.d(j2, AbstractC0300Dp0.d(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long Z(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0277Dh1.Z(long, long, long, java.math.RoundingMode):long");
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean a0(IB0 ib0, boolean z) {
        if (ib0 == null) {
            return true;
        }
        XQ xq = (XQ) ib0;
        if (!xq.J1() || xq.K1() == 1 || xq.K1() == 4) {
            return true;
        }
        if (z) {
            xq.g2();
            if (xq.u1.n != 0) {
                return true;
            }
        }
        return false;
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return z ? iBinarySearch : i2;
    }

    public static String[] b0(String str) {
        return str.split("/", -1);
    }

    public static int c(C1204Pf c1204Pf, long j2) {
        int i2 = c1204Pf.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (c1204Pf.h(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < c1204Pf.b && c1204Pf.h(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static String[] c0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int d(P70 p70, Long l2, boolean z) {
        int i2;
        int iBinarySearch = Collections.binarySearch(p70, l2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || ((Comparable) p70.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static long d0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static void h(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i2, byte[] bArr, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[((i4 >>> 24) ^ (bArr[i2] & KotlinVersion.MAX_COMPONENT_VALUE)) & KotlinVersion.MAX_COMPONENT_VALUE] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler n(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        YN1.h(looperMyLooper);
        return new Handler(looperMyLooper, callback);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, AbstractC8250yr.c);
    }

    public static int p(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 == 22) {
            return 31;
        }
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
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
                switch (i2) {
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

    public static AudioFormat q(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(int r2) {
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
            int r2 = defpackage.AbstractC0277Dh1.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0277Dh1.r(int):int");
    }

    public static int s(int i2, String str) {
        int i3 = 0;
        for (String str2 : c0(str)) {
            if (i2 == AbstractC1865Xr0.h(AbstractC1865Xr0.d(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String t(int i2, String str) {
        String[] strArrC0 = c0(str);
        if (strArrC0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrC0) {
            if (i2 == AbstractC1865Xr0.h(AbstractC1865Xr0.d(str2))) {
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

    public static Drawable u(Context context, Resources resources, int i2) {
        return a >= 21 ? AbstractC8412zh1.a(context, resources, i2) : resources.getDrawable(i2);
    }

    public static int v(int i2) {
        if (i2 == 2 || i2 == 4) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i2 == 10) {
            return AuthCode.StatusCode.PERMISSION_NOT_EXIST;
        }
        if (i2 == 7) {
            return AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED;
        }
        if (i2 == 8) {
            return AuthCode.StatusCode.CERT_FINGERPRINT_ERROR;
        }
        switch (i2) {
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
                switch (i2) {
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

    public static int w(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            int i2 = Integer.parseInt(str2);
            return z ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String x(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long y(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long z(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }
}
