package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: uZ1 */
/* loaded from: classes.dex */
public abstract class AbstractC7437uZ1 {
    public static final C6846rT1 a(X01 x01, InterfaceC1165Os interfaceC1165Os, int i) {
        if (interfaceC1165Os == null || C5496kP.f(interfaceC1165Os)) {
            return null;
        }
        int size = interfaceC1165Os.o().size() + i;
        if (interfaceC1165Os.N()) {
            List listSubList = x01.u().subList(i, size);
            CD cdI = interfaceC1165Os.i();
            return new C6846rT1(interfaceC1165Os, listSubList, a(x01, cdI instanceof InterfaceC1165Os ? (InterfaceC1165Os) cdI : null, size));
        }
        if (size != x01.u().size()) {
            AbstractC7002sI.o(interfaceC1165Os);
        }
        return new C6846rT1(interfaceC1165Os, x01.u().subList(i, x01.u().size()), (C6846rT1) null);
    }

    public static final List b(InterfaceC1165Os interfaceC1165Os) {
        List parameters;
        Object next;
        InterfaceC1200Pd1 interfaceC1200Pd1V;
        O90.f(interfaceC1165Os, "<this>");
        List listO = interfaceC1165Os.o();
        O90.e(listO, "getDeclaredTypeParameters(...)");
        if (!interfaceC1165Os.N() && !(interfaceC1165Os.i() instanceof InterfaceC7662vl)) {
            return listO;
        }
        int i = AbstractC7384uI.a;
        C5284jI c5284jI = C5284jI.n;
        List listN = AbstractC4175hY0.n(new C2339bW(new C7991xU(new M8(4, AbstractC4175hY0.g(AbstractC4175hY0.k(interfaceC1165Os, c5284jI), 1)), true, XS0.G), XS0.H, C5333jY0.a));
        Iterator it = AbstractC4175hY0.g(AbstractC4175hY0.k(interfaceC1165Os, c5284jI), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC7492us) {
                break;
            }
        }
        InterfaceC7492us interfaceC7492us = (InterfaceC7492us) next;
        if (interfaceC7492us != null && (interfaceC1200Pd1V = interfaceC7492us.v()) != null) {
            parameters = interfaceC1200Pd1V.getParameters();
        }
        if (parameters == null) {
            parameters = MN.a;
        }
        if (listN.isEmpty() && parameters.isEmpty()) {
            List listO2 = interfaceC1165Os.o();
            O90.e(listO2, "getDeclaredTypeParameters(...)");
            return listO2;
        }
        ArrayList arrayListN = AbstractC8069xu.N(listN, parameters);
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(arrayListN));
        Iterator it2 = arrayListN.iterator();
        while (it2.hasNext()) {
            InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) it2.next();
            O90.c(interfaceC5925me1);
            arrayList.add(new C6723qq(interfaceC5925me1, interfaceC1165Os, listO.size()));
        }
        return AbstractC8069xu.N(listO, arrayList);
    }

    public static String c(long j) {
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
