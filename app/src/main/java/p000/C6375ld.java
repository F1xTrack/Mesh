package p000;

/* renamed from: ld */
/* loaded from: classes.dex */
public final class C6375ld extends AbstractC0704LA {

    /* renamed from: a */
    public final String f37192a;

    public C6375ld(String str) {
        this.f37192a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0704LA)) {
            return false;
        }
        return this.f37192a.equals(((C6375ld) ((AbstractC0704LA) obj)).f37192a);
    }

    public final int hashCode() {
        return this.f37192a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("Log{content="), this.f37192a, "}");
    }
}
