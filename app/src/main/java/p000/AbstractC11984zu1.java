package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11984zu1 {

    /* renamed from: a */
    public static SharedPreferences f47091a;

    /* renamed from: b */
    public static final ExecutorC1215TJ f47092b = new ExecutorC1215TJ(7);

    /* renamed from: c */
    public static final ExecutorC1215TJ f47093c = new ExecutorC1215TJ(8);

    /* renamed from: a */
    public static synchronized SharedPreferences m26587a(Context context) {
        try {
            if (f47091a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    f47091a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                } else {
                    f47091a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47091a;
    }

    /* renamed from: b */
    public static void m26588b(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* renamed from: c */
    public static void m26589c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
