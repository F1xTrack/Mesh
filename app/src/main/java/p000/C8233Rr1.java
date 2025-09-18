package p000;

import com.p019vk.push.common.Logger;

/* renamed from: Rr1 */
/* loaded from: classes2.dex */
public final class C8233Rr1 extends AbstractC9714i71 implements InterfaceC6497nZ {

    /* renamed from: a */
    public final /* synthetic */ int f10461a;

    /* renamed from: b */
    public int f10462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8233Rr1(int i, int i2, InterfaceC1382Vy interfaceC1382Vy) {
        super(i, interfaceC1382Vy);
        this.f10461a = i2;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(InterfaceC1382Vy interfaceC1382Vy) {
        switch (this.f10461a) {
            case 0:
                return new C8233Rr1(1, 0, interfaceC1382Vy);
            case 1:
                return new C8233Rr1(1, 1, interfaceC1382Vy);
            case 2:
                return new C8233Rr1(1, 2, interfaceC1382Vy);
            case 3:
                return new C8233Rr1(1, 3, interfaceC1382Vy);
            case 4:
                return new C8233Rr1(1, 4, interfaceC1382Vy);
            case 5:
                return new C8233Rr1(1, 5, interfaceC1382Vy);
            default:
                return new C8233Rr1(1, 6, interfaceC1382Vy);
        }
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        InterfaceC1382Vy interfaceC1382Vy = (InterfaceC1382Vy) obj;
        switch (this.f10461a) {
            case 0:
                return new C8233Rr1(1, 0, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            case 1:
                return new C8233Rr1(1, 1, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            case 2:
                return new C8233Rr1(1, 2, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            case 3:
                return new C8233Rr1(1, 3, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            case 4:
                return new C8233Rr1(1, 4, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            case 5:
                return new C8233Rr1(1, 5, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
            default:
                return new C8233Rr1(1, 6, interfaceC1382Vy).invokeSuspend(C8313Tf1.f11463a);
        }
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f10461a) {
            case 0:
                EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
                int i = this.f10462b;
                if (i == 0) {
                    RQ1.m7017d(obj);
                    C7561Et1 c7561Et1M23021a = AbstractC10328mw1.m23021a();
                    this.f10462b = 1;
                    obj = AbstractC11432vY1.m25446c(new C8085Ov1(c7561Et1M23021a.f2939a.f26939a, false, null), this);
                    if (obj == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return ((C8127Pq1) obj).f9297a;
            case 1:
                EnumC0817Mz enumC0817Mz2 = EnumC0817Mz.f7418a;
                int i2 = this.f10462b;
                if (i2 == 0) {
                    RQ1.m7017d(obj);
                    C7561Et1 c7561Et1M23021a2 = AbstractC10328mw1.m23021a();
                    this.f10462b = 1;
                    obj = AbstractC11432vY1.m25446c(new C8085Ov1(c7561Et1M23021a2.f2939a.f26939a, false, null), this);
                    if (obj == enumC0817Mz2) {
                        return enumC0817Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                C8127Pq1 c8127Pq1 = (C8127Pq1) obj;
                O90.m5968f(c8127Pq1, "<this>");
                return new C8285Sr1(c8127Pq1.f9297a, c8127Pq1.f9298b);
            case 2:
                EnumC0817Mz enumC0817Mz3 = EnumC0817Mz.f7418a;
                int i3 = this.f10462b;
                if (i3 == 0) {
                    RQ1.m7017d(obj);
                    Logger logger = AbstractC10328mw1.f37997a;
                    InterfaceC8439Vq1 interfaceC8439Vq1M9425c = AbstractC8603Yu1.m9425c();
                    O90.m5968f(logger, "logger");
                    C8389Ur1 c8389Ur1 = new C8389Ur1(interfaceC8439Vq1M9425c, logger);
                    this.f10462b = 1;
                    if (c8389Ur1.m8195a(true, this) == enumC0817Mz3) {
                        return enumC0817Mz3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return C8313Tf1.f11463a;
            case 3:
                EnumC0817Mz enumC0817Mz4 = EnumC0817Mz.f7418a;
                int i4 = this.f10462b;
                if (i4 == 0) {
                    RQ1.m7017d(obj);
                    C8181Qr1 c8181Qr1 = (C8181Qr1) AbstractC8603Yu1.f14592e.getValue();
                    this.f10462b = 1;
                    obj = c8181Qr1.m6798e(this);
                    if (obj == enumC0817Mz4) {
                        return enumC0817Mz4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return obj;
            case 4:
                EnumC0817Mz enumC0817Mz5 = EnumC0817Mz.f7418a;
                int i5 = this.f10462b;
                if (i5 == 0) {
                    RQ1.m7017d(obj);
                    C8181Qr1 c8181Qr12 = (C8181Qr1) AbstractC8603Yu1.f14592e.getValue();
                    this.f10462b = 1;
                    if (c8181Qr12.m6795b(this) == enumC0817Mz5) {
                        return enumC0817Mz5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                return C8313Tf1.f11463a;
            case 5:
                EnumC0817Mz enumC0817Mz6 = EnumC0817Mz.f7418a;
                int i6 = this.f10462b;
                if (i6 == 0) {
                    RQ1.m7017d(obj);
                    C7561Et1 c7561Et1M23021a3 = AbstractC10328mw1.m23021a();
                    this.f10462b = 1;
                    obj = AbstractC11432vY1.m25446c(new C8085Ov1(c7561Et1M23021a3.f2939a.f26939a, false, null), this);
                    if (obj == enumC0817Mz6) {
                        return enumC0817Mz6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.m7017d(obj);
                }
                C8127Pq1 c8127Pq12 = (C8127Pq1) obj;
                O90.m5968f(c8127Pq12, "<this>");
                return new C8285Sr1(c8127Pq12.f9297a, c8127Pq12.f9298b);
            default:
                Object obj2 = EnumC0817Mz.f7418a;
                int i7 = this.f10462b;
                if (i7 == 0) {
                    RQ1.m7017d(obj);
                    C7561Et1 c7561Et1M23021a4 = AbstractC10328mw1.m23021a();
                    this.f10462b = 1;
                    obj = AbstractC11432vY1.m25446c(new C8085Ov1(c7561Et1M23021a4.f2939a.f26939a, false, null), this);
                    if (obj != obj2) {
                    }
                    return obj2;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
                obj2 = ((C8127Pq1) obj).f9299c;
                if (obj2 == null) {
                    throw new IllegalArgumentException("TestPushIPCClient must be created at TestMasterHostIPCClientsFactory");
                }
                return obj2;
        }
    }
}
