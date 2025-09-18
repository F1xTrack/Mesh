package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10755qG0 {

    /* renamed from: a */
    public static final EnumC10755qG0 f40710a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC10755qG0[] f40711b;

    static {
        EnumC10755qG0 enumC10755qG0 = new EnumC10755qG0("DEFAULT", 0);
        f40710a = enumC10755qG0;
        EnumC10755qG0 enumC10755qG02 = new EnumC10755qG0("UNMETERED_ONLY", 1);
        EnumC10755qG0 enumC10755qG03 = new EnumC10755qG0("UNMETERED_OR_DAILY", 2);
        EnumC10755qG0 enumC10755qG04 = new EnumC10755qG0("FAST_IF_RADIO_AWAKE", 3);
        EnumC10755qG0 enumC10755qG05 = new EnumC10755qG0("NEVER", 4);
        EnumC10755qG0 enumC10755qG06 = new EnumC10755qG0("UNRECOGNIZED", 5);
        f40711b = new EnumC10755qG0[]{enumC10755qG0, enumC10755qG02, enumC10755qG03, enumC10755qG04, enumC10755qG05, enumC10755qG06};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC10755qG0);
        sparseArray.put(1, enumC10755qG02);
        sparseArray.put(2, enumC10755qG03);
        sparseArray.put(3, enumC10755qG04);
        sparseArray.put(4, enumC10755qG05);
        sparseArray.put(-1, enumC10755qG06);
    }

    public static EnumC10755qG0 valueOf(String str) {
        return (EnumC10755qG0) Enum.valueOf(EnumC10755qG0.class, str);
    }

    public static EnumC10755qG0[] values() {
        return (EnumC10755qG0[]) f40711b.clone();
    }
}
