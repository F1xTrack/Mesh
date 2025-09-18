package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CI0 {
    public static ArrayList d;
    public static int e;
    public static TB0 f;
    public static TB0 g;
    public static TB0 h;
    public static TB0 i;
    public final int a;
    public final TB0 b;
    public final double c;

    public CI0(int i2, TB0 tb0, double d2) {
        this.a = i2;
        this.b = tb0;
        this.c = d2;
    }

    public static double a(int i2) {
        TB0 tb0 = h;
        double dAtan2 = Math.atan2(tb0.b, tb0.a) * 57.29577951308232d;
        TB0 tb02 = i;
        double dAtan22 = Math.atan2(tb02.b, tb02.a) * 57.29577951308232d;
        int iX = AbstractC8235ym.x(i2);
        if (iX == 0) {
            return dAtan22;
        }
        if (iX != 1) {
            return iX != 2 ? ConfigValue.DOUBLE_DEFAULT_VALUE : dAtan2;
        }
        if (Math.abs(dAtan2 - dAtan22) > 180.0d) {
            dAtan2 += 360.0d;
        }
        return (dAtan2 + dAtan22) / 2.0d;
    }

    public static boolean b(TB0 tb0) {
        return tb0.a == ConfigValue.DOUBLE_DEFAULT_VALUE && tb0.b == ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public static TB0 c(TB0 tb0, TB0 tb02) {
        return new TB0(tb02.a - tb0.a, tb02.b - tb0.b);
    }
}
