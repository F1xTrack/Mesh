package defpackage;

/* loaded from: classes2.dex */
public final class BR {
    public final K0 a;
    public final int b;

    public BR(int i, K0 k0) {
        this.a = k0;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BR)) {
            return false;
        }
        BR br = (BR) obj;
        return this.a == br.a && this.b == br.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
