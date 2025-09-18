package io.sentry.android.core.internal.threaddump;

import io.sentry.C5151o1;
import io.sentry.D1;
import io.sentry.I1;
import io.sentry.protocol.z;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c {
    public static final Pattern d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");
    public static final Pattern g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");
    public static final Pattern h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern o = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern p = Pattern.compile("\\s+");
    public final D1 a;
    public final boolean b;
    public final I1 c;

    public c(D1 d1, boolean z) {
        this.a = d1;
        this.b = z;
        this.c = new I1(d1, 0);
    }

    public static void a(z zVar, C5151o1 c5151o1) {
        Map map = zVar.j;
        if (map == null) {
            map = new HashMap();
        }
        C5151o1 c5151o12 = (C5151o1) map.get(c5151o1.b);
        if (c5151o12 != null) {
            c5151o12.a = Math.max(c5151o12.a, c5151o1.a);
        } else {
            String str = c5151o1.b;
            C5151o1 c5151o13 = new C5151o1();
            c5151o13.a = c5151o1.a;
            c5151o13.b = str;
            c5151o13.c = c5151o1.c;
            c5151o13.d = c5151o1.d;
            c5151o13.e = c5151o1.e;
            c5151o13.f = io.sentry.config.a.A(c5151o1.f);
            map.put(str, c5151o13);
        }
        zVar.j = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ad A[EDGE_INSN: B:137:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList d(io.sentry.android.core.internal.threaddump.b r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.c.d(io.sentry.android.core.internal.threaddump.b):java.util.ArrayList");
    }
}
