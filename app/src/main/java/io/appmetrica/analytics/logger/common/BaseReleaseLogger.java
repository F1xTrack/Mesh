package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.C5662a;
import io.appmetrica.analytics.logger.common.impl.C5663b;
import io.appmetrica.analytics.logger.common.impl.C5664c;
import io.appmetrica.analytics.logger.common.impl.C5665d;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d */
    private static volatile String f33018d = "";

    /* renamed from: a */
    private final String f33019a;

    /* renamed from: b */
    private volatile boolean f33020b = false;

    /* renamed from: c */
    private final C5664c f33021c;

    public BaseReleaseLogger(String str, String str2) {
        this.f33021c = new C5664c(new C5665d(str), new C5662a(), new C5663b());
        this.f33019a = str2;
    }

    public static void init(Context context) {
        f33018d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f33020b) {
            C5664c c5664c = this.f33021c;
            String prefix = getPrefix();
            c5664c.f33024b.getClass();
            Iterator it = c5664c.f33025c.m21286a(C5662a.m21285a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = c5664c.f33023a.f33026a;
            }
        }
    }

    public String getPrefix() {
        return f33018d + this.f33019a;
    }

    public void info(String str, Object... objArr) {
        if (this.f33020b) {
            C5664c c5664c = this.f33021c;
            String prefix = getPrefix();
            c5664c.f33024b.getClass();
            Iterator it = c5664c.f33025c.m21286a(C5662a.m21285a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = c5664c.f33023a.f33026a;
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f33020b = z;
    }

    public void warning(String str, Object... objArr) {
        if (this.f33020b) {
            C5664c c5664c = this.f33021c;
            String prefix = getPrefix();
            c5664c.f33024b.getClass();
            Iterator it = c5664c.f33025c.m21286a(C5662a.m21285a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = c5664c.f33023a.f33026a;
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f33020b) {
            C5664c c5664c = this.f33021c;
            String prefix = getPrefix();
            c5664c.f33024b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Iterator it = c5664c.f33025c.m21286a(C5662a.m21285a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = c5664c.f33023a.f33026a;
            }
        }
    }
}
