package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC10973rz0 {

    /* renamed from: a */
    public static final EnumC10973rz0 f42183a;

    /* renamed from: b */
    public static final EnumC10973rz0 f42184b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC10973rz0[] f42185c;

    static {
        EnumC10973rz0 enumC10973rz0 = new EnumC10973rz0("RENDER_OVERRIDE", 0);
        f42183a = enumC10973rz0;
        EnumC10973rz0 enumC10973rz02 = new EnumC10973rz0("RENDER_OPEN", 1);
        f42184b = enumC10973rz02;
        EnumC10973rz0[] enumC10973rz0Arr = {enumC10973rz0, enumC10973rz02, new EnumC10973rz0("RENDER_OPEN_OVERRIDE", 2)};
        f42185c = enumC10973rz0Arr;
        F02.m2482c(enumC10973rz0Arr);
    }

    public static EnumC10973rz0 valueOf(String str) {
        return (EnumC10973rz0) Enum.valueOf(EnumC10973rz0.class, str);
    }

    public static EnumC10973rz0[] values() {
        return (EnumC10973rz0[]) f42185c.clone();
    }
}
