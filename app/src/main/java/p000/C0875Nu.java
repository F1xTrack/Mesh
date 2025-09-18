package p000;

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
public final class C0875Nu implements InterfaceC3989eQ {

    /* renamed from: e */
    public static final /* synthetic */ int f8119e = 0;

    /* renamed from: a */
    public final Context f8120a;

    /* renamed from: b */
    public final HashMap f8121b = new HashMap();

    /* renamed from: c */
    public final Object f8122c = new Object();

    /* renamed from: d */
    public final C4238iN f8123d;

    static {
        C1210TE.m7637M("CommandHandler");
    }

    public C0875Nu(Context context, C4238iN c4238iN) {
        this.f8120a = context;
        this.f8123d = c4238iN;
    }

    /* renamed from: d */
    public static C7551Eo1 m5901d(Intent intent) {
        return new C7551Eo1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: e */
    public static void m5902e(Intent intent, C7551Eo1 c7551Eo1) {
        intent.putExtra("KEY_WORKSPEC_ID", c7551Eo1.f2911a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c7551Eo1.f2912b);
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        synchronized (this.f8122c) {
            try {
                C7065wH c7065wH = (C7065wH) this.f8121b.remove(c7551Eo1);
                this.f8123d.m19020y(c7551Eo1);
                if (c7065wH != null) {
                    c7065wH.m25586e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m5903b() {
        boolean z;
        synchronized (this.f8122c) {
            z = !this.f8121b.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public final void m5904c(Intent intent, int i, L71 l71) {
        List<C11499w41> listM19021z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C1210TE c1210teM7634G = C1210TE.m7634G();
            Objects.toString(intent);
            c1210teM7634G.getClass();
            C6207iy c6207iy = new C6207iy(this.f8120a, i, l71);
            ArrayList arrayListM8566i = l71.f6505e.f6316c.mo10328u().m8566i();
            int i2 = AbstractC1129Rx.f10492a;
            Iterator it = arrayListM8566i.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C4149gy c4149gy = ((C8383Uo1) it.next()).f12143j;
                z |= c4149gy.f28119d;
                z2 |= c4149gy.f28117b;
                z3 |= c4149gy.f28120e;
                z4 |= c4149gy.f28116a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i3 = ConstraintProxyUpdateReceiver.f16584a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c6207iy.f34819a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            C10189lr0 c10189lr0 = c6207iy.f34821c;
            c10189lr0.m22567Z(arrayListM8566i);
            ArrayList arrayList = new ArrayList(arrayListM8566i.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListM8566i.iterator();
            while (it2.hasNext()) {
                C8383Uo1 c8383Uo1 = (C8383Uo1) it2.next();
                String str = c8383Uo1.f12134a;
                if (jCurrentTimeMillis >= c8383Uo1.m8183a() && (!c8383Uo1.m8184c() || c10189lr0.m22545B(str))) {
                    arrayList.add(c8383Uo1);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C8383Uo1 c8383Uo12 = (C8383Uo1) it3.next();
                String str2 = c8383Uo12.f12134a;
                C7551Eo1 c7551Eo1M22338d = AbstractC10084l12.m22338d(c8383Uo12);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m5902e(intent3, c7551Eo1M22338d);
                C1210TE.m7634G().getClass();
                ((ExecutorC9387fa0) l71.f6502b.f13983d).execute(new RunnableC6217j7(l71, intent3, c6207iy.f34820b, 4));
            }
            c10189lr0.m22568a0();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C1210TE c1210teM7634G2 = C1210TE.m7634G();
            Objects.toString(intent);
            c1210teM7634G2.getClass();
            l71.f6505e.m4738f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C1210TE.m7634G().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C7551Eo1 c7551Eo1M5901d = m5901d(intent);
            C1210TE c1210teM7634G3 = C1210TE.m7634G();
            c7551Eo1M5901d.toString();
            c1210teM7634G3.getClass();
            WorkDatabase workDatabase = l71.f6505e.f6316c;
            workDatabase.m23793c();
            try {
                C8383Uo1 c8383Uo1M8569l = workDatabase.mo10328u().m8569l(c7551Eo1M5901d.f2911a);
                if (c8383Uo1M8569l == null) {
                    C1210TE c1210teM7634G4 = C1210TE.m7634G();
                    c7551Eo1M5901d.toString();
                    c1210teM7634G4.getClass();
                } else if (F91.m2535r(c8383Uo1M8569l.f12135b)) {
                    C1210TE c1210teM7634G5 = C1210TE.m7634G();
                    c7551Eo1M5901d.toString();
                    c1210teM7634G5.getClass();
                } else {
                    long jM8183a = c8383Uo1M8569l.m8183a();
                    boolean zM8184c = c8383Uo1M8569l.m8184c();
                    Context context2 = this.f8120a;
                    if (zM8184c) {
                        C1210TE c1210teM7634G6 = C1210TE.m7634G();
                        c7551Eo1M5901d.toString();
                        c1210teM7634G6.getClass();
                        AbstractC0130C3.m959b(context2, workDatabase, c7551Eo1M5901d, jM8183a);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((ExecutorC9387fa0) l71.f6502b.f13983d).execute(new RunnableC6217j7(l71, intent4, i, 4));
                    } else {
                        C1210TE c1210teM7634G7 = C1210TE.m7634G();
                        c7551Eo1M5901d.toString();
                        c1210teM7634G7.getClass();
                        AbstractC0130C3.m959b(context2, workDatabase, c7551Eo1M5901d, jM8183a);
                    }
                    workDatabase.m23799n();
                }
                return;
            } finally {
                workDatabase.m23795j();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f8122c) {
                try {
                    C7551Eo1 c7551Eo1M5901d2 = m5901d(intent);
                    C1210TE c1210teM7634G8 = C1210TE.m7634G();
                    c7551Eo1M5901d2.toString();
                    c1210teM7634G8.getClass();
                    if (this.f8121b.containsKey(c7551Eo1M5901d2)) {
                        C1210TE c1210teM7634G9 = C1210TE.m7634G();
                        c7551Eo1M5901d2.toString();
                        c1210teM7634G9.getClass();
                    } else {
                        C7065wH c7065wH = new C7065wH(this.f8120a, i, l71, this.f8123d.m19009A(c7551Eo1M5901d2));
                        this.f8121b.put(c7551Eo1M5901d2, c7065wH);
                        c7065wH.m25585c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                C1210TE c1210teM7634G10 = C1210TE.m7634G();
                intent.toString();
                c1210teM7634G10.getClass();
                return;
            } else {
                C7551Eo1 c7551Eo1M5901d3 = m5901d(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                C1210TE c1210teM7634G11 = C1210TE.m7634G();
                intent.toString();
                c1210teM7634G11.getClass();
                mo4902a(c7551Eo1M5901d3, z5);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C4238iN c4238iN = this.f8123d;
        if (zContainsKey) {
            int i4 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            C11499w41 c11499w41M19020y = c4238iN.m19020y(new C7551Eo1(string, i4));
            listM19021z = arrayList2;
            if (c11499w41M19020y != null) {
                arrayList2.add(c11499w41M19020y);
                listM19021z = arrayList2;
            }
        } else {
            listM19021z = c4238iN.m19021z(string);
        }
        for (C11499w41 c11499w41 : listM19021z) {
            C1210TE.m7634G().getClass();
            l71.f6505e.m4740h(c11499w41);
            WorkDatabase workDatabase2 = l71.f6505e.f6316c;
            C7551Eo1 c7551Eo1 = c11499w41.f44673a;
            int i5 = AbstractC0130C3.f1153a;
            T71 t71Mo10325r = workDatabase2.mo10325r();
            S71 s71M7559G = t71Mo10325r.m7559G(c7551Eo1);
            if (s71M7559G != null) {
                AbstractC0130C3.m958a(this.f8120a, c7551Eo1, s71M7559G.f10590c);
                C1210TE c1210teM7634G12 = C1210TE.m7634G();
                c7551Eo1.toString();
                c1210teM7634G12.getClass();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t71Mo10325r.f11173a;
                workDatabase_Impl.m23792b();
                C10061kr0 c10061kr0 = (C10061kr0) t71Mo10325r.f11175c;
                C3936dZ c3936dZM2771a = c10061kr0.m2771a();
                String str3 = c7551Eo1.f2911a;
                if (str3 == null) {
                    c3936dZM2771a.mo2032V(1);
                } else {
                    c3936dZM2771a.mo2033d(1, str3);
                }
                c3936dZM2771a.mo2030E(2, c7551Eo1.f2912b);
                workDatabase_Impl.m23793c();
                try {
                    c3936dZM2771a.m17710m();
                    workDatabase_Impl.m23799n();
                } finally {
                    workDatabase_Impl.m23795j();
                    c10061kr0.m2776f(c3936dZM2771a);
                }
            }
            l71.mo4902a(c11499w41.f44673a, false);
        }
    }
}
