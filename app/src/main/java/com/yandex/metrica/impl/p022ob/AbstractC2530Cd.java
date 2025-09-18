package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Cd */
/* loaded from: classes2.dex */
public abstract class AbstractC2530Cd<T> implements InterfaceC3596sc<T> {

    /* renamed from: a */
    private final C2893R2 f20981a;

    /* renamed from: b */
    private final InterfaceC2829Oc f20982b;

    public AbstractC2530Cd(InterfaceC2829Oc interfaceC2829Oc, C2893R2 c2893r2) {
        this.f20982b = interfaceC2829Oc;
        this.f20981a = c2893r2;
    }

    /* renamed from: a */
    public abstract String mo13966a();

    /* renamed from: a */
    public boolean m13967a(long j) {
        return this.f20981a.m14970b(this.f20982b.mo14531a(), j, "last " + mo13966a() + " scan attempt");
    }
}
