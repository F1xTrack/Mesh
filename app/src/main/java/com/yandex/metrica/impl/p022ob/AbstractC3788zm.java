package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.zm */
/* loaded from: classes2.dex */
public abstract class AbstractC3788zm {

    /* renamed from: a */
    private static Map<String, C2689Im> f25448a = new HashMap();

    /* renamed from: b */
    private static Map<String, C3736xm> f25449b = new HashMap();

    /* renamed from: c */
    private static final Object f25450c = new Object();

    /* renamed from: d */
    private static final Object f25451d = new Object();

    /* renamed from: e */
    public static final /* synthetic */ int f25452e = 0;

    /* renamed from: a */
    public static C3736xm m17345a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C3736xm.m17196g();
        }
        C3736xm c3736xm = f25449b.get(str);
        if (c3736xm == null) {
            synchronized (f25451d) {
                try {
                    c3736xm = f25449b.get(str);
                    if (c3736xm == null) {
                        c3736xm = new C3736xm(str);
                        f25449b.put(str, c3736xm);
                    }
                } finally {
                }
            }
        }
        return c3736xm;
    }

    /* renamed from: b */
    public static C2689Im m17346b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C2689Im.m14369g();
        }
        C2689Im c2689Im = f25448a.get(str);
        if (c2689Im == null) {
            synchronized (f25450c) {
                try {
                    c2689Im = f25448a.get(str);
                    if (c2689Im == null) {
                        c2689Im = new C2689Im(str);
                        f25448a.put(str, c2689Im);
                    }
                } finally {
                }
            }
        }
        return c2689Im;
    }

    /* renamed from: a */
    public static C2689Im m17344a() {
        return C2689Im.m14369g();
    }
}
