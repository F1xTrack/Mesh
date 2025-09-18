package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: Nu */
/* loaded from: classes.dex */
public final class C1093Nu implements InterfaceC3577eQ {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final C4332iN d;

    static {
        TE.M("CommandHandler");
    }

    public C1093Nu(Context context, C4332iN c4332iN) {
        this.a = context;
        this.d = c4332iN;
    }

    public static C0376Eo1 d(Intent intent) {
        return new C0376Eo1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void e(Intent intent, C0376Eo1 c0376Eo1) {
        intent.putExtra("KEY_WORKSPEC_ID", c0376Eo1.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c0376Eo1.b);
    }

    @Override // defpackage.InterfaceC3577eQ
    public final void a(C0376Eo1 c0376Eo1, boolean z) {
        synchronized (this.c) {
            try {
                C7762wH c7762wH = (C7762wH) this.b.remove(c0376Eo1);
                this.d.y(c0376Eo1);
                if (c7762wH != null) {
                    c7762wH.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public final void c(Intent intent, int i, L71 l71) {
        List<C7725w41> listZ;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            TE teG = TE.G();
            Objects.toString(intent);
            teG.getClass();
            C5219iy c5219iy = new C5219iy(this.a, i, l71);
            ArrayList arrayListI = l71.e.c.u().i();
            int i2 = AbstractC1414Rx.a;
            Iterator it = arrayListI.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C4061gy c4061gy = ((C1623Uo1) it.next()).j;
                z |= c4061gy.d;
                z2 |= c4061gy.b;
                z3 |= c4061gy.e;
                z4 |= c4061gy.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i3 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c5219iy.a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            C5772lr0 c5772lr0 = c5219iy.c;
            c5772lr0.Z(arrayListI);
            ArrayList arrayList = new ArrayList(arrayListI.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListI.iterator();
            while (it2.hasNext()) {
                C1623Uo1 c1623Uo1 = (C1623Uo1) it2.next();
                String str = c1623Uo1.a;
                if (jCurrentTimeMillis >= c1623Uo1.a() && (!c1623Uo1.c() || c5772lr0.B(str))) {
                    arrayList.add(c1623Uo1);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C1623Uo1 c1623Uo12 = (C1623Uo1) it3.next();
                String str2 = c1623Uo12.a;
                C0376Eo1 c0376Eo1D = AbstractC5615l12.d(c1623Uo12);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                e(intent3, c0376Eo1D);
                TE.G().getClass();
                ((ExecutorC3799fa0) l71.b.d).execute(new RunnableC5251j7(l71, intent3, c5219iy.b, 4));
            }
            c5772lr0.a0();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            TE teG2 = TE.G();
            Objects.toString(intent);
            teG2.getClass();
            l71.e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            TE.G().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C0376Eo1 c0376Eo1D2 = d(intent);
            TE teG3 = TE.G();
            c0376Eo1D2.toString();
            teG3.getClass();
            WorkDatabase workDatabase = l71.e.c;
            workDatabase.c();
            try {
                C1623Uo1 c1623Uo1L = workDatabase.u().l(c0376Eo1D2.a);
                if (c1623Uo1L == null) {
                    TE teG4 = TE.G();
                    c0376Eo1D2.toString();
                    teG4.getClass();
                } else if (F91.r(c1623Uo1L.b)) {
                    TE teG5 = TE.G();
                    c0376Eo1D2.toString();
                    teG5.getClass();
                } else {
                    long jA = c1623Uo1L.a();
                    boolean zC = c1623Uo1L.c();
                    Context context2 = this.a;
                    if (zC) {
                        TE teG6 = TE.G();
                        c0376Eo1D2.toString();
                        teG6.getClass();
                        C3.b(context2, workDatabase, c0376Eo1D2, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((ExecutorC3799fa0) l71.b.d).execute(new RunnableC5251j7(l71, intent4, i, 4));
                    } else {
                        TE teG7 = TE.G();
                        c0376Eo1D2.toString();
                        teG7.getClass();
                        C3.b(context2, workDatabase, c0376Eo1D2, jA);
                    }
                    workDatabase.n();
                }
                return;
            } finally {
                workDatabase.j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    C0376Eo1 c0376Eo1D3 = d(intent);
                    TE teG8 = TE.G();
                    c0376Eo1D3.toString();
                    teG8.getClass();
                    if (this.b.containsKey(c0376Eo1D3)) {
                        TE teG9 = TE.G();
                        c0376Eo1D3.toString();
                        teG9.getClass();
                    } else {
                        C7762wH c7762wH = new C7762wH(this.a, i, l71, this.d.A(c0376Eo1D3));
                        this.b.put(c0376Eo1D3, c7762wH);
                        c7762wH.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                TE teG10 = TE.G();
                intent.toString();
                teG10.getClass();
                return;
            } else {
                C0376Eo1 c0376Eo1D4 = d(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                TE teG11 = TE.G();
                intent.toString();
                teG11.getClass();
                a(c0376Eo1D4, z5);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C4332iN c4332iN = this.d;
        if (zContainsKey) {
            int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C7725w41 c7725w41Y = c4332iN.y(new C0376Eo1(string, i4));
            listZ = arrayList2;
            if (c7725w41Y != null) {
                arrayList2.add(c7725w41Y);
                listZ = arrayList2;
            }
        } else {
            listZ = c4332iN.z(string);
        }
        for (C7725w41 c7725w41 : listZ) {
            TE.G().getClass();
            l71.e.h(c7725w41);
            WorkDatabase workDatabase2 = l71.e.c;
            C0376Eo1 c0376Eo1 = c7725w41.a;
            int i5 = C3.a;
            T71 t71R = workDatabase2.r();
            S71 s71G = t71R.G(c0376Eo1);
            if (s71G != null) {
                C3.a(this.a, c0376Eo1, s71G.c);
                TE teG12 = TE.G();
                c0376Eo1.toString();
                teG12.getClass();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t71R.a;
                workDatabase_Impl.b();
                C5581kr0 c5581kr0 = (C5581kr0) t71R.c;
                C3414dZ c3414dZA = c5581kr0.a();
                String str3 = c0376Eo1.a;
                if (str3 == null) {
                    c3414dZA.V(1);
                } else {
                    c3414dZA.d(1, str3);
                }
                c3414dZA.E(2, c0376Eo1.b);
                workDatabase_Impl.c();
                try {
                    c3414dZA.m();
                    workDatabase_Impl.n();
                } finally {
                    workDatabase_Impl.j();
                    c5581kr0.f(c3414dZA);
                }
            }
            l71.a(c7725w41.a, false);
        }
    }
}
