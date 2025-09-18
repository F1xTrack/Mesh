package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class YU0 implements Lazy, Serializable {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f14315c = AtomicReferenceFieldUpdater.newUpdater(YU0.class, Object.class, "b");

    /* renamed from: a */
    public volatile InterfaceC6434mZ f14316a;

    /* renamed from: b */
    public volatile Object f14317b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.f14317b;
        C6914tt c6914tt = C6914tt.f43396g;
        if (obj != c6914tt) {
            return obj;
        }
        InterfaceC6434mZ interfaceC6434mZ = this.f14316a;
        if (interfaceC6434mZ != null) {
            Object objInvoke = interfaceC6434mZ.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14315c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c6914tt, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c6914tt) {
                }
            }
            this.f14316a = null;
            return objInvoke;
        }
        return this.f14317b;
    }

    public final String toString() {
        return this.f14317b != C6914tt.f43396g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
