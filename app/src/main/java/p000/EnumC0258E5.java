package p000;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: E5 */
/* loaded from: classes2.dex */
public final class EnumC0258E5 {

    /* renamed from: b */
    public static final EnumC0258E5 f2459b;

    /* renamed from: c */
    public static final EnumC0258E5 f2460c;

    /* renamed from: d */
    public static final EnumC0258E5 f2461d;

    /* renamed from: e */
    public static final EnumC0258E5 f2462e;

    /* renamed from: f */
    public static final EnumC0258E5 f2463f;

    /* renamed from: g */
    public static final EnumC0258E5 f2464g;

    /* renamed from: h */
    public static final EnumC0258E5 f2465h;

    /* renamed from: i */
    public static final EnumC0258E5 f2466i;

    /* renamed from: j */
    public static final EnumC0258E5 f2467j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC0258E5[] f2468k;

    /* renamed from: a */
    public final String f2469a;

    static {
        EnumC0258E5 enumC0258E5 = new EnumC0258E5("FIELD", 0, null);
        f2459b = enumC0258E5;
        EnumC0258E5 enumC0258E52 = new EnumC0258E5("FILE", 1, null);
        f2460c = enumC0258E52;
        EnumC0258E5 enumC0258E53 = new EnumC0258E5("PROPERTY", 2, null);
        f2461d = enumC0258E53;
        EnumC0258E5 enumC0258E54 = new EnumC0258E5("PROPERTY_GETTER", 3, "get");
        f2462e = enumC0258E54;
        EnumC0258E5 enumC0258E55 = new EnumC0258E5("PROPERTY_SETTER", 4, "set");
        f2463f = enumC0258E55;
        EnumC0258E5 enumC0258E56 = new EnumC0258E5("RECEIVER", 5, null);
        f2464g = enumC0258E56;
        EnumC0258E5 enumC0258E57 = new EnumC0258E5("CONSTRUCTOR_PARAMETER", 6, RemoteMessageConst.MessageBody.PARAM);
        f2465h = enumC0258E57;
        EnumC0258E5 enumC0258E58 = new EnumC0258E5("SETTER_PARAMETER", 7, "setparam");
        f2466i = enumC0258E58;
        EnumC0258E5 enumC0258E59 = new EnumC0258E5("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f2467j = enumC0258E59;
        EnumC0258E5[] enumC0258E5Arr = {enumC0258E5, enumC0258E52, enumC0258E53, enumC0258E54, enumC0258E55, enumC0258E56, enumC0258E57, enumC0258E58, enumC0258E59};
        f2468k = enumC0258E5Arr;
        F02.m2482c(enumC0258E5Arr);
    }

    public EnumC0258E5(String str, int i, String str2) {
        this.f2469a = str2 == null ? AbstractC9244eS1.m17995e(name()) : str2;
    }

    public static EnumC0258E5 valueOf(String str) {
        return (EnumC0258E5) Enum.valueOf(EnumC0258E5.class, str);
    }

    public static EnumC0258E5[] values() {
        return (EnumC0258E5[]) f2468k.clone();
    }
}
