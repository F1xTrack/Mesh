package io.appmetrica.analytics.logger.common;

import io.appmetrica.analytics.logger.common.impl.C5662a;
import io.appmetrica.analytics.logger.common.impl.C5663b;
import io.appmetrica.analytics.logger.common.impl.C5664c;
import io.appmetrica.analytics.logger.common.impl.C5665d;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BaseImportantLogger {

    /* renamed from: a */
    private final C5664c f33017a;

    public BaseImportantLogger(String str) {
        this.f33017a = new C5664c(new C5665d(str), new C5662a(), new C5663b());
    }

    public void info(String str, String str2, Object... objArr) {
        C5664c c5664c = this.f33017a;
        c5664c.f33024b.getClass();
        Iterator it = c5664c.f33025c.m21286a(C5662a.m21285a(str, str2, objArr)).iterator();
        while (it.hasNext()) {
            String str3 = c5664c.f33023a.f33026a;
        }
    }
}
