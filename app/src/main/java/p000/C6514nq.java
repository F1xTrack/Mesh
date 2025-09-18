package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: nq */
/* loaded from: classes2.dex */
public final class C6514nq implements InterfaceC6451mq {

    /* renamed from: a */
    public final AbstractC10804qe1 f38552a;

    /* renamed from: b */
    public C10709pv0 f38553b;

    public C6514nq(AbstractC10804qe1 abstractC10804qe1) {
        O90.m5968f(abstractC10804qe1, "projection");
        this.f38552a = abstractC10804qe1;
        abstractC10804qe1.mo24037a();
        EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC0873Ns mo1962a() {
        return null;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: b */
    public final Collection mo5276b() {
        AbstractC10804qe1 abstractC10804qe1 = this.f38552a;
        AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24037a() == EnumC9532gi1.f27949e ? abstractC10804qe1.mo24038b() : mo1964h().m26507o();
        O90.m5965c(abstractC7742Ig0Mo24038b);
        return AbstractC7230yu.m26274e(abstractC7742Ig0Mo24038b);
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: c */
    public final boolean mo3023c() {
        return false;
    }

    @Override // p000.InterfaceC6451mq
    /* renamed from: d */
    public final AbstractC10804qe1 mo22969d() {
        return this.f38552a;
    }

    @Override // p000.InterfaceC8101Pd1
    public final List getParameters() {
        return C0779MN.f7117a;
    }

    @Override // p000.InterfaceC8101Pd1
    /* renamed from: h */
    public final AbstractC11955zg0 mo1964h() {
        AbstractC11955zg0 abstractC11955zg0Mo1964h = this.f38552a.mo24038b().mo3797E().mo1964h();
        O90.m5967e(abstractC11955zg0Mo1964h, "getBuiltIns(...)");
        return abstractC11955zg0Mo1964h;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f38552a + ')';
    }
}
