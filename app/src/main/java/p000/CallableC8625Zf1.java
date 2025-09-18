package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: Zf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC8625Zf1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f15083a;

    /* renamed from: b */
    public final /* synthetic */ long f15084b;

    /* renamed from: c */
    public final /* synthetic */ Object f15085c;

    public /* synthetic */ CallableC8625Zf1(Object obj, long j, int i) {
        this.f15083a = i;
        this.f15085c = obj;
        this.f15084b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15083a) {
            case 0:
                CG1 cg1 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C8755ag1) this.f15085c).f2474b).f18443a;
                cg1.getClass();
                cg1.m1136f(new JH1(cg1, this.f15084b));
                break;
            default:
                C6621pV c6621pVM23803d = C6621pV.m23803d((C0786MU) this.f15085c);
                long j = this.f15084b;
                AbstractC9376fU1.m18240a(j == -1 ? c6621pVM23803d.m23805a() : c6621pVM23803d.f40120g.m1947a(j).m18387n(EnumC1163SU.f10807a, new C0912OU(7)));
                break;
        }
        return null;
    }
}
