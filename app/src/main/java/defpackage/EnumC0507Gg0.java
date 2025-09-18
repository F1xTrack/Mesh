package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Gg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0507Gg0 {
    public static final EnumC0507Gg0 a;
    public static final EnumC0507Gg0 b;
    public static final EnumC0507Gg0 c;
    public static final /* synthetic */ EnumC0507Gg0[] d;

    static {
        EnumC0507Gg0 enumC0507Gg0 = new EnumC0507Gg0("RUNTIME", 0);
        a = enumC0507Gg0;
        EnumC0507Gg0 enumC0507Gg02 = new EnumC0507Gg0("BINARY", 1);
        b = enumC0507Gg02;
        EnumC0507Gg0 enumC0507Gg03 = new EnumC0507Gg0("SOURCE", 2);
        c = enumC0507Gg03;
        EnumC0507Gg0[] enumC0507Gg0Arr = {enumC0507Gg0, enumC0507Gg02, enumC0507Gg03};
        d = enumC0507Gg0Arr;
        F02.c(enumC0507Gg0Arr);
    }

    public static EnumC0507Gg0 valueOf(String str) {
        return (EnumC0507Gg0) Enum.valueOf(EnumC0507Gg0.class, str);
    }

    public static EnumC0507Gg0[] values() {
        return (EnumC0507Gg0[]) d.clone();
    }
}
