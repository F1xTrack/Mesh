package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: e02 */
/* loaded from: classes.dex */
public abstract class AbstractC9185e02 {
    /* renamed from: a */
    public static final ArrayList m17812a(List list, Collection collection, InterfaceC0036AZ interfaceC0036AZ) {
        O90.m5968f(collection, "oldValueParameters");
        list.size();
        collection.size();
        ArrayList arrayListM25989i0 = AbstractC7167xu.m25989i0(list, collection);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayListM25989i0));
        Iterator it = arrayListM25989i0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) pair.f36702a;
            C8473Wh1 c8473Wh1 = (C8473Wh1) pair.f36703b;
            int i = c8473Wh1.f13323g;
            InterfaceC0510I5 annotations = c8473Wh1.getAnnotations();
            C8340Tt0 name = c8473Wh1.getName();
            O90.m5967e(name, "getName(...)");
            boolean zM8832z1 = c8473Wh1.m8832z1();
            AbstractC7742Ig0 abstractC7742Ig0M26499f = c8473Wh1.f13327k != null ? AbstractC6940uI.m25157j(interfaceC0036AZ).mo897h().m26499f(abstractC7742Ig0) : null;
            W21 w21Mo422e = c8473Wh1.mo422e();
            O90.m5967e(w21Mo422e, "getSource(...)");
            arrayList.add(new C8473Wh1(interfaceC0036AZ, null, i, annotations, name, abstractC7742Ig0, zM8832z1, c8473Wh1.f13325i, c8473Wh1.f13326j, abstractC7742Ig0M26499f, w21Mo422e));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C8264Sh0 m17813b(InterfaceC6976us interfaceC6976us) {
        InterfaceC6976us interfaceC6976us2;
        InterfaceC0873Ns interfaceC0873NsMo1962a;
        O90.m5968f(interfaceC6976us, "<this>");
        int i = AbstractC6940uI.f43634a;
        Iterator it = interfaceC6976us.mo1492m().mo3797E().mo5276b().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC6976us2 = null;
                break;
            }
            AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) it.next();
            if (!AbstractC11955zg0.m26494x(abstractC7742Ig0)) {
                interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
                int i2 = AbstractC6814sI.f42360a;
                if (AbstractC6814sI.m24702n(interfaceC0873NsMo1962a, EnumC0118Bs.f1060a) || AbstractC6814sI.m24702n(interfaceC0873NsMo1962a, EnumC0118Bs.f1062c)) {
                    break;
                }
            }
        }
        O90.m5966d(interfaceC0873NsMo1962a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        interfaceC6976us2 = (InterfaceC6976us) interfaceC0873NsMo1962a;
        if (interfaceC6976us2 == null) {
            return null;
        }
        InterfaceC10059kq0 interfaceC10059kq0Mo1433W = interfaceC6976us2.mo1433W();
        C8264Sh0 c8264Sh0 = interfaceC10059kq0Mo1433W instanceof C8264Sh0 ? (C8264Sh0) interfaceC10059kq0Mo1433W : null;
        return c8264Sh0 == null ? m17813b(interfaceC6976us2) : c8264Sh0;
    }

    /* renamed from: c */
    public static boolean m17814c(Throwable th) {
        return AbstractC7485Dh1.f2166a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    /* renamed from: d */
    public static boolean m17815d(Throwable th) {
        return AbstractC7485Dh1.f2166a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
