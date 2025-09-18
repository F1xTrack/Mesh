package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* renamed from: jm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5375jm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5948mm0 b;

    public /* synthetic */ RunnableC5375jm0(C5948mm0 c5948mm0, int i) {
        this.a = i;
        this.b = c5948mm0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Drawable drawable = this.b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                C5948mm0 c5948mm0 = this.b;
                Semaphore semaphore = c5948mm0.M;
                C4246hw c4246hw = c5948mm0.q;
                if (c4246hw == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4246hw.s(c5948mm0.b.a());
                    if (C5948mm0.S && c5948mm0.K) {
                        if (c5948mm0.N == null) {
                            c5948mm0.N = new Handler(Looper.getMainLooper());
                            c5948mm0.O = new RunnableC5375jm0(c5948mm0, 0);
                        }
                        c5948mm0.N.post(c5948mm0.O);
                    }
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
