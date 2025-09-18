package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: RJ */
/* loaded from: classes.dex */
public final class EnumC1089RJ implements Executor {

    /* renamed from: a */
    public static final EnumC1089RJ f10118a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1089RJ[] f10119b;

    static {
        EnumC1089RJ enumC1089RJ = new EnumC1089RJ("INSTANCE", 0);
        f10118a = enumC1089RJ;
        f10119b = new EnumC1089RJ[]{enumC1089RJ};
    }

    public static EnumC1089RJ valueOf(String str) {
        return (EnumC1089RJ) Enum.valueOf(EnumC1089RJ.class, str);
    }

    public static EnumC1089RJ[] values() {
        return (EnumC1089RJ[]) f10119b.clone();
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
