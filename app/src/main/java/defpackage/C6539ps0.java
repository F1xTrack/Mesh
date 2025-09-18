package defpackage;

import java.util.ArrayDeque;

/* renamed from: ps0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6539ps0 extends C8425zm {
    @Override // defpackage.C8425zm
    public final void e(Object obj, Object obj2) {
        C6730qs0 c6730qs0 = (C6730qs0) obj;
        c6730qs0.getClass();
        ArrayDeque arrayDeque = C6730qs0.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c6730qs0);
        }
    }
}
