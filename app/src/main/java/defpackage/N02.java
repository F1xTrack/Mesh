package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class N02 implements InterfaceC6900rl1 {
    public static final Executor d(AbstractC0485Fz abstractC0485Fz) {
        Executor executorP;
        AbstractC3768fQ abstractC3768fQ = abstractC0485Fz instanceof AbstractC3768fQ ? (AbstractC3768fQ) abstractC0485Fz : null;
        return (abstractC3768fQ == null || (executorP = abstractC3768fQ.p()) == null) ? new BK(abstractC0485Fz) : executorP;
    }

    public static final AbstractC0485Fz e(Executor executor) {
        AbstractC0485Fz abstractC0485Fz;
        BK bk = executor instanceof BK ? (BK) executor : null;
        return (bk == null || (abstractC0485Fz = bk.a) == null) ? new C3959gQ(executor) : abstractC0485Fz;
    }

    @Override // defpackage.InterfaceC6900rl1
    public void a() {
    }

    @Override // defpackage.InterfaceC6900rl1
    public void b() {
    }
}
