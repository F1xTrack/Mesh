package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RF1 implements Executor {

    /* renamed from: a */
    public static final RF1 f10096a;

    /* renamed from: b */
    public static final /* synthetic */ RF1[] f10097b;

    static {
        RF1 rf1 = new RF1("INSTANCE", 0);
        f10096a = rf1;
        f10097b = new RF1[]{rf1};
    }

    public static RF1[] values() {
        return (RF1[]) f10097b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
