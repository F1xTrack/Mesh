package p000;

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

    /* renamed from: a */
    public final /* synthetic */ int f10155a;

    /* renamed from: b */
    public /* synthetic */ Object f10156b;

    /* renamed from: c */
    public /* synthetic */ Object f10157c;

    public /* synthetic */ RO1() {
        this.f10155a = 2;
    }

    /* renamed from: a */
    private final void m7010a() {
        synchronized (((JM1) this.f10157c).f5497c) {
            try {
                InterfaceC8348Tx0 interfaceC8348Tx0 = (InterfaceC8348Tx0) ((JM1) this.f10157c).f5498d;
                if (interfaceC8348Tx0 != null) {
                    interfaceC8348Tx0.onFailure((Exception) Preconditions.checkNotNull(((Task) this.f10156b).mo11141h()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m7011b() {
        C10654pT1 c10654pT1 = (C10654pT1) this.f10156b;
        S81 s81 = (S81) this.f10157c;
        int iDecrementAndGet = ((AtomicInteger) c10654pT1.f3415c).decrementAndGet();
        Preconditions.checkState(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            synchronized (c10654pT1) {
                try {
                    c10654pT1.f40106f.zzb();
                    C10654pT1.f40104l = true;
                    U41 u41 = new U41();
                    EnumC10337n02 enumC10337n02 = c10654pT1.f40110j ? EnumC10337n02.TYPE_THICK : EnumC10337n02.TYPE_THIN;
                    C10218m32 c10218m32 = c10654pT1.f40107g;
                    u41.f11646c = enumC10337n02;
                    C6479nH c6479nH = new C6479nH();
                    c6479nH.f38228b = IA1.m3777a(c10654pT1.f40105e);
                    u41.f11647d = new B02(c6479nH);
                    MM1.f7115a.execute(new RunnableC6704qp(c10218m32, new C1356VY(u41, 0), EnumC10593p02.ON_DEVICE_BARCODE_CLOSE, c10218m32.m22649c(), 14));
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicBoolean) c10654pT1.f3416d).set(false);
        }
        A02.f9a.clear();
        AbstractC9956k12.f36225a.clear();
        s81.m7184b(null);
    }

    /* renamed from: c */
    private final void m7012c() {
        synchronized (((ServiceConnectionC10916rW1) this.f10157c)) {
            try {
                ((ServiceConnectionC10916rW1) this.f10157c).f41717a = false;
                if (!((ServiceConnectionC10916rW1) this.f10157c).f41719c.m10747I1()) {
                    ((ServiceConnectionC10916rW1) this.f10157c).f41719c.mo6070n().f8386o.m24555d("Connected to service");
                    C8989cV1 c8989cV1 = ((ServiceConnectionC10916rW1) this.f10157c).f41719c;
                    MJ1 mj1 = (MJ1) this.f10156b;
                    c8989cV1.mo7681v1();
                    Preconditions.checkNotNull(mj1);
                    c8989cV1.f17574e = mj1;
                    c8989cV1.m10751M1();
                    c8989cV1.m10750L1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10155a) {
            case 0:
                FY1 fy1 = (FY1) this.f10156b;
                IBinder iBinder = (IBinder) this.f10157c;
                synchronized (fy1) {
                    if (iBinder == null) {
                        fy1.m2668a(0, "Null service connection");
                    } else {
                        try {
                            fy1.f3304c = new C8165Qj1(iBinder);
                            fy1.f3302a = 2;
                            ((ScheduledExecutorService) fy1.f3307f.f1151c).execute(new RunnableC10776qQ1(fy1, 0));
                        } catch (RemoteException e) {
                            fy1.m2668a(0, e.getMessage());
                        }
                    }
                }
                return;
            case 1:
                m7010a();
                return;
            case 2:
                FR1 fr1 = (FR1) this.f10156b;
                fr1.mo7681v1();
                if (Build.VERSION.SDK_INT >= 30) {
                    SparseArray sparseArrayM7994D1 = fr1.m7851t1().m7994D1();
                    for (C11938zX1 c11938zX1 : (List) this.f10157c) {
                        if (!sparseArrayM7994D1.contains(c11938zX1.f46863c) || ((Long) sparseArrayM7994D1.get(c11938zX1.f46863c)).longValue() < c11938zX1.f46862b) {
                            fr1.m2645P1().add(c11938zX1);
                        }
                    }
                    fr1.m2650U1();
                    return;
                }
                return;
            case 3:
                FR1 fr12 = (FR1) this.f10157c;
                fr12.mo7681v1();
                fr12.m18793A1();
                Bundle bundle = (Bundle) this.f10156b;
                Preconditions.checkNotNull(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                Preconditions.checkNotEmpty(string);
                Preconditions.checkNotEmpty(string2);
                Preconditions.checkNotNull(bundle.get("value"));
                C9110dP1 c9110dP1 = (C9110dP1) fr12.f11615b;
                if (!c9110dP1.m17593f()) {
                    fr12.mo6070n().f8386o.m24555d("Conditional property not set since app measurement is disabled");
                    return;
                }
                C9898jZ1 c9898jZ1 = new C9898jZ1(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    C10282mZ1 c10282mZ1M7852u1 = fr12.m7852u1();
                    bundle.getString("app_id");
                    C11894zB1 c11894zB1M22871K1 = c10282mZ1M7852u1.m22871K1(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
                    C10282mZ1 c10282mZ1M7852u12 = fr12.m7852u1();
                    bundle.getString("app_id");
                    C11894zB1 c11894zB1M22871K12 = c10282mZ1M7852u12.m22871K1(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true);
                    C10282mZ1 c10282mZ1M7852u13 = fr12.m7852u1();
                    bundle.getString("app_id");
                    c9110dP1.m17601o().m10742D1(new C7571Ey1(bundle.getString("app_id"), string2, c9898jZ1, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c11894zB1M22871K12, bundle.getLong("trigger_timeout"), c11894zB1M22871K1, bundle.getLong("time_to_live"), c10282mZ1M7852u13.m22871K1(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 4:
                m7011b();
                return;
            case 5:
                ((FR1) this.f10157c).m2637G1((Boolean) this.f10156b, true);
                return;
            case 6:
                FR1 fr13 = ((AppMeasurementDynamiteService) this.f10157c).f18050a.f26046p;
                C9110dP1.m17590c(fr13);
                C9108dO1 c9108dO1 = (C9108dO1) this.f10156b;
                fr13.mo7681v1();
                fr13.m18793A1();
                C9108dO1 c9108dO12 = fr13.f3206e;
                if (c9108dO1 != c9108dO12) {
                    Preconditions.checkState(c9108dO12 == null, "EventInterceptor already set.");
                }
                fr13.f3206e = c9108dO1;
                return;
            case 7:
                m7012c();
                return;
            case 8:
                C8989cV1 c8989cV1 = ((ServiceConnectionC10916rW1) this.f10157c).f41719c;
                c8989cV1.mo7681v1();
                if (c8989cV1.f17574e != null) {
                    c8989cV1.f17574e = null;
                    c8989cV1.mo6070n().f8386o.m24554c((ComponentName) this.f10156b, "Disconnected from device MeasurementService");
                    c8989cV1.mo7681v1();
                    c8989cV1.m10745G1();
                    return;
                }
                return;
            case 9:
                C10152lY1 c10152lY1 = (C10152lY1) this.f10156b;
                c10152lY1.m22486f0();
                c10152lY1.mo6071p0().mo7681v1();
                if (c10152lY1.f37138p == null) {
                    c10152lY1.f37138p = new ArrayList();
                }
                c10152lY1.f37138p.add((Runnable) this.f10157c);
                c10152lY1.m22490h0();
                return;
            case 10:
                JM1 jm1 = (JM1) this.f10157c;
                try {
                    Task taskThen = ((InterfaceC9968k61) jm1.f5497c).then(((Task) this.f10156b).mo11142i());
                    if (taskThen == null) {
                        jm1.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC1215TJ executorC1215TJ = Y81.f14172b;
                    taskThen.mo11138e(executorC1215TJ, jm1);
                    taskThen.mo11137d(executorC1215TJ, jm1);
                    taskThen.mo11134a(executorC1215TJ, jm1);
                    return;
                } catch (CancellationException unused2) {
                    jm1.mo4300b();
                    return;
                } catch (C10143lU0 e2) {
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
                C10218m32 c10218m32 = (C10218m32) this.f10156b;
                HashMap map = c10218m32.f37459j;
                EnumC10593p02 enumC10593p02 = EnumC10593p02.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                C10492oC1 c10492oC1 = (C10492oC1) map.get(enumC10593p02);
                if (c10492oC1 != null) {
                    Iterator it = ((C11640xB1) c10492oC1.m21987b()).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object arrayList = (Collection) c10492oC1.f38885c.get(next);
                        if (arrayList == null) {
                            arrayList = new ArrayList(3);
                        }
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new BB1(c10492oC1, next, list, null) : new C0379G0(c10492oC1, next, list, (C0379G0) null));
                        Collections.sort(arrayList2);
                        C8128Pr0 c8128Pr0 = new C8128Pr0();
                        Iterator it2 = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it2.hasNext()) {
                            jLongValue += ((Long) it2.next()).longValue();
                        }
                        c8128Pr0.f9305c = Long.valueOf((jLongValue / arrayList2.size()) & Long.MAX_VALUE);
                        c8128Pr0.f9303a = Long.valueOf(C10218m32.m22647a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        c8128Pr0.f9308f = Long.valueOf(C10218m32.m22647a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        c8128Pr0.f9307e = Long.valueOf(C10218m32.m22647a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        c8128Pr0.f9306d = Long.valueOf(C10218m32.m22647a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        c8128Pr0.f9304b = Long.valueOf(C10218m32.m22647a(arrayList2, ConfigValue.DOUBLE_DEFAULT_VALUE) & Long.MAX_VALUE);
                        PZ1 pz1 = new PZ1(c8128Pr0);
                        int size = arrayList2.size();
                        C10339n11 c10339n11 = (C10339n11) this.f10157c;
                        C8965cJ1 c8965cJ1 = (C8965cJ1) next;
                        U41 u41 = new U41();
                        u41.f11646c = ((C10654pT1) c10339n11.f38046b).f40110j ? EnumC10337n02.TYPE_THICK : EnumC10337n02.TYPE_THIN;
                        C8779as1 c8779as1 = new C8779as1(5);
                        c8779as1.f16641c = Integer.valueOf(size & Integer.MAX_VALUE);
                        c8779as1.f16640b = c8965cJ1;
                        c8779as1.f16642d = pz1;
                        u41.f11649f = new C9866jJ1(c8779as1);
                        MM1.f7115a.execute(new RunnableC6704qp(c10218m32, new C1356VY(u41, 0), enumC10593p02, c10218m32.m22649c(), 14));
                    }
                    map.remove(enumC10593p02);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RO1(Object obj, int i, Object obj2) {
        this.f10155a = i;
        this.f10156b = obj;
        this.f10157c = obj2;
    }

    public /* synthetic */ RO1(Object obj, Object obj2, boolean z, int i) {
        this.f10155a = i;
        this.f10157c = obj;
        this.f10156b = obj2;
    }

    public /* synthetic */ RO1(C10218m32 c10218m32, C10339n11 c10339n11) {
        this.f10155a = 11;
        EnumC10593p02 enumC10593p02 = EnumC10593p02.UNKNOWN_EVENT;
        this.f10156b = c10218m32;
        this.f10157c = c10339n11;
    }
}
