package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7738w9 {
    public static final EnumC7738w9 a;
    public static final EnumC7738w9 b;
    public static final /* synthetic */ EnumC7738w9[] c;

    static {
        EnumC7738w9 enumC7738w9 = new EnumC7738w9("AUTOMATIC", 0);
        a = enumC7738w9;
        EnumC7738w9 enumC7738w92 = new EnumC7738w9("ENABLED", 1);
        b = enumC7738w92;
        c = new EnumC7738w9[]{enumC7738w9, enumC7738w92, new EnumC7738w9("DISABLED", 2)};
    }

    public static EnumC7738w9 valueOf(String str) {
        return (EnumC7738w9) Enum.valueOf(EnumC7738w9.class, str);
    }

    public static EnumC7738w9[] values() {
        return (EnumC7738w9[]) c.clone();
    }
}
