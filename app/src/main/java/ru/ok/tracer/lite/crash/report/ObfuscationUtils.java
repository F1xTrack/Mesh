package ru.ok.tracer.lite.crash.report;

import defpackage.AbstractC3557eJ0;
import kotlin.Metadata;
import ru.ok.tracer.Tracer;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, d2 = {"hasTracer", "", "isObfuscated", "tracer-lite-crash-report_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ObfuscationUtils {
    public static final boolean hasTracer() {
        try {
            Tracer tracer = Tracer.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean isObfuscated() {
        try {
            AbstractC3557eJ0.a.getClass();
            String str = BuildConfig.LIBRARY_PACKAGE_NAME + ((char) ((AbstractC3557eJ0.b.b() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
            return !Class.forName(str).getName().equals(str);
        } catch (Throwable unused) {
            return true;
        }
    }
}
