package io.sentry.protocol;

import io.sentry.C6055k0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5826a0;
import io.sentry.config.AbstractC6003a;
import io.sentry.rrweb.C6130a;
import io.sentry.rrweb.C6136g;
import io.sentry.rrweb.C6138i;
import io.sentry.rrweb.C6139j;
import io.sentry.rrweb.C6141l;
import io.sentry.rrweb.C6142m;
import io.sentry.rrweb.EnumC6132c;
import io.sentry.rrweb.EnumC6133d;
import io.sentry.rrweb.EnumC6135f;
import io.sentry.vendor.gson.stream.EnumC6185b;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.D */
/* loaded from: classes2.dex */
public final class C6081D implements InterfaceC5826a0 {

    /* renamed from: a */
    public final /* synthetic */ int f34287a;

    public /* synthetic */ C6081D(int i) {
        this.f34287a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: b */
    public static C6130a m21843b(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        int i = 0;
        int i2 = 4;
        c6055k0.m21817n();
        C6130a c6130a = new C6130a();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            if (strM21813h0.equals("data")) {
                c6055k0.m21817n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    String strM21813h02 = c6055k0.m21813h0();
                    strM21813h02.getClass();
                    if (strM21813h02.equals("payload")) {
                        c6055k0.m21817n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                            String strM21813h03 = c6055k0.m21813h0();
                            strM21813h03.getClass();
                            int i3 = -1;
                            switch (strM21813h03.hashCode()) {
                                case 3076010:
                                    if (strM21813h03.equals("data")) {
                                        i3 = i;
                                        break;
                                    }
                                    break;
                                case 3575610:
                                    if (strM21813h03.equals("type")) {
                                        i3 = 1;
                                        break;
                                    }
                                    break;
                                case 50511102:
                                    if (strM21813h03.equals("category")) {
                                        i3 = 2;
                                        break;
                                    }
                                    break;
                                case 55126294:
                                    if (strM21813h03.equals("timestamp")) {
                                        i3 = 3;
                                        break;
                                    }
                                    break;
                                case 102865796:
                                    if (strM21813h03.equals("level")) {
                                        i3 = 4;
                                        break;
                                    }
                                    break;
                                case 954925063:
                                    if (strM21813h03.equals("message")) {
                                        i3 = 5;
                                        break;
                                    }
                                    break;
                            }
                            switch (i3) {
                                case 0:
                                    ConcurrentHashMap concurrentHashMapM21732A = AbstractC6003a.m21732A((Map) c6055k0.m21816m0());
                                    if (concurrentHashMapM21732A == null) {
                                        break;
                                    } else {
                                        c6130a.f34556i = concurrentHashMapM21732A;
                                        break;
                                    }
                                case 1:
                                    c6130a.f34552e = c6055k0.m21822p0();
                                    break;
                                case 2:
                                    c6130a.f34553f = c6055k0.m21822p0();
                                    break;
                                case 3:
                                    c6130a.f34551d = c6055k0.m21828x();
                                    break;
                                case 4:
                                    try {
                                        c6130a.f34555h = EnumC6069n1.valueOf(c6055k0.m21820o0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        iLogger.mo21405c(EnumC6069n1.DEBUG, e, "Error when deserializing SentryLevel", new Object[i]);
                                        break;
                                    }
                                case 5:
                                    c6130a.f34554g = c6055k0.m21822p0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c6055k0.m21823q0(iLogger, concurrentHashMap2, strM21813h03);
                                    break;
                            }
                            i = 0;
                        }
                        c6130a.f34558k = concurrentHashMap2;
                        c6055k0.m21819o();
                    } else if (strM21813h02.equals("tag")) {
                        String strM21822p0 = c6055k0.m21822p0();
                        if (strM21822p0 == null) {
                            strM21822p0 = "";
                        }
                        c6130a.f34550c = strM21822p0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h02);
                    }
                    i = 0;
                }
                c6130a.f34559l = concurrentHashMap;
                c6055k0.m21819o();
            } else if (strM21813h0.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(i2));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6130a.f34560a = enumC6132c;
            } else if (strM21813h0.equals("timestamp")) {
                c6130a.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h0);
            }
            i = 0;
        }
        c6130a.f34557j = map;
        c6055k0.m21819o();
        return c6130a;
    }

    /* renamed from: c */
    public static C6136g m21844c(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        int i = 5;
        int i2 = 4;
        c6055k0.m21817n();
        C6136g c6136g = new C6136g();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h02 = c6055k0.m21813h0();
            strM21813h02.getClass();
            if (strM21813h02.equals("data")) {
                c6055k0.m21817n();
                HashMap map2 = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    strM21813h0 = c6055k0.m21813h0();
                    strM21813h0.getClass();
                    switch (strM21813h0) {
                        case "x":
                            c6136g.f34565f = c6055k0.m21804D();
                            break;
                        case "y":
                            c6136g.f34566g = c6055k0.m21804D();
                            break;
                        case "id":
                            c6136g.f34564e = c6055k0.m21806S();
                            break;
                        case "type":
                            c6136g.f34563d = (EnumC6135f) c6055k0.m21818n0(iLogger, new C6081D(7));
                            break;
                        case "pointerType":
                            c6136g.f34567h = c6055k0.m21806S();
                            break;
                        case "pointerId":
                            c6136g.f34568i = c6055k0.m21806S();
                            break;
                        default:
                            if (!strM21813h0.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                c6055k0.m21823q0(iLogger, map2, strM21813h0);
                                break;
                            } else {
                                EnumC6133d enumC6133d = (EnumC6133d) c6055k0.m21818n0(iLogger, new C6081D(i));
                                AbstractC6003a.m21735D(enumC6133d, "");
                                c6136g.f34562c = enumC6133d;
                                break;
                            }
                    }
                }
                c6136g.f34570k = map2;
                c6055k0.m21819o();
            } else if (strM21813h02.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(i2));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6136g.f34560a = enumC6132c;
            } else if (strM21813h02.equals("timestamp")) {
                c6136g.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h02);
            }
        }
        c6136g.f34569j = map;
        c6055k0.m21819o();
        return c6136g;
    }

    /* renamed from: d */
    public static C6138i m21845d(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        c6055k0.m21817n();
        C6138i c6138i = new C6138i();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            if (strM21813h0.equals("data")) {
                c6055k0.m21817n();
                HashMap map2 = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    String strM21813h02 = c6055k0.m21813h0();
                    strM21813h02.getClass();
                    if (strM21813h02.equals("pointerId")) {
                        c6138i.f34576d = c6055k0.m21806S();
                    } else if (strM21813h02.equals("positions")) {
                        c6138i.f34577e = c6055k0.m21808W(iLogger, new C6081D(9));
                    } else if (strM21813h02.equals("source")) {
                        EnumC6133d enumC6133d = (EnumC6133d) c6055k0.m21818n0(iLogger, new C6081D(5));
                        AbstractC6003a.m21735D(enumC6133d, "");
                        c6138i.f34562c = enumC6133d;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c6055k0.m21823q0(iLogger, map2, strM21813h02);
                    }
                }
                c6138i.f34579g = map2;
                c6055k0.m21819o();
            } else if (strM21813h0.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(4));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6138i.f34560a = enumC6132c;
            } else if (strM21813h0.equals("timestamp")) {
                c6138i.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h0);
            }
        }
        c6138i.f34578f = map;
        c6055k0.m21819o();
        return c6138i;
    }

    /* renamed from: e */
    public static C6139j m21846e(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        c6055k0.m21817n();
        C6139j c6139j = new C6139j();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h02 = c6055k0.m21813h0();
            strM21813h02.getClass();
            if (strM21813h02.equals("data")) {
                c6055k0.m21817n();
                AbstractMap concurrentHashMap = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    strM21813h0 = c6055k0.m21813h0();
                    strM21813h0.getClass();
                    switch (strM21813h0) {
                        case "height":
                            Integer numM21807U = c6055k0.m21807U();
                            c6139j.f34581d = numM21807U == null ? 0 : numM21807U.intValue();
                            break;
                        case "href":
                            String strM21822p0 = c6055k0.m21822p0();
                            if (strM21822p0 == null) {
                                strM21822p0 = "";
                            }
                            c6139j.f34580c = strM21822p0;
                            break;
                        case "width":
                            Integer numM21807U2 = c6055k0.m21807U();
                            c6139j.f34582e = numM21807U2 == null ? 0 : numM21807U2.intValue();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                            break;
                    }
                }
                c6055k0.m21819o();
            } else if (strM21813h02.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(4));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6139j.f34560a = enumC6132c;
            } else if (strM21813h02.equals("timestamp")) {
                c6139j.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h02);
            }
        }
        c6139j.f34583f = map;
        c6055k0.m21819o();
        return c6139j;
    }

    /* renamed from: f */
    public static C6141l m21847f(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        int i = 4;
        c6055k0.m21817n();
        C6141l c6141l = new C6141l();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h02 = c6055k0.m21813h0();
            strM21813h02.getClass();
            if (strM21813h02.equals("data")) {
                c6055k0.m21817n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    String strM21813h03 = c6055k0.m21813h0();
                    strM21813h03.getClass();
                    if (strM21813h03.equals("payload")) {
                        c6055k0.m21817n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                            strM21813h0 = c6055k0.m21813h0();
                            strM21813h0.getClass();
                            switch (strM21813h0) {
                                case "description":
                                    c6141l.f34588e = c6055k0.m21822p0();
                                    break;
                                case "endTimestamp":
                                    c6141l.f34590g = c6055k0.m21828x();
                                    break;
                                case "startTimestamp":
                                    c6141l.f34589f = c6055k0.m21828x();
                                    break;
                                case "op":
                                    c6141l.f34587d = c6055k0.m21822p0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapM21732A = AbstractC6003a.m21732A((Map) c6055k0.m21816m0());
                                    if (concurrentHashMapM21732A == null) {
                                        break;
                                    } else {
                                        c6141l.f34591h = concurrentHashMapM21732A;
                                        break;
                                    }
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c6055k0.m21823q0(iLogger, concurrentHashMap2, strM21813h0);
                                    break;
                            }
                        }
                        c6141l.f34593j = concurrentHashMap2;
                        c6055k0.m21819o();
                    } else if (strM21813h03.equals("tag")) {
                        String strM21822p0 = c6055k0.m21822p0();
                        if (strM21822p0 == null) {
                            strM21822p0 = "";
                        }
                        c6141l.f34586c = strM21822p0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h03);
                    }
                }
                c6141l.f34594k = concurrentHashMap;
                c6055k0.m21819o();
            } else if (strM21813h02.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(i));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6141l.f34560a = enumC6132c;
            } else if (strM21813h02.equals("timestamp")) {
                c6141l.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h02);
            }
        }
        c6141l.f34592i = map;
        c6055k0.m21819o();
        return c6141l;
    }

    /* renamed from: g */
    public static C6142m m21848g(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        int i = 4;
        c6055k0.m21817n();
        C6142m c6142m = new C6142m();
        HashMap map = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            String strM21813h02 = c6055k0.m21813h0();
            strM21813h02.getClass();
            if (strM21813h02.equals("data")) {
                c6055k0.m21817n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                    String strM21813h03 = c6055k0.m21813h0();
                    strM21813h03.getClass();
                    if (strM21813h03.equals("payload")) {
                        c6055k0.m21817n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
                            strM21813h0 = c6055k0.m21813h0();
                            strM21813h0.getClass();
                            switch (strM21813h0) {
                                case "duration":
                                    c6142m.f34598f = c6055k0.m21809X();
                                    break;
                                case "segmentId":
                                    c6142m.f34596d = c6055k0.m21806S();
                                    break;
                                case "height":
                                    Integer numM21807U = c6055k0.m21807U();
                                    c6142m.f34601i = numM21807U == null ? 0 : numM21807U.intValue();
                                    break;
                                case "container":
                                    String strM21822p0 = c6055k0.m21822p0();
                                    if (strM21822p0 == null) {
                                        strM21822p0 = "";
                                    }
                                    c6142m.f34600h = strM21822p0;
                                    break;
                                case "frameCount":
                                    Integer numM21807U2 = c6055k0.m21807U();
                                    c6142m.f34603k = numM21807U2 == null ? 0 : numM21807U2.intValue();
                                    break;
                                case "top":
                                    Integer numM21807U3 = c6055k0.m21807U();
                                    c6142m.f34607o = numM21807U3 == null ? 0 : numM21807U3.intValue();
                                    break;
                                case "left":
                                    Integer numM21807U4 = c6055k0.m21807U();
                                    c6142m.f34606n = numM21807U4 == null ? 0 : numM21807U4.intValue();
                                    break;
                                case "size":
                                    Long lM21810b0 = c6055k0.m21810b0();
                                    c6142m.f34597e = lM21810b0 == null ? 0L : lM21810b0.longValue();
                                    break;
                                case "width":
                                    Integer numM21807U5 = c6055k0.m21807U();
                                    c6142m.f34602j = numM21807U5 == null ? 0 : numM21807U5.intValue();
                                    break;
                                case "frameRate":
                                    Integer numM21807U6 = c6055k0.m21807U();
                                    c6142m.f34605m = numM21807U6 == null ? 0 : numM21807U6.intValue();
                                    break;
                                case "encoding":
                                    String strM21822p02 = c6055k0.m21822p0();
                                    if (strM21822p02 == null) {
                                        strM21822p02 = "";
                                    }
                                    c6142m.f34599g = strM21822p02;
                                    break;
                                case "frameRateType":
                                    String strM21822p03 = c6055k0.m21822p0();
                                    if (strM21822p03 == null) {
                                        strM21822p03 = "";
                                    }
                                    c6142m.f34604l = strM21822p03;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c6055k0.m21823q0(iLogger, concurrentHashMap2, strM21813h0);
                                    break;
                            }
                        }
                        c6142m.f34609q = concurrentHashMap2;
                        c6055k0.m21819o();
                    } else if (strM21813h03.equals("tag")) {
                        String strM21822p04 = c6055k0.m21822p0();
                        if (strM21822p04 == null) {
                            strM21822p04 = "";
                        }
                        c6142m.f34595c = strM21822p04;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h03);
                    }
                }
                c6142m.f34610r = concurrentHashMap;
                c6055k0.m21819o();
            } else if (strM21813h02.equals("type")) {
                EnumC6132c enumC6132c = (EnumC6132c) c6055k0.m21818n0(iLogger, new C6081D(i));
                AbstractC6003a.m21735D(enumC6132c, "");
                c6142m.f34560a = enumC6132c;
            } else if (strM21813h02.equals("timestamp")) {
                c6142m.f34561b = c6055k0.m21809X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c6055k0.m21823q0(iLogger, map, strM21813h02);
            }
        }
        c6142m.f34608p = map;
        c6055k0.m21819o();
        return c6142m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    @Override // io.sentry.InterfaceC5826a0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo21493a(io.sentry.C6055k0 r18, io.sentry.ILogger r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.C6081D.mo21493a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
