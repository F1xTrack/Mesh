package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: He1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7687He1 {

    /* renamed from: b */
    public static final /* synthetic */ EnumC7687He1[] f4394b;

    /* renamed from: a */
    public final int f4395a;

    static {
        EnumC7687He1[] enumC7687He1Arr = {new EnumC7687He1("Int8Array", 0), new EnumC7687He1("Int16Array", 1), new EnumC7687He1("Int32Array", 2), new EnumC7687He1("Uint8Array", 3), new EnumC7687He1("Uint8ClampedArray", 4), new EnumC7687He1("Uint16Array", 5), new EnumC7687He1("Uint32Array", 6), new EnumC7687He1("Float32Array", 7), new EnumC7687He1("Float64Array", 8), new EnumC7687He1("BigInt64Array", 9), new EnumC7687He1("BigUint64Array", 10)};
        f4394b = enumC7687He1Arr;
        F02.m2482c(enumC7687He1Arr);
    }

    public EnumC7687He1(String str, int i) {
        int i2 = J22.f5289a;
        J22.f5289a = i2 + 1;
        this.f4395a = i2;
    }

    public static EnumC7687He1 valueOf(String str) {
        return (EnumC7687He1) Enum.valueOf(EnumC7687He1.class, str);
    }

    public static EnumC7687He1[] values() {
        return (EnumC7687He1[]) f4394b.clone();
    }
}
