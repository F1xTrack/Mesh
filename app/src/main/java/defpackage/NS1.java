package defpackage;

import android.app.Dialog;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class NS1 {
    public static Dialog a;
    public static WeakReference b;

    public static boolean a(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "callableMemberDescriptor");
        if (!AbstractC2571ck.d.contains(interfaceC8042xl.getName())) {
            return false;
        }
        if (!AbstractC8069xu.v(AbstractC2571ck.c, AbstractC7384uI.c(interfaceC8042xl)) || !interfaceC8042xl.f0().isEmpty()) {
            if (!AbstractC8408zg0.z(interfaceC8042xl)) {
                return false;
            }
            Collection collectionJ = interfaceC8042xl.j();
            O90.e(collectionJ, "getOverriddenDescriptors(...)");
            Collection<InterfaceC8042xl> collection = collectionJ;
            if (collection.isEmpty()) {
                return false;
            }
            for (InterfaceC8042xl interfaceC8042xl2 : collection) {
                O90.c(interfaceC8042xl2);
                if (a(interfaceC8042xl2)) {
                }
            }
            return false;
        }
        return true;
    }
}
