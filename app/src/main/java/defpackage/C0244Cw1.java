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

/* renamed from: Cw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244Cw1 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final C0085Av1 b;
    public boolean g;
    public final Intent h;
    public ZY0 l;
    public InterfaceC1407Ru1 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final C2228aw1 j = new C2228aw1(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "IntegrityService";
    public final WeakReference i = new WeakReference(null);

    public C0244Cw1(Context context, C0085Av1 c0085Av1, Intent intent) {
        this.a = context;
        this.b = c0085Av1;
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
