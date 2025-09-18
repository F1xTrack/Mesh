package io.sentry.clientreport;

import io.sentry.C6055k0;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5826a0;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6090f;
import io.sentry.protocol.C6092h;
import io.sentry.protocol.C6097m;
import io.sentry.protocol.EnumC6089e;
import io.sentry.vendor.gson.stream.C6184a;
import io.sentry.vendor.gson.stream.EnumC6185b;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC7222ym;

/* renamed from: io.sentry.clientreport.a */
/* loaded from: classes2.dex */
public final class C5997a implements InterfaceC5826a0 {

    /* renamed from: a */
    public final /* synthetic */ int f34112a;

    public /* synthetic */ C5997a(int i) {
        this.f34112a = i;
    }

    /* renamed from: b */
    public static C6085a m21719b(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        c6055k0.m21817n();
        C6085a c6085a = new C6085a();
        ConcurrentHashMap concurrentHashMap = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            switch (strM21813h0) {
                case "device_app_hash":
                    c6085a.f34314c = c6055k0.m21822p0();
                    break;
                case "start_type":
                    c6085a.f34321j = c6055k0.m21822p0();
                    break;
                case "view_names":
                    List list = (List) c6055k0.m21816m0();
                    if (list == null) {
                        break;
                    } else {
                        c6085a.f34320i = list;
                        break;
                    }
                case "app_version":
                    c6085a.f34317f = c6055k0.m21822p0();
                    break;
                case "in_foreground":
                    c6085a.f34322k = c6055k0.m21821p();
                    break;
                case "build_type":
                    c6085a.f34315d = c6055k0.m21822p0();
                    break;
                case "app_identifier":
                    c6085a.f34312a = c6055k0.m21822p0();
                    break;
                case "app_start_time":
                    c6085a.f34313b = c6055k0.m21827w(iLogger);
                    break;
                case "permissions":
                    c6085a.f34319h = AbstractC6003a.m21732A((Map) c6055k0.m21816m0());
                    break;
                case "app_name":
                    c6085a.f34316e = c6055k0.m21822p0();
                    break;
                case "app_build":
                    c6085a.f34318g = c6055k0.m21822p0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                    break;
            }
        }
        c6085a.f34323l = concurrentHashMap;
        c6055k0.m21819o();
        return c6085a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.protocol.C6087c m21720c(io.sentry.C6055k0 r12, io.sentry.ILogger r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.C5997a.m21720c(io.sentry.k0, io.sentry.ILogger):io.sentry.protocol.c");
    }

