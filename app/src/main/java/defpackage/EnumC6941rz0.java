package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: rz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6941rz0 {
    public static final EnumC6941rz0 a;
    public static final EnumC6941rz0 b;
    public static final /* synthetic */ EnumC6941rz0[] c;

    static {
        EnumC6941rz0 enumC6941rz0 = new EnumC6941rz0("RENDER_OVERRIDE", 0);
        a = enumC6941rz0;
        EnumC6941rz0 enumC6941rz02 = new EnumC6941rz0("RENDER_OPEN", 1);
        b = enumC6941rz02;
        EnumC6941rz0[] enumC6941rz0Arr = {enumC6941rz0, enumC6941rz02, new EnumC6941rz0("RENDER_OPEN_OVERRIDE", 2)};
        c = enumC6941rz0Arr;
        F02.c(enumC6941rz0Arr);
    }

    public static EnumC6941rz0 valueOf(String str) {
        return (EnumC6941rz0) Enum.valueOf(EnumC6941rz0.class, str);
    }

    public static EnumC6941rz0[] values() {
        return (EnumC6941rz0[]) c.clone();
    }
}
