package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: SU */
/* loaded from: classes.dex */
public final class EnumC1163SU implements Executor {

    /* renamed from: a */
    public static final EnumC1163SU f10807a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1163SU[] f10808b;

    static {
        EnumC1163SU enumC1163SU = new EnumC1163SU("INSTANCE", 0);
        f10807a = enumC1163SU;
        f10808b = new EnumC1163SU[]{enumC1163SU};
    }

    public static EnumC1163SU valueOf(String str) {
        return (EnumC1163SU) Enum.valueOf(EnumC1163SU.class, str);
    }

    public static EnumC1163SU[] values() {
        return (EnumC1163SU[]) f10808b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
