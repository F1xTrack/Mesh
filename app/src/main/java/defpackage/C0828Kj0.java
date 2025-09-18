package defpackage;

/* renamed from: Kj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828Kj0 extends AbstractC1061Nj0 {
    public final C8317zC a = C8317zC.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0828Kj0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C0828Kj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (C0828Kj0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
