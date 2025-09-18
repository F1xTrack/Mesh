package p000;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class X50 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f13560a;

    /* renamed from: b */
    public final /* synthetic */ int f13561b;

    /* renamed from: c */
    public final /* synthetic */ Object f13562c;

    public /* synthetic */ X50(Object obj, int i, int i2) {
        this.f13560a = i2;
        this.f13562c = obj;
        this.f13561b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13560a) {
            case 0:
                C9432fw1 c9432fw1 = (C9432fw1) this.f13562c;
                O90.m5968f(c9432fw1, "this$0");
                WorkDatabase workDatabase = (WorkDatabase) c9432fw1.f27505b;
                Long lM1052Y0 = workDatabase.mo10324q().m1052Y0("next_job_scheduler_id");
                int i = 0;
                int iLongValue = lM1052Y0 != null ? (int) lM1052Y0.longValue() : 0;
                workDatabase.mo10324q().m1056a1(new BC0("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f13561b) {
                    workDatabase.mo10324q().m1056a1(new BC0("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i = iLongValue;
                }
                return Integer.valueOf(i);
            case 1:
                C8064Ol0 c8064Ol0 = (C8064Ol0) this.f13562c;
                boolean z = c8064Ol0.f8606m;
                int i2 = this.f13561b;
                if (!z) {
                    return AbstractC9022cm0.m10859e(c8064Ol0.getContext(), i2, null);
                }
                Context context = c8064Ol0.getContext();
                return AbstractC9022cm0.m10859e(context, i2, AbstractC9022cm0.m10864j(context, i2));
            default:
                C6367lV.m22440a().getClass();
                Trace trace = new Trace((String) this.f13562c, C8619Zc1.f15028s, new C7564Ev0(9), C1329V7.m8297a(), GaugeManager.getInstance());
                trace.start();
                C9400fg1.f27323c.put(this.f13561b, trace);
                return null;
        }
    }
}
