package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* renamed from: z20, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11874z20 {

    /* renamed from: a */
    public static final /* synthetic */ int f46602a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objM7015b;
        try {
            objM7015b = new C11747y20(m26306a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        if (objM7015b instanceof OS0) {
            objM7015b = null;
        }
    }

    /* renamed from: a */
    public static final Handler m26306a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        O90.m5966d(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
