package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: Gg */
/* loaded from: classes.dex */
public final class C0421Gg implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f3845a;

    public /* synthetic */ C0421Gg(int i) {
        this.f3845a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f3845a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    AbstractC1374Vq.m8597p(message.obj);
                    throw null;
                }
                if (i != 1) {
                    return false;
                }
                AbstractC1374Vq.m8597p(message.obj);
                throw null;
            case 1:
                if (message.what != 1) {
                    return false;
                }
                ZC0 zc0 = (ZC0) message.obj;
                zc0.f14791d.clear(zc0);
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC10011kS0) message.obj).recycle();
                return true;
        }
    }
}
