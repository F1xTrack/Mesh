package defpackage;

import java.util.ArrayDeque;

/* renamed from: qs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6730qs0 {
    public static final ArrayDeque b;
    public Object a;

    static {
        char[] cArr = AbstractC0121Bh1.a;
        b = new ArrayDeque(0);
    }

    public static C6730qs0 a(Object obj) {
        C6730qs0 c6730qs0;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            c6730qs0 = (C6730qs0) arrayDeque.poll();
        }
        if (c6730qs0 == null) {
            c6730qs0 = new C6730qs0();
        }
        c6730qs0.a = obj;
        return c6730qs0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6730qs0)) {
            return false;
        }
        C6730qs0 c6730qs0 = (C6730qs0) obj;
        c6730qs0.getClass();
        return this.a.equals(c6730qs0.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
