package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: r9 */
/* loaded from: classes.dex */
public abstract class AbstractC6784r9 {
    public C6896rk0 a;
    public final Context b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public Executor h;
    public volatile RunnableC6594q9 i;
    public volatile RunnableC6594q9 j;

    public AbstractC6784r9(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a() {
        if (this.i != null) {
            boolean z = this.c;
            if (!z) {
                if (z) {
                    f();
                } else {
                    this.f = true;
                }
            }
            if (this.j != null) {
                this.i.getClass();
                this.i = null;
                return;
            }
            this.i.getClass();
            RunnableC6594q9 runnableC6594q9 = this.i;
            runnableC6594q9.c.set(true);
            if (runnableC6594q9.a.cancel(false)) {
                this.j = this.i;
                b();
            }
            this.i = null;
        }
    }

    public void c(Object obj) {
        C6896rk0 c6896rk0 = this.a;
        if (c6896rk0 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c6896rk0.j(obj);
            } else {
                c6896rk0.k(obj);
            }
        }
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(this.a);
        if (this.c || this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.g);
        }
        if (this.d || this.e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.d);
            printWriter.print(" mReset=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.i);
            printWriter.print(" waiting=");
            this.i.getClass();
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            this.j.getClass();
            printWriter.println(false);
        }
    }

    public final void e() {
        if (this.j != null || this.i == null) {
            return;
        }
        this.i.getClass();
        if (this.h == null) {
            this.h = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC6594q9 runnableC6594q9 = this.i;
        Executor executor = this.h;
        if (runnableC6594q9.b == 1) {
            runnableC6594q9.b = 2;
            executor.execute(runnableC6594q9.a);
            return;
        }
        int iX = AbstractC8235ym.x(runnableC6594q9.b);
        if (iX == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iX == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void f() {
        a();
        this.i = new RunnableC6594q9(this);
        e();
    }

    public abstract Object g();

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }

    public void b() {
    }

    public void h(Object obj) {
    }
}
