package defpackage;

/* renamed from: yF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8138yF1 {
    public final DD1 a;
    public final int b;

    public C8138yF1(DD1 dd1, int i) {
        this.a = dd1;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8138yF1)) {
            return false;
        }
        C8138yF1 c8138yF1 = (C8138yF1) obj;
        return this.a == c8138yF1.a && this.b == c8138yF1.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
