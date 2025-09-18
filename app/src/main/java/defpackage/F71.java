package defpackage;

import java.io.Serializable;
import kotlin.Lazy;

/* loaded from: classes2.dex */
public final class F71 implements Lazy, Serializable {
    public InterfaceC5908mZ a;
    public volatile Object b;
    public final Object c;

    public F71(InterfaceC5908mZ interfaceC5908mZ) {
        O90.f(interfaceC5908mZ, "initializer");
        this.a = interfaceC5908mZ;
        this.b = C7304tt.g;
        this.c = this;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        C7304tt c7304tt = C7304tt.g;
        if (obj != c7304tt) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == c7304tt) {
                InterfaceC5908mZ interfaceC5908mZ = this.a;
                O90.c(interfaceC5908mZ);
                objInvoke = interfaceC5908mZ.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != C7304tt.g ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
