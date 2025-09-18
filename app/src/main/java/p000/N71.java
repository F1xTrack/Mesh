package p000;

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
public final class N71 implements InterfaceC11591wo1, InterfaceC3989eQ {

    /* renamed from: j */
    public static final /* synthetic */ int f7511j = 0;

    /* renamed from: a */
    public final C7863Ko1 f7512a;

    /* renamed from: b */
    public final C8539Xo1 f7513b;

    /* renamed from: c */
    public final Object f7514c = new Object();

    /* renamed from: d */
    public C7551Eo1 f7515d;

    /* renamed from: e */
    public final LinkedHashMap f7516e;

    /* renamed from: f */
    public final HashMap f7517f;

    /* renamed from: g */
    public final HashSet f7518g;

    /* renamed from: h */
    public final C10189lr0 f7519h;

    /* renamed from: i */
    public SystemForegroundService f7520i;

    static {
        C1210TE.m7637M("SystemFgDispatcher");
    }

    public N71(Context context) {
        C7863Ko1 c7863Ko1M4736d = C7863Ko1.m4736d(context);
        this.f7512a = c7863Ko1M4736d;
        this.f7513b = c7863Ko1M4736d.f6317d;
        this.f7515d = null;
        this.f7516e = new LinkedHashMap();
        this.f7518g = new HashSet();
        this.f7517f = new HashMap();
        this.f7519h = new C10189lr0(c7863Ko1M4736d.f6323j, this);
        c7863Ko1M4736d.f6319f.m6258b(this);
    }

    /* renamed from: b */
    public static Intent m5548b(Context context, C7551Eo1 c7551Eo1, C6495nX c6495nX) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c6495nX.f38357a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6495nX.f38358b);
        intent.putExtra("KEY_NOTIFICATION", c6495nX.f38359c);
        intent.putExtra("KEY_WORKSPEC_ID", c7551Eo1.f2911a);
        intent.putExtra("KEY_GENERATION", c7551Eo1.f2912b);
        return intent;
    }

    /* renamed from: c */
    public static Intent m5549c(Context context, C7551Eo1 c7551Eo1, C6495nX c6495nX) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c7551Eo1.f2911a);
        intent.putExtra("KEY_GENERATION", c7551Eo1.f2912b);
        intent.putExtra("KEY_NOTIFICATION_ID", c6495nX.f38357a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6495nX.f38358b);
        intent.putExtra("KEY_NOTIFICATION", c6495nX.f38359c);
        return intent;
    }

    @Override // p000.InterfaceC3989eQ
    /* renamed from: a */
    public final void mo4902a(C7551Eo1 c7551Eo1, boolean z) {
        Map.Entry entry;
        synchronized (this.f7514c) {
            try {
                C8383Uo1 c8383Uo1 = (C8383Uo1) this.f7517f.remove(c7551Eo1);
                if (c8383Uo1 != null ? this.f7518g.remove(c8383Uo1) : false) {
                    this.f7519h.m22567Z(this.f7518g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6495nX c6495nX = (C6495nX) this.f7516e.remove(c7551Eo1);
        if (c7551Eo1.equals(this.f7515d) && this.f7516e.size() > 0) {
            Iterator it = this.f7516e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f7515d = (C7551Eo1) entry.getKey();
            if (this.f7520i != null) {
                C6495nX c6495nX2 = (C6495nX) entry.getValue();
                SystemForegroundService systemForegroundService = this.f7520i;
                systemForegroundService.f16591b.post(new RunnableC8648Zr0(systemForegroundService, c6495nX2.f38357a, c6495nX2.f38359c, c6495nX2.f38358b, 1));
                SystemForegroundService systemForegroundService2 = this.f7520i;
                systemForegroundService2.f16591b.post(new RunnableC0552Il(systemForegroundService2, c6495nX2.f38357a, 4));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f7520i;
        if (c6495nX == null || systemForegroundService3 == null) {
            return;
        }
        C1210TE c1210teM7634G = C1210TE.m7634G();
        c7551Eo1.toString();
        c1210teM7634G.getClass();
        systemForegroundService3.f16591b.post(new RunnableC0552Il(systemForegroundService3, c6495nX.f38357a, 4));
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: d */
    public final void mo5550d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8383Uo1 c8383Uo1 = (C8383Uo1) it.next();
            String str = c8383Uo1.f12134a;
            C1210TE.m7634G().getClass();
            C7551Eo1 c7551Eo1M22338d = AbstractC10084l12.m22338d(c8383Uo1);
            C7863Ko1 c7863Ko1 = this.f7512a;
            c7863Ko1.f6317d.m9154x(new X41(c7863Ko1, new C11499w41(c7551Eo1M22338d), true));
        }
    }

    /* renamed from: e */
    public final void m5551e(Intent intent) {
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C7551Eo1 c7551Eo1 = new C7551Eo1(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C1210TE.m7634G().getClass();
        if (notification == null || this.f7520i == null) {
            return;
        }
        C6495nX c6495nX = new C6495nX(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f7516e;
        linkedHashMap.put(c7551Eo1, c6495nX);
        if (this.f7515d == null) {
            this.f7515d = c7551Eo1;
            SystemForegroundService systemForegroundService = this.f7520i;
            systemForegroundService.f16591b.post(new RunnableC8648Zr0(systemForegroundService, intExtra, notification, intExtra2, 1));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f7520i;
        systemForegroundService2.f16591b.post(new RunnableC6217j7(systemForegroundService2, intExtra, notification, 5));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((C6495nX) ((Map.Entry) it.next()).getValue()).f38358b;
        }
        C6495nX c6495nX2 = (C6495nX) linkedHashMap.get(this.f7515d);
        if (c6495nX2 != null) {
            SystemForegroundService systemForegroundService3 = this.f7520i;
            systemForegroundService3.f16591b.post(new RunnableC8648Zr0(systemForegroundService3, c6495nX2.f38357a, c6495nX2.f38359c, i, 1));
        }
    }

    /* renamed from: g */
    public final void m5553g() {
        this.f7520i = null;
        synchronized (this.f7514c) {
            this.f7519h.m22568a0();
        }
        this.f7512a.f6319f.m6262g(this);
    }

    @Override // p000.InterfaceC11591wo1
    /* renamed from: f */
    public final void mo5552f(List list) {
    }
}
