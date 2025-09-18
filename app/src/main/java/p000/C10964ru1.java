package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: ru1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10964ru1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f42149a;

    /* renamed from: b */
    public final /* synthetic */ HS0 f42150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10964ru1(HS0 hs0, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f42149a = i;
        this.f42150b = hs0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f42149a) {
            case 0:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 0);
            case 1:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 1);
            case 2:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 2);
            default:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f42149a) {
            case 0:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            case 1:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
            case 2:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 2).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C10964ru1(this.f42150b, interfaceC1382Vy, 3).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        HS0 hs0 = this.f42150b;
        switch (this.f42149a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                IS0 is0 = hs0.f4301g;
                return is0 != null ? is0.m3878x() : "";
            case 1:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                IS0 is02 = hs0.f4301g;
                return is02 != null ? is02.m3878x() : "";
            case 2:
                EnumC0817Mz enumC0817Mz3 = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                IS0 is03 = hs0.f4301g;
                return is03 != null ? is03.m3878x() : "";
            default:
                EnumC0817Mz enumC0817Mz4 = EnumC0817Mz.f7418a;
                RQ1.m7017d(obj);
                IS0 is04 = hs0.f4301g;
                return is04 != null ? is04.m3878x() : "";
        }
    }
}
