package defpackage;

import java.io.Serializable;

/* renamed from: cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3289cv extends AbstractC1028My0 implements Serializable {
    public final C0350Eg a;

    public C3289cv(C0350Eg c0350Eg) {
        this.a = c0350Eg;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3289cv) {
            return this.a.equals(((C3289cv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
