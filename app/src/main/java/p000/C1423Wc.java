package p000;

/* renamed from: Wc */
/* loaded from: classes.dex */
public final class C1423Wc extends AbstractC0074BA {

    /* renamed from: a */
    public final int f13278a;

    /* renamed from: b */
    public final String f13279b;

    /* renamed from: c */
    public final int f13280c;

    /* renamed from: d */
    public final long f13281d;

    /* renamed from: e */
    public final long f13282e;

    /* renamed from: f */
    public final boolean f13283f;

    /* renamed from: g */
    public final int f13284g;

    /* renamed from: h */
    public final String f13285h;

    /* renamed from: i */
    public final String f13286i;

    public C1423Wc(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f13278a = i;
        this.f13279b = str;
        this.f13280c = i2;
        this.f13281d = j;
        this.f13282e = j2;
        this.f13283f = z;
        this.f13284g = i3;
        this.f13285h = str2;
        this.f13286i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0074BA)) {
            return false;
        }
        AbstractC0074BA abstractC0074BA = (AbstractC0074BA) obj;
        if (this.f13278a == ((C1423Wc) abstractC0074BA).f13278a) {
            C1423Wc c1423Wc = (C1423Wc) abstractC0074BA;
            if (this.f13279b.equals(c1423Wc.f13279b) && this.f13280c == c1423Wc.f13280c && this.f13281d == c1423Wc.f13281d && this.f13282e == c1423Wc.f13282e && this.f13283f == c1423Wc.f13283f && this.f13284g == c1423Wc.f13284g && this.f13285h.equals(c1423Wc.f13285h) && this.f13286i.equals(c1423Wc.f13286i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13278a ^ 1000003) * 1000003) ^ this.f13279b.hashCode()) * 1000003) ^ this.f13280c) * 1000003;
        long j = this.f13281d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f13282e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f13283f ? 1231 : 1237)) * 1000003) ^ this.f13284g) * 1000003) ^ this.f13285h.hashCode()) * 1000003) ^ this.f13286i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f13278a);
        sb.append(", model=");
        sb.append(this.f13279b);
        sb.append(", cores=");
        sb.append(this.f13280c);
        sb.append(", ram=");
        sb.append(this.f13281d);
        sb.append(", diskSpace=");
        sb.append(this.f13282e);
        sb.append(", simulator=");
        sb.append(this.f13283f);
        sb.append(", state=");
        sb.append(this.f13284g);
        sb.append(", manufacturer=");
        sb.append(this.f13285h);
        sb.append(", modelClass=");
        return AbstractC1374Vq.m8593l(sb, this.f13286i, "}");
    }
}
