package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9176dw1 extends AbstractRunnableC7877Kv1 {

    /* renamed from: b */
    public final /* synthetic */ int f26396b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f26397c;

    /* renamed from: d */
    public final /* synthetic */ Object f26398d;

    public C9176dw1(ZY0 zy0, IBinder iBinder) {
        this.f26398d = zy0;
        this.f26397c = iBinder;
    }

    @Override // p000.AbstractRunnableC7877Kv1
    /* renamed from: b */
    public final void mo4779b() throws RemoteException {
        InterfaceC8239Ru1 c9812iu1;
        int i = 1;
        Object obj = this.f26397c;
        Object obj2 = this.f26398d;
        switch (this.f26396b) {
            case 0:
                C7463Cw1 c7463Cw1 = (C7463Cw1) obj2;
                InterfaceC8239Ru1 interfaceC8239Ru1 = c7463Cw1.f1779m;
                ArrayList arrayList = c7463Cw1.f1770d;
                C11352uw1 c11352uw1 = (C11352uw1) obj;
                C7357Av1 c7357Av1 = c7463Cw1.f1768b;
                if (interfaceC8239Ru1 == null && !c7463Cw1.f1773g) {
                    c7357Av1.m409a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(c11352uw1);
                    ZY0 zy0 = new ZY0(i, c7463Cw1);
                    c7463Cw1.f1778l = zy0;
                    c7463Cw1.f1773g = true;
                    if (!c7463Cw1.f1767a.bindService(c7463Cw1.f1774h, zy0, 1)) {
                        c7357Av1.m409a("Failed to bind to the service.", new Object[0]);
                        c7463Cw1.f1773g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractRunnableC7877Kv1) it.next()).mo4778a(new C7619Fw1("Failed to bind to the service."));
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!c7463Cw1.f1773g) {
                    c11352uw1.run();
                    break;
                } else {
                    c7357Av1.m409a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(c11352uw1);
                    break;
                }
                break;
            default:
                ZY0 zy02 = (ZY0) obj2;
                C7463Cw1 c7463Cw12 = (C7463Cw1) zy02.f14965b;
                int i2 = AbstractBinderC7615Fu1.f3471b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    c9812iu1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    c9812iu1 = iInterfaceQueryLocalInterface instanceof InterfaceC8239Ru1 ? (InterfaceC8239Ru1) iInterfaceQueryLocalInterface : new C9812iu1(iBinder);
                }
                c7463Cw12.f1779m = c9812iu1;
                C7463Cw1 c7463Cw13 = (C7463Cw1) zy02.f14965b;
                c7463Cw13.f1768b.m409a("linkToDeath", new Object[0]);
                try {
                    c7463Cw13.f1779m.asBinder().linkToDeath(c7463Cw13.f1776j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
                    C7357Av1 c7357Av12 = c7463Cw13.f1768b;
                    if (zIsLoggable) {
                        C7357Av1.m408b(c7357Av12.f470a, "linkToDeath failed", objArr);
                    } else {
                        c7357Av12.getClass();
                    }
                }
                c7463Cw13.f1773g = false;
                Iterator it2 = c7463Cw13.f1770d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c7463Cw13.f1770d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9176dw1(C7463Cw1 c7463Cw1, S81 s81, C11352uw1 c11352uw1) {
        super(s81);
        this.f26398d = c7463Cw1;
        this.f26397c = c11352uw1;
    }
}
