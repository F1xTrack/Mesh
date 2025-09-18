package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: Cz */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0188Cz implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ int f1788a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1788a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC0125Bz) obj).mo936f((InterfaceC7298zz) obj2);
            case 2:
                return ((InterfaceC0125Bz) obj).mo936f((InterfaceC7298zz) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC7298zz interfaceC7298zz = (InterfaceC7298zz) obj2;
                if (!(interfaceC7298zz instanceof V91)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC7298zz : Integer.valueOf(iIntValue + 1);
            case 5:
                V91 v91 = (V91) obj;
                InterfaceC7298zz interfaceC7298zz2 = (InterfaceC7298zz) obj2;
                if (v91 != null) {
                    return v91;
                }
                if (interfaceC7298zz2 instanceof V91) {
                    return (V91) interfaceC7298zz2;
                }
                return null;
            default:
                return (Z91) obj;
        }
    }
}
