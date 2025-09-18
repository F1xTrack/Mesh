package p000;

import java.util.Arrays;

/* renamed from: e3 */
/* loaded from: classes.dex */
public final class C3966e3 {

    /* renamed from: c */
    public static final C3966e3 f26513c = new C3966e3(new C3904d3[0]);

    /* renamed from: d */
    public static final C3904d3 f26514d;

    /* renamed from: a */
    public final int f26515a;

    /* renamed from: b */
    public final C3904d3[] f26516b;

    static {
        C3904d3 c3904d3 = new C3904d3(-1, -1, new int[0], new C10825qp0[0], new long[0]);
        int[] iArr = c3904d3.f25781e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c3904d3.f25782f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f26514d = new C3904d3(0, c3904d3.f25778b, iArrCopyOf, (C10825qp0[]) Arrays.copyOf(c3904d3.f25780d, 0), jArrCopyOf);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
        AbstractC7485Dh1.m1797L(3);
        AbstractC7485Dh1.m1797L(4);
    }

    public C3966e3(C3904d3[] c3904d3Arr) {
        this.f26515a = c3904d3Arr.length;
        this.f26516b = c3904d3Arr;
    }

    /* renamed from: a */
    public final C3904d3 m17827a(int i) {
        return i < 0 ? f26514d : this.f26516b[i];
    }

    /* renamed from: b */
    public final boolean m17828b(int i) {
        if (i != this.f26515a - 1) {
            return false;
        }
        m17827a(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3966e3.class != obj.getClass()) {
            return false;
        }
        C3966e3 c3966e3 = (C3966e3) obj;
        return AbstractC7485Dh1.m1812a(null, null) && this.f26515a == c3966e3.f26515a && Arrays.equals(this.f26516b, c3966e3.f26516b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26516b) + (((((this.f26515a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C3904d3[] c3904d3Arr = this.f26516b;
            if (i >= c3904d3Arr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            c3904d3Arr[i].getClass();
            for (int i2 = 0; i2 < c3904d3Arr[i].f25781e.length; i2++) {
                sb.append("ad(state=");
                int i3 = c3904d3Arr[i].f25781e[i2];
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
                sb.append(c3904d3Arr[i].f25782f[i2]);
                sb.append(')');
                if (i2 < c3904d3Arr[i].f25781e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c3904d3Arr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
