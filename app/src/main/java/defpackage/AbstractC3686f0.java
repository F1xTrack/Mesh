package defpackage;

import sun.misc.Unsafe;

/* renamed from: f0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3686f0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC5608l0 abstractC5608l0, long j, W w, W w2) {
        while (!unsafe.compareAndSwapObject(abstractC5608l0, j, w, w2)) {
            if (unsafe.getObject(abstractC5608l0, j) != w) {
                return false;
            }
        }
        return true;
    }
}
