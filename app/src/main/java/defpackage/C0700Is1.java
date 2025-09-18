package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;
import java.util.concurrent.Executor;

/* renamed from: Is1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0700Is1 implements InterfaceC1161Oq1 {
    public final C1339Qy a;
    public final CheckHostsAvailabilityUseCase b;
    public final Logger c;

    public C0700Is1(C1339Qy c1339Qy, CheckHostsAvailabilityUseCase checkHostsAvailabilityUseCase, Logger logger) {
        O90.f(c1339Qy, "scope");
        O90.f(logger, "rootLogger");
        this.a = c1339Qy;
        this.b = checkHostsAvailabilityUseCase;
        this.c = logger.createLogger(this);
    }

    @Override // defpackage.InterfaceC1161Oq1
    public final Q81 a() throws InterruptedException {
        Logger.DefaultImpls.info$default(this.c, "Check push availability", null, 2, null);
        C1339Qy c1339Qy = this.a;
        C3690f1 c3690f1 = new C3690f1(c1339Qy, 16, this);
        Q81 q81 = new Q81();
        c3690f1.invoke(new K81(q81));
        AbstractC0485Fz abstractC0485Fz = (AbstractC0485Fz) c1339Qy.a.g(AbstractC0485Fz.b);
        Executor executorD = abstractC0485Fz != null ? N02.d(abstractC0485Fz) : null;
        if (executorD == null) {
            q81.a(new C0084Av0(24, c1339Qy), null);
        } else {
            q81.a(new C0162Bv0(c1339Qy), executorD);
        }
        return q81;
    }
}
