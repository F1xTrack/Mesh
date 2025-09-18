package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ag0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7326Ag0 {

    /* renamed from: b */
    public static final C7512Dv0 f323b;

    /* renamed from: c */
    public static final LinkedHashMap f324c;

    /* renamed from: d */
    public static final EnumC7326Ag0 f325d;

    /* renamed from: e */
    public static final EnumC7326Ag0 f326e;

    /* renamed from: f */
    public static final EnumC7326Ag0 f327f;

    /* renamed from: g */
    public static final EnumC7326Ag0 f328g;

    /* renamed from: h */
    public static final EnumC7326Ag0 f329h;

    /* renamed from: i */
    public static final EnumC7326Ag0 f330i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC7326Ag0[] f331j;

    /* renamed from: a */
    public final int f332a;

    static {
        EnumC7326Ag0 enumC7326Ag0 = new EnumC7326Ag0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        f325d = enumC7326Ag0;
        EnumC7326Ag0 enumC7326Ag02 = new EnumC7326Ag0("CLASS", 1, 1);
        f326e = enumC7326Ag02;
        EnumC7326Ag0 enumC7326Ag03 = new EnumC7326Ag0("FILE_FACADE", 2, 2);
        f327f = enumC7326Ag03;
        EnumC7326Ag0 enumC7326Ag04 = new EnumC7326Ag0("SYNTHETIC_CLASS", 3, 3);
        f328g = enumC7326Ag04;
        EnumC7326Ag0 enumC7326Ag05 = new EnumC7326Ag0("MULTIFILE_CLASS", 4, 4);
        f329h = enumC7326Ag05;
        EnumC7326Ag0 enumC7326Ag06 = new EnumC7326Ag0("MULTIFILE_CLASS_PART", 5, 5);
        f330i = enumC7326Ag06;
        EnumC7326Ag0[] enumC7326Ag0Arr = {enumC7326Ag0, enumC7326Ag02, enumC7326Ag03, enumC7326Ag04, enumC7326Ag05, enumC7326Ag06};
        f331j = enumC7326Ag0Arr;
        F02.m2482c(enumC7326Ag0Arr);
        f323b = new C7512Dv0(16);
        EnumC7326Ag0[] enumC7326Ag0ArrValues = values();
        int iM24983b = AbstractC11205tn0.m24983b(enumC7326Ag0ArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b >= 16 ? iM24983b : 16);
        for (EnumC7326Ag0 enumC7326Ag07 : enumC7326Ag0ArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC7326Ag07.f332a), enumC7326Ag07);
        }
        f324c = linkedHashMap;
    }

    public EnumC7326Ag0(String str, int i, int i2) {
        this.f332a = i2;
    }

    public static EnumC7326Ag0 valueOf(String str) {
        return (EnumC7326Ag0) Enum.valueOf(EnumC7326Ag0.class, str);
    }

    public static EnumC7326Ag0[] values() {
        return (EnumC7326Ag0[]) f331j.clone();
    }
}
