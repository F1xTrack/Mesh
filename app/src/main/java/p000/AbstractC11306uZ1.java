package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: uZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC11306uZ1 {
    /* renamed from: a */
    public static final C10910rT1 m25208a(X01 x01, InterfaceC0936Os interfaceC0936Os, int i) {
        if (interfaceC0936Os == null || C6298kP.m22200f(interfaceC0936Os)) {
            return null;
        }
        int size = interfaceC0936Os.mo1438o().size() + i;
        if (interfaceC0936Os.mo1431N()) {
            List listSubList = x01.mo3800u().subList(i, size);
            InterfaceC0140CD interfaceC0140CDMo423i = interfaceC0936Os.mo423i();
            return new C10910rT1(interfaceC0936Os, listSubList, m25208a(x01, interfaceC0140CDMo423i instanceof InterfaceC0936Os ? (InterfaceC0936Os) interfaceC0140CDMo423i : null, size));
        }
        if (size != x01.mo3800u().size()) {
            AbstractC6814sI.m24703o(interfaceC0936Os);
        }
        return new C10910rT1(interfaceC0936Os, x01.mo3800u().subList(i, x01.mo3800u().size()), (C10910rT1) null);
    }

    /* renamed from: b */
    public static final List m25209b(InterfaceC0936Os interfaceC0936Os) {
        List parameters;
        Object next;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v;
        O90.m5968f(interfaceC0936Os, "<this>");
        List listMo1438o = interfaceC0936Os.mo1438o();
        O90.m5967e(listMo1438o, "getDeclaredTypeParameters(...)");
        if (!interfaceC0936Os.mo1431N() && !(interfaceC0936Os.mo423i() instanceof InterfaceC7032vl)) {
            return listMo1438o;
        }
        int i = AbstractC6940uI.f43634a;
        C6228jI c6228jI = C6228jI.f35036n;
        List listM18835n = AbstractC9639hY0.m18835n(new C1790bW(new C7141xU(new C0764M8(4, AbstractC9639hY0.m18828g(AbstractC9639hY0.m18832k(interfaceC0936Os, c6228jI), 1)), true, XS0.f13767G), XS0.f13768H, C9895jY0.f35220a));
        Iterator it = AbstractC9639hY0.m18828g(AbstractC9639hY0.m18832k(interfaceC0936Os, c6228jI), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC6976us) {
                break;
            }
        }
        InterfaceC6976us interfaceC6976us = (InterfaceC6976us) next;
        if (interfaceC6976us != null && (interfaceC8101Pd1Mo1439v = interfaceC6976us.mo1439v()) != null) {
            parameters = interfaceC8101Pd1Mo1439v.getParameters();
        }
        if (parameters == null) {
            parameters = C0779MN.f7117a;
        }
        if (listM18835n.isEmpty() && parameters.isEmpty()) {
            List listMo1438o2 = interfaceC0936Os.mo1438o();
            O90.m5967e(listMo1438o2, "getDeclaredTypeParameters(...)");
            return listMo1438o2;
        }
        ArrayList arrayListM25968N = AbstractC7167xu.m25968N(listM18835n, parameters);
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayListM25968N));
        Iterator it2 = arrayListM25968N.iterator();
        while (it2.hasNext()) {
            InterfaceC10292me1 interfaceC10292me1 = (InterfaceC10292me1) it2.next();
            O90.m5965c(interfaceC10292me1);
            arrayList.add(new C6705qq(interfaceC10292me1, interfaceC0936Os, listMo1438o.size()));
        }
        return AbstractC7167xu.m25968N(listMo1438o, arrayList);
    }

    /* renamed from: c */
    public static String m25210c(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }
}
