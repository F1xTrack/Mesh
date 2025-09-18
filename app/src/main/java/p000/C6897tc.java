package p000;

import android.util.Range;

/* renamed from: tc */
/* loaded from: classes.dex */
public final class C6897tc {

    /* renamed from: f */
    public static final Range f43165f = new Range(0, Integer.MAX_VALUE);

    /* renamed from: g */
    public static final Range f43166g = new Range(0, Integer.MAX_VALUE);

    /* renamed from: a */
    public final Range f43167a;

    /* renamed from: b */
    public final int f43168b;

    /* renamed from: c */
    public final int f43169c;

    /* renamed from: d */
    public final Range f43170d;

    /* renamed from: e */
    public final int f43171e;

    static {
        C6479nH c6479nHM24946a = m24946a();
        c6479nHM24946a.f38231e = 0;
        c6479nHM24946a.m23115a();
    }

    public C6897tc(Range range, int i, int i2, Range range2, int i3) {
        this.f43167a = range;
        this.f43168b = i;
        this.f43169c = i2;
        this.f43170d = range2;
        this.f43171e = i3;
    }

    /* renamed from: a */
    public static C6479nH m24946a() {
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38228b = -1;
        c6479nH.f38229c = -1;
        c6479nH.f38231e = -1;
        Range range = f43165f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        c6479nH.f38227a = range;
        Range range2 = f43166g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        c6479nH.f38230d = range2;
        return c6479nH;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6897tc)) {
            return false;
        }
        C6897tc c6897tc = (C6897tc) obj;
        return this.f43167a.equals(c6897tc.f43167a) && this.f43168b == c6897tc.f43168b && this.f43169c == c6897tc.f43169c && this.f43170d.equals(c6897tc.f43170d) && this.f43171e == c6897tc.f43171e;
    }

    public final int hashCode() {
        return ((((((((this.f43167a.hashCode() ^ 1000003) * 1000003) ^ this.f43168b) * 1000003) ^ this.f43169c) * 1000003) ^ this.f43170d.hashCode()) * 1000003) ^ this.f43171e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.f43167a);
        sb.append(", sourceFormat=");
        sb.append(this.f43168b);
        sb.append(", source=");
        sb.append(this.f43169c);
        sb.append(", sampleRate=");
        sb.append(this.f43170d);
        sb.append(", channelCount=");
        return AbstractC1374Vq.m8591j(sb, this.f43171e, "}");
    }
}
