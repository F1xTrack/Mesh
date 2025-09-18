package defpackage;

import android.app.Activity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Callable;

/* renamed from: dg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3437dg1 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ CallableC3437dg1(Activity activity, int i, String str) {
        this.d = activity;
        this.b = str;
        this.c = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        String str = this.b;
        Object obj = this.d;
        switch (this.a) {
            case 0:
                C5705lV.a().getClass();
                B40 b40 = new B40(str, (String) obj, C1977Zc1.s, new C0646Ia1());
                C0646Ia1 c0646Ia1 = b40.b;
                c0646Ia1.d();
                b40.a.g(c0646Ia1.a);
                C3818fg1.e.put(i, b40);
                break;
            default:
                Activity activity = (Activity) obj;
                C8188yW0 c8188yW0 = new C8188yW0(activity, str);
                c8188yW0.a.a.a(activity);
                String str2 = "_st_" + str;
                C7533v4 c7533v4 = C5705lV.d;
                Trace trace = new Trace(str2, C1977Zc1.s, new C0396Ev0(9), V7.a(), GaugeManager.getInstance());
                trace.start();
                c8188yW0.b = trace;
                C3818fg1.d.put(i, c8188yW0);
                break;
        }
        return null;
    }

    public /* synthetic */ CallableC3437dg1(String str, String str2, int i) {
        this.b = str;
        this.d = str2;
        this.c = i;
    }
}
