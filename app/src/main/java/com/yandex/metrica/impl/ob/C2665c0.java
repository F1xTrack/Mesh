package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2665c0 {
    private static final Object f = new Object();

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2665c0 g;
    public final String a = Build.MANUFACTURER;
    public final String b = Build.MODEL;
    public final String c = Build.VERSION.RELEASE;
    public final int d = Build.VERSION.SDK_INT;
    public final String e = String.valueOf(C3040r2.a());

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    public class a extends ArrayList<String> {
        public a(C2665c0 c2665c0) {
            if (C3040r2.b()) {
                add("Superuser.apk");
            }
            if (C3040r2.c()) {
                add("su.so");
            }
        }
    }

    public C2665c0() {
        Collections.unmodifiableList(new a(this));
    }

    public static C2665c0 a() {
        if (g == null) {
            synchronized (f) {
                try {
                    if (g == null) {
                        g = new C2665c0();
                    }
                } finally {
                }
            }
        }
        return g;
    }
}
