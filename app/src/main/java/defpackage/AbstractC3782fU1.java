package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: fU1 */
/* loaded from: classes.dex */
public abstract class AbstractC3782fU1 {
    public static Object a(Task task) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.j()) {
            return i(task);
        }
        C6446pN0 c6446pN0 = new C6446pN0(14);
        Executor executor = Y81.b;
        task.e(executor, c6446pN0);
        task.d(executor, c6446pN0);
        task.a(executor, c6446pN0);
        ((CountDownLatch) c6446pN0.b).await();
        return i(task);
    }

    public static Object b(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return i(task);
        }
        C6446pN0 c6446pN0 = new C6446pN0(14);
        Executor executor = Y81.b;
        task.e(executor, c6446pN0);
        task.d(executor, c6446pN0);
        task.a(executor, c6446pN0);
        if (((CountDownLatch) c6446pN0.b).await(j, timeUnit)) {
            return i(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static C3892g32 c(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C3892g32 c3892g32 = new C3892g32();
        executor.execute(new RunnableC7990xT1(c3892g32, callable, false, 9));
        return c3892g32;
    }

    public static C3892g32 d(Exception exc) {
        C3892g32 c3892g32 = new C3892g32();
        c3892g32.o(exc);
        return c3892g32;
    }

    public static C3892g32 e(Object obj) {
        C3892g32 c3892g32 = new C3892g32();
        c3892g32.p(obj);
        return c3892g32;
    }

    public static Context f(Context context) {
        int iC;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iC = AbstractC1600Uh.c(context)) != AbstractC1600Uh.c(applicationContext)) {
            applicationContext = AbstractC1600Uh.a(applicationContext, iC);
        }
        if (i < 30) {
            return applicationContext;
        }
        String strB = AbstractC1495Sy.b(context);
        return !Objects.equals(strB, AbstractC1495Sy.b(applicationContext)) ? AbstractC1495Sy.a(applicationContext, strB) : applicationContext;
    }

    public static C3892g32 g(List list) {
        if (list == null || list.isEmpty()) {
            return e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C3892g32 c3892g32 = new C3892g32();
        C7893wy1 c7893wy1 = new C7893wy1(list.size(), c3892g32);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            TJ tj = Y81.b;
            task.e(tj, c7893wy1);
            task.d(tj, c7893wy1);
            task.a(tj, c7893wy1);
        }
        return c3892g32;
    }

    public static C3892g32 h(Task... taskArr) {
        if (taskArr.length == 0) {
            return e(Collections.emptyList());
        }
        List listAsList = Arrays.asList(taskArr);
        ExecutorC1054Nh executorC1054Nh = Y81.a;
        if (listAsList == null || listAsList.isEmpty()) {
            return e(Collections.emptyList());
        }
        List list = listAsList;
        return g(list).g(executorC1054Nh, new L21(list));
    }

    public static Object i(Task task) throws ExecutionException {
        if (task.k()) {
            return task.i();
        }
        if (((C3892g32) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.h());
    }
}
