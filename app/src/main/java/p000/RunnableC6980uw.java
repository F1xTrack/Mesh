package p000;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uw */
/* loaded from: classes.dex */
public final class RunnableC6980uw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44023a;

    /* renamed from: b */
    public final /* synthetic */ long f44024b;

    /* renamed from: c */
    public final /* synthetic */ C10030kb1 f44025c;

    public RunnableC6980uw(C10030kb1 c10030kb1, int i, long j) {
        this.f44025c = c10030kb1;
        this.f44023a = i;
        this.f44024b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C10030kb1 c10030kb1 = this.f44025c;
        int i = this.f44023a;
        final long j = this.f44024b;
        synchronized (c10030kb1) {
            final int i2 = i - 1;
            final C9450g32 c9450g32M1950d = ((C0248Dw) c10030kb1.f36563c).m1950d(3 - i2);
            final Task taskM26005c = ((C7169xw) c10030kb1.f36564d).m26005c();
            AbstractC9376fU1.m18247h(c9450g32M1950d, taskM26005c).mo11140g((ScheduledExecutorService) c10030kb1.f36566f, new InterfaceC1319Uy() { // from class: tw
                @Override // p000.InterfaceC1319Uy
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    JSONObject jSONObject;
                    C10030kb1 c10030kb12 = c10030kb1;
                    C9450g32 c9450g32 = c9450g32M1950d;
                    Task task2 = taskM26005c;
                    long j2 = j;
                    int i3 = i2;
                    c10030kb12.getClass();
                    if (!c9450g32.mo11144k()) {
                        return AbstractC9376fU1.m18243d(new C6684qV("Failed to auto-fetch config update.", c9450g32.mo11141h()));
                    }
                    if (!task2.mo11144k()) {
                        return AbstractC9376fU1.m18243d(new C6684qV("Failed to get activated config for auto-fetch", task2.mo11141h()));
                    }
                    C0185Cw c0185Cw = (C0185Cw) c9450g32.mo11142i();
                    C7232yw c7232ywM1350a = (C7232yw) task2.mo11142i();
                    C7232yw c7232yw = c0185Cw.f1763b;
                    if (c7232yw != null) {
                        boolValueOf = Boolean.valueOf(c7232yw.f46547f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(c0185Cw.f1762a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        c10030kb12.m22221a(i3, j2);
                        return AbstractC9376fU1.m18244e(null);
                    }
                    if (c0185Cw.f1763b == null) {
                        return AbstractC9376fU1.m18244e(null);
                    }
                    if (c7232ywM1350a == null) {
                        c7232ywM1350a = C7232yw.m26286c().m1350a();
                    }
                    C7232yw c7232yw2 = c0185Cw.f1763b;
                    C7232yw c7232ywM26285a = C7232yw.m26285a(new JSONObject(c7232yw2.f46542a.toString()));
                    HashMap mapM26287b = c7232ywM1350a.m26287b();
                    HashMap mapM26287b2 = c7232yw2.m26287b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = c7232ywM1350a.f46543b;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (true) {
                        boolean zHasNext = itKeys.hasNext();
                        jSONObject = c7232ywM26285a.f46543b;
                        if (!zHasNext) {
                            break;
                        }
                        String next = itKeys.next();
                        JSONObject jSONObject3 = c7232yw2.f46543b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = c7232ywM1350a.f46546e;
                            boolean zHas = jSONObject4.has(next);
                            JSONObject jSONObject5 = c7232yw2.f46546e;
                            if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapM26287b.containsKey(next) != mapM26287b2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapM26287b.containsKey(next) && mapM26287b2.containsKey(next) && !((Map) mapM26287b.get(next)).equals(mapM26287b2.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        } else {
                            hashSet.add(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return AbstractC9376fU1.m18244e(null);
                    }
                    C0417Gc c0417Gc = new C0417Gc(hashSet);
                    synchronized (c10030kb12) {
                        Iterator it = ((LinkedHashSet) c10030kb12.f36561a).iterator();
                        while (it.hasNext()) {
                            ((C0500Hw) it.next()).m3652b(c0417Gc);
                        }
                    }
                    return AbstractC9376fU1.m18244e(null);
                }
            });
        }
    }
}
