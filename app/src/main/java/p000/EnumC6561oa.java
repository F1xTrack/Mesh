package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: oa */
/* loaded from: classes.dex */
public final class EnumC6561oa {

    /* renamed from: c */
    public static final C1210TE f39093c;

    /* renamed from: d */
    public static final EnumC6561oa f39094d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC6561oa[] f39095e;

    /* renamed from: a */
    public final String f39096a;

    /* renamed from: b */
    public final int f39097b;

    static {
        EnumC6561oa enumC6561oa = new EnumC6561oa(0, "SPEAKER", 3, "speaker");
        f39094d = enumC6561oa;
        EnumC6561oa[] enumC6561oaArr = {enumC6561oa, new EnumC6561oa(1, "EARPIECE", 0, "earpiece")};
        f39095e = enumC6561oaArr;
        F02.m2482c(enumC6561oaArr);
        f39093c = new C1210TE(8);
    }

    public EnumC6561oa(int i, String str, int i2, String str2) {
        this.f39096a = str2;
        this.f39097b = i2;
    }

    public static EnumC6561oa valueOf(String str) {
        return (EnumC6561oa) Enum.valueOf(EnumC6561oa.class, str);
    }

    public static EnumC6561oa[] values() {
        return (EnumC6561oa[]) f39095e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(EnumC6561oa.class.getSimpleName(), "(");
        sbM5762k.append(this.f39096a);
        sbM5762k.append(", ");
        return AbstractC1374Vq.m8591j(sbM5762k, this.f39097b, ")");
    }
}
