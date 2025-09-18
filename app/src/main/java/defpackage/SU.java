package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SU implements Executor {
    public static final SU a;
    public static final /* synthetic */ SU[] b;

    static {
        SU su = new SU("INSTANCE", 0);
        a = su;
        b = new SU[]{su};
    }

    public static SU valueOf(String str) {
        return (SU) Enum.valueOf(SU.class, str);
    }

    public static SU[] values() {
        return (SU[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
