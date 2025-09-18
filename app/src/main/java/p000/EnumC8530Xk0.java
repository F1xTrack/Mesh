package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Xk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8530Xk0 {

    /* renamed from: a */
    public static final EnumC8530Xk0 f13942a;

    /* renamed from: b */
    public static final EnumC8530Xk0 f13943b;

    /* renamed from: c */
    public static final EnumC8530Xk0 f13944c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC8530Xk0[] f13945d;

    static {
        EnumC8530Xk0 enumC8530Xk0 = new EnumC8530Xk0("NOT_COMPUTED", 0);
        f13942a = enumC8530Xk0;
        EnumC8530Xk0 enumC8530Xk02 = new EnumC8530Xk0("COMPUTING", 1);
        f13943b = enumC8530Xk02;
        EnumC8530Xk0 enumC8530Xk03 = new EnumC8530Xk0("RECURSION_WAS_DETECTED", 2);
        f13944c = enumC8530Xk03;
        f13945d = new EnumC8530Xk0[]{enumC8530Xk0, enumC8530Xk02, enumC8530Xk03};
    }

    public static EnumC8530Xk0 valueOf(String str) {
        return (EnumC8530Xk0) Enum.valueOf(EnumC8530Xk0.class, str);
    }

    public static EnumC8530Xk0[] values() {
        return (EnumC8530Xk0[]) f13945d.clone();
    }
}
