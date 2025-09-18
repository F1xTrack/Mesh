package p000;

import java.io.Serializable;

/* renamed from: cv */
/* loaded from: classes.dex */
public final class C3895cv extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public final C0295Eg f25719a;

    public C3895cv(C0295Eg c0295Eg) {
        this.f25719a = c0295Eg;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25719a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3895cv) {
            return this.f25719a.equals(((C3895cv) obj).f25719a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25719a.hashCode();
    }

    public final String toString() {
        return this.f25719a.toString();
    }
}
