package defpackage;

/* renamed from: Wq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1785Wq1 {
    public final String a;

    public /* synthetic */ C1785Wq1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1785Wq1) {
            if (O90.a(this.a, ((C1785Wq1) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return F91.v(new StringBuilder("PushToken(value="), this.a, ')');
    }
}
