package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5724lb0 {
    public static final /* synthetic */ EnumC5724lb0[] b;
    public final int a;

    static {
        EnumC5724lb0[] enumC5724lb0Arr = {new EnumC5724lb0("Configurable", 0, 1), new EnumC5724lb0("Enumerable", 1, 2), new EnumC5724lb0("Writable", 2, 4)};
        b = enumC5724lb0Arr;
        F02.c(enumC5724lb0Arr);
    }

    public EnumC5724lb0(String str, int i, int i2) {
        this.a = i2;
    }

    public static EnumC5724lb0 valueOf(String str) {
        return (EnumC5724lb0) Enum.valueOf(EnumC5724lb0.class, str);
    }

    public static EnumC5724lb0[] values() {
        return (EnumC5724lb0[]) b.clone();
    }
}
