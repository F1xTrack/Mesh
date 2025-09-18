package p000;

import android.app.Dialog;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class NS1 {

    /* renamed from: a */
    public static Dialog f7793a;

    /* renamed from: b */
    public static WeakReference f7794b;

    /* renamed from: a */
    public static boolean m5691a(InterfaceC7158xl interfaceC7158xl) {
        O90.m5968f(interfaceC7158xl, "callableMemberDescriptor");
        if (!AbstractC1866ck.f17718d.contains(interfaceC7158xl.getName())) {
            return false;
        }
        if (!AbstractC7167xu.m25994v(AbstractC1866ck.f17717c, AbstractC6940uI.m25150c(interfaceC7158xl)) || !interfaceC7158xl.mo1221f0().isEmpty()) {
            if (!AbstractC11955zg0.m26496z(interfaceC7158xl)) {
                return false;
            }
            Collection collectionMo1222j = interfaceC7158xl.mo1222j();
            O90.m5967e(collectionMo1222j, "getOverriddenDescriptors(...)");
            Collection<InterfaceC7158xl> collection = collectionMo1222j;
            if (collection.isEmpty()) {
                return false;
            }
            for (InterfaceC7158xl interfaceC7158xl2 : collection) {
                O90.m5965c(interfaceC7158xl2);
                if (m5691a(interfaceC7158xl2)) {
                }
            }
            return false;
        }
        return true;
    }
}
