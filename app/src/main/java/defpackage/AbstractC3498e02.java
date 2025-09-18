package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: e02 */
/* loaded from: classes.dex */
public abstract class AbstractC3498e02 {
    public static final ArrayList a(List list, Collection collection, AZ az) {
        O90.f(collection, "oldValueParameters");
        list.size();
        collection.size();
        ArrayList arrayListI0 = AbstractC8069xu.i0(list, collection);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayListI0));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) pair.a;
            C1758Wh1 c1758Wh1 = (C1758Wh1) pair.b;
            int i = c1758Wh1.g;
            I5 annotations = c1758Wh1.getAnnotations();
            C1559Tt0 name = c1758Wh1.getName();
            O90.e(name, "getName(...)");
            boolean zZ1 = c1758Wh1.z1();
            AbstractC0663Ig0 abstractC0663Ig0F = c1758Wh1.k != null ? AbstractC7384uI.j(az).h().f(abstractC0663Ig0) : null;
            W21 w21E = c1758Wh1.e();
            O90.e(w21E, "getSource(...)");
            arrayList.add(new C1758Wh1(az, null, i, annotations, name, abstractC0663Ig0, zZ1, c1758Wh1.i, c1758Wh1.j, abstractC0663Ig0F, w21E));
        }
        return arrayList;
    }

    public static final C1445Sh0 b(InterfaceC7492us interfaceC7492us) {
        InterfaceC7492us interfaceC7492us2;
        InterfaceC1087Ns interfaceC1087NsA;
        O90.f(interfaceC7492us, "<this>");
        int i = AbstractC7384uI.a;
        Iterator it = interfaceC7492us.m().E().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC7492us2 = null;
                break;
            }
            AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) it.next();
            if (!AbstractC8408zg0.x(abstractC0663Ig0)) {
                interfaceC1087NsA = abstractC0663Ig0.E().a();
                int i2 = AbstractC7002sI.a;
                if (AbstractC7002sI.n(interfaceC1087NsA, EnumC0152Bs.a) || AbstractC7002sI.n(interfaceC1087NsA, EnumC0152Bs.c)) {
                    break;
                }
            }
        }
        O90.d(interfaceC1087NsA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        interfaceC7492us2 = (InterfaceC7492us) interfaceC1087NsA;
        if (interfaceC7492us2 == null) {
            return null;
        }
        InterfaceC5578kq0 interfaceC5578kq0W = interfaceC7492us2.W();
        C1445Sh0 c1445Sh0 = interfaceC5578kq0W instanceof C1445Sh0 ? (C1445Sh0) interfaceC5578kq0W : null;
        return c1445Sh0 == null ? b(interfaceC7492us2) : c1445Sh0;
    }

    public static boolean c(Throwable th) {
        return AbstractC0277Dh1.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean d(Throwable th) {
        return AbstractC0277Dh1.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
