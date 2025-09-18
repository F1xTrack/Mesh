package p000;

/* renamed from: gH */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4106gH implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f27659a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4232iH f27660b;

    public /* synthetic */ RunnableC4106gH(AbstractC4232iH abstractC4232iH, int i) {
        this.f27659a = i;
        this.f27660b = abstractC4232iH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27659a) {
            case 0:
                AbstractC4232iH abstractC4232iH = this.f27660b;
                abstractC4232iH.getClass();
                try {
                    abstractC4232iH.f29023e.get();
                    AbstractC4232iH.f29018n.decrementAndGet();
                    AbstractC4232iH.f29017m.get();
                    abstractC4232iH.m18994e();
                    return;
                } catch (Exception e) {
                    abstractC4232iH.toString();
                    AbstractC7806Jm0.m4412f("DeferrableSurface");
                    synchronized (abstractC4232iH.f29019a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC4232iH, Boolean.valueOf(abstractC4232iH.f29021c), Integer.valueOf(abstractC4232iH.f29020b)), e);
                    }
                }
            case 1:
                JD0.f5382o.remove(this.f27660b);
                return;
            default:
                this.f27660b.m18991b();
                return;
        }
    }

    public /* synthetic */ RunnableC4106gH(AbstractC4232iH abstractC4232iH, String str) {
        this.f27659a = 0;
        this.f27660b = abstractC4232iH;
    }
}
