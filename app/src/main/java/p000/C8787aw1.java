package p000;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: aw1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8787aw1 implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ int f16688a;

    /* renamed from: b */
    public final /* synthetic */ Object f16689b;

    public /* synthetic */ C8787aw1(int i, Object obj) {
        this.f16688a = i;
        this.f16689b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        Object obj = this.f16689b;
        switch (this.f16688a) {
            case 0:
                C7463Cw1 c7463Cw1 = (C7463Cw1) obj;
                c7463Cw1.f1768b.m409a("reportBinderDeath", new Object[0]);
                if (c7463Cw1.f1775i.get() != null) {
                    throw new ClassCastException();
                }
                String str = c7463Cw1.f1769c;
                c7463Cw1.f1768b.m409a("%s : Binder has died.", str);
                ArrayList arrayList = c7463Cw1.f1770d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractRunnableC7877Kv1) it.next()).mo4778a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
                }
                arrayList.clear();
                c7463Cw1.m1478b();
                return;
            default:
                C11364v12 c11364v12 = (C11364v12) obj;
                c11364v12.f44093b.m24361q("reportBinderDeath", new Object[0]);
                if (c11364v12.f44100i.get() != null) {
                    throw new ClassCastException();
                }
                String str2 = c11364v12.f44094c;
                c11364v12.f44093b.m24361q("%s : Binder has died.", str2);
                ArrayList arrayList2 = c11364v12.f44095d;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    AbstractRunnableC10008kQ1 abstractRunnableC10008kQ1 = (AbstractRunnableC10008kQ1) it2.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str2).concat(" : Binder has died."));
                    S81 s81 = abstractRunnableC10008kQ1.f36502a;
                    if (s81 != null) {
                        s81.m7185c(remoteException);
                    }
                }
                arrayList2.clear();
                c11364v12.m25307b();
                return;
        }
    }
}
