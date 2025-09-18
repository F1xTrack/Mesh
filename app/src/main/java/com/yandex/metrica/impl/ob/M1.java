package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class M1 implements O1 {
    private final Zm<String, Integer> a = new Zm<>();
    private final Map<e, d> b = new LinkedHashMap();
    private final Map<e, d> c = new LinkedHashMap();

    public class a implements d {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m1) {
            return M1.a(M1.this, intent);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m1) {
            return M1.this.e(intent);
        }
    }

    public class c implements d {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.M1.d
        public boolean a(Intent intent, M1 m1) {
            return M1.this.e(intent) && M1.a(M1.this);
        }
    }

    public interface d {
        boolean a(Intent intent, M1 m1);
    }

    public interface e {
        void a(Intent intent);
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.b);
        }
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void c(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.a(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.b);
        }
    }

    public void d(e eVar) {
        this.b.put(eVar, new a());
    }

    public void e(e eVar) {
        this.b.put(eVar, new b());
    }

    private int d(Intent intent) {
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
    public boolean e(Intent intent) {
        if ("com.yandex.metrica.IMetricaService".equals(intent.getAction())) {
            return !(d(intent) == Process.myPid());
        }
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.O1
    public void b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.a.b(action, Integer.valueOf(d(intent)));
            }
            a(intent, this.c);
        }
    }

    private void a(Intent intent, Map<e, d> map) {
        for (Map.Entry<e, d> entry : map.entrySet()) {
            if (entry.getValue().a(intent, this)) {
                entry.getKey().a(intent);
            }
        }
    }

    public void c(e eVar) {
        this.c.put(eVar, new N1(this));
    }

    public void b(e eVar) {
        this.b.put(eVar, new N1(this));
    }

    private int c() {
        Collection<Integer> collectionA = this.a.a("com.yandex.metrica.IMetricaService");
        int i = 0;
        if (!U2.b(collectionA)) {
            Iterator<Integer> it = collectionA.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() != Process.myPid()) {
                    i++;
                }
            }
        }
        return i;
    }

    public void a(e eVar) {
        this.c.put(eVar, new c());
    }

    public static boolean a(M1 m1, Intent intent) {
        return m1.e(intent) && m1.c() == 1;
    }

    public static boolean a(M1 m1) {
        return m1.c() == 0;
    }
}
