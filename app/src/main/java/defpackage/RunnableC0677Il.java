package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.D1;
import io.sentry.E;
import io.sentry.EnumC5148n1;
import io.sentry.Q;
import io.sentry.backpressure.a;
import java.util.Iterator;

/* renamed from: Il */
/* loaded from: classes.dex */
public final class RunnableC0677Il implements Runnable, a {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ RunnableC0677Il(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // io.sentry.backpressure.a
    public int a() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8354zO0 abstractC8354zO0;
        AbstractC8354zO0 abstractC8354zO02;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                EQ1 eq1 = (EQ1) ((C7409uQ0) obj).a;
                if (eq1 != null) {
                    eq1.c(this.b);
                    break;
                }
                break;
            case 1:
                Iterator it = ((N20) obj).b.iterator();
                while (it.hasNext()) {
                    ((O20) it.next()).onHeadlessJsTaskFinish(this.b);
                }
                break;
            case 2:
                RecyclerView recyclerView = ((C2394bo0) obj).i;
                if (!recyclerView.x && (abstractC8354zO0 = recyclerView.n) != null) {
                    abstractC8354zO0.A0(recyclerView, this.b);
                    break;
                }
                break;
            case 3:
                C1915Yi c1915Yi = (C1915Yi) obj;
                if (this.b == 0) {
                    ((WH0) c1915Yi.b).d.execute(new RunnableC1577Tz0(7, c1915Yi));
                    break;
                } else {
                    c1915Yi.getClass();
                    break;
                }
            case 4:
                ((SystemForegroundService) obj).e.cancel(this.b);
                break;
            case 5:
                C4405il1 c4405il1 = (C4405il1) obj;
                if (!c4405il1.x && (abstractC8354zO02 = c4405il1.n) != null) {
                    abstractC8354zO02.A0(c4405il1, this.b);
                    break;
                }
                break;
            default:
                D1 d1 = (D1) obj;
                if (E.a.s()) {
                    if (this.b > 0) {
                        d1.getLogger().k(EnumC5148n1.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
                    }
                    this.b = 0;
                } else {
                    int i = this.b;
                    if (i < 10) {
                        this.b = i + 1;
                        d1.getLogger().k(EnumC5148n1.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.b));
                    }
                }
                Q executorService = d1.getExecutorService();
                if (!executorService.isClosed()) {
                    executorService.t(this, 10000);
                    break;
                }
                break;
        }
    }

    @Override // io.sentry.backpressure.a
    public void start() {
        Q executorService = ((D1) this.c).getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        executorService.t(this, 500);
    }

    public RunnableC0677Il(D1 d1) {
        this.a = 6;
        this.b = 0;
        this.c = d1;
    }

    public RunnableC0677Il(int i, C4405il1 c4405il1) {
        this.a = 5;
        this.b = i;
        this.c = c4405il1;
    }
}
