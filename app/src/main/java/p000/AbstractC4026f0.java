package p000;

import sun.misc.Unsafe;

/* renamed from: f0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4026f0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m18144a(Unsafe unsafe, AbstractC6336l0 abstractC6336l0, long j, C1384W c1384w, C1384W c1384w2) {
        while (!unsafe.compareAndSwapObject(abstractC6336l0, j, c1384w, c1384w2)) {
            if (unsafe.getObject(abstractC6336l0, j) != c1384w) {
                return false;
            }
        }
        return true;
    }
}
