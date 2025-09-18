package io.sentry.protocol;

import io.sentry.C5138k0;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5082a0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class D implements InterfaceC5082a0 {
    public final /* synthetic */ int a;

    public /* synthetic */ D(int i) {
        this.a = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static io.sentry.rrweb.a b(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        int i = 0;
        int i2 = 4;
        c5138k0.n();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH0 = c5138k0.h0();
            strH0.getClass();
            if (strH0.equals("data")) {
                c5138k0.n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strH02 = c5138k0.h0();
                    strH02.getClass();
                    if (strH02.equals("payload")) {
                        c5138k0.n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strH03 = c5138k0.h0();
                            strH03.getClass();
                            int i3 = -1;
                            switch (strH03.hashCode()) {
                                case 3076010:
                                    if (strH03.equals("data")) {
                                        i3 = i;
                                        break;
                                    }
                                    break;
                                case 3575610:
                                    if (strH03.equals("type")) {
                                        i3 = 1;
                                        break;
                                    }
                                    break;
                                case 50511102:
                                    if (strH03.equals("category")) {
                                        i3 = 2;
                                        break;
                                    }
                                    break;
                                case 55126294:
                                    if (strH03.equals("timestamp")) {
                                        i3 = 3;
                                        break;
                                    }
                                    break;
                                case 102865796:
                                    if (strH03.equals("level")) {
                                        i3 = 4;
                                        break;
                                    }
                                    break;
                                case 954925063:
                                    if (strH03.equals("message")) {
                                        i3 = 5;
                                        break;
                                    }
                                    break;
                            }
                            switch (i3) {
                                case 0:
                                    ConcurrentHashMap concurrentHashMapA = io.sentry.config.a.A((Map) c5138k0.m0());
                                    if (concurrentHashMapA == null) {
                                        break;
                                    } else {
                                        aVar.i = concurrentHashMapA;
                                        break;
                                    }
                                case 1:
                                    aVar.e = c5138k0.p0();
                                    break;
                                case 2:
                                    aVar.f = c5138k0.p0();
                                    break;
                                case 3:
                                    aVar.d = c5138k0.x();
                                    break;
                                case 4:
                                    try {
                                        aVar.h = EnumC5148n1.valueOf(c5138k0.o0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        iLogger.c(EnumC5148n1.DEBUG, e, "Error when deserializing SentryLevel", new Object[i]);
                                        break;
                                    }
                                case 5:
                                    aVar.g = c5138k0.p0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c5138k0.q0(iLogger, concurrentHashMap2, strH03);
                                    break;
                            }
                            i = 0;
                        }
                        aVar.k = concurrentHashMap2;
                        c5138k0.o();
                    } else if (strH02.equals("tag")) {
                        String strP0 = c5138k0.p0();
                        if (strP0 == null) {
                            strP0 = "";
                        }
                        aVar.c = strP0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c5138k0.q0(iLogger, concurrentHashMap, strH02);
                    }
                    i = 0;
                }
                aVar.l = concurrentHashMap;
                c5138k0.o();
            } else if (strH0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(i2));
                io.sentry.config.a.D(cVar, "");
                aVar.a = cVar;
            } else if (strH0.equals("timestamp")) {
                aVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH0);
            }
            i = 0;
        }
        aVar.j = map;
        c5138k0.o();
        return aVar;
    }

    public static io.sentry.rrweb.g c(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        int i = 5;
        int i2 = 4;
        c5138k0.n();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH02 = c5138k0.h0();
            strH02.getClass();
            if (strH02.equals("data")) {
                c5138k0.n();
                HashMap map2 = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    strH0 = c5138k0.h0();
                    strH0.getClass();
                    switch (strH0) {
                        case "x":
                            gVar.f = c5138k0.D();
                            break;
                        case "y":
                            gVar.g = c5138k0.D();
                            break;
                        case "id":
                            gVar.e = c5138k0.S();
                            break;
                        case "type":
                            gVar.d = (io.sentry.rrweb.f) c5138k0.n0(iLogger, new D(7));
                            break;
                        case "pointerType":
                            gVar.h = c5138k0.S();
                            break;
                        case "pointerId":
                            gVar.i = c5138k0.S();
                            break;
                        default:
                            if (!strH0.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                c5138k0.q0(iLogger, map2, strH0);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) c5138k0.n0(iLogger, new D(i));
                                io.sentry.config.a.D(dVar, "");
                                gVar.c = dVar;
                                break;
                            }
                    }
                }
                gVar.k = map2;
                c5138k0.o();
            } else if (strH02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(i2));
                io.sentry.config.a.D(cVar, "");
                gVar.a = cVar;
            } else if (strH02.equals("timestamp")) {
                gVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH02);
            }
        }
        gVar.j = map;
        c5138k0.o();
        return gVar;
    }

    public static io.sentry.rrweb.i d(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        c5138k0.n();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH0 = c5138k0.h0();
            strH0.getClass();
            if (strH0.equals("data")) {
                c5138k0.n();
                HashMap map2 = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strH02 = c5138k0.h0();
                    strH02.getClass();
                    if (strH02.equals("pointerId")) {
                        iVar.d = c5138k0.S();
                    } else if (strH02.equals("positions")) {
                        iVar.e = c5138k0.W(iLogger, new D(9));
                    } else if (strH02.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) c5138k0.n0(iLogger, new D(5));
                        io.sentry.config.a.D(dVar, "");
                        iVar.c = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        c5138k0.q0(iLogger, map2, strH02);
                    }
                }
                iVar.g = map2;
                c5138k0.o();
            } else if (strH0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(4));
                io.sentry.config.a.D(cVar, "");
                iVar.a = cVar;
            } else if (strH0.equals("timestamp")) {
                iVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH0);
            }
        }
        iVar.f = map;
        c5138k0.o();
        return iVar;
    }

    public static io.sentry.rrweb.j e(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        c5138k0.n();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH02 = c5138k0.h0();
            strH02.getClass();
            if (strH02.equals("data")) {
                c5138k0.n();
                AbstractMap concurrentHashMap = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    strH0 = c5138k0.h0();
                    strH0.getClass();
                    switch (strH0) {
                        case "height":
                            Integer numU = c5138k0.U();
                            jVar.d = numU == null ? 0 : numU.intValue();
                            break;
                        case "href":
                            String strP0 = c5138k0.p0();
                            if (strP0 == null) {
                                strP0 = "";
                            }
                            jVar.c = strP0;
                            break;
                        case "width":
                            Integer numU2 = c5138k0.U();
                            jVar.e = numU2 == null ? 0 : numU2.intValue();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c5138k0.q0(iLogger, concurrentHashMap, strH0);
                            break;
                    }
                }
                c5138k0.o();
            } else if (strH02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(4));
                io.sentry.config.a.D(cVar, "");
                jVar.a = cVar;
            } else if (strH02.equals("timestamp")) {
                jVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH02);
            }
        }
        jVar.f = map;
        c5138k0.o();
        return jVar;
    }

    public static io.sentry.rrweb.l f(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        int i = 4;
        c5138k0.n();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH02 = c5138k0.h0();
            strH02.getClass();
            if (strH02.equals("data")) {
                c5138k0.n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strH03 = c5138k0.h0();
                    strH03.getClass();
                    if (strH03.equals("payload")) {
                        c5138k0.n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                            strH0 = c5138k0.h0();
                            strH0.getClass();
                            switch (strH0) {
                                case "description":
                                    lVar.e = c5138k0.p0();
                                    break;
                                case "endTimestamp":
                                    lVar.g = c5138k0.x();
                                    break;
                                case "startTimestamp":
                                    lVar.f = c5138k0.x();
                                    break;
                                case "op":
                                    lVar.d = c5138k0.p0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapA = io.sentry.config.a.A((Map) c5138k0.m0());
                                    if (concurrentHashMapA == null) {
                                        break;
                                    } else {
                                        lVar.h = concurrentHashMapA;
                                        break;
                                    }
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c5138k0.q0(iLogger, concurrentHashMap2, strH0);
                                    break;
                            }
                        }
                        lVar.j = concurrentHashMap2;
                        c5138k0.o();
                    } else if (strH03.equals("tag")) {
                        String strP0 = c5138k0.p0();
                        if (strP0 == null) {
                            strP0 = "";
                        }
                        lVar.c = strP0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c5138k0.q0(iLogger, concurrentHashMap, strH03);
                    }
                }
                lVar.k = concurrentHashMap;
                c5138k0.o();
            } else if (strH02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(i));
                io.sentry.config.a.D(cVar, "");
                lVar.a = cVar;
            } else if (strH02.equals("timestamp")) {
                lVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH02);
            }
        }
        lVar.i = map;
        c5138k0.o();
        return lVar;
    }

    public static io.sentry.rrweb.m g(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        int i = 4;
        c5138k0.n();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strH02 = c5138k0.h0();
            strH02.getClass();
            if (strH02.equals("data")) {
                c5138k0.n();
                ConcurrentHashMap concurrentHashMap = null;
                while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strH03 = c5138k0.h0();
                    strH03.getClass();
                    if (strH03.equals("payload")) {
                        c5138k0.n();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
                            strH0 = c5138k0.h0();
                            strH0.getClass();
                            switch (strH0) {
                                case "duration":
                                    mVar.f = c5138k0.X();
                                    break;
                                case "segmentId":
                                    mVar.d = c5138k0.S();
                                    break;
                                case "height":
                                    Integer numU = c5138k0.U();
                                    mVar.i = numU == null ? 0 : numU.intValue();
                                    break;
                                case "container":
                                    String strP0 = c5138k0.p0();
                                    if (strP0 == null) {
                                        strP0 = "";
                                    }
                                    mVar.h = strP0;
                                    break;
                                case "frameCount":
                                    Integer numU2 = c5138k0.U();
                                    mVar.k = numU2 == null ? 0 : numU2.intValue();
                                    break;
                                case "top":
                                    Integer numU3 = c5138k0.U();
                                    mVar.o = numU3 == null ? 0 : numU3.intValue();
                                    break;
                                case "left":
                                    Integer numU4 = c5138k0.U();
                                    mVar.n = numU4 == null ? 0 : numU4.intValue();
                                    break;
                                case "size":
                                    Long lB0 = c5138k0.b0();
                                    mVar.e = lB0 == null ? 0L : lB0.longValue();
                                    break;
                                case "width":
                                    Integer numU5 = c5138k0.U();
                                    mVar.j = numU5 == null ? 0 : numU5.intValue();
                                    break;
                                case "frameRate":
                                    Integer numU6 = c5138k0.U();
                                    mVar.m = numU6 == null ? 0 : numU6.intValue();
                                    break;
                                case "encoding":
                                    String strP02 = c5138k0.p0();
                                    if (strP02 == null) {
                                        strP02 = "";
                                    }
                                    mVar.g = strP02;
                                    break;
                                case "frameRateType":
                                    String strP03 = c5138k0.p0();
                                    if (strP03 == null) {
                                        strP03 = "";
                                    }
                                    mVar.l = strP03;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    c5138k0.q0(iLogger, concurrentHashMap2, strH0);
                                    break;
                            }
                        }
                        mVar.q = concurrentHashMap2;
                        c5138k0.o();
                    } else if (strH03.equals("tag")) {
                        String strP04 = c5138k0.p0();
                        if (strP04 == null) {
                            strP04 = "";
                        }
                        mVar.c = strP04;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        c5138k0.q0(iLogger, concurrentHashMap, strH03);
                    }
                }
                mVar.r = concurrentHashMap;
                c5138k0.o();
            } else if (strH02.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) c5138k0.n0(iLogger, new D(i));
                io.sentry.config.a.D(cVar, "");
                mVar.a = cVar;
            } else if (strH02.equals("timestamp")) {
                mVar.b = c5138k0.X();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                c5138k0.q0(iLogger, map, strH02);
            }
        }
        mVar.p = map;
        c5138k0.o();
        return mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    @Override // io.sentry.InterfaceC5082a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.C5138k0 r18, io.sentry.ILogger r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.D.a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
