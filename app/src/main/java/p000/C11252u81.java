package p000;

/* renamed from: u81, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11252u81 {

    /* renamed from: a */
    public final C9565gz0 f43536a;

    /* renamed from: b */
    public final EnumC1669aW f43537b;

    /* renamed from: c */
    public final boolean f43538c;

    public C11252u81(C9565gz0 c9565gz0, EnumC1669aW enumC1669aW, boolean z) {
        this.f43536a = c9565gz0;
        this.f43537b = enumC1669aW;
        this.f43538c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11252u81)) {
            return false;
        }
        C11252u81 c11252u81 = (C11252u81) obj;
        return O90.m5963a(this.f43536a, c11252u81.f43536a) && this.f43537b == c11252u81.f43537b && this.f43538c == c11252u81.f43538c;
    }

    public final int hashCode() {
        return ((this.f43537b.hashCode() + (this.f43536a.hashCode() * 31)) * 31) + (this.f43538c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePhotoOptions(file=");
        sb.append(this.f43536a);
        sb.append(", flash=");
        sb.append(this.f43537b);
        sb.append(", enableShutterSound=");
        return AbstractC7222ym.m26236m(sb, this.f43538c, ")");
    }
}
