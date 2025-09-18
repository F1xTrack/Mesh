package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506Gg implements Handler.Callback {
    public final /* synthetic */ int a;

    public /* synthetic */ C0506Gg(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    AbstractC1705Vq.p(message.obj);
                    throw null;
                }
                if (i != 1) {
                    return false;
                }
                AbstractC1705Vq.p(message.obj);
                throw null;
            case 1:
                if (message.what != 1) {
                    return false;
                }
                ZC0 zc0 = (ZC0) message.obj;
                zc0.d.clear(zc0);
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC5506kS0) message.obj).recycle();
                return true;
        }
    }
}
