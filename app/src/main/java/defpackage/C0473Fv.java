package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.a;

/* renamed from: Fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473Fv extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractActivityC0629Hv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0473Fv(AbstractActivityC0629Hv abstractActivityC0629Hv, int i) {
        super(0);
        this.e = i;
        this.f = abstractActivityC0629Hv;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                AbstractActivityC0629Hv abstractActivityC0629Hv = this.f;
                return new C6279oV0(abstractActivityC0629Hv.getApplication(), abstractActivityC0629Hv, abstractActivityC0629Hv.getIntent() != null ? abstractActivityC0629Hv.getIntent().getExtras() : null);
            case 1:
                this.f.reportFullyDrawn();
                return C1518Tf1.a;
            case 2:
                AbstractActivityC0629Hv abstractActivityC0629Hv2 = this.f;
                return new C5717lZ(abstractActivityC0629Hv2.reportFullyDrawnExecutor, new C0473Fv(abstractActivityC0629Hv2, 1));
            default:
                AbstractActivityC0629Hv abstractActivityC0629Hv3 = this.f;
                a aVar = new a(new RunnableC7310tv(abstractActivityC0629Hv3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (O90.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0629Hv3.getLifecycle().a(new C8072xv(aVar, 0, abstractActivityC0629Hv3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC6769r4(abstractActivityC0629Hv3, 24, aVar));
                    }
                }
                return aVar;
        }
    }
}
