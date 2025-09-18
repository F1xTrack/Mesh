package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1250Pu0 {
    public static final SparseArray a;
    public static final /* synthetic */ EnumC1250Pu0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1250Pu0 EF5;

    static {
        EnumC1250Pu0 enumC1250Pu0 = new EnumC1250Pu0("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC1250Pu0 enumC1250Pu02 = new EnumC1250Pu0("GPRS", 1);
        EnumC1250Pu0 enumC1250Pu03 = new EnumC1250Pu0("EDGE", 2);
        EnumC1250Pu0 enumC1250Pu04 = new EnumC1250Pu0("UMTS", 3);
        EnumC1250Pu0 enumC1250Pu05 = new EnumC1250Pu0("CDMA", 4);
        EnumC1250Pu0 enumC1250Pu06 = new EnumC1250Pu0("EVDO_0", 5);
        EnumC1250Pu0 enumC1250Pu07 = new EnumC1250Pu0("EVDO_A", 6);
        EnumC1250Pu0 enumC1250Pu08 = new EnumC1250Pu0("RTT", 7);
        EnumC1250Pu0 enumC1250Pu09 = new EnumC1250Pu0("HSDPA", 8);
        EnumC1250Pu0 enumC1250Pu010 = new EnumC1250Pu0("HSUPA", 9);
        EnumC1250Pu0 enumC1250Pu011 = new EnumC1250Pu0("HSPA", 10);
        EnumC1250Pu0 enumC1250Pu012 = new EnumC1250Pu0("IDEN", 11);
        EnumC1250Pu0 enumC1250Pu013 = new EnumC1250Pu0("EVDO_B", 12);
        EnumC1250Pu0 enumC1250Pu014 = new EnumC1250Pu0("LTE", 13);
        EnumC1250Pu0 enumC1250Pu015 = new EnumC1250Pu0("EHRPD", 14);
        EnumC1250Pu0 enumC1250Pu016 = new EnumC1250Pu0("HSPAP", 15);
        EnumC1250Pu0 enumC1250Pu017 = new EnumC1250Pu0("GSM", 16);
        EnumC1250Pu0 enumC1250Pu018 = new EnumC1250Pu0("TD_SCDMA", 17);
        EnumC1250Pu0 enumC1250Pu019 = new EnumC1250Pu0("IWLAN", 18);
        EnumC1250Pu0 enumC1250Pu020 = new EnumC1250Pu0("LTE_CA", 19);
        b = new EnumC1250Pu0[]{enumC1250Pu0, enumC1250Pu02, enumC1250Pu03, enumC1250Pu04, enumC1250Pu05, enumC1250Pu06, enumC1250Pu07, enumC1250Pu08, enumC1250Pu09, enumC1250Pu010, enumC1250Pu011, enumC1250Pu012, enumC1250Pu013, enumC1250Pu014, enumC1250Pu015, enumC1250Pu016, enumC1250Pu017, enumC1250Pu018, enumC1250Pu019, enumC1250Pu020, new EnumC1250Pu0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, enumC1250Pu0);
        sparseArray.put(1, enumC1250Pu02);
        sparseArray.put(2, enumC1250Pu03);
        sparseArray.put(3, enumC1250Pu04);
        sparseArray.put(4, enumC1250Pu05);
        sparseArray.put(5, enumC1250Pu06);
        sparseArray.put(6, enumC1250Pu07);
        sparseArray.put(7, enumC1250Pu08);
        sparseArray.put(8, enumC1250Pu09);
        sparseArray.put(9, enumC1250Pu010);
        sparseArray.put(10, enumC1250Pu011);
        sparseArray.put(11, enumC1250Pu012);
        sparseArray.put(12, enumC1250Pu013);
        sparseArray.put(13, enumC1250Pu014);
        sparseArray.put(14, enumC1250Pu015);
        sparseArray.put(15, enumC1250Pu016);
        sparseArray.put(16, enumC1250Pu017);
        sparseArray.put(17, enumC1250Pu018);
        sparseArray.put(18, enumC1250Pu019);
        sparseArray.put(19, enumC1250Pu020);
    }

    public static EnumC1250Pu0 valueOf(String str) {
        return (EnumC1250Pu0) Enum.valueOf(EnumC1250Pu0.class, str);
    }

    public static EnumC1250Pu0[] values() {
        return (EnumC1250Pu0[]) b.clone();
    }
}
