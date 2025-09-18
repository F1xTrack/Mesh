package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Cf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0192Cf0 {
    public static final EnumC0192Cf0 a;
    public static final EnumC0192Cf0 b;
    public static final EnumC0192Cf0 c;
    public static final /* synthetic */ EnumC0192Cf0[] d;

    static {
        EnumC0192Cf0 enumC0192Cf0 = new EnumC0192Cf0("INVARIANT", 0);
        a = enumC0192Cf0;
        EnumC0192Cf0 enumC0192Cf02 = new EnumC0192Cf0("IN", 1);
        b = enumC0192Cf02;
        EnumC0192Cf0 enumC0192Cf03 = new EnumC0192Cf0("OUT", 2);
        c = enumC0192Cf03;
        EnumC0192Cf0[] enumC0192Cf0Arr = {enumC0192Cf0, enumC0192Cf02, enumC0192Cf03};
        d = enumC0192Cf0Arr;
        F02.c(enumC0192Cf0Arr);
    }

    public static EnumC0192Cf0 valueOf(String str) {
        return (EnumC0192Cf0) Enum.valueOf(EnumC0192Cf0.class, str);
    }

    public static EnumC0192Cf0[] values() {
        return (EnumC0192Cf0[]) d.clone();
    }
}
