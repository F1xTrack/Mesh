package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: he1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC4194he1 {
    public static final C3812fe1 a;
    public static final C3431de1 b;
    public static final C4003ge1 c;
    public static final C3621ee1 d;
    public static final /* synthetic */ EnumC4194he1[] e;

    static {
        C3812fe1 c3812fe1 = new C3812fe1();
        a = c3812fe1;
        C3431de1 c3431de1 = new C3431de1();
        b = c3431de1;
        C4003ge1 c4003ge1 = new C4003ge1();
        c = c4003ge1;
        C3621ee1 c3621ee1 = new C3621ee1();
        d = c3621ee1;
        EnumC4194he1[] enumC4194he1Arr = {c3812fe1, c3431de1, c4003ge1, c3621ee1};
        e = enumC4194he1Arr;
        F02.c(enumC4194he1Arr);
    }

    public static EnumC4194he1 b(AbstractC1521Tg1 abstractC1521Tg1) {
        O90.f(abstractC1521Tg1, "<this>");
        if (abstractC1521Tg1.G()) {
            return b;
        }
        if (abstractC1521Tg1 instanceof C6618qH) {
        }
        return AbstractC6062nM1.b(QS1.a(false, true, C0240Cv0.g, null, null, 24), AbstractC4075h12.e(abstractC1521Tg1), C1044Nd1.b) ? d : c;
    }

    public static EnumC4194he1 valueOf(String str) {
        return (EnumC4194he1) Enum.valueOf(EnumC4194he1.class, str);
    }

    public static EnumC4194he1[] values() {
        return (EnumC4194he1[]) e.clone();
    }

    public abstract EnumC4194he1 a(AbstractC1521Tg1 abstractC1521Tg1);
}
