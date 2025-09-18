package p000;

import android.app.Application;
import android.os.AsyncTask;
import com.facebook.react.devsupport.AsyncTaskC1917c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class LA0 extends C10391nQ0 {

    /* renamed from: b */
    public final T71 f6527b;

    /* renamed from: c */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1529YI f6528c;

    public LA0(Application application) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1529YI sharedPreferencesOnSharedPreferenceChangeListenerC1529YI = new SharedPreferencesOnSharedPreferenceChangeListenerC1529YI(application, new C7616Fv0(18));
        this.f6528c = sharedPreferencesOnSharedPreferenceChangeListenerC1529YI;
        C7967Mo1 c7967Mo1 = sharedPreferencesOnSharedPreferenceChangeListenerC1529YI.f14228c;
        T71 t71 = new T71();
        t71.f11173a = c7967Mo1;
        C10457nx0 c10457nx0 = new C10457nx0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10457nx0.m23286a(5000L, timeUnit);
        c10457nx0.m23287b(0L, timeUnit);
        c10457nx0.m23289d(0L, timeUnit);
        new C10585ox0(c10457nx0);
        t71.f11174b = application;
        t71.f11175c = application.getPackageName();
        this.f6527b = t71;
    }

    @Override // p000.C10391nQ0, p000.InterfaceC1839cJ
    /* renamed from: a */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1529YI mo4912a() {
        return this.f6528c;
    }

    @Override // p000.C10391nQ0, p000.InterfaceC1839cJ
    /* renamed from: b */
    public final void mo4913b() {
        T71 t71 = this.f6527b;
        if (((X40) t71.f11176d) != null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            new AsyncTaskC1917c(t71).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
