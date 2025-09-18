package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pv */
/* loaded from: classes.dex */
public final class EnumC6647pv {

    /* renamed from: a */
    public static final EnumC6647pv f40432a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC6647pv[] f40433b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6647pv EF2;

    static {
        EnumC6647pv enumC6647pv = new EnumC6647pv("NOT_SET", 0);
        EnumC6647pv enumC6647pv2 = new EnumC6647pv("EVENT_OVERRIDE", 1);
        f40432a = enumC6647pv2;
        f40433b = new EnumC6647pv[]{enumC6647pv, enumC6647pv2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6647pv);
        sparseArray.put(5, enumC6647pv2);
    }

    public static EnumC6647pv valueOf(String str) {
        return (EnumC6647pv) Enum.valueOf(EnumC6647pv.class, str);
    }

    public static EnumC6647pv[] values() {
        return (EnumC6647pv[]) f40433b.clone();
    }
}
