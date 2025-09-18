package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: ru1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6927ru1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HS0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6927ru1(HS0 hs0, InterfaceC1729Vy interfaceC1729Vy, int i) {
        super(2, interfaceC1729Vy);
        this.a = i;
        this.b = hs0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C6927ru1(this.b, interfaceC1729Vy, 0);
            case 1:
                return new C6927ru1(this.b, interfaceC1729Vy, 1);
            case 2:
                return new C6927ru1(this.b, interfaceC1729Vy, 2);
            default:
                return new C6927ru1(this.b, interfaceC1729Vy, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj2;
        switch (this.a) {
            case 0:
                return new C6927ru1(this.b, interfaceC1729Vy, 0).invokeSuspend(C1518Tf1.a);
            case 1:
                return new C6927ru1(this.b, interfaceC1729Vy, 1).invokeSuspend(C1518Tf1.a);
            case 2:
                return new C6927ru1(this.b, interfaceC1729Vy, 2).invokeSuspend(C1518Tf1.a);
            default:
                return new C6927ru1(this.b, interfaceC1729Vy, 3).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        HS0 hs0 = this.b;
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                RQ1.d(obj);
                IS0 is0 = hs0.g;
                return is0 != null ? is0.x() : "";
            case 1:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                RQ1.d(obj);
                IS0 is02 = hs0.g;
                return is02 != null ? is02.x() : "";
            case 2:
                EnumC1030Mz enumC1030Mz3 = EnumC1030Mz.a;
                RQ1.d(obj);
                IS0 is03 = hs0.g;
                return is03 != null ? is03.x() : "";
            default:
                EnumC1030Mz enumC1030Mz4 = EnumC1030Mz.a;
                RQ1.d(obj);
                IS0 is04 = hs0.g;
                return is04 != null ? is04.x() : "";
        }
    }
}
