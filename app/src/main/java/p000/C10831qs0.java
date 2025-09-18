package p000;

import java.util.ArrayDeque;

/* renamed from: qs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10831qs0 {

    /* renamed from: b */
    public static final ArrayDeque f41219b;

    /* renamed from: a */
    public Object f41220a;

    static {
        char[] cArr = AbstractC7381Bh1.f976a;
        f41219b = new ArrayDeque(0);
    }

    /* renamed from: a */
    public static C10831qs0 m24078a(Object obj) {
        C10831qs0 c10831qs0;
        ArrayDeque arrayDeque = f41219b;
        synchronized (arrayDeque) {
            c10831qs0 = (C10831qs0) arrayDeque.poll();
        }
        if (c10831qs0 == null) {
            c10831qs0 = new C10831qs0();
        }
        c10831qs0.f41220a = obj;
        return c10831qs0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10831qs0)) {
            return false;
        }
        C10831qs0 c10831qs0 = (C10831qs0) obj;
        c10831qs0.getClass();
        return this.f41220a.equals(c10831qs0.f41220a);
    }

    public final int hashCode() {
        return this.f41220a.hashCode();
    }
}
