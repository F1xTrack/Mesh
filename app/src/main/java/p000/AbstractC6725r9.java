package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: r9 */
/* loaded from: classes.dex */
public abstract class AbstractC6725r9 {

    /* renamed from: a */
    public C10943rk0 f41356a;

    /* renamed from: b */
    public final Context f41357b;

    /* renamed from: c */
    public boolean f41358c = false;

    /* renamed from: d */
    public boolean f41359d = false;

    /* renamed from: e */
    public boolean f41360e = true;

    /* renamed from: f */
    public boolean f41361f = false;

    /* renamed from: g */
    public boolean f41362g = false;

    /* renamed from: h */
    public Executor f41363h;

    /* renamed from: i */
    public volatile RunnableC6662q9 f41364i;

    /* renamed from: j */
    public volatile RunnableC6662q9 f41365j;

    public AbstractC6725r9(Context context) {
        this.f41357b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m24163a() {
        if (this.f41364i != null) {
            boolean z = this.f41358c;
            if (!z) {
                if (z) {
                    m24165f();
                } else {
                    this.f41361f = true;
                }
            }
            if (this.f41365j != null) {
                this.f41364i.getClass();
                this.f41364i = null;
                return;
            }
            this.f41364i.getClass();
            RunnableC6662q9 runnableC6662q9 = this.f41364i;
            runnableC6662q9.f40632c.set(true);
            if (runnableC6662q9.f40630a.cancel(false)) {
                this.f41365j = this.f41364i;
                mo1580b();
            }
            this.f41364i = null;
        }
    }

    /* renamed from: c */
    public void mo1581c(Object obj) {
        C10943rk0 c10943rk0 = this.f41356a;
        if (c10943rk0 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c10943rk0.mo2439j(obj);
            } else {
                c10943rk0.m2440k(obj);
            }
        }
    }

    /* renamed from: d */
    public void mo1582d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(this.f41356a);
        if (this.f41358c || this.f41361f || this.f41362g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f41358c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f41361f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f41362g);
        }
        if (this.f41359d || this.f41360e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f41359d);
            printWriter.print(" mReset=");
            printWriter.println(this.f41360e);
        }
        if (this.f41364i != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f41364i);
            printWriter.print(" waiting=");
            this.f41364i.getClass();
            printWriter.println(false);
        }
        if (this.f41365j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f41365j);
            printWriter.print(" waiting=");
            this.f41365j.getClass();
            printWriter.println(false);
        }
    }

    /* renamed from: e */
    public final void m24164e() {
        if (this.f41365j != null || this.f41364i == null) {
            return;
        }
        this.f41364i.getClass();
        if (this.f41363h == null) {
            this.f41363h = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC6662q9 runnableC6662q9 = this.f41364i;
        Executor executor = this.f41363h;
        if (runnableC6662q9.f40631b == 1) {
            runnableC6662q9.f40631b = 2;
            executor.execute(runnableC6662q9.f40630a);
            return;
        }
        int iM26247x = AbstractC7222ym.m26247x(runnableC6662q9.f40631b);
        if (iM26247x == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iM26247x == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    /* renamed from: f */
    public final void m24165f() {
        m24163a();
        this.f41364i = new RunnableC6662q9(this);
        m24164e();
    }

    /* renamed from: g */
    public abstract Object mo1583g();

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }

    /* renamed from: b */
    public void mo1580b() {
    }

    /* renamed from: h */
    public void mo1584h(Object obj) {
    }
}
