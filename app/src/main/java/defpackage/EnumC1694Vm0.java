package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Vm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1694Vm0 {
    public static final EnumC1694Vm0 a;
    public static final EnumC1694Vm0 b;
    public static final EnumC1694Vm0 c;
    public static final EnumC1694Vm0 d;
    public static final EnumC1694Vm0 e;
    public static final EnumC1694Vm0 f;
    public static final /* synthetic */ EnumC1694Vm0[] g;

    static {
        EnumC1694Vm0 enumC1694Vm0 = new EnumC1694Vm0("BOOL", 0);
        a = enumC1694Vm0;
        EnumC1694Vm0 enumC1694Vm02 = new EnumC1694Vm0("INT", 1);
        b = enumC1694Vm02;
        EnumC1694Vm0 enumC1694Vm03 = new EnumC1694Vm0("DOUBLE", 2);
        c = enumC1694Vm03;
        EnumC1694Vm0 enumC1694Vm04 = new EnumC1694Vm0("STRING", 3);
        d = enumC1694Vm04;
        EnumC1694Vm0 enumC1694Vm05 = new EnumC1694Vm0("MAP", 4);
        e = enumC1694Vm05;
        EnumC1694Vm0 enumC1694Vm06 = new EnumC1694Vm0("LONG", 5);
        f = enumC1694Vm06;
        EnumC1694Vm0[] enumC1694Vm0Arr = {enumC1694Vm0, enumC1694Vm02, enumC1694Vm03, enumC1694Vm04, enumC1694Vm05, enumC1694Vm06};
        g = enumC1694Vm0Arr;
        F02.c(enumC1694Vm0Arr);
    }

    public static EnumC1694Vm0 valueOf(String str) {
        return (EnumC1694Vm0) Enum.valueOf(EnumC1694Vm0.class, str);
    }

    public static EnumC1694Vm0[] values() {
        return (EnumC1694Vm0[]) g.clone();
    }
}
