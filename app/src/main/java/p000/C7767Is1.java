package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.usecase.CheckHostsAvailabilityUseCase;
import java.util.concurrent.Executor;

/* renamed from: Is1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7767Is1 implements InterfaceC8075Oq1 {

    /* renamed from: a */
    public final C1068Qy f5193a;

    /* renamed from: b */
    public final CheckHostsAvailabilityUseCase f5194b;

    /* renamed from: c */
    public final Logger f5195c;

    public C7767Is1(C1068Qy c1068Qy, CheckHostsAvailabilityUseCase checkHostsAvailabilityUseCase, Logger logger) {
        O90.m5968f(c1068Qy, "scope");
        O90.m5968f(logger, "rootLogger");
        this.f5193a = c1068Qy;
        this.f5194b = checkHostsAvailabilityUseCase;
        this.f5195c = logger.createLogger(this);
    }

    @Override // p000.InterfaceC8075Oq1
    /* renamed from: a */
    public final Q81 mo369a() throws InterruptedException {
        Logger.DefaultImpls.info$default(this.f5195c, "Check push availability", null, 2, null);
        C1068Qy c1068Qy = this.f5193a;
        C4027f1 c4027f1 = new C4027f1(c1068Qy, 16, this);
        Q81 q81 = new Q81();
        c4027f1.invoke(new K81(q81));
        AbstractC0377Fz abstractC0377Fz = (AbstractC0377Fz) c1068Qy.f9874a.mo937g(AbstractC0377Fz.f3499b);
        Executor executorM5506d = abstractC0377Fz != null ? N02.m5506d(abstractC0377Fz) : null;
        if (executorM5506d == null) {
            q81.m6584a(new C7356Av0(24, c1068Qy), null);
        } else {
            q81.m6584a(new C7408Bv0(c1068Qy), executorM5506d);
        }
        return q81;
    }
}
