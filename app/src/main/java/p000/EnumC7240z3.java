package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3 */
/* loaded from: classes2.dex */
public final class EnumC7240z3 {

    /* renamed from: a */
    public static final EnumC7240z3 f46604a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC7240z3[] f46605b;

    static {
        EnumC7240z3 enumC7240z3 = new EnumC7240z3("WHOLE_STRING", 0);
        f46604a = enumC7240z3;
        f46605b = new EnumC7240z3[]{enumC7240z3, new EnumC7240z3("PREFIX", 1), new EnumC7240z3("CAPACITY", 2), new EnumC7240z3("EXTRACTED_VALUE_CAPACITY", 3)};
    }

    public static EnumC7240z3 valueOf(String str) {
        return (EnumC7240z3) Enum.valueOf(EnumC7240z3.class, str);
    }

    public static EnumC7240z3[] values() {
        return (EnumC7240z3[]) f46605b.clone();
    }
}
