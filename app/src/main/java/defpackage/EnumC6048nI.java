package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: nI */
/* loaded from: classes2.dex */
public final class EnumC6048nI extends Enum {
    public static final Set b;
    public static final Set c;
    public static final EnumC6048nI d;
    public static final EnumC6048nI e;
    public static final EnumC6048nI f;
    public static final EnumC6048nI g;
    public static final EnumC6048nI h;
    public static final EnumC6048nI i;
    public static final EnumC6048nI j;
    public static final EnumC6048nI k;
    public static final EnumC6048nI l;
    public static final EnumC6048nI m;
    public static final EnumC6048nI n;
    public static final EnumC6048nI o;
    public static final EnumC6048nI p;
    public static final EnumC6048nI q;
    public static final /* synthetic */ EnumC6048nI[] r;
    public final boolean a;

    static {
        EnumC6048nI enumC6048nI = new EnumC6048nI("VISIBILITY", 0, true);
        d = enumC6048nI;
        EnumC6048nI enumC6048nI2 = new EnumC6048nI("MODALITY", 1, true);
        e = enumC6048nI2;
        EnumC6048nI enumC6048nI3 = new EnumC6048nI("OVERRIDE", 2, true);
        f = enumC6048nI3;
        EnumC6048nI enumC6048nI4 = new EnumC6048nI("ANNOTATIONS", 3, false);
        g = enumC6048nI4;
        EnumC6048nI enumC6048nI5 = new EnumC6048nI("INNER", 4, true);
        h = enumC6048nI5;
        EnumC6048nI enumC6048nI6 = new EnumC6048nI("MEMBER_KIND", 5, true);
        i = enumC6048nI6;
        EnumC6048nI enumC6048nI7 = new EnumC6048nI(Core.NotificationType.DATA, 6, true);
        j = enumC6048nI7;
        EnumC6048nI enumC6048nI8 = new EnumC6048nI("INLINE", 7, true);
        k = enumC6048nI8;
        EnumC6048nI enumC6048nI9 = new EnumC6048nI("EXPECT", 8, true);
        l = enumC6048nI9;
        EnumC6048nI enumC6048nI10 = new EnumC6048nI("ACTUAL", 9, true);
        m = enumC6048nI10;
        EnumC6048nI enumC6048nI11 = new EnumC6048nI("CONST", 10, true);
        n = enumC6048nI11;
        EnumC6048nI enumC6048nI12 = new EnumC6048nI("LATEINIT", 11, true);
        o = enumC6048nI12;
        EnumC6048nI enumC6048nI13 = new EnumC6048nI("FUN", 12, true);
        p = enumC6048nI13;
        EnumC6048nI enumC6048nI14 = new EnumC6048nI("VALUE", 13, true);
        q = enumC6048nI14;
        EnumC6048nI[] enumC6048nIArr = {enumC6048nI, enumC6048nI2, enumC6048nI3, enumC6048nI4, enumC6048nI5, enumC6048nI6, enumC6048nI7, enumC6048nI8, enumC6048nI9, enumC6048nI10, enumC6048nI11, enumC6048nI12, enumC6048nI13, enumC6048nI14};
        r = enumC6048nIArr;
        F02.c(enumC6048nIArr);
        EnumC6048nI[] enumC6048nIArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC6048nI enumC6048nI15 : enumC6048nIArrValues) {
            if (enumC6048nI15.a) {
                arrayList.add(enumC6048nI15);
            }
        }
        b = AbstractC8069xu.g0(arrayList);
        c = J8.F(values());
    }

    public EnumC6048nI(String str, int i2, boolean z) {
        super(str, i2);
        this.a = z;
    }

    public static EnumC6048nI valueOf(String str) {
        return (EnumC6048nI) Enum.valueOf(EnumC6048nI.class, str);
    }

    public static EnumC6048nI[] values() {
        return (EnumC6048nI[]) r.clone();
    }
}
