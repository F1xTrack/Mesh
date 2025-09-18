package p000;

import java.util.List;
import java.util.Locale;

/* renamed from: Yg0 */
/* loaded from: classes.dex */
public final class C8574Yg0 {

    /* renamed from: a */
    public final List f14418a;

    /* renamed from: b */
    public final C8532Xl0 f14419b;

    /* renamed from: c */
    public final String f14420c;

    /* renamed from: d */
    public final long f14421d;

    /* renamed from: e */
    public final int f14422e;

    /* renamed from: f */
    public final long f14423f;

    /* renamed from: g */
    public final String f14424g;

    /* renamed from: h */
    public final List f14425h;

    /* renamed from: i */
    public final C0949P4 f14426i;

    /* renamed from: j */
    public final int f14427j;

    /* renamed from: k */
    public final int f14428k;

    /* renamed from: l */
    public final int f14429l;

    /* renamed from: m */
    public final float f14430m;

    /* renamed from: n */
    public final float f14431n;

    /* renamed from: o */
    public final float f14432o;

    /* renamed from: p */
    public final float f14433p;

    /* renamed from: q */
    public final C0635K4 f14434q;

    /* renamed from: r */
    public final C7967Mo1 f14435r;

    /* renamed from: s */
    public final C0698L4 f14436s;

    /* renamed from: t */
    public final List f14437t;

    /* renamed from: u */
    public final int f14438u;

    /* renamed from: v */
    public final boolean f14439v;

    /* renamed from: w */
    public final C7621Fx1 f14440w;

    /* renamed from: x */
    public final C6937uF f14441x;

    /* renamed from: y */
    public final int f14442y;

    public C8574Yg0(List list, C8532Xl0 c8532Xl0, String str, long j, int i, long j2, String str2, List list2, C0949P4 c0949p4, int i2, int i3, int i4, float f, float f2, float f3, float f4, C0635K4 c0635k4, C7967Mo1 c7967Mo1, List list3, int i5, C0698L4 c0698l4, boolean z, C7621Fx1 c7621Fx1, C6937uF c6937uF, int i6) {
        this.f14418a = list;
        this.f14419b = c8532Xl0;
        this.f14420c = str;
        this.f14421d = j;
        this.f14422e = i;
        this.f14423f = j2;
        this.f14424g = str2;
        this.f14425h = list2;
        this.f14426i = c0949p4;
        this.f14427j = i2;
        this.f14428k = i3;
        this.f14429l = i4;
        this.f14430m = f;
        this.f14431n = f2;
        this.f14432o = f3;
        this.f14433p = f4;
        this.f14434q = c0635k4;
        this.f14435r = c7967Mo1;
        this.f14437t = list3;
        this.f14438u = i5;
        this.f14436s = c0698l4;
        this.f14439v = z;
        this.f14440w = c7621Fx1;
        this.f14441x = c6937uF;
        this.f14442y = i6;
    }

    /* renamed from: a */
    public final String m9334a(String str) {
        int i;
        StringBuilder sbM26238o = AbstractC7222ym.m26238o(str);
        sbM26238o.append(this.f14420c);
        sbM26238o.append("\n");
        C8532Xl0 c8532Xl0 = this.f14419b;
        C8574Yg0 c8574Yg0 = (C8574Yg0) c8532Xl0.f13955i.m2382j(this.f14423f, null);
        if (c8574Yg0 != null) {
            sbM26238o.append("\t\tParents: ");
            sbM26238o.append(c8574Yg0.f14420c);
            for (C8574Yg0 c8574Yg02 = (C8574Yg0) c8532Xl0.f13955i.m2382j(c8574Yg0.f14423f, null); c8574Yg02 != null; c8574Yg02 = (C8574Yg0) c8532Xl0.f13955i.m2382j(c8574Yg02.f14423f, null)) {
                sbM26238o.append("->");
                sbM26238o.append(c8574Yg02.f14420c);
            }
            sbM26238o.append(str);
            sbM26238o.append("\n");
        }
        List list = this.f14425h;
        if (!list.isEmpty()) {
            sbM26238o.append(str);
            sbM26238o.append("\tMasks: ");
            sbM26238o.append(list.size());
            sbM26238o.append("\n");
        }
        int i2 = this.f14427j;
        if (i2 != 0 && (i = this.f14428k) != 0) {
            sbM26238o.append(str);
            sbM26238o.append("\tBackground: ");
            sbM26238o.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f14429l)));
        }
        List list2 = this.f14418a;
        if (!list2.isEmpty()) {
            sbM26238o.append(str);
            sbM26238o.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM26238o.append(str);
                sbM26238o.append("\t\t");
                sbM26238o.append(obj);
                sbM26238o.append("\n");
            }
        }
        return sbM26238o.toString();
    }

    public final String toString() {
        return m9334a("");
    }
}
