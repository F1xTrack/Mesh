package p000;

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

    /* renamed from: e */
    public static final HashMap f13008e = new HashMap();

    /* renamed from: a */
    public final String f13009a;

    /* renamed from: b */
    public final int f13010b;

    /* renamed from: c */
    public final int f13011c;

    /* renamed from: d */
    public final V81 f13012d = new RejectedExecutionHandler() { // from class: V81
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            W81 w81 = this.f12389a;
            w81.getClass();
            if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
                return;
            }
            w81.m8686b("", true).execute(runnable);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [V81] */
    public W81(String str) {
        this.f13009a = str;
        HL0 hl0 = HL0.f4233b;
        JSONObject jSONObject = hl0.f4234a;
        this.f13010b = jSONObject != null ? jSONObject.optInt("android_task_executor_maximum_pool_size", 1) : 1;
        JSONObject jSONObject2 = hl0.f4234a;
        this.f13011c = jSONObject2 != null ? jSONObject2.optInt("android_task_executor_keep_alive_seconds", 3) : 3;
    }

    /* renamed from: d */
    public static void m8684d(String str) {
        HashMap map = f13008e;
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

    /* renamed from: a */
    public final ExecutorService m8685a() {
        return m8686b("", this.f13010b <= 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.concurrent.ExecutorService] */
    /* renamed from: b */
    public final ExecutorService m8686b(String str, boolean z) {
        ThreadPoolExecutor threadPoolExecutorNewSingleThreadExecutor;
        String strM8687c = m8687c(str, z);
        HashMap map = f13008e;
        synchronized (map) {
            try {
                ExecutorService executorService = (ExecutorService) map.get(strM8687c);
                if (executorService != null) {
                    return executorService;
                }
                if (z) {
                    threadPoolExecutorNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                } else {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f13010b, this.f13011c, TimeUnit.SECONDS, new SynchronousQueue());
                    threadPoolExecutor.setRejectedExecutionHandler(this.f13012d);
                    threadPoolExecutorNewSingleThreadExecutor = threadPoolExecutor;
                }
                map.put(strM8687c, threadPoolExecutorNewSingleThreadExecutor);
                return threadPoolExecutorNewSingleThreadExecutor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final String m8687c(String str, boolean z) {
        String str2 = this.f13009a;
        return z ? AbstractC1374Vq.m8589h(str2, "TransactionalExecutor", str) : AbstractC1374Vq.m8589h(str2, "Executor", str);
    }

    /* renamed from: e */
    public final void m8688e() {
        HashMap map = f13008e;
        synchronized (map) {
            try {
                Iterator it = new ArrayList(map.keySet()).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.startsWith(this.f13009a)) {
                        m8684d(str);
                    } else {
                        f13008e.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
