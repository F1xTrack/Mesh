package p000;

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

    /* renamed from: g */
    public static final WeakHashMap f7468g = new WeakHashMap();

    /* renamed from: a */
    public final WeakReference f7469a;

    /* renamed from: b */
    public final CopyOnWriteArraySet f7470b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final AtomicInteger f7471c = new AtomicInteger(0);

    /* renamed from: d */
    public final CopyOnWriteArraySet f7472d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public final ConcurrentHashMap f7473e = new ConcurrentHashMap();

    /* renamed from: f */
    public final SparseArray f7474f = new SparseArray();

    public N20(ReactContext reactContext) {
        this.f7469a = new WeakReference(reactContext);
    }

    /* renamed from: c */
    public static N20 m5523c(ReactContext reactContext) {
        WeakHashMap weakHashMap = f7468g;
        N20 n20 = (N20) weakHashMap.get(reactContext);
        if (n20 != null) {
            return n20;
        }
        N20 n202 = new N20(reactContext);
        weakHashMap.put(reactContext, n202);
        return n202;
    }

    /* renamed from: a */
    public final synchronized void m5524a(O20 o20) {
        this.f7470b.add(o20);
        Iterator it = this.f7472d.iterator();
        while (it.hasNext()) {
            o20.onHeadlessJsTaskStart(((Integer) it.next()).intValue());
        }
    }

    /* renamed from: b */
    public final synchronized void m5525b(int i) {
        boolean zRemove = this.f7472d.remove(Integer.valueOf(i));
        this.f7473e.remove(Integer.valueOf(i));
        SparseArray sparseArray = this.f7474f;
        Runnable runnable = (Runnable) sparseArray.get(i);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            sparseArray.remove(i);
        }
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new RunnableC0552Il(this, i, 1));
        }
    }

    /* renamed from: d */
    public final synchronized boolean m5526d(int i) {
        return this.f7472d.contains(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final synchronized void m5527e(M20 m20, int i) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) this.f7469a.get();
            UN1.m8000d(reactContext, "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.f17893c && !m20.f6975d) {
                throw new IllegalStateException("Tried to start task " + m20.f6972a + " while in foreground, but this is not allowed.");
            }
            this.f7472d.add(Integer.valueOf(i));
            this.f7473e.put(Integer.valueOf(i), new M20(m20));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i, m20.f6972a, m20.f6973b);
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            long j = m20.f6974c;
            if (j > 0) {
                RunnableC6246ja runnableC6246ja = new RunnableC6246ja(this, i, 7);
                this.f7474f.append(i, runnableC6246ja);
                UiThreadUtil.runOnUiThread(runnableC6246ja, j);
            }
            Iterator it = this.f7470b.iterator();
            while (it.hasNext()) {
                ((O20) it.next()).onHeadlessJsTaskStart(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
