package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.yandex.metrica.impl.p022ob.AbstractC3004Vd;
import com.yandex.metrica.impl.p022ob.C2510Bi;
import com.yandex.metrica.impl.p022ob.C3144b2;
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

/* renamed from: com.yandex.metrica.impl.ob.lg */
/* loaded from: classes2.dex */
public class C3418lg {

    /* renamed from: i */
    private static final Map<C2510Bi.a, C3144b2.d> f24192i = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private final Context f24193a;

    /* renamed from: b */
    private final C2876Q9 f24194b;

    /* renamed from: c */
    private final InterfaceExecutorC3607sn f24195c;

    /* renamed from: d */
    private final C2734Kh f24196d;

    /* renamed from: e */
    private final C2769M2 f24197e;

    /* renamed from: f */
    private final InterfaceC3710wm f24198f;

    /* renamed from: g */
    private e f24199g;

    /* renamed from: h */
    private boolean f24200h = false;

    /* renamed from: com.yandex.metrica.impl.ob.lg$a */
    public class a extends HashMap<C2510Bi.a, C3144b2.d> {
        public a() {
            put(C2510Bi.a.CELL, C3144b2.d.CELL);
            put(C2510Bi.a.WIFI, C3144b2.d.WIFI);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3418lg.m16390a(C3418lg.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f24202a;

        /* renamed from: b */
        final /* synthetic */ C2885Qi f24203b;

        public c(List list, C2885Qi c2885Qi) {
            this.f24202a = list;
            this.f24203b = c2885Qi;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3418lg.m16392a(C3418lg.this, this.f24202a, this.f24203b.m14854C());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ e.a f24205a;

        public d(e.a aVar) {
            this.f24205a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3418lg.this.f24197e.m14598e()) {
                return;
            }
            C3418lg.this.f24196d.m14481b(this.f24205a);
            e.b bVar = new e.b(this.f24205a);
            InterfaceC3710wm interfaceC3710wm = C3418lg.this.f24198f;
            Context context = C3418lg.this.f24193a;
            ((C3580rm) interfaceC3710wm).getClass();
            C3144b2.d dVarM15661a = C3144b2.m15661a(context);
            bVar.m16407a(dVarM15661a);
            if (dVarM15661a == C3144b2.d.OFFLINE) {
                bVar.m16408a(e.b.a.OFFLINE);
            } else if (this.f24205a.f24214f.contains(dVarM15661a)) {
                bVar.m16408a(e.b.a.ERROR);
                try {
                    HttpsURLConnection httpsURLConnectionM15540a = C2842P0.m14728i().m14753x().m15540a(this.f24205a.f24210b);
                    for (Map.Entry<String, ? extends Collection<String>> entry : this.f24205a.f24212d.m15568a()) {
                        httpsURLConnectionM15540a.setRequestProperty(entry.getKey(), TextUtils.join(StringUtils.COMMA, entry.getValue()));
                    }
                    httpsURLConnectionM15540a.setInstanceFollowRedirects(true);
                    httpsURLConnectionM15540a.setRequestMethod(this.f24205a.f24211c);
                    int i = AbstractC3004Vd.a.f22536a;
                    httpsURLConnectionM15540a.setConnectTimeout(i);
                    httpsURLConnectionM15540a.setReadTimeout(i);
                    httpsURLConnectionM15540a.connect();
                    int responseCode = httpsURLConnectionM15540a.getResponseCode();
                    bVar.m16408a(e.b.a.COMPLETE);
                    bVar.m16409a(Integer.valueOf(responseCode));
                    try {
                        bVar.f24219e = C2991V0.m15297a(httpsURLConnectionM15540a.getInputStream(), 102400);
                    } catch (IOException unused) {
                    }
                    try {
                        bVar.f24220f = C2991V0.m15297a(httpsURLConnectionM15540a.getErrorStream(), 102400);
                    } catch (IOException unused2) {
                    }
                    bVar.m16411a(httpsURLConnectionM15540a.getHeaderFields());
                } catch (Throwable th) {
                    bVar.m16410a(th);
                }
            } else {
                bVar.m16408a(e.b.a.INCOMPATIBLE_NETWORK_TYPE);
            }
            C3418lg.m16391a(C3418lg.this, bVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.lg$e */
    public static class e {

        /* renamed from: a */
        private final List<a> f24207a;

        /* renamed from: b */
        private final LinkedHashMap<String, Object> f24208b = new LinkedHashMap<>();

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$a */
        public static class a {

            /* renamed from: a */
            public final String f24209a;

            /* renamed from: b */
            public final String f24210b;

            /* renamed from: c */
            public final String f24211c;

            /* renamed from: d */
            public final C3113Zm<String, String> f24212d;

            /* renamed from: e */
            public final long f24213e;

            /* renamed from: f */
            public final List<C3144b2.d> f24214f;

            public a(String str, String str2, String str3, C3113Zm<String, String> c3113Zm, long j, List<C3144b2.d> list) {
                this.f24209a = str;
                this.f24210b = str2;
                this.f24211c = str3;
                this.f24213e = j;
                this.f24214f = list;
                this.f24212d = c3113Zm;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f24209a.equals(((a) obj).f24209a);
            }

            public int hashCode() {
                return this.f24209a.hashCode();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.lg$e$b */
        public static class b {

            /* renamed from: a */
            private final a f24215a;

            /* renamed from: b */
            private a f24216b;

            /* renamed from: c */
            private C3144b2.d f24217c;

            /* renamed from: d */
            private Integer f24218d;

            /* renamed from: e */
            byte[] f24219e;

            /* renamed from: f */
            byte[] f24220f;

            /* renamed from: g */
            private Map<String, List<String>> f24221g;

            /* renamed from: h */
            private Throwable f24222h;

            /* renamed from: com.yandex.metrica.impl.ob.lg$e$b$a */
            public enum a {
                OFFLINE,
                INCOMPATIBLE_NETWORK_TYPE,
                COMPLETE,
                ERROR
            }

            public b(a aVar) {
                this.f24215a = aVar;
            }

            /* renamed from: b */
            public byte[] m16412b() {
                return this.f24220f;
            }

            /* renamed from: c */
            public Throwable m16413c() {
                return this.f24222h;
            }

            /* renamed from: d */
            public a m16414d() {
                return this.f24215a;
            }

            /* renamed from: e */
            public byte[] m16415e() {
                return this.f24219e;
            }

            /* renamed from: f */
            public Integer m16416f() {
                return this.f24218d;
            }

            /* renamed from: g */
            public Map<String, List<String>> m16417g() {
                return this.f24221g;
            }

            /* renamed from: h */
            public a m16418h() {
                return this.f24216b;
            }

            /* renamed from: a */
            public void m16408a(a aVar) {
                this.f24216b = aVar;
            }

            /* renamed from: a */
            public C3144b2.d m16406a() {
                return this.f24217c;
            }

            /* renamed from: a */
            public void m16407a(C3144b2.d dVar) {
                this.f24217c = dVar;
            }

            /* renamed from: a */
            public void m16409a(Integer num) {
                this.f24218d = num;
            }

            /* renamed from: a */
            public void m16411a(Map<String, List<String>> map) {
                this.f24221g = map;
            }

            /* renamed from: a */
            public void m16410a(Throwable th) {
                this.f24222h = th;
            }
        }

        public e(List<a> list, List<String> list2) {
            this.f24207a = list;
            if (C2968U2.m15249b(list2)) {
                return;
            }
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                this.f24208b.put(it.next(), new Object());
            }
        }

        /* renamed from: a */
        public boolean m16402a(a aVar) {
            if (this.f24208b.get(aVar.f24209a) != null || this.f24207a.contains(aVar)) {
                return false;
            }
            this.f24207a.add(aVar);
            return true;
        }

        /* renamed from: b */
        public List<a> m16403b() {
            return this.f24207a;
        }

        /* renamed from: b */
        public void m16404b(a aVar) {
            this.f24208b.put(aVar.f24209a, new Object());
            this.f24207a.remove(aVar);
        }

        /* renamed from: a */
        public Set<String> m16401a() {
            HashSet hashSet = new HashSet();
            Iterator<String> it = this.f24208b.keySet().iterator();
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

    public C3418lg(Context context, C2876Q9 c2876q9, C2769M2 c2769m2, C2734Kh c2734Kh, InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC3710wm interfaceC3710wm) {
        this.f24193a = context;
        this.f24194b = c2876q9;
        this.f24197e = c2769m2;
        this.f24196d = c2734Kh;
        this.f24199g = (e) c2876q9.m14814b();
        this.f24195c = interfaceExecutorC3607sn;
        this.f24198f = interfaceC3710wm;
    }

    /* renamed from: a */
    public static void m16392a(C3418lg c3418lg, List list, long j) {
        Long l;
        c3418lg.getClass();
        if (C2968U2.m15249b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2510Bi c2510Bi = (C2510Bi) it.next();
            if (c2510Bi.f20936a != null && c2510Bi.f20937b != null && c2510Bi.f20938c != null && (l = c2510Bi.f20940e) != null && l.longValue() >= 0 && !C2968U2.m15249b(c2510Bi.f20941f)) {
                String str = c2510Bi.f20936a;
                String str2 = c2510Bi.f20937b;
                String str3 = c2510Bi.f20938c;
                List<Pair<String, String>> list2 = c2510Bi.f20939d;
                C3113Zm c3113Zm = new C3113Zm(false);
                for (Pair<String, String> pair : list2) {
                    c3113Zm.m15567a(pair.first, pair.second);
                }
                long millis = TimeUnit.SECONDS.toMillis(c2510Bi.f20940e.longValue() + j);
                List<C2510Bi.a> list3 = c2510Bi.f20941f;
                ArrayList arrayList = new ArrayList(list3.size());
                Iterator<C2510Bi.a> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(f24192i.get(it2.next()));
                }
                c3418lg.m16393a(new e.a(str, str2, str3, c3113Zm, millis, arrayList));
            }
        }
    }

    /* renamed from: b */
    private void m16395b(e.a aVar) {
        long jMax = Math.max(aVar.f24213e - System.currentTimeMillis(), 0L);
        ((C3581rn) this.f24195c).m16704a(new d(aVar), Math.max(C3687w.f25138c, jMax));
    }

    /* renamed from: a */
    public synchronized void m16399a() {
        ((C3581rn) this.f24195c).execute(new b());
    }

    /* renamed from: a */
    public static void m16390a(C3418lg c3418lg) {
        if (c3418lg.f24200h) {
            return;
        }
        e eVar = (e) c3418lg.f24194b.m14814b();
        c3418lg.f24199g = eVar;
        Iterator<e.a> it = eVar.m16403b().iterator();
        while (it.hasNext()) {
            c3418lg.m16395b(it.next());
        }
        c3418lg.f24200h = true;
    }

    /* renamed from: a */
    public synchronized void m16400a(C2885Qi c2885Qi) {
        List<C2510Bi> listM14860I = c2885Qi.m14860I();
        ((C3581rn) this.f24195c).execute(new c(listM14860I, c2885Qi));
    }

    /* renamed from: a */
    private boolean m16393a(e.a aVar) {
        boolean zM16402a = this.f24199g.m16402a(aVar);
        if (zM16402a) {
            m16395b(aVar);
            this.f24196d.m14479a(aVar);
        }
        this.f24194b.m14813a(this.f24199g);
        return zM16402a;
    }

    /* renamed from: a */
    public static void m16391a(C3418lg c3418lg, e.b bVar) {
        synchronized (c3418lg) {
            c3418lg.f24199g.m16404b(bVar.f24215a);
            c3418lg.f24194b.m14813a(c3418lg.f24199g);
            c3418lg.f24196d.m14480a(bVar);
        }
    }
}
