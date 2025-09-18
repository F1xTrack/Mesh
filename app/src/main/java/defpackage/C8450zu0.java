package defpackage;

import java.util.Comparator;

/* renamed from: zu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8450zu0 implements Comparator {
    public static final C8450zu0 b = new C8450zu0(0);
    public static final C8450zu0 c = new C8450zu0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C8450zu0(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                O90.f(comparable, "a");
                O90.f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                O90.f(comparable3, "a");
                O90.f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }
}
