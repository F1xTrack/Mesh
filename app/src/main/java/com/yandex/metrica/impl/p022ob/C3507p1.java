package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.p1 */
/* loaded from: classes2.dex */
public final class C3507p1 {

    /* renamed from: c */
    private static volatile C3507p1 f24400c;

    /* renamed from: d */
    private static final Object f24401d = new Object();

    /* renamed from: a */
    private List<String> f24402a;

    /* renamed from: b */
    private final List<a> f24403b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.p1$a */
    public interface a {
        /* renamed from: a */
        void mo15938a();
    }

    public C3507p1(Context context) {
        synchronized (this) {
            this.f24402a = m16549a(context.getResources().getConfiguration());
        }
    }

    /* renamed from: a */
    public static C3507p1 m16548a(Context context) {
        if (f24400c == null) {
            synchronized (f24401d) {
                try {
                    if (f24400c == null) {
                        f24400c = new C3507p1(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f24400c;
    }

    /* renamed from: b */
    public void m16552b(Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f24402a = m16549a(configuration);
            arrayList = new ArrayList(this.f24403b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo15938a();
        }
    }

    /* renamed from: a */
    public List<String> m16550a() {
        return this.f24402a;
    }

    /* renamed from: a */
    public synchronized void m16551a(a aVar) {
        this.f24403b.add(aVar);
    }

    /* renamed from: a */
    private List<String> m16549a(Configuration configuration) {
        if (C2968U2.m15243a(24)) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = configuration.getLocales();
            if (locales != null) {
                int size = locales.size();
                for (int i = 0; i < size; i++) {
                    Locale locale = locales.get(i);
                    if (locale != null) {
                        String strM15664a = C3144b2.m15664a(locale);
                        O90.m5967e(strM15664a, "PhoneUtils.normalizedLocale(it)");
                        arrayList.add(strM15664a);
                    }
                }
            }
            return arrayList;
        }
        return Collections.singletonList(C3144b2.m15664a(configuration.locale));
    }
}
