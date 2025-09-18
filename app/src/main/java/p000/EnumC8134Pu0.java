package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8134Pu0 {

    /* renamed from: a */
    public static final SparseArray f9344a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC8134Pu0[] f9345b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8134Pu0 EF5;

    static {
        EnumC8134Pu0 enumC8134Pu0 = new EnumC8134Pu0("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC8134Pu0 enumC8134Pu02 = new EnumC8134Pu0("GPRS", 1);
        EnumC8134Pu0 enumC8134Pu03 = new EnumC8134Pu0("EDGE", 2);
        EnumC8134Pu0 enumC8134Pu04 = new EnumC8134Pu0("UMTS", 3);
        EnumC8134Pu0 enumC8134Pu05 = new EnumC8134Pu0("CDMA", 4);
        EnumC8134Pu0 enumC8134Pu06 = new EnumC8134Pu0("EVDO_0", 5);
        EnumC8134Pu0 enumC8134Pu07 = new EnumC8134Pu0("EVDO_A", 6);
        EnumC8134Pu0 enumC8134Pu08 = new EnumC8134Pu0("RTT", 7);
        EnumC8134Pu0 enumC8134Pu09 = new EnumC8134Pu0("HSDPA", 8);
        EnumC8134Pu0 enumC8134Pu010 = new EnumC8134Pu0("HSUPA", 9);
        EnumC8134Pu0 enumC8134Pu011 = new EnumC8134Pu0("HSPA", 10);
        EnumC8134Pu0 enumC8134Pu012 = new EnumC8134Pu0("IDEN", 11);
        EnumC8134Pu0 enumC8134Pu013 = new EnumC8134Pu0("EVDO_B", 12);
        EnumC8134Pu0 enumC8134Pu014 = new EnumC8134Pu0("LTE", 13);
        EnumC8134Pu0 enumC8134Pu015 = new EnumC8134Pu0("EHRPD", 14);
        EnumC8134Pu0 enumC8134Pu016 = new EnumC8134Pu0("HSPAP", 15);
        EnumC8134Pu0 enumC8134Pu017 = new EnumC8134Pu0("GSM", 16);
        EnumC8134Pu0 enumC8134Pu018 = new EnumC8134Pu0("TD_SCDMA", 17);
        EnumC8134Pu0 enumC8134Pu019 = new EnumC8134Pu0("IWLAN", 18);
        EnumC8134Pu0 enumC8134Pu020 = new EnumC8134Pu0("LTE_CA", 19);
        f9345b = new EnumC8134Pu0[]{enumC8134Pu0, enumC8134Pu02, enumC8134Pu03, enumC8134Pu04, enumC8134Pu05, enumC8134Pu06, enumC8134Pu07, enumC8134Pu08, enumC8134Pu09, enumC8134Pu010, enumC8134Pu011, enumC8134Pu012, enumC8134Pu013, enumC8134Pu014, enumC8134Pu015, enumC8134Pu016, enumC8134Pu017, enumC8134Pu018, enumC8134Pu019, enumC8134Pu020, new EnumC8134Pu0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f9344a = sparseArray;
        sparseArray.put(0, enumC8134Pu0);
        sparseArray.put(1, enumC8134Pu02);
        sparseArray.put(2, enumC8134Pu03);
        sparseArray.put(3, enumC8134Pu04);
        sparseArray.put(4, enumC8134Pu05);
        sparseArray.put(5, enumC8134Pu06);
        sparseArray.put(6, enumC8134Pu07);
        sparseArray.put(7, enumC8134Pu08);
        sparseArray.put(8, enumC8134Pu09);
        sparseArray.put(9, enumC8134Pu010);
        sparseArray.put(10, enumC8134Pu011);
        sparseArray.put(11, enumC8134Pu012);
        sparseArray.put(12, enumC8134Pu013);
        sparseArray.put(13, enumC8134Pu014);
        sparseArray.put(14, enumC8134Pu015);
        sparseArray.put(15, enumC8134Pu016);
        sparseArray.put(16, enumC8134Pu017);
        sparseArray.put(17, enumC8134Pu018);
        sparseArray.put(18, enumC8134Pu019);
        sparseArray.put(19, enumC8134Pu020);
    }

    public static EnumC8134Pu0 valueOf(String str) {
        return (EnumC8134Pu0) Enum.valueOf(EnumC8134Pu0.class, str);
    }

    public static EnumC8134Pu0[] values() {
        return (EnumC8134Pu0[]) f9345b.clone();
    }
}
