package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ff1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7585Ff1 implements Executor {

    /* renamed from: a */
    public static final EnumC7585Ff1 f3379a;

    /* renamed from: b */
    public static final Handler f3380b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC7585Ff1[] f3381c;

    static {
        EnumC7585Ff1 enumC7585Ff1 = new EnumC7585Ff1("INSTANCE", 0);
        f3379a = enumC7585Ff1;
        f3381c = new EnumC7585Ff1[]{enumC7585Ff1};
        f3380b = new Handler(Looper.getMainLooper());
    }

    public static EnumC7585Ff1 valueOf(String str) {
        return (EnumC7585Ff1) Enum.valueOf(EnumC7585Ff1.class, str);
    }

    public static EnumC7585Ff1[] values() {
        return (EnumC7585Ff1[]) f3381c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f3380b.post(runnable);
    }
}
