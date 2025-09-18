package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Qu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8186Qu0 {

    /* renamed from: a */
    public static final SparseArray f9857a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC8186Qu0[] f9858b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8186Qu0 EF3;

    static {
        EnumC8186Qu0 enumC8186Qu0 = new EnumC8186Qu0("MOBILE", 0);
        EnumC8186Qu0 enumC8186Qu02 = new EnumC8186Qu0("WIFI", 1);
        EnumC8186Qu0 enumC8186Qu03 = new EnumC8186Qu0("MOBILE_MMS", 2);
        EnumC8186Qu0 enumC8186Qu04 = new EnumC8186Qu0("MOBILE_SUPL", 3);
        EnumC8186Qu0 enumC8186Qu05 = new EnumC8186Qu0("MOBILE_DUN", 4);
        EnumC8186Qu0 enumC8186Qu06 = new EnumC8186Qu0("MOBILE_HIPRI", 5);
        EnumC8186Qu0 enumC8186Qu07 = new EnumC8186Qu0("WIMAX", 6);
        EnumC8186Qu0 enumC8186Qu08 = new EnumC8186Qu0("BLUETOOTH", 7);
        EnumC8186Qu0 enumC8186Qu09 = new EnumC8186Qu0("DUMMY", 8);
        EnumC8186Qu0 enumC8186Qu010 = new EnumC8186Qu0("ETHERNET", 9);
        EnumC8186Qu0 enumC8186Qu011 = new EnumC8186Qu0("MOBILE_FOTA", 10);
        EnumC8186Qu0 enumC8186Qu012 = new EnumC8186Qu0("MOBILE_IMS", 11);
        EnumC8186Qu0 enumC8186Qu013 = new EnumC8186Qu0("MOBILE_CBS", 12);
        EnumC8186Qu0 enumC8186Qu014 = new EnumC8186Qu0("WIFI_P2P", 13);
        EnumC8186Qu0 enumC8186Qu015 = new EnumC8186Qu0("MOBILE_IA", 14);
        EnumC8186Qu0 enumC8186Qu016 = new EnumC8186Qu0("MOBILE_EMERGENCY", 15);
        EnumC8186Qu0 enumC8186Qu017 = new EnumC8186Qu0("PROXY", 16);
        EnumC8186Qu0 enumC8186Qu018 = new EnumC8186Qu0("VPN", 17);
        EnumC8186Qu0 enumC8186Qu019 = new EnumC8186Qu0("NONE", 18);
        f9858b = new EnumC8186Qu0[]{enumC8186Qu0, enumC8186Qu02, enumC8186Qu03, enumC8186Qu04, enumC8186Qu05, enumC8186Qu06, enumC8186Qu07, enumC8186Qu08, enumC8186Qu09, enumC8186Qu010, enumC8186Qu011, enumC8186Qu012, enumC8186Qu013, enumC8186Qu014, enumC8186Qu015, enumC8186Qu016, enumC8186Qu017, enumC8186Qu018, enumC8186Qu019};
        SparseArray sparseArray = new SparseArray();
        f9857a = sparseArray;
        sparseArray.put(0, enumC8186Qu0);
        sparseArray.put(1, enumC8186Qu02);
        sparseArray.put(2, enumC8186Qu03);
        sparseArray.put(3, enumC8186Qu04);
        sparseArray.put(4, enumC8186Qu05);
        sparseArray.put(5, enumC8186Qu06);
        sparseArray.put(6, enumC8186Qu07);
        sparseArray.put(7, enumC8186Qu08);
        sparseArray.put(8, enumC8186Qu09);
        sparseArray.put(9, enumC8186Qu010);
        sparseArray.put(10, enumC8186Qu011);
        sparseArray.put(11, enumC8186Qu012);
        sparseArray.put(12, enumC8186Qu013);
        sparseArray.put(13, enumC8186Qu014);
        sparseArray.put(14, enumC8186Qu015);
        sparseArray.put(15, enumC8186Qu016);
        sparseArray.put(16, enumC8186Qu017);
        sparseArray.put(17, enumC8186Qu018);
        sparseArray.put(-1, enumC8186Qu019);
    }

    public static EnumC8186Qu0 valueOf(String str) {
        return (EnumC8186Qu0) Enum.valueOf(EnumC8186Qu0.class, str);
    }

    public static EnumC8186Qu0[] values() {
        return (EnumC8186Qu0[]) f9858b.clone();
    }
}
