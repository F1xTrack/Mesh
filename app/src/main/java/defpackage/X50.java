package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class X50 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ X50(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C3866fw1 c3866fw1 = (C3866fw1) this.c;
                O90.f(c3866fw1, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) c3866fw1.b;
                Long lY0 = workDatabase.q().Y0("next_job_scheduler_id");
                int i = 0;
                int iLongValue = lY0 != null ? (int) lY0.longValue() : 0;
                workDatabase.q().a1(new BC0("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.b) {
                    workDatabase.q().a1(new BC0("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 1:
                C1145Ol0 c1145Ol0 = (C1145Ol0) this.c;
                boolean z = c1145Ol0.m;
                int i2 = this.b;
                if (!z) {
                    return AbstractC2578cm0.e(c1145Ol0.getContext(), i2, null);
                }
                Context context = c1145Ol0.getContext();
                return AbstractC2578cm0.e(context, i2, AbstractC2578cm0.j(context, i2));
            default:
                C5705lV.a().getClass();
                Trace trace = new Trace((String) this.c, C1977Zc1.s, new C0396Ev0(9), V7.a(), GaugeManager.getInstance());
                trace.start();
                C3818fg1.c.put(this.b, trace);
                return null;
        }
    }
}
