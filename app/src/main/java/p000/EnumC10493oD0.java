package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: oD0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10493oD0 implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final C1210TE f38889b;

    /* renamed from: c */
    public static final EnumC10493oD0 f38890c;

    /* renamed from: d */
    public static final EnumC10493oD0 f38891d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC10493oD0[] f38892e;

    /* renamed from: a */
    public final String f38893a;

    static {
        EnumC10493oD0 enumC10493oD0 = new EnumC10493oD0("SURFACE_VIEW", 0, "surface-view");
        f38890c = enumC10493oD0;
        EnumC10493oD0 enumC10493oD02 = new EnumC10493oD0("TEXTURE_VIEW", 1, "texture-view");
        f38891d = enumC10493oD02;
        EnumC10493oD0[] enumC10493oD0Arr = {enumC10493oD0, enumC10493oD02};
        f38892e = enumC10493oD0Arr;
        F02.m2482c(enumC10493oD0Arr);
        f38889b = new C1210TE(19);
    }

    public EnumC10493oD0(String str, int i, String str2) {
        this.f38893a = str2;
    }

    public static EnumC10493oD0 valueOf(String str) {
        return (EnumC10493oD0) Enum.valueOf(EnumC10493oD0.class, str);
    }

    public static EnumC10493oD0[] values() {
        return (EnumC10493oD0[]) f38892e.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f38893a;
    }
}
