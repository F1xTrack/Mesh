package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RJ implements Executor {
    public static final RJ a;
    public static final /* synthetic */ RJ[] b;

    static {
        RJ rj = new RJ("INSTANCE", 0);
        a = rj;
        b = new RJ[]{rj};
    }

    public static RJ valueOf(String str) {
        return (RJ) Enum.valueOf(RJ.class, str);
    }

    public static RJ[] values() {
        return (RJ[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
