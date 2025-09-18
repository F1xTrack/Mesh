package ru.p031ok.tracer.lite.crash.report;

import kotlin.Metadata;
import p000.AbstractC9225eJ0;
import ru.p031ok.tracer.Tracer;

@Metadata(m22266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, m22267d2 = {"hasTracer", "", "isObfuscated", "tracer-lite-crash-report_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
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
            AbstractC9225eJ0.f26655a.getClass();
            String str = BuildConfig.LIBRARY_PACKAGE_NAME + ((char) ((AbstractC9225eJ0.f26656b.mo6523b() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
            return !Class.forName(str).getName().equals(str);
        } catch (Throwable unused) {
            return true;
        }
    }
}
