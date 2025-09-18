package com.huawei.hms.opendevice;

/* renamed from: com.huawei.hms.opendevice.o */
/* loaded from: classes.dex */
public class RunnableC2211o implements Runnable {

    /* renamed from: a */
    private final Runnable f19348a;

    public RunnableC2211o(Runnable runnable) {
        this.f19348a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f19348a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }
}
