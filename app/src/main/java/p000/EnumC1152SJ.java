package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: SJ */
/* loaded from: classes.dex */
public final class EnumC1152SJ implements Executor {

    /* renamed from: a */
    public static final EnumC1152SJ f10681a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1152SJ[] f10682b;

    static {
        EnumC1152SJ enumC1152SJ = new EnumC1152SJ("INSTANCE", 0);
        f10681a = enumC1152SJ;
        f10682b = new EnumC1152SJ[]{enumC1152SJ};
    }

    public static EnumC1152SJ valueOf(String str) {
        return (EnumC1152SJ) Enum.valueOf(EnumC1152SJ.class, str);
    }

    public static EnumC1152SJ[] values() {
        return (EnumC1152SJ[]) f10682b.clone();
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
