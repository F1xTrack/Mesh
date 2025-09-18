package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: Ui1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1605Ui1 {
    public static final HashMap a;
    public static final EnumC8011xa1 b;

    static {
        HashMap map = new HashMap();
        a = map;
        b = EnumC8011xa1.a;
        HashMap map2 = new HashMap();
        C1747We c1747We = C1747We.d;
        map2.put(1, c1747We);
        C1747We c1747We2 = C1747We.f;
        map2.put(2, c1747We2);
        C1747We c1747We3 = C1747We.g;
        map2.put(4096, c1747We3);
        map2.put(8192, c1747We3);
        HashMap map3 = new HashMap();
        map3.put(1, c1747We);
        map3.put(2, c1747We2);
        map3.put(4096, c1747We3);
        map3.put(8192, c1747We3);
        HashMap map4 = new HashMap();
        map4.put(1, c1747We);
        map4.put(4, c1747We2);
        map4.put(4096, c1747We3);
        map4.put(16384, c1747We3);
        map4.put(2, c1747We);
        map4.put(8, c1747We2);
        map4.put(8192, c1747We3);
        map4.put(32768, c1747We3);
        HashMap map5 = new HashMap();
        map5.put(256, c1747We2);
        map5.put(512, C1747We.e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static C1747We a(int i, String str) {
        C1747We c1747We;
        Map map = (Map) a.get(str);
        if (map != null && (c1747We = (C1747We) map.get(Integer.valueOf(i))) != null) {
            return c1747We;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i));
        AbstractC0759Jm0.f("VideoConfigUtil");
        return C1747We.d;
    }

    public static C1825Xe b(C1978Zd c1978Zd, CM cm, C1981Ze c1981Ze) {
        AbstractC3377dM1.i(cm.b(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + cm + "]");
        int i = c1978Zd.c;
        String str = "video/avc";
        String str2 = i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i2 = cm.a;
        if (c1981Ze == null) {
            c8398zd = null;
        } else {
            Set setEmptySet = (Set) FM.b.get(Integer.valueOf(i2));
            if (setEmptySet == null) {
                setEmptySet = Collections.emptySet();
            }
            Set setEmptySet2 = (Set) FM.a.get(Integer.valueOf(cm.b));
            if (setEmptySet2 == null) {
                setEmptySet2 = Collections.emptySet();
            }
            for (C8398zd c8398zd : c1981Ze.d) {
                if (setEmptySet.contains(Integer.valueOf(c8398zd.j)) && setEmptySet2.contains(Integer.valueOf(c8398zd.h))) {
                    String str3 = c8398zd.b;
                    if (str2.equals(str3)) {
                        AbstractC0759Jm0.f("VideoConfigUtil");
                    } else if (i == -1) {
                        cm.toString();
                        AbstractC0759Jm0.f("VideoConfigUtil");
                    }
                    str2 = str3;
                    break;
                }
            }
            c8398zd = null;
        }
        if (c8398zd == null) {
            if (i == -1) {
                if (i2 != 1) {
                    if (i2 == 3 || i2 == 4 || i2 == 5) {
                        str = "video/hevc";
                    } else {
                        if (i2 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + cm + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (c1981Ze == null) {
                cm.toString();
                AbstractC0759Jm0.f("VideoConfigUtil");
            } else {
                cm.toString();
                AbstractC0759Jm0.f("VideoConfigUtil");
            }
        }
        if (str2 != null) {
            return new C1825Xe(str2, -1, c8398zd != null ? c8398zd : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    public static int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * new Rational(i6, i7).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (AbstractC0759Jm0.e("VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue));
        }
        if (!C1903Ye.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (AbstractC0759Jm0.e("VideoConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC0759Jm0.f("VideoConfigUtil");
        return iDoubleValue;
    }

    public static C1669Ve d(C8398zd c8398zd) {
        C1666Vd c1666VdD = C1669Ve.d();
        String str = c8398zd.b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        c1666VdD.a = str;
        c1666VdD.b = Integer.valueOf(c8398zd.g);
        c1666VdD.d = new Size(c8398zd.e, c8398zd.f);
        c1666VdD.g = Integer.valueOf(c8398zd.d);
        c1666VdD.i = Integer.valueOf(c8398zd.c);
        EnumC8011xa1 enumC8011xa1 = b;
        if (enumC8011xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1666VdD.c = enumC8011xa1;
        return c1666VdD.a();
    }
}
