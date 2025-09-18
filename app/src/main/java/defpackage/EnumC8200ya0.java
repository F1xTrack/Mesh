package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ya0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8200ya0 {
    public static final EnumC8200ya0 a;
    public static final EnumC8200ya0 b;
    public static final /* synthetic */ EnumC8200ya0[] c;

    static {
        EnumC8200ya0 enumC8200ya0 = new EnumC8200ya0("JSC", 0);
        a = enumC8200ya0;
        EnumC8200ya0 enumC8200ya02 = new EnumC8200ya0("HERMES", 1);
        b = enumC8200ya02;
        EnumC8200ya0[] enumC8200ya0Arr = {enumC8200ya0, enumC8200ya02};
        c = enumC8200ya0Arr;
        F02.c(enumC8200ya0Arr);
    }

    public static EnumC8200ya0 valueOf(String str) {
        return (EnumC8200ya0) Enum.valueOf(EnumC8200ya0.class, str);
    }

    public static EnumC8200ya0[] values() {
        return (EnumC8200ya0[]) c.clone();
    }
}
