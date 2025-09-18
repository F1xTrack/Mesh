package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.deviceid.CollectDeviceIdErrorsUseCase;
import com.p019vk.push.core.domain.repository.PackagesRepository;
import com.p019vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;

/* renamed from: Bt1 */
/* loaded from: classes2.dex */
public final class C7405Bt1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f1073e;

    /* renamed from: f */
    public final /* synthetic */ C7821Jt1 f1074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7405Bt1(C7821Jt1 c7821Jt1, int i) {
        super(0);
        this.f1073e = i;
        this.f1074f = c7821Jt1;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        C7821Jt1 c7821Jt1 = this.f1074f;
        switch (this.f1073e) {
            case 0:
                Logger logger = AbstractC10328mw1.f37997a;
                Logger logger2 = c7821Jt1.f5777b;
                C1068Qy c1068Qy = c7821Jt1.f5794s;
                O90.m5968f(c1068Qy, "coroutineScope");
                O90.m5968f(logger2, "logger");
                return new CollectDeviceIdErrorsUseCase((DeviceIdRepository) AbstractC8603Yu1.f14601n.getValue(), (CrashReporterRepository) AbstractC8603Yu1.f14610w.getValue(), logger2, c1068Qy);
            case 1:
                Logger logger3 = AbstractC7511Du1.f2294a;
                Logger logger4 = c7821Jt1.f5777b;
                O90.m5968f(logger4, "logger");
                Logger logger5 = AbstractC10328mw1.f37997a;
                return new C8283Sq1(new C10909rT0((C7925Lt1) AbstractC8603Yu1.f14589b.getValue()), new C8389Ur1(AbstractC8603Yu1.m9425c(), logger4), logger4);
            case 2:
                Logger logger6 = AbstractC10834qt1.f41236a;
                C1068Qy c1068Qy2 = c7821Jt1.f5794s;
                O90.m5968f(c1068Qy2, "scope");
                Logger logger7 = c7821Jt1.f5777b;
                O90.m5968f(logger7, "logger");
                Logger logger8 = AbstractC10328mw1.f37997a;
                return new C7767Is1(c1068Qy2, new CheckHostsAvailabilityUseCase((PackagesRepository) AbstractC8603Yu1.f14596i.getValue()), logger7);
            case 3:
                Logger logger9 = AbstractC10834qt1.f41236a;
                C1068Qy c1068Qy3 = c7821Jt1.f5794s;
                C7771Iu1 c7771Iu1 = new C7771Iu1(c7821Jt1, null, 1);
                O90.m5968f(c1068Qy3, "scope");
                Logger logger10 = c7821Jt1.f5777b;
                O90.m5968f(logger10, "logger");
                Logger logger11 = AbstractC10328mw1.f37997a;
                O90.m5968f(logger11, "logger");
                C11732xv1 c11732xv1 = (C11732xv1) AbstractC8603Yu1.f14593f.getValue();
                O90.m5968f(c11732xv1, "testPushRepository");
                O90.m5968f(logger11, "logger");
                C7967Mo1 c7967Mo1 = new C7967Mo1();
                c7967Mo1.f7362a = c11732xv1;
                c7967Mo1.f7363b = logger11;
                return new C8187Qu1(c1068Qy3, c7771Iu1, c7967Mo1, logger10);
            case 4:
                Logger logger12 = AbstractC10328mw1.f37997a;
                Logger logger13 = c7821Jt1.f5777b;
                O90.m5968f(logger13, "logger");
                C1068Qy c1068Qy4 = c7821Jt1.f5794s;
                O90.m5968f(c1068Qy4, "coroutineScope");
                return new C10454nv1((C7971Mq1) AbstractC8603Yu1.f14597j.getValue(), (C7459Cu1) AbstractC8603Yu1.f14598k.getValue(), AbstractC8603Yu1.m9424b(), c1068Qy4, (C7765Ir1) AbstractC8603Yu1.f14590c.getValue(), logger13);
            case 5:
                Logger logger14 = AbstractC10834qt1.f41236a;
                C1068Qy c1068Qy5 = c7821Jt1.f5794s;
                O90.m5968f(c1068Qy5, "scope");
                Logger logger15 = c7821Jt1.f5777b;
                O90.m5968f(logger15, "logger");
                Logger logger16 = AbstractC10328mw1.f37997a;
                F71 f71 = AbstractC8603Yu1.f14591d;
                return new C10326mv1(c1068Qy5, new A61((C8033Nv1) f71.getValue()), new C10339n11((C8033Nv1) f71.getValue()), logger15);
            case 6:
                Logger logger17 = AbstractC10834qt1.f41236a;
                Logger logger18 = c7821Jt1.f5777b;
                O90.m5968f(logger18, "logger");
                return new C11728xt1((C8387Uq1) AbstractC8603Yu1.f14594g.getValue(), new C8233Rr1(1, 0, null), logger18);
            default:
                C7871Ks1 c7871Ks1 = (C7871Ks1) c7821Jt1.f5787l.getValue();
                AbstractC9366fP1.m18230b(c7871Ks1.f6374d, null, new C8441Vr1(c7871Ks1, null, 0), 3);
                C8449Vv1 c8449Vv1 = (C8449Vv1) c7821Jt1.f5788m.getValue();
                AbstractC9366fP1.m18230b(c8449Vv1.f12872c, null, new C8441Vr1(c8449Vv1, null, 4), 3);
                return C8313Tf1.f11463a;
        }
    }
}
