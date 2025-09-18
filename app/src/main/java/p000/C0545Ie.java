package p000;

import android.util.Size;

/* renamed from: Ie */
/* loaded from: classes.dex */
public final class C0545Ie {

    /* renamed from: a */
    public final int f5063a;

    /* renamed from: b */
    public final J61 f5064b;

    /* renamed from: c */
    public final long f5065c;

    public C0545Ie(int i, J61 j61, long j) {
        if (i == 0) {
            throw new NullPointerException("Null configType");
        }
        this.f5063a = i;
        this.f5064b = j61;
        this.f5065c = j;
    }

    /* renamed from: a */
    public static int m3958a(int i) {
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

    /* renamed from: b */
    public static C0545Ie m3959b(int i, int i2, Size size, C0985Pe c0985Pe) {
        int iM3958a = m3958a(i2);
        J61 j61 = J61.NOT_SUPPORT;
        int iM18157a = AbstractC9318f21.m18157a(size);
        if (i == 1) {
            if (iM18157a <= AbstractC9318f21.m18157a((Size) c0985Pe.f9205b.get(Integer.valueOf(i2)))) {
                j61 = J61.s720p;
            } else {
                if (iM18157a <= AbstractC9318f21.m18157a((Size) c0985Pe.f9207d.get(Integer.valueOf(i2)))) {
                    j61 = J61.s1440p;
                }
            }
        } else if (iM18157a <= AbstractC9318f21.m18157a(c0985Pe.f9204a)) {
            j61 = J61.VGA;
        } else if (iM18157a <= AbstractC9318f21.m18157a(c0985Pe.f9206c)) {
            j61 = J61.PREVIEW;
        } else if (iM18157a <= AbstractC9318f21.m18157a(c0985Pe.f9208e)) {
            j61 = J61.RECORD;
        } else {
            if (iM18157a <= AbstractC9318f21.m18157a((Size) c0985Pe.f9209f.get(Integer.valueOf(i2)))) {
                j61 = J61.MAXIMUM;
            } else {
                Size size2 = (Size) c0985Pe.f9210g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (iM18157a <= size2.getHeight() * size2.getWidth()) {
                        j61 = J61.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new C0545Ie(iM3958a, j61, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0545Ie)) {
            return false;
        }
        C0545Ie c0545Ie = (C0545Ie) obj;
        return AbstractC7222ym.m26226c(this.f5063a, c0545Ie.f5063a) && this.f5064b.equals(c0545Ie.f5064b) && this.f5065c == c0545Ie.f5065c;
    }

    public final int hashCode() {
        int iM26247x = (((AbstractC7222ym.m26247x(this.f5063a) ^ 1000003) * 1000003) ^ this.f5064b.hashCode()) * 1000003;
        long j = this.f5065c;
        return iM26247x ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.f5063a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.f5064b);
        sb.append(", streamUseCase=");
        return AbstractC0852NX.m5760i(sb, this.f5065c, "}");
    }
}
