package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10323mu0 {

    /* renamed from: a */
    public static final EnumC10323mu0 f37985a;

    /* renamed from: b */
    public static final EnumC10323mu0 f37986b;

    /* renamed from: c */
    public static final EnumC10323mu0 f37987c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC10323mu0[] f37988d;

    static {
        EnumC10323mu0 enumC10323mu0 = new EnumC10323mu0("PARENT", 0);
        f37985a = enumC10323mu0;
        EnumC10323mu0 enumC10323mu02 = new EnumC10323mu0("LEAF", 1);
        f37986b = enumC10323mu02;
        EnumC10323mu0 enumC10323mu03 = new EnumC10323mu0("NONE", 2);
        f37987c = enumC10323mu03;
        EnumC10323mu0[] enumC10323mu0Arr = {enumC10323mu0, enumC10323mu02, enumC10323mu03};
        f37988d = enumC10323mu0Arr;
        F02.m2482c(enumC10323mu0Arr);
    }

    public static EnumC10323mu0 valueOf(String str) {
        return (EnumC10323mu0) Enum.valueOf(EnumC10323mu0.class, str);
    }

    public static EnumC10323mu0[] values() {
        return (EnumC10323mu0[]) f37988d.clone();
    }
}
