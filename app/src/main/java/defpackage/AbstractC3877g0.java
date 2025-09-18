package defpackage;

import sun.misc.Unsafe;

/* renamed from: g0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3877g0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC5608l0 abstractC5608l0, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC5608l0, j, obj, obj2)) {
            if (unsafe.getObject(abstractC5608l0, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
