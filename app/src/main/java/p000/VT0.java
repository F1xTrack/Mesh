package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.base.DelayedAction;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.domain.repository.CallingAppRepository;
import com.p019vk.push.core.domain.repository.PackagesRepository;
import com.p019vk.push.core.domain.usecase.GetCallingAppInfoUseCase;

/* loaded from: classes2.dex */
public final class VT0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f12588e;

    /* renamed from: f */
    public final /* synthetic */ XT0 f12589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VT0(XT0 xt0, int i) {
        super(0);
        this.f12588e = i;
        this.f12589f = xt0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f12588e) {
            case 0:
                Logger logger = AbstractC7511Du1.f2294a;
                Logger loggerM9054a = this.f12589f.m9054a();
                O90.m5968f(loggerM9054a, "logger");
                PackagesRepository packagesRepository = (PackagesRepository) AbstractC8603Yu1.f14596i.getValue();
                Logger logger2 = AbstractC10328mw1.f37997a;
                return new C10962rt1(new C8907bs1(new GetCallingAppInfoUseCase((CallingAppRepository) AbstractC8603Yu1.f14606s.getValue()), packagesRepository, (C8181Qr1) AbstractC8603Yu1.f14592e.getValue()), (C8387Uq1) AbstractC8603Yu1.f14594g.getValue(), (C7347Aq1) AbstractC10834qt1.f41237b.getValue(), (C7765Ir1) AbstractC8603Yu1.f14590c.getValue(), (CrashReporterRepository) AbstractC8603Yu1.f14610w.getValue(), AbstractC8603Yu1.m9424b(), loggerM9054a);
            case 1:
                XT0 xt0 = this.f12589f;
                int i = XT0.f13801j;
                Logger.DefaultImpls.info$default(xt0.m9054a(), "Stop service immediately", null, 2, null);
                xt0.stopSelf(xt0.f13808g);
                return C8313Tf1.f11463a;
            default:
                return new DelayedAction(null, new VT0(this.f12589f, 1), 1, null);
        }
    }
}
