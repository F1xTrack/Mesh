package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Xj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1842Xj1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VH b;

    public /* synthetic */ RunnableC1842Xj1(VH vh, int i) {
        this.a = i;
        this.b = vh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                VH vh = this.b;
                O90.f(vh, "this$0");
                if (((AtomicInteger) vh.c).decrementAndGet() >= 0) {
                    AbstractC0759Jm0.f("VideoUsageControl");
                    break;
                } else {
                    AbstractC0759Jm0.f("VideoUsageControl");
                    break;
                }
            default:
                VH vh2 = this.b;
                O90.f(vh2, "this$0");
                ((AtomicInteger) vh2.c).incrementAndGet();
                AbstractC0759Jm0.f("VideoUsageControl");
                break;
        }
    }
}
