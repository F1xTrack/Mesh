package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;

/* renamed from: tJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC7197tJ0 extends Handler {
    public final /* synthetic */ int a;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((View) message.obj).sendAccessibilityEvent(4);
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC7197tJ0(Looper looper, int i) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC7197tJ0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7197tJ0(Looper looper) {
        super(looper);
        this.a = 3;
        Looper.getMainLooper();
    }
}
