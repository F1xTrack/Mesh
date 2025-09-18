package defpackage;

import java.io.Serializable;

/* renamed from: dT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3397dT0 extends AbstractC1028My0 implements Serializable {
    public static final C3397dT0 a = new C3397dT0();

    @Override // defpackage.AbstractC1028My0
    public final AbstractC1028My0 a() {
        return C0081Au0.a;
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
