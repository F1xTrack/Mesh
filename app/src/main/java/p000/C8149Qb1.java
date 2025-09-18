package p000;

import java.util.Arrays;

/* renamed from: Qb1 */
/* loaded from: classes.dex */
public final class C8149Qb1 {

    /* renamed from: a */
    public final int f9687a;

    /* renamed from: b */
    public final String f9688b;

    /* renamed from: c */
    public final int f9689c;

    /* renamed from: d */
    public final C6686qX[] f9690d;

    /* renamed from: e */
    public int f9691e;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
    }

    public C8149Qb1(String str, C6686qX... c6686qXArr) {
        YN1.m9278c(c6686qXArr.length > 0);
        this.f9688b = str;
        this.f9690d = c6686qXArr;
        this.f9687a = c6686qXArr.length;
        int iM9165h = AbstractC8544Xr0.m9165h(c6686qXArr[0].f40974m);
        this.f9689c = iM9165h == -1 ? AbstractC8544Xr0.m9165h(c6686qXArr[0].f40973l) : iM9165h;
        String str2 = c6686qXArr[0].f40965d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c6686qXArr[0].f40967f | 16384;
        for (int i2 = 1; i2 < c6686qXArr.length; i2++) {
            String str3 = c6686qXArr[i2].f40965d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m6734c("languages", i2, c6686qXArr[0].f40965d, c6686qXArr[i2].f40965d);
                return;
            } else {
                if (i != (c6686qXArr[i2].f40967f | 16384)) {
                    m6734c("role flags", i2, Integer.toBinaryString(c6686qXArr[0].f40967f), Integer.toBinaryString(c6686qXArr[i2].f40967f));
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public static void m6734c(String str, int i, String str2, String str3) {
        StringBuilder sbM2541x = F91.m2541x("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM2541x.append(str3);
        sbM2541x.append("' (track ");
        sbM2541x.append(i);
        sbM2541x.append(")");
        AbstractC10872rA1.m24172e("", new IllegalStateException(sbM2541x.toString()));
    }

    /* renamed from: a */
    public final C6686qX m6735a() {
        return this.f9690d[0];
    }

    /* renamed from: b */
    public final int m6736b(C6686qX c6686qX) {
        int i = 0;
        while (true) {
            C6686qX[] c6686qXArr = this.f9690d;
            if (i >= c6686qXArr.length) {
                return -1;
            }
            if (c6686qX == c6686qXArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8149Qb1.class != obj.getClass()) {
            return false;
        }
        C8149Qb1 c8149Qb1 = (C8149Qb1) obj;
        return this.f9688b.equals(c8149Qb1.f9688b) && Arrays.equals(this.f9690d, c8149Qb1.f9690d);
    }

    public final int hashCode() {
        if (this.f9691e == 0) {
            this.f9691e = Arrays.hashCode(this.f9690d) + AbstractC1374Vq.m8586e(527, 31, this.f9688b);
        }
        return this.f9691e;
    }
}
