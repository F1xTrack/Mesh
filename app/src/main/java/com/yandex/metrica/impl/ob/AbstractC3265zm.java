package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.zm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3265zm {
    private static Map<String, Im> a = new HashMap();
    private static Map<String, C3215xm> b = new HashMap();
    private static final Object c = new Object();
    private static final Object d = new Object();
    public static final /* synthetic */ int e = 0;

    public static C3215xm a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C3215xm.g();
        }
        C3215xm c3215xm = b.get(str);
        if (c3215xm == null) {
            synchronized (d) {
                try {
                    c3215xm = b.get(str);
                    if (c3215xm == null) {
                        c3215xm = new C3215xm(str);
                        b.put(str, c3215xm);
                    }
                } finally {
                }
            }
        }
        return c3215xm;
    }

    public static Im b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Im.g();
        }
        Im im = a.get(str);
        if (im == null) {
            synchronized (c) {
                try {
                    im = a.get(str);
                    if (im == null) {
                        im = new Im(str);
                        a.put(str, im);
                    }
                } finally {
                }
            }
        }
        return im;
    }

    public static Im a() {
        return Im.g();
    }
}
