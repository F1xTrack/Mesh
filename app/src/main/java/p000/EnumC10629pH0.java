package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pH0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10629pH0 {

    /* renamed from: a */
    public static final EnumC10629pH0 f39996a;

    /* renamed from: b */
    public static final EnumC10629pH0 f39997b;

    /* renamed from: c */
    public static final EnumC10629pH0 f39998c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC10629pH0[] f39999d;

    static {
        EnumC10629pH0 enumC10629pH0 = new EnumC10629pH0("UNDECIDED", 0);
        f39996a = enumC10629pH0;
        EnumC10629pH0 enumC10629pH02 = new EnumC10629pH0("SHOULD_OVERRIDE", 1);
        f39997b = enumC10629pH02;
        EnumC10629pH0 enumC10629pH03 = new EnumC10629pH0("DO_NOT_OVERRIDE", 2);
        f39998c = enumC10629pH03;
        f39999d = new EnumC10629pH0[]{enumC10629pH0, enumC10629pH02, enumC10629pH03};
    }

    public static EnumC10629pH0 valueOf(String str) {
        return (EnumC10629pH0) Enum.valueOf(EnumC10629pH0.class, str);
    }

    public static EnumC10629pH0[] values() {
        return (EnumC10629pH0[]) f39999d.clone();
    }
}
