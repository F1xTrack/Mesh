package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5972mu0 {
    public static final EnumC5972mu0 a;
    public static final EnumC5972mu0 b;
    public static final EnumC5972mu0 c;
    public static final /* synthetic */ EnumC5972mu0[] d;

    static {
        EnumC5972mu0 enumC5972mu0 = new EnumC5972mu0("PARENT", 0);
        a = enumC5972mu0;
        EnumC5972mu0 enumC5972mu02 = new EnumC5972mu0("LEAF", 1);
        b = enumC5972mu02;
        EnumC5972mu0 enumC5972mu03 = new EnumC5972mu0("NONE", 2);
        c = enumC5972mu03;
        EnumC5972mu0[] enumC5972mu0Arr = {enumC5972mu0, enumC5972mu02, enumC5972mu03};
        d = enumC5972mu0Arr;
        F02.c(enumC5972mu0Arr);
    }

    public static EnumC5972mu0 valueOf(String str) {
        return (EnumC5972mu0) Enum.valueOf(EnumC5972mu0.class, str);
    }

    public static EnumC5972mu0[] values() {
        return (EnumC5972mu0[]) d.clone();
    }
}
