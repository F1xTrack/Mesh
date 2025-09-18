package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.ads.AdEvent;
import com.p018my.tracker.miniapps.MiniAppEvent;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import com.p018my.tracker.obfuscated.C2354p1;
import com.p018my.tracker.obfuscated.C2395z2;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p000.C10066kt1;
import p000.O91;
import p000.RunnableC7147xa;
import p000.RunnableC7160xn;
import p000.RunnableC7223yn;
import p000.RunnableC7286zn;
import p000.RunnableC8176Qp0;
import p000.RunnableC8289St1;
import p000.RunnableC8393Ut1;
import p000.RunnableC8445Vt1;
import p000.RunnableC8497Wt1;
import p000.RunnableC8549Xt1;
import p000.RunnableC8601Yt1;
import p000.RunnableC8653Zt1;
import p000.RunnableC8783au1;
import p000.RunnableC8911bu1;
import p000.RunnableC9844j81;

/* renamed from: com.my.tracker.obfuscated.f0 */
/* loaded from: classes2.dex */
public final class C2313f0 {

    /* renamed from: k */
    public static final DecimalFormat f19927k;

    /* renamed from: b */
    final C2395z2 f19929b;

    /* renamed from: c */
    final Context f19930c;

    /* renamed from: d */
    final b f19931d;

    /* renamed from: g */
    C2318g1 f19934g;

    /* renamed from: a */
    final Map f19928a = new HashMap();

    /* renamed from: e */
    protected C2298b3 f19932e = C2298b3.f19772j;

    /* renamed from: f */
    protected String f19933f = "";

    /* renamed from: h */
    private final C2360r f19935h = new C2360r(65536);

    /* renamed from: i */
    final C2322h1 f19936i = C2322h1.m13161b();

    /* renamed from: j */
    long f19937j = 0;

    /* renamed from: com.my.tracker.obfuscated.f0$a */
    public interface a {
        /* renamed from: b */
        void mo12878b(List list);
    }

    /* renamed from: com.my.tracker.obfuscated.f0$b */
    public interface b {
        /* renamed from: a */
        void mo12866a();

        /* renamed from: a */
        void mo12867a(String str);
    }

    /* renamed from: com.my.tracker.obfuscated.f0$c */
    public interface c {
        /* renamed from: a */
        void mo3169a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        f19927k = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private C2313f0(C2395z2 c2395z2, b bVar, Context context) {
        this.f19929b = c2395z2;
        this.f19931d = bVar;
        this.f19930c = context.getApplicationContext();
    }

    /* renamed from: e */
    public /* synthetic */ void m13028e() throws IOException {
        if (m13009a(this.f19934g)) {
            return;
        }
        m13081c();
    }

    /* renamed from: f */
    public /* synthetic */ void m13030f() throws IOException {
        if (this.f19934g != null) {
            AbstractC2391y2.m13572b("EventTracker error: tracker has already been initialized");
            return;
        }
        C2310e1 c2310e1M12892a = C2310e1.m12892a(this.f19929b.m13607g(), this.f19930c);
        if (c2310e1M12892a == null) {
            return;
        }
        C2318g1 c2318g1M13091a = C2318g1.m13091a(c2310e1M12892a);
        this.f19934g = c2318g1M13091a;
        if (m13009a(c2318g1M13091a)) {
            return;
        }
        this.f19937j = C2358q1.m13407a(this.f19930c).m13438l();
        this.f19929b.m13613m().m12753a(new C10066kt1(this, 1), new C10066kt1(this, 2));
        m13073b();
    }

    /* renamed from: a */
    public void m13068a(List list, a aVar) {
        m12995a(new RunnableC8176Qp0(this, aVar, list, 22));
    }

