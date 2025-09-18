package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.Ub */
/* loaded from: classes2.dex */
public final class C4851Ub {

    /* renamed from: a */
    public volatile String f30808a;

    /* renamed from: a */
    public static String m19884a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: b */
    public final String m19886b() {
        if (this.f30808a != null) {
            return this.f30808a;
        }
        synchronized (this) {
            try {
                if (this.f30808a == null) {
                    this.f30808a = m19884a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f30808a;
    }

    /* renamed from: c */
    public final boolean m19887c() {
        try {
            if (TextUtils.isEmpty(m19886b())) {
                return false;
            }
            return !m19886b().contains(StringUtils.PROCESS_POSTFIX_DELIMITER);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean m19885a(String str) {
        try {
            if (TextUtils.isEmpty(m19886b())) {
                return false;
            }
            String strM19886b = m19886b();
            StringBuilder sb = new StringBuilder(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return strM19886b.endsWith(sb.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
