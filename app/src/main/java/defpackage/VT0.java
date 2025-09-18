package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;

/* loaded from: classes2.dex */
public final class VT0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ XT0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VT0(XT0 xt0, int i) {
        super(0);
        this.e = i;
        this.f = xt0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Logger logger = AbstractC0316Du1.a;
                Logger loggerA = this.f.a();
                O90.f(loggerA, "logger");
                PackagesRepository packagesRepository = (PackagesRepository) AbstractC1953Yu1.i.getValue();
                Logger logger2 = AbstractC5979mw1.a;
                return new C6924rt1(new C2407bs1(new GetCallingAppInfoUseCase((CallingAppRepository) AbstractC1953Yu1.s.getValue()), packagesRepository, (C1320Qr1) AbstractC1953Yu1.e.getValue()), (C1629Uq1) AbstractC1953Yu1.g.getValue(), (C0070Aq1) AbstractC6734qt1.b.getValue(), (C0697Ir1) AbstractC1953Yu1.c.getValue(), (CrashReporterRepository) AbstractC1953Yu1.w.getValue(), AbstractC1953Yu1.b(), loggerA);
            case 1:
                XT0 xt0 = this.f;
                int i = XT0.j;
                Logger.DefaultImpls.info$default(xt0.a(), "Stop service immediately", null, 2, null);
                xt0.stopSelf(xt0.g);
                return C1518Tf1.a;
            default:
                return new DelayedAction(null, new VT0(this.f, 1), 1, null);
        }
    }
}
