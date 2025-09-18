package p000;

/* renamed from: th0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11193th0 {

    /* renamed from: a */
    public final String f43221a;

    public C11193th0(String str) {
        this.f43221a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11193th0) {
            return this.f43221a.equals(((C11193th0) obj).f43221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43221a.hashCode();
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("StringHeaderFactory{value='"), this.f43221a, "'}");
    }
}
