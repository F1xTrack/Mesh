package p000;

import java.util.ArrayDeque;

/* renamed from: ps0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10703ps0 extends C7285zm {
    @Override // p000.C7285zm
    /* renamed from: e */
    public final void mo1873e(Object obj, Object obj2) {
        C10831qs0 c10831qs0 = (C10831qs0) obj;
        c10831qs0.getClass();
        ArrayDeque arrayDeque = C10831qs0.f41219b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c10831qs0);
        }
    }
}
