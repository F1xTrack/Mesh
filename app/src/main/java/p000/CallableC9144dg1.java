package p000;

import android.app.Activity;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.Callable;

/* renamed from: dg1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC9144dg1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f26209a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f26210b;

    /* renamed from: c */
    public final /* synthetic */ int f26211c;

    /* renamed from: d */
    public final /* synthetic */ Object f26212d;

    public /* synthetic */ CallableC9144dg1(Activity activity, int i, String str) {
        this.f26212d = activity;
        this.f26210b = str;
        this.f26211c = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f26211c;
        String str = this.f26210b;
        Object obj = this.f26212d;
        switch (this.f26209a) {
            case 0:
                C6367lV.m22440a().getClass();
                B40 b40 = new B40(str, (String) obj, C8619Zc1.f15028s, new C7731Ia1());
                C7731Ia1 c7731Ia1 = b40.f547b;
                c7731Ia1.m3949d();
                b40.f546a.m9632g(c7731Ia1.f5021a);
                C9400fg1.f27325e.put(i, b40);
                break;
            default:
                Activity activity = (Activity) obj;
                C11808yW0 c11808yW0 = new C11808yW0(activity, str);
                c11808yW0.f46282a.f16089a.mo2450a(activity);
                String str2 = "_st_" + str;
                C6989v4 c6989v4 = C6367lV.f37080d;
                Trace trace = new Trace(str2, C8619Zc1.f15028s, new C7564Ev0(9), C1329V7.m8297a(), GaugeManager.getInstance());
                trace.start();
                c11808yW0.f46283b = trace;
                C9400fg1.f27324d.put(i, c11808yW0);
                break;
        }
        return null;
    }

    public /* synthetic */ CallableC9144dg1(String str, String str2, int i) {
        this.f26210b = str;
        this.f26212d = str2;
        this.f26211c = i;
    }
}
