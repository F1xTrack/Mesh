package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.M1 */
/* loaded from: classes2.dex */
public final class C4650M1 {

    /* renamed from: a */
    public final C5294ma f30455a = new C5294ma();

    /* renamed from: b */
    public final LinkedHashMap f30456b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f30457c = new LinkedHashMap();

    /* renamed from: a */
    public final void m19610a(Intent intent, int i) {
    }

    /* renamed from: b */
    public final void m19614b() {
    }

    /* renamed from: c */
    public final void m19616c() {
    }

    /* renamed from: d */
    public final void m19619d(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f30455a.m20705a(action, Integer.valueOf(m19607a(intent)));
            }
            for (Map.Entry entry : this.f30456b.entrySet()) {
                if (((InterfaceC4602K1) entry.getValue()).mo19455a(intent)) {
                    ((InterfaceC4626L1) entry.getKey()).mo2364a(intent);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m19620e(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C5294ma c5294ma = this.f30455a;
                Integer numValueOf = Integer.valueOf(m19607a(intent));
                Collection collection = (Collection) c5294ma.f32190a.get(action);
                if (collection != null && collection.remove(numValueOf)) {
                    if (collection.isEmpty() && c5294ma.f32191b) {
                        c5294ma.f32190a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f30457c.entrySet()) {
                if (((InterfaceC4602K1) entry.getValue()).mo19455a(intent)) {
                    ((InterfaceC4626L1) entry.getKey()).mo2364a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m19611a(Intent intent, int i, int i2) {
    }

    /* renamed from: b */
    public final void m19615b(InterfaceC4626L1 interfaceC4626L1) {
        this.f30456b.put(interfaceC4626L1, new C4530H1(this));
    }

    /* renamed from: c */
    public final void m19617c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f30455a.m20705a(action, Integer.valueOf(m19607a(intent)));
            }
            for (Map.Entry entry : this.f30456b.entrySet()) {
                if (((InterfaceC4602K1) entry.getValue()).mo19455a(intent)) {
                    ((InterfaceC4626L1) entry.getKey()).mo2364a(intent);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m19608b(Intent intent) {
        if ("io.appmetrica.analytics.IAppMetricaService".equals(intent.getAction())) {
            return !(m19607a(intent) == Process.myPid());
        }
        return false;
    }

    /* renamed from: a */
    public final void m19612a(Configuration configuration) {
    }

    /* renamed from: a */
    public final void m19613a(InterfaceC4626L1 interfaceC4626L1) {
        this.f30457c.put(interfaceC4626L1, new C4578J1(this));
    }

    /* renamed from: a */
    public final int m19609a() {
        Collection collection = (Collection) this.f30455a.f32190a.get("io.appmetrica.analytics.IAppMetricaService");
        int i = 0;
        if (!AbstractC5182hn.m20513a(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() != Process.myPid()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void m19618c(InterfaceC4626L1 interfaceC4626L1) {
        this.f30456b.put(interfaceC4626L1, new C4554I1(this));
    }

    /* renamed from: a */
    public static int m19607a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
