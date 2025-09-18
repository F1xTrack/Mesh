package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: oD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6225oD0 implements InterfaceC0723Ja0 {
    public static final TE b;
    public static final EnumC6225oD0 c;
    public static final EnumC6225oD0 d;
    public static final /* synthetic */ EnumC6225oD0[] e;
    public final String a;

    static {
        EnumC6225oD0 enumC6225oD0 = new EnumC6225oD0("SURFACE_VIEW", 0, "surface-view");
        c = enumC6225oD0;
        EnumC6225oD0 enumC6225oD02 = new EnumC6225oD0("TEXTURE_VIEW", 1, "texture-view");
        d = enumC6225oD02;
        EnumC6225oD0[] enumC6225oD0Arr = {enumC6225oD0, enumC6225oD02};
        e = enumC6225oD0Arr;
        F02.c(enumC6225oD0Arr);
        b = new TE(19);
    }

    public EnumC6225oD0(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC6225oD0 valueOf(String str) {
        return (EnumC6225oD0) Enum.valueOf(EnumC6225oD0.class, str);
    }

    public static EnumC6225oD0[] values() {
        return (EnumC6225oD0[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
