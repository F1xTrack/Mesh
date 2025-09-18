package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

/* renamed from: tJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC11145tJ0 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f42993a;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f42993a) {
            case 0:
                ((View) message.obj).sendAccessibilityEvent(4);
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC11145tJ0(Looper looper, int i) {
        super(looper);
        this.f42993a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC11145tJ0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f42993a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC11145tJ0(Looper looper) {
        super(looper);
        this.f42993a = 3;
        Looper.getMainLooper();
    }
}
