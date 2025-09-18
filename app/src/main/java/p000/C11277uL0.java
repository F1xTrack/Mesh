package p000;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: uL0 */
/* loaded from: classes.dex */
public final class C11277uL0 {

    /* renamed from: b */
    public static ReactApplicationContext f43672b;

    /* renamed from: c */
    public static final ThreadPoolExecutor f43673c;

    /* renamed from: d */
    public static final ThreadPoolExecutor f43674d;

    /* renamed from: e */
    public static boolean f43675e;

    /* renamed from: f */
    public static final SparseArray f43676f;

    /* renamed from: a */
    public final C10585ox0 f43677a;

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f43673c = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, linkedBlockingQueue);
        new LinkedBlockingQueue();
        f43674d = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, linkedBlockingQueue);
        f43675e = false;
        f43676f = new SparseArray();
    }

    public C11277uL0(ReactApplicationContext reactApplicationContext) {
        if (II1.f4888e == null) {
            II1.f4888e = new C10585ox0(II1.m3810d());
        }
        C10585ox0 c10585ox0 = II1.f4888e;
        this.f43677a = c10585ox0;
        ((TJ0) ((InterfaceC6208iz) c10585ox0.f39380j)).f11322a = new G10(new C7018vX());
        f43672b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new C10765qL0());
    }
}
