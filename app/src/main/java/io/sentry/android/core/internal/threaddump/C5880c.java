package io.sentry.android.core.internal.threaddump;

import io.sentry.C5759D1;
import io.sentry.C5774I1;
import io.sentry.C6072o1;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6110z;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.internal.threaddump.c */
/* loaded from: classes2.dex */
public final class C5880c {

    /* renamed from: d */
    public static final Pattern f33732d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: e */
    public static final Pattern f33733e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: f */
    public static final Pattern f33734f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: g */
    public static final Pattern f33735g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: h */
    public static final Pattern f33736h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: i */
    public static final Pattern f33737i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: j */
    public static final Pattern f33738j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k */
    public static final Pattern f33739k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l */
    public static final Pattern f33740l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m */
    public static final Pattern f33741m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n */
    public static final Pattern f33742n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: o */
    public static final Pattern f33743o = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: p */
    public static final Pattern f33744p = Pattern.compile("\\s+");

    /* renamed from: a */
    public final C5759D1 f33745a;

    /* renamed from: b */
    public final boolean f33746b;

    /* renamed from: c */
    public final C5774I1 f33747c;

    public C5880c(C5759D1 c5759d1, boolean z) {
        this.f33745a = c5759d1;
        this.f33746b = z;
        this.f33747c = new C5774I1(c5759d1, 0);
    }

    /* renamed from: a */
    public static void m21577a(C6110z c6110z, C6072o1 c6072o1) {
        Map map = c6110z.f34496j;
        if (map == null) {
            map = new HashMap();
        }
        C6072o1 c6072o12 = (C6072o1) map.get(c6072o1.f34262b);
        if (c6072o12 != null) {
            c6072o12.f34261a = Math.max(c6072o12.f34261a, c6072o1.f34261a);
        } else {
            String str = c6072o1.f34262b;
            C6072o1 c6072o13 = new C6072o1();
            c6072o13.f34261a = c6072o1.f34261a;
            c6072o13.f34262b = str;
            c6072o13.f34263c = c6072o1.f34263c;
            c6072o13.f34264d = c6072o1.f34264d;
            c6072o13.f34265e = c6072o1.f34265e;
            c6072o13.f34266f = AbstractC6003a.m21732A(c6072o1.f34266f);
            map.put(str, c6072o13);
        }
        c6110z.f34496j = map;
    }

    /* renamed from: b */
    public static Long m21578b(Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    /* renamed from: c */
    public static boolean m21579c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ad A[EDGE_INSN: B:137:0x03ad->B:125:0x03ad BREAK  A[LOOP:1: B:54:0x017e->B:124:0x039f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList m21580d(io.sentry.android.core.internal.threaddump.C5879b r34) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.C5880c.m21580d(io.sentry.android.core.internal.threaddump.b):java.util.ArrayList");
    }
}
