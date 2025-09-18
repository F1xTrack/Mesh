package com.yandex.metrica.impl.p022ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.M1 */
/* loaded from: classes2.dex */
public class C2768M1 implements InterfaceC2818O1 {

    /* renamed from: a */
    private final C3113Zm<String, Integer> f21694a = new C3113Zm<>();

    /* renamed from: b */
    private final Map<e, d> f21695b = new LinkedHashMap();

    /* renamed from: c */
    private final Map<e, d> f21696c = new LinkedHashMap();

    /* renamed from: com.yandex.metrica.impl.ob.M1$a */
    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2768M1.d
        /* renamed from: a */
        public boolean mo14591a(Intent intent, C2768M1 c2768m1) {
            return C2768M1.m14581a(C2768M1.this, intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$b */
    public class b implements d {
        public b() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2768M1.d
        /* renamed from: a */
        public boolean mo14591a(Intent intent, C2768M1 c2768m1) {
            return C2768M1.this.m14585e(intent);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$c */
    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.impl.p022ob.C2768M1.d
        /* renamed from: a */
        public boolean mo14591a(Intent intent, C2768M1 c2768m1) {
            return C2768M1.this.m14585e(intent) && C2768M1.m14580a(C2768M1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$d */
    public interface d {
        /* renamed from: a */
        boolean mo14591a(Intent intent, C2768M1 c2768m1);
    }

    /* renamed from: com.yandex.metrica.impl.ob.M1$e */
    public interface e {
        /* renamed from: a */
        void mo14054a(Intent intent);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: a */
    public void mo13893a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f21694a.m15567a(action, Integer.valueOf(m14584d(intent)));
            }
            m14579a(intent, this.f21695b);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: c */
    public void mo13903c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f21694a.m15567a(action, Integer.valueOf(m14584d(intent)));
            }
            m14579a(intent, this.f21695b);
        }
    }

    /* renamed from: d */
    public void m14589d(e eVar) {
        this.f21695b.put(eVar, new a());
    }

    /* renamed from: e */
    public void m14590e(e eVar) {
        this.f21695b.put(eVar, new b());
    }

    /* renamed from: d */
    private int m14584d(Intent intent) {
        Uri data = intent.getData();
        if (data != null && data.getPath().equals("/client")) {
            try {
                return Integer.parseInt(data.getQueryParameter("pid"));
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public boolean m14585e(Intent intent) {
        if ("com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return !(m14584d(intent) == Process.myPid());
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2818O1
    /* renamed from: b */
    public void mo13901b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f21694a.m15570b(action, Integer.valueOf(m14584d(intent)));
            }
            m14579a(intent, this.f21696c);
        }
    }

    /* renamed from: a */
    private void m14579a(Intent intent, Map<e, d> map) {
        for (Map.Entry<e, d> entry : map.entrySet()) {
            if (entry.getValue().mo14591a(intent, this)) {
                entry.getKey().mo14054a(intent);
            }
        }
    }

    /* renamed from: c */
    public void m14588c(e eVar) {
        this.f21696c.put(eVar, new C2793N1(this));
    }

    /* renamed from: b */
    public void m14587b(e eVar) {
        this.f21695b.put(eVar, new C2793N1(this));
    }

    /* renamed from: c */
    private int m14583c() {
        Collection<Integer> collectionM15566a = this.f21694a.m15566a("com.yandex.metrica.IMetricaService");
        int i = 0;
        if (!C2968U2.m15249b(collectionM15566a)) {
            Iterator<Integer> it = collectionM15566a.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != Process.myPid()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public void m14586a(e eVar) {
        this.f21696c.put(eVar, new c());
    }

    /* renamed from: a */
    public static boolean m14581a(C2768M1 c2768m1, Intent intent) {
        return c2768m1.m14585e(intent) && c2768m1.m14583c() == 1;
    }

    /* renamed from: a */
    public static boolean m14580a(C2768M1 c2768m1) {
        return c2768m1.m14583c() == 0;
    }
}
