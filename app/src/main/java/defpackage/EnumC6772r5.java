package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6772r5 {
    public static final EnumC6772r5 c;
    public static final /* synthetic */ EnumC6772r5[] d;
    public final boolean a;
    public final boolean b;

    static {
        EnumC6772r5 enumC6772r5 = new EnumC6772r5(false, (int) (0 == true ? 1 : 0), 3, "NO_ARGUMENTS");
        c = enumC6772r5;
        EnumC6772r5[] enumC6772r5Arr = {enumC6772r5, new EnumC6772r5(true, (int) (true ? 1 : 0), 2, "UNLESS_EMPTY"), new EnumC6772r5("ALWAYS_PARENTHESIZED", 2, true, true)};
        d = enumC6772r5Arr;
        F02.c(enumC6772r5Arr);
    }

    public EnumC6772r5(String str, int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static EnumC6772r5 valueOf(String str) {
        return (EnumC6772r5) Enum.valueOf(EnumC6772r5.class, str);
    }

    public static EnumC6772r5[] values() {
        return (EnumC6772r5[]) d.clone();
    }

    public /* synthetic */ EnumC6772r5(boolean z, int i, int i2, String str) {
        this(str, i, (i2 & 1) != 0 ? false : z, false);
    }
}
