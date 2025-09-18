package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: G */
/* loaded from: classes2.dex */
public abstract class AbstractC0378G implements InterfaceC7298zz {

    /* renamed from: a */
    public final InterfaceC0062Az f3507a;

    public AbstractC0378G(InterfaceC0062Az interfaceC0062Az) {
        this.f3507a = interfaceC0062Az;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: c */
    public InterfaceC0125Bz mo935c(InterfaceC0062Az interfaceC0062Az) {
        return AbstractC11551wU1.m25638b(this, interfaceC0062Az);
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: f */
    public final InterfaceC0125Bz mo936f(InterfaceC0125Bz interfaceC0125Bz) {
        return AbstractC11551wU1.m25639c(this, interfaceC0125Bz);
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: g */
    public InterfaceC7298zz mo937g(InterfaceC0062Az interfaceC0062Az) {
        return AbstractC11551wU1.m25637a(this, interfaceC0062Az);
    }

    @Override // p000.InterfaceC7298zz
    public final InterfaceC0062Az getKey() {
        return this.f3507a;
    }

    @Override // p000.InterfaceC0125Bz
    /* renamed from: j */
    public final Object mo938j(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
