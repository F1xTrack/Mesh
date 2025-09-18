package p000;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5796Q;
import io.sentry.backpressure.InterfaceC5983a;
import java.util.Iterator;

/* renamed from: Il */
/* loaded from: classes.dex */
public final class RunnableC0552Il implements Runnable, InterfaceC5983a {

    /* renamed from: a */
    public final /* synthetic */ int f5124a;

    /* renamed from: b */
    public int f5125b;

    /* renamed from: c */
    public final Object f5126c;

    public /* synthetic */ RunnableC0552Il(Object obj, int i, int i2) {
        this.f5124a = i2;
        this.f5126c = obj;
        this.f5125b = i;
    }

    @Override // io.sentry.backpressure.InterfaceC5983a
    /* renamed from: a */
    public int mo3999a() {
        return this.f5125b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC11919zO0 abstractC11919zO0;
        AbstractC11919zO0 abstractC11919zO02;
        Object obj = this.f5126c;
        switch (this.f5124a) {
            case 0:
                EQ1 eq1 = (EQ1) ((C11287uQ0) obj).f43693a;
                if (eq1 != null) {
                    eq1.mo2267c(this.f5125b);
                    break;
                }
                break;
            case 1:
                Iterator it = ((N20) obj).f7470b.iterator();
                while (it.hasNext()) {
                    ((O20) it.next()).onHeadlessJsTaskFinish(this.f5125b);
                }
                break;
            case 2:
                RecyclerView recyclerView = ((C8898bo0) obj).f17167i;
                if (!recyclerView.f16529x && (abstractC11919zO0 = recyclerView.f16512n) != null) {
                    abstractC11919zO0.mo9354A0(recyclerView, this.f5125b);
                    break;
                }
                break;
            case 3:
                C1555Yi c1555Yi = (C1555Yi) obj;
                if (this.f5125b == 0) {
                    ((WH0) c1555Yi.f14458b).f13123d.execute(new RunnableC8352Tz0(7, c1555Yi));
                    break;
                } else {
                    c1555Yi.getClass();
                    break;
                }
            case 4:
                ((SystemForegroundService) obj).f16594e.cancel(this.f5125b);
                break;
            case 5:
                C9794il1 c9794il1 = (C9794il1) obj;
                if (!c9794il1.f16529x && (abstractC11919zO02 = c9794il1.f16512n) != null) {
                    abstractC11919zO02.mo9354A0(c9794il1, this.f5125b);
                    break;
                }
                break;
            default:
                C5759D1 c5759d1 = (C5759D1) obj;
                if (C5760E.f33234a.mo21373s()) {
                    if (this.f5125b > 0) {
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
                    }
                    this.f5125b = 0;
                } else {
                    int i = this.f5125b;
                    if (i < 10) {
                        this.f5125b = i + 1;
                        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f5125b));
                    }
                }
                InterfaceC5796Q executorService = c5759d1.getExecutorService();
                if (!executorService.isClosed()) {
                    executorService.mo13827t(this, 10000);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.backpressure.InterfaceC5983a
    public void start() {
        InterfaceC5796Q executorService = ((C5759D1) this.f5126c).getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        executorService.mo13827t(this, 500);
    }

    public RunnableC0552Il(C5759D1 c5759d1) {
        this.f5124a = 6;
        this.f5125b = 0;
        this.f5126c = c5759d1;
    }

    public RunnableC0552Il(int i, C9794il1 c9794il1) {
        this.f5124a = 5;
        this.f5125b = i;
        this.f5126c = c9794il1;
    }
}
