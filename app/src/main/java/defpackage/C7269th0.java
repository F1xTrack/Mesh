package defpackage;

/* renamed from: th0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7269th0 {
    public final String a;

    public C7269th0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7269th0) {
            return this.a.equals(((C7269th0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
