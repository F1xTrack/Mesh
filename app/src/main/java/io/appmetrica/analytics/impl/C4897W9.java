package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.W9 */
/* loaded from: classes2.dex */
public final class C4897W9 {

    /* renamed from: c */
    public static volatile C4897W9 f30935c;

    /* renamed from: a */
    public final Context f30936a;

    /* renamed from: b */
    public final HashMap f30937b = new HashMap();

    public C4897W9(Context context) {
        this.f30936a = context;
    }

    /* renamed from: a */
    public static C4897W9 m19944a(Context context) {
        if (f30935c == null) {
            synchronized (C4897W9.class) {
                try {
                    if (f30935c == null) {
                        f30935c = new C4897W9(context);
                    }
                } finally {
                }
            }
        }
        return f30935c;
    }

    /* renamed from: a */
    public final C5468t9 m19945a(String str) {
        if (!this.f30937b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f30937b.containsKey(str)) {
                        this.f30937b.put(str, new C5468t9(this.f30936a, str));
                    }
                } finally {
                }
            }
        }
        return (C5468t9) this.f30937b.get(str);
    }
}
