package p000;

/* renamed from: Mj0 */
/* loaded from: classes.dex */
public final class C7956Mj0 extends AbstractC8008Nj0 {

    /* renamed from: a */
    public final C7249zC f7313a;

    public C7956Mj0(C7249zC c7249zC) {
        this.f7313a = c7249zC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7956Mj0.class != obj.getClass()) {
            return false;
        }
        return this.f7313a.equals(((C7956Mj0) obj).f7313a);
    }

    public final int hashCode() {
        return this.f7313a.hashCode() + (C7956Mj0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f7313a + '}';
    }
}
