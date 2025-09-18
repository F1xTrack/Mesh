package p000;

import android.util.Range;
import java.util.Arrays;

/* renamed from: Ye */
/* loaded from: classes.dex */
public final class C1551Ye {

    /* renamed from: e */
    public static final Range f14406e = new Range(0, Integer.MAX_VALUE);

    /* renamed from: f */
    public static final Range f14407f = new Range(0, Integer.MAX_VALUE);

    /* renamed from: g */
    public static final C9108dO1 f14408g;

    /* renamed from: a */
    public final C9108dO1 f14409a;

    /* renamed from: b */
    public final Range f14410b;

    /* renamed from: c */
    public final Range f14411c;

    /* renamed from: d */
    public final int f14412d;

    static {
        C6630pe c6630pe = C6630pe.f40250f;
        f14408g = C9108dO1.m17560w(Arrays.asList(c6630pe, C6630pe.f40249e, C6630pe.f40248d), new C0481Hd(c6630pe, 1));
    }

    public C1551Ye(C9108dO1 c9108dO1, Range range, Range range2, int i) {
        this.f14409a = c9108dO1;
        this.f14410b = range;
        this.f14411c = range2;
        this.f14412d = i;
    }

    /* renamed from: a */
    public static C10919rY0 m9333a() {
        C10919rY0 c10919rY0 = new C10919rY0(3, false);
        C9108dO1 c9108dO1 = f14408g;
        if (c9108dO1 == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        c10919rY0.f41728b = c9108dO1;
        Range range = f14406e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        c10919rY0.f41729c = range;
        Range range2 = f14407f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        c10919rY0.f41730d = range2;
        c10919rY0.f41731e = -1;
        return c10919rY0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1551Ye)) {
            return false;
        }
        C1551Ye c1551Ye = (C1551Ye) obj;
        return this.f14409a.equals(c1551Ye.f14409a) && this.f14410b.equals(c1551Ye.f14410b) && this.f14411c.equals(c1551Ye.f14411c) && this.f14412d == c1551Ye.f14412d;
    }

    public final int hashCode() {
        return ((((((this.f14409a.hashCode() ^ 1000003) * 1000003) ^ this.f14410b.hashCode()) * 1000003) ^ this.f14411c.hashCode()) * 1000003) ^ this.f14412d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.f14409a);
        sb.append(", frameRate=");
        sb.append(this.f14410b);
        sb.append(", bitrate=");
        sb.append(this.f14411c);
        sb.append(", aspectRatio=");
        return AbstractC1374Vq.m8591j(sb, this.f14412d, "}");
    }
}
