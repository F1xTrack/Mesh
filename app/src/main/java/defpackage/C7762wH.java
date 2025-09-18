package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: wH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7762wH implements InterfaceC7863wo1, InterfaceC1935Yo1 {
    public final Context a;
    public final int b;
    public final C0376Eo1 c;
    public final L71 d;
    public final C5772lr0 e;
    public final Object f;
    public int g;
    public final ExecutorC7157t6 h;
    public final ExecutorC3799fa0 i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final C7725w41 l;

    static {
        TE.M("DelayMetCommandHandler");
    }

    public C7762wH(Context context, int i, L71 l71, C7725w41 c7725w41) {
        this.a = context;
        this.b = i;
        this.d = l71;
        this.c = c7725w41.a;
        this.l = c7725w41;
        T71 t71 = l71.e.j;
        C1857Xo1 c1857Xo1 = l71.b;
        this.h = (ExecutorC7157t6) c1857Xo1.b;
        this.i = (ExecutorC3799fa0) c1857Xo1.d;
        this.e = new C5772lr0(t71, this);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    public static void a(C7762wH c7762wH) {
        C0376Eo1 c0376Eo1 = c7762wH.c;
        if (c7762wH.g >= 2) {
            TE.G().getClass();
            return;
        }
        c7762wH.g = 2;
        TE.G().getClass();
        Context context = c7762wH.a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        C1093Nu.e(intent, c0376Eo1);
        L71 l71 = c7762wH.d;
        int i = c7762wH.b;
        RunnableC5251j7 runnableC5251j7 = new RunnableC5251j7(l71, intent, i, 4);
        ExecutorC3799fa0 executorC3799fa0 = c7762wH.i;
        executorC3799fa0.execute(runnableC5251j7);
        if (!l71.d.f(c0376Eo1.a)) {
            TE.G().getClass();
            return;
        }
        TE.G().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        C1093Nu.e(intent2, c0376Eo1);
        executorC3799fa0.execute(new RunnableC5251j7(l71, intent2, i, 4));
    }

    public final void b() {
        synchronized (this.f) {
            try {
                this.e.a0();
                this.d.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    TE teG = TE.G();
                    Objects.toString(this.j);
                    Objects.toString(this.c);
                    teG.getClass();
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        C0376Eo1 c0376Eo1 = this.c;
        StringBuilder sb = new StringBuilder();
        String str = c0376Eo1.a;
        sb.append(str);
        sb.append(" (");
        this.j = AbstractC7094sm1.a(this.a, AbstractC1705Vq.j(sb, this.b, ")"));
        TE teG = TE.G();
        Objects.toString(this.j);
        teG.getClass();
        this.j.acquire();
        C1623Uo1 c1623Uo1L = this.d.e.c.u().l(str);
        if (c1623Uo1L == null) {
            this.h.execute(new RunnableC7572vH(this, 0));
            return;
        }
        boolean zC = c1623Uo1L.c();
        this.k = zC;
        if (zC) {
            this.e.Z(Collections.singletonList(c1623Uo1L));
        } else {
            TE.G().getClass();
            f(Collections.singletonList(c1623Uo1L));
        }
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void d(ArrayList arrayList) {
        this.h.execute(new RunnableC7572vH(this, 0));
    }

    public final void e(boolean z) {
        TE teG = TE.G();
        C0376Eo1 c0376Eo1 = this.c;
        Objects.toString(c0376Eo1);
        teG.getClass();
        b();
        int i = this.b;
        L71 l71 = this.d;
        ExecutorC3799fa0 executorC3799fa0 = this.i;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            C1093Nu.e(intent, c0376Eo1);
            executorC3799fa0.execute(new RunnableC5251j7(l71, intent, i, 4));
        }
        if (this.k) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executorC3799fa0.execute(new RunnableC5251j7(l71, intent2, i, 4));
        }
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC5615l12.d((C1623Uo1) it.next()).equals(this.c)) {
                this.h.execute(new RunnableC7572vH(this, 1));
                return;
            }
        }
    }
}
