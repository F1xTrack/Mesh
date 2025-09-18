package defpackage;

/* renamed from: i32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4274i32 {
    public final String a;
    public final boolean b;
    public final int c;

    public C4274i32(int i, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4274i32) {
            C4274i32 c4274i32 = (C4274i32) obj;
            if (this.a.equals(c4274i32.a) && this.b == c4274i32.b && this.c == c4274i32.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.a);
        sb.append(", enableFirelog=");
        sb.append(this.b);
        sb.append(", firelogEventType=");
        return AbstractC1705Vq.j(sb, this.c, "}");
    }
}
