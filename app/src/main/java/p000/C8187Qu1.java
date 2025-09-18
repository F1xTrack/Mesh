package p000;

import com.p019vk.push.common.Logger;
import java.util.concurrent.Executor;

/* renamed from: Qu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8187Qu1 implements InterfaceC9556gu1 {

    /* renamed from: a */
    public final C1068Qy f9859a;

    /* renamed from: b */
    public final C7771Iu1 f9860b;

    /* renamed from: c */
    public final C7967Mo1 f9861c;

    /* renamed from: d */
    public final Logger f9862d;

    public C8187Qu1(C1068Qy c1068Qy, C7771Iu1 c7771Iu1, C7967Mo1 c7967Mo1, Logger logger) {
        O90.m5968f(c1068Qy, "scope");
        O90.m5968f(logger, "logger");
        this.f9859a = c1068Qy;
        this.f9860b = c7771Iu1;
        this.f9861c = c7967Mo1;
        this.f9862d = logger.createLogger(this);
    }

    @Override // p000.InterfaceC9556gu1
    /* renamed from: a */
    public final Q81 mo370a(T71 t71) {
        Logger.DefaultImpls.info$default(this.f9862d, "send test notification", null, 2, null);
        C1068Qy c1068Qy = this.f9859a;
        C1800bg c1800bg = new C1800bg(c1068Qy, this, t71, 2);
        Q81 q81 = new Q81();
        c1800bg.invoke(new K81(q81));
        AbstractC0377Fz abstractC0377Fz = (AbstractC0377Fz) c1068Qy.f9874a.mo937g(AbstractC0377Fz.f3499b);
        Executor executorM5506d = abstractC0377Fz != null ? N02.m5506d(abstractC0377Fz) : null;
        if (executorM5506d == null) {
            q81.m6584a(new C11370v32(c1068Qy), null);
        } else {
            q81.m6584a(new C6914tt(25, c1068Qy), executorM5506d);
        }
        return q81;
    }
}
