package p000;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: Ui1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8371Ui1 {

    /* renamed from: a */
    public static final HashMap f11995a;

    /* renamed from: b */
    public static final EnumC11690xa1 f11996b;

    static {
        HashMap map = new HashMap();
        f11995a = map;
        f11996b = EnumC11690xa1.f45684a;
        HashMap map2 = new HashMap();
        C1425We c1425We = C1425We.f13302d;
        map2.put(1, c1425We);
        C1425We c1425We2 = C1425We.f13304f;
        map2.put(2, c1425We2);
        C1425We c1425We3 = C1425We.f13305g;
        map2.put(4096, c1425We3);
        map2.put(8192, c1425We3);
        HashMap map3 = new HashMap();
        map3.put(1, c1425We);
        map3.put(2, c1425We2);
        map3.put(4096, c1425We3);
        map3.put(8192, c1425We3);
        HashMap map4 = new HashMap();
        map4.put(1, c1425We);
        map4.put(4, c1425We2);
        map4.put(4096, c1425We3);
        map4.put(16384, c1425We3);
        map4.put(2, c1425We);
        map4.put(8, c1425We2);
        map4.put(8192, c1425We3);
        map4.put(32768, c1425We3);
        HashMap map5 = new HashMap();
        map5.put(256, c1425We2);
        map5.put(512, C1425We.f13303e);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    /* renamed from: a */
    public static C1425We m8125a(int i, String str) {
        C1425We c1425We;
        Map map = (Map) f11995a.get(str);
        if (map != null && (c1425We = (C1425We) map.get(Integer.valueOf(i))) != null) {
            return c1425We;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i));
        AbstractC7806Jm0.m4412f("VideoConfigUtil");
        return C1425We.f13302d;
    }

    /* renamed from: b */
    public static C1488Xe m8126b(C1613Zd c1613Zd, C0149CM c0149cm, C1614Ze c1614Ze) {
        AbstractC9104dM1.m17550i(c0149cm.m1147b(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c0149cm + "]");
        int i = c1613Zd.f15048c;
        String str = "video/avc";
        String str2 = i != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i2 = c0149cm.f1336a;
        if (c1614Ze == null) {
            c7276zd = null;
        } else {
            Set setEmptySet = (Set) AbstractC0338FM.f3167b.get(Integer.valueOf(i2));
            if (setEmptySet == null) {
                setEmptySet = Collections.emptySet();
            }
            Set setEmptySet2 = (Set) AbstractC0338FM.f3166a.get(Integer.valueOf(c0149cm.f1337b));
            if (setEmptySet2 == null) {
                setEmptySet2 = Collections.emptySet();
            }
            for (C7276zd c7276zd : c1614Ze.f15066d) {
                if (setEmptySet.contains(Integer.valueOf(c7276zd.f46908j)) && setEmptySet2.contains(Integer.valueOf(c7276zd.f46906h))) {
                    String str3 = c7276zd.f46900b;
                    if (str2.equals(str3)) {
                        AbstractC7806Jm0.m4412f("VideoConfigUtil");
                    } else if (i == -1) {
                        c0149cm.toString();
                        AbstractC7806Jm0.m4412f("VideoConfigUtil");
                    }
                    str2 = str3;
                    break;
                }
            }
            c7276zd = null;
        }
        if (c7276zd == null) {
            if (i == -1) {
                if (i2 != 1) {
                    if (i2 == 3 || i2 == 4 || i2 == 5) {
                        str = "video/hevc";
                    } else {
                        if (i2 != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + c0149cm + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (c1614Ze == null) {
                c0149cm.toString();
                AbstractC7806Jm0.m4412f("VideoConfigUtil");
            } else {
                c0149cm.toString();
                AbstractC7806Jm0.m4412f("VideoConfigUtil");
            }
        }
        if (str2 != null) {
            return new C1488Xe(str2, -1, c7276zd != null ? c7276zd : null);
        }
        throw new NullPointerException("Null mimeType");
    }

    /* renamed from: c */
    public static int m8127c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * new Rational(i6, i7).doubleValue() * rational2.doubleValue() * rational.doubleValue() * i);
        if (AbstractC7806Jm0.m4411e("VideoConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue));
        }
        if (!C1551Ye.f14407f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (AbstractC7806Jm0.m4411e("VideoConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC7806Jm0.m4412f("VideoConfigUtil");
        return iDoubleValue;
    }

    /* renamed from: d */
    public static C1362Ve m8128d(C7276zd c7276zd) {
        C1361Vd c1361VdM8525d = C1362Ve.m8525d();
        String str = c7276zd.f46900b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        c1361VdM8525d.f12660a = str;
        c1361VdM8525d.f12661b = Integer.valueOf(c7276zd.f46905g);
        c1361VdM8525d.f12663d = new Size(c7276zd.f46903e, c7276zd.f46904f);
        c1361VdM8525d.f12666g = Integer.valueOf(c7276zd.f46902d);
        c1361VdM8525d.f12668i = Integer.valueOf(c7276zd.f46901c);
        EnumC11690xa1 enumC11690xa1 = f11996b;
        if (enumC11690xa1 == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        c1361VdM8525d.f12662c = enumC11690xa1;
        return c1361VdM8525d.m8516a();
    }
}
