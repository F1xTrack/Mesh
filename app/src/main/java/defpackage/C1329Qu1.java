package defpackage;

import com.vk.push.common.Logger;
import java.util.concurrent.Executor;

/* renamed from: Qu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1329Qu1 implements InterfaceC4051gu1 {
    public final C1339Qy a;
    public final C0706Iu1 b;
    public final C0999Mo1 c;
    public final Logger d;

    public C1329Qu1(C1339Qy c1339Qy, C0706Iu1 c0706Iu1, C0999Mo1 c0999Mo1, Logger logger) {
        O90.f(c1339Qy, "scope");
        O90.f(logger, "logger");
        this.a = c1339Qy;
        this.b = c0706Iu1;
        this.c = c0999Mo1;
        this.d = logger.createLogger(this);
    }

    @Override // defpackage.InterfaceC4051gu1
    public final Q81 a(T71 t71) {
        Logger.DefaultImpls.info$default(this.d, "send test notification", null, 2, null);
        C1339Qy c1339Qy = this.a;
        C2369bg c2369bg = new C2369bg(c1339Qy, this, t71, 2);
        Q81 q81 = new Q81();
        c2369bg.invoke(new K81(q81));
        AbstractC0485Fz abstractC0485Fz = (AbstractC0485Fz) c1339Qy.a.g(AbstractC0485Fz.b);
        Executor executorD = abstractC0485Fz != null ? N02.d(abstractC0485Fz) : null;
        if (executorD == null) {
            q81.a(new C7532v32(c1339Qy), null);
        } else {
            q81.a(new C7304tt(25, c1339Qy), executorD);
        }
        return q81;
    }
}
