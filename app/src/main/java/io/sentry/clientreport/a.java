package io.sentry.clientreport;

import defpackage.AbstractC8235ym;
import io.sentry.C5138k0;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5082a0;
import io.sentry.protocol.C5155a;
import io.sentry.protocol.C5160f;
import io.sentry.protocol.EnumC5159e;
import io.sentry.protocol.h;
import io.sentry.protocol.m;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5082a0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static C5155a b(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        c5138k0.n();
        C5155a c5155a = new C5155a();
        ConcurrentHashMap concurrentHashMap = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            strH0 = c5138k0.h0();
            strH0.getClass();
            switch (strH0) {
                case "device_app_hash":
                    c5155a.c = c5138k0.p0();
                    break;
                case "start_type":
                    c5155a.j = c5138k0.p0();
                    break;
                case "view_names":
                    List list = (List) c5138k0.m0();
                    if (list == null) {
                        break;
                    } else {
                        c5155a.i = list;
                        break;
                    }
                case "app_version":
                    c5155a.f = c5138k0.p0();
                    break;
                case "in_foreground":
                    c5155a.k = c5138k0.p();
                    break;
                case "build_type":
                    c5155a.d = c5138k0.p0();
                    break;
                case "app_identifier":
                    c5155a.a = c5138k0.p0();
                    break;
                case "app_start_time":
                    c5155a.b = c5138k0.w(iLogger);
                    break;
                case "permissions":
                    c5155a.h = io.sentry.config.a.A((Map) c5138k0.m0());
                    break;
                case "app_name":
                    c5155a.e = c5138k0.p0();
                    break;
                case "app_build":
                    c5155a.g = c5138k0.p0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c5138k0.q0(iLogger, concurrentHashMap, strH0);
                    break;
            }
        }
        c5155a.l = concurrentHashMap;
        c5138k0.o();
        return c5155a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.protocol.C5157c c(io.sentry.C5138k0 r12, io.sentry.ILogger r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.c(io.sentry.k0, io.sentry.ILogger):io.sentry.protocol.c");
    }

    public static C5160f d(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        TimeZone timeZone;
        int i = 10;
        c5138k0.n();
        C5160f c5160f = new C5160f();
        ConcurrentHashMap concurrentHashMap = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            strH0 = c5138k0.h0();
            strH0.getClass();
            switch (strH0) {
                case "timezone":
                    switch (c5138k0.a) {
                        case 0:
                            io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) c5138k0.b;
                            if (aVar.o0() == io.sentry.vendor.gson.stream.b.NULL) {
                                aVar.h0();
                            } else {
                                try {
                                    timeZone = TimeZone.getTimeZone(aVar.m0());
                                    break;
                                } catch (Exception e) {
                                    iLogger.d(EnumC5148n1.ERROR, "Error when deserializing TimeZone", e);
                                }
                            }
                            timeZone = null;
                            break;
                        default:
                            String str = (String) c5138k0.r0();
                            if (str == null) {
                                timeZone = null;
                                break;
                            } else {
                                timeZone = TimeZone.getTimeZone(str);
                                break;
                            }
                    }
                    c5160f.z = timeZone;
                    break;
                case "boot_time":
                    if (c5138k0.s0() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        c5160f.y = c5138k0.w(iLogger);
                        break;
                    }
                case "simulator":
                    c5160f.l = c5138k0.p();
                    break;
                case "manufacturer":
                    c5160f.b = c5138k0.p0();
                    break;
                case "language":
                    c5160f.B = c5138k0.p0();
                    break;
                case "processor_count":
                    c5160f.F = c5138k0.U();
                    break;
                case "orientation":
                    c5160f.k = (EnumC5159e) c5138k0.n0(iLogger, new a(i));
                    break;
                case "battery_temperature":
                    c5160f.E = c5138k0.J();
                    break;
                case "family":
                    c5160f.d = c5138k0.p0();
                    break;
                case "locale":
                    c5160f.C = c5138k0.p0();
                    break;
                case "online":
                    c5160f.j = c5138k0.p();
                    break;
                case "battery_level":
                    c5160f.h = c5138k0.J();
                    break;
                case "model_id":
                    c5160f.f = c5138k0.p0();
                    break;
                case "screen_density":
                    c5160f.w = c5138k0.J();
                    break;
                case "screen_dpi":
                    c5160f.x = c5138k0.U();
                    break;
                case "free_memory":
                    c5160f.n = c5138k0.b0();
                    break;
                case "id":
                    c5160f.A = c5138k0.p0();
                    break;
                case "name":
                    c5160f.a = c5138k0.p0();
                    break;
                case "low_memory":
                    c5160f.p = c5138k0.p();
                    break;
                case "archs":
                    List list = (List) c5138k0.m0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c5160f.g = strArr;
                        break;
                    }
                case "brand":
                    c5160f.c = c5138k0.p0();
                    break;
                case "model":
                    c5160f.e = c5138k0.p0();
                    break;
                case "cpu_description":
                    c5160f.H = c5138k0.p0();
                    break;
                case "processor_frequency":
                    c5160f.G = c5138k0.A();
                    break;
                case "connection_type":
                    c5160f.D = c5138k0.p0();
                    break;
                case "screen_width_pixels":
                    c5160f.u = c5138k0.U();
                    break;
                case "external_storage_size":
                    c5160f.s = c5138k0.b0();
                    break;
                case "storage_size":
                    c5160f.q = c5138k0.b0();
                    break;
                case "usable_memory":
                    c5160f.o = c5138k0.b0();
                    break;
                case "memory_size":
                    c5160f.m = c5138k0.b0();
                    break;
                case "charging":
                    c5160f.i = c5138k0.p();
                    break;
                case "external_free_storage":
                    c5160f.t = c5138k0.b0();
                    break;
                case "free_storage":
                    c5160f.r = c5138k0.b0();
                    break;
                case "screen_height_pixels":
                    c5160f.v = c5138k0.U();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c5138k0.q0(iLogger, concurrentHashMap, strH0);
                    break;
            }
        }
        c5160f.I = concurrentHashMap;
        c5138k0.o();
        return c5160f;
    }

    public static h e(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        c5138k0.n();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            strH0 = c5138k0.h0();
            strH0.getClass();
            switch (strH0) {
                case "npot_support":
                    hVar.i = c5138k0.p0();
                    break;
                case "vendor_id":
                    hVar.c = c5138k0.p0();
                    break;
                case "multi_threaded_rendering":
                    hVar.g = c5138k0.p();
                    break;
                case "id":
                    hVar.b = c5138k0.U();
                    break;
                case "name":
                    hVar.a = c5138k0.p0();
                    break;
                case "vendor_name":
                    hVar.d = c5138k0.p0();
                    break;
                case "version":
                    hVar.h = c5138k0.p0();
                    break;
                case "api_type":
                    hVar.f = c5138k0.p0();
                    break;
                case "memory_size":
                    hVar.e = c5138k0.U();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c5138k0.q0(iLogger, concurrentHashMap, strH0);
                    break;
            }
        }
        hVar.j = concurrentHashMap;
        c5138k0.o();
        return hVar;
    }

    public static m f(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        c5138k0.n();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            strH0 = c5138k0.h0();
            strH0.getClass();
            switch (strH0) {
                case "rooted":
                    mVar.f = c5138k0.p();
                    break;
                case "raw_description":
                    mVar.c = c5138k0.p0();
                    break;
                case "name":
                    mVar.a = c5138k0.p0();
                    break;
                case "build":
                    mVar.d = c5138k0.p0();
                    break;
                case "version":
                    mVar.b = c5138k0.p0();
                    break;
                case "kernel_version":
                    mVar.e = c5138k0.p0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c5138k0.q0(iLogger, concurrentHashMap, strH0);
                    break;
            }
        }
        mVar.g = concurrentHashMap;
        c5138k0.o();
        return mVar;
    }

    public static IllegalStateException g(String str, ILogger iLogger) {
        String strK = AbstractC8235ym.k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strK);
        iLogger.d(EnumC5148n1.ERROR, strK, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException h(String str, ILogger iLogger) {
        String strK = AbstractC8235ym.k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strK);
        iLogger.d(EnumC5148n1.ERROR, strK, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(String str, ILogger iLogger) {
        String strK = AbstractC8235ym.k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strK);
        iLogger.d(EnumC5148n1.ERROR, strK, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
    @Override // io.sentry.InterfaceC5082a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.C5138k0 r37, io.sentry.ILogger r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 5008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
