package p000;

/* renamed from: We */
/* loaded from: classes.dex */
public final class C1425We {

    /* renamed from: d */
    public static final C1425We f13302d = new C1425We(0, 0, 0);

    /* renamed from: e */
    public static final C1425We f13303e = new C1425We(1, 3, 2);

    /* renamed from: f */
    public static final C1425We f13304f = new C1425We(6, 7, 1);

    /* renamed from: g */
    public static final C1425We f13305g = new C1425We(6, 6, 1);

    /* renamed from: a */
    public final int f13306a;

    /* renamed from: b */
    public final int f13307b;

    /* renamed from: c */
    public final int f13308c;

    public C1425We(int i, int i2, int i3) {
        this.f13306a = i;
        this.f13307b = i2;
        this.f13308c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1425We)) {
            return false;
        }
        C1425We c1425We = (C1425We) obj;
        return this.f13306a == c1425We.f13306a && this.f13307b == c1425We.f13307b && this.f13308c == c1425We.f13308c;
    }

    public final int hashCode() {
        return this.f13308c ^ ((((this.f13306a ^ 1000003) * 1000003) ^ this.f13307b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.f13306a);
        sb.append(", transfer=");
        sb.append(this.f13307b);
        sb.append(", range=");
        return AbstractC1374Vq.m8591j(sb, this.f13308c, "}");
    }
}
