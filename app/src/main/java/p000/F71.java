package p000;

import java.io.Serializable;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class F71 implements Lazy, Serializable {

    /* renamed from: a */
    public InterfaceC6434mZ f3072a;

    /* renamed from: b */
    public volatile Object f3073b;

    /* renamed from: c */
    public final Object f3074c;

    public F71(InterfaceC6434mZ interfaceC6434mZ) {
        O90.m5968f(interfaceC6434mZ, "initializer");
        this.f3072a = interfaceC6434mZ;
        this.f3073b = C6914tt.f43396g;
        this.f3074c = this;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f3073b;
        C6914tt c6914tt = C6914tt.f43396g;
        if (obj != c6914tt) {
            return obj;
        }
        synchronized (this.f3074c) {
            objInvoke = this.f3073b;
            if (objInvoke == c6914tt) {
                InterfaceC6434mZ interfaceC6434mZ = this.f3072a;
                O90.m5965c(interfaceC6434mZ);
                objInvoke = interfaceC6434mZ.invoke();
                this.f3073b = objInvoke;
                this.f3072a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f3073b != C6914tt.f43396g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
