package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.p1;
import com.my.tracker.obfuscated.t0;
import com.my.tracker.obfuscated.z2;
import defpackage.C5588kt1;
import defpackage.O91;
import defpackage.RunnableC1313Qp0;
import defpackage.RunnableC1482St1;
import defpackage.RunnableC1638Ut1;
import defpackage.RunnableC1716Vt1;
import defpackage.RunnableC1794Wt1;
import defpackage.RunnableC1872Xt1;
import defpackage.RunnableC1950Yt1;
import defpackage.RunnableC2028Zt1;
import defpackage.RunnableC2222au1;
import defpackage.RunnableC2413bu1;
import defpackage.RunnableC5256j81;
import defpackage.RunnableC8009xa;
import defpackage.RunnableC8048xn;
import defpackage.RunnableC8238yn;
import defpackage.RunnableC8428zn;
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

/* loaded from: classes2.dex */
public final class f0 {
    public static final DecimalFormat k;
    final z2 b;
    final Context c;
    final b d;
    g1 g;
    final Map a = new HashMap();
    protected b3 e = b3.j;
    protected String f = "";
    private final r h = new r(65536);
    final h1 i = h1.b();
    long j = 0;

    public interface a {
        void b(List list);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public interface c {
        void a(List list);
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        k = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private f0(z2 z2Var, b bVar, Context context) {
        this.b = z2Var;
        this.d = bVar;
        this.c = context.getApplicationContext();
    }

    public /* synthetic */ void e() throws IOException {
        if (a(this.g)) {
            return;
        }
        c();
    }

    public /* synthetic */ void f() throws IOException {
        if (this.g != null) {
            y2.b("EventTracker error: tracker has already been initialized");
            return;
        }
        e1 e1VarA = e1.a(this.b.g(), this.c);
        if (e1VarA == null) {
            return;
        }
        g1 g1VarA = g1.a(e1VarA);
        this.g = g1VarA;
        if (a(g1VarA)) {
            return;
        }
        this.j = q1.a(this.c).l();
        this.b.m().a(new C5588kt1(this, 1), new C5588kt1(this, 2));
        b();
    }

    public void a(List list, a aVar) {
        a(new RunnableC1313Qp0(this, aVar, list, 22));
    }

    public void b(b3 b3Var, String str, g1 g1Var) {
        y2.a("createAndStorePartialPacket: start");
        z2.a aVarO = this.b.o();
        String strH = this.b.h();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderN = this.b.n();
        this.h.a();
        int iA = a(this.h, g1Var, aVarO, b3Var, str, this.i, strH, okHttpClientProviderN, this.c);
        y2.a("createAndStorePartialPacket: writeResult=" + iA);
        if (iA == 1) {
            g1Var.a();
            g1Var.a(this.h.c());
        } else if (iA == 2) {
            g1Var.a();
        }
        this.h.d();
    }

    public void c() throws IOException {
        if (a(this.g)) {
            return;
        }
        this.d.a();
        if (!t0.a(this.c)) {
            y2.a("MyTrackerRepository: no network connection");
            return;
        }
        String strA = a(this.e, this.f, this.g);
        if (strA != null) {
            this.d.a(strA);
        }
        b(this.g);
    }

    public void d() {
        a(new RunnableC1872Xt1(this, 0));
    }

    public void g() {
        a(new RunnableC8009xa(this, w2.a(), 2));
    }

    public /* synthetic */ void c(long j, float f) {
        if (a(this.g) || a(29, j)) {
            return;
        }
        long jB = w2.b(j);
        byte[] bArrC = this.i.c((long) (f * 1000.0f));
        if (bArrC != null) {
            this.g.p(bArrC, jB);
        }
    }

    public void a(List list, c cVar) {
        a(new RunnableC1313Qp0(this, cVar, list, 21));
    }

    public void b() throws IOException {
        int iF;
        if (a(this.g)) {
            return;
        }
        if (this.g.h() != 0 || ((iF = this.b.f()) > 0 && w2.a() - this.j <= iF)) {
            c();
        }
    }

    public void d(String str) {
        a(new RunnableC5256j81(this, str, w2.a(), 3));
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public /* synthetic */ void b(a aVar) {
        aVar.b(a(this.g) ? Collections.emptyList() : this.g.e());
    }

    public void c(b3 b3Var) {
        a(new O91(this, 16, b3Var));
    }

    public void d(List list) {
        a(new RunnableC1950Yt1(this, list, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(com.my.tracker.obfuscated.b3 r12, java.lang.String r13, com.my.tracker.obfuscated.g1 r14) {
        /*
            r11 = this;
            com.my.tracker.obfuscated.z2 r0 = r11.b
            com.my.tracker.obfuscated.z2$a r3 = r0.o()
            com.my.tracker.obfuscated.z2 r0 = r11.b
            java.lang.String r0 = r0.q()
            com.my.tracker.obfuscated.z2 r1 = r11.b
            java.lang.String r7 = r1.h()
            com.my.tracker.obfuscated.z2 r1 = r11.b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r10 = r1.n()
            com.my.tracker.obfuscated.r r1 = r11.h
            r1.a()
            com.my.tracker.obfuscated.r r1 = r11.h
            com.my.tracker.obfuscated.h1 r6 = r11.i
            android.content.Context r9 = r11.c
            r2 = r14
            r4 = r12
            r5 = r13
            r8 = r10
            int r12 = a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r13 = 1
            if (r12 == r13) goto L2f
            goto L53
        L2f:
            com.my.tracker.obfuscated.r r12 = r11.h
            com.my.tracker.obfuscated.t0$b r12 = r11.a(r0, r10, r12)
            if (r12 != 0) goto L38
            goto L53
        L38:
            boolean r13 = r12.c()
            if (r13 == 0) goto L46
            java.lang.String r13 = "Events were sent successfully"
            com.my.tracker.obfuscated.y2.a(r13)
            r14.a()
        L46:
            java.lang.Object r12 = r12.b()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L53
            goto L54
        L53:
            r12 = 0
        L54:
            com.my.tracker.obfuscated.r r13 = r11.h
            r13.d()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.f0.a(com.my.tracker.obfuscated.b3, java.lang.String, com.my.tracker.obfuscated.g1):java.lang.String");
    }

    public /* synthetic */ void b(c cVar) {
        cVar.a(a(this.g) ? Collections.emptyList() : this.g.g());
    }

    public static boolean c(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        y2.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    public void d(Map map) {
        a(new RunnableC1794Wt1(1, w2.a(), this, a(map)));
    }

    public /* synthetic */ void b(b3 b3Var) {
        y2.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b3Var.g));
        if (l.a(this.e.g, b3Var.g) != 0 && !a(this.g)) {
            b(this.e, this.f, this.g);
        }
        this.e = b3Var;
    }

    public void a() {
        a(new RunnableC1872Xt1(this, 1));
    }

    public void c(List list) {
        a(new RunnableC1950Yt1(this, list, 1));
    }

    public /* synthetic */ void b(List list) throws IOException {
        if (a(this.g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p0 p0Var = (p0) it.next();
            a(p0Var.e(), p0Var.d(), p0Var.a(), (Map) null, p0Var.f());
            this.g.b(p0Var);
        }
        b();
    }

    public void a(a aVar) {
        a(new O91(this, 15, aVar));
    }

    public void c(Map map) {
        a(new RunnableC1794Wt1(0, w2.a(), this, a(map)));
    }

    public /* synthetic */ void b(String str, String str2, long j, long j2, long j3) throws IOException {
        byte[] bArrB;
        if (a(this.g) || (bArrB = this.i.b(str, str2, j, j2)) == null || !this.g.h(bArrB, j3)) {
            return;
        }
        b();
    }

    public void a(c cVar) {
        a(new O91(this, 18, cVar));
    }

    public void c(float f) {
        a(new RunnableC2028Zt1(this, System.currentTimeMillis(), f, 0));
    }

    public static boolean a(g1 g1Var) {
        if (g1Var != null) {
            return false;
        }
        y2.b("EventTracker error: repository is null");
        return true;
    }

    public /* synthetic */ void b(Map map, long j) throws IOException {
        byte[] bArrB;
        if (a(this.g) || b(map) || (bArrB = this.i.b(map)) == null || !this.g.k(bArrB, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.g)) {
            aVar.b(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.a((f) it.next());
        }
        aVar.b(list);
    }

    public /* synthetic */ void b(long j, float f, float f2, float f3) {
        if (a(this.g) || a(26, j)) {
            return;
        }
        long jB = w2.b(j);
        byte[] bArrB = this.i.b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (bArrB != null) {
            this.g.n(bArrB, jB);
        }
    }

    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.g)) {
            cVar.a(Collections.emptyList());
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.a((p0) it.next());
        }
        cVar.a(list);
    }

    public /* synthetic */ void b(long j, float f) {
        if (a(this.g) || a(28, j)) {
            return;
        }
        long jB = w2.b(j);
        byte[] bArrB = this.i.b((long) (f * 1000.0f));
        if (bArrB != null) {
            this.g.o(bArrB, jB);
        }
    }

    public /* synthetic */ void a(b3 b3Var) {
        this.e = b3Var;
    }

    public /* synthetic */ void b(Map map, String str, String str2, long j) throws IOException {
        byte[] bArrB;
        if (a(this.g) || b(map) || (bArrB = this.i.b(str, str2, map)) == null || !this.g.r(bArrB, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(String str) {
        y2.a("setRemoteConfig: remoteConfig=" + str);
        if (this.f.equals(str)) {
            return;
        }
        if (!a(this.g)) {
            b(this.e, this.f, this.g);
        }
        this.f = str;
    }

    public static boolean b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (c((String) entry.getKey()) || c((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void a(AdEvent adEvent, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(adEvent, k.format(adEvent.revenue))) == null || !this.g.a(adEvent.eventType, bArrA, j)) {
            return;
        }
        b();
    }

    public void b(String str) {
        a(new O91(this, 17, str));
    }

    public /* synthetic */ void a(String str, String str2, long j, long j2, long j3) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2, j, j2)) == null || !this.g.a(bArrA, j3)) {
            return;
        }
        b();
    }

    public void b(String str, String str2, long j, long j2) {
        a(new RunnableC1638Ut1(this, str, str2, j, j2, w2.a(), 0));
    }

    public /* synthetic */ void a(String str, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str)) == null || !this.g.b(bArrA, j)) {
            return;
        }
        b();
    }

    public void b(float f, float f2, float f3) {
        a(new RunnableC2222au1(this, System.currentTimeMillis(), f, f2, f3, 1));
    }

    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, String str2, String str3, long j) throws IOException {
        if (a(this.g) || b(map) || !a(jSONObject, str, str2, str3, map, j)) {
            return;
        }
        b();
    }

