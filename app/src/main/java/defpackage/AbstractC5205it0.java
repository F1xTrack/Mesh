package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: it0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5205it0 {
    public static final ExecutorC4096h8 a = new ExecutorC4096h8(2);

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static C3892g32 b(Task task, C3892g32 c3892g32) {
        G10 g10 = new G10(7);
        S81 s81 = new S81((FA1) g10.b);
        C4290i9 c4290i9 = new C4290i9(s81, new AtomicBoolean(false), g10, 3);
        ExecutorC4096h8 executorC4096h8 = a;
        task.g(executorC4096h8, c4290i9);
        c3892g32.g(executorC4096h8, c4290i9);
        return s81.a;
    }
}
