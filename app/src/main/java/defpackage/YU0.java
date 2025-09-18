package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class YU0 implements Lazy, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(YU0.class, Object.class, "b");
    public volatile InterfaceC5908mZ a;
    public volatile Object b;

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.b;
        C7304tt c7304tt = C7304tt.g;
        if (obj != c7304tt) {
            return obj;
        }
        InterfaceC5908mZ interfaceC5908mZ = this.a;
        if (interfaceC5908mZ != null) {
            Object objInvoke = interfaceC5908mZ.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7304tt, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c7304tt) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != C7304tt.g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
