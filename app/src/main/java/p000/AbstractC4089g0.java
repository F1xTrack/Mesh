package p000;

import sun.misc.Unsafe;

/* renamed from: g0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4089g0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m18374a(Unsafe unsafe, AbstractC6336l0 abstractC6336l0, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC6336l0, j, obj, obj2)) {
            if (unsafe.getObject(abstractC6336l0, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
