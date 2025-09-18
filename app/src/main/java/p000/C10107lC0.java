package p000;

import androidx.core.util.Pools$SimplePool;

/* renamed from: lC0 */
/* loaded from: classes.dex */
public final class C10107lC0 extends Pools$SimplePool {

    /* renamed from: c */
    public final Object f36958c;

    public C10107lC0(int i) {
        super(i);
        this.f36958c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, p000.InterfaceC9979kC0
    /* renamed from: d */
    public final boolean mo4580d(Object obj) {
        boolean zMo4580d;
        O90.m5968f(obj, "instance");
        synchronized (this.f36958c) {
            zMo4580d = super.mo4580d(obj);
        }
        return zMo4580d;
    }

    @Override // androidx.core.util.Pools$SimplePool, p000.InterfaceC9979kC0
    /* renamed from: i */
    public final Object mo4581i() {
        Object objMo4581i;
        synchronized (this.f36958c) {
            objMo4581i = super.mo4581i();
        }
        return objMo4581i;
    }
}
