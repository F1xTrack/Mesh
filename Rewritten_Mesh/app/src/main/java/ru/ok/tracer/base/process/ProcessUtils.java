package ru.ok.tracer.base.process;

import android.content.Context;
import defpackage.AbstractC7538v51;
import defpackage.D51;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0001\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"processName", "", "getProcessName", "context", "Landroid/content/Context;", "getSimpleProcessName", "simplifyProcessName", "packageName", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProcessUtils {
    private static volatile String processName;

    public static final String getProcessName(Context context) {
        O90.f(context, "context");
        String str = processName;
        if (str != null) {
            return str;
        }
        String processName$readProcessName = getProcessName$readProcessName();
        processName = processName$readProcessName;
        return processName$readProcessName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r0 = r0.substring(0, r4);
        defpackage.O90.e(r0, "this as java.lang.String…ing(startIndex, endIndex)");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String getProcessName$readProcessName() {
        /*
            java.lang.String r0 = "/proc/"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L12
            java.lang.String r0 = defpackage.AbstractC6424pG.o()
            java.lang.String r1 = "{\n            Applicatio…etProcessName()\n        }"
            defpackage.O90.e(r0, r1)
            goto L6a
        L12:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L68
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L68
            r2.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L68
            java.nio.charset.Charset r0 = defpackage.AbstractC7680vr.b     // Catch: java.lang.Throwable -> L68
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L68
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L68
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = defpackage.AbstractC7803wU1.d(r2)     // Catch: java.lang.Throwable -> L5b
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L5b
            r3 = 0
            r4 = r3
        L42:
            if (r4 >= r1) goto L5d
            char r5 = r0.charAt(r4)     // Catch: java.lang.Throwable -> L5b
            int r5 = defpackage.O90.h(r5, r3)     // Catch: java.lang.Throwable -> L5b
            if (r5 <= 0) goto L51
            int r4 = r4 + 1
            goto L42
        L51:
            java.lang.String r0 = r0.substring(r3, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            defpackage.O90.e(r0, r1)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L62
        L5d:
            r1 = 0
            defpackage.AbstractC2141aT1.a(r2, r1)     // Catch: java.lang.Throwable -> L68
            goto L6a
        L62:
            throw r0     // Catch: java.lang.Throwable -> L63
        L63:
            r1 = move-exception
            defpackage.AbstractC2141aT1.a(r2, r0)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        L68:
            java.lang.String r0 = "unknown"
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.base.process.ProcessUtils.getProcessName$readProcessName():java.lang.String");
    }

    public static final String getSimpleProcessName(Context context) {
        O90.f(context, "context");
        String processName2 = getProcessName(context);
        String packageName = context.getPackageName();
        O90.e(packageName, "context.packageName");
        return simplifyProcessName(processName2, packageName);
    }

    public static final String simplifyProcessName(String str, String str2) {
        O90.f(str2, "packageName");
        if (str == null || str.equals(str2)) {
            return null;
        }
        int iZ = AbstractC7538v51.z(str, ':', 0, false, 6);
        if (iZ != str2.length() || !D51.o(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(iZ);
        O90.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
