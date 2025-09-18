package p000;

import sun.misc.Unsafe;

/* renamed from: e0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3963e0 {
    /* renamed from: a */
    public static /* synthetic */ boolean m17811a(Unsafe unsafe, AbstractC6336l0 abstractC6336l0, long j, C6210j0 c6210j0, C6210j0 c6210j02) {
        while (!unsafe.compareAndSwapObject(abstractC6336l0, j, c6210j0, c6210j02)) {
            if (unsafe.getObject(abstractC6336l0, j) != c6210j0) {
                return false;
            }
        }
        return true;
    }
}
