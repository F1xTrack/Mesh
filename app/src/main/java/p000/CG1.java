package p000;

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

    /* renamed from: i */
    public static volatile CG1 f1286i;

    /* renamed from: a */
    public final String f1287a = "FA";

    /* renamed from: b */
    public final Clock f1288b = DefaultClock.getInstance();

    /* renamed from: c */
    public final ExecutorService f1289c;

    /* renamed from: d */
    public final C9432fw1 f1290d;

    /* renamed from: e */
    public final ArrayList f1291e;

    /* renamed from: f */
    public int f1292f;

    /* renamed from: g */
    public boolean f1293g;

    /* renamed from: h */
    public volatile InterfaceC8701aF1 f1294h;

    public CG1(Context context, Bundle bundle) throws Resources.NotFoundException, ClassNotFoundException {
        int i = 0;
        int i2 = 2;
        ThreadFactoryC11779yH1 threadFactoryC11779yH1 = new ThreadFactoryC11779yH1();
        threadFactoryC11779yH1.f46176b = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC11779yH1);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f1289c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f1290d = new C9432fw1(i2, this);
        this.f1291e = new ArrayList();
        try {
            String strM173a = AO1.m173a(context);
            Preconditions.checkNotNull(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strM173a)) {
                strM173a = AO1.m173a(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strM173a);
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
                    this.f1293g = true;
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        m1136f(new PG1(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C0533IS(i2, this));
    }

    /* renamed from: d */
    public static CG1 m1131d(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f1286i == null) {
            synchronized (CG1.class) {
                try {
                    if (f1286i == null) {
                        f1286i = new CG1(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f1286i;
    }

    /* renamed from: a */
    public final int m1132a(String str) {
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        m1136f(new PG1(this, str, binderC9218eF1, 2));
        Integer num = (Integer) BinderC9218eF1.m17887I(binderC9218eF1.m17888H(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: b */
    public final List m1133b(String str, String str2) {
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        m1136f(new TG1(this, str, str2, binderC9218eF1, 1));
        List list = (List) BinderC9218eF1.m17887I(binderC9218eF1.m17888H(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public final Map m1134c(String str, String str2, boolean z) {
        BinderC9218eF1 binderC9218eF1 = new BinderC9218eF1();
        m1136f(new LG1(this, str, str2, z, binderC9218eF1));
        Bundle bundleM17888H = binderC9218eF1.m17888H(5000L);
        if (bundleM17888H == null || bundleM17888H.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM17888H.size());
        for (String str3 : bundleM17888H.keySet()) {
            Object obj = bundleM17888H.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* renamed from: e */
    public final void m1135e(Exception exc, boolean z, boolean z2) {
        this.f1293g |= z;
        if (!z && z2) {
            m1136f(new PG1(this, "Error with data collection. Data lost.", exc));
        }
    }

    /* renamed from: f */
    public final void m1136f(AbstractRunnableC11650xG1 abstractRunnableC11650xG1) {
        this.f1289c.execute(abstractRunnableC11650xG1);
    }
}
