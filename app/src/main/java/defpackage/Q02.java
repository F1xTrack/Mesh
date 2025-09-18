package defpackage;

import android.view.View;
import java.util.HashSet;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class Q02 {
    public static final InterfaceC0974Mg0 a(InterfaceC0974Mg0 interfaceC0974Mg0, HashSet hashSet) {
        InterfaceC0974Mg0 interfaceC0974Mg0A;
        C0240Cv0 c0240Cv0 = C0240Cv0.g;
        InterfaceC1200Pd1 interfaceC1200Pd1Q0 = c0240Cv0.q0(interfaceC0974Mg0);
        if (!hashSet.add(interfaceC1200Pd1Q0)) {
            return null;
        }
        InterfaceC5925me1 interfaceC5925me1O = US1.o(interfaceC1200Pd1Q0);
        if (interfaceC5925me1O != null) {
            InterfaceC0974Mg0 interfaceC0974Mg0G = CZ1.g(interfaceC5925me1O);
            interfaceC0974Mg0A = a(interfaceC0974Mg0G, hashSet);
            if (interfaceC0974Mg0A == null) {
                return null;
            }
            boolean z = US1.y(c0240Cv0.q0(interfaceC0974Mg0G)) || ((interfaceC0974Mg0G instanceof Z01) && US1.E((Z01) interfaceC0974Mg0G));
            if ((interfaceC0974Mg0A instanceof Z01) && US1.E((Z01) interfaceC0974Mg0A) && US1.D(interfaceC0974Mg0) && z) {
                return c0240Cv0.F0(interfaceC0974Mg0G);
            }
            if (!US1.D(interfaceC0974Mg0A) && (interfaceC0974Mg0 instanceof Z01) && US1.B((Z01) interfaceC0974Mg0)) {
                return c0240Cv0.F0(interfaceC0974Mg0A);
            }
        } else {
            if (!US1.y(interfaceC1200Pd1Q0)) {
                return interfaceC0974Mg0;
            }
            O90.f(interfaceC0974Mg0, "$receiver");
            if (!(interfaceC0974Mg0 instanceof AbstractC0663Ig0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC0974Mg0);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC8235ym.h(BP0.a, interfaceC0974Mg0.getClass(), sb).toString());
            }
            X01 x01H = AbstractC7355u80.h((AbstractC0663Ig0) interfaceC0974Mg0);
            if (x01H == null || (interfaceC0974Mg0A = a(x01H, hashSet)) == null) {
                return null;
            }
            if (US1.D(interfaceC0974Mg0)) {
                return US1.D(interfaceC0974Mg0A) ? interfaceC0974Mg0 : ((interfaceC0974Mg0A instanceof Z01) && US1.E((Z01) interfaceC0974Mg0A)) ? interfaceC0974Mg0 : c0240Cv0.F0(interfaceC0974Mg0A);
            }
        }
        return interfaceC0974Mg0A;
    }

    public static final void b(View view, InterfaceC6088nV0 interfaceC6088nV0) {
        O90.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC6088nV0);
    }
}
