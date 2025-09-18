package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y41, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC11753y41 {

    /* renamed from: a */
    public static final EnumC11753y41 f46077a;

    /* renamed from: b */
    public static final EnumC11753y41 f46078b;

    /* renamed from: c */
    public static final EnumC11753y41 f46079c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC11753y41[] f46080d;

    static {
        EnumC11753y41 enumC11753y41 = new EnumC11753y41("BEGINNING", 0);
        f46077a = enumC11753y41;
        EnumC11753y41 enumC11753y412 = new EnumC11753y41("MIDDLE", 1);
        f46078b = enumC11753y412;
        EnumC11753y41 enumC11753y413 = new EnumC11753y41("AFTER_DOT", 2);
        f46079c = enumC11753y413;
        EnumC11753y41[] enumC11753y41Arr = {enumC11753y41, enumC11753y412, enumC11753y413};
        f46080d = enumC11753y41Arr;
        F02.m2482c(enumC11753y41Arr);
    }

    public static EnumC11753y41 valueOf(String str) {
        return (EnumC11753y41) Enum.valueOf(EnumC11753y41.class, str);
    }

    public static EnumC11753y41[] values() {
        return (EnumC11753y41[]) f46080d.clone();
    }
}
