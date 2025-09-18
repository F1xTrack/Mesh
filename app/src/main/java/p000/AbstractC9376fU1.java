package p000;

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
public abstract class AbstractC9376fU1 {
    /* renamed from: a */
    public static Object m18240a(Task task) {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.mo11143j()) {
            return m18248i(task);
        }
        C10641pN0 c10641pN0 = new C10641pN0(14);
        Executor executor = Y81.f14172b;
        task.mo11138e(executor, c10641pN0);
        task.mo11137d(executor, c10641pN0);
        task.mo11134a(executor, c10641pN0);
        ((CountDownLatch) c10641pN0.f40042b).await();
        return m18248i(task);
    }

    /* renamed from: b */
    public static Object m18241b(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotGoogleApiHandlerThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.mo11143j()) {
            return m18248i(task);
        }
        C10641pN0 c10641pN0 = new C10641pN0(14);
        Executor executor = Y81.f14172b;
        task.mo11138e(executor, c10641pN0);
        task.mo11137d(executor, c10641pN0);
        task.mo11134a(executor, c10641pN0);
        if (((CountDownLatch) c10641pN0.f40042b).await(j, timeUnit)) {
            return m18248i(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static C9450g32 m18242c(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C9450g32 c9450g32 = new C9450g32();
        executor.execute(new RunnableC11676xT1(c9450g32, callable, false, 9));
        return c9450g32;
    }

    /* renamed from: d */
    public static C9450g32 m18243d(Exception exc) {
        C9450g32 c9450g32 = new C9450g32();
        c9450g32.m18388o(exc);
        return c9450g32;
    }

    /* renamed from: e */
    public static C9450g32 m18244e(Object obj) {
        C9450g32 c9450g32 = new C9450g32();
        c9450g32.m18389p(obj);
        return c9450g32;
    }

    /* renamed from: f */
    public static Context m18245f(Context context) {
        int iM8117c;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iM8117c = AbstractC1302Uh.m8117c(context)) != AbstractC1302Uh.m8117c(applicationContext)) {
            applicationContext = AbstractC1302Uh.m8115a(applicationContext, iM8117c);
        }
        if (i < 30) {
            return applicationContext;
        }
        String strM7476b = AbstractC1193Sy.m7476b(context);
        return !Objects.equals(strM7476b, AbstractC1193Sy.m7476b(applicationContext)) ? AbstractC1193Sy.m7475a(applicationContext, strM7476b) : applicationContext;
    }

    /* renamed from: g */
    public static C9450g32 m18246g(List list) {
        if (list == null || list.isEmpty()) {
            return m18244e(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C9450g32 c9450g32 = new C9450g32();
        C11611wy1 c11611wy1 = new C11611wy1(list.size(), c9450g32);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            ExecutorC1215TJ executorC1215TJ = Y81.f14172b;
            task.mo11138e(executorC1215TJ, c11611wy1);
            task.mo11137d(executorC1215TJ, c11611wy1);
            task.mo11134a(executorC1215TJ, c11611wy1);
        }
        return c9450g32;
    }

    /* renamed from: h */
    public static C9450g32 m18247h(Task... taskArr) {
        if (taskArr.length == 0) {
            return m18244e(Collections.emptyList());
        }
        List listAsList = Arrays.asList(taskArr);
        ExecutorC0862Nh executorC0862Nh = Y81.f14171a;
        if (listAsList == null || listAsList.isEmpty()) {
            return m18244e(Collections.emptyList());
        }
        List list = listAsList;
        return m18246g(list).mo11140g(executorC0862Nh, new L21(list));
    }

    /* renamed from: i */
    public static Object m18248i(Task task) throws ExecutionException {
        if (task.mo11144k()) {
            return task.mo11142i();
        }
        if (((C9450g32) task).f27546d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo11141h());
    }
}
