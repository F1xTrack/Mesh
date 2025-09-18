package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Xk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1844Xk0 {
    public static final EnumC1844Xk0 a;
    public static final EnumC1844Xk0 b;
    public static final EnumC1844Xk0 c;
    public static final /* synthetic */ EnumC1844Xk0[] d;

    static {
        EnumC1844Xk0 enumC1844Xk0 = new EnumC1844Xk0("NOT_COMPUTED", 0);
        a = enumC1844Xk0;
        EnumC1844Xk0 enumC1844Xk02 = new EnumC1844Xk0("COMPUTING", 1);
        b = enumC1844Xk02;
        EnumC1844Xk0 enumC1844Xk03 = new EnumC1844Xk0("RECURSION_WAS_DETECTED", 2);
        c = enumC1844Xk03;
        d = new EnumC1844Xk0[]{enumC1844Xk0, enumC1844Xk02, enumC1844Xk03};
    }

    public static EnumC1844Xk0 valueOf(String str) {
        return (EnumC1844Xk0) Enum.valueOf(EnumC1844Xk0.class, str);
    }

    public static EnumC1844Xk0[] values() {
        return (EnumC1844Xk0[]) d.clone();
    }
}
