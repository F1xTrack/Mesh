package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Qf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1284Qf1 implements InterfaceC8464zz, InterfaceC0095Az {
    public static final C1284Qf1 a = new C1284Qf1();

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz c(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.b(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC0173Bz f(InterfaceC0173Bz interfaceC0173Bz) {
        return AbstractC7803wU1.c(this, interfaceC0173Bz);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final InterfaceC8464zz g(InterfaceC0095Az interfaceC0095Az) {
        return AbstractC7803wU1.a(this, interfaceC0095Az);
    }

    @Override // defpackage.InterfaceC0173Bz
    public final Object j(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC8464zz
    public final InterfaceC0095Az getKey() {
        return this;
    }
}
