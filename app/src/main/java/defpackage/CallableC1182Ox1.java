package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: Ox1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1182Ox1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAnalytics b;

    public /* synthetic */ CallableC1182Ox1(FirebaseAnalytics firebaseAnalytics, int i) {
        this.a = i;
        this.b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                CG1 cg1 = this.b.a;
                cg1.getClass();
                BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
                cg1.f(new QH1(cg1, binderC3546eF1, 5));
                return binderC3546eF1.J(120000L);
            default:
                CG1 cg12 = this.b.a;
                cg12.getClass();
                BinderC3546eF1 binderC3546eF12 = new BinderC3546eF1();
                cg12.f(new QH1(cg12, binderC3546eF12, 6));
                return (Long) BinderC3546eF1.I(binderC3546eF12.H(120000L), Long.class);
        }
    }
}
