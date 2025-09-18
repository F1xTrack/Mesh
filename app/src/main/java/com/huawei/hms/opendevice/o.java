package com.huawei.hms.opendevice;

/* loaded from: classes.dex */
public class o implements Runnable {
    private final Runnable a;

    public o(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }
}
