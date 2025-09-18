package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: it0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9809it0 {

    /* renamed from: a */
    public static final ExecutorC4160h8 f34793a = new ExecutorC4160h8(2);

    /* renamed from: a */
    public static int m21935a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static C9450g32 m21936b(Task task, C9450g32 c9450g32) {
        G10 g10 = new G10(7);
        S81 s81 = new S81((FA1) g10.f3531b);
        C4224i9 c4224i9 = new C4224i9(s81, new AtomicBoolean(false), g10, 3);
        ExecutorC4160h8 executorC4160h8 = f34793a;
        task.mo11140g(executorC4160h8, c4224i9);
        c9450g32.mo11140g(executorC4160h8, c4224i9);
        return s81.f10598a;
    }
}
