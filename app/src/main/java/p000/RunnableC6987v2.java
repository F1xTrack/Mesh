package p000;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: v2 */
/* loaded from: classes.dex */
public final class RunnableC6987v2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44105a;

    /* renamed from: b */
    public final Runnable f44106b;

    public /* synthetic */ RunnableC6987v2(Runnable runnable, int i) {
        this.f44105a = i;
        this.f44106b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f44105a) {
            case 0:
                Process.setThreadPriority(10);
                this.f44106b.run();
                break;
            case 1:
                try {
                    this.f44106b.run();
                    break;
                } catch (Exception unused) {
                    AbstractC7858Km0.m4712b("Executor");
                    return;
                }
            case 2:
                this.f44106b.run();
                break;
            case 3:
                this.f44106b.run();
                break;
            case 4:
                Deque deque = (Deque) C9167ds0.f26346b.get();
                Preconditions.checkNotNull(deque);
                Runnable runnable = this.f44106b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                C9167ds0.f26346b.set(new ArrayDeque());
                this.f44106b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f44105a) {
            case 2:
                return this.f44106b.toString();
            default:
                return super.toString();
        }
    }
}
