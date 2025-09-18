package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6547pv {
    public static final EnumC6547pv a;
    public static final /* synthetic */ EnumC6547pv[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6547pv EF2;

    static {
        EnumC6547pv enumC6547pv = new EnumC6547pv("NOT_SET", 0);
        EnumC6547pv enumC6547pv2 = new EnumC6547pv("EVENT_OVERRIDE", 1);
        a = enumC6547pv2;
        b = new EnumC6547pv[]{enumC6547pv, enumC6547pv2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6547pv);
        sparseArray.put(5, enumC6547pv2);
    }

    public static EnumC6547pv valueOf(String str) {
        return (EnumC6547pv) Enum.valueOf(EnumC6547pv.class, str);
    }

    public static EnumC6547pv[] values() {
        return (EnumC6547pv[]) b.clone();
    }
}
