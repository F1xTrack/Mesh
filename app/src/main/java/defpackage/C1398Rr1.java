package defpackage;

import com.vk.push.common.Logger;

/* renamed from: Rr1 */
/* loaded from: classes2.dex */
public final class C1398Rr1 extends AbstractC4286i71 implements InterfaceC6099nZ {
    public final /* synthetic */ int a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1398Rr1(int i, int i2, InterfaceC1729Vy interfaceC1729Vy) {
        super(i, interfaceC1729Vy);
        this.a = i2;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(InterfaceC1729Vy interfaceC1729Vy) {
        switch (this.a) {
            case 0:
                return new C1398Rr1(1, 0, interfaceC1729Vy);
            case 1:
                return new C1398Rr1(1, 1, interfaceC1729Vy);
            case 2:
                return new C1398Rr1(1, 2, interfaceC1729Vy);
            case 3:
                return new C1398Rr1(1, 3, interfaceC1729Vy);
            case 4:
                return new C1398Rr1(1, 4, interfaceC1729Vy);
            case 5:
                return new C1398Rr1(1, 5, interfaceC1729Vy);
            default:
                return new C1398Rr1(1, 6, interfaceC1729Vy);
        }
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        InterfaceC1729Vy interfaceC1729Vy = (InterfaceC1729Vy) obj;
        switch (this.a) {
            case 0:
                return new C1398Rr1(1, 0, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            case 1:
                return new C1398Rr1(1, 1, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            case 2:
                return new C1398Rr1(1, 2, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            case 3:
                return new C1398Rr1(1, 3, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            case 4:
                return new C1398Rr1(1, 4, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            case 5:
                return new C1398Rr1(1, 5, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
            default:
                return new C1398Rr1(1, 6, interfaceC1729Vy).invokeSuspend(C1518Tf1.a);
        }
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
                int i = this.b;
                if (i == 0) {
                    RQ1.d(obj);
                    C0391Et1 c0391Et1A = AbstractC5979mw1.a();
                    this.b = 1;
                    obj = AbstractC7625vY1.c(new C1176Ov1(c0391Et1A.a.a, false, null), this);
                    if (obj == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return ((C1239Pq1) obj).a;
            case 1:
                EnumC1030Mz enumC1030Mz2 = EnumC1030Mz.a;
                int i2 = this.b;
                if (i2 == 0) {
                    RQ1.d(obj);
                    C0391Et1 c0391Et1A2 = AbstractC5979mw1.a();
                    this.b = 1;
                    obj = AbstractC7625vY1.c(new C1176Ov1(c0391Et1A2.a.a, false, null), this);
                    if (obj == enumC1030Mz2) {
                        return enumC1030Mz2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                C1239Pq1 c1239Pq1 = (C1239Pq1) obj;
                O90.f(c1239Pq1, "<this>");
                return new C1476Sr1(c1239Pq1.a, c1239Pq1.b);
            case 2:
                EnumC1030Mz enumC1030Mz3 = EnumC1030Mz.a;
                int i3 = this.b;
                if (i3 == 0) {
                    RQ1.d(obj);
                    Logger logger = AbstractC5979mw1.a;
                    InterfaceC1707Vq1 interfaceC1707Vq1C = AbstractC1953Yu1.c();
                    O90.f(logger, "logger");
                    C1632Ur1 c1632Ur1 = new C1632Ur1(interfaceC1707Vq1C, logger);
                    this.b = 1;
                    if (c1632Ur1.a(true, this) == enumC1030Mz3) {
                        return enumC1030Mz3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return C1518Tf1.a;
            case 3:
                EnumC1030Mz enumC1030Mz4 = EnumC1030Mz.a;
                int i4 = this.b;
                if (i4 == 0) {
                    RQ1.d(obj);
                    C1320Qr1 c1320Qr1 = (C1320Qr1) AbstractC1953Yu1.e.getValue();
                    this.b = 1;
                    obj = c1320Qr1.e(this);
                    if (obj == enumC1030Mz4) {
                        return enumC1030Mz4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return obj;
            case 4:
                EnumC1030Mz enumC1030Mz5 = EnumC1030Mz.a;
                int i5 = this.b;
                if (i5 == 0) {
                    RQ1.d(obj);
                    C1320Qr1 c1320Qr12 = (C1320Qr1) AbstractC1953Yu1.e.getValue();
                    this.b = 1;
                    if (c1320Qr12.b(this) == enumC1030Mz5) {
                        return enumC1030Mz5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                return C1518Tf1.a;
            case 5:
                EnumC1030Mz enumC1030Mz6 = EnumC1030Mz.a;
                int i6 = this.b;
                if (i6 == 0) {
                    RQ1.d(obj);
                    C0391Et1 c0391Et1A3 = AbstractC5979mw1.a();
                    this.b = 1;
                    obj = AbstractC7625vY1.c(new C1176Ov1(c0391Et1A3.a.a, false, null), this);
                    if (obj == enumC1030Mz6) {
                        return enumC1030Mz6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RQ1.d(obj);
                }
                C1239Pq1 c1239Pq12 = (C1239Pq1) obj;
                O90.f(c1239Pq12, "<this>");
                return new C1476Sr1(c1239Pq12.a, c1239Pq12.b);
            default:
                Object obj2 = EnumC1030Mz.a;
                int i7 = this.b;
                if (i7 == 0) {
                    RQ1.d(obj);
                    C0391Et1 c0391Et1A4 = AbstractC5979mw1.a();
                    this.b = 1;
                    obj = AbstractC7625vY1.c(new C1176Ov1(c0391Et1A4.a.a, false, null), this);
                    if (obj != obj2) {
                    }
                    return obj2;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
                obj2 = ((C1239Pq1) obj).c;
                if (obj2 == null) {
                    throw new IllegalArgumentException("TestPushIPCClient must be created at TestMasterHostIPCClientsFactory");
                }
                return obj2;
        }
    }
}
