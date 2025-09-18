package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Rc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8202Rc0 {

    /* renamed from: a */
    public static final /* synthetic */ EnumC8202Rc0[] f10337a;

    static {
        EnumC8202Rc0[] enumC8202Rc0Arr = {new EnumC8202Rc0("FROM_DEPENDENCIES", 0), new EnumC8202Rc0("FROM_CLASS_LOADER", 1), new EnumC8202Rc0("FALLBACK", 2)};
        f10337a = enumC8202Rc0Arr;
        F02.m2482c(enumC8202Rc0Arr);
    }

    public static EnumC8202Rc0 valueOf(String str) {
        return (EnumC8202Rc0) Enum.valueOf(EnumC8202Rc0.class, str);
    }

    public static EnumC8202Rc0[] values() {
        return (EnumC8202Rc0[]) f10337a.clone();
    }
}
