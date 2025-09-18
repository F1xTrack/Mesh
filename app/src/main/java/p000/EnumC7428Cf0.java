package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Cf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7428Cf0 {

    /* renamed from: a */
    public static final EnumC7428Cf0 f1568a;

    /* renamed from: b */
    public static final EnumC7428Cf0 f1569b;

    /* renamed from: c */
    public static final EnumC7428Cf0 f1570c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC7428Cf0[] f1571d;

    static {
        EnumC7428Cf0 enumC7428Cf0 = new EnumC7428Cf0("INVARIANT", 0);
        f1568a = enumC7428Cf0;
        EnumC7428Cf0 enumC7428Cf02 = new EnumC7428Cf0("IN", 1);
        f1569b = enumC7428Cf02;
        EnumC7428Cf0 enumC7428Cf03 = new EnumC7428Cf0("OUT", 2);
        f1570c = enumC7428Cf03;
        EnumC7428Cf0[] enumC7428Cf0Arr = {enumC7428Cf0, enumC7428Cf02, enumC7428Cf03};
        f1571d = enumC7428Cf0Arr;
        F02.m2482c(enumC7428Cf0Arr);
    }

    public static EnumC7428Cf0 valueOf(String str) {
        return (EnumC7428Cf0) Enum.valueOf(EnumC7428Cf0.class, str);
    }

    public static EnumC7428Cf0[] values() {
        return (EnumC7428Cf0[]) f1571d.clone();
    }
}
