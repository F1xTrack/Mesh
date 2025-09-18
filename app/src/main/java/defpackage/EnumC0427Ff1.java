package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ff1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0427Ff1 implements Executor {
    public static final EnumC0427Ff1 a;
    public static final Handler b;
    public static final /* synthetic */ EnumC0427Ff1[] c;

    static {
        EnumC0427Ff1 enumC0427Ff1 = new EnumC0427Ff1("INSTANCE", 0);
        a = enumC0427Ff1;
        c = new EnumC0427Ff1[]{enumC0427Ff1};
        b = new Handler(Looper.getMainLooper());
    }

    public static EnumC0427Ff1 valueOf(String str) {
        return (EnumC0427Ff1) Enum.valueOf(EnumC0427Ff1.class, str);
    }

    public static EnumC0427Ff1[] values() {
        return (EnumC0427Ff1[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
