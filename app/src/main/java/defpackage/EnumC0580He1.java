package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: He1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0580He1 {
    public static final /* synthetic */ EnumC0580He1[] b;
    public final int a;

    static {
        EnumC0580He1[] enumC0580He1Arr = {new EnumC0580He1("Int8Array", 0), new EnumC0580He1("Int16Array", 1), new EnumC0580He1("Int32Array", 2), new EnumC0580He1("Uint8Array", 3), new EnumC0580He1("Uint8ClampedArray", 4), new EnumC0580He1("Uint16Array", 5), new EnumC0580He1("Uint32Array", 6), new EnumC0580He1("Float32Array", 7), new EnumC0580He1("Float64Array", 8), new EnumC0580He1("BigInt64Array", 9), new EnumC0580He1("BigUint64Array", 10)};
        b = enumC0580He1Arr;
        F02.c(enumC0580He1Arr);
    }

    public EnumC0580He1(String str, int i) {
        int i2 = J22.a;
        J22.a = i2 + 1;
        this.a = i2;
    }

    public static EnumC0580He1 valueOf(String str) {
        return (EnumC0580He1) Enum.valueOf(EnumC0580He1.class, str);
    }

    public static EnumC0580He1[] values() {
        return (EnumC0580He1[]) b.clone();
    }
}
