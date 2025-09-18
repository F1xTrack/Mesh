package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ZH1 extends AbstractRunnableC5501kQ1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZH1(Object obj, S81 s81, Object obj2, int i) {
        super(s81);
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // defpackage.AbstractRunnableC5501kQ1
    public final void a() throws RemoteException {
        InterfaceC2108aI1 c6229oE1;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (this.b) {
            case 0:
                S81 s81 = (S81) obj;
                KO1 ko1 = (KO1) obj2;
                try {
                    ko1.a.m.i(ko1.b, AbstractC6456pQ1.a(), new KM1(ko1, s81));
                    break;
                } catch (RemoteException e) {
                    C6845rT0 c6845rT0 = KO1.c;
                    Object[] objArr = {ko1.b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        C6845rT0.s((String) c6845rT0.a, "error requesting in-app review for %s", objArr);
                    } else {
                        c6845rT0.getClass();
                    }
                    s81.c(new RuntimeException(e));
                    return;
                }
            case 1:
                C7524v12 c7524v12 = (C7524v12) obj2;
                InterfaceC2108aI1 interfaceC2108aI1 = c7524v12.m;
                ArrayList arrayList = c7524v12.d;
                ZH1 zh1 = (ZH1) obj;
                C6845rT0 c6845rT02 = c7524v12.b;
                if (interfaceC2108aI1 == null && !c7524v12.g) {
                    c6845rT02.q("Initiate binding to the service.", new Object[0]);
                    arrayList.add(zh1);
                    ZY0 zy0 = new ZY0(2, c7524v12);
                    c7524v12.l = zy0;
                    c7524v12.g = true;
                    if (!c7524v12.a.bindService(c7524v12.h, zy0, 1)) {
                        c6845rT02.q("Failed to bind to the service.", new Object[0]);
                        c7524v12.g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractRunnableC5501kQ1 abstractRunnableC5501kQ1 = (AbstractRunnableC5501kQ1) it.next();
                            LV1 lv1 = new LV1("Failed to bind to the service.");
                            S81 s812 = abstractRunnableC5501kQ1.a;
                            if (s812 != null) {
                                s812.c(lv1);
                            }
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!c7524v12.g) {
                    zh1.run();
                    break;
                } else {
                    c6845rT02.q("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(zh1);
                    break;
                }
                break;
            default:
                ZY0 zy02 = (ZY0) obj2;
                C7524v12 c7524v122 = (C7524v12) zy02.b;
                int i = AbstractBinderC3549eG1.b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    c6229oE1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    c6229oE1 = iInterfaceQueryLocalInterface instanceof InterfaceC2108aI1 ? (InterfaceC2108aI1) iInterfaceQueryLocalInterface : new C6229oE1(iBinder);
                }
                c7524v122.m = c6229oE1;
                C7524v12 c7524v123 = (C7524v12) zy02.b;
                c7524v123.b.q("linkToDeath", new Object[0]);
                try {
                    c7524v123.m.asBinder().linkToDeath(c7524v123.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
                    C6845rT0 c6845rT03 = c7524v123.b;
                    if (zIsLoggable) {
                        C6845rT0.s((String) c6845rT03.a, "linkToDeath failed", objArr2);
                    } else {
                        c6845rT03.getClass();
                    }
                }
                c7524v123.g = false;
                Iterator it2 = c7524v123.d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c7524v123.d.clear();
                break;
        }
    }

    public ZH1(ZY0 zy0, IBinder iBinder) {
        this.b = 2;
        this.d = zy0;
        this.c = iBinder;
    }
}
