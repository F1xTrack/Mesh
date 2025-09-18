package p000;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: Hm0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7702Hm0 {

    /* renamed from: a */
    public static final C11747y20 f4486a;

    static {
        String property;
        int i = Z71.f14753a;
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
            Iterator it = AbstractC9639hY0.m18835n(AbstractC9639hY0.m18825d(Arrays.asList(new C6277k4()).iterator())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iM22144a = ((C6277k4) next).m22144a();
                    do {
                        Object next2 = it.next();
                        int iM22144a2 = ((C6277k4) next2).m22144a();
                        if (iM22144a < iM22144a2) {
                            next = next2;
                            iM22144a = iM22144a2;
                        }
                    } while (it.hasNext());
                }
            }
            C6277k4 c6277k4 = (C6277k4) next;
            if (c6277k4 == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            try {
                c6277k4.getClass();
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null) {
                    throw new IllegalStateException("The main looper is not available");
                }
                f4486a = new C11747y20(AbstractC11874z20.m26306a(mainLooper));
            } catch (Throwable th) {
                c6277k4.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
