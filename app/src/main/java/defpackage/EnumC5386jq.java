package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5386jq {
    public static final EnumC5386jq a;
    public static final /* synthetic */ EnumC5386jq[] b;

    static {
        EnumC5386jq enumC5386jq = new EnumC5386jq("FOR_SUBTYPING", 0);
        a = enumC5386jq;
        EnumC5386jq[] enumC5386jqArr = {enumC5386jq, new EnumC5386jq("FOR_INCORPORATION", 1), new EnumC5386jq("FROM_EXPRESSION", 2)};
        b = enumC5386jqArr;
        F02.c(enumC5386jqArr);
    }

    public static EnumC5386jq valueOf(String str) {
        return (EnumC5386jq) Enum.valueOf(EnumC5386jq.class, str);
    }

    public static EnumC5386jq[] values() {
        return (EnumC5386jq[]) b.clone();
    }
}
