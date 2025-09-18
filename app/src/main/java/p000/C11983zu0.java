package p000;

import java.util.Comparator;

/* renamed from: zu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11983zu0 implements Comparator {

    /* renamed from: b */
    public static final C11983zu0 f47088b = new C11983zu0(0);

    /* renamed from: c */
    public static final C11983zu0 f47089c = new C11983zu0(1);

    /* renamed from: a */
    public final /* synthetic */ int f47090a;

    public /* synthetic */ C11983zu0(int i) {
        this.f47090a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f47090a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                O90.m5968f(comparable, "a");
                O90.m5968f(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                O90.m5968f(comparable3, "a");
                O90.m5968f(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f47090a) {
            case 0:
                return f47089c;
            default:
                return f47088b;
        }
    }
}
