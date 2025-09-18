package defpackage;

import java.util.Arrays;

/* renamed from: e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3507e3 {
    public static final C3507e3 c = new C3507e3(new C3317d3[0]);
    public static final C3317d3 d;
    public final int a;
    public final C3317d3[] b;

    static {
        C3317d3 c3317d3 = new C3317d3(-1, -1, new int[0], new C6721qp0[0], new long[0]);
        int[] iArr = c3317d3.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c3317d3.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        d = new C3317d3(0, c3317d3.b, iArrCopyOf, (C6721qp0[]) Arrays.copyOf(c3317d3.d, 0), jArrCopyOf);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
    }

    public C3507e3(C3317d3[] c3317d3Arr) {
        this.a = c3317d3Arr.length;
        this.b = c3317d3Arr;
    }

    public final C3317d3 a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean b(int i) {
        if (i != this.a - 1) {
            return false;
        }
        a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3507e3.class != obj.getClass()) {
            return false;
        }
        C3507e3 c3507e3 = (C3507e3) obj;
        return AbstractC0277Dh1.a(null, null) && this.a == c3507e3.a && Arrays.equals(this.b, c3507e3.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C3317d3[] c3317d3Arr = this.b;
            if (i >= c3317d3Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c3317d3Arr[i].getClass();
            for (int i2 = 0; i2 < c3317d3Arr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = c3317d3Arr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c3317d3Arr[i].f[i2]);
                sb.append(')');
                if (i2 < c3317d3Arr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c3317d3Arr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
