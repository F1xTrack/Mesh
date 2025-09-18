package p000;

import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public abstract class LX0 extends QX0 {

    /* renamed from: d */
    public final long f6695d;

    /* renamed from: e */
    public final long f6696e;

    /* renamed from: f */
    public final List f6697f;

    /* renamed from: g */
    public final long f6698g;

    /* renamed from: h */
    public final long f6699h;

    /* renamed from: i */
    public final long f6700i;

    public LX0(C9481gJ0 c9481gJ0, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(c9481gJ0, j, j2);
        this.f6695d = j3;
        this.f6696e = j4;
        this.f6697f = list;
        this.f6700i = j5;
        this.f6698g = j6;
        this.f6699h = j7;
    }

    /* renamed from: b */
    public final long m5015b(long j, long j2) {
        long jMo5017d = mo5017d(j);
        return jMo5017d != -1 ? jMo5017d : (int) (m5019f((j2 - this.f6699h) + this.f6700i, j) - m5016c(j, j2));
    }

    /* renamed from: c */
    public final long m5016c(long j, long j2) {
        long jMo5017d = mo5017d(j);
        long j3 = this.f6695d;
        if (jMo5017d == -1) {
            long j4 = this.f6698g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, m5019f((j2 - this.f6699h) - j4, j));
            }
        }
        return j3;
    }

    /* renamed from: d */
    public abstract long mo5017d(long j);

    /* renamed from: e */
    public final long m5018e(long j, long j2) {
        long j3 = this.f9657b;
        long j4 = this.f6695d;
        List list = this.f6697f;
        if (list != null) {
            return (((OX0) list.get((int) (j - j4))).f8475b * 1000000) / j3;
        }
        long jMo5017d = mo5017d(j2);
        return (jMo5017d == -1 || j != (j4 + jMo5017d) - 1) ? (this.f6696e * 1000000) / j3 : j2 - m5020g(j);
    }

    /* renamed from: f */
    public final long m5019f(long j, long j2) {
        long jMo5017d = mo5017d(j2);
        long j3 = this.f6695d;
        if (jMo5017d == 0) {
            return j3;
        }
        if (this.f6697f == null) {
            long j4 = (j / ((this.f6696e * 1000000) / this.f9657b)) + j3;
            return j4 < j3 ? j3 : jMo5017d == -1 ? j4 : Math.min(j4, (j3 + jMo5017d) - 1);
        }
        long j5 = (jMo5017d + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long jM5020g = m5020g(j7);
            if (jM5020g < j) {
                j6 = j7 + 1;
            } else {
                if (jM5020g <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    /* renamed from: g */
    public final long m5020g(long j) {
        long j2 = this.f6695d;
        List list = this.f6697f;
        long j3 = list != null ? ((OX0) list.get((int) (j - j2))).f8474a - this.f9658c : (j - j2) * this.f6696e;
        int i = AbstractC7485Dh1.f2166a;
        return AbstractC7485Dh1.m1810Y(j3, 1000000L, this.f9657b, RoundingMode.FLOOR);
    }

    /* renamed from: h */
    public abstract C9481gJ0 mo5021h(C10393nR0 c10393nR0, long j);

    /* renamed from: i */
    public boolean mo5022i() {
        return this.f6697f != null;
    }
}