    /* renamed from: b */
    public void m13076b(C2298b3 c2298b3, String str, C2318g1 c2318g1) {
        AbstractC2391y2.m13568a("createAndStorePartialPacket: start");
        C2395z2.a aVarM13615o = this.f19929b.m13615o();
        String strM13608h = this.f19929b.m13608h();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderM13614n = this.f19929b.m13614n();
        this.f19935h.m13458a();
        int iM12979a = m12979a(this.f19935h, c2318g1, aVarM13615o, c2298b3, str, this.f19936i, strM13608h, okHttpClientProviderM13614n, this.f19930c);
        AbstractC2391y2.m13568a("createAndStorePartialPacket: writeResult=" + iM12979a);
        if (iM12979a == 1) {
            c2318g1.m13098a();
            c2318g1.m13097a(this.f19935h.m13461c());
        } else if (iM12979a == 2) {
            c2318g1.m13098a();
        }
        this.f19935h.m13462d();
    }

    /* renamed from: c */
    public void m13081c() throws IOException {
        if (m13009a(this.f19934g)) {
            return;
        }
        this.f19931d.mo12866a();
        if (!AbstractC2369t0.m13498a(this.f19930c)) {
            AbstractC2391y2.m13568a("MyTrackerRepository: no network connection");
            return;
        }
        String strM12982a = m12982a(this.f19932e, this.f19933f, this.f19934g);
        if (strM12982a != null) {
            this.f19931d.mo12867a(strM12982a);
        }
        m13077b(this.f19934g);
    }

    /* renamed from: d */
    public void m13085d() {
        m12995a(new RunnableC8549Xt1(this, 0));
    }

    /* renamed from: g */
    public void m13089g() {
        m12995a(new RunnableC7147xa(this, AbstractC2383w2.m13528a(), 2));
    }

    /* renamed from: c */
    public /* synthetic */ void m13023c(long j, float f) {
        if (m13009a(this.f19934g) || m13072a(29, j)) {
            return;
        }
        long jM13530b = AbstractC2383w2.m13530b(j);
        byte[] bArrM13185c = this.f19936i.m13185c((long) (f * 1000.0f));
        if (bArrM13185c != null) {
            this.f19934g.m13131p(bArrM13185c, jM13530b);
        }
    }

    /* renamed from: a */
    public void m13069a(List list, c cVar) {
        m12995a(new RunnableC8176Qp0(this, cVar, list, 21));
    }

    /* renamed from: b */
    public void m13073b() throws IOException {
        int iM13606f;
        if (m13009a(this.f19934g)) {
            return;
        }
        if (this.f19934g.m13120h() != 0 || ((iM13606f = this.f19929b.m13606f()) > 0 && AbstractC2383w2.m13528a() - this.f19937j <= iM13606f)) {
            m13081c();
        }
    }

    /* renamed from: d */
    public void m13086d(String str) {
        m12995a(new RunnableC9844j81(this, str, AbstractC2383w2.m13528a(), 3));
    }

    /* renamed from: a */
    private static Map m12983a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* renamed from: b */
    public /* synthetic */ void m13015b(a aVar) {
        aVar.mo12878b(m13009a(this.f19934g) ? Collections.emptyList() : this.f19934g.m13114e());
    }

    /* renamed from: c */
    public void m13024c(C2298b3 c2298b3) {
        m12995a(new O91(this, 16, c2298b3));
    }

