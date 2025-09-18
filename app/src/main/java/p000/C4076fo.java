package p000;

import android.util.Size;
import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: fo */
/* loaded from: classes2.dex */
public final class C4076fo {

    /* renamed from: a */
    public final int f27387a;

    /* renamed from: b */
    public final int f27388b;

    /* renamed from: c */
    public final int f27389c;

    /* renamed from: d */
    public final int f27390d;

    /* renamed from: e */
    public final double f27391e;

    /* renamed from: f */
    public final double f27392f;

    /* renamed from: g */
    public final double f27393g;

    /* renamed from: h */
    public final double f27394h;

    /* renamed from: i */
    public final double f27395i;

    /* renamed from: j */
    public final ArrayList f27396j;

    /* renamed from: k */
    public final EnumC0919Ob f27397k;

    /* renamed from: l */
    public final boolean f27398l;

    /* renamed from: m */
    public final boolean f27399m;

    /* renamed from: n */
    public final boolean f27400n;

    /* renamed from: o */
    public final Object f27401o = AbstractC11077sn0.m24780h(new Pair(C6630pe.f40248d, 345600), new Pair(C6630pe.f40249e, 921600), new Pair(C6630pe.f40250f, 2073600), new Pair(C6630pe.f40251g, 8294400));

    public C4076fo(int i, int i2, int i3, int i4, double d, double d2, double d3, double d4, double d5, ArrayList arrayList, EnumC0919Ob enumC0919Ob, boolean z, boolean z2, boolean z3) {
        this.f27387a = i;
        this.f27388b = i2;
        this.f27389c = i3;
        this.f27390d = i4;
        this.f27391e = d;
        this.f27392f = d2;
        this.f27393g = d3;
        this.f27394h = d4;
        this.f27395i = d5;
        this.f27396j = arrayList;
        this.f27397k = enumC0919Ob;
        this.f27398l = z;
        this.f27399m = z2;
        this.f27400n = z3;
    }

    /* renamed from: a */
    public final Size m18296a() {
        return new Size(this.f27387a, this.f27388b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4076fo)) {
            return false;
        }
        C4076fo c4076fo = (C4076fo) obj;
        return this.f27387a == c4076fo.f27387a && this.f27388b == c4076fo.f27388b && this.f27389c == c4076fo.f27389c && this.f27390d == c4076fo.f27390d && Double.compare(this.f27391e, c4076fo.f27391e) == 0 && Double.compare(this.f27392f, c4076fo.f27392f) == 0 && Double.compare(this.f27393g, c4076fo.f27393g) == 0 && Double.compare(this.f27394h, c4076fo.f27394h) == 0 && Double.compare(this.f27395i, c4076fo.f27395i) == 0 && this.f27396j.equals(c4076fo.f27396j) && this.f27397k == c4076fo.f27397k && this.f27398l == c4076fo.f27398l && this.f27399m == c4076fo.f27399m && this.f27400n == c4076fo.f27400n;
    }

    public final int hashCode() {
        int i = ((((((this.f27387a * 31) + this.f27388b) * 31) + this.f27389c) * 31) + this.f27390d) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.f27391e);
        int i2 = (i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f27392f);
        int i3 = (i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f27393g);
        int i4 = (i3 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f27394h);
        int i5 = (i4 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f27395i);
        return ((((((this.f27397k.hashCode() + ((this.f27396j.hashCode() + ((i5 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31)) * 31)) * 31) + (this.f27398l ? 1231 : 1237)) * 31) + (this.f27399m ? 1231 : 1237)) * 31) + (this.f27400n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraDeviceFormat(videoWidth=");
        sb.append(this.f27387a);
        sb.append(", videoHeight=");
        sb.append(this.f27388b);
        sb.append(", photoWidth=");
        sb.append(this.f27389c);
        sb.append(", photoHeight=");
        sb.append(this.f27390d);
        sb.append(", minFps=");
        sb.append(this.f27391e);
        sb.append(", maxFps=");
        sb.append(this.f27392f);
        sb.append(", minISO=");
        sb.append(this.f27393g);
        sb.append(", maxISO=");
        sb.append(this.f27394h);
        sb.append(", fieldOfView=");
        sb.append(this.f27395i);
        sb.append(", videoStabilizationModes=");
        sb.append(this.f27396j);
        sb.append(", autoFocusSystem=");
        sb.append(this.f27397k);
        sb.append(", supportsVideoHdr=");
        sb.append(this.f27398l);
        sb.append(", supportsPhotoHdr=");
        sb.append(this.f27399m);
        sb.append(", supportsDepthCapture=");
        return AbstractC7222ym.m26236m(sb, this.f27400n, ")");
    }
}
