package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;

/* renamed from: Bt1 */
/* loaded from: classes2.dex */
public final class C0157Bt1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0781Jt1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0157Bt1(C0781Jt1 c0781Jt1, int i) {
        super(0);
        this.e = i;
        this.f = c0781Jt1;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        C0781Jt1 c0781Jt1 = this.f;
        switch (this.e) {
            case 0:
                Logger logger = AbstractC5979mw1.a;
                Logger logger2 = c0781Jt1.b;
                C1339Qy c1339Qy = c0781Jt1.s;
                O90.f(c1339Qy, "coroutineScope");
                O90.f(logger2, "logger");
                return new CollectDeviceIdErrorsUseCase((DeviceIdRepository) AbstractC1953Yu1.n.getValue(), (CrashReporterRepository) AbstractC1953Yu1.w.getValue(), logger2, c1339Qy);
            case 1:
                Logger logger3 = AbstractC0316Du1.a;
                Logger logger4 = c0781Jt1.b;
                O90.f(logger4, "logger");
                Logger logger5 = AbstractC5979mw1.a;
                return new C1473Sq1(new C6845rT0((C0936Lt1) AbstractC1953Yu1.b.getValue()), new C1632Ur1(AbstractC1953Yu1.c(), logger4), logger4);
            case 2:
                Logger logger6 = AbstractC6734qt1.a;
                C1339Qy c1339Qy2 = c0781Jt1.s;
                O90.f(c1339Qy2, "scope");
                Logger logger7 = c0781Jt1.b;
                O90.f(logger7, "logger");
                Logger logger8 = AbstractC5979mw1.a;
                return new C0700Is1(c1339Qy2, new CheckHostsAvailabilityUseCase((PackagesRepository) AbstractC1953Yu1.i.getValue()), logger7);
            case 3:
                Logger logger9 = AbstractC6734qt1.a;
                C1339Qy c1339Qy3 = c0781Jt1.s;
                C0706Iu1 c0706Iu1 = new C0706Iu1(c0781Jt1, null, 1);
                O90.f(c1339Qy3, "scope");
                Logger logger10 = c0781Jt1.b;
                O90.f(logger10, "logger");
                Logger logger11 = AbstractC5979mw1.a;
                O90.f(logger11, "logger");
                C8074xv1 c8074xv1 = (C8074xv1) AbstractC1953Yu1.f.getValue();
                O90.f(c8074xv1, "testPushRepository");
                O90.f(logger11, "logger");
                C0999Mo1 c0999Mo1 = new C0999Mo1();
                c0999Mo1.a = c8074xv1;
                c0999Mo1.b = logger11;
                return new C1329Qu1(c1339Qy3, c0706Iu1, c0999Mo1, logger10);
            case 4:
                Logger logger12 = AbstractC5979mw1.a;
                Logger logger13 = c0781Jt1.b;
                O90.f(logger13, "logger");
                C1339Qy c1339Qy4 = c0781Jt1.s;
                O90.f(c1339Qy4, "coroutineScope");
                return new C6167nv1((C1005Mq1) AbstractC1953Yu1.j.getValue(), (C0238Cu1) AbstractC1953Yu1.k.getValue(), AbstractC1953Yu1.b(), c1339Qy4, (C0697Ir1) AbstractC1953Yu1.c.getValue(), logger13);
            case 5:
                Logger logger14 = AbstractC6734qt1.a;
                C1339Qy c1339Qy5 = c0781Jt1.s;
                O90.f(c1339Qy5, "scope");
                Logger logger15 = c0781Jt1.b;
                O90.f(logger15, "logger");
                Logger logger16 = AbstractC5979mw1.a;
                F71 f71 = AbstractC1953Yu1.d;
                return new C5976mv1(c1339Qy5, new A61((C1098Nv1) f71.getValue()), new C5996n11((C1098Nv1) f71.getValue()), logger15);
            case 6:
                Logger logger17 = AbstractC6734qt1.a;
                Logger logger18 = c0781Jt1.b;
                O90.f(logger18, "logger");
                return new C8068xt1((C1629Uq1) AbstractC1953Yu1.g.getValue(), new C1398Rr1(1, 0, null), logger18);
            default:
                C0856Ks1 c0856Ks1 = (C0856Ks1) c0781Jt1.l.getValue();
                AbstractC3767fP1.b(c0856Ks1.d, null, new C1710Vr1(c0856Ks1, null, 0), 3);
                C1722Vv1 c1722Vv1 = (C1722Vv1) c0781Jt1.m.getValue();
                AbstractC3767fP1.b(c1722Vv1.c, null, new C1710Vr1(c1722Vv1, null, 4), 3);
                return C1518Tf1.a;
        }
    }
}
