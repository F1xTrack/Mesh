package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Qu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1328Qu0 {
    public static final SparseArray a;
    public static final /* synthetic */ EnumC1328Qu0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1328Qu0 EF3;

    static {
        EnumC1328Qu0 enumC1328Qu0 = new EnumC1328Qu0("MOBILE", 0);
        EnumC1328Qu0 enumC1328Qu02 = new EnumC1328Qu0("WIFI", 1);
        EnumC1328Qu0 enumC1328Qu03 = new EnumC1328Qu0("MOBILE_MMS", 2);
        EnumC1328Qu0 enumC1328Qu04 = new EnumC1328Qu0("MOBILE_SUPL", 3);
        EnumC1328Qu0 enumC1328Qu05 = new EnumC1328Qu0("MOBILE_DUN", 4);
        EnumC1328Qu0 enumC1328Qu06 = new EnumC1328Qu0("MOBILE_HIPRI", 5);
        EnumC1328Qu0 enumC1328Qu07 = new EnumC1328Qu0("WIMAX", 6);
        EnumC1328Qu0 enumC1328Qu08 = new EnumC1328Qu0("BLUETOOTH", 7);
        EnumC1328Qu0 enumC1328Qu09 = new EnumC1328Qu0("DUMMY", 8);
        EnumC1328Qu0 enumC1328Qu010 = new EnumC1328Qu0("ETHERNET", 9);
        EnumC1328Qu0 enumC1328Qu011 = new EnumC1328Qu0("MOBILE_FOTA", 10);
        EnumC1328Qu0 enumC1328Qu012 = new EnumC1328Qu0("MOBILE_IMS", 11);
        EnumC1328Qu0 enumC1328Qu013 = new EnumC1328Qu0("MOBILE_CBS", 12);
        EnumC1328Qu0 enumC1328Qu014 = new EnumC1328Qu0("WIFI_P2P", 13);
        EnumC1328Qu0 enumC1328Qu015 = new EnumC1328Qu0("MOBILE_IA", 14);
        EnumC1328Qu0 enumC1328Qu016 = new EnumC1328Qu0("MOBILE_EMERGENCY", 15);
        EnumC1328Qu0 enumC1328Qu017 = new EnumC1328Qu0("PROXY", 16);
        EnumC1328Qu0 enumC1328Qu018 = new EnumC1328Qu0("VPN", 17);
        EnumC1328Qu0 enumC1328Qu019 = new EnumC1328Qu0("NONE", 18);
        b = new EnumC1328Qu0[]{enumC1328Qu0, enumC1328Qu02, enumC1328Qu03, enumC1328Qu04, enumC1328Qu05, enumC1328Qu06, enumC1328Qu07, enumC1328Qu08, enumC1328Qu09, enumC1328Qu010, enumC1328Qu011, enumC1328Qu012, enumC1328Qu013, enumC1328Qu014, enumC1328Qu015, enumC1328Qu016, enumC1328Qu017, enumC1328Qu018, enumC1328Qu019};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, enumC1328Qu0);
        sparseArray.put(1, enumC1328Qu02);
        sparseArray.put(2, enumC1328Qu03);
        sparseArray.put(3, enumC1328Qu04);
        sparseArray.put(4, enumC1328Qu05);
        sparseArray.put(5, enumC1328Qu06);
        sparseArray.put(6, enumC1328Qu07);
        sparseArray.put(7, enumC1328Qu08);
        sparseArray.put(8, enumC1328Qu09);
        sparseArray.put(9, enumC1328Qu010);
        sparseArray.put(10, enumC1328Qu011);
        sparseArray.put(11, enumC1328Qu012);
        sparseArray.put(12, enumC1328Qu013);
        sparseArray.put(13, enumC1328Qu014);
        sparseArray.put(14, enumC1328Qu015);
        sparseArray.put(15, enumC1328Qu016);
        sparseArray.put(16, enumC1328Qu017);
        sparseArray.put(17, enumC1328Qu018);
        sparseArray.put(-1, enumC1328Qu019);
    }

    public static EnumC1328Qu0 valueOf(String str) {
        return (EnumC1328Qu0) Enum.valueOf(EnumC1328Qu0.class, str);
    }

    public static EnumC1328Qu0[] values() {
        return (EnumC1328Qu0[]) b.clone();
    }
}
