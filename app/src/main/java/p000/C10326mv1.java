package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.component.TopicComponent;
import java.util.concurrent.Executor;

/* renamed from: mv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10326mv1 implements TopicComponent {

    /* renamed from: a */
    public final C1068Qy f37993a;

    /* renamed from: b */
    public final A61 f37994b;

    /* renamed from: c */
    public final C10339n11 f37995c;

    /* renamed from: d */
    public final Logger f37996d;

    public C10326mv1(C1068Qy c1068Qy, A61 a61, C10339n11 c10339n11, Logger logger) {
        O90.m5968f(c1068Qy, "scope");
        O90.m5968f(logger, "rootLogger");
        this.f37993a = c1068Qy;
        this.f37994b = a61;
        this.f37995c = c10339n11;
        this.f37996d = logger.createLogger("TopicComponent");
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 subscribeToTopic(String str) {
        O90.m5968f(str, "topic");
        Logger.DefaultImpls.info$default(this.f37996d, "Subscribe To Topic ".concat(str), null, 2, null);
        C1068Qy c1068Qy = this.f37993a;
        C9174dv1 c9174dv1 = new C9174dv1(c1068Qy, this, str, 0);
        Q81 q81 = new Q81();
        c9174dv1.invoke(new K81(q81));
        AbstractC0377Fz abstractC0377Fz = (AbstractC0377Fz) c1068Qy.f9874a.mo937g(AbstractC0377Fz.f3499b);
        Executor executorM5506d = abstractC0377Fz != null ? N02.m5506d(abstractC0377Fz) : null;
        if (executorM5506d == null) {
            q81.m6584a(new C1210TE(c1068Qy), null);
        } else {
            q81.m6584a(new C4049fN(c1068Qy), executorM5506d);
        }
        return q81;
    }

    @Override // com.p019vk.push.common.component.TopicComponent
    public final Q81 unsubscribeFromTopic(String str) {
        O90.m5968f(str, "topic");
        Logger.DefaultImpls.info$default(this.f37996d, "Unsubscribe From Topic ".concat(str), null, 2, null);
        C1068Qy c1068Qy = this.f37993a;
        C9174dv1 c9174dv1 = new C9174dv1(c1068Qy, this, str, 1);
        Q81 q81 = new Q81();
        c9174dv1.invoke(new K81(q81));
        AbstractC0377Fz abstractC0377Fz = (AbstractC0377Fz) c1068Qy.f9874a.mo937g(AbstractC0377Fz.f3499b);
        Executor executorM5506d = abstractC0377Fz != null ? N02.m5506d(abstractC0377Fz) : null;
        if (executorM5506d == null) {
            q81.m6584a(new S20(25, c1068Qy), null);
        } else {
            q81.m6584a(new C10689pl0(c1068Qy), executorM5506d);
        }
        return q81;
    }
}
