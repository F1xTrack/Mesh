package defpackage;

import androidx.core.util.Pools$SimplePool;

/* renamed from: lC0 */
/* loaded from: classes.dex */
public final class C5649lC0 extends Pools$SimplePool {
    public final Object c;

    public C5649lC0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, defpackage.InterfaceC5458kC0
    public final boolean d(Object obj) {
        boolean zD;
        O90.f(obj, "instance");
        synchronized (this.c) {
            zD = super.d(obj);
        }
        return zD;
    }

    @Override // androidx.core.util.Pools$SimplePool, defpackage.InterfaceC5458kC0
    public final Object i() {
        Object objI;
        synchronized (this.c) {
            objI = super.i();
        }
        return objI;
    }
}
