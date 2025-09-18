package defpackage;

import java.util.Arrays;

/* renamed from: Qb1 */
/* loaded from: classes.dex */
public final class C1272Qb1 {
    public final int a;
    public final String b;
    public final int c;
    public final C6666qX[] d;
    public int e;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
    }

    public C1272Qb1(String str, C6666qX... c6666qXArr) {
        YN1.c(c6666qXArr.length > 0);
        this.b = str;
        this.d = c6666qXArr;
        this.a = c6666qXArr.length;
        int iH = AbstractC1865Xr0.h(c6666qXArr[0].m);
        this.c = iH == -1 ? AbstractC1865Xr0.h(c6666qXArr[0].l) : iH;
        String str2 = c6666qXArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c6666qXArr[0].f | 16384;
        for (int i2 = 1; i2 < c6666qXArr.length; i2++) {
            String str3 = c6666qXArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i2, c6666qXArr[0].d, c6666qXArr[i2].d);
                return;
            } else {
                if (i != (c6666qXArr[i2].f | 16384)) {
                    c("role flags", i2, Integer.toBinaryString(c6666qXArr[0].f), Integer.toBinaryString(c6666qXArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void c(String str, int i, String str2, String str3) {
        StringBuilder sbX = F91.x("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbX.append(str3);
        sbX.append("' (track ");
        sbX.append(i);
        sbX.append(")");
        AbstractC6789rA1.e("", new IllegalStateException(sbX.toString()));
    }

    public final C6666qX a() {
        return this.d[0];
    }

    public final int b(C6666qX c6666qX) {
        int i = 0;
        while (true) {
            C6666qX[] c6666qXArr = this.d;
            if (i >= c6666qXArr.length) {
                return -1;
            }
            if (c6666qX == c6666qXArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1272Qb1.class != obj.getClass()) {
            return false;
        }
        C1272Qb1 c1272Qb1 = (C1272Qb1) obj;
        return this.b.equals(c1272Qb1.b) && Arrays.equals(this.d, c1272Qb1.d);
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + AbstractC1705Vq.e(527, 31, this.b);
        }
        return this.e;
    }
}
