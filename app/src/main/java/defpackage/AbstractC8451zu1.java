package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: zu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8451zu1 {
    public static SharedPreferences a;
    public static final TJ b = new TJ(7);
    public static final TJ c = new TJ(8);

    public static synchronized SharedPreferences a(Context context) {
        try {
            if (a == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                } else {
                    a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static void b(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void c(ExecutorService executorService) {
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
