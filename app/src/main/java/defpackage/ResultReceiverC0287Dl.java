package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;

/* renamed from: Dl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ResultReceiverC0287Dl extends ResultReceiver {
    public final /* synthetic */ int a = 0;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC0287Dl(Handler handler, S81 s81) {
        super(handler);
        this.b = s81;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        switch (this.a) {
            case 0:
                super.onReceiveResult(i, bundle);
                C5423k11 c5423k11 = (C5423k11) ((C0532Go1) this.b).b;
                O90.f(c5423k11, "$emitter");
                if (i != 2 && i != 9901 && i != 9902) {
                    c5423k11.c(C1518Tf1.a);
                    break;
                } else {
                    c5423k11.b(new RuStoreReviewStartException());
                    break;
                }
                break;
            default:
                ((S81) this.b).d(null);
                break;
        }
    }

    public ResultReceiverC0287Dl(C0532Go1 c0532Go1) {
        super(null);
        this.b = c0532Go1;
    }
}
