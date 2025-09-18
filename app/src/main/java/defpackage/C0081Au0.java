package defpackage;

import java.io.Serializable;

/* renamed from: Au0 */
/* loaded from: classes.dex */
public final class C0081Au0 extends AbstractC1028My0 implements Serializable {
    public static final C0081Au0 a = new C0081Au0();

    @Override // defpackage.AbstractC1028My0
    public final AbstractC1028My0 a() {
        return C3397dT0.a;
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
