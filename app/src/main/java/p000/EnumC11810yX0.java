package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC11810yX0 {

    /* renamed from: a */
    public static final EnumC11810yX0 f46287a;

    /* renamed from: b */
    public static final EnumC11810yX0 f46288b;

    /* renamed from: c */
    public static final EnumC11810yX0 f46289c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC11810yX0[] f46290d;

    static {
        EnumC11810yX0 enumC11810yX0 = new EnumC11810yX0("ANY", 0);
        f46287a = enumC11810yX0;
        EnumC11810yX0 enumC11810yX02 = new EnumC11810yX0("SECURE_SOFTWARE", 1);
        f46288b = enumC11810yX02;
        EnumC11810yX0 enumC11810yX03 = new EnumC11810yX0("SECURE_HARDWARE", 2);
        f46289c = enumC11810yX03;
        f46290d = new EnumC11810yX0[]{enumC11810yX0, enumC11810yX02, enumC11810yX03};
    }

    public static EnumC11810yX0 valueOf(String str) {
        return (EnumC11810yX0) Enum.valueOf(EnumC11810yX0.class, str);
    }

    public static EnumC11810yX0[] values() {
        return (EnumC11810yX0[]) f46290d.clone();
    }

    /* renamed from: a */
    public final String m26162a() {
        return AbstractC7222ym.m26245v("SECURITY_LEVEL_", name());
    }
}
