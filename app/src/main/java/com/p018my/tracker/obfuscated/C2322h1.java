package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerParams;
import com.p018my.tracker.ads.AdEvent;
import com.p018my.tracker.config.AntiFraudConfig;
import com.p018my.tracker.obfuscated.C2305d0;
import com.p018my.tracker.obfuscated.C2328j;
import com.p018my.tracker.obfuscated.C2354p1;
import com.p018my.tracker.obfuscated.C2395z2;
import com.p018my.tracker.obfuscated.InterfaceC2292a2;
import com.p018my.tracker.obfuscated.InterfaceC2390y1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* renamed from: com.my.tracker.obfuscated.h1 */
/* loaded from: classes2.dex */
public class C2322h1 extends AbstractC2362r1 {
    /* renamed from: a */
    private static int m13143a(int i) {
        switch (i) {
            case 1:
                return 12;
            case 2:
                return 13;
            case 3:
                return 11;
            case 4:
            case 11:
            case 12:
            case 16:
            case 30:
            default:
                return -1;
            case 5:
                return 17;
            case 6:
                return 22;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 10:
                return 23;
            case 13:
                return 21;
            case 14:
                return 14;
            case 15:
                return 16;
            case 17:
                return 25;
            case 18:
                return 26;
            case 19:
                return 27;
            case 20:
                return 28;
            case 21:
                return 29;
            case 22:
                return 30;
            case 23:
                return 31;
            case 24:
                return 32;
            case 25:
                return 33;
            case 26:
                return 34;
            case 27:
                return 35;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return 36;
            case 29:
                return 37;
            case 31:
                return 39;
            case 32:
                return 40;
            case 33:
                return 41;
        }
    }

    /* renamed from: b */
    public static C2322h1 m13161b() {
        return new C2322h1();
    }

