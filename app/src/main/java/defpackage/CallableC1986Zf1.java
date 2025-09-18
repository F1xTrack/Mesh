package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: Zf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC1986Zf1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC1986Zf1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                CG1 cg1 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C2180ag1) this.c).b).a;
                cg1.getClass();
                cg1.f(new JH1(cg1, this.b));
                break;
            default:
                C6469pV c6469pVD = C6469pV.d((MU) this.c);
                long j = this.b;
                AbstractC3782fU1.a(j == -1 ? c6469pVD.a() : c6469pVD.g.a(j).n(SU.a, new OU(7)));
                break;
        }
        return null;
    }
}
