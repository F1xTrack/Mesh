package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CI0 {

    /* renamed from: d */
    public static ArrayList f1301d;

    /* renamed from: e */
    public static int f1302e;

    /* renamed from: f */
    public static TB0 f1303f;

    /* renamed from: g */
    public static TB0 f1304g;

    /* renamed from: h */
    public static TB0 f1305h;

    /* renamed from: i */
    public static TB0 f1306i;

    /* renamed from: a */
    public final int f1307a;

    /* renamed from: b */
    public final TB0 f1308b;

    /* renamed from: c */
    public final double f1309c;

    public CI0(int i, TB0 tb0, double d) {
        this.f1307a = i;
        this.f1308b = tb0;
        this.f1309c = d;
    }

    /* renamed from: a */
    public static double m1138a(int i) {
        TB0 tb0 = f1305h;
        double dAtan2 = Math.atan2(tb0.f11195b, tb0.f11194a) * 57.29577951308232d;
        TB0 tb02 = f1306i;
        double dAtan22 = Math.atan2(tb02.f11195b, tb02.f11194a) * 57.29577951308232d;
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 0) {
            return dAtan22;
        }
        if (iM26247x != 1) {
            return iM26247x != 2 ? ConfigValue.DOUBLE_DEFAULT_VALUE : dAtan2;
        }
        if (Math.abs(dAtan2 - dAtan22) > 180.0d) {
            dAtan2 += 360.0d;
        }
        return (dAtan2 + dAtan22) / 2.0d;
    }

    /* renamed from: b */
    public static boolean m1139b(TB0 tb0) {
        return tb0.f11194a == ConfigValue.DOUBLE_DEFAULT_VALUE && tb0.f11195b == ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: c */
    public static TB0 m1140c(TB0 tb0, TB0 tb02) {
        return new TB0(tb02.f11194a - tb0.f11194a, tb02.f11195b - tb0.f11195b);
    }
}
