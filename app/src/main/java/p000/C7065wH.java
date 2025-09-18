package p000;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: wH */
/* loaded from: classes.dex */
public final class C7065wH implements InterfaceC11591wo1, InterfaceC8591Yo1 {

    /* renamed from: a */
    public final Context f44745a;

    /* renamed from: b */
    public final int f44746b;

    /* renamed from: c */
    public final C7551Eo1 f44747c;

    /* renamed from: d */
    public final L71 f44748d;

    /* renamed from: e */
    public final C10189lr0 f44749e;

    /* renamed from: f */
    public final Object f44750f;

    /* renamed from: g */
    public int f44751g;

    /* renamed from: h */
    public final ExecutorC6865t6 f44752h;

    /* renamed from: i */
    public final ExecutorC9387fa0 f44753i;

    /* renamed from: j */
    public PowerManager.WakeLock f44754j;

    /* renamed from: k */
    public boolean f44755k;

    /* renamed from: l */
    public final C11499w41 f44756l;

    static {
        C1210TE.m7637M("DelayMetCommandHandler");
    }

    public C7065wH(Context context, int i, L71 l71, C11499w41 c11499w41) {
        this.f44745a = context;
        this.f44746b = i;
        this.f44748d = l71;
        this.f44747c = c11499w41.f44673a;
        this.f44756l = c11499w41;
        T71 t71 = l71.f6505e.f6323j;
        C8539Xo1 c8539Xo1 = l71.f6502b;
        this.f44752h = (ExecutorC6865t6) c8539Xo1.f13981b;
        this.f44753i = (ExecutorC9387fa0) c8539Xo1.f13983d;
        this.f44749e = new C10189lr0(t71, this);
        this.f44755k = false;
        this.f44751g = 0;
        this.f44750f = new Object();
    }

    /* renamed from: a */
    public static void m25583a(C7065wH c7065wH) {
        C7551Eo1 c7551Eo1 = c7065wH.f44747c;
        if (c7065wH.f44751g >= 2) {
            C1210TE.m7634G().getClass();
            return;
        }
        c7065wH.f44751g = 2;
        C1210TE.m7634G().getClass();
        Context context = c7065wH.f44745a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C0875Nu.m5902e(intent, c7551Eo1);
        L71 l71 = c7065wH.f44748d;
        int i = c7065wH.f44746b;
        RunnableC6217j7 runnableC6217j7 = new RunnableC6217j7(l71, intent, i, 4);
        ExecutorC9387fa0 executorC9387fa0 = c7065wH.f44753i;
        executorC9387fa0.execute(runnableC6217j7);
        if (!l71.f6504d.m6261f(c7551Eo1.f2911a)) {
            C1210TE.m7634G().getClass();
            return;
        }
        C1210TE.m7634G().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C0875Nu.m5902e(intent2, c7551Eo1);
        executorC9387fa0.execute(new RunnableC6217j7(l71, intent2, i, 4));
    }

    /* renamed from: b */
    public final void m25584b() {
        synchronized (this.f44750f) {
            try {
                this.f44749e.m22568a0();
                this.f44748d.f6503c.m10341a(this.f44747c);
                PowerManager.WakeLock wakeLock = this.f44754j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    Objects.toString(this.f44754j);
                    Objects.toString(this.f44747c);
                    c1210teM7634G.getClass();
                    this.f44754j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m25585c() {
        C7551Eo1 c7551Eo1 = this.f44747c;
        StringBuilder sb = new StringBuilder();
        String str = c7551Eo1.f2911a;
        sb.append(str);
        sb.append(" (");
        this.f44754j = AbstractC11076sm1.m24777a(this.f44745a, AbstractC1374Vq.m8591j(sb, this.f44746b, ")"));
        C1210TE c1210teM7634G = C1210TE.m7634G();
        Objects.toString(this.f44754j);
        c1210teM7634G.getClass();
        this.f44754j.acquire();
        C8383Uo1 c8383Uo1M8569l = this.f44748d.f6505e.f6316c.mo10328u().m8569l(str);
        if (c8383Uo1M8569l == null) {
            this.f44752h.execute(new RunnableC7002vH(this, 0));
            return;
        }
        boolean zM8184c = c8383Uo1M8569l.m8184c();
        this.f44755k = zM8184c;
        if (zM8184c) {
            this.f44749e.m22567Z(Collections.singletonList(c8383Uo1M8569l));
        } else {
            C1210TE.m7634G().getClass();
            mo5552f(Collections.singletonList(c8383Uo1M8569l));
        }
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: d */
    public final void mo5550d(ArrayList arrayList) {
        this.f44752h.execute(new RunnableC7002vH(this, 0));
    }

    /* renamed from: e */
    public final void m25586e(boolean z) {
        C1210TE c1210teM7634G = C1210TE.m7634G();
        C7551Eo1 c7551Eo1 = this.f44747c;
        Objects.toString(c7551Eo1);
        c1210teM7634G.getClass();
        m25584b();
        int i = this.f44746b;
        L71 l71 = this.f44748d;
        ExecutorC9387fa0 executorC9387fa0 = this.f44753i;
        Context context = this.f44745a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C0875Nu.m5902e(intent, c7551Eo1);
            executorC9387fa0.execute(new RunnableC6217j7(l71, intent, i, 4));
        }
        if (this.f44755k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC9387fa0.execute(new RunnableC6217j7(l71, intent2, i, 4));
        }
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: f */
    public final void mo5552f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC10084l12.m22338d((C8383Uo1) it.next()).equals(this.f44747c)) {
                this.f44752h.execute(new RunnableC7002vH(this, 1));
                return;
            }
        }
    }
}
