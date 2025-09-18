package defpackage;

import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class RO1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    public /* synthetic */ RO1() {
        this.a = 2;
    }

    private final void a() {
        synchronized (((JM1) this.c).c) {
            try {
                InterfaceC1571Tx0 interfaceC1571Tx0 = (InterfaceC1571Tx0) ((JM1) this.c).d;
                if (interfaceC1571Tx0 != null) {
                    interfaceC1571Tx0.onFailure((Exception) Preconditions.checkNotNull(((Task) this.b).h()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        C6465pT1 c6465pT1 = (C6465pT1) this.b;
        S81 s81 = (S81) this.c;
        int iDecrementAndGet = ((AtomicInteger) c6465pT1.c).decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            synchronized (c6465pT1) {
                try {
                    c6465pT1.f.zzb();
                    C6465pT1.l = true;
                    U41 u41 = new U41();
                    EnumC5993n02 enumC5993n02 = c6465pT1.j ? EnumC5993n02.TYPE_THICK : EnumC5993n02.TYPE_THIN;
                    C5814m32 c5814m32 = c6465pT1.g;
                    u41.c = enumC5993n02;
                    C6045nH c6045nH = new C6045nH();
                    c6045nH.b = IA1.a(c6465pT1.e);
                    u41.d = new B02(c6045nH);
                    MM1.a.execute(new RunnableC6720qp(c5814m32, new VY(u41, 0), EnumC6375p02.ON_DEVICE_BARCODE_CLOSE, c5814m32.c(), 14));
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicBoolean) c6465pT1.d).set(false);
        }
        A02.a.clear();
        AbstractC5424k12.a.clear();
        s81.b(null);
    }

    private final void c() {
        synchronized (((ServiceConnectionC6855rW1) this.c)) {
            try {
                ((ServiceConnectionC6855rW1) this.c).a = false;
                if (!((ServiceConnectionC6855rW1) this.c).c.I1()) {
                    ((ServiceConnectionC6855rW1) this.c).c.n().o.d("Connected to service");
                    C2528cV1 c2528cV1 = ((ServiceConnectionC6855rW1) this.c).c;
                    MJ1 mj1 = (MJ1) this.b;
                    c2528cV1.v1();
                    Preconditions.checkNotNull(mj1);
                    c2528cV1.e = mj1;
                    c2528cV1.M1();
                    c2528cV1.L1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FY1 fy1 = (FY1) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (fy1) {
                    if (iBinder == null) {
                        fy1.a(0, "Null service connection");
                    } else {
                        try {
                            fy1.c = new C1296Qj1(iBinder);
                            fy1.a = 2;
                            ((ScheduledExecutorService) fy1.f.c).execute(new RunnableC6647qQ1(fy1, 0));
                        } catch (RemoteException e) {
                            fy1.a(0, e.getMessage());
                        }
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                FR1 fr1 = (FR1) this.b;
                fr1.v1();
                if (Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArrayD1 = fr1.t1().D1();
                    for (C8382zX1 c8382zX1 : (List) this.c) {
                        if (!sparseArrayD1.contains(c8382zX1.c) || ((Long) sparseArrayD1.get(c8382zX1.c)).longValue() < c8382zX1.b) {
                            fr1.P1().add(c8382zX1);
                        }
                    }
                    fr1.U1();
                    return;
                }
                return;
            case 3:
                FR1 fr12 = (FR1) this.c;
                fr12.v1();
                fr12.A1();
                Bundle bundle = (Bundle) this.b;
                Preconditions.checkNotNull(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                Preconditions.checkNotEmpty(string);
                Preconditions.checkNotEmpty(string2);
                Preconditions.checkNotNull(bundle.get("value"));
                C3386dP1 c3386dP1 = (C3386dP1) fr12.b;
                if (!c3386dP1.f()) {
                    fr12.n().o.d("Conditional property not set since app measurement is disabled");
                    return;
                }
                C5337jZ1 c5337jZ1 = new C5337jZ1(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    C5910mZ1 c5910mZ1U1 = fr12.u1();
                    bundle.getString("app_id");
                    C8316zB1 c8316zB1K1 = c5910mZ1U1.K1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                    C5910mZ1 c5910mZ1U12 = fr12.u1();
                    bundle.getString("app_id");
                    C8316zB1 c8316zB1K12 = c5910mZ1U12.K1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                    C5910mZ1 c5910mZ1U13 = fr12.u1();
                    bundle.getString("app_id");
                    c3386dP1.o().D1(new C0406Ey1(bundle.getString("app_id"), string2, c5337jZ1, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c8316zB1K12, bundle.getLong("trigger_timeout"), c8316zB1K1, bundle.getLong("time_to_live"), c5910mZ1U13.K1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 4:
                b();
                return;
            case 5:
                ((FR1) this.c).G1((Boolean) this.b, true);
                return;
            case 6:
                FR1 fr13 = ((AppMeasurementDynamiteService) this.c).a.p;
                C3386dP1.c(fr13);
                C3383dO1 c3383dO1 = (C3383dO1) this.b;
                fr13.v1();
                fr13.A1();
                C3383dO1 c3383dO12 = fr13.e;
                if (c3383dO1 != c3383dO12) {
                    Preconditions.checkState(c3383dO12 == null, "EventInterceptor already set.");
                }
                fr13.e = c3383dO1;
                return;
            case 7:
                c();
                return;
            case 8:
                C2528cV1 c2528cV1 = ((ServiceConnectionC6855rW1) this.c).c;
                c2528cV1.v1();
                if (c2528cV1.e != null) {
                    c2528cV1.e = null;
                    c2528cV1.n().o.c((ComponentName) this.b, "Disconnected from device MeasurementService");
                    c2528cV1.v1();
                    c2528cV1.G1();
                    return;
                }
                return;
            case 9:
                C5716lY1 c5716lY1 = (C5716lY1) this.b;
                c5716lY1.f0();
                c5716lY1.p0().v1();
                if (c5716lY1.p == null) {
                    c5716lY1.p = new ArrayList();
                }
                c5716lY1.p.add((Runnable) this.c);
                c5716lY1.h0();
                return;
            case 10:
                JM1 jm1 = (JM1) this.c;
                try {
                    Task taskThen = ((InterfaceC5441k61) jm1.c).then(((Task) this.b).i());
                    if (taskThen == null) {
                        jm1.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    TJ tj = Y81.b;
                    taskThen.e(tj, jm1);
                    taskThen.d(tj, jm1);
                    taskThen.a(tj, jm1);
                    return;
                } catch (CancellationException unused2) {
                    jm1.b();
                    return;
                } catch (C5703lU0 e2) {
                    if (e2.getCause() instanceof Exception) {
                        jm1.onFailure((Exception) e2.getCause());
                        return;
                    } else {
                        jm1.onFailure(e2);
                        return;
                    }
                } catch (Exception e3) {
                    jm1.onFailure(e3);
                    return;
                }
            default:
                C5814m32 c5814m32 = (C5814m32) this.b;
                HashMap map = c5814m32.j;
                EnumC6375p02 enumC6375p02 = EnumC6375p02.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                C6223oC1 c6223oC1 = (C6223oC1) map.get(enumC6375p02);
                if (c6223oC1 != null) {
                    Iterator it = ((C7936xB1) c6223oC1.b()).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object arrayList = (Collection) c6223oC1.c.get(next);
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new BB1(c6223oC1, next, list, null) : new G0(c6223oC1, next, list, (G0) null));
                        Collections.sort(arrayList2);
                        C1241Pr0 c1241Pr0 = new C1241Pr0();
                        Iterator it2 = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it2.hasNext()) {
                            jLongValue += ((Long) it2.next()).longValue();
                        }
                        c1241Pr0.c = Long.valueOf((jLongValue / arrayList2.size()) & Long.MAX_VALUE);
                        c1241Pr0.a = Long.valueOf(C5814m32.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        c1241Pr0.f = Long.valueOf(C5814m32.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        c1241Pr0.e = Long.valueOf(C5814m32.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        c1241Pr0.d = Long.valueOf(C5814m32.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        c1241Pr0.b = Long.valueOf(C5814m32.a(arrayList2, ConfigValue.DOUBLE_DEFAULT_VALUE) & Long.MAX_VALUE);
                        PZ1 pz1 = new PZ1(c1241Pr0);
                        int size = arrayList2.size();
                        C5996n11 c5996n11 = (C5996n11) this.c;
                        C2492cJ1 c2492cJ1 = (C2492cJ1) next;
                        U41 u41 = new U41();
                        u41.c = ((C6465pT1) c5996n11.b).j ? EnumC5993n02.TYPE_THICK : EnumC5993n02.TYPE_THIN;
                        C2216as1 c2216as1 = new C2216as1(5);
                        c2216as1.c = Integer.valueOf(size & Integer.MAX_VALUE);
                        c2216as1.b = c2492cJ1;
                        c2216as1.d = pz1;
                        u41.f = new C5289jJ1(c2216as1);
                        MM1.a.execute(new RunnableC6720qp(c5814m32, new VY(u41, 0), enumC6375p02, c5814m32.c(), 14));
                    }
                    map.remove(enumC6375p02);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RO1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ RO1(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ RO1(C5814m32 c5814m32, C5996n11 c5996n11) {
        this.a = 11;
        EnumC6375p02 enumC6375p02 = EnumC6375p02.UNKNOWN_EVENT;
        this.b = c5814m32;
        this.c = c5996n11;
    }
}
