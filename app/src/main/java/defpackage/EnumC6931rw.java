package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6931rw {
    public static final EnumC6931rw a;
    public static final EnumC6931rw b;
    public static final EnumC6931rw c;
    public static final EnumC6931rw d;
    public static final /* synthetic */ EnumC6931rw[] e;

    static {
        EnumC6931rw enumC6931rw = new EnumC6931rw("ALWAYS_OVERRIDE", 0);
        a = enumC6931rw;
        EnumC6931rw enumC6931rw2 = new EnumC6931rw("HIGH_PRIORITY_REQUIRED", 1);
        b = enumC6931rw2;
        EnumC6931rw enumC6931rw3 = new EnumC6931rw("REQUIRED", 2);
        c = enumC6931rw3;
        EnumC6931rw enumC6931rw4 = new EnumC6931rw("OPTIONAL", 3);
        d = enumC6931rw4;
        e = new EnumC6931rw[]{enumC6931rw, enumC6931rw2, enumC6931rw3, enumC6931rw4};
    }

    public static EnumC6931rw valueOf(String str) {
        return (EnumC6931rw) Enum.valueOf(EnumC6931rw.class, str);
    }

    public static EnumC6931rw[] values() {
        return (EnumC6931rw[]) e.clone();
    }
}
