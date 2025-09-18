package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6616qG0 {
    public static final EnumC6616qG0 a;
    public static final /* synthetic */ EnumC6616qG0[] b;

    static {
        EnumC6616qG0 enumC6616qG0 = new EnumC6616qG0("DEFAULT", 0);
        a = enumC6616qG0;
        EnumC6616qG0 enumC6616qG02 = new EnumC6616qG0("UNMETERED_ONLY", 1);
        EnumC6616qG0 enumC6616qG03 = new EnumC6616qG0("UNMETERED_OR_DAILY", 2);
        EnumC6616qG0 enumC6616qG04 = new EnumC6616qG0("FAST_IF_RADIO_AWAKE", 3);
        EnumC6616qG0 enumC6616qG05 = new EnumC6616qG0("NEVER", 4);
        EnumC6616qG0 enumC6616qG06 = new EnumC6616qG0("UNRECOGNIZED", 5);
        b = new EnumC6616qG0[]{enumC6616qG0, enumC6616qG02, enumC6616qG03, enumC6616qG04, enumC6616qG05, enumC6616qG06};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6616qG0);
        sparseArray.put(1, enumC6616qG02);
        sparseArray.put(2, enumC6616qG03);
        sparseArray.put(3, enumC6616qG04);
        sparseArray.put(4, enumC6616qG05);
        sparseArray.put(-1, enumC6616qG06);
    }

    public static EnumC6616qG0 valueOf(String str) {
        return (EnumC6616qG0) Enum.valueOf(EnumC6616qG0.class, str);
    }

    public static EnumC6616qG0[] values() {
        return (EnumC6616qG0[]) b.clone();
    }
}
