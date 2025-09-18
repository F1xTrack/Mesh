package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class LG extends XT1 {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new ThreadFactoryC4180ha(2));
    public volatile Handler c;

    public static Handler c(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return KG.a(looper);
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
