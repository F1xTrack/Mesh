package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8014xb1 {
    public static final EnumC8014xb1 a;
    public static final EnumC8014xb1 b;
    public static final /* synthetic */ EnumC8014xb1[] c;

    static {
        EnumC8014xb1 enumC8014xb1 = new EnumC8014xb1("SELF", 0);
        a = enumC8014xb1;
        EnumC8014xb1 enumC8014xb12 = new EnumC8014xb1("CHILD", 1);
        b = enumC8014xb12;
        c = new EnumC8014xb1[]{enumC8014xb1, enumC8014xb12};
    }

    public static EnumC8014xb1 valueOf(String str) {
        return (EnumC8014xb1) Enum.valueOf(EnumC8014xb1.class, str);
    }

    public static EnumC8014xb1[] values() {
        return (EnumC8014xb1[]) c.clone();
    }
}