    /* renamed from: d */
    public static C6090f m21721d(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        TimeZone timeZone;
        int i = 10;
        c6055k0.m21817n();
        C6090f c6090f = new C6090f();
        ConcurrentHashMap concurrentHashMap = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            switch (strM21813h0) {
                case "timezone":
                    switch (c6055k0.f34220a) {
                        case 0:
                            C6184a c6184a = (C6184a) c6055k0.f34221b;
                            if (c6184a.m21910o0() == EnumC6185b.NULL) {
                                c6184a.m21903h0();
                            } else {
                                try {
                                    timeZone = TimeZone.getTimeZone(c6184a.m21906m0());
                                    break;
                                } catch (Exception e) {
                                    iLogger.mo21406d(EnumC6069n1.ERROR, "Error when deserializing TimeZone", e);
                                }
                            }
                            timeZone = null;
                            break;
                        default:
                            String str = (String) c6055k0.m21824r0();
                            if (str == null) {
                                timeZone = null;
                                break;
                            } else {
                                timeZone = TimeZone.getTimeZone(str);
                                break;
                            }
                    }
                    c6090f.f34365z = timeZone;
                    break;
                case "boot_time":
                    if (c6055k0.m21825s0() != EnumC6185b.STRING) {
                        break;
                    } else {
                        c6090f.f34364y = c6055k0.m21827w(iLogger);
                        break;
                    }
                case "simulator":
                    c6090f.f34351l = c6055k0.m21821p();
                    break;
                case "manufacturer":
                    c6090f.f34341b = c6055k0.m21822p0();
                    break;
                case "language":
                    c6090f.f34332B = c6055k0.m21822p0();
                    break;
                case "processor_count":
                    c6090f.f34336F = c6055k0.m21807U();
                    break;
                case "orientation":
                    c6090f.f34350k = (EnumC6089e) c6055k0.m21818n0(iLogger, new C5997a(i));
                    break;
                case "battery_temperature":
                    c6090f.f34335E = c6055k0.m21805J();
                    break;
                case "family":
                    c6090f.f34343d = c6055k0.m21822p0();
                    break;
                case "locale":
                    c6090f.f34333C = c6055k0.m21822p0();
                    break;
                case "online":
                    c6090f.f34349j = c6055k0.m21821p();
                    break;
                case "battery_level":
                    c6090f.f34347h = c6055k0.m21805J();
                    break;
                case "model_id":
                    c6090f.f34345f = c6055k0.m21822p0();
                    break;
                case "screen_density":
                    c6090f.f34362w = c6055k0.m21805J();
                    break;
                case "screen_dpi":
                    c6090f.f34363x = c6055k0.m21807U();
                    break;
                case "free_memory":
                    c6090f.f34353n = c6055k0.m21810b0();
                    break;
                case "id":
                    c6090f.f34331A = c6055k0.m21822p0();
                    break;
                case "name":
                    c6090f.f34340a = c6055k0.m21822p0();
                    break;
                case "low_memory":
                    c6090f.f34355p = c6055k0.m21821p();
                    break;
                case "archs":
                    List list = (List) c6055k0.m21816m0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        c6090f.f34346g = strArr;
                        break;
                    }
                case "brand":
                    c6090f.f34342c = c6055k0.m21822p0();
                    break;
                case "model":
                    c6090f.f34344e = c6055k0.m21822p0();
                    break;
                case "cpu_description":
                    c6090f.f34338H = c6055k0.m21822p0();
                    break;
                case "processor_frequency":
                    c6090f.f34337G = c6055k0.m21803A();
                    break;
                case "connection_type":
                    c6090f.f34334D = c6055k0.m21822p0();
                    break;
                case "screen_width_pixels":
                    c6090f.f34360u = c6055k0.m21807U();
                    break;
                case "external_storage_size":
                    c6090f.f34358s = c6055k0.m21810b0();
                    break;
                case "storage_size":
                    c6090f.f34356q = c6055k0.m21810b0();
                    break;
                case "usable_memory":
                    c6090f.f34354o = c6055k0.m21810b0();
                    break;
                case "memory_size":
                    c6090f.f34352m = c6055k0.m21810b0();
                    break;
                case "charging":
                    c6090f.f34348i = c6055k0.m21821p();
                    break;
                case "external_free_storage":
                    c6090f.f34359t = c6055k0.m21810b0();
                    break;
                case "free_storage":
                    c6090f.f34357r = c6055k0.m21810b0();
                    break;
                case "screen_height_pixels":
                    c6090f.f34361v = c6055k0.m21807U();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                    break;
            }
        }
        c6090f.f34339I = concurrentHashMap;
        c6055k0.m21819o();
        return c6090f;
    }

    /* renamed from: e */
    public static C6092h m21722e(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        c6055k0.m21817n();
        C6092h c6092h = new C6092h();
        ConcurrentHashMap concurrentHashMap = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            switch (strM21813h0) {
                case "npot_support":
                    c6092h.f34378i = c6055k0.m21822p0();
                    break;
                case "vendor_id":
                    c6092h.f34372c = c6055k0.m21822p0();
                    break;
                case "multi_threaded_rendering":
                    c6092h.f34376g = c6055k0.m21821p();
                    break;
                case "id":
                    c6092h.f34371b = c6055k0.m21807U();
                    break;
                case "name":
                    c6092h.f34370a = c6055k0.m21822p0();
                    break;
                case "vendor_name":
                    c6092h.f34373d = c6055k0.m21822p0();
                    break;
                case "version":
                    c6092h.f34377h = c6055k0.m21822p0();
                    break;
                case "api_type":
                    c6092h.f34375f = c6055k0.m21822p0();
                    break;
                case "memory_size":
                    c6092h.f34374e = c6055k0.m21807U();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                    break;
            }
        }
        c6092h.f34379j = concurrentHashMap;
        c6055k0.m21819o();
        return c6092h;
    }

    /* renamed from: f */
    public static C6097m m21723f(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        c6055k0.m21817n();
        C6097m c6097m = new C6097m();
        ConcurrentHashMap concurrentHashMap = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            switch (strM21813h0) {
                case "rooted":
                    c6097m.f34405f = c6055k0.m21821p();
                    break;
                case "raw_description":
                    c6097m.f34402c = c6055k0.m21822p0();
                    break;
                case "name":
                    c6097m.f34400a = c6055k0.m21822p0();
                    break;
                case "build":
                    c6097m.f34403d = c6055k0.m21822p0();
                    break;
                case "version":
                    c6097m.f34401b = c6055k0.m21822p0();
                    break;
                case "kernel_version":
                    c6097m.f34404e = c6055k0.m21822p0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                    break;
            }
        }
        c6097m.f34406g = concurrentHashMap;
        c6055k0.m21819o();
        return c6097m;
    }

    /* renamed from: g */
    public static IllegalStateException m21724g(String str, ILogger iLogger) {
        String strM26234k = AbstractC7222ym.m26234k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM26234k);
        iLogger.mo21406d(EnumC6069n1.ERROR, strM26234k, illegalStateException);
        return illegalStateException;
    }

    /* renamed from: h */
    public static IllegalStateException m21725h(String str, ILogger iLogger) {
        String strM26234k = AbstractC7222ym.m26234k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM26234k);
        iLogger.mo21406d(EnumC6069n1.ERROR, strM26234k, illegalStateException);
        return illegalStateException;
    }

    /* renamed from: i */
    public static IllegalStateException m21726i(String str, ILogger iLogger) {
        String strM26234k = AbstractC7222ym.m26234k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM26234k);
        iLogger.mo21406d(EnumC6069n1.ERROR, strM26234k, illegalStateException);
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
    @Override // io.sentry.InterfaceC5826a0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo21493a(io.sentry.C6055k0 r37, io.sentry.ILogger r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 5008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.C5997a.mo21493a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
