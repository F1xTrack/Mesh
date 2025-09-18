package defpackage;

/* renamed from: hi0 */
/* loaded from: classes2.dex */
public final class EnumC4205hi0 extends Enum {
    public static final EnumC4205hi0 a;
    public static final EnumC4205hi0 b;
    public static final EnumC4205hi0 c;
    public static final /* synthetic */ EnumC4205hi0[] d;

    static {
        EnumC4205hi0 enumC4205hi0 = new EnumC4205hi0("SYNCHRONIZED", 0);
        a = enumC4205hi0;
        EnumC4205hi0 enumC4205hi02 = new EnumC4205hi0("PUBLICATION", 1);
        b = enumC4205hi02;
        EnumC4205hi0 enumC4205hi03 = new EnumC4205hi0("NONE", 2);
        c = enumC4205hi03;
        EnumC4205hi0[] enumC4205hi0Arr = {enumC4205hi0, enumC4205hi02, enumC4205hi03};
        d = enumC4205hi0Arr;
        F02.c(enumC4205hi0Arr);
    }

    public static EnumC4205hi0 valueOf(String str) {
        return (EnumC4205hi0) Enum.valueOf(EnumC4205hi0.class, str);
    }

    public static EnumC4205hi0[] values() {
        return (EnumC4205hi0[]) d.clone();
    }
}
