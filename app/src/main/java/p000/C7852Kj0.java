package p000;

/* renamed from: Kj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7852Kj0 extends AbstractC8008Nj0 {

    /* renamed from: a */
    public final C7249zC f6265a = C7249zC.f46721b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7852Kj0.class != obj.getClass()) {
            return false;
        }
        return this.f6265a.equals(((C7852Kj0) obj).f6265a);
    }

    public final int hashCode() {
        return this.f6265a.hashCode() + (C7852Kj0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f6265a + '}';
    }
}
