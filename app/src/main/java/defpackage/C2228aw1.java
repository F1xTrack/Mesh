package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aw1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2228aw1 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C2228aw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C0244Cw1 c0244Cw1 = (C0244Cw1) obj;
                c0244Cw1.b.a("reportBinderDeath", new Object[0]);
                if (c0244Cw1.i.get() != null) {
                    throw new ClassCastException();
                }
                String str = c0244Cw1.c;
                c0244Cw1.b.a("%s : Binder has died.", str);
                ArrayList arrayList = c0244Cw1.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC0865Kv1) it.next()).a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
                }
                arrayList.clear();
                c0244Cw1.b();
                return;
            default:
                C7524v12 c7524v12 = (C7524v12) obj;
                c7524v12.b.q("reportBinderDeath", new Object[0]);
                if (c7524v12.i.get() != null) {
                    throw new ClassCastException();
                }
                String str2 = c7524v12.c;
                c7524v12.b.q("%s : Binder has died.", str2);
                ArrayList arrayList2 = c7524v12.d;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AbstractRunnableC5501kQ1 abstractRunnableC5501kQ1 = (AbstractRunnableC5501kQ1) it2.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str2).concat(" : Binder has died."));
                    S81 s81 = abstractRunnableC5501kQ1.a;
                    if (s81 != null) {
                        s81.c(remoteException);
                    }
                }
                arrayList2.clear();
                c7524v12.b();
                return;
        }
    }
}
