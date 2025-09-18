package p000;

import java.io.Serializable;

/* renamed from: Au0 */
/* loaded from: classes.dex */
public final class C7354Au0 extends AbstractC7986My0 implements Serializable {

    /* renamed from: a */
    public static final C7354Au0 f461a = new C7354Au0();

    @Override // p000.AbstractC7986My0
    /* renamed from: a */
    public final AbstractC7986My0 mo371a() {
        return C9117dT0.f26118a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
