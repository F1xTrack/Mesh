package defpackage;

import com.huawei.hms.rn.push.constants.LocalNotification;

/* renamed from: Ob */
/* loaded from: classes2.dex */
public final class EnumC1114Ob extends Enum implements InterfaceC0723Ja0 {
    public static final C3759fN b;
    public static final EnumC1114Ob c;
    public static final EnumC1114Ob d;
    public static final /* synthetic */ EnumC1114Ob[] e;
    public final String a;

    static {
        EnumC1114Ob enumC1114Ob = new EnumC1114Ob("CONTRAST_DETECTION", 0, "contrast-detection");
        c = enumC1114Ob;
        EnumC1114Ob enumC1114Ob2 = new EnumC1114Ob("NONE", 1, LocalNotification.Importance.NONE);
        d = enumC1114Ob2;
        EnumC1114Ob[] enumC1114ObArr = {enumC1114Ob, enumC1114Ob2};
        e = enumC1114ObArr;
        F02.c(enumC1114ObArr);
        b = new C3759fN(8);
    }

    public EnumC1114Ob(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static EnumC1114Ob valueOf(String str) {
        return (EnumC1114Ob) Enum.valueOf(EnumC1114Ob.class, str);
    }

    public static EnumC1114Ob[] values() {
        return (EnumC1114Ob[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
