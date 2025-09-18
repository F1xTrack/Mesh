package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: uL0 */
/* loaded from: classes.dex */
public final class C7394uL0 {
    public static ReactApplicationContext b;
    public static final ThreadPoolExecutor c;
    public static final ThreadPoolExecutor d;
    public static boolean e;
    public static final SparseArray f;
    public final C6363ox0 a;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, linkedBlockingQueue);
        new LinkedBlockingQueue();
        d = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, linkedBlockingQueue);
        e = false;
        f = new SparseArray();
    }

    public C7394uL0(ReactApplicationContext reactApplicationContext) {
        if (II1.e == null) {
            II1.e = new C6363ox0(II1.d());
        }
        C6363ox0 c6363ox0 = II1.e;
        this.a = c6363ox0;
        ((TJ0) ((InterfaceC5222iz) c6363ox0.j)).a = new G10(new C7620vX());
        b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new C6631qL0());
    }
}
