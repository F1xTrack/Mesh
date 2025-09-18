package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class I22 {
    public static boolean a(InterfaceC7662vl interfaceC7662vl, InterfaceC7662vl interfaceC7662vl2) {
        O90.f(interfaceC7662vl, "superDescriptor");
        O90.f(interfaceC7662vl2, "subDescriptor");
        if ((interfaceC7662vl2 instanceof C3611eb0) && (interfaceC7662vl instanceof AZ)) {
            C3611eb0 c3611eb0 = (C3611eb0) interfaceC7662vl2;
            c3611eb0.f0().size();
            AZ az = (AZ) interfaceC7662vl;
            az.f0().size();
            List listF0 = c3611eb0.a().f0();
            O90.e(listF0, "getValueParameters(...)");
            List listF02 = az.x1().f0();
            O90.e(listF02, "getValueParameters(...)");
            Iterator it = AbstractC8069xu.i0(listF0, listF02).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C1758Wh1 c1758Wh1 = (C1758Wh1) pair.a;
                C1758Wh1 c1758Wh12 = (C1758Wh1) pair.b;
                O90.c(c1758Wh1);
                boolean z = b((AZ) interfaceC7662vl2, c1758Wh1) instanceof C0965Md0;
                O90.c(c1758Wh12);
                if (z != (b(az, c1758Wh12) instanceof C0965Md0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (defpackage.AbstractC7384uI.g(r0).equals(defpackage.AbstractC7384uI.g(r3)) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.AbstractC1043Nd0 b(defpackage.AZ r8, defpackage.C1758Wh1 r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I22.b(AZ, Wh1):Nd0");
    }

    public static Object c(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC1705Vq.l(F91.x("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static void d(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
