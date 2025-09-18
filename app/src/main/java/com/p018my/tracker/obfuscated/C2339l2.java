package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.C2395z2;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.my.tracker.obfuscated.l2 */
/* loaded from: classes2.dex */
public final class C2339l2 extends AbstractC2362r1 {

    /* renamed from: c */
    private final C2360r f20021c = new C2360r(65536);

    /* renamed from: a */
    public synchronized byte[] m13289a(C2395z2.a aVar, C2298b3 c2298b3, C2363r2 c2363r2, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        byte[] bArrM13461c;
        if (context == null) {
            AbstractC2391y2.m13572b("TimeSpentMessageBuilder: context is empty");
            throw new Exception("TimeSpentMessageBuilder: context is empty");
        }
        try {
            C2317g0 c2317g0M13142a = C2321h0.m13141a().m13142a(aVar.f20209m, aVar.f20203g, aVar.f20201e, str, okHttpClientProvider, context);
            this.f20021c.m13458a();
            m13287a(this.f20021c, aVar, c2298b3, c2317g0M13142a, c2363r2);
            bArrM13461c = this.f20021c.m13461c();
            this.f20021c.m13462d();
            m13470a();
        } catch (Exception e) {
            AbstractC2391y2.m13573b("TimeSpentMessageBuilder: something went wrong while generating tick packet", e);
            throw new Exception(e);
        }
        return bArrM13461c;
    }

    /* renamed from: a */
    private static void m13288a(AbstractC2366s1 abstractC2366s1, InterfaceC2380w[] interfaceC2380wArr, C2360r c2360r) throws IOException {
        if (interfaceC2380wArr != null) {
            for (InterfaceC2380w interfaceC2380w : interfaceC2380wArr) {
                c2360r.m13458a();
                c2360r.m13484a(1, interfaceC2380w.m13522a());
                c2360r.m13484a(2, interfaceC2380w.mo13516d());
                abstractC2366s1.m13486a(38, c2360r);
            }
        }
    }

    /* renamed from: a */
    private static void m13286a(AbstractC2366s1 abstractC2366s1, InterfaceC2315f2 interfaceC2315f2, InterfaceC2315f2[] interfaceC2315f2Arr, C2360r c2360r) throws IOException {
        if (interfaceC2315f2 != null) {
            c2360r.m13458a();
            c2360r.m13484a(1, interfaceC2315f2.mo13090a());
            c2360r.m13485a(2, interfaceC2315f2.mo12954b());
            c2360r.m13485a(3, interfaceC2315f2.mo12955c());
            abstractC2366s1.m13486a(39, c2360r);
        }
        if (interfaceC2315f2Arr != null) {
            for (InterfaceC2315f2 interfaceC2315f22 : interfaceC2315f2Arr) {
                c2360r.m13458a();
                c2360r.m13484a(1, interfaceC2315f22.mo13090a());
                c2360r.m13485a(2, interfaceC2315f22.mo12954b());
                c2360r.m13485a(3, interfaceC2315f22.mo12955c());
                abstractC2366s1.m13486a(39, c2360r);
            }
        }
    }

    /* renamed from: a */
    private void m13287a(AbstractC2366s1 abstractC2366s1, C2395z2.a aVar, C2298b3 c2298b3, C2317g0 c2317g0, C2363r2 c2363r2) throws IOException {
        String str;
        String str2;
        Map map = aVar.f20207k.f19688e;
        if (map.isEmpty()) {
            str = null;
            str2 = null;
        } else {
            String str3 = (String) map.get("android_id");
            str2 = (String) map.get("mac");
            str = str3;
        }
        abstractC2366s1.m13487a(1, MyTracker.VERSION);
        abstractC2366s1.m13487a(2, aVar.f20197a);
        abstractC2366s1.m13485a(3, c2363r2.m13473c());
        AbstractC2362r1.m13466a(abstractC2366s1, c2317g0.f19940a, c2317g0.f19942c, this.f20112a, this.f20113b);
        AbstractC2362r1.m13465a(abstractC2366s1, c2298b3, this.f20112a);
        AbstractC2362r1.m13469a(abstractC2366s1, str, str2, c2317g0, this.f20112a, this.f20113b);
        AbstractC2362r1.m13467a(abstractC2366s1, c2317g0.f19945f, c2317g0.f19941b, c2317g0.f19942c, this.f20112a);
        AbstractC2362r1.m13464a(abstractC2366s1, c2317g0.f19946g, this.f20112a);
        m13288a(abstractC2366s1, c2363r2.m13472b(), this.f20112a);
        m13286a(abstractC2366s1, c2363r2.m13471a(), c2363r2.m13474d(), this.f20112a);
    }
}
