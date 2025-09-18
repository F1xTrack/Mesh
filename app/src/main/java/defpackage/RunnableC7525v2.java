package defpackage;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7525v2 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ RunnableC7525v2(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                this.b.run();
                break;
            case 1:
                try {
                    this.b.run();
                    break;
                } catch (Exception unused) {
                    AbstractC0837Km0.b("Executor");
                    return;
                }
            case 2:
                this.b.run();
                break;
            case 3:
                this.b.run();
                break;
            case 4:
                Deque deque = (Deque) C3471ds0.b.get();
                Preconditions.checkNotNull(deque);
                Runnable runnable = this.b;
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
                C3471ds0.b.set(new ArrayDeque());
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
