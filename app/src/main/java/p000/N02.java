package p000;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class N02 implements InterfaceC10946rl1 {
    /* renamed from: d */
    public static final Executor m5506d(AbstractC0377Fz abstractC0377Fz) {
        Executor executorMo733p;
        AbstractC4052fQ abstractC4052fQ = abstractC0377Fz instanceof AbstractC4052fQ ? (AbstractC4052fQ) abstractC0377Fz : null;
        return (abstractC4052fQ == null || (executorMo733p = abstractC4052fQ.mo733p()) == null) ? new ExecutorC0084BK(abstractC0377Fz) : executorMo733p;
    }

    /* renamed from: e */
    public static final AbstractC0377Fz m5507e(Executor executor) {
        AbstractC0377Fz abstractC0377Fz;
        ExecutorC0084BK executorC0084BK = executor instanceof ExecutorC0084BK ? (ExecutorC0084BK) executor : null;
        return (executorC0084BK == null || (abstractC0377Fz = executorC0084BK.f716a) == null) ? new C4115gQ(executor) : abstractC0377Fz;
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: a */
    public void mo5508a() {
    }

    @Override // p000.InterfaceC10946rl1
    /* renamed from: b */
    public void mo5509b() {
    }
}
