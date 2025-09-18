package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: Ox1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC8089Ox1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f8759a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseAnalytics f8760b;

    public /* synthetic */ CallableC8089Ox1(FirebaseAnalytics firebaseAnalytics, int i) {
        this.f8759a = i;
        this.f8760b = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8759a) {
            case 0:
                CG1 cg1 = this.f8760b.f18443a;
                cg1.getClass();
                BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
                cg1.m1136f(new QH1(cg1, binderC9218eF1, 5));
                return binderC9218eF1.m17889J(120000L);
            default:
                CG1 cg12 = this.f8760b.f18443a;
                cg12.getClass();
                BinderC9218eF1 binderC9218eF12 = new BinderC9218eF1();
                cg12.m1136f(new QH1(cg12, binderC9218eF12, 6));
                return (Long) BinderC9218eF1.m17887I(binderC9218eF12.m17888H(120000L), Long.class);
        }
    }
}
