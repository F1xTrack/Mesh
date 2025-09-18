package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3340dA0 {
    public static final EnumC3340dA0 a;
    public static final EnumC3340dA0 b;
    public static final EnumC3340dA0 c;
    public static final /* synthetic */ EnumC3340dA0[] d;

    static {
        EnumC3340dA0 enumC3340dA0 = new EnumC3340dA0("ALL", 0);
        a = enumC3340dA0;
        EnumC3340dA0 enumC3340dA02 = new EnumC3340dA0("ONLY_NON_SYNTHESIZED", 1);
        b = enumC3340dA02;
        EnumC3340dA0 enumC3340dA03 = new EnumC3340dA0("NONE", 2);
        c = enumC3340dA03;
        EnumC3340dA0[] enumC3340dA0Arr = {enumC3340dA0, enumC3340dA02, enumC3340dA03};
        d = enumC3340dA0Arr;
        F02.c(enumC3340dA0Arr);
    }

    public static EnumC3340dA0 valueOf(String str) {
        return (EnumC3340dA0) Enum.valueOf(EnumC3340dA0.class, str);
    }

    public static EnumC3340dA0[] values() {
        return (EnumC3340dA0[]) d.clone();
    }
}
