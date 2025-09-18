package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class N71 implements InterfaceC7863wo1, InterfaceC3577eQ {
    public static final /* synthetic */ int j = 0;
    public final C0844Ko1 a;
    public final C1857Xo1 b;
    public final Object c = new Object();
    public C0376Eo1 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashSet g;
    public final C5772lr0 h;
    public SystemForegroundService i;

    static {
        TE.M("SystemFgDispatcher");
    }

    public N71(Context context) {
        C0844Ko1 c0844Ko1D = C0844Ko1.d(context);
        this.a = c0844Ko1D;
        this.b = c0844Ko1D.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new C5772lr0(c0844Ko1D.j, this);
        c0844Ko1D.f.b(this);
    }

    public static Intent b(Context context, C0376Eo1 c0376Eo1, C6093nX c6093nX) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c6093nX.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6093nX.b);
        intent.putExtra("KEY_NOTIFICATION", c6093nX.c);
        intent.putExtra("KEY_WORKSPEC_ID", c0376Eo1.a);
        intent.putExtra("KEY_GENERATION", c0376Eo1.b);
        return intent;
    }

    public static Intent c(Context context, C0376Eo1 c0376Eo1, C6093nX c6093nX) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c0376Eo1.a);
        intent.putExtra("KEY_GENERATION", c0376Eo1.b);
        intent.putExtra("KEY_NOTIFICATION_ID", c6093nX.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6093nX.b);
        intent.putExtra("KEY_NOTIFICATION", c6093nX.c);
        return intent;
    }

    @Override // defpackage.InterfaceC3577eQ
    public final void a(C0376Eo1 c0376Eo1, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                C1623Uo1 c1623Uo1 = (C1623Uo1) this.f.remove(c0376Eo1);
                if (c1623Uo1 != null ? this.g.remove(c1623Uo1) : false) {
                    this.h.Z(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6093nX c6093nX = (C6093nX) this.e.remove(c0376Eo1);
        if (c0376Eo1.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (C0376Eo1) entry.getKey();
            if (this.i != null) {
                C6093nX c6093nX2 = (C6093nX) entry.getValue();
                SystemForegroundService systemForegroundService = this.i;
                systemForegroundService.b.post(new RunnableC2021Zr0(systemForegroundService, c6093nX2.a, c6093nX2.c, c6093nX2.b, 1));
                SystemForegroundService systemForegroundService2 = this.i;
                systemForegroundService2.b.post(new RunnableC0677Il(systemForegroundService2, c6093nX2.a, 4));
            }
        }
        SystemForegroundService systemForegroundService3 = this.i;
        if (c6093nX == null || systemForegroundService3 == null) {
            return;
        }
        TE teG = TE.G();
        c0376Eo1.toString();
        teG.getClass();
        systemForegroundService3.b.post(new RunnableC0677Il(systemForegroundService3, c6093nX.a, 4));
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1623Uo1 c1623Uo1 = (C1623Uo1) it.next();
            String str = c1623Uo1.a;
            TE.G().getClass();
            C0376Eo1 c0376Eo1D = AbstractC5615l12.d(c1623Uo1);
            C0844Ko1 c0844Ko1 = this.a;
            c0844Ko1.d.x(new X41(c0844Ko1, new C7725w41(c0376Eo1D), true));
        }
    }

    public final void e(Intent intent) {
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C0376Eo1 c0376Eo1 = new C0376Eo1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        TE.G().getClass();
        if (notification == null || this.i == null) {
            return;
        }
        C6093nX c6093nX = new C6093nX(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(c0376Eo1, c6093nX);
        if (this.d == null) {
            this.d = c0376Eo1;
            SystemForegroundService systemForegroundService = this.i;
            systemForegroundService.b.post(new RunnableC2021Zr0(systemForegroundService, intExtra, notification, intExtra2, 1));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.i;
        systemForegroundService2.b.post(new RunnableC5251j7(systemForegroundService2, intExtra, notification, 5));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((C6093nX) ((Map.Entry) it.next()).getValue()).b;
        }
        C6093nX c6093nX2 = (C6093nX) linkedHashMap.get(this.d);
        if (c6093nX2 != null) {
            SystemForegroundService systemForegroundService3 = this.i;
            systemForegroundService3.b.post(new RunnableC2021Zr0(systemForegroundService3, c6093nX2.a, c6093nX2.c, i, 1));
        }
    }

    public final void g() {
        this.i = null;
        synchronized (this.c) {
            this.h.a0();
        }
        this.a.f.g(this);
    }

    @Override // defpackage.InterfaceC7863wo1
    public final void f(List list) {
    }
}
