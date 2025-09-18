package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jq */
/* loaded from: classes2.dex */
public final class EnumC6262jq {

    /* renamed from: a */
    public static final EnumC6262jq f35417a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC6262jq[] f35418b;

    static {
        EnumC6262jq enumC6262jq = new EnumC6262jq("FOR_SUBTYPING", 0);
        f35417a = enumC6262jq;
        EnumC6262jq[] enumC6262jqArr = {enumC6262jq, new EnumC6262jq("FOR_INCORPORATION", 1), new EnumC6262jq("FROM_EXPRESSION", 2)};
        f35418b = enumC6262jqArr;
        F02.m2482c(enumC6262jqArr);
    }

    public static EnumC6262jq valueOf(String str) {
        return (EnumC6262jq) Enum.valueOf(EnumC6262jq.class, str);
    }

    public static EnumC6262jq[] values() {
        return (EnumC6262jq[]) f35418b.clone();
    }
}
