package defpackage;

import java.util.Map;

/* renamed from: Ra0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1346Ra0 implements InterfaceC7916x5, InterfaceC6413pC0 {
    public static final /* synthetic */ InterfaceC5927mf0[] e;
    public final KX a;
    public final W21 b;
    public final C1688Vk0 c;
    public final InterfaceC1268Qa0 d;

    static {
        IP0 ip0 = BP0.a;
        e = new InterfaceC5927mf0[]{ip0.f(new GE0(ip0.b(C1346Ra0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public C1346Ra0(C6045nH c6045nH, WO0 wo0, KX kx) {
        O90.f(c6045nH, "c");
        O90.f(kx, "fqName");
        this.a = kx;
        C4375ib0 c4375ib0 = (C4375ib0) c6045nH.b;
        this.b = wo0 != null ? ((C6518pl0) c4375ib0.j).n(wo0) : W21.O0;
        C1922Yk0 c1922Yk0 = (C1922Yk0) c4375ib0.a;
        C7726w5 c7726w5 = new C7726w5(c6045nH, 7, this);
        c1922Yk0.getClass();
        this.c = new C1688Vk0(c1922Yk0, c7726w5);
        this.d = wo0 != null ? (InterfaceC1268Qa0) AbstractC8069xu.B(wo0.b()) : null;
    }

    @Override // defpackage.InterfaceC7916x5
    public final W21 e() {
        return this.b;
    }

    @Override // defpackage.InterfaceC7916x5
    public final KX f() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7916x5
    public Map g() {
        return NN.a;
    }

    @Override // defpackage.InterfaceC7916x5
    public final AbstractC0663Ig0 getType() {
        return (X01) WS1.b(this.c, e[0]);
    }
}
