package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.C1690a;

/* renamed from: Fv */
/* loaded from: classes.dex */
public final class C0373Fv extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f3472e;

    /* renamed from: f */
    public final /* synthetic */ AbstractActivityC0499Hv f3473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0373Fv(AbstractActivityC0499Hv abstractActivityC0499Hv, int i) {
        super(0);
        this.f3472e = i;
        this.f3473f = abstractActivityC0499Hv;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f3472e) {
            case 0:
                AbstractActivityC0499Hv abstractActivityC0499Hv = this.f3473f;
                return new C10529oV0(abstractActivityC0499Hv.getApplication(), abstractActivityC0499Hv, abstractActivityC0499Hv.getIntent() != null ? abstractActivityC0499Hv.getIntent().getExtras() : null);
            case 1:
                this.f3473f.reportFullyDrawn();
                return C8313Tf1.f11463a;
            case 2:
                AbstractActivityC0499Hv abstractActivityC0499Hv2 = this.f3473f;
                return new C6371lZ(abstractActivityC0499Hv2.reportFullyDrawnExecutor, new C0373Fv(abstractActivityC0499Hv2, 1));
            default:
                AbstractActivityC0499Hv abstractActivityC0499Hv3 = this.f3473f;
                C1690a c1690a = new C1690a(new RunnableC6916tv(abstractActivityC0499Hv3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (O90.m5963a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0499Hv3.getLifecycle().mo2368a(new C7168xv(c1690a, 0, abstractActivityC0499Hv3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC6720r4(abstractActivityC0499Hv3, 24, c1690a));
                    }
                }
                return c1690a;
        }
    }
}
