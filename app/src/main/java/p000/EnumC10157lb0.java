package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10157lb0 {

    /* renamed from: b */
    public static final /* synthetic */ EnumC10157lb0[] f37178b;

    /* renamed from: a */
    public final int f37179a;

    static {
        EnumC10157lb0[] enumC10157lb0Arr = {new EnumC10157lb0("Configurable", 0, 1), new EnumC10157lb0("Enumerable", 1, 2), new EnumC10157lb0("Writable", 2, 4)};
        f37178b = enumC10157lb0Arr;
        F02.m2482c(enumC10157lb0Arr);
    }

    public EnumC10157lb0(String str, int i, int i2) {
        this.f37179a = i2;
    }

    public static EnumC10157lb0 valueOf(String str) {
        return (EnumC10157lb0) Enum.valueOf(EnumC10157lb0.class, str);
    }

    public static EnumC10157lb0[] values() {
        return (EnumC10157lb0[]) f37178b.clone();
    }
}
