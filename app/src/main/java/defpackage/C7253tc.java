package defpackage;

import android.util.Range;

/* renamed from: tc */
/* loaded from: classes.dex */
public final class C7253tc {
    public static final Range f = new Range(0, Integer.MAX_VALUE);
    public static final Range g = new Range(0, Integer.MAX_VALUE);
    public final Range a;
    public final int b;
    public final int c;
    public final Range d;
    public final int e;

    static {
        C6045nH c6045nHA = a();
        c6045nHA.e = 0;
        c6045nHA.a();
    }

    public C7253tc(Range range, int i, int i2, Range range2, int i3) {
        this.a = range;
        this.b = i;
        this.c = i2;
        this.d = range2;
        this.e = i3;
    }

    public static C6045nH a() {
        C6045nH c6045nH = new C6045nH();
        c6045nH.b = -1;
        c6045nH.c = -1;
        c6045nH.e = -1;
        Range range = f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        c6045nH.a = range;
        Range range2 = g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        c6045nH.d = range2;
        return c6045nH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7253tc)) {
            return false;
        }
        C7253tc c7253tc = (C7253tc) obj;
        return this.a.equals(c7253tc.a) && this.b == c7253tc.b && this.c == c7253tc.c && this.d.equals(c7253tc.d) && this.e == c7253tc.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.a);
        sb.append(", sourceFormat=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channelCount=");
        return AbstractC1705Vq.j(sb, this.e, "}");
    }
}
