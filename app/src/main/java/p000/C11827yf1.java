package p000;

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
public final class C11827yf1 {

    /* renamed from: z */
    public static final /* synthetic */ int f46383z = 0;

    /* renamed from: b */
    public final C11856yu0 f46385b;

    /* renamed from: e */
    public final C10422nf1 f46388e;

    /* renamed from: f */
    public final ReactApplicationContext f46389f;

    /* renamed from: n */
    public long f46397n;

    /* renamed from: o */
    public long f46398o;

    /* renamed from: p */
    public long f46399p;

    /* renamed from: q */
    public long f46400q;

    /* renamed from: r */
    public long f46401r;

    /* renamed from: s */
    public long f46402s;

    /* renamed from: t */
    public long f46403t;

    /* renamed from: u */
    public long f46404u;

    /* renamed from: v */
    public long f46405v;

    /* renamed from: w */
    public long f46406w;

    /* renamed from: x */
    public long f46407x;

    /* renamed from: y */
    public long f46408y;

    /* renamed from: a */
    public final int[] f46384a = new int[4];

    /* renamed from: c */
    public final Object f46386c = new Object();

    /* renamed from: d */
    public final Object f46387d = new Object();

    /* renamed from: g */
    public ArrayList f46390g = new ArrayList();

    /* renamed from: h */
    public ArrayList f46391h = new ArrayList();

    /* renamed from: i */
    public ArrayList f46392i = new ArrayList();

    /* renamed from: j */
    public ArrayDeque f46393j = new ArrayDeque();

    /* renamed from: k */
    public boolean f46394k = false;

    /* renamed from: l */
    public boolean f46395l = false;

    /* renamed from: m */
    public boolean f46396m = false;

    public C11827yf1(ReactApplicationContext reactApplicationContext, C11856yu0 c11856yu0, int i) {
        this.f46385b = c11856yu0;
        this.f46388e = new C10422nf1(this, reactApplicationContext, i == -1 ? 8 : i);
        this.f46389f = reactApplicationContext;
    }

    /* renamed from: a */
    public final void m26212a(int i, long j, long j2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayDeque arrayDeque;
        new ArrayList().add("batchId: " + String.valueOf(i));
        MT1.m5371b("UIViewOperationQueue.dispatchViewUpdates".concat(""));
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            if (this.f46390g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = this.f46390g;
                this.f46390g = new ArrayList();
                arrayList = arrayList3;
            }
            if (this.f46391h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList arrayList4 = this.f46391h;
                this.f46391h = new ArrayList();
                arrayList2 = arrayList4;
            }
            synchronized (this.f46387d) {
                try {
                    if (this.f46393j.isEmpty()) {
                        arrayDeque = null;
                    } else {
                        ArrayDeque arrayDeque2 = this.f46393j;
                        this.f46393j = new ArrayDeque();
                        arrayDeque = arrayDeque2;
                    }
                } finally {
                }
            }
            RunnableC9526gf1 runnableC9526gf1 = new RunnableC9526gf1(this, i, arrayList, arrayDeque, arrayList2, j, j2, jUptimeMillis, jCurrentThreadTimeMillis);
            new ArrayList().add("batchId: " + String.valueOf(i));
            MT1.m5371b("acquiring mDispatchRunnablesLock".concat(""));
            synchronized (this.f46386c) {
                Trace.endSection();
                this.f46392i.add(runnableC9526gf1);
            }
            if (!this.f46394k) {
                UiThreadUtil.runOnUiThread(new C0446H4(this, this.f46389f));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m26213b(S91 s91, int i, String str, NM0 nm0) {
        synchronized (this.f46387d) {
            this.f46407x++;
            this.f46393j.addLast(new C9910jf1(this, s91, i, str, nm0));
        }
    }

    /* renamed from: c */
    public final void m26214c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f46395l) {
            AbstractC3929dS.m17683p("ReactNative");
            return;
        }
        synchronized (this.f46386c) {
            if (this.f46392i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.f46392i;
            this.f46392i = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.f46396m) {
                this.f46404u = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f46405v = this.f46397n;
                this.f46396m = false;
                MT1.m5370a(0, "batchedExecutionTime");
                MT1.m5372c(0, "batchedExecutionTime");
            }
            this.f46397n = 0L;
        }
    }
}
