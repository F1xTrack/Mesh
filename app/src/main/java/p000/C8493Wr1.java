package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Wr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8493Wr1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f13422a;

    /* renamed from: b */
    public int f13423b;

    /* renamed from: c */
    public final /* synthetic */ C8071Oo1 f13424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8493Wr1(C8071Oo1 c8071Oo1, InterfaceC1382Vy interfaceC1382Vy, int i) {
        super(2, interfaceC1382Vy);
        this.f13422a = i;
        this.f13424c = c8071Oo1;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f13422a) {
            case 0:
                return new C8493Wr1(this.f13424c, interfaceC1382Vy, 0);
            default:
                return new C8493Wr1(this.f13424c, interfaceC1382Vy, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj2;
        switch (this.f13422a) {
            case 0:
                return new C8493Wr1(this.f13424c, interfaceC1382Vy, 0).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C8493Wr1(this.f13424c, interfaceC1382Vy, 1).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        Object objM4055f;
        switch (this.f13422a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f13423b;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C7765Ir1 c7765Ir1 = (C7765Ir1) this.f13424c.f8628b;
                    this.f13423b = 1;
                    if (c7765Ir1.m4054e(this) == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return C8313Tf1.f11463a;
            default:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f13423b;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C7765Ir1 c7765Ir12 = (C7765Ir1) this.f13424c.f8628b;
                    this.f13423b = 1;
                    objM4055f = c7765Ir12.m4055f(this);
                    if (objM4055f == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                    objM4055f = ((C8491Wq1) obj).f13419a;
                }
                return new C8491Wq1((String) objM4055f);
        }
    }
}
