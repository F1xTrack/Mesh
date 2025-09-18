package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Lj */
/* loaded from: classes.dex */
public final class EnumC0738Lj {

    /* renamed from: a */
    public static final EnumC0738Lj f6821a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC0738Lj[] f6822b;

    static {
        EnumC0738Lj enumC0738Lj = new EnumC0738Lj("Default", 0);
        f6821a = enumC0738Lj;
        EnumC0738Lj[] enumC0738LjArr = {enumC0738Lj, new EnumC0738Lj("DisableBuffering", 1), new EnumC0738Lj("DependingOnMemory", 2)};
        f6822b = enumC0738LjArr;
        F02.m2482c(enumC0738LjArr);
    }

    public static EnumC0738Lj valueOf(String str) {
        return (EnumC0738Lj) Enum.valueOf(EnumC0738Lj.class, str);
    }

    public static EnumC0738Lj[] values() {
        return (EnumC0738Lj[]) f6822b.clone();
    }
}
