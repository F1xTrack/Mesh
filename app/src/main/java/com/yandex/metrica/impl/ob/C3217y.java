package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3217y extends C3063s0 {
    private Application a;
    private volatile c b = c.NOT_WATCHING_YET;
    private final Zm<a, b> c = new Zm<>(true);

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
        void a(Activity activity, a aVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.y$c */
    public enum c {
        WATCHING(null),
        NO_APPLICATION("Bad application object"),
        NOT_WATCHING_YET("Internal inconsistency");

        public final String a;

        c(String str) {
            this.a = str;
        }
    }

    private synchronized void b() {
        c cVar = this.b;
        c cVar2 = c.WATCHING;
        if (cVar != cVar2 && !this.c.b()) {
            if (this.a == null) {
                this.b = c.NO_APPLICATION;
            } else {
                this.b = cVar2;
                this.a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public synchronized void a(Context context) {
        if (this.a == null) {
            try {
                this.a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(a.CREATED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(a.DESTROYED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(a.PAUSED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(a.RESUMED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(a.STARTED, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a.STOPPED, activity);
    }

    public synchronized void a(Application application) {
        try {
            if (this.a == null) {
                this.a = application;
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public c a() {
        return this.b;
    }

    private void a(a aVar, Activity activity) {
        Collection<b> collectionA;
        synchronized (this) {
            collectionA = this.c.a(aVar);
        }
        if (collectionA != null) {
            Iterator<b> it = collectionA.iterator();
            while (it.hasNext()) {
                it.next().a(activity, aVar);
            }
        }
    }

    public synchronized void a(b bVar, a... aVarArr) {
        try {
            if (U2.a((Object[]) aVarArr)) {
                aVarArr = a.values();
            }
            for (a aVar : aVarArr) {
                this.c.a(aVar, bVar);
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }
}
