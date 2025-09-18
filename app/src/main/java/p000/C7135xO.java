package p000;

/* renamed from: xO */
/* loaded from: classes.dex */
public final class C7135xO {

    /* renamed from: a */
    public final String f45570a;

    public C7135xO(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f45570a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7135xO)) {
            return false;
        }
        return this.f45570a.equals(((C7135xO) obj).f45570a);
    }

    public final int hashCode() {
        return this.f45570a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("Encoding{name=\""), this.f45570a, "\"}");
    }
}
