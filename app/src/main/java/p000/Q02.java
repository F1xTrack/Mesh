package p000;

import android.view.View;
import java.util.HashSet;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public abstract class Q02 {
    /* renamed from: a */
    public static final InterfaceC7950Mg0 m6527a(InterfaceC7950Mg0 interfaceC7950Mg0, HashSet hashSet) {
        InterfaceC7950Mg0 interfaceC7950Mg0M6527a;
        C7460Cv0 c7460Cv0 = C7460Cv0.f1757g;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1101q0 = c7460Cv0.mo1101q0(interfaceC7950Mg0);
        if (!hashSet.add(interfaceC8101Pd1Mo1101q0)) {
            return null;
        }
        InterfaceC10292me1 interfaceC10292me1M8055o = US1.m8055o(interfaceC8101Pd1Mo1101q0);
        if (interfaceC10292me1M8055o != null) {
            InterfaceC7950Mg0 interfaceC7950Mg0M1231g = CZ1.m1231g(interfaceC10292me1M8055o);
            interfaceC7950Mg0M6527a = m6527a(interfaceC7950Mg0M1231g, hashSet);
            if (interfaceC7950Mg0M6527a == null) {
                return null;
            }
            boolean z = US1.m8065y(c7460Cv0.mo1101q0(interfaceC7950Mg0M1231g)) || ((interfaceC7950Mg0M1231g instanceof Z01) && US1.m8021E((Z01) interfaceC7950Mg0M1231g));
            if ((interfaceC7950Mg0M6527a instanceof Z01) && US1.m8021E((Z01) interfaceC7950Mg0M6527a) && US1.m8020D(interfaceC7950Mg0) && z) {
                return c7460Cv0.m1463F0(interfaceC7950Mg0M1231g);
            }
            if (!US1.m8020D(interfaceC7950Mg0M6527a) && (interfaceC7950Mg0 instanceof Z01) && US1.m8018B((Z01) interfaceC7950Mg0)) {
                return c7460Cv0.m1463F0(interfaceC7950Mg0M6527a);
            }
        } else {
            if (!US1.m8065y(interfaceC8101Pd1Mo1101q0)) {
                return interfaceC7950Mg0;
            }
            O90.m5968f(interfaceC7950Mg0, "$receiver");
            if (!(interfaceC7950Mg0 instanceof AbstractC7742Ig0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC7950Mg0);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC7222ym.m26231h(BP0.f799a, interfaceC7950Mg0.getClass(), sb).toString());
            }
            X01 x01M25123h = AbstractC11251u80.m25123h((AbstractC7742Ig0) interfaceC7950Mg0);
            if (x01M25123h == null || (interfaceC7950Mg0M6527a = m6527a(x01M25123h, hashSet)) == null) {
                return null;
            }
            if (US1.m8020D(interfaceC7950Mg0)) {
                return US1.m8020D(interfaceC7950Mg0M6527a) ? interfaceC7950Mg0 : ((interfaceC7950Mg0M6527a instanceof Z01) && US1.m8021E((Z01) interfaceC7950Mg0M6527a)) ? interfaceC7950Mg0 : c7460Cv0.m1463F0(interfaceC7950Mg0M6527a);
            }
        }
        return interfaceC7950Mg0M6527a;
    }

    /* renamed from: b */
    public static final void m6528b(View view, InterfaceC10401nV0 interfaceC10401nV0) {
        O90.m5968f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC10401nV0);
    }
}
