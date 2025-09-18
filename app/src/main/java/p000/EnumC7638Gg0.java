package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Gg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7638Gg0 {

    /* renamed from: a */
    public static final EnumC7638Gg0 f3846a;

    /* renamed from: b */
    public static final EnumC7638Gg0 f3847b;

    /* renamed from: c */
    public static final EnumC7638Gg0 f3848c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7638Gg0[] f3849d;

    static {
        EnumC7638Gg0 enumC7638Gg0 = new EnumC7638Gg0("RUNTIME", 0);
        f3846a = enumC7638Gg0;
        EnumC7638Gg0 enumC7638Gg02 = new EnumC7638Gg0("BINARY", 1);
        f3847b = enumC7638Gg02;
        EnumC7638Gg0 enumC7638Gg03 = new EnumC7638Gg0("SOURCE", 2);
        f3848c = enumC7638Gg03;
        EnumC7638Gg0[] enumC7638Gg0Arr = {enumC7638Gg0, enumC7638Gg02, enumC7638Gg03};
        f3849d = enumC7638Gg0Arr;
        F02.m2482c(enumC7638Gg0Arr);
    }

    public static EnumC7638Gg0 valueOf(String str) {
        return (EnumC7638Gg0) Enum.valueOf(EnumC7638Gg0.class, str);
    }

    public static EnumC7638Gg0[] values() {
        return (EnumC7638Gg0[]) f3849d.clone();
    }
}
