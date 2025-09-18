package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7504uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ C5534kb1 c;

    public RunnableC7504uw(C5534kb1 c5534kb1, int i, long j) {
        this.c = c5534kb1;
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C5534kb1 c5534kb1 = this.c;
        int i = this.a;
        final long j = this.b;
        synchronized (c5534kb1) {
            final int i2 = i - 1;
            final C3892g32 c3892g32D = ((C0320Dw) c5534kb1.c).d(3 - i2);
            final Task taskC = ((C8075xw) c5534kb1.d).c();
            AbstractC3782fU1.h(c3892g32D, taskC).g((ScheduledExecutorService) c5534kb1.f, new InterfaceC1651Uy() { // from class: tw
                @Override // defpackage.InterfaceC1651Uy
                public final Object then(Task task) throws JSONException {
                    Boolean boolValueOf;
                    JSONObject jSONObject;
                    C5534kb1 c5534kb12 = c5534kb1;
                    C3892g32 c3892g32 = c3892g32D;
                    Task task2 = taskC;
                    long j2 = j;
                    int i3 = i2;
                    c5534kb12.getClass();
                    if (!c3892g32.k()) {
                        return AbstractC3782fU1.d(new C6660qV("Failed to auto-fetch config update.", c3892g32.h()));
                    }
                    if (!task2.k()) {
                        return AbstractC3782fU1.d(new C6660qV("Failed to get activated config for auto-fetch", task2.h()));
                    }
                    C0242Cw c0242Cw = (C0242Cw) c3892g32.i();
                    C8265yw c8265ywA = (C8265yw) task2.i();
                    C8265yw c8265yw = c0242Cw.b;
                    if (c8265yw != null) {
                        boolValueOf = Boolean.valueOf(c8265yw.f >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(c0242Cw.a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        c5534kb12.a(i3, j2);
                        return AbstractC3782fU1.e(null);
                    }
                    if (c0242Cw.b == null) {
                        return AbstractC3782fU1.e(null);
                    }
                    if (c8265ywA == null) {
                        c8265ywA = C8265yw.c().a();
                    }
                    C8265yw c8265yw2 = c0242Cw.b;
                    C8265yw c8265ywA2 = C8265yw.a(new JSONObject(c8265yw2.a.toString()));
                    HashMap mapB = c8265ywA.b();
                    HashMap mapB2 = c8265yw2.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = c8265ywA.b;
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (true) {
                        boolean zHasNext = itKeys.hasNext();
                        jSONObject = c8265ywA2.b;
                        if (!zHasNext) {
                            break;
                        }
                        String next = itKeys.next();
                        JSONObject jSONObject3 = c8265yw2.b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            JSONObject jSONObject4 = c8265ywA.e;
                            boolean zHas = jSONObject4.has(next);
                            JSONObject jSONObject5 = c8265yw2.e;
                            if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                hashSet.add(next);
                            } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
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
                        return AbstractC3782fU1.e(null);
                    }
                    C0494Gc c0494Gc = new C0494Gc(hashSet);
                    synchronized (c5534kb12) {
                        Iterator it = ((LinkedHashSet) c5534kb12.a).iterator();
                        while (it.hasNext()) {
                            ((C0632Hw) it.next()).b(c0494Gc);
                        }
                    }
                    return AbstractC3782fU1.e(null);
                }
            });
        }
    }
}
