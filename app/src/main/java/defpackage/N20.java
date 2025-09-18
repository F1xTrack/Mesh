package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class N20 {
    public static final WeakHashMap g = new WeakHashMap();
    public final WeakReference a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final AtomicInteger c = new AtomicInteger(0);
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final SparseArray f = new SparseArray();

    public N20(ReactContext reactContext) {
        this.a = new WeakReference(reactContext);
    }

    public static N20 c(ReactContext reactContext) {
        WeakHashMap weakHashMap = g;
        N20 n20 = (N20) weakHashMap.get(reactContext);
        if (n20 != null) {
            return n20;
        }
        N20 n202 = new N20(reactContext);
        weakHashMap.put(reactContext, n202);
        return n202;
    }

    public final synchronized void a(O20 o20) {
        this.b.add(o20);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            o20.onHeadlessJsTaskStart(((Integer) it.next()).intValue());
        }
    }

    public final synchronized void b(int i) {
        boolean zRemove = this.d.remove(Integer.valueOf(i));
        this.e.remove(Integer.valueOf(i));
        SparseArray sparseArray = this.f;
        Runnable runnable = (Runnable) sparseArray.get(i);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            sparseArray.remove(i);
        }
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new RunnableC0677Il(this, i, 1));
        }
    }

    public final synchronized boolean d(int i) {
        return this.d.contains(Integer.valueOf(i));
    }

    public final synchronized void e(M20 m20, int i) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) this.a.get();
            UN1.d(reactContext, "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.c && !m20.d) {
                throw new IllegalStateException("Tried to start task " + m20.a + " while in foreground, but this is not allowed.");
            }
            this.d.add(Integer.valueOf(i));
            this.e.put(Integer.valueOf(i), new M20(m20));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i, m20.a, m20.b);
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            long j = m20.c;
            if (j > 0) {
                RunnableC5338ja runnableC5338ja = new RunnableC5338ja(this, i, 7);
                this.f.append(i, runnableC5338ja);
                UiThreadUtil.runOnUiThread(runnableC5338ja, j);
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((O20) it.next()).onHeadlessJsTaskStart(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
