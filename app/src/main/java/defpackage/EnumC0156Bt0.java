package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0156Bt0 {
    public static final EnumC0156Bt0 a;
    public static final EnumC0156Bt0 b;
    public static final /* synthetic */ EnumC0156Bt0[] c;

    static {
        EnumC0156Bt0 enumC0156Bt0 = new EnumC0156Bt0("READ_ONLY", 0);
        a = enumC0156Bt0;
        EnumC0156Bt0 enumC0156Bt02 = new EnumC0156Bt0("MUTABLE", 1);
        b = enumC0156Bt02;
        EnumC0156Bt0[] enumC0156Bt0Arr = {enumC0156Bt0, enumC0156Bt02};
        c = enumC0156Bt0Arr;
        F02.c(enumC0156Bt0Arr);
    }

    public static EnumC0156Bt0 valueOf(String str) {
        return (EnumC0156Bt0) Enum.valueOf(EnumC0156Bt0.class, str);
    }

    public static EnumC0156Bt0[] values() {
        return (EnumC0156Bt0[]) c.clone();
    }
}
