package defpackage;

import android.util.Range;
import java.util.Arrays;

/* renamed from: Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1903Ye {
    public static final Range e = new Range(0, Integer.MAX_VALUE);
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final C3383dO1 g;
    public final C3383dO1 a;
    public final Range b;
    public final Range c;
    public final int d;

    static {
        C6496pe c6496pe = C6496pe.f;
        g = C3383dO1.w(Arrays.asList(c6496pe, C6496pe.e, C6496pe.d), new C0575Hd(c6496pe, 1));
    }

    public C1903Ye(C3383dO1 c3383dO1, Range range, Range range2, int i) {
        this.a = c3383dO1;
        this.b = range;
        this.c = range2;
        this.d = i;
    }

    public static C6860rY0 a() {
        C6860rY0 c6860rY0 = new C6860rY0(3, false);
        C3383dO1 c3383dO1 = g;
        if (c3383dO1 == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        c6860rY0.b = c3383dO1;
        Range range = e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        c6860rY0.c = range;
        Range range2 = f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        c6860rY0.d = range2;
        c6860rY0.e = -1;
        return c6860rY0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1903Ye)) {
            return false;
        }
        C1903Ye c1903Ye = (C1903Ye) obj;
        return this.a.equals(c1903Ye.a) && this.b.equals(c1903Ye.b) && this.c.equals(c1903Ye.c) && this.d == c1903Ye.d;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", frameRate=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", aspectRatio=");
        return AbstractC1705Vq.j(sb, this.d, "}");
    }
}
