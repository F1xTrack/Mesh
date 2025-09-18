package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class W9 {
    public static volatile W9 c;
    public final Context a;
    public final HashMap b = new HashMap();

    public W9(Context context) {
        this.a = context;
    }

    public static W9 a(Context context) {
        if (c == null) {
            synchronized (W9.class) {
                try {
                    if (c == null) {
                        c = new W9(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public final C4881t9 a(String str) {
        if (!this.b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.b.containsKey(str)) {
                        this.b.put(str, new C4881t9(this.a, str));
                    }
                } finally {
                }
            }
        }
        return (C4881t9) this.b.get(str);
    }
}
