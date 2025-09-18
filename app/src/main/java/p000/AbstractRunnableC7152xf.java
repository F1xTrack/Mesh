package p000;

import android.os.Process;

/* renamed from: xf */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC7152xf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f45728a;

    /* renamed from: a */
    public abstract void mo18884a();

    /* renamed from: b */
    public abstract void mo19030b();

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f45728a) {
            case 0:
                Process.setThreadPriority(10);
                mo19030b();
                break;
            default:
                try {
                    mo18884a();
                    break;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
