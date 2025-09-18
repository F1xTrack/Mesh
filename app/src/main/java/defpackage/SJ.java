package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SJ implements Executor {
    public static final SJ a;
    public static final /* synthetic */ SJ[] b;

    static {
        SJ sj = new SJ("INSTANCE", 0);
        a = sj;
        b = new SJ[]{sj};
    }

    public static SJ valueOf(String str) {
        return (SJ) Enum.valueOf(SJ.class, str);
    }

    public static SJ[] values() {
        return (SJ[]) b.clone();
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
