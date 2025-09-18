package p000;

/* renamed from: i32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9706i32 {

    /* renamed from: a */
    public final String f28799a;

    /* renamed from: b */
    public final boolean f28800b;

    /* renamed from: c */
    public final int f28801c;

    public C9706i32(int i, String str, boolean z) {
        this.f28799a = str;
        this.f28800b = z;
        this.f28801c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9706i32) {
            C9706i32 c9706i32 = (C9706i32) obj;
            if (this.f28799a.equals(c9706i32.f28799a) && this.f28800b == c9706i32.f28800b && this.f28801c == c9706i32.f28801c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f28799a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f28800b ? 1237 : 1231)) * 1000003) ^ this.f28801c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.f28799a);
        sb.append(", enableFirelog=");
        sb.append(this.f28800b);
        sb.append(", firelogEventType=");
        return AbstractC1374Vq.m8591j(sb, this.f28801c, "}");
    }
}
