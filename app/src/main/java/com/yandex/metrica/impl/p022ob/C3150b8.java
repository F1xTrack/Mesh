package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.p021ac.CrashpadServiceHelper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.b8 */
/* loaded from: classes2.dex */
public class C3150b8 implements InterfaceC2774M7<String> {

    /* renamed from: a */
    private final C3202d8 f23116a;

    /* renamed from: b */
    private final InterfaceC3013Vm<String, Bundle> f23117b;

    /* renamed from: c */
    private final Callable<List<Bundle>> f23118c;

    /* renamed from: d */
    private final InterfaceC2988Um<String> f23119d;

    /* renamed from: e */
    private final C3124a8 f23120e;

    /* renamed from: com.yandex.metrica.impl.ob.b8$a */
    public class a implements InterfaceC3013Vm<String, Bundle> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3013Vm
        /* renamed from: a */
        public Bundle mo13948a(String str) {
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
    public class c implements InterfaceC2988Um<String> {
        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2988Um
        /* renamed from: b */
        public void mo13904b(String str) {
            CrashpadServiceHelper.m13833a(str);
        }
    }

    public C3150b8(C3202d8 c3202d8) {
        this(c3202d8, new C3124a8(), new a(), new b(), new c());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2774M7
    /* renamed from: a */
    public void mo14605a(String str) {
        Bundle bundleMo13948a;
        String str2 = str;
        try {
            bundleMo13948a = this.f23117b.mo13948a(str2);
        } catch (Throwable unused) {
        }
        C3098Z7 c3098z7Mo13979a = bundleMo13948a != null ? this.f23120e.mo13979a(str2, bundleMo13948a) : null;
        if (c3098z7Mo13979a != null) {
            this.f23116a.a2(c3098z7Mo13979a);
        } else {
            this.f23119d.mo13904b(str2);
        }
    }

    public C3150b8(C3202d8 c3202d8, C3124a8 c3124a8, InterfaceC3013Vm<String, Bundle> interfaceC3013Vm, Callable<List<Bundle>> callable, InterfaceC2988Um<String> interfaceC2988Um) {
        this.f23116a = c3202d8;
        this.f23120e = c3124a8;
        this.f23117b = interfaceC3013Vm;
        this.f23118c = callable;
        this.f23119d = interfaceC2988Um;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2774M7
    /* renamed from: a */
    public void mo14604a() {
        try {
            for (Bundle bundle : this.f23118c.call()) {
                String string = bundle.getString("arg_ui");
                if (!TextUtils.isEmpty(string)) {
                    C3098Z7 c3098z7Mo13979a = this.f23120e.mo13979a(string, bundle);
                    if (c3098z7Mo13979a != null) {
                        this.f23116a.b2(c3098z7Mo13979a);
                    } else {
                        this.f23119d.mo13904b(string);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
