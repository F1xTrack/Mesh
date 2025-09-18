package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p */
/* loaded from: classes2.dex */
public final class C5358p extends AbstractC4364A7 {

    /* renamed from: a */
    public Application f32367a;

    /* renamed from: b */
    public volatile EnumC5333o f32368b = EnumC5333o.f32312d;

    /* renamed from: c */
    public final C5294ma f32369c = new C5294ma(true);

    /* renamed from: a */
    public final synchronized void m20893a(Context context) {
        if (this.f32367a == null) {
            try {
                this.f32367a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        m20895b();
    }

    /* renamed from: b */
    public final synchronized void m20895b() {
        EnumC5333o enumC5333o = this.f32368b;
        EnumC5333o enumC5333o2 = EnumC5333o.f32310b;
        if (enumC5333o != enumC5333o2 && !this.f32369c.f32190a.isEmpty()) {
            if (this.f32367a == null) {
                this.f32368b = EnumC5333o.f32311c;
            } else {
                this.f32368b = enumC5333o2;
                this.f32367a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m20897c() {
        if (this.f32368b == EnumC5333o.f32310b && this.f32369c.f32190a.isEmpty()) {
            this.f32368b = EnumC5333o.f32312d;
            Application application = this.f32367a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m20891a(activity, EnumC5283m.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m20891a(activity, EnumC5283m.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m20891a(activity, EnumC5283m.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m20891a(activity, EnumC5283m.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m20891a(activity, EnumC5283m.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m20891a(activity, EnumC5283m.STOPPED);
    }

    /* renamed from: a */
    public final synchronized void m20892a(Application application) {
        try {
            if (this.f32367a == null) {
                this.f32367a = application;
            }
            m20895b();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public final EnumC5333o m20890a() {
        return this.f32368b;
    }

    /* renamed from: a */
    public final void m20891a(Activity activity, EnumC5283m enumC5283m) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f32369c.f32190a.get(enumC5283m);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((InterfaceC5308n) it.next()).mo6433a(activity, enumC5283m);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m20896b(InterfaceC5308n interfaceC5308n, EnumC5283m... enumC5283mArr) {
        if (enumC5283mArr != null) {
            try {
                if (enumC5283mArr.length == 0) {
                    enumC5283mArr = EnumC5283m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC5283mArr = EnumC5283m.values();
        }
        for (EnumC5283m enumC5283m : enumC5283mArr) {
            C5294ma c5294ma = this.f32369c;
            Collection collection = (Collection) c5294ma.f32190a.get(enumC5283m);
            if (collection != null && collection.remove(interfaceC5308n)) {
                if (collection.isEmpty() && c5294ma.f32191b) {
                    c5294ma.f32190a.remove(enumC5283m);
                }
                new ArrayList(collection);
            }
        }
        m20897c();
    }

    /* renamed from: a */
    public final synchronized void m20894a(InterfaceC5308n interfaceC5308n, EnumC5283m... enumC5283mArr) {
        if (enumC5283mArr != null) {
            try {
                if (enumC5283mArr.length == 0) {
                    enumC5283mArr = EnumC5283m.values();
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            enumC5283mArr = EnumC5283m.values();
        }
        for (EnumC5283m enumC5283m : enumC5283mArr) {
            this.f32369c.m20705a(enumC5283m, interfaceC5308n);
        }
        m20895b();
    }
}
