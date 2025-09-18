package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.impl.ob.Bi;
import com.yandex.metrica.impl.ob.C2642b2;
import com.yandex.metrica.impl.ob.Vd;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.lg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2905lg {
    private static final Map<Bi.a, C2642b2.d> i = Collections.unmodifiableMap(new a());
    private final Context a;
    private final Q9 b;
    private final InterfaceExecutorC3086sn c;
    private final Kh d;
    private final M2 e;
    private final InterfaceC3190wm f;
    private e g;
    private boolean h = false;

    /* renamed from: com.yandex.metrica.impl.ob.lg$a */
    public class a extends HashMap<Bi.a, C2642b2.d> {
        public a() {
            put(Bi.a.CELL, C2642b2.d.CELL);
            put(Bi.a.WIFI, C2642b2.d.WIFI);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2905lg.a(C2905lg.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$c */
    public class c implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ Qi b;

        public c(List list, Qi qi) {
            this.a = list;
            this.b = qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2905lg.a(C2905lg.this, this.a, this.b.C());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$d */
    public class d implements Runnable {
        final /* synthetic */ e.a a;

        public d(e.a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2905lg.this.e.e()) {
                return;
            }
            C2905lg.this.d.b(this.a);
            e.b bVar = new e.b(this.a);
            InterfaceC3190wm interfaceC3190wm = C2905lg.this.f;
            Context context = C2905lg.this.a;
            ((C3060rm) interfaceC3190wm).getClass();
            C2642b2.d dVarA = C2642b2.a(context);
            bVar.a(dVarA);
            if (dVarA == C2642b2.d.OFFLINE) {
                bVar.a(e.b.a.OFFLINE);
            } else if (this.a.f.contains(dVarA)) {
                bVar.a(e.b.a.ERROR);
                try {
                    HttpsURLConnection httpsURLConnectionA = P0.i().x().a(this.a.b);
                    for (Map.Entry<String, ? extends Collection<String>> entry : this.a.d.a()) {
                        httpsURLConnectionA.setRequestProperty(entry.getKey(), TextUtils.join(StringUtils.COMMA, entry.getValue()));
                    }
                    httpsURLConnectionA.setInstanceFollowRedirects(true);
                    httpsURLConnectionA.setRequestMethod(this.a.c);
                    int i = Vd.a.a;
                    httpsURLConnectionA.setConnectTimeout(i);
                    httpsURLConnectionA.setReadTimeout(i);
                    httpsURLConnectionA.connect();
                    int responseCode = httpsURLConnectionA.getResponseCode();
                    bVar.a(e.b.a.COMPLETE);
                    bVar.a(Integer.valueOf(responseCode));
                    try {
                        bVar.e = V0.a(httpsURLConnectionA.getInputStream(), 102400);
                    } catch (IOException unused) {
                    }
                    try {
                        bVar.f = V0.a(httpsURLConnectionA.getErrorStream(), 102400);
                    } catch (IOException unused2) {
                    }
                    bVar.a(httpsURLConnectionA.getHeaderFields());
                } catch (Throwable th) {
                    bVar.a(th);
                }
            } else {
                bVar.a(e.b.a.INCOMPATIBLE_NETWORK_TYPE);
            }
            C2905lg.a(C2905lg.this, bVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$e */
    public static class e {
        private final List<a> a;
        private final LinkedHashMap<String, Object> b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$a */
        public static class a {
            public final String a;
            public final String b;
            public final String c;
            public final Zm<String, String> d;
            public final long e;
            public final List<C2642b2.d> f;

            public a(String str, String str2, String str3, Zm<String, String> zm, long j, List<C2642b2.d> list) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.e = j;
                this.f = list;
                this.d = zm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$b */
        public static class b {
            private final a a;
            private a b;
            private C2642b2.d c;
            private Integer d;
            byte[] e;
            byte[] f;
            private Map<String, List<String>> g;
            private Throwable h;

            /* renamed from: com.yandex.metrica.impl.ob.lg$e$b$a */
            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(a aVar) {
                this.a = aVar;
            }

            public byte[] b() {
                return this.f;
            }

            public Throwable c() {
                return this.h;
            }

            public a d() {
                return this.a;
            }

            public byte[] e() {
                return this.e;
            }

            public Integer f() {
                return this.d;
            }

            public Map<String, List<String>> g() {
                return this.g;
            }

            public a h() {
                return this.b;
            }

            public void a(a aVar) {
                this.b = aVar;
            }

            public C2642b2.d a() {
                return this.c;
            }

            public void a(C2642b2.d dVar) {
                this.c = dVar;
            }

            public void a(Integer num) {
                this.d = num;
            }

            public void a(Map<String, List<String>> map) {
                this.g = map;
            }

            public void a(Throwable th) {
                this.h = th;
            }
        }

        public e(List<a> list, List<String> list2) {
            this.a = list;
            if (U2.b(list2)) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                this.b.put(it.next(), new Object());
            }
        }

        public boolean a(a aVar) {
            if (this.b.get(aVar.a) != null || this.a.contains(aVar)) {
                return false;
            }
            this.a.add(aVar);
            return true;
        }

        public List<a> b() {
            return this.a;
        }

        public void b(a aVar) {
            this.b.put(aVar.a, new Object());
            this.a.remove(aVar);
        }

        public Set<String> a() {
            HashSet hashSet = new HashSet();
            Iterator<String> it = this.b.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                hashSet.add(it.next());
                i++;
                if (i > 1000) {
                    break;
                }
            }
            return hashSet;
        }
    }

    public C2905lg(Context context, Q9 q9, M2 m2, Kh kh, InterfaceExecutorC3086sn interfaceExecutorC3086sn, InterfaceC3190wm interfaceC3190wm) {
        this.a = context;
        this.b = q9;
        this.e = m2;
        this.d = kh;
        this.g = (e) q9.b();
        this.c = interfaceExecutorC3086sn;
        this.f = interfaceC3190wm;
    }

    public static void a(C2905lg c2905lg, List list, long j) {
        Long l;
        c2905lg.getClass();
        if (U2.b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bi bi = (Bi) it.next();
            if (bi.a != null && bi.b != null && bi.c != null && (l = bi.e) != null && l.longValue() >= 0 && !U2.b(bi.f)) {
                String str = bi.a;
                String str2 = bi.b;
                String str3 = bi.c;
                List<Pair<String, String>> list2 = bi.d;
                Zm zm = new Zm(false);
                for (Pair<String, String> pair : list2) {
                    zm.a(pair.first, pair.second);
                }
                long millis = TimeUnit.SECONDS.toMillis(bi.e.longValue() + j);
                List<Bi.a> list3 = bi.f;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator<Bi.a> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(i.get(it2.next()));
                }
                c2905lg.a(new e.a(str, str2, str3, zm, millis, arrayList));
            }
        }
    }

    private void b(e.a aVar) {
        long jMax = Math.max(aVar.e - System.currentTimeMillis(), 0L);
        ((C3061rn) this.c).a(new d(aVar), Math.max(C3167w.c, jMax));
    }

    public synchronized void a() {
        ((C3061rn) this.c).execute(new b());
    }

    public static void a(C2905lg c2905lg) {
        if (c2905lg.h) {
            return;
        }
        e eVar = (e) c2905lg.b.b();
        c2905lg.g = eVar;
        Iterator<e.a> it = eVar.b().iterator();
        while (it.hasNext()) {
            c2905lg.b(it.next());
        }
        c2905lg.h = true;
    }

    public synchronized void a(Qi qi) {
        List<Bi> listI = qi.I();
        ((C3061rn) this.c).execute(new c(listI, qi));
    }

    private boolean a(e.a aVar) {
        boolean zA = this.g.a(aVar);
        if (zA) {
            b(aVar);
            this.d.a(aVar);
        }
        this.b.a(this.g);
        return zA;
    }

    public static void a(C2905lg c2905lg, e.b bVar) {
        synchronized (c2905lg) {
            c2905lg.g.b(bVar.a);
            c2905lg.b.a(c2905lg.g);
            c2905lg.d.a(bVar);
        }
    }
}
