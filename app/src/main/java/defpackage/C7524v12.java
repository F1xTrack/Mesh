package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7524v12 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final C6845rT0 b;
    public boolean g;
    public final Intent h;
    public ZY0 l;
    public InterfaceC2108aI1 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final C2228aw1 j = new C2228aw1(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public C7524v12(Context context, C6845rT0 c6845rT0, Intent intent) {
        this.a = context;
        this.b = c6845rT0;
        this.h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((S81) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
