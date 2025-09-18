package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Gx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0557Gx {
    public static final /* synthetic */ EnumC0557Gx[] a;

    static {
        EnumC0557Gx[] enumC0557GxArr = {new EnumC0557Gx("BARE", 0), new EnumC0557Gx("STANDALONE", 1), new EnumC0557Gx("STORE_CLIENT", 2)};
        a = enumC0557GxArr;
        F02.c(enumC0557GxArr);
    }

    public static EnumC0557Gx valueOf(String str) {
        return (EnumC0557Gx) Enum.valueOf(EnumC0557Gx.class, str);
    }

    public static EnumC0557Gx[] values() {
        return (EnumC0557Gx[]) a.clone();
    }
}
