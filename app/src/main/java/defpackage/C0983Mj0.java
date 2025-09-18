package defpackage;

/* renamed from: Mj0 */
/* loaded from: classes.dex */
public final class C0983Mj0 extends AbstractC1061Nj0 {
    public final C8317zC a;

    public C0983Mj0(C8317zC c8317zC) {
        this.a = c8317zC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0983Mj0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C0983Mj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (C0983Mj0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
