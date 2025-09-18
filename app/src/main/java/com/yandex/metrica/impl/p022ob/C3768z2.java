package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.impl.p022ob.C3713x;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.z2 */
/* loaded from: classes2.dex */
public class C3768z2 implements C3713x.b {

    /* renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3768z2 f25389g;

    /* renamed from: a */
    private final Context f25390a;

    /* renamed from: b */
    private C3690w2 f25391b;

    /* renamed from: c */
    private WeakReference<Activity> f25392c = new WeakReference<>(null);

    /* renamed from: d */
    private final C2601F9 f25393d;

    /* renamed from: e */
    private final C3716x2 f25394e;

    /* renamed from: f */
    private boolean f25395f;

    public C3768z2(Context context, C2601F9 c2601f9, C3716x2 c3716x2) {
        this.f25390a = context;
        this.f25393d = c2601f9;
        this.f25394e = c3716x2;
        this.f25391b = c2601f9.m14121r();
        this.f25395f = c2601f9.m14127w();
        C3065Y.m15442g().m15443a().m17156a(this);
    }

    /* renamed from: a */
    public static C3768z2 m17317a(Context context) {
        if (f25389g == null) {
            synchronized (C3768z2.class) {
                try {
                    if (f25389g == null) {
                        f25389g = new C3768z2(context, new C2601F9(C2877Qa.m14815a(context).m14827c()), new C3716x2());
                    }
                } finally {
                }
            }
        }
        return f25389g;
    }

    /* renamed from: b */
    private void m17318b(Context context) {
        C3690w2 c3690w2M17171a;
        if (context == null || (c3690w2M17171a = this.f25394e.m17171a(context)) == null || c3690w2M17171a.equals(this.f25391b)) {
            return;
        }
        this.f25391b = c3690w2M17171a;
        this.f25393d.m14074a(c3690w2M17171a);
    }

    /* renamed from: a */
    public synchronized C3690w2 m17319a() {
        try {
            m17318b(this.f25392c.get());
            if (this.f25391b == null) {
                if (C2968U2.m15243a(30)) {
                    if (!this.f25395f) {
                        m17318b(this.f25390a);
                        this.f25395f = true;
                        this.f25393d.m14129y();
                    }
                } else {
                    m17318b(this.f25390a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25391b;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3713x.b
    /* renamed from: a */
    public synchronized void mo17157a(Activity activity) {
        this.f25392c = new WeakReference<>(activity);
        if (this.f25391b == null) {
            m17318b(activity);
        }
    }
}
