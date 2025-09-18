package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: Yg0 */
/* loaded from: classes.dex */
public final class C1910Yg0 {
    public final List a;
    public final C1847Xl0 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final P4 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final K4 q;
    public final C0999Mo1 r;
    public final L4 s;
    public final List t;
    public final int u;
    public final boolean v;
    public final C0481Fx1 w;
    public final C7375uF x;
    public final int y;

    public C1910Yg0(List list, C1847Xl0 c1847Xl0, String str, long j, int i, long j2, String str2, List list2, P4 p4, int i2, int i3, int i4, float f, float f2, float f3, float f4, K4 k4, C0999Mo1 c0999Mo1, List list3, int i5, L4 l4, boolean z, C0481Fx1 c0481Fx1, C7375uF c7375uF, int i6) {
        this.a = list;
        this.b = c1847Xl0;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = p4;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = k4;
        this.r = c0999Mo1;
        this.t = list3;
        this.u = i5;
        this.s = l4;
        this.v = z;
        this.w = c0481Fx1;
        this.x = c7375uF;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sbO = AbstractC8235ym.o(str);
        sbO.append(this.c);
        sbO.append("\n");
        C1847Xl0 c1847Xl0 = this.b;
        C1910Yg0 c1910Yg0 = (C1910Yg0) c1847Xl0.i.j(this.f, null);
        if (c1910Yg0 != null) {
            sbO.append("\t\tParents: ");
            sbO.append(c1910Yg0.c);
            for (C1910Yg0 c1910Yg02 = (C1910Yg0) c1847Xl0.i.j(c1910Yg0.f, null); c1910Yg02 != null; c1910Yg02 = (C1910Yg0) c1847Xl0.i.j(c1910Yg02.f, null)) {
                sbO.append("->");
                sbO.append(c1910Yg02.c);
            }
            sbO.append(str);
            sbO.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sbO.append(str);
            sbO.append("\tMasks: ");
            sbO.append(list.size());
            sbO.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sbO.append(str);
            sbO.append("\tBackground: ");
            sbO.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sbO.append(str);
            sbO.append("\tShapes:\n");
            for (Object obj : list2) {
                sbO.append(str);
                sbO.append("\t\t");
                sbO.append(obj);
                sbO.append("\n");
            }
        }
        return sbO.toString();
    }

    public final String toString() {
        return a("");
    }
}
