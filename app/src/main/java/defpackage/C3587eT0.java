package defpackage;

import java.io.Serializable;

/* renamed from: eT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3587eT0 extends AbstractC1028My0 implements Serializable {
    public final AbstractC1028My0 a;

    public C3587eT0(AbstractC1028My0 abstractC1028My0) {
        this.a = abstractC1028My0;
    }

    @Override // defpackage.AbstractC1028My0
    public final AbstractC1028My0 a() {
        return this.a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3587eT0) {
            return this.a.equals(((C3587eT0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
