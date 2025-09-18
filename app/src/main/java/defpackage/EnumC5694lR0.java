package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lR0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5694lR0 {
    public static final EnumC5694lR0 b;
    public static final EnumC5694lR0 c;
    public static final EnumC5694lR0 d;
    public static final /* synthetic */ EnumC5694lR0[] e;
    public final String a;

    static {
        EnumC5694lR0 enumC5694lR0 = new EnumC5694lR0("IGNORE", 0, "ignore");
        b = enumC5694lR0;
        EnumC5694lR0 enumC5694lR02 = new EnumC5694lR0("WARN", 1, "warn");
        c = enumC5694lR02;
        EnumC5694lR0 enumC5694lR03 = new EnumC5694lR0("STRICT", 2, "strict");
        d = enumC5694lR03;
        EnumC5694lR0[] enumC5694lR0Arr = {enumC5694lR0, enumC5694lR02, enumC5694lR03};
        e = enumC5694lR0Arr;
        F02.c(enumC5694lR0Arr);
    }

    public EnumC5694lR0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC5694lR0 valueOf(String str) {
        return (EnumC5694lR0) Enum.valueOf(EnumC5694lR0.class, str);
    }

    public static EnumC5694lR0[] values() {
        return (EnumC5694lR0[]) e.clone();
    }
}