    /* renamed from: d */
    public void m13087d(List list) {
        m12995a(new RunnableC8601Yt1(this, list, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m12982a(com.p018my.tracker.obfuscated.C2298b3 r12, java.lang.String r13, com.p018my.tracker.obfuscated.C2318g1 r14) {
        /*
            r11 = this;
            com.my.tracker.obfuscated.z2 r0 = r11.f19929b
            com.my.tracker.obfuscated.z2$a r3 = r0.m13615o()
            com.my.tracker.obfuscated.z2 r0 = r11.f19929b
            java.lang.String r0 = r0.m13617q()
            com.my.tracker.obfuscated.z2 r1 = r11.f19929b
            java.lang.String r7 = r1.m13608h()
            com.my.tracker.obfuscated.z2 r1 = r11.f19929b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r10 = r1.m13614n()
            com.my.tracker.obfuscated.r r1 = r11.f19935h
            r1.m13458a()
            com.my.tracker.obfuscated.r r1 = r11.f19935h
            com.my.tracker.obfuscated.h1 r6 = r11.f19936i
            android.content.Context r9 = r11.f19930c
            r2 = r14
            r4 = r12
            r5 = r13
            r8 = r10
            int r12 = m12979a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13 = 1
            if (r12 == r13) goto L2f
            goto L53
        L2f:
            com.my.tracker.obfuscated.r r12 = r11.f19935h
            com.my.tracker.obfuscated.t0$b r12 = r11.m12981a(r0, r10, r12)
            if (r12 != 0) goto L38
            goto L53
        L38:
            boolean r13 = r12.m13502c()
            if (r13 == 0) goto L46
            java.lang.String r13 = "Events were sent successfully"
            com.p018my.tracker.obfuscated.AbstractC2391y2.m13568a(r13)
            r14.m13098a()
        L46:
            java.lang.Object r12 = r12.m13501b()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L53
            goto L54
        L53:
            r12 = 0
        L54:
            com.my.tracker.obfuscated.r r13 = r11.f19935h
            r13.m13462d()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p018my.tracker.obfuscated.C2313f0.m12982a(com.my.tracker.obfuscated.b3, java.lang.String, com.my.tracker.obfuscated.g1):java.lang.String");
    }

    /* renamed from: b */
    public /* synthetic */ void m13016b(c cVar) {
        cVar.mo3169a(m13009a(this.f19934g) ? Collections.emptyList() : this.f19934g.m13118g());
    }

    /* renamed from: c */
    public static boolean m13026c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        AbstractC2391y2.m13572b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    /* renamed from: d */
    public void m13088d(Map map) {
        m12995a(new RunnableC8497Wt1(1, AbstractC2383w2.m13528a(), this, m12983a(map)));
    }

    /* renamed from: b */
    public /* synthetic */ void m13014b(C2298b3 c2298b3) {
        AbstractC2391y2.m13568a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(c2298b3.f19779g));
        if (AbstractC2336l.m13285a(this.f19932e.f19779g, c2298b3.f19779g) != 0 && !m13009a(this.f19934g)) {
            m13076b(this.f19932e, this.f19933f, this.f19934g);
        }
        this.f19932e = c2298b3;
    }

    /* renamed from: a */
    public void m13052a() {
        m12995a(new RunnableC8549Xt1(this, 1));
    }

    /* renamed from: c */
    public void m13083c(List list) {
        m12995a(new RunnableC8601Yt1(this, list, 1));
    }

    /* renamed from: b */
    public /* synthetic */ void m13019b(List list) throws IOException {
        if (m13009a(this.f19934g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2353p0 c2353p0 = (C2353p0) it.next();
            m13011a(c2353p0.m13379e(), c2353p0.m13378d(), c2353p0.m13375a(), (Map) null, c2353p0.m13380f());
            this.f19934g.m13105b(c2353p0);
        }
        m13073b();
    }

    /* renamed from: a */
    public void m13060a(a aVar) {
        m12995a(new O91(this, 15, aVar));
    }

    /* renamed from: c */
    public void m13084c(Map map) {
        m12995a(new RunnableC8497Wt1(0, AbstractC2383w2.m13528a(), this, m12983a(map)));
    }

    /* renamed from: b */
    public /* synthetic */ void m13018b(String str, String str2, long j, long j2, long j3) throws IOException {
        byte[] bArrM13182b;
        if (m13009a(this.f19934g) || (bArrM13182b = this.f19936i.m13182b(str, str2, j, j2)) == null || !this.f19934g.m13121h(bArrM13182b, j3)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public void m13061a(c cVar) {
        m12995a(new O91(this, 18, cVar));
    }

    /* renamed from: c */
    public void m13082c(float f) {
        m12995a(new RunnableC8653Zt1(this, System.currentTimeMillis(), f, 0));
    }

    /* renamed from: a */
    public static boolean m13009a(C2318g1 c2318g1) {
        if (c2318g1 != null) {
            return false;
        }
        AbstractC2391y2.m13572b("EventTracker error: repository is null");
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ void m13020b(Map map, long j) throws IOException {
        byte[] bArrM13184b;
        if (m13009a(this.f19934g) || m13022b(map) || (bArrM13184b = this.f19936i.m13184b(map)) == null || !this.f19934g.m13126k(bArrM13184b, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12992a(a aVar, List list) {
        if (m13009a(this.f19934g)) {
            aVar.mo12878b(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f19934g.m13095a((C2312f) it.next());
        }
        aVar.mo12878b(list);
    }

    /* renamed from: b */
    public /* synthetic */ void m13013b(long j, float f, float f2, float f3) {
        if (m13009a(this.f19934g) || m13072a(26, j)) {
            return;
        }
        long jM13530b = AbstractC2383w2.m13530b(j);
        byte[] bArrM13180b = this.f19936i.m13180b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (bArrM13180b != null) {
            this.f19934g.m13129n(bArrM13180b, jM13530b);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m12993a(c cVar, List list) {
        if (m13009a(this.f19934g)) {
            cVar.mo3169a(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f19934g.m13096a((C2353p0) it.next());
        }
        cVar.mo3169a(list);
    }

    /* renamed from: b */
    public /* synthetic */ void m13012b(long j, float f) {
        if (m13009a(this.f19934g) || m13072a(28, j)) {
            return;
        }
        long jM13530b = AbstractC2383w2.m13530b(j);
        byte[] bArrM13179b = this.f19936i.m13179b((long) (f * 1000.0f));
        if (bArrM13179b != null) {
            this.f19934g.m13130o(bArrM13179b, jM13530b);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m12991a(C2298b3 c2298b3) {
        this.f19932e = c2298b3;
    }

    /* renamed from: b */
    public /* synthetic */ void m13021b(Map map, String str, String str2, long j) throws IOException {
        byte[] bArrM13183b;
        if (m13009a(this.f19934g) || m13022b(map) || (bArrM13183b = this.f19936i.m13183b(str, str2, map)) == null || !this.f19934g.m13133r(bArrM13183b, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12996a(String str) {
        AbstractC2391y2.m13568a("setRemoteConfig: remoteConfig=" + str);
        if (this.f19933f.equals(str)) {
            return;
        }
        if (!m13009a(this.f19934g)) {
            m13076b(this.f19932e, this.f19933f, this.f19934g);
        }
        this.f19933f = str;
    }

    /* renamed from: b */
    public static boolean m13022b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (m13026c((String) entry.getKey()) || m13026c((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void m12989a(AdEvent adEvent, long j) throws IOException {
        byte[] bArrM13169a;
        if (m13009a(this.f19934g) || (bArrM13169a = this.f19936i.m13169a(adEvent, f19927k.format(adEvent.revenue))) == null || !this.f19934g.m13099a(adEvent.eventType, bArrM13169a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13078b(String str) {
        m12995a(new O91(this, 17, str));
    }

    /* renamed from: a */
    public /* synthetic */ void m12999a(String str, String str2, long j, long j2, long j3) throws IOException {
        byte[] bArrM13172a;
        if (m13009a(this.f19934g) || (bArrM13172a = this.f19936i.m13172a(str, str2, j, j2)) == null || !this.f19934g.m13102a(bArrM13172a, j3)) {
            return;
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13079b(String str, String str2, long j, long j2) {
        m12995a(new RunnableC8393Ut1(this, str, str2, j, j2, AbstractC2383w2.m13528a(), 0));
    }

    /* renamed from: a */
    public /* synthetic */ void m12997a(String str, long j) throws IOException {
        byte[] bArrM13170a;
        if (m13009a(this.f19934g) || (bArrM13170a = this.f19936i.m13170a(str)) == null || !this.f19934g.m13108b(bArrM13170a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13075b(float f, float f2, float f3) {
        m12995a(new RunnableC8783au1(this, System.currentTimeMillis(), f, f2, f3, 1));
    }

    /* renamed from: a */
    public /* synthetic */ void m13007a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j) throws IOException {
        if (m13009a(this.f19934g) || m13022b(map) || !m13010a(jSONObject, str, str2, str3, map, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13074b(float f) {
        m12995a(new RunnableC8653Zt1(this, System.currentTimeMillis(), f, 1));
    }

    /* renamed from: a */
    public /* synthetic */ void m13003a(List list) throws IOException {
        String string;
        if (m13009a(this.f19934g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2312f c2312f = (C2312f) it.next();
            try {
                string = c2312f.m12965e().toString();
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("Error: purchase data: ", th);
                string = null;
            }
            m13010a(c2312f.m12964d(), string, c2312f.m12961a(), c2312f.m12966f(), (Map) null, c2312f.m12968h());
            this.f19934g.m13104b(c2312f);
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13080b(String str, String str2, Map map) {
        m12995a(new RunnableC8289St1(this, m12983a(map), str, str2, AbstractC2383w2.m13528a(), 0));
    }

    /* renamed from: a */
    public /* synthetic */ void m13002a(String str, Map map, long j) throws IOException {
        byte[] bArrM13177a;
        if (m13009a(this.f19934g) || m13026c(str) || m13022b(map) || (bArrM13177a = this.f19936i.m13177a(str, map)) == null || !this.f19934g.m13113d(bArrM13177a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: b */
    public void m13077b(C2318g1 c2318g1) throws IOException {
        String strM13617q = this.f19929b.m13617q();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderM13614n = this.f19929b.m13614n();
        try {
            InterfaceC2294b interfaceC2294bM13112d = c2318g1.m13112d();
            try {
                if (interfaceC2294bM13112d == null) {
                    AbstractC2391y2.m13568a("EventTracker error: iterator is null");
                    if (interfaceC2294bM13112d != null) {
                        interfaceC2294bM13112d.close();
                        return;
                    }
                    return;
                }
                while (interfaceC2294bM13112d.mo12787b()) {
                    long jMo12786a = interfaceC2294bM13112d.mo12786a();
                    byte[] bArrMo12788i = interfaceC2294bM13112d.mo12788i();
                    this.f19935h.m13458a();
                    this.f19935h.m13491b(bArrMo12788i);
                    AbstractC2369t0.b bVarM12981a = m12981a(strM13617q, okHttpClientProviderM13614n, this.f19935h);
                    if (bVarM12981a == null) {
                        interfaceC2294bM13112d.close();
                        return;
                    } else {
                        if (!bVarM12981a.m13502c()) {
                            interfaceC2294bM13112d.close();
                            return;
                        }
                        String str = (String) bVarM12981a.m13501b();
                        if (!TextUtils.isEmpty(str)) {
                            this.f19931d.mo12867a(str);
                        }
                        c2318g1.m13094a(jMo12786a);
                    }
                }
                interfaceC2294bM13112d.close();
            } finally {
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("EventTracker error: ", th);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m12998a(String str, String str2, long j) throws IOException {
        byte[] bArrM13171a;
        if (m13009a(this.f19934g) || (bArrM13171a = this.f19936i.m13171a(str, str2)) == null || !this.f19934g.m13115e(bArrM13171a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m13008a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j) throws IOException {
        if (m13009a(this.f19934g) || m13022b(map) || !m13011a(jSONObject, jSONObject2, str, map, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12987a(long j, float f, float f2, float f3) {
        if (m13009a(this.f19934g) || m13072a(27, j)) {
            return;
        }
        long jM13530b = AbstractC2383w2.m13530b(j);
        byte[] bArrM13167a = this.f19936i.m13167a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (bArrM13167a != null) {
            this.f19934g.m13119g(bArrM13167a, jM13530b);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m12988a(long j, String str, C2354p1.a aVar, long j2) throws IOException {
        byte[] bArrM13168a;
        if (m13009a(this.f19934g) || (bArrM13168a = this.f19936i.m13168a(j, str, aVar)) == null || !this.f19934g.m13123i(bArrM13168a, j2)) {
            return;
        }
        C2358q1.m13407a(this.f19930c).m13420c(j2);
        this.f19937j = j2;
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m13005a(Map map, long j) throws IOException {
        byte[] bArrM13178a;
        if (m13009a(this.f19934g) || m13022b(map) || (bArrM13178a = this.f19936i.m13178a(map)) == null || !this.f19934g.m13125j(bArrM13178a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12985a(long j) throws IOException {
        if (m13009a(this.f19934g)) {
            return;
        }
        boolean zM13101a = this.f19934g.m13101a(j, C2358q1.m13407a(this.f19930c).m13441n());
        if (this.f19934g.m13107b(j) || zM13101a) {
            m13081c();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13004a(Map map, int i, long j) throws IOException {
        byte[] bArrM13165a;
        if (m13009a(this.f19934g) || m13022b(map) || (bArrM13165a = this.f19936i.m13165a(i, map)) == null || !this.f19934g.m13126k(bArrM13165a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12986a(long j, float f) {
        if (m13009a(this.f19934g) || m13072a(25, j)) {
            return;
        }
        long jM13530b = AbstractC2383w2.m13530b(j);
        byte[] bArrM13166a = this.f19936i.m13166a((long) (f * 1000.0f));
        if (bArrM13166a != null) {
            this.f19934g.m13127l(bArrM13166a, jM13530b);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13006a(Map map, String str, String str2, long j) throws IOException {
        byte[] bArrM13176a;
        if (m13009a(this.f19934g) || m13022b(map) || (bArrM13176a = this.f19936i.m13176a(str, str2, map)) == null || !this.f19934g.m13128m(bArrM13176a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12990a(MiniAppEvent miniAppEvent, long j) throws IOException {
        String str;
        Map<String, String> map;
        if (m13009a(this.f19934g) || m13026c(miniAppEvent.name) || m13022b(miniAppEvent.eventParams)) {
            return;
        }
        int i = miniAppEvent.eventType;
        String str2 = (i == 24 || i == 22 || i == 23) ? miniAppEvent.customUserId : null;
        if (i == 24) {
            str = miniAppEvent.name;
            map = miniAppEvent.eventParams;
        } else {
            str = null;
            map = null;
        }
        byte[] bArrM13164a = this.f19936i.m13164a(i, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i == 20 ? miniAppEvent.query : null, map);
        if (bArrM13164a == null || !this.f19934g.m13106b(i, bArrM13164a, j)) {
            return;
        }
        m13073b();
    }

    /* renamed from: a */
    public /* synthetic */ void m12984a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) throws IOException {
        if (!m13009a(this.f19934g) && this.f19934g.m13100a(i, bArr, z, z2, j)) {
            m13073b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13000a(String str, String str2, long j, Runnable runnable) throws IOException {
        if (m13009a(this.f19934g)) {
            return;
        }
        byte[] bArrM13181b = this.f19936i.m13181b(str, str2);
        if (bArrM13181b != null && this.f19934g.m13132q(bArrM13181b, j)) {
            m13073b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13001a(String str, String str2, String str3, String str4, String str5, long j) throws IOException {
        byte[] bArrM13174a;
        if (m13009a(this.f19934g) || (bArrM13174a = this.f19936i.m13174a(str, str2, str3, str4, str5)) == null || !this.f19934g.m13134s(bArrM13174a, j)) {
            return;
        }
        C2358q1.m13407a(this.f19930c).m13420c(j);
        this.f19937j = j;
        m13073b();
    }

    /* renamed from: a */
    public static C2313f0 m12980a(C2395z2 c2395z2, b bVar, Context context) {
        return new C2313f0(c2395z2, bVar, context);
    }

    /* renamed from: a */
    private static void m12995a(Runnable runnable) {
        AbstractC2340m.m13290a(runnable);
    }

    /* renamed from: a */
    private AbstractC2369t0.b m12981a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, C2360r c2360r) {
        if (this.f19936i.m13163a(c2360r, AbstractC2383w2.m13528a())) {
            return AbstractC2369t0.m13497a(new C2364s(c2360r), okHttpClientProvider, true).mo13274a(str);
        }
        return null;
    }

    /* renamed from: a */
    private boolean m13010a(JSONObject jSONObject, String str, String str2, String str3, Map map, long j) {
        String string;
        String strValueOf;
        C2318g1 c2318g1;
        if (str == null) {
            AbstractC2391y2.m13568a("Error: empty data " + str);
            return false;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(str).optString("productId"))) {
                AbstractC2391y2.m13568a("Error: empty productId in data ".concat(str));
                return false;
            }
            if (jSONObject != null) {
                try {
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    AbstractC2391y2.m13569a("Error: can't convert productInfo json to string", th);
                }
            } else {
                string = null;
            }
            try {
                strValueOf = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
            } catch (Throwable th2) {
                AbstractC2391y2.m13569a("Error: wrong price in micros in sku details: ", th2);
                strValueOf = null;
            }
            byte[] bArrM13173a = this.f19936i.m13173a(string, str, str2, str3, 0, strValueOf, jSONObject.optString("currency"), map);
            return (bArrM13173a == null || (c2318g1 = this.f19934g) == null || !c2318g1.m13111c(bArrM13173a, j)) ? false : true;
        } catch (Throwable th3) {
            AbstractC2391y2.m13573b("Error: creating object failed", th3);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m13011a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map, long j) {
        String string;
        String string2;
        String str2;
        C2318g1 c2318g1;
        String strOptString = null;
        try {
            string = jSONObject2.toString();
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("Error: can't convert purchaseData json to string", th);
            string = null;
        }
        if (jSONObject != null) {
            try {
                string2 = jSONObject.toString();
            } catch (Throwable th2) {
                AbstractC2391y2.m13569a("Error: can't convert skuDetails json to string", th2);
            }
        } else {
            string2 = null;
        }
        try {
            str2 = f19927k.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
        } catch (Throwable th3) {
            AbstractC2391y2.m13569a("Error: wrong price in micros in sku details: ", th3);
            str2 = null;
        }
        try {
            strOptString = jSONObject.optString("price_currency_code");
        } catch (Throwable th4) {
            AbstractC2391y2.m13569a("Error: wrong currency in sku details: ", th4);
        }
        byte[] bArrM13175a = this.f19936i.m13175a(str, string, string2, str2, strOptString, map);
        return (bArrM13175a == null || (c2318g1 = this.f19934g) == null || !c2318g1.m13117f(bArrM13175a, j)) ? false : true;
    }

    /* renamed from: a */
    public boolean m13072a(int i, long j) {
        Long l = (Long) this.f19928a.get(Integer.valueOf(i));
        if (l == null || j - l.longValue() >= 800) {
            this.f19928a.put(Integer.valueOf(i), Long.valueOf(j));
            return false;
        }
        AbstractC2391y2.m13568a("EventTracker: event with type " + i + " was throttled");
        return true;
    }

    /* renamed from: a */
    public void m13058a(AdEvent adEvent) {
        m12995a(new RunnableC9844j81(this, adEvent, AbstractC2383w2.m13528a(), 2));
    }

    /* renamed from: a */
    public void m13063a(String str, String str2, long j, long j2) {
        m12995a(new RunnableC8393Ut1(this, str, str2, j, j2, AbstractC2383w2.m13528a(), 1));
    }

    /* renamed from: a */
    public void m13070a(JSONObject jSONObject, String str, String str2, String str3, Map map) {
        m12995a(new RunnableC8911bu1(this, m12983a(map), jSONObject, str, str2, str3, AbstractC2383w2.m13528a()));
    }

    /* renamed from: a */
    public void m13067a(String str, Map map) {
        m12995a(new RunnableC8445Vt1(this, str, m12983a(map), AbstractC2383w2.m13528a(), 0));
    }

    /* renamed from: a */
    public void m13062a(String str, String str2) {
        m12995a(new RunnableC8445Vt1(this, str, str2, AbstractC2383w2.m13528a(), 1));
    }

    /* renamed from: a */
    public void m13071a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, Map map) {
        final long jM13528a = AbstractC2383w2.m13528a();
        final Map mapM12983a = m12983a(map);
        m12995a(new Runnable() { // from class: Tt1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f11579a.m13008a(mapM12983a, jSONObject, jSONObject2, str, jM13528a);
            }
        });
    }

    /* renamed from: a */
    public void m13054a(float f, float f2, float f3) {
        m12995a(new RunnableC8783au1(this, System.currentTimeMillis(), f, f2, f3, 0));
    }

    /* renamed from: a */
    public void m13057a(long j, String str, C2354p1.a aVar) {
        m12995a(new RunnableC7160xn(this, j, str, aVar, AbstractC2383w2.m13528a()));
    }

    /* renamed from: a */
    public void m13055a(int i, Map map) {
        m12995a(new RunnableC7223yn(this, m12983a(map), i, AbstractC2383w2.m13528a(), 1));
    }

    /* renamed from: a */
    public void m13053a(float f) {
        m12995a(new RunnableC8653Zt1(this, System.currentTimeMillis(), f, 2));
    }

    /* renamed from: a */
    public void m13066a(String str, String str2, Map map) {
        m12995a(new RunnableC8289St1(this, m12983a(map), str, str2, AbstractC2383w2.m13528a(), 1));
    }

    /* renamed from: a */
    public void m13059a(MiniAppEvent miniAppEvent) {
        m12995a(new RunnableC9844j81(this, miniAppEvent, AbstractC2383w2.m13528a(), 4));
    }

    /* renamed from: a */
    public void m13056a(final int i, final byte[] bArr, final boolean z, final boolean z2, final Runnable runnable) {
        final long jM13528a = AbstractC2383w2.m13528a();
        m12995a(new Runnable() { // from class: cu1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.f25712a.m12984a(i, bArr, z, z2, jM13528a, runnable);
            }
        });
    }

    /* renamed from: a */
    public void m13064a(String str, String str2, Runnable runnable) {
        m12995a(new RunnableC7286zn(this, str, str2, AbstractC2383w2.m13528a(), runnable));
    }

    /* renamed from: a */
    public void m13065a(String str, String str2, String str3, String str4, String str5) {
        m12995a(new RunnableC8911bu1(this, str, str2, str3, str4, str5, AbstractC2383w2.m13528a()));
    }

    /* renamed from: a */
    private static int m12979a(AbstractC2366s1 abstractC2366s1, C2318g1 c2318g1, C2395z2.a aVar, C2298b3 c2298b3, String str, C2322h1 c2322h1, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!c2318g1.m13124j()) {
            return 3;
        }
        long jM13122i = c2318g1.m13122i();
        InterfaceC2390y1 interfaceC2390y1M13103b = c2318g1.m13103b();
        InterfaceC2292a2 interfaceC2292a2M13109c = c2318g1.m13109c();
        return c2322h1.m13162a(abstractC2366s1, aVar, c2298b3, str, C2321h0.m13141a().m13142a(aVar.f20209m, aVar.f20203g, aVar.f20201e, str2, okHttpClientProvider, context), jM13122i, c2318g1.m13116f(), interfaceC2390y1M13103b, interfaceC2292a2M13109c);
    }
}
