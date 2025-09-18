package p000;

/* renamed from: sd */
/* loaded from: classes.dex */
public final class C6835sd extends AbstractC1080RA {

    /* renamed from: a */
    public final String f42516a;

    public C6835sd(String str) {
        this.f42516a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1080RA)) {
            return false;
        }
        return this.f42516a.equals(((C6835sd) ((AbstractC1080RA) obj)).f42516a);
    }

    public final int hashCode() {
        return this.f42516a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1374Vq.m8593l(new StringBuilder("User{identifier="), this.f42516a, "}");
    }
}
