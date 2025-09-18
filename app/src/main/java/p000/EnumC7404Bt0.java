package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7404Bt0 {

    /* renamed from: a */
    public static final EnumC7404Bt0 f1070a;

    /* renamed from: b */
    public static final EnumC7404Bt0 f1071b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC7404Bt0[] f1072c;

    static {
        EnumC7404Bt0 enumC7404Bt0 = new EnumC7404Bt0("READ_ONLY", 0);
        f1070a = enumC7404Bt0;
        EnumC7404Bt0 enumC7404Bt02 = new EnumC7404Bt0("MUTABLE", 1);
        f1071b = enumC7404Bt02;
        EnumC7404Bt0[] enumC7404Bt0Arr = {enumC7404Bt0, enumC7404Bt02};
        f1072c = enumC7404Bt0Arr;
        F02.m2482c(enumC7404Bt0Arr);
    }

    public static EnumC7404Bt0 valueOf(String str) {
        return (EnumC7404Bt0) Enum.valueOf(EnumC7404Bt0.class, str);
    }

    public static EnumC7404Bt0[] values() {
        return (EnumC7404Bt0[]) f1072c.clone();
    }
}
