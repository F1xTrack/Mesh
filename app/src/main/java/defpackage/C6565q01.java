package defpackage;

/* renamed from: q01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6565q01 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6565q01) {
            return this.a == ((C6565q01) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return AbstractC1705Vq.j(new StringBuilder("SharedObjectId(value="), this.a, ")");
    }
}
