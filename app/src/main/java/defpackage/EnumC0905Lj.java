package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0905Lj {
    public static final EnumC0905Lj a;
    public static final /* synthetic */ EnumC0905Lj[] b;

    static {
        EnumC0905Lj enumC0905Lj = new EnumC0905Lj("Default", 0);
        a = enumC0905Lj;
        EnumC0905Lj[] enumC0905LjArr = {enumC0905Lj, new EnumC0905Lj("DisableBuffering", 1), new EnumC0905Lj("DependingOnMemory", 2)};
        b = enumC0905LjArr;
        F02.c(enumC0905LjArr);
    }

    public static EnumC0905Lj valueOf(String str) {
        return (EnumC0905Lj) Enum.valueOf(EnumC0905Lj.class, str);
    }

    public static EnumC0905Lj[] values() {
        return (EnumC0905Lj[]) b.clone();
    }
}
