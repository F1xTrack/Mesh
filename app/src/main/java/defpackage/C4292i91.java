package defpackage;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: i91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4292i91 {
    public float a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public boolean o;
    public boolean p;
    public EnumC7769wJ0 q;
    public EnumC7959xJ0 r;
    public int s;
    public int t;
    public String u;
    public String v;
    public int w;

    public static int a(int i, NM0 nm0) {
        return !nm0.a.hasKey("textAlign") ? i : (!"justify".equals(nm0.a.getString("textAlign")) || Build.VERSION.SDK_INT < 26) ? 0 : 1;
    }

    public static int b(String str) {
        if (str == null || StringUtils.UNDEFINED.equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        "Invalid layoutDirection: ".concat(str);
        AbstractC3393dS.p("ReactNative");
        return -1;
    }

    public final float c() {
        float fC = this.c ? AbstractC7586vL1.c(this.j, Float.NaN) : AbstractC7586vL1.b(this.j);
        int i = this.g;
        if (i > 0) {
            return fC / i;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.g);
    }

    public final void d(float f) {
        this.h = f;
        if (f != -1.0f) {
            f = (float) (this.c ? Math.ceil(AbstractC7586vL1.c(f, Float.NaN)) : Math.ceil(AbstractC7586vL1.b(f)));
        }
        this.g = (int) f;
    }
}
