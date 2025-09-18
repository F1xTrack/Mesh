package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: he1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC9652he1 {

    /* renamed from: a */
    public static final C9396fe1 f28496a;

    /* renamed from: b */
    public static final C9140de1 f28497b;

    /* renamed from: c */
    public static final C9524ge1 f28498c;

    /* renamed from: d */
    public static final C9268ee1 f28499d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC9652he1[] f28500e;

    static {
        C9396fe1 c9396fe1 = new C9396fe1();
        f28496a = c9396fe1;
        C9140de1 c9140de1 = new C9140de1();
        f28497b = c9140de1;
        C9524ge1 c9524ge1 = new C9524ge1();
        f28498c = c9524ge1;
        C9268ee1 c9268ee1 = new C9268ee1();
        f28499d = c9268ee1;
        EnumC9652he1[] enumC9652he1Arr = {c9396fe1, c9140de1, c9524ge1, c9268ee1};
        f28500e = enumC9652he1Arr;
        F02.m2482c(enumC9652he1Arr);
    }

    /* renamed from: b */
    public static EnumC9652he1 m18843b(AbstractC8315Tg1 abstractC8315Tg1) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        if (abstractC8315Tg1.mo3798G()) {
            return f28497b;
        }
        if (abstractC8315Tg1 instanceof C6670qH) {
        }
        return AbstractC10384nM1.m23133b(QS1.m6717a(false, true, C7460Cv0.f1757g, null, null, 24), AbstractC9572h12.m18697e(abstractC8315Tg1), C7997Nd1.f7928b) ? f28499d : f28498c;
    }

    public static EnumC9652he1 valueOf(String str) {
        return (EnumC9652he1) Enum.valueOf(EnumC9652he1.class, str);
    }

    public static EnumC9652he1[] values() {
        return (EnumC9652he1[]) f28500e.clone();
    }

    /* renamed from: a */
    public abstract EnumC9652he1 mo17724a(AbstractC8315Tg1 abstractC8315Tg1);
}
