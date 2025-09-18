package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class ZY0 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ZY0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C1155Oo1 c1155Oo1 = (C1155Oo1) obj;
                ((LinkedBlockingDeque) c1155Oo1.c).size();
                c1155Oo1.b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                ((LinkedBlockingDeque) c1155Oo1.c).drainTo(arrayList);
                AbstractC3767fP1.b(AbstractC7625vY1.a((InterfaceC0173Bz) c1155Oo1.a), null, new YY0(c1155Oo1, arrayList, null), 3);
                break;
            case 1:
                C0244Cw1 c0244Cw1 = (C0244Cw1) obj;
                c0244Cw1.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c0244Cw1.a().post(new C3484dw1(this, iBinder));
                break;
            default:
                C7524v12 c7524v12 = (C7524v12) obj;
                c7524v12.b.q("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c7524v12.a().post(new ZH1(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C1155Oo1 c1155Oo1 = (C1155Oo1) obj;
                c1155Oo1.b = null;
                c1155Oo1.getClass();
                break;
            case 1:
                C0244Cw1 c0244Cw1 = (C0244Cw1) obj;
                c0244Cw1.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c0244Cw1.a().post(new C5215iw1(1, this));
                break;
            default:
                C7524v12 c7524v12 = (C7524v12) obj;
                c7524v12.b.q("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c7524v12.a().post(new WV1(1, this));
                break;
        }
    }
}