    public void b(float f) {
        a(new RunnableC2028Zt1(this, System.currentTimeMillis(), f, 1));
    }

    public /* synthetic */ void a(List list) throws IOException {
        String string;
        if (a(this.g)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            try {
                string = fVar.e().toString();
            } catch (Throwable th) {
                y2.a("Error: purchase data: ", th);
                string = null;
            }
            a(fVar.d(), string, fVar.a(), fVar.f(), (Map) null, fVar.h());
            this.g.b(fVar);
        }
        b();
    }

    public void b(String str, String str2, Map map) {
        a(new RunnableC1482St1(this, a(map), str, str2, w2.a(), 0));
    }

    public /* synthetic */ void a(String str, Map map, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || c(str) || b(map) || (bArrA = this.i.a(str, map)) == null || !this.g.d(bArrA, j)) {
            return;
        }
        b();
    }

    public void b(g1 g1Var) throws IOException {
        String strQ = this.b.q();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderN = this.b.n();
        try {
            InterfaceC2613b interfaceC2613bD = g1Var.d();
            try {
                if (interfaceC2613bD == null) {
                    y2.a("EventTracker error: iterator is null");
                    if (interfaceC2613bD != null) {
                        interfaceC2613bD.close();
                        return;
                    }
                    return;
                }
                while (interfaceC2613bD.b()) {
                    long jA = interfaceC2613bD.a();
                    byte[] bArrI = interfaceC2613bD.i();
                    this.h.a();
                    this.h.b(bArrI);
                    t0.b bVarA = a(strQ, okHttpClientProviderN, this.h);
                    if (bVarA == null) {
                        interfaceC2613bD.close();
                        return;
                    } else {
                        if (!bVarA.c()) {
                            interfaceC2613bD.close();
                            return;
                        }
                        String str = (String) bVarA.b();
                        if (!TextUtils.isEmpty(str)) {
                            this.d.a(str);
                        }
                        g1Var.a(jA);
                    }
                }
                interfaceC2613bD.close();
            } finally {
            }
        } catch (Throwable th) {
            y2.b("EventTracker error: ", th);
        }
    }

