package defpackage;

import android.util.Size;
import java.util.ArrayList;
import kotlin.Pair;

/* renamed from: fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3840fo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final ArrayList j;
    public final EnumC1114Ob k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final Object o = AbstractC7096sn0.h(new Pair(C6496pe.d, 345600), new Pair(C6496pe.e, 921600), new Pair(C6496pe.f, 2073600), new Pair(C6496pe.g, 8294400));

    public C3840fo(int i, int i2, int i3, int i4, double d, double d2, double d3, double d4, double d5, ArrayList arrayList, EnumC1114Ob enumC1114Ob, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = d;
        this.f = d2;
        this.g = d3;
        this.h = d4;
        this.i = d5;
        this.j = arrayList;
        this.k = enumC1114Ob;
        this.l = z;
        this.m = z2;
        this.n = z3;
    }

    public final Size a() {
        return new Size(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3840fo)) {
            return false;
        }
        C3840fo c3840fo = (C3840fo) obj;
        return this.a == c3840fo.a && this.b == c3840fo.b && this.c == c3840fo.c && this.d == c3840fo.d && Double.compare(this.e, c3840fo.e) == 0 && Double.compare(this.f, c3840fo.f) == 0 && Double.compare(this.g, c3840fo.g) == 0 && Double.compare(this.h, c3840fo.h) == 0 && Double.compare(this.i, c3840fo.i) == 0 && this.j.equals(c3840fo.j) && this.k == c3840fo.k && this.l == c3840fo.l && this.m == c3840fo.m && this.n == c3840fo.n;
    }

    public final int hashCode() {
        int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.e);
        int i2 = (i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f);
        int i3 = (i2 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.g);
        int i4 = (i3 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.h);
        int i5 = (i4 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.i);
        return ((((((this.k.hashCode() + ((this.j.hashCode() + ((i5 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31)) * 31)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraDeviceFormat(videoWidth=");
        sb.append(this.a);
        sb.append(", videoHeight=");
        sb.append(this.b);
        sb.append(", photoWidth=");
        sb.append(this.c);
        sb.append(", photoHeight=");
        sb.append(this.d);
        sb.append(", minFps=");
        sb.append(this.e);
        sb.append(", maxFps=");
        sb.append(this.f);
        sb.append(", minISO=");
        sb.append(this.g);
        sb.append(", maxISO=");
        sb.append(this.h);
        sb.append(", fieldOfView=");
        sb.append(this.i);
        sb.append(", videoStabilizationModes=");
        sb.append(this.j);
        sb.append(", autoFocusSystem=");
        sb.append(this.k);
        sb.append(", supportsVideoHdr=");
        sb.append(this.l);
        sb.append(", supportsPhotoHdr=");
        sb.append(this.m);
        sb.append(", supportsDepthCapture=");
        return AbstractC8235ym.m(sb, this.n, ")");
    }
}
