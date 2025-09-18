package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.component.TopicComponent;
import java.util.concurrent.Executor;

/* renamed from: mv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5976mv1 implements TopicComponent {
    public final C1339Qy a;
    public final A61 b;
    public final C5996n11 c;
    public final Logger d;

    public C5976mv1(C1339Qy c1339Qy, A61 a61, C5996n11 c5996n11, Logger logger) {
        O90.f(c1339Qy, "scope");
        O90.f(logger, "rootLogger");
        this.a = c1339Qy;
        this.b = a61;
        this.c = c5996n11;
        this.d = logger.createLogger("TopicComponent");
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.f(str, "topic");
        Logger.DefaultImpls.info$default(this.d, "Subscribe To Topic ".concat(str), null, 2, null);
        C1339Qy c1339Qy = this.a;
        C3481dv1 c3481dv1 = new C3481dv1(c1339Qy, this, str, 0);
        Q81 q81 = new Q81();
        c3481dv1.invoke(new K81(q81));
        AbstractC0485Fz abstractC0485Fz = (AbstractC0485Fz) c1339Qy.a.g(AbstractC0485Fz.b);
        Executor executorD = abstractC0485Fz != null ? N02.d(abstractC0485Fz) : null;
        if (executorD == null) {
            q81.a(new TE(c1339Qy), null);
        } else {
            q81.a(new C3759fN(c1339Qy), executorD);
        }
        return q81;
    }

    @Override // com.vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.f(str, "topic");
        Logger.DefaultImpls.info$default(this.d, "Unsubscribe From Topic ".concat(str), null, 2, null);
        C1339Qy c1339Qy = this.a;
        C3481dv1 c3481dv1 = new C3481dv1(c1339Qy, this, str, 1);
        Q81 q81 = new Q81();
        c3481dv1.invoke(new K81(q81));
        AbstractC0485Fz abstractC0485Fz = (AbstractC0485Fz) c1339Qy.a.g(AbstractC0485Fz.b);
        Executor executorD = abstractC0485Fz != null ? N02.d(abstractC0485Fz) : null;
        if (executorD == null) {
            q81.a(new S20(25, c1339Qy), null);
        } else {
            q81.a(new C6518pl0(c1339Qy), executorD);
        }
        return q81;
    }
}
