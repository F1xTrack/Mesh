package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8290z3 {
    public static final EnumC8290z3 a;
    public static final /* synthetic */ EnumC8290z3[] b;

    static {
        EnumC8290z3 enumC8290z3 = new EnumC8290z3("WHOLE_STRING", 0);
        a = enumC8290z3;
        b = new EnumC8290z3[]{enumC8290z3, new EnumC8290z3("PREFIX", 1), new EnumC8290z3("CAPACITY", 2), new EnumC8290z3("EXTRACTED_VALUE_CAPACITY", 3)};
    }

    public static EnumC8290z3 valueOf(String str) {
        return (EnumC8290z3) Enum.valueOf(EnumC8290z3.class, str);
    }

    public static EnumC8290z3[] values() {
        return (EnumC8290z3[]) b.clone();
    }
}
