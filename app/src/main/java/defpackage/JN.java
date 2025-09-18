package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class JN implements InterfaceC0173Bz, Serializable {
    public static final JN a = new JN();

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        return this;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz f(InterfaceC0173Bz interfaceC0173Bz) {
        O90.f(interfaceC0173Bz, "context");
        return interfaceC0173Bz;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        O90.f(interfaceC0095Az, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.InterfaceC0173Bz
    public final Object j(Object obj, Function2 function2) {
        return obj;
    }
}
