package p000;

import com.huawei.hms.p015rn.push.constants.Core;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: nI */
/* loaded from: classes2.dex */
public final class EnumC6480nI extends Enum {

    /* renamed from: b */
    public static final Set f38240b;

    /* renamed from: c */
    public static final Set f38241c;

    /* renamed from: d */
    public static final EnumC6480nI f38242d;

    /* renamed from: e */
    public static final EnumC6480nI f38243e;

    /* renamed from: f */
    public static final EnumC6480nI f38244f;

    /* renamed from: g */
    public static final EnumC6480nI f38245g;

    /* renamed from: h */
    public static final EnumC6480nI f38246h;

    /* renamed from: i */
    public static final EnumC6480nI f38247i;

    /* renamed from: j */
    public static final EnumC6480nI f38248j;

    /* renamed from: k */
    public static final EnumC6480nI f38249k;

    /* renamed from: l */
    public static final EnumC6480nI f38250l;

    /* renamed from: m */
    public static final EnumC6480nI f38251m;

    /* renamed from: n */
    public static final EnumC6480nI f38252n;

    /* renamed from: o */
    public static final EnumC6480nI f38253o;

    /* renamed from: p */
    public static final EnumC6480nI f38254p;

    /* renamed from: q */
    public static final EnumC6480nI f38255q;

    /* renamed from: r */
    public static final /* synthetic */ EnumC6480nI[] f38256r;

    /* renamed from: a */
    public final boolean f38257a;

    static {
        EnumC6480nI enumC6480nI = new EnumC6480nI("VISIBILITY", 0, true);
        f38242d = enumC6480nI;
        EnumC6480nI enumC6480nI2 = new EnumC6480nI("MODALITY", 1, true);
        f38243e = enumC6480nI2;
        EnumC6480nI enumC6480nI3 = new EnumC6480nI("OVERRIDE", 2, true);
        f38244f = enumC6480nI3;
        EnumC6480nI enumC6480nI4 = new EnumC6480nI("ANNOTATIONS", 3, false);
        f38245g = enumC6480nI4;
        EnumC6480nI enumC6480nI5 = new EnumC6480nI("INNER", 4, true);
        f38246h = enumC6480nI5;
        EnumC6480nI enumC6480nI6 = new EnumC6480nI("MEMBER_KIND", 5, true);
        f38247i = enumC6480nI6;
        EnumC6480nI enumC6480nI7 = new EnumC6480nI(Core.NotificationType.DATA, 6, true);
        f38248j = enumC6480nI7;
        EnumC6480nI enumC6480nI8 = new EnumC6480nI("INLINE", 7, true);
        f38249k = enumC6480nI8;
        EnumC6480nI enumC6480nI9 = new EnumC6480nI("EXPECT", 8, true);
        f38250l = enumC6480nI9;
        EnumC6480nI enumC6480nI10 = new EnumC6480nI("ACTUAL", 9, true);
        f38251m = enumC6480nI10;
        EnumC6480nI enumC6480nI11 = new EnumC6480nI("CONST", 10, true);
        f38252n = enumC6480nI11;
        EnumC6480nI enumC6480nI12 = new EnumC6480nI("LATEINIT", 11, true);
        f38253o = enumC6480nI12;
        EnumC6480nI enumC6480nI13 = new EnumC6480nI("FUN", 12, true);
        f38254p = enumC6480nI13;
        EnumC6480nI enumC6480nI14 = new EnumC6480nI("VALUE", 13, true);
        f38255q = enumC6480nI14;
        EnumC6480nI[] enumC6480nIArr = {enumC6480nI, enumC6480nI2, enumC6480nI3, enumC6480nI4, enumC6480nI5, enumC6480nI6, enumC6480nI7, enumC6480nI8, enumC6480nI9, enumC6480nI10, enumC6480nI11, enumC6480nI12, enumC6480nI13, enumC6480nI14};
        f38256r = enumC6480nIArr;
        F02.m2482c(enumC6480nIArr);
        EnumC6480nI[] enumC6480nIArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC6480nI enumC6480nI15 : enumC6480nIArrValues) {
            if (enumC6480nI15.f38257a) {
                arrayList.add(enumC6480nI15);
            }
        }
        f38240b = AbstractC7167xu.m25987g0(arrayList);
        f38241c = AbstractC0576J8.m4175F(values());
    }

    public EnumC6480nI(String str, int i, boolean z) {
        super(str, i);
        this.f38257a = z;
    }

    public static EnumC6480nI valueOf(String str) {
        return (EnumC6480nI) Enum.valueOf(EnumC6480nI.class, str);
    }

    public static EnumC6480nI[] values() {
        return (EnumC6480nI[]) f38256r.clone();
    }
}
