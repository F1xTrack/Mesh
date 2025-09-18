package p000;

import android.util.Range;
import android.util.Size;

/* renamed from: Ge */
/* loaded from: classes.dex */
public final class C0419Ge {

    /* renamed from: f */
    public static final Range f3838f = new Range(0, 0);

    /* renamed from: a */
    public final Size f3839a;

    /* renamed from: b */
    public final C0149CM f3840b;

    /* renamed from: c */
    public final Range f3841c;

    /* renamed from: d */
    public final C3950dn f3842d;

    /* renamed from: e */
    public final boolean f3843e;

    public C0419Ge(Size size, C0149CM c0149cm, Range range, C3950dn c3950dn, boolean z) {
        this.f3839a = size;
        this.f3840b = c0149cm;
        this.f3841c = range;
        this.f3842d = c3950dn;
        this.f3843e = z;
    }

    /* renamed from: a */
    public final C6937uF m3116a() {
        C6937uF c6937uF = new C6937uF();
        c6937uF.f43616a = this.f3839a;
        c6937uF.f43617b = this.f3840b;
        c6937uF.f43618c = this.f3841c;
        c6937uF.f43619d = this.f3842d;
        c6937uF.f43620e = Boolean.valueOf(this.f3843e);
        return c6937uF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0419Ge)) {
            return false;
        }
        C0419Ge c0419Ge = (C0419Ge) obj;
        if (this.f3839a.equals(c0419Ge.f3839a) && this.f3840b.equals(c0419Ge.f3840b) && this.f3841c.equals(c0419Ge.f3841c)) {
            C3950dn c3950dn = c0419Ge.f3842d;
            C3950dn c3950dn2 = this.f3842d;
            if (c3950dn2 != null ? c3950dn2.equals(c3950dn) : c3950dn == null) {
                if (this.f3843e == c0419Ge.f3843e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3839a.hashCode() ^ 1000003) * 1000003) ^ this.f3840b.hashCode()) * 1000003) ^ this.f3841c.hashCode()) * 1000003;
        C3950dn c3950dn = this.f3842d;
        return ((iHashCode ^ (c3950dn == null ? 0 : c3950dn.hashCode())) * 1000003) ^ (this.f3843e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.f3839a);
        sb.append(", dynamicRange=");
        sb.append(this.f3840b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.f3841c);
        sb.append(", implementationOptions=");
        sb.append(this.f3842d);
        sb.append(", zslDisabled=");
        return AbstractC7222ym.m26236m(sb, this.f3843e, "}");
    }
}
