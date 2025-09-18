package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.b8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2648b8 implements M7<String> {
    private final C2698d8 a;
    private final Vm<String, Bundle> b;
    private final Callable<List<Bundle>> c;
    private final Um<String> d;
    private final C2623a8 e;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public class a implements Vm<String, Bundle> {
        @Override // com.yandex.metrica.impl.ob.Vm
        public Bundle a(String str) {
            return CrashpadServiceHelper.readCrash(str);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$b */
    public class b implements Callable<List<Bundle>> {
        @Override // java.util.concurrent.Callable
        public List<Bundle> call() throws Exception {
            return CrashpadServiceHelper.readOldCrashes();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b8$c */
    public class c implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            CrashpadServiceHelper.a(str);
        }
    }

    public C2648b8(C2698d8 c2698d8) {
        this(c2698d8, new C2623a8(), new a(), new b(), new c());
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a(String str) {
        Bundle bundleA;
        String str2 = str;
        try {
            bundleA = this.b.a(str2);
        } catch (Throwable unused) {
        }
        Z7 z7A = bundleA != null ? this.e.a(str2, bundleA) : null;
        if (z7A != null) {
            this.a.a2(z7A);
        } else {
            this.d.b(str2);
        }
    }

    public C2648b8(C2698d8 c2698d8, C2623a8 c2623a8, Vm<String, Bundle> vm, Callable<List<Bundle>> callable, Um<String> um) {
        this.a = c2698d8;
        this.e = c2623a8;
        this.b = vm;
        this.c = callable;
        this.d = um;
    }

    @Override // com.yandex.metrica.impl.ob.M7
    public void a() {
        try {
            for (Bundle bundle : this.c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    Z7 z7A = this.e.a(string, bundle);
                    if (z7A != null) {
                        this.a.b2(z7A);
                    } else {
                        this.d.b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
