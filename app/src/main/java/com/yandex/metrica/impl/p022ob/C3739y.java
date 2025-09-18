package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.y */
/* loaded from: classes2.dex */
public class C3739y extends C3584s0 {

    /* renamed from: a */
    private Application f25262a;

    /* renamed from: b */
    private volatile c f25263b = c.NOT_WATCHING_YET;

    /* renamed from: c */
    private final C3113Zm<a, b> f25264c = new C3113Zm<>(true);

    /* renamed from: com.yandex.metrica.impl.ob.y$a */
    public enum a {
        CREATED,
        RESUMED,
        PAUSED,
        STARTED,
        STOPPED,
        DESTROYED
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$b */
    public interface b {
        /* renamed from: a */
        void mo13943a(Activity activity, a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$c */
    public enum c {
        WATCHING(null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");


        /* renamed from: a */
        public final String f25276a;

        c(String str) {
            this.f25276a = str;
        }
    }

    /* renamed from: b */
    private synchronized void m17199b() {
        c cVar = this.f25263b;
        c cVar2 = c.WATCHING;
        if (cVar != cVar2 && !this.f25264c.m15571b()) {
            if (this.f25262a == null) {
                this.f25263b = c.NO_APPLICATION;
            } else {
                this.f25263b = cVar2;
                this.f25262a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m17202a(Context context) {
        if (this.f25262a == null) {
            try {
                this.f25262a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m17199b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m17198a(a.CREATED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        m17198a(a.DESTROYED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m17198a(a.PAUSED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m17198a(a.RESUMED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m17198a(a.STARTED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        m17198a(a.STOPPED, activity);
    }

    /* renamed from: a */
    public synchronized void m17201a(Application application) {
        try {
            if (this.f25262a == null) {
                this.f25262a = application;
            }
            m17199b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public c m17200a() {
        return this.f25263b;
    }

    /* renamed from: a */
    private void m17198a(a aVar, Activity activity) {
        Collection<b> collectionM15566a;
        synchronized (this) {
            collectionM15566a = this.f25264c.m15566a(aVar);
        }
        if (collectionM15566a != null) {
            Iterator<b> it = collectionM15566a.iterator();
            while (it.hasNext()) {
                it.next().mo13943a(activity, aVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m17203a(b bVar, a... aVarArr) {
        try {
            if (C2968U2.m15247a((Object[]) aVarArr)) {
                aVarArr = a.values();
            }
            for (a aVar : aVarArr) {
                this.f25264c.m15567a(aVar, bVar);
            }
            m17199b();
        } catch (Throwable th) {
            throw th;
        }
    }
}
