package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: LG */
/* loaded from: classes.dex */
public final class C0710LG extends XT1 {

    /* renamed from: a */
    public final Object f6581a = new Object();

    /* renamed from: b */
    public final ExecutorService f6582b = Executors.newFixedThreadPool(4, new ThreadFactoryC4188ha(2));

    /* renamed from: c */
    public volatile Handler f6583c;

    /* renamed from: c */
    public static Handler m4939c(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0647KG.m4588a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
