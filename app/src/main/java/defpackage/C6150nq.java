package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: nq */
/* loaded from: classes2.dex */
public final class C6150nq implements InterfaceC5959mq {
    public final AbstractC6689qe1 a;
    public C6548pv0 b;

    public C6150nq(AbstractC6689qe1 abstractC6689qe1) {
        O90.f(abstractC6689qe1, "projection");
        this.a = abstractC6689qe1;
        abstractC6689qe1.a();
        EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final /* bridge */ /* synthetic */ InterfaceC1087Ns a() {
        return null;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final Collection b() {
        AbstractC6689qe1 abstractC6689qe1 = this.a;
        AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.a() == EnumC4015gi1.e ? abstractC6689qe1.b() : h().o();
        O90.c(abstractC0663Ig0B);
        return AbstractC8259yu.e(abstractC0663Ig0B);
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.InterfaceC5959mq
    public final AbstractC6689qe1 d() {
        return this.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final List getParameters() {
        return MN.a;
    }

    @Override // defpackage.InterfaceC1200Pd1
    public final AbstractC8408zg0 h() {
        AbstractC8408zg0 abstractC8408zg0H = this.a.b().E().h();
        O90.e(abstractC8408zg0H, "getBuiltIns(...)");
        return abstractC8408zg0H;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.a + ')';
    }
}
