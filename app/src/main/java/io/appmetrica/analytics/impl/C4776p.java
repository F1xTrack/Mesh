package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4776p extends A7 {
    public Application a;
    public volatile EnumC4752o b = EnumC4752o.d;
    public final C4715ma c = new C4715ma(true);

    public final synchronized void a(Context context) {
        if (this.a == null) {
            try {
                this.a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC4752o enumC4752o = this.b;
        EnumC4752o enumC4752o2 = EnumC4752o.b;
        if (enumC4752o != enumC4752o2 && !this.c.a.isEmpty()) {
            if (this.a == null) {
                this.b = EnumC4752o.c;
            } else {
                this.b = enumC4752o2;
                this.a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.b == EnumC4752o.b && this.c.a.isEmpty()) {
            this.b = EnumC4752o.d;
            Application application = this.a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, EnumC4704m.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(activity, EnumC4704m.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, EnumC4704m.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, EnumC4704m.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, EnumC4704m.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, EnumC4704m.STOPPED);
    }

    public final synchronized void a(Application application) {
        try {
            if (this.a == null) {
                this.a = application;
            }
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final EnumC4752o a() {
        return this.b;
    }

    public final void a(Activity activity, EnumC4704m enumC4704m) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.c.a.get(enumC4704m);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC4728n) it.next()).a(activity, enumC4704m);
            }
        }
    }

    public final synchronized void b(InterfaceC4728n interfaceC4728n, EnumC4704m... enumC4704mArr) {
        if (enumC4704mArr != null) {
            try {
                if (enumC4704mArr.length == 0) {
                    enumC4704mArr = EnumC4704m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC4704mArr = EnumC4704m.values();
        }
        for (EnumC4704m enumC4704m : enumC4704mArr) {
            C4715ma c4715ma = this.c;
            Collection collection = (Collection) c4715ma.a.get(enumC4704m);
            if (collection != null && collection.remove(interfaceC4728n)) {
                if (collection.isEmpty() && c4715ma.b) {
                    c4715ma.a.remove(enumC4704m);
                }
                new ArrayList(collection);
            }
        }
        c();
    }

    public final synchronized void a(InterfaceC4728n interfaceC4728n, EnumC4704m... enumC4704mArr) {
        if (enumC4704mArr != null) {
            try {
                if (enumC4704mArr.length == 0) {
                    enumC4704mArr = EnumC4704m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC4704mArr = EnumC4704m.values();
        }
        for (EnumC4704m enumC4704m : enumC4704mArr) {
            this.c.a(enumC4704m, interfaceC4728n);
        }
        b();
    }
}
