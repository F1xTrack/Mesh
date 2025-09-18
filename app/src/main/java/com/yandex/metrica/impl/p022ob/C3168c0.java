package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.c0 */
/* loaded from: classes2.dex */
public class C3168c0 {

    /* renamed from: f */
    private static final Object f23165f = new Object();

    /* renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3168c0 f23166g;

    /* renamed from: a */
    public final String f23167a = Build.MANUFACTURER;

    /* renamed from: b */
    public final String f23168b = Build.MODEL;

    /* renamed from: c */
    public final String f23169c = Build.VERSION.RELEASE;

    /* renamed from: d */
    public final int f23170d = Build.VERSION.SDK_INT;

    /* renamed from: e */
    public final String f23171e = String.valueOf(C3560r2.m16645a());

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    public class a extends ArrayList<String> {
        public a(C3168c0 c3168c0) {
            if (C3560r2.m16646b()) {
                add("Superuser.apk");
            }
            if (C3560r2.m16647c()) {
                add("su.so");
            }
        }
    }

    public C3168c0() {
        Collections.unmodifiableList(new a(this));
    }

    /* renamed from: a */
    public static C3168c0 m15699a() {
        if (f23166g == null) {
            synchronized (f23165f) {
                try {
                    if (f23166g == null) {
                        f23166g = new C3168c0();
                    }
                } finally {
                }
            }
        }
        return f23166g;
    }
}
