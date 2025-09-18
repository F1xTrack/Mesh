package p000;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* renamed from: jm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9923jm0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35373a;

    /* renamed from: b */
    public final /* synthetic */ C10307mm0 f35374b;

    public /* synthetic */ RunnableC9923jm0(C10307mm0 c10307mm0, int i) {
        this.f35373a = i;
        this.f35374b = c10307mm0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35373a) {
            case 0:
                Drawable drawable = this.f35374b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                C10307mm0 c10307mm0 = this.f35374b;
                Semaphore semaphore = c10307mm0.f37881M;
                C4210hw c4210hw = c10307mm0.f37903q;
                if (c4210hw == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c4210hw.mo18918s(c10307mm0.f37888b.m25694a());
                    if (C10307mm0.f37866S && c10307mm0.f37879K) {
                        if (c10307mm0.f37882N == null) {
                            c10307mm0.f37882N = new Handler(Looper.getMainLooper());
                            c10307mm0.f37883O = new RunnableC9923jm0(c10307mm0, 0);
                        }
                        c10307mm0.f37882N.post(c10307mm0.f37883O);
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
