package com.my.tracker.obfuscated;

import android.text.TextUtils;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.a2;
import com.my.tracker.obfuscated.d0;
import com.my.tracker.obfuscated.j;
import com.my.tracker.obfuscated.p1;
import com.my.tracker.obfuscated.y1;
import com.my.tracker.obfuscated.z2;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class h1 extends r1 {
    private static int a(int i) {
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

    public static h1 b() {
        return new h1();
    }

    public synchronized byte[] c(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 29", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(AdEvent adEvent, String str) {
        try {
            this.a.a();
            this.a.a(1, adEvent.network);
            if (adEvent.eventType == 19) {
                this.a.a(2, str);
                this.a.a(3, adEvent.currency);
            }
            this.a.a(4, adEvent.source);
            this.a.a(5, adEvent.placementId);
            this.a.a(6, adEvent.adId);
            this.a.a(7, adEvent.adFormat);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: " + adEvent.eventType, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 31", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, long j, long j2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
            this.a.a(3, j2);
            this.a.a(4, j);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 14", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str) {
        try {
            this.a.a();
            this.a.a(1, str);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 33", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 26", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, int i, String str5, String str6, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str);
            this.a.a(4, str3);
            if (str != null) {
                this.a.a(5, str5);
                this.a.a(6, str6);
            }
            this.a.a(7, str4);
            this.a.a(8, i);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 32", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 28", th);
            return null;
        }
        return this.a.c();
    }

    private byte[] a(int i, String str, String str2, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str);
            this.a.a(3, str2);
            return this.a.c();
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: " + i, th);
            return null;
        }
    }

    public synchronized byte[] b(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 2", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 6", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] b(String str, String str2, Map map) {
        return a(8, str, str2, map);
    }

    public synchronized byte[] a(String str, String str2) {
        try {
            this.a.a();
            this.a.a(1, str);
            if (!TextUtils.isEmpty(str2)) {
                this.a.a(2, str2);
            }
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 15", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.b.a();
            this.b.a(1, str2);
            this.b.a(2, str);
            this.b.a(3, str3);
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
            if (str3 != null) {
                this.a.a(4, str4);
                this.a.a(5, str5);
            }
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 10", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, long j2, long j3) {
        try {
            this.a.a();
            this.a.a(2, j);
            this.a.a(3, j2);
            this.a.a(4, j3);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 27", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j, String str, p1.a aVar) {
        try {
            this.a.a();
            this.a.a(1, j);
            this.b.a();
            if (!TextUtils.isEmpty(str)) {
                this.b.a(1, str);
            }
            if (aVar != null) {
                this.b.a(2, aVar.a);
            }
            if (aVar != null) {
                this.b.a(3, aVar.b);
            }
            if (aVar != null) {
                this.b.a(4, aVar.c);
            }
            if (this.b.b() > 0) {
                this.a.a(2, this.b);
            }
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 1", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 9", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(int i, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, i);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 13", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(long j) {
        try {
            this.a.a();
            this.a.a(2, j);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 25", th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, Map map) {
        return a(7, str, str2, map);
    }

    public synchronized byte[] a(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        try {
            this.a.a();
            this.a.a(1, map, this.b);
            this.a.a(2, str2);
            this.a.a(3, str4);
            this.a.a(4, str5);
            this.a.a(5, str);
            this.a.a(6, str3);
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: " + i, th);
            return null;
        }
        return this.a.c();
    }

    public synchronized byte[] a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.a.a();
            this.a.a(1, str3);
            this.a.a(2, str4);
            this.a.a(3, str);
            this.a.a(4, str2);
            if (!TextUtils.isEmpty(str5)) {
                this.b.a();
                this.b.a(1, str5);
                if (this.b.b() > 0) {
                    this.a.a(5, this.b);
                }
            }
        } catch (Throwable th) {
            y2.b("Event serialization failed, type: 5", th);
            return null;
        }
        return this.a.c();
    }

    public static void a(s1 s1Var, j jVar, r rVar) throws IOException {
        if (jVar.a.isEmpty()) {
            return;
        }
        for (j.a aVar : jVar.a) {
            rVar.a();
            rVar.a(1, aVar.a);
            rVar.a(2, aVar.b);
            s1Var.a(31, rVar);
        }
    }

    private static int a(r rVar, int i, int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return rVar.a(i, i2);
        }
        return 0;
    }

    private static int a(r rVar, int i, long j) {
        if (j != Long.MAX_VALUE) {
            return rVar.a(i, j);
        }
        return 0;
    }

    private static void a(s1 s1Var, d0.c cVar, r rVar) throws IOException {
        rVar.a();
        a(rVar, 1, cVar.a);
        a(rVar, 2, cVar.b);
        a(rVar, 3, cVar.c);
        a(rVar, 4, cVar.d);
        a(rVar, 5, cVar.e);
        a(rVar, 6, cVar.f);
        a(rVar, 7, cVar.g);
        a(rVar, 8, cVar.h);
        a(rVar, 9, cVar.i);
        a(rVar, 10, cVar.j);
        a(rVar, 11, cVar.k);
        a(rVar, 12, cVar.l);
        s1Var.a(32, rVar);
    }

    public static void a(s1 s1Var, List list, r rVar) throws IOException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0.b bVar = (d0.b) it.next();
            if (bVar instanceof d0.c) {
                a(s1Var, (d0.c) bVar, rVar);
            } else if (bVar instanceof d0.d) {
                a(s1Var, (d0.d) bVar, rVar);
            } else if (bVar instanceof d0.e) {
                a(s1Var, (d0.e) bVar, rVar);
            } else if (bVar instanceof d0.i) {
                a(s1Var, (d0.i) bVar, rVar);
            } else if (bVar instanceof d0.g) {
                a(s1Var, (d0.g) bVar, rVar);
            } else if (bVar instanceof d0.f) {
                a(s1Var, (d0.f) bVar, rVar);
            } else if (bVar instanceof d0.h) {
                a(s1Var, (d0.h) bVar, rVar);
            } else {
                y2.a("Unknown cell-info");
            }
        }
    }

    private static void a(s1 s1Var, d0.d dVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, dVar.a);
        rVar.a(2, dVar.b);
        a(rVar, 3, dVar.c);
        a(rVar, 4, dVar.d);
        a(rVar, 5, dVar.e);
        a(rVar, 6, dVar.f);
        a(rVar, 7, dVar.g);
        a(rVar, 8, dVar.h);
        a(rVar, 9, dVar.i);
        a(rVar, 10, dVar.j);
        s1Var.a(33, rVar);
    }

    private static void a(s1 s1Var, d0.e eVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, eVar.a);
        rVar.a(2, eVar.b);
        a(rVar, 3, eVar.c);
        a(rVar, 4, eVar.d);
        a(rVar, 5, eVar.e);
        a(rVar, 6, eVar.f);
        a(rVar, 7, eVar.g);
        a(rVar, 8, eVar.h);
        a(rVar, 9, eVar.i);
        a(rVar, 10, eVar.j);
        s1Var.a(34, rVar);
    }

    private static void a(s1 s1Var, d0.f fVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, fVar.a);
        rVar.a(2, fVar.b);
        a(rVar, 3, fVar.c);
        a(rVar, 4, fVar.d);
        a(rVar, 5, fVar.e);
        a(rVar, 6, fVar.f);
        a(rVar, 7, fVar.g);
        a(rVar, 8, fVar.h);
        a(rVar, 9, fVar.i);
        s1Var.a(37, rVar);
    }

    private static void a(s1 s1Var, d0.g gVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, gVar.a);
        rVar.a(2, gVar.b);
        a(rVar, 3, gVar.c);
        a(rVar, 4, gVar.d);
        a(rVar, 5, gVar.e);
        a(rVar, 6, gVar.f);
        a(rVar, 7, gVar.g);
        a(rVar, 8, gVar.h);
        a(rVar, 9, gVar.i);
        s1Var.a(36, rVar);
    }

    private static void a(s1 s1Var, d0.h hVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, hVar.a);
        rVar.a(2, hVar.b);
        a(rVar, 3, hVar.c);
        a(rVar, 4, hVar.d);
        s1Var.a(33, rVar);
    }

    private static void a(s1 s1Var, d0.i iVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, iVar.a);
        rVar.a(2, iVar.b);
        a(rVar, 3, iVar.c);
        a(rVar, 4, iVar.d);
        a(rVar, 5, iVar.e);
        a(rVar, 6, iVar.f);
        a(rVar, 7, iVar.g);
        a(rVar, 8, iVar.h);
        a(rVar, 9, iVar.i);
        s1Var.a(35, rVar);
    }

    public static int a(s1 s1Var, y1 y1Var, r rVar) {
        int iA;
        StringBuilder sb;
        int i = 0;
        try {
            y1.a aVarA = y1Var.a();
            iA = 0;
            while (aVarA.b()) {
                try {
                    try {
                        int iG = (int) aVarA.g();
                        try {
                            rVar.a();
                            y1.b bVarD = aVarA.d();
                            while (bVarD.b()) {
                                try {
                                    rVar.a(2, (int) bVarD.e());
                                } catch (Throwable th) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarD.close();
                        } catch (Throwable th3) {
                            y2.b("Error: failed to pack event " + iG, th3);
                        }
                        if (rVar.b() == 0) {
                            sb = new StringBuilder();
                            sb.append("Error: no timestamps for event ");
                            sb.append(iG);
                            sb.append(", event ignored");
                        } else {
                            rVar.a(1, iG);
                            long jC = aVarA.c();
                            if (jC > 0) {
                                rVar.a(3, (int) jC);
                            }
                            byte[] bArrL = aVarA.l();
                            if (bArrL.length > 0) {
                                int iA2 = a(iG);
                                if (iA2 == -1) {
                                    sb = new StringBuilder();
                                    sb.append("Error: unrecognized eventType ");
                                    sb.append(iG);
                                    sb.append(", event ignored");
                                } else {
                                    rVar.a(iA2, bArrL);
                                }
                            }
                            iA += s1Var.a(41, rVar);
                            i++;
                        }
                        y2.b(sb.toString());
                    } catch (Throwable th4) {
                        th = th4;
                        y2.b("Error: failed to get stored events", th);
                        y2.a("Written: events=" + i + ", bytes=" + iA);
                        return iA;
                    }
                } finally {
                }
            }
            aVarA.close();
        } catch (Throwable th5) {
            th = th5;
            iA = 0;
        }
        y2.a("Written: events=" + i + ", bytes=" + iA);
        return iA;
    }

    public static void a(s1 s1Var, MyTrackerParams.a aVar, r rVar) throws IOException {
        rVar.a();
        rVar.a(1, aVar.a);
        rVar.a(2, aVar.c);
        rVar.a(3, aVar.b);
        if (rVar.b() > 0) {
            s1Var.a(24, rVar);
        }
    }

    public synchronized int a(s1 s1Var, z2.a aVar, b3 b3Var, String str, g0 g0Var, long j, long j2, y1 y1Var, a2 a2Var) {
        String str2;
        String str3;
        try {
            if (a(s1Var, y1Var, this.a) + a(s1Var, a2Var, this.a, this.b) == 0) {
                y2.a("No events to send");
                return 3;
            }
            s1Var.a(1, MyTracker.VERSION);
            s1Var.a(2, aVar.a);
            if (j != -1) {
                s1Var.a(3, j);
            }
            if (j2 > 0) {
                s1Var.a(5, (int) j2);
            }
            Map map = aVar.k.e;
            s1Var.a(43, map, this.b);
            if (map.isEmpty()) {
                str2 = null;
                str3 = null;
            } else {
                String str4 = (String) map.get("android_id");
                str3 = (String) map.get("mac");
                str2 = str4;
            }
            r1.a(s1Var, g0Var.a, g0Var.c, this.a, this.b);
            r1.a(s1Var, b3Var, this.a);
            r1.a(s1Var, str2, str3, g0Var, this.a, this.b);
            a(s1Var, aVar.k, this.a);
            r1.a(s1Var, g0Var.f, g0Var.b, g0Var.c, this.a);
            a(s1Var, aVar, this.a);
            r1.a(s1Var, g0Var.g, this.a);
            a(s1Var, g0Var.h, this.a);
            a(s1Var, g0Var.i.a, this.a);
            a(s1Var, g0Var.i.b, this.a);
            if (!TextUtils.isEmpty(str)) {
                s1Var.a(44, str.length() > 255 ? str.substring(0, KotlinVersion.MAX_COMPONENT_VALUE) : str);
            }
            a();
            return 1;
        } catch (Exception e) {
            y2.a("Create packet error: " + e, e);
            a();
            return 2;
        }
    }

    public synchronized boolean a(s1 s1Var, long j) {
        if (j > 0) {
            try {
                s1Var.a(4, j);
            } catch (Exception e) {
                y2.a("Write timestamp send error: " + e, e);
                return false;
            }
        }
        return true;
    }

    public static int a(s1 s1Var, a2 a2Var, r rVar, r rVar2) {
        int i;
        int iA = 0;
        try {
            a2.a aVarA = a2Var.a();
            i = 0;
            while (aVarA.b()) {
                try {
                    try {
                        String strK = aVarA.k();
                        rVar.a();
                        try {
                            a2.b bVarD = aVarA.d();
                            while (bVarD.b()) {
                                try {
                                    rVar2.a();
                                    rVar2.a(1, (int) bVarD.h());
                                    if (!bVarD.f()) {
                                        rVar2.a(2, (int) bVarD.j());
                                    }
                                    rVar.a(1, rVar2);
                                } catch (Throwable th) {
                                    if (bVarD != null) {
                                        try {
                                            bVarD.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bVarD.close();
                        } catch (Throwable th3) {
                            y2.b("Error: failed to read session " + strK + ": ", th3);
                        }
                        if (rVar.b() == 0) {
                            y2.a("No periods for session " + strK + ", id=" + aVarA.a() + ", session ignored");
                        } else {
                            int iC = (int) aVarA.c();
                            if (iC > 0) {
                                rVar.a(2, iC);
                            }
                            iA += s1Var.a(42, rVar);
                            i++;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    y2.b("Error: failed to get stored sessions", th);
                    y2.a("Written: sessions=" + i + ", bytes=" + iA);
                    return iA;
                }
            }
            aVarA.close();
        } catch (Throwable th5) {
            th = th5;
            i = 0;
        }
        y2.a("Written: sessions=" + i + ", bytes=" + iA);
        return iA;
    }

    public static void a(s1 s1Var, z2.a aVar, r rVar) throws IOException {
        rVar.a();
        int i = aVar.b;
        if (i >= 0) {
            rVar.a(1, i);
        }
        if (aVar.e == 0) {
            rVar.a(2, 0);
        }
        if (!aVar.g) {
            rVar.a(3, 0);
        }
        if (!aVar.f) {
            rVar.a(4, 0);
        }
        int i2 = aVar.c;
        if (i2 != 900) {
            rVar.a(5, i2);
        }
        int i3 = aVar.d;
        if (i3 != 0) {
            rVar.a(6, i3);
        }
        if (!aVar.h) {
            rVar.a(7, 0);
        }
        if (!aVar.i) {
            rVar.a(8, 0);
        }
        if (!aVar.j) {
            rVar.a(9, 0);
        }
        AntiFraudConfig antiFraudConfig = aVar.l;
        if (!antiFraudConfig.useLightSensor) {
            rVar.a(11, 0);
        }
        if (!antiFraudConfig.useMagneticFieldSensor) {
            rVar.a(12, 0);
        }
        if (!antiFraudConfig.useGyroscope) {
            rVar.a(13, 0);
        }
        if (!antiFraudConfig.usePressureSensor) {
            rVar.a(14, 0);
        }
        if (!antiFraudConfig.useProximitySensor) {
            rVar.a(15, 0);
        }
        if (rVar.b() > 0) {
            s1Var.a(27, rVar);
        }
    }

    public static void a(s1 s1Var, d0.k kVar, r rVar) throws IOException {
        if (kVar.a != null) {
            rVar.a();
            rVar.a(1, kVar.a.b);
            rVar.a(2, kVar.a.a);
            rVar.a(3, kVar.a.c);
            rVar.a(5, kVar.a.d);
            rVar.a(6, kVar.a.e);
            s1Var.a(28, rVar);
        }
        for (d0.a aVar : kVar.b) {
            rVar.a();
            rVar.a(1, aVar.b);
            rVar.a(2, aVar.a);
            rVar.a(3, aVar.c);
            s1Var.a(29, rVar);
        }
    }
}
