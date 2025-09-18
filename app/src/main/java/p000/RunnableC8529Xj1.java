package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Xj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8529Xj1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13938a;

    /* renamed from: b */
    public final /* synthetic */ C1339VH f13939b;

    public /* synthetic */ RunnableC8529Xj1(C1339VH c1339vh, int i) {
        this.f13938a = i;
        this.f13939b = c1339vh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13938a) {
            case 0:
                C1339VH c1339vh = this.f13939b;
                O90.m5968f(c1339vh, "this$0");
                if (((AtomicInteger) c1339vh.f12487c).decrementAndGet() >= 0) {
                    AbstractC7806Jm0.m4412f("VideoUsageControl");
                    break;
                } else {
                    AbstractC7806Jm0.m4412f("VideoUsageControl");
                    break;
                }
            default:
                C1339VH c1339vh2 = this.f13939b;
                O90.m5968f(c1339vh2, "this$0");
                ((AtomicInteger) c1339vh2.f12487c).incrementAndGet();
                AbstractC7806Jm0.m4412f("VideoUsageControl");
                break;
        }
    }
}
