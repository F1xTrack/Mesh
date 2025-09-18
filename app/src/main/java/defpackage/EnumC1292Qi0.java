package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Qi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1292Qi0 {
    public static final /* synthetic */ EnumC1292Qi0[] a;

    static {
        EnumC1292Qi0[] enumC1292Qi0Arr = {new EnumC1292Qi0("SOURCE", 0), new EnumC1292Qi0("BINARY", 1)};
        a = enumC1292Qi0Arr;
        F02.c(enumC1292Qi0Arr);
    }

    public static EnumC1292Qi0 valueOf(String str) {
        return (EnumC1292Qi0) Enum.valueOf(EnumC1292Qi0.class, str);
    }

    public static EnumC1292Qi0[] values() {
        return (EnumC1292Qi0[]) a.clone();
    }
}
