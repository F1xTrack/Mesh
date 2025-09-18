package p000;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class W31 {

    /* renamed from: a */
    public final String f12945a;

    /* renamed from: b */
    public final int f12946b;

    /* renamed from: c */
    public final Integer f12947c;

    /* renamed from: d */
    public final Integer f12948d;

    /* renamed from: e */
    public final float f12949e;

    /* renamed from: f */
    public final boolean f12950f;

    /* renamed from: g */
    public final boolean f12951g;

    /* renamed from: h */
    public final boolean f12952h;

    /* renamed from: i */
    public final boolean f12953i;

    /* renamed from: j */
    public final int f12954j;

    public W31(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f12945a = str;
        this.f12946b = i;
        this.f12947c = num;
        this.f12948d = num2;
        this.f12949e = f;
        this.f12950f = z;
        this.f12951g = z2;
        this.f12952h = z3;
        this.f12953i = z4;
        this.f12954j = i2;
    }

    /* renamed from: a */
    public static int m8657a(String str) throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                AbstractC11153tN0.m24885C("Ignoring unknown alignment: ", str);
                return -1;
        }
    }

    /* renamed from: b */
    public static boolean m8658b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC10872rA1.m24176i("Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: c */
    public static Integer m8659c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            YN1.m9278c(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC10983s22.m24580b(((j >> 24) & 255) ^ 255), AbstractC10983s22.m24580b(j & 255), AbstractC10983s22.m24580b((j >> 8) & 255), AbstractC10983s22.m24580b((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC10872rA1.m24176i("Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
