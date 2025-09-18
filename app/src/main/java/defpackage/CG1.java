package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CG1 {
    public static volatile CG1 i;
    public final String a = "FA";
    public final Clock b = DefaultClock.getInstance();
    public final ExecutorService c;
    public final C3866fw1 d;
    public final ArrayList e;
    public int f;
    public boolean g;
    public volatile InterfaceC2099aF1 h;

    public CG1(Context context, Bundle bundle) throws Resources.NotFoundException, ClassNotFoundException {
        int i2 = 0;
        int i3 = 2;
        ThreadFactoryC8144yH1 threadFactoryC8144yH1 = new ThreadFactoryC8144yH1();
        threadFactoryC8144yH1.b = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC8144yH1);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new C3866fw1(i3, this);
        this.e = new ArrayList();
        try {
            String strA = AO1.a(context);
            Preconditions.checkNotNull(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = AO1.a(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strA);
            String string = null;
            if (identifier != 0) {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, CG1.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.g = true;
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        f(new PG1(this, context, bundle, i2));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new IS(i3, this));
    }

    public static CG1 d(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (i == null) {
            synchronized (CG1.class) {
                try {
                    if (i == null) {
                        i = new CG1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final int a(String str) {
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        f(new PG1(this, str, binderC3546eF1, 2));
        Integer num = (Integer) BinderC3546eF1.I(binderC3546eF1.H(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List b(String str, String str2) {
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        f(new TG1(this, str, str2, binderC3546eF1, 1));
        List list = (List) BinderC3546eF1.I(binderC3546eF1.H(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map c(String str, String str2, boolean z) {
        BinderC3546eF1 binderC3546eF1 = new BinderC3546eF1();
        f(new LG1(this, str, str2, z, binderC3546eF1));
        Bundle bundleH = binderC3546eF1.H(5000L);
        if (bundleH == null || bundleH.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleH.size());
        for (String str3 : bundleH.keySet()) {
            Object obj = bundleH.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void e(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            f(new PG1(this, "Error with data collection. Data lost.", exc));
        }
    }

    public final void f(AbstractRunnableC7951xG1 abstractRunnableC7951xG1) {
        this.c.execute(abstractRunnableC7951xG1);
    }
}
