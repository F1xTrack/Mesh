package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ZH1 extends AbstractRunnableC10008kQ1 {

    /* renamed from: b */
    public final /* synthetic */ int f14844b;

    /* renamed from: c */
    public final /* synthetic */ Object f14845c;

    /* renamed from: d */
    public final /* synthetic */ Object f14846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ZH1(Object obj, S81 s81, Object obj2, int i) {
        super(s81);
        this.f14844b = i;
        this.f14846d = obj;
        this.f14845c = obj2;
    }

    @Override // p000.AbstractRunnableC10008kQ1
    /* renamed from: a */
    public final void mo8800a() throws RemoteException {
        InterfaceC8707aI1 c10496oE1;
        Object obj = this.f14845c;
        Object obj2 = this.f14846d;
        switch (this.f14844b) {
            case 0:
                S81 s81 = (S81) obj;
                KO1 ko1 = (KO1) obj2;
                try {
                    ko1.f6060a.f44104m.mo9700i(ko1.f6061b, AbstractC10648pQ1.m23784a(), new KM1(ko1, s81));
                    break;
                } catch (RemoteException e) {
                    C10909rT0 c10909rT0 = KO1.f6059c;
                    Object[] objArr = {ko1.f6061b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        C10909rT0.m24352s((String) c10909rT0.f41672a, "error requesting in-app review for %s", objArr);
                    } else {
                        c10909rT0.getClass();
                    }
                    s81.m7185c(new RuntimeException(e));
                    return;
                }
            case 1:
                C11364v12 c11364v12 = (C11364v12) obj2;
                InterfaceC8707aI1 interfaceC8707aI1 = c11364v12.f44104m;
                ArrayList arrayList = c11364v12.f44095d;
                ZH1 zh1 = (ZH1) obj;
                C10909rT0 c10909rT02 = c11364v12.f44093b;
                if (interfaceC8707aI1 == null && !c11364v12.f44098g) {
                    c10909rT02.m24361q("Initiate binding to the service.", new Object[0]);
                    arrayList.add(zh1);
                    ZY0 zy0 = new ZY0(2, c11364v12);
                    c11364v12.f44103l = zy0;
                    c11364v12.f44098g = true;
                    if (!c11364v12.f44092a.bindService(c11364v12.f44099h, zy0, 1)) {
                        c10909rT02.m24361q("Failed to bind to the service.", new Object[0]);
                        c11364v12.f44098g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractRunnableC10008kQ1 abstractRunnableC10008kQ1 = (AbstractRunnableC10008kQ1) it.next();
                            LV1 lv1 = new LV1("Failed to bind to the service.");
                            S81 s812 = abstractRunnableC10008kQ1.f36502a;
                            if (s812 != null) {
                                s812.m7185c(lv1);
                            }
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!c11364v12.f44098g) {
                    zh1.run();
                    break;
                } else {
                    c10909rT02.m24361q("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(zh1);
                    break;
                }
                break;
            default:
                ZY0 zy02 = (ZY0) obj2;
                C11364v12 c11364v122 = (C11364v12) zy02.f14965b;
                int i = AbstractBinderC9220eG1.f26632b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    c10496oE1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    c10496oE1 = iInterfaceQueryLocalInterface instanceof InterfaceC8707aI1 ? (InterfaceC8707aI1) iInterfaceQueryLocalInterface : new C10496oE1(iBinder);
                }
                c11364v122.f44104m = c10496oE1;
                C11364v12 c11364v123 = (C11364v12) zy02.f14965b;
                c11364v123.f44093b.m24361q("linkToDeath", new Object[0]);
                try {
                    c11364v123.f44104m.asBinder().linkToDeath(c11364v123.f44101j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
                    C10909rT0 c10909rT03 = c11364v123.f44093b;
                    if (zIsLoggable) {
                        C10909rT0.m24352s((String) c10909rT03.f41672a, "linkToDeath failed", objArr2);
                    } else {
                        c10909rT03.getClass();
                    }
                }
                c11364v123.f44098g = false;
                Iterator it2 = c11364v123.f44095d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c11364v123.f44095d.clear();
                break;
        }
    }

    public ZH1(ZY0 zy0, IBinder iBinder) {
        this.f14844b = 2;
        this.f14846d = zy0;
        this.f14845c = iBinder;
    }
}
