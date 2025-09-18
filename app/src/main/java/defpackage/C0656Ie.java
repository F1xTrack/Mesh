package defpackage;

import android.util.Size;

/* renamed from: Ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656Ie {
    public final int a;
    public final J61 b;
    public final long c;

    public C0656Ie(int i, J61 j61, long j) {
        if (i == 0) {
            throw new NullPointerException("Null configType");
        }
        this.a = i;
        this.b = j61;
        this.c = j;
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static C0656Ie b(int i, int i2, Size size, C1201Pe c1201Pe) {
        int iA = a(i2);
        J61 j61 = J61.NOT_SUPPORT;
        int iA2 = AbstractC3696f21.a(size);
        if (i == 1) {
            if (iA2 <= AbstractC3696f21.a((Size) c1201Pe.b.get(Integer.valueOf(i2)))) {
                j61 = J61.s720p;
            } else {
                if (iA2 <= AbstractC3696f21.a((Size) c1201Pe.d.get(Integer.valueOf(i2)))) {
                    j61 = J61.s1440p;
                }
            }
        } else if (iA2 <= AbstractC3696f21.a(c1201Pe.a)) {
            j61 = J61.VGA;
        } else if (iA2 <= AbstractC3696f21.a(c1201Pe.c)) {
            j61 = J61.PREVIEW;
        } else if (iA2 <= AbstractC3696f21.a(c1201Pe.e)) {
            j61 = J61.RECORD;
        } else {
            if (iA2 <= AbstractC3696f21.a((Size) c1201Pe.f.get(Integer.valueOf(i2)))) {
                j61 = J61.MAXIMUM;
            } else {
                Size size2 = (Size) c1201Pe.g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (iA2 <= size2.getHeight() * size2.getWidth()) {
                        j61 = J61.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C0656Ie(iA, j61, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0656Ie)) {
            return false;
        }
        C0656Ie c0656Ie = (C0656Ie) obj;
        return AbstractC8235ym.c(this.a, c0656Ie.a) && this.b.equals(c0656Ie.b) && this.c == c0656Ie.c;
    }

    public final int hashCode() {
        int iX = (((AbstractC8235ym.x(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iX ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return NX.i(sb, this.c, "}");
    }
}
