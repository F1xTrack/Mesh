package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11692xb1 {

    /* renamed from: a */
    public static final EnumC11692xb1 f45706a;

    /* renamed from: b */
    public static final EnumC11692xb1 f45707b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC11692xb1[] f45708c;

    static {
        EnumC11692xb1 enumC11692xb1 = new EnumC11692xb1("SELF", 0);
        f45706a = enumC11692xb1;
        EnumC11692xb1 enumC11692xb12 = new EnumC11692xb1("CHILD", 1);
        f45707b = enumC11692xb12;
        f45708c = new EnumC11692xb1[]{enumC11692xb1, enumC11692xb12};
    }

    public static EnumC11692xb1 valueOf(String str) {
        return (EnumC11692xb1) Enum.valueOf(EnumC11692xb1.class, str);
    }

    public static EnumC11692xb1[] values() {
        return (EnumC11692xb1[]) f45708c.clone();
    }
}
