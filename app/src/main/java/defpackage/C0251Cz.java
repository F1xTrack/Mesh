package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: Cz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0251Cz implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC0173Bz) obj).f((InterfaceC8464zz) obj2);
            case 2:
                return ((InterfaceC0173Bz) obj).f((InterfaceC8464zz) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC8464zz interfaceC8464zz = (InterfaceC8464zz) obj2;
                if (!(interfaceC8464zz instanceof V91)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC8464zz : Integer.valueOf(iIntValue + 1);
            case 5:
                V91 v91 = (V91) obj;
                InterfaceC8464zz interfaceC8464zz2 = (InterfaceC8464zz) obj2;
                if (v91 != null) {
                    return v91;
                }
                if (interfaceC8464zz2 instanceof V91) {
                    return (V91) interfaceC8464zz2;
                }
                return null;
            default:
                return (Z91) obj;
        }
    }
}
