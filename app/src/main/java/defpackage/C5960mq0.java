package defpackage;

/* renamed from: mq0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5960mq0 {
    public final String a;

    public C5960mq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5960mq0) && O90.a(this.a, ((C5960mq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
