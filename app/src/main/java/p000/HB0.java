package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class HB0 {

    /* renamed from: a */
    public final Object f4153a;

    /* renamed from: b */
    public final int f4154b;

    /* renamed from: c */
    public final C10825qp0 f4155c;

    /* renamed from: d */
    public final Object f4156d;

    /* renamed from: e */
    public final int f4157e;

    /* renamed from: f */
    public final long f4158f;

    /* renamed from: g */
    public final long f4159g;

    /* renamed from: h */
    public final int f4160h;

    /* renamed from: i */
    public final int f4161i;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
        AbstractC7485Dh1.m1797L(6);
    }

    public HB0(Object obj, int i, C10825qp0 c10825qp0, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f4153a = obj;
        this.f4154b = i;
        this.f4155c = c10825qp0;
        this.f4156d = obj2;
        this.f4157e = i2;
        this.f4158f = j;
        this.f4159g = j2;
        this.f4160h = i3;
        this.f4161i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HB0.class != obj.getClass()) {
            return false;
        }
        HB0 hb0 = (HB0) obj;
        return this.f4154b == hb0.f4154b && this.f4157e == hb0.f4157e && this.f4158f == hb0.f4158f && this.f4159g == hb0.f4159g && this.f4160h == hb0.f4160h && this.f4161i == hb0.f4161i && AbstractC9984kE1.m22173a(this.f4155c, hb0.f4155c) && AbstractC9984kE1.m22173a(this.f4153a, hb0.f4153a) && AbstractC9984kE1.m22173a(this.f4156d, hb0.f4156d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4153a, Integer.valueOf(this.f4154b), this.f4155c, this.f4156d, Integer.valueOf(this.f4157e), Long.valueOf(this.f4158f), Long.valueOf(this.f4159g), Integer.valueOf(this.f4160h), Integer.valueOf(this.f4161i)});
    }
}
