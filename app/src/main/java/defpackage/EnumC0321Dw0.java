package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Dw0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0321Dw0 {
    public static final EnumC0321Dw0 a;
    public static final EnumC0321Dw0 b;
    public static final EnumC0321Dw0 c;
    public static final /* synthetic */ EnumC0321Dw0[] d;

    static {
        EnumC0321Dw0 enumC0321Dw0 = new EnumC0321Dw0("FORCE_FLEXIBILITY", 0);
        a = enumC0321Dw0;
        EnumC0321Dw0 enumC0321Dw02 = new EnumC0321Dw0("NULLABLE", 1);
        b = enumC0321Dw02;
        EnumC0321Dw0 enumC0321Dw03 = new EnumC0321Dw0("NOT_NULL", 2);
        c = enumC0321Dw03;
        EnumC0321Dw0[] enumC0321Dw0Arr = {enumC0321Dw0, enumC0321Dw02, enumC0321Dw03};
        d = enumC0321Dw0Arr;
        F02.c(enumC0321Dw0Arr);
    }

    public static EnumC0321Dw0 valueOf(String str) {
        return (EnumC0321Dw0) Enum.valueOf(EnumC0321Dw0.class, str);
    }

    public static EnumC0321Dw0[] values() {
        return (EnumC0321Dw0[]) d.clone();
    }
}
