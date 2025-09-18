package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;

/* renamed from: Dl */
/* loaded from: classes2.dex */
public final class ResultReceiverC0237Dl extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ int f2229a = 0;

    /* renamed from: b */
    public final Object f2230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC0237Dl(Handler handler, S81 s81) {
        super(handler);
        this.f2230b = s81;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        switch (this.f2229a) {
            case 0:
                super.onReceiveResult(i, bundle);
                C9955k11 c9955k11 = (C9955k11) ((C7655Go1) this.f2230b).f3913b;
                O90.m5968f(c9955k11, "$emitter");
                if (i != 2 && i != 9901 && i != 9902) {
                    c9955k11.m22134c(C8313Tf1.f11463a);
                    break;
                } else {
                    c9955k11.m22133b(new RuStoreReviewStartException());
                    break;
                }
                break;
            default:
                ((S81) this.f2230b).m7186d(null);
                break;
        }
    }

    public ResultReceiverC0237Dl(C7655Go1 c7655Go1) {
        super(null);
        this.f2230b = c7655Go1;
    }
}
