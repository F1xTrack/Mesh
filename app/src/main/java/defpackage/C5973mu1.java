package defpackage;

/* renamed from: mu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5973mu1 extends AbstractC5831m90 {
    public final String a;

    public C5973mu1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5831m90)) {
            return false;
        }
        return this.a.equals(((C5973mu1) ((AbstractC5831m90) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1705Vq.l(new StringBuilder("IntegrityTokenResponse{token="), this.a, "}");
    }
}