    /* renamed from: c */
    public synchronized byte[] m13185c(long j) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(2, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 29", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13169a(AdEvent adEvent, String str) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13484a(1, adEvent.network);
            if (adEvent.eventType == 19) {
                this.f20112a.m13487a(2, str);
                this.f20112a.m13487a(3, adEvent.currency);
            }
            this.f20112a.m13487a(4, adEvent.source);
            this.f20112a.m13487a(5, adEvent.placementId);
            this.f20112a.m13487a(6, adEvent.adId);
            this.f20112a.m13487a(7, adEvent.adFormat);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: " + adEvent.eventType, th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: b */
    public synchronized byte[] m13182b(String str, String str2, long j, long j2) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f20112a.m13487a(2, str2);
            }
            this.f20112a.m13485a(3, j2);
            this.f20112a.m13485a(4, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13172a(String str, String str2, long j, long j2) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f20112a.m13487a(2, str2);
            }
            this.f20112a.m13485a(3, j2);
            this.f20112a.m13485a(4, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: b */
    public synchronized byte[] m13184b(Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13170a(String str) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: b */
    public synchronized byte[] m13180b(long j, long j2, long j3) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(2, j);
            this.f20112a.m13485a(3, j2);
            this.f20112a.m13485a(4, j3);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 26", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13173a(String str, String str2, String str3, String str4, int i, String str5, String str6, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20112a.m13487a(2, str2);
            this.f20112a.m13487a(3, str);
            this.f20112a.m13487a(4, str3);
            if (str != null) {
                this.f20112a.m13487a(5, str5);
                this.f20112a.m13487a(6, str6);
            }
            this.f20112a.m13487a(7, str4);
            this.f20112a.m13484a(8, i);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 32", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: b */
    public synchronized byte[] m13179b(long j) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(2, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 28", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    private byte[] m13160a(int i, String str, String str2, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20112a.m13487a(2, str);
            this.f20112a.m13487a(3, str2);
            return this.f20112a.m13461c();
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: " + i, th);
            return null;
        }
    }

    /* renamed from: b */
    public synchronized byte[] m13181b(String str, String str2) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f20112a.m13487a(2, str2);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13177a(String str, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20112a.m13487a(2, str);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 6", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: b */
    public synchronized byte[] m13183b(String str, String str2, Map map) {
        return m13160a(8, str, str2, map);
    }

    /* renamed from: a */
    public synchronized byte[] m13171a(String str, String str2) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.f20112a.m13487a(2, str2);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13175a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20113b.m13458a();
            this.f20113b.m13487a(1, str2);
            this.f20113b.m13487a(2, str);
            this.f20113b.m13487a(3, str3);
            if (this.f20113b.m13460b() > 0) {
                this.f20112a.m13486a(2, this.f20113b);
            }
            if (str3 != null) {
                this.f20112a.m13487a(4, str4);
                this.f20112a.m13487a(5, str5);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 10", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13167a(long j, long j2, long j3) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(2, j);
            this.f20112a.m13485a(3, j2);
            this.f20112a.m13485a(4, j3);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 27", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13168a(long j, String str, C2354p1.a aVar) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(1, j);
            this.f20113b.m13458a();
            if (!TextUtils.isEmpty(str)) {
                this.f20113b.m13487a(1, str);
            }
            if (aVar != null) {
                this.f20113b.m13484a(2, aVar.f20091a);
            }
            if (aVar != null) {
                this.f20113b.m13487a(3, aVar.f20092b);
            }
            if (aVar != null) {
                this.f20113b.m13487a(4, aVar.f20093c);
            }
            if (this.f20113b.m13460b() > 0) {
                this.f20112a.m13486a(2, this.f20113b);
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13178a(Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 9", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13165a(int i, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20112a.m13484a(2, i);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13166a(long j) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13485a(2, j);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 25", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13176a(String str, String str2, Map map) {
        return m13160a(7, str, str2, map);
    }

    /* renamed from: a */
    public synchronized byte[] m13164a(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13488a(1, map, this.f20113b);
            this.f20112a.m13487a(2, str2);
            this.f20112a.m13487a(3, str4);
            this.f20112a.m13487a(4, str5);
            this.f20112a.m13487a(5, str);
            this.f20112a.m13487a(6, str3);
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: " + i, th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public synchronized byte[] m13174a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f20112a.m13458a();
            this.f20112a.m13487a(1, str3);
            this.f20112a.m13487a(2, str4);
            this.f20112a.m13487a(3, str);
            this.f20112a.m13487a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.f20113b.m13458a();
                this.f20113b.m13487a(1, str5);
                if (this.f20113b.m13460b() > 0) {
                    this.f20112a.m13486a(5, this.f20113b);
                }
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.f20112a.m13461c();
    }

    /* renamed from: a */
    public static void m13157a(AbstractC2366s1 abstractC2366s1, C2328j c2328j, C2360r c2360r) throws IOException {
        if (c2328j.f19987a.isEmpty()) {
            return;
        }
        for (C2328j.a aVar : c2328j.f19987a) {
            c2360r.m13458a();
            c2360r.m13487a(1, aVar.f19988a);
            c2360r.m13485a(2, aVar.f19989b);
            abstractC2366s1.m13486a(31, c2360r);
        }
    }

    /* renamed from: a */
    private static int m13144a(C2360r c2360r, int i, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return c2360r.m13484a(i, i2);
        }
        return 0;
    }

    /* renamed from: a */
    private static int m13145a(C2360r c2360r, int i, long j) {
        if (j != Long.MAX_VALUE) {
            return c2360r.m13485a(i, j);
        }
        return 0;
    }

    /* renamed from: a */
    private static void m13149a(AbstractC2366s1 abstractC2366s1, C2305d0.c cVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        m13144a(c2360r, 1, cVar.f19803a);
        m13144a(c2360r, 2, cVar.f19804b);
        m13144a(c2360r, 3, cVar.f19805c);
        m13144a(c2360r, 4, cVar.f19806d);
        m13144a(c2360r, 5, cVar.f19807e);
        m13144a(c2360r, 6, cVar.f19808f);
        m13144a(c2360r, 7, cVar.f19809g);
        m13144a(c2360r, 8, cVar.f19810h);
        m13144a(c2360r, 9, cVar.f19811i);
        m13144a(c2360r, 10, cVar.f19812j);
        m13144a(c2360r, 11, cVar.f19813k);
        m13144a(c2360r, 12, cVar.f19814l);
        abstractC2366s1.m13486a(32, c2360r);
    }

    /* renamed from: a */
    public static void m13159a(AbstractC2366s1 abstractC2366s1, List list, C2360r c2360r) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2305d0.b bVar = (C2305d0.b) it.next();
            if (bVar instanceof C2305d0.c) {
                m13149a(abstractC2366s1, (C2305d0.c) bVar, c2360r);
            } else if (bVar instanceof C2305d0.d) {
                m13150a(abstractC2366s1, (C2305d0.d) bVar, c2360r);
            } else if (bVar instanceof C2305d0.e) {
                m13151a(abstractC2366s1, (C2305d0.e) bVar, c2360r);
            } else if (bVar instanceof C2305d0.i) {
                m13155a(abstractC2366s1, (C2305d0.i) bVar, c2360r);
            } else if (bVar instanceof C2305d0.g) {
                m13153a(abstractC2366s1, (C2305d0.g) bVar, c2360r);
            } else if (bVar instanceof C2305d0.f) {
                m13152a(abstractC2366s1, (C2305d0.f) bVar, c2360r);
            } else if (bVar instanceof C2305d0.h) {
                m13154a(abstractC2366s1, (C2305d0.h) bVar, c2360r);
            } else {
                AbstractC2391y2.m13568a("Unknown cell-info");
            }
        }
    }

    /* renamed from: a */
    private static void m13150a(AbstractC2366s1 abstractC2366s1, C2305d0.d dVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, dVar.f19815a);
        c2360r.m13487a(2, dVar.f19816b);
        m13144a(c2360r, 3, dVar.f19817c);
        m13144a(c2360r, 4, dVar.f19818d);
        m13144a(c2360r, 5, dVar.f19819e);
        m13144a(c2360r, 6, dVar.f19820f);
        m13144a(c2360r, 7, dVar.f19821g);
        m13144a(c2360r, 8, dVar.f19822h);
        m13144a(c2360r, 9, dVar.f19823i);
        m13144a(c2360r, 10, dVar.f19824j);
        abstractC2366s1.m13486a(33, c2360r);
    }

    /* renamed from: a */
    private static void m13151a(AbstractC2366s1 abstractC2366s1, C2305d0.e eVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, eVar.f19825a);
        c2360r.m13487a(2, eVar.f19826b);
        m13144a(c2360r, 3, eVar.f19827c);
        m13144a(c2360r, 4, eVar.f19828d);
        m13144a(c2360r, 5, eVar.f19829e);
        m13144a(c2360r, 6, eVar.f19830f);
        m13144a(c2360r, 7, eVar.f19831g);
        m13144a(c2360r, 8, eVar.f19832h);
        m13144a(c2360r, 9, eVar.f19833i);
        m13144a(c2360r, 10, eVar.f19834j);
        abstractC2366s1.m13486a(34, c2360r);
    }

