package defpackage;

import sun.misc.Unsafe;

/* renamed from: e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3495e0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC5608l0 abstractC5608l0, long j, C5226j0 c5226j0, C5226j0 c5226j02) {
        while (!unsafe.compareAndSwapObject(abstractC5608l0, j, c5226j0, c5226j02)) {
            if (unsafe.getObject(abstractC5608l0, j) != c5226j0) {
                return false;
            }
        }
        return true;
    }
}
