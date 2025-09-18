package p000;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* renamed from: ce */
/* loaded from: classes.dex */
public final class C1860ce {

    /* renamed from: a */
    public final UUID f17666a;

    /* renamed from: b */
    public final int f17667b;

    /* renamed from: c */
    public final int f17668c;

    /* renamed from: d */
    public final Rect f17669d;

    /* renamed from: e */
    public final Size f17670e;

    /* renamed from: f */
    public final int f17671f;

    /* renamed from: g */
    public final boolean f17672g;

    public C1860ce(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f17666a = uuid;
        this.f17667b = i;
        this.f17668c = i2;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f17669d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f17670e = size;
        this.f17671f = i3;
        this.f17672g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1860ce)) {
            return false;
        }
        C1860ce c1860ce = (C1860ce) obj;
        return this.f17666a.equals(c1860ce.f17666a) && this.f17667b == c1860ce.f17667b && this.f17668c == c1860ce.f17668c && this.f17669d.equals(c1860ce.f17669d) && this.f17670e.equals(c1860ce.f17670e) && this.f17671f == c1860ce.f17671f && this.f17672g == c1860ce.f17672g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f17666a.hashCode() ^ 1000003) * 1000003) ^ this.f17667b) * 1000003) ^ this.f17668c) * 1000003) ^ this.f17669d.hashCode()) * 1000003) ^ this.f17670e.hashCode()) * 1000003) ^ this.f17671f) * 1000003) ^ (this.f17672g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.f17666a);
        sb.append(", getTargets=");
        sb.append(this.f17667b);
        sb.append(", getFormat=");
        sb.append(this.f17668c);
        sb.append(", getCropRect=");
        sb.append(this.f17669d);
        sb.append(", getSize=");
        sb.append(this.f17670e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f17671f);
        sb.append(", isMirroring=");
        return AbstractC7222ym.m26236m(sb, this.f17672g, ", shouldRespectInputCropRect=false}");
    }
}
