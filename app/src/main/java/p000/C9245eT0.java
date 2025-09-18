package p000;

import java.io.Serializable;

/* renamed from: eT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9245eT0 extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public final AbstractC7986My0 f26722a;

    public C9245eT0(AbstractC7986My0 abstractC7986My0) {
        this.f26722a = abstractC7986My0;
    }

    @Override // p000.AbstractC7986My0
    /* renamed from: a */
    public final AbstractC7986My0 mo371a() {
        return this.f26722a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f26722a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9245eT0) {
            return this.f26722a.equals(((C9245eT0) obj).f26722a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f26722a.hashCode();
    }

    public final String toString() {
        return this.f26722a + ".reverse()";
    }
}
