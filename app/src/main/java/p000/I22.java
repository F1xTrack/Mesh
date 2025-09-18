package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class I22 {
    /* renamed from: a */
    public static boolean m3733a(InterfaceC7032vl interfaceC7032vl, InterfaceC7032vl interfaceC7032vl2) {
        O90.m5968f(interfaceC7032vl, "superDescriptor");
        O90.m5968f(interfaceC7032vl2, "subDescriptor");
        if ((interfaceC7032vl2 instanceof C9261eb0) && (interfaceC7032vl instanceof InterfaceC0036AZ)) {
            C9261eb0 c9261eb0 = (C9261eb0) interfaceC7032vl2;
            c9261eb0.mo1221f0().size();
            InterfaceC0036AZ interfaceC0036AZ = (InterfaceC0036AZ) interfaceC7032vl;
            interfaceC0036AZ.mo1221f0().size();
            List listMo1221f0 = c9261eb0.mo229a().mo1221f0();
            O90.m5967e(listMo1221f0, "getValueParameters(...)");
            List listMo1221f02 = interfaceC0036AZ.mo2089x1().mo1221f0();
            O90.m5967e(listMo1221f02, "getValueParameters(...)");
            Iterator it = AbstractC7167xu.m25989i0(listMo1221f0, listMo1221f02).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C8473Wh1 c8473Wh1 = (C8473Wh1) pair.f36702a;
                C8473Wh1 c8473Wh12 = (C8473Wh1) pair.f36703b;
                O90.m5965c(c8473Wh1);
                boolean z = m3734b((InterfaceC0036AZ) interfaceC7032vl2, c8473Wh1) instanceof C7944Md0;
                O90.m5965c(c8473Wh12);
                if (z != (m3734b(interfaceC0036AZ, c8473Wh12) instanceof C7944Md0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (p000.AbstractC6940uI.m25154g(r0).equals(p000.AbstractC6940uI.m25154g(r3)) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.AbstractC7996Nd0 m3734b(p000.InterfaceC0036AZ r8, p000.C8473Wh1 r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.I22.m3734b(AZ, Wh1):Nd0");
    }

    /* renamed from: c */
    public static Object m3735c(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC1374Vq.m8593l(F91.m2541x("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    /* renamed from: d */
    public static void m3736d(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
