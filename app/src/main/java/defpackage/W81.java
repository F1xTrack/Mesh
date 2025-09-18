package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class W81 {
    public static final HashMap e = new HashMap();
    public final String a;
    public final int b;
    public final int c;
    public final V81 d = new RejectedExecutionHandler() { // from class: V81
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            W81 w81 = this.a;
            w81.getClass();
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
                return;
            }
            w81.b("", true).execute(runnable);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [V81] */
    public W81(String str) {
        this.a = str;
        HL0 hl0 = HL0.b;
        JSONObject jSONObject = hl0.a;
        this.b = jSONObject != null ? jSONObject.optInt("android_task_executor_maximum_pool_size", 1) : 1;
        JSONObject jSONObject2 = hl0.a;
        this.c = jSONObject2 != null ? jSONObject2.optInt("android_task_executor_keep_alive_seconds", 3) : 3;
    }

    public static void d(String str) {
        HashMap map = e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(str);
                if (executorService != null) {
                    executorService.shutdownNow();
                    map.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ExecutorService a() {
        return b("", this.b <= 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.concurrent.ExecutorService] */
    public final ExecutorService b(String str, boolean z) {
        ThreadPoolExecutor threadPoolExecutorNewSingleThreadExecutor;
        String strC = c(str, z);
        HashMap map = e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strC);
                if (executorService != null) {
                    return executorService;
                }
                if (z) {
                    threadPoolExecutorNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                } else {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.b, this.c, TimeUnit.SECONDS, new SynchronousQueue());
                    threadPoolExecutor.setRejectedExecutionHandler(this.d);
                    threadPoolExecutorNewSingleThreadExecutor = threadPoolExecutor;
                }
                map.put(strC, threadPoolExecutorNewSingleThreadExecutor);
                return threadPoolExecutorNewSingleThreadExecutor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String c(String str, boolean z) {
        String str2 = this.a;
        return z ? AbstractC1705Vq.h(str2, "TransactionalExecutor", str) : AbstractC1705Vq.h(str2, "Executor", str);
    }

    public final void e() {
        HashMap map = e;
        synchronized (map) {
            try {
                Iterator it = new ArrayList(map.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.startsWith(this.a)) {
                        d(str);
                    } else {
                        e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
