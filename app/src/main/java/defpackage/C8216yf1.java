package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yf1 */
/* loaded from: classes.dex */
public final class C8216yf1 {
    public static final /* synthetic */ int z = 0;
    public final C8260yu0 b;
    public final C6119nf1 e;
    public final ReactApplicationContext f;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public final int[] a = new int[4];
    public final Object c = new Object();
    public final Object d = new Object();
    public ArrayList g = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public ArrayDeque j = new ArrayDeque();
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public C8216yf1(ReactApplicationContext reactApplicationContext, C8260yu0 c8260yu0, int i) {
        this.b = c8260yu0;
        this.e = new C6119nf1(this, reactApplicationContext, i == -1 ? 8 : i);
        this.f = reactApplicationContext;
    }

    public final void a(int i, long j, long j2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayDeque arrayDeque;
        new ArrayList().add("batchId: " + String.valueOf(i));
        MT1.b("UIViewOperationQueue.dispatchViewUpdates".concat(""));
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (this.g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = this.g;
                this.g = new ArrayList();
                arrayList = arrayList3;
            }
            if (this.h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList arrayList4 = this.h;
                this.h = new ArrayList();
                arrayList2 = arrayList4;
            }
            synchronized (this.d) {
                try {
                    if (this.j.isEmpty()) {
                        arrayDeque = null;
                    } else {
                        ArrayDeque arrayDeque2 = this.j;
                        this.j = new ArrayDeque();
                        arrayDeque = arrayDeque2;
                    }
                } finally {
                }
            }
            RunnableC4006gf1 runnableC4006gf1 = new RunnableC4006gf1(this, i, arrayList, arrayDeque, arrayList2, j, j2, jUptimeMillis, jCurrentThreadTimeMillis);
            new ArrayList().add("batchId: " + String.valueOf(i));
            MT1.b("acquiring mDispatchRunnablesLock".concat(""));
            synchronized (this.c) {
                Trace.endSection();
                this.i.add(runnableC4006gf1);
            }
            if (!this.k) {
                UiThreadUtil.runOnUiThread(new H4(this, this.f));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void b(S91 s91, int i, String str, NM0 nm0) {
        synchronized (this.d) {
            this.x++;
            this.j.addLast(new C5355jf1(this, s91, i, str, nm0));
        }
    }

    public final void c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.l) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        synchronized (this.c) {
            if (this.i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.i;
            this.i = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.m) {
                this.u = SystemClock.uptimeMillis() - jUptimeMillis;
                this.v = this.n;
                this.m = false;
                MT1.a(0, "batchedExecutionTime");
                MT1.c(0, "batchedExecutionTime");
            }
            this.n = 0L;
        }
    }
}
