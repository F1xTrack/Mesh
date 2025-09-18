package defpackage;

import android.os.Process;

/* renamed from: xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC8024xf implements Runnable {
    public final /* synthetic */ int a;

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                b();
                break;
            default:
                try {
                    a();
                    break;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
