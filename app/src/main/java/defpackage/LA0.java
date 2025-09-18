package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import com.facebook.react.devsupport.c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class LA0 extends C6073nQ0 {
    public final T71 b;
    public final YI c;

    public LA0(Application application) {
        YI yi = new YI(application, new C0474Fv0(18));
        this.c = yi;
        C0999Mo1 c0999Mo1 = yi.c;
        T71 t71 = new T71();
        t71.a = c0999Mo1;
        C6172nx0 c6172nx0 = new C6172nx0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c6172nx0.a(5000L, timeUnit);
        c6172nx0.b(0L, timeUnit);
        c6172nx0.d(0L, timeUnit);
        new C6363ox0(c6172nx0);
        t71.b = application;
        t71.c = application.getPackageName();
        this.b = t71;
    }

    @Override // defpackage.C6073nQ0, defpackage.InterfaceC2490cJ
    public final YI a() {
        return this.c;
    }

    @Override // defpackage.C6073nQ0, defpackage.InterfaceC2490cJ
    public final void b() {
        T71 t71 = this.b;
        if (((X40) t71.d) != null) {
            AbstractC3393dS.p("ReactNative");
        } else {
            new c(t71).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