    public /* synthetic */ void a(String str, String str2, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2)) == null || !this.g.e(bArrA, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2, String str, long j) throws IOException {
        if (a(this.g) || b(map) || !a(jSONObject, jSONObject2, str, map, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(long j, float f, float f2, float f3) {
        if (a(this.g) || a(27, j)) {
            return;
        }
        long jB = w2.b(j);
        byte[] bArrA = this.i.a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f));
        if (bArrA != null) {
            this.g.g(bArrA, jB);
        }
    }

    public /* synthetic */ void a(long j, String str, p1.a aVar, long j2) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(j, str, aVar)) == null || !this.g.i(bArrA, j2)) {
            return;
        }
        q1.a(this.c).c(j2);
        this.j = j2;
        b();
    }

    public /* synthetic */ void a(Map map, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || b(map) || (bArrA = this.i.a(map)) == null || !this.g.j(bArrA, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(long j) throws IOException {
        if (a(this.g)) {
            return;
        }
        boolean zA = this.g.a(j, q1.a(this.c).n());
        if (this.g.b(j) || zA) {
            c();
        }
    }

    public /* synthetic */ void a(Map map, int i, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || b(map) || (bArrA = this.i.a(i, map)) == null || !this.g.k(bArrA, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(long j, float f) {
        if (a(this.g) || a(25, j)) {
            return;
        }
        long jB = w2.b(j);
        byte[] bArrA = this.i.a((long) (f * 1000.0f));
        if (bArrA != null) {
            this.g.l(bArrA, jB);
        }
    }

    public /* synthetic */ void a(Map map, String str, String str2, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || b(map) || (bArrA = this.i.a(str, str2, map)) == null || !this.g.m(bArrA, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j) throws IOException {
        String str;
        Map<String, String> map;
        if (a(this.g) || c(miniAppEvent.name) || b(miniAppEvent.eventParams)) {
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
        byte[] bArrA = this.i.a(i, str2, miniAppEvent.miniAppId, str, miniAppEvent.platformUserId, i == 20 ? miniAppEvent.query : null, map);
        if (bArrA == null || !this.g.b(i, bArrA, j)) {
            return;
        }
        b();
    }

    public /* synthetic */ void a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) throws IOException {
        if (!a(this.g) && this.g.a(i, bArr, z, z2, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void a(String str, String str2, long j, Runnable runnable) throws IOException {
        if (a(this.g)) {
            return;
        }
        byte[] bArrB = this.i.b(str, str2);
        if (bArrB != null && this.g.q(bArrB, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j) throws IOException {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2, str3, str4, str5)) == null || !this.g.s(bArrA, j)) {
            return;
        }
        q1.a(this.c).c(j);
        this.j = j;
        b();
    }

    public static f0 a(z2 z2Var, b bVar, Context context) {
        return new f0(z2Var, bVar, context);
    }

    private static void a(Runnable runnable) {
        m.a(runnable);
    }

    private t0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, r rVar) {
        if (this.i.a(rVar, w2.a())) {
            return t0.a(new s(rVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }

    private boolean a(JSONObject jSONObject, String str, String str2, String str3, Map map, long j) {
        String string;
        String strValueOf;
        g1 g1Var;
        if (str == null) {
            y2.a("Error: empty data " + str);
            return false;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(str).optString("productId"))) {
                y2.a("Error: empty productId in data ".concat(str));
                return false;
            }
            if (jSONObject != null) {
                try {
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    y2.a("Error: can't convert productInfo json to string", th);
                }
            } else {
                string = null;
            }
            try {
                strValueOf = String.valueOf(jSONObject.optDouble("microsPrice") / 1000000.0d);
            } catch (Throwable th2) {
                y2.a("Error: wrong price in micros in sku details: ", th2);
                strValueOf = null;
            }
            byte[] bArrA = this.i.a(string, str, str2, str3, 0, strValueOf, jSONObject.optString("currency"), map);
            return (bArrA == null || (g1Var = this.g) == null || !g1Var.c(bArrA, j)) ? false : true;
        } catch (Throwable th3) {
            y2.b("Error: creating object failed", th3);
            return false;
        }
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map, long j) {
        String string;
        String string2;
        String str2;
        g1 g1Var;
        String strOptString = null;
        try {
            string = jSONObject2.toString();
        } catch (Throwable th) {
            y2.a("Error: can't convert purchaseData json to string", th);
            string = null;
        }
        if (jSONObject != null) {
            try {
                string2 = jSONObject.toString();
            } catch (Throwable th2) {
                y2.a("Error: can't convert skuDetails json to string", th2);
            }
        } else {
            string2 = null;
        }
        try {
            str2 = k.format(Double.parseDouble(jSONObject.optString("price_amount_micros")) / 1000000.0d);
        } catch (Throwable th3) {
            y2.a("Error: wrong price in micros in sku details: ", th3);
            str2 = null;
        }
        try {
            strOptString = jSONObject.optString("price_currency_code");
        } catch (Throwable th4) {
            y2.a("Error: wrong currency in sku details: ", th4);
        }
        byte[] bArrA = this.i.a(str, string, string2, str2, strOptString, map);
        return (bArrA == null || (g1Var = this.g) == null || !g1Var.f(bArrA, j)) ? false : true;
    }

    public boolean a(int i, long j) {
        Long l = (Long) this.a.get(Integer.valueOf(i));
        if (l == null || j - l.longValue() >= 800) {
            this.a.put(Integer.valueOf(i), Long.valueOf(j));
            return false;
        }
        y2.a("EventTracker: event with type " + i + " was throttled");
        return true;
    }

    public void a(AdEvent adEvent) {
        a(new RunnableC5256j81(this, adEvent, w2.a(), 2));
    }

    public void a(String str, String str2, long j, long j2) {
        a(new RunnableC1638Ut1(this, str, str2, j, j2, w2.a(), 1));
    }

    public void a(JSONObject jSONObject, String str, String str2, String str3, Map map) {
        a(new RunnableC2413bu1(this, a(map), jSONObject, str, str2, str3, w2.a()));
    }

    public void a(String str, Map map) {
        a(new RunnableC1716Vt1(this, str, a(map), w2.a(), 0));
    }

    public void a(String str, String str2) {
        a(new RunnableC1716Vt1(this, str, str2, w2.a(), 1));
    }

    public void a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, Map map) {
        final long jA = w2.a();
        final Map mapA = a(map);
        a(new Runnable() { // from class: Tt1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.a.a(mapA, jSONObject, jSONObject2, str, jA);
            }
        });
    }

    public void a(float f, float f2, float f3) {
        a(new RunnableC2222au1(this, System.currentTimeMillis(), f, f2, f3, 0));
    }

    public void a(long j, String str, p1.a aVar) {
        a(new RunnableC8048xn(this, j, str, aVar, w2.a()));
    }

    public void a(int i, Map map) {
        a(new RunnableC8238yn(this, a(map), i, w2.a(), 1));
    }

    public void a(float f) {
        a(new RunnableC2028Zt1(this, System.currentTimeMillis(), f, 2));
    }

    public void a(String str, String str2, Map map) {
        a(new RunnableC1482St1(this, a(map), str, str2, w2.a(), 1));
    }

    public void a(MiniAppEvent miniAppEvent) {
        a(new RunnableC5256j81(this, miniAppEvent, w2.a(), 4));
    }

    public void a(final int i, final byte[] bArr, final boolean z, final boolean z2, final Runnable runnable) {
        final long jA = w2.a();
        a(new Runnable() { // from class: cu1
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                this.a.a(i, bArr, z, z2, jA, runnable);
            }
        });
    }

    public void a(String str, String str2, Runnable runnable) {
        a(new RunnableC8428zn(this, str, str2, w2.a(), runnable));
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        a(new RunnableC2413bu1(this, str, str2, str3, str4, str5, w2.a()));
    }

    private static int a(s1 s1Var, g1 g1Var, z2.a aVar, b3 b3Var, String str, h1 h1Var, String str2, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!g1Var.j()) {
            return 3;
        }
        long jI = g1Var.i();
        y1 y1VarB = g1Var.b();
        a2 a2VarC = g1Var.c();
        return h1Var.a(s1Var, aVar, b3Var, str, h0.a().a(aVar.m, aVar.g, aVar.e, str2, okHttpClientProvider, context), jI, g1Var.f(), y1VarB, a2VarC);
    }
}
