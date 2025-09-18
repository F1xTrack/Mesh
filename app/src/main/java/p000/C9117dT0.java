package p000;

import java.io.Serializable;

/* renamed from: dT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9117dT0 extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public static final C9117dT0 f26118a = new C9117dT0();

    @Override // p000.AbstractC7986My0
    /* renamed from: a */
    public final AbstractC7986My0 mo371a() {
        return C7354Au0.f461a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