    /* renamed from: a */
    private static void m13152a(AbstractC2366s1 abstractC2366s1, C2305d0.f fVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, fVar.f19835a);
        c2360r.m13487a(2, fVar.f19836b);
        m13145a(c2360r, 3, fVar.f19837c);
        m13144a(c2360r, 4, fVar.f19838d);
        m13144a(c2360r, 5, fVar.f19839e);
        m13144a(c2360r, 6, fVar.f19840f);
        m13144a(c2360r, 7, fVar.f19841g);
        m13144a(c2360r, 8, fVar.f19842h);
        m13144a(c2360r, 9, fVar.f19843i);
        abstractC2366s1.m13486a(37, c2360r);
    }

    /* renamed from: a */
    private static void m13153a(AbstractC2366s1 abstractC2366s1, C2305d0.g gVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, gVar.f19844a);
        c2360r.m13487a(2, gVar.f19845b);
        m13144a(c2360r, 3, gVar.f19846c);
        m13144a(c2360r, 4, gVar.f19847d);
        m13144a(c2360r, 5, gVar.f19848e);
        m13144a(c2360r, 6, gVar.f19849f);
        m13144a(c2360r, 7, gVar.f19850g);
        m13144a(c2360r, 8, gVar.f19851h);
        m13144a(c2360r, 9, gVar.f19852i);
        abstractC2366s1.m13486a(36, c2360r);
    }

    /* renamed from: a */
    private static void m13154a(AbstractC2366s1 abstractC2366s1, C2305d0.h hVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, hVar.f19853a);
        c2360r.m13487a(2, hVar.f19854b);
        m13144a(c2360r, 3, hVar.f19855c);
        m13144a(c2360r, 4, hVar.f19856d);
        abstractC2366s1.m13486a(33, c2360r);
    }

    /* renamed from: a */
    private static void m13155a(AbstractC2366s1 abstractC2366s1, C2305d0.i iVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, iVar.f19857a);
        c2360r.m13487a(2, iVar.f19858b);
        m13144a(c2360r, 3, iVar.f19859c);
        m13144a(c2360r, 4, iVar.f19860d);
        m13144a(c2360r, 5, iVar.f19861e);
        m13144a(c2360r, 6, iVar.f19862f);
        m13144a(c2360r, 7, iVar.f19863g);
        m13144a(c2360r, 8, iVar.f19864h);
        m13144a(c2360r, 9, iVar.f19865i);
        abstractC2366s1.m13486a(35, c2360r);
    }

    /* renamed from: a */
    public static int m13147a(AbstractC2366s1 abstractC2366s1, InterfaceC2390y1 interfaceC2390y1, C2360r c2360r) {
        int iM13486a;
        StringBuilder sb;
        int i = 0;
        try {
            InterfaceC2390y1.a aVarMo13560a = interfaceC2390y1.mo13560a();
            iM13486a = 0;
            while (aVarMo13560a.mo13561b()) {
                try {
                    try {
                        int iMo13564g = (int) aVarMo13560a.mo13564g();
                        try {
                            c2360r.m13458a();
                            InterfaceC2390y1.b bVarMo13563d = aVarMo13560a.mo13563d();
                            while (bVarMo13563d.mo13566b()) {
                                try {
                                    c2360r.m13484a(2, (int) bVarMo13563d.mo13567e());
                                } catch (Throwable th) {
                                    if (bVarMo13563d != null) {
                                        try {
                                            bVarMo13563d.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarMo13563d.close();
                        } catch (Throwable th3) {
                            AbstractC2391y2.m13573b("Error: failed to pack event " + iMo13564g, th3);
                        }
                        if (c2360r.m13460b() == 0) {
                            sb = new StringBuilder();
                            sb.append("Error: no timestamps for event ");
                            sb.append(iMo13564g);
                            sb.append(", event ignored");
                        } else {
                            c2360r.m13484a(1, iMo13564g);
                            long jMo13562c = aVarMo13560a.mo13562c();
                            if (jMo13562c > 0) {
                                c2360r.m13484a(3, (int) jMo13562c);
                            }
                            byte[] bArrMo13565l = aVarMo13560a.mo13565l();
                            if (bArrMo13565l.length > 0) {
                                int iM13143a = m13143a(iMo13564g);
                                if (iM13143a == -1) {
                                    sb = new StringBuilder();
                                    sb.append("Error: unrecognized eventType ");
                                    sb.append(iMo13564g);
                                    sb.append(", event ignored");
                                } else {
                                    c2360r.m13489a(iM13143a, bArrMo13565l);
                                }
                            }
                            iM13486a += abstractC2366s1.m13486a(41, c2360r);
                            i++;
                        }
                        AbstractC2391y2.m13572b(sb.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        AbstractC2391y2.m13573b("Error: failed to get stored events", th);
                        AbstractC2391y2.m13568a("Written: events=" + i + ", bytes=" + iM13486a);
                        return iM13486a;
                    }
                } finally {
                }
            }
            aVarMo13560a.close();
        } catch (Throwable th5) {
            th = th5;
            iM13486a = 0;
        }
        AbstractC2391y2.m13568a("Written: events=" + i + ", bytes=" + iM13486a);
        return iM13486a;
    }

    /* renamed from: a */
    public static void m13148a(AbstractC2366s1 abstractC2366s1, MyTrackerParams.C2285a c2285a, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        c2360r.m13487a(1, c2285a.f19684a);
        c2360r.m13487a(2, c2285a.f19686c);
        c2360r.m13487a(3, c2285a.f19685b);
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(24, c2360r);
        }
    }

    /* renamed from: a */
    public synchronized int m13162a(AbstractC2366s1 abstractC2366s1, C2395z2.a aVar, C2298b3 c2298b3, String str, C2317g0 c2317g0, long j, long j2, InterfaceC2390y1 interfaceC2390y1, InterfaceC2292a2 interfaceC2292a2) {
        String str2;
        String str3;
        try {
            if (m13147a(abstractC2366s1, interfaceC2390y1, this.f20112a) + m13146a(abstractC2366s1, interfaceC2292a2, this.f20112a, this.f20113b) == 0) {
                AbstractC2391y2.m13568a("No events to send");
                return 3;
            }
            abstractC2366s1.m13487a(1, MyTracker.VERSION);
            abstractC2366s1.m13487a(2, aVar.f20197a);
            if (j != -1) {
                abstractC2366s1.m13485a(3, j);
            }
            if (j2 > 0) {
                abstractC2366s1.m13484a(5, (int) j2);
            }
            Map map = aVar.f20207k.f19688e;
            abstractC2366s1.m13488a(43, map, this.f20113b);
            if (map.isEmpty()) {
                str2 = null;
                str3 = null;
            } else {
                String str4 = (String) map.get("android_id");
                str3 = (String) map.get("mac");
                str2 = str4;
            }
            AbstractC2362r1.m13466a(abstractC2366s1, c2317g0.f19940a, c2317g0.f19942c, this.f20112a, this.f20113b);
            AbstractC2362r1.m13465a(abstractC2366s1, c2298b3, this.f20112a);
            AbstractC2362r1.m13469a(abstractC2366s1, str2, str3, c2317g0, this.f20112a, this.f20113b);
            m13148a(abstractC2366s1, aVar.f20207k, this.f20112a);
            AbstractC2362r1.m13467a(abstractC2366s1, c2317g0.f19945f, c2317g0.f19941b, c2317g0.f19942c, this.f20112a);
            m13158a(abstractC2366s1, aVar, this.f20112a);
            AbstractC2362r1.m13464a(abstractC2366s1, c2317g0.f19946g, this.f20112a);
            m13157a(abstractC2366s1, c2317g0.f19947h, this.f20112a);
            m13159a(abstractC2366s1, c2317g0.f19948i.f19798a, this.f20112a);
            m13156a(abstractC2366s1, c2317g0.f19948i.f19799b, this.f20112a);
            if (!TextUtils.isEmpty(str)) {
                abstractC2366s1.m13487a(44, str.length() > 255 ? str.substring(0, KotlinVersion.MAX_COMPONENT_VALUE) : str);
            }
            m13470a();
            return 1;
        } catch (Exception e) {
            AbstractC2391y2.m13569a("Create packet error: " + e, e);
            m13470a();
            return 2;
        }
    }

    /* renamed from: a */
    public synchronized boolean m13163a(AbstractC2366s1 abstractC2366s1, long j) {
        if (j > 0) {
            try {
                abstractC2366s1.m13485a(4, j);
            } catch (Exception e) {
                AbstractC2391y2.m13569a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m13146a(AbstractC2366s1 abstractC2366s1, InterfaceC2292a2 interfaceC2292a2, C2360r c2360r, C2360r c2360r2) {
        int i;
        int iM13486a = 0;
        try {
            InterfaceC2292a2.a aVarMo12774a = interfaceC2292a2.mo12774a();
            i = 0;
            while (aVarMo12774a.mo12776b()) {
                try {
                    try {
                        String strMo12779k = aVarMo12774a.mo12779k();
                        c2360r.m13458a();
                        try {
                            InterfaceC2292a2.b bVarMo12778d = aVarMo12774a.mo12778d();
                            while (bVarMo12778d.mo12780b()) {
                                try {
                                    c2360r2.m13458a();
                                    c2360r2.m13484a(1, (int) bVarMo12778d.mo12782h());
                                    if (!bVarMo12778d.mo12781f()) {
                                        c2360r2.m13484a(2, (int) bVarMo12778d.mo12783j());
                                    }
                                    c2360r.m13486a(1, c2360r2);
                                } catch (Throwable th) {
                                    if (bVarMo12778d != null) {
                                        try {
                                            bVarMo12778d.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarMo12778d.close();
                        } catch (Throwable th3) {
                            AbstractC2391y2.m13573b("Error: failed to read session " + strMo12779k + ": ", th3);
                        }
                        if (c2360r.m13460b() == 0) {
                            AbstractC2391y2.m13568a("No periods for session " + strMo12779k + ", id=" + aVarMo12774a.mo12775a() + ", session ignored");
                        } else {
                            int iMo12777c = (int) aVarMo12774a.mo12777c();
                            if (iMo12777c > 0) {
                                c2360r.m13484a(2, iMo12777c);
                            }
                            iM13486a += abstractC2366s1.m13486a(42, c2360r);
                            i++;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AbstractC2391y2.m13573b("Error: failed to get stored sessions", th);
                    AbstractC2391y2.m13568a("Written: sessions=" + i + ", bytes=" + iM13486a);
                    return iM13486a;
                }
            }
            aVarMo12774a.close();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
        }
        AbstractC2391y2.m13568a("Written: sessions=" + i + ", bytes=" + iM13486a);
        return iM13486a;
    }

    /* renamed from: a */
    public static void m13158a(AbstractC2366s1 abstractC2366s1, C2395z2.a aVar, C2360r c2360r) throws IOException {
        c2360r.m13458a();
        int i = aVar.f20198b;
        if (i >= 0) {
            c2360r.m13484a(1, i);
        }
        if (aVar.f20201e == 0) {
            c2360r.m13484a(2, 0);
        }
        if (!aVar.f20203g) {
            c2360r.m13484a(3, 0);
        }
        if (!aVar.f20202f) {
            c2360r.m13484a(4, 0);
        }
        int i2 = aVar.f20199c;
        if (i2 != 900) {
            c2360r.m13484a(5, i2);
        }
        int i3 = aVar.f20200d;
        if (i3 != 0) {
            c2360r.m13484a(6, i3);
        }
        if (!aVar.f20204h) {
            c2360r.m13484a(7, 0);
        }
        if (!aVar.f20205i) {
            c2360r.m13484a(8, 0);
        }
        if (!aVar.f20206j) {
            c2360r.m13484a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.f20208l;
        if (!antiFraudConfig.useLightSensor) {
            c2360r.m13484a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            c2360r.m13484a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            c2360r.m13484a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            c2360r.m13484a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            c2360r.m13484a(15, 0);
        }
        if (c2360r.m13460b() > 0) {
            abstractC2366s1.m13486a(27, c2360r);
        }
    }

    /* renamed from: a */
    public static void m13156a(AbstractC2366s1 abstractC2366s1, C2305d0.k kVar, C2360r c2360r) throws IOException {
        if (kVar.f19871a != null) {
            c2360r.m13458a();
            c2360r.m13487a(1, kVar.f19871a.f19867b);
            c2360r.m13487a(2, kVar.f19871a.f19866a);
            c2360r.m13484a(3, kVar.f19871a.f19868c);
            c2360r.m13484a(5, kVar.f19871a.f19869d);
            c2360r.m13484a(6, kVar.f19871a.f19870e);
            abstractC2366s1.m13486a(28, c2360r);
        }
        for (C2305d0.a aVar : kVar.f19872b) {
            c2360r.m13458a();
            c2360r.m13487a(1, aVar.f19801b);
            c2360r.m13487a(2, aVar.f19800a);
            c2360r.m13484a(3, aVar.f19802c);
            abstractC2366s1.m13486a(29, c2360r);
        }
    }
}
