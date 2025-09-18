package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class G implements InterfaceC8464zz {
    public final InterfaceC0095Az a;

    public G(InterfaceC0095Az interfaceC0095Az) {
        this.a = interfaceC0095Az;
    }

    @Override // defpackage.InterfaceC0173Bz
    public InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.b(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz f(InterfaceC0173Bz interfaceC0173Bz) {
        return AbstractC7803wU1.c(this, interfaceC0173Bz);
    }

    @Override // defpackage.InterfaceC0173Bz
    public InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.a(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC8464zz
    public final InterfaceC0095Az getKey() {
        return this.a;
    }

    @Override // defpackage.InterfaceC0173Bz
    public final Object j(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
