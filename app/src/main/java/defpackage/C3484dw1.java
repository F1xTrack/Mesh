package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3484dw1 extends AbstractRunnableC0865Kv1 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public C3484dw1(ZY0 zy0, IBinder iBinder) {
        this.d = zy0;
        this.c = iBinder;
    }

    @Override // defpackage.AbstractRunnableC0865Kv1
    public final void b() throws RemoteException {
        InterfaceC1407Ru1 c5209iu1;
        int i = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (this.b) {
            case 0:
                C0244Cw1 c0244Cw1 = (C0244Cw1) obj2;
                InterfaceC1407Ru1 interfaceC1407Ru1 = c0244Cw1.m;
                ArrayList arrayList = c0244Cw1.d;
                C7506uw1 c7506uw1 = (C7506uw1) obj;
                C0085Av1 c0085Av1 = c0244Cw1.b;
                if (interfaceC1407Ru1 == null && !c0244Cw1.g) {
                    c0085Av1.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(c7506uw1);
                    ZY0 zy0 = new ZY0(i, c0244Cw1);
                    c0244Cw1.l = zy0;
                    c0244Cw1.g = true;
                    if (!c0244Cw1.a.bindService(c0244Cw1.h, zy0, 1)) {
                        c0085Av1.a("Failed to bind to the service.", new Object[0]);
                        c0244Cw1.g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractRunnableC0865Kv1) it.next()).a(new C0478Fw1("Failed to bind to the service."));
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!c0244Cw1.g) {
                    c7506uw1.run();
                    break;
                } else {
                    c0085Av1.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(c7506uw1);
                    break;
                }
                break;
            default:
                ZY0 zy02 = (ZY0) obj2;
                C0244Cw1 c0244Cw12 = (C0244Cw1) zy02.b;
                int i2 = AbstractBinderC0472Fu1.b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    c5209iu1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    c5209iu1 = iInterfaceQueryLocalInterface instanceof InterfaceC1407Ru1 ? (InterfaceC1407Ru1) iInterfaceQueryLocalInterface : new C5209iu1(iBinder);
                }
                c0244Cw12.m = c5209iu1;
                C0244Cw1 c0244Cw13 = (C0244Cw1) zy02.b;
                c0244Cw13.b.a("linkToDeath", new Object[0]);
                try {
                    c0244Cw13.m.asBinder().linkToDeath(c0244Cw13.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr = new Object[0];
                    boolean zIsLoggable = Log.isLoggable("PlayCore", 6);
                    C0085Av1 c0085Av12 = c0244Cw13.b;
                    if (zIsLoggable) {
                        C0085Av1.b(c0085Av12.a, "linkToDeath failed", objArr);
                    } else {
                        c0085Av12.getClass();
                    }
                }
                c0244Cw13.g = false;
                Iterator it2 = c0244Cw13.d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                c0244Cw13.d.clear();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3484dw1(C0244Cw1 c0244Cw1, S81 s81, C7506uw1 c7506uw1) {
        super(s81);
        this.d = c0244Cw1;
        this.c = c7506uw1;
    }
}
