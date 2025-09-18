package defpackage;

/* renamed from: gH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3932gH implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC4314iH b;

    public /* synthetic */ RunnableC3932gH(AbstractC4314iH abstractC4314iH, int i) {
        this.a = i;
        this.b = abstractC4314iH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AbstractC4314iH abstractC4314iH = this.b;
                abstractC4314iH.getClass();
                try {
                    abstractC4314iH.e.get();
                    AbstractC4314iH.n.decrementAndGet();
                    AbstractC4314iH.m.get();
                    abstractC4314iH.e();
                    return;
                } catch (Exception e) {
                    abstractC4314iH.toString();
                    AbstractC0759Jm0.f("DeferrableSurface");
                    synchronized (abstractC4314iH.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", abstractC4314iH, Boolean.valueOf(abstractC4314iH.c), Integer.valueOf(abstractC4314iH.b)), e);
                    }
                }
            case 1:
                JD0.o.remove(this.b);
                return;
            default:
                this.b.b();
                return;
        }
    }

    public /* synthetic */ RunnableC3932gH(AbstractC4314iH abstractC4314iH, String str) {
        this.a = 0;
        this.b = abstractC4314iH;
    }
}
