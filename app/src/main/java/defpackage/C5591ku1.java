package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: ku1 */
/* loaded from: classes2.dex */
public final class C5591ku1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ C0781Jt1 c;
    public final /* synthetic */ K81 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5591ku1(C0781Jt1 c0781Jt1, K81 k81, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.c = c0781Jt1;
        this.d = k81;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C5591ku1(this.c, this.d, interfaceC1729Vy, 0);
            default:
                return new C5591ku1(this.c, this.d, interfaceC1729Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C5591ku1(this.c, this.d, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            default:
                return new C5591ku1(this.c, this.d, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                if (i == 0) {
                    RQ1.d(obj);
                    C0070Aq1 c0070Aq1 = (C0070Aq1) this.c.n.getValue();
                    this.b = 1;
                    if (c0070Aq1.b(this.d, this) == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return C1518Tf1.a;
            default:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                C1518Tf1 c1518Tf1 = C1518Tf1.a;
                if (i2 == 0) {
                    RQ1.d(obj);
                    C0070Aq1 c0070Aq12 = (C0070Aq1) this.c.n.getValue();
                    this.b = 1;
                    obj = c0070Aq12.a(this);
                    if (obj == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RQ1.d(obj);
                        return c1518Tf1;
                    }
                    RQ1.d(obj);
                }
                String str = (String) obj;
                if (AbstractC7538v51.C(str)) {
                    K81 k81 = this.d;
                    this.b = 2;
                    C0781Jt1 c0781Jt1 = C0781Jt1.v;
                    if (c0781Jt1 == null) {
                        throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                    }
                    Object objG = ((C0070Aq1) c0781Jt1.n.getValue()).g(k81, this);
                    if (objG != enumC1030Mz2) {
                        objG = c1518Tf1;
                    }
                    if (objG == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    this.d.b(str);
                }
                return c1518Tf1;
        }
    }
}
