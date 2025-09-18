package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Rc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1352Rc0 {
    public static final /* synthetic */ EnumC1352Rc0[] a;

    static {
        EnumC1352Rc0[] enumC1352Rc0Arr = {new EnumC1352Rc0("FROM_DEPENDENCIES", 0), new EnumC1352Rc0("FROM_CLASS_LOADER", 1), new EnumC1352Rc0("FALLBACK", 2)};
        a = enumC1352Rc0Arr;
        F02.c(enumC1352Rc0Arr);
    }

    public static EnumC1352Rc0 valueOf(String str) {
        return (EnumC1352Rc0) Enum.valueOf(EnumC1352Rc0.class, str);
    }

    public static EnumC1352Rc0[] values() {
        return (EnumC1352Rc0[]) a.clone();
    }
}
