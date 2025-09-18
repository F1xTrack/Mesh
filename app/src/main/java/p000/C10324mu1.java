package p000;

/* renamed from: mu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10324mu1 extends AbstractC10229m90 {

    /* renamed from: a */
    public final String f37989a;

    public C10324mu1(String str) {
        this.f37989a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10229m90)) {
            return false;
        }
        return this.f37989a.equals(((C10324mu1) ((AbstractC10229m90) obj)).f37989a);
    }

    public final int hashCode() {
        return this.f37989a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("IntegrityTokenResponse{token="), this.f37989a, "}");
    }
}
