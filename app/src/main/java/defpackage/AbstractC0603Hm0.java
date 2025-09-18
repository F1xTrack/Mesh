package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: Hm0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0603Hm0 {
    public static final C8097y20 a;

    static {
        String property;
        int i = Z71.a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = AbstractC4175hY0.n(AbstractC4175hY0.d(Arrays.asList(new C5433k4()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iA = ((C5433k4) next).a();
                    do {
                        Object next2 = it.next();
                        int iA2 = ((C5433k4) next2).a();
                        if (iA < iA2) {
                            next = next2;
                            iA = iA2;
                        }
                    } while (it.hasNext());
                }
            }
            C5433k4 c5433k4 = (C5433k4) next;
            if (c5433k4 == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                c5433k4.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                a = new C8097y20(AbstractC8287z20.a(mainLooper));
            } catch (Throwable th) {
                c5433k4.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
