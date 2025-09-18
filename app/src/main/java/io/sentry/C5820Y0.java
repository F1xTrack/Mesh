package io.sentry;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import io.sentry.android.core.C5832D;
import io.sentry.android.core.C5912u;
import io.sentry.android.core.internal.util.C5881a;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.clientreport.InterfaceC6002f;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6016b;
import io.sentry.hints.InterfaceC6027b;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.metrics.C6066d;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6104t;
import io.sentry.react.C6119c;
import io.sentry.transport.InterfaceC6154f;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;
import p000.CallableC7043vw;
import p000.O91;

/* renamed from: io.sentry.Y0 */
/* loaded from: classes2.dex */
public final class C5820Y0 implements InterfaceC5769H {

    /* renamed from: a */
    public final Object f33441a;

    /* renamed from: b */
    public final Object f33442b;

    /* renamed from: c */
    public final Object f33443c;

    /* renamed from: d */
    public final Object f33444d;

    public C5820Y0(Boolean bool, Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    /* renamed from: n */
    public static ArrayList m21476n(C6193y c6193y) {
        ArrayList arrayList = new ArrayList(c6193y.f34740b);
        C5825a c5825a = c6193y.f34741c;
        if (c5825a != null) {
            arrayList.add(c5825a);
        }
        C5825a c5825a2 = c6193y.f34742d;
        if (c5825a2 != null) {
            arrayList.add(c5825a2);
        }
        C5825a c5825a3 = c6193y.f34743e;
        if (c5825a3 != null) {
            arrayList.add(c5825a3);
        }
        return arrayList;
    }

    /* renamed from: o */
    public static ConnectivityManager m21477o(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.mo21407k(EnumC6069n1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    /* renamed from: r */
    public static boolean m21478r(Context context, ILogger iLogger, C5832D c5832d, ConnectivityManager.NetworkCallback networkCallback) {
        c5832d.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            iLogger.mo21407k(EnumC6069n1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerM21477o = m21477o(context, iLogger);
        if (connectivityManagerM21477o == null) {
            return false;
        }
        if (!AbstractC6003a.m21761u(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.mo21407k(EnumC6069n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerM21477o.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    @Override // io.sentry.InterfaceC5769H
    /* renamed from: a */
    public String mo21388a() {
        C5832D c5832d = (C5832D) this.f33443c;
        Context context = (Context) this.f33441a;
        ILogger iLogger = (ILogger) this.f33442b;
        ConnectivityManager connectivityManagerM21477o = m21477o(context, iLogger);
        String str = null;
        if (connectivityManagerM21477o != null) {
            if (AbstractC6003a.m21761u(context, "android.permission.ACCESS_NETWORK_STATE")) {
                try {
                    c5832d.getClass();
                    Network activeNetwork = connectivityManagerM21477o.getActiveNetwork();
                    if (activeNetwork == null) {
                        iLogger.mo21407k(EnumC6069n1.INFO, "Network is null and cannot check network status", new Object[0]);
                    } else {
                        NetworkCapabilities networkCapabilities = connectivityManagerM21477o.getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities == null) {
                            iLogger.mo21407k(EnumC6069n1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                        } else {
                            boolean zHasTransport = networkCapabilities.hasTransport(3);
                            boolean zHasTransport2 = networkCapabilities.hasTransport(1);
                            boolean zHasTransport3 = networkCapabilities.hasTransport(0);
                            if (zHasTransport) {
                                str = "ethernet";
                            } else if (zHasTransport2) {
                                str = "wifi";
                            } else if (zHasTransport3) {
                                str = "cellular";
                            }
                        }
                    }
                } catch (Throwable th) {
                    iLogger.mo21406d(EnumC6069n1.ERROR, "Failed to retrieve network info", th);
                }
            } else {
                iLogger.mo21407k(EnumC6069n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            }
        }
        return str;
    }

    @Override // io.sentry.InterfaceC5769H
    /* renamed from: b */
    public EnumC5763F mo21389b() {
        EnumC5763F enumC5763F;
        Context context = (Context) this.f33441a;
        ILogger iLogger = (ILogger) this.f33442b;
        ConnectivityManager connectivityManagerM21477o = m21477o(context, iLogger);
        if (connectivityManagerM21477o == null) {
            return EnumC5763F.UNKNOWN;
        }
        if (!AbstractC6003a.m21761u(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.mo21407k(EnumC6069n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return EnumC5763F.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerM21477o.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.mo21407k(EnumC6069n1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                enumC5763F = EnumC5763F.DISCONNECTED;
            } else {
                enumC5763F = activeNetworkInfo.isConnected() ? EnumC5763F.CONNECTED : EnumC5763F.DISCONNECTED;
            }
            return enumC5763F;
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.WARNING, "Could not retrieve Connection Status", th);
            return EnumC5763F.UNKNOWN;
        }
    }

    @Override // io.sentry.InterfaceC5769H
    /* renamed from: c */
    public boolean mo21390c(InterfaceC5766G interfaceC5766G) {
        C5832D c5832d = (C5832D) this.f33443c;
        c5832d.getClass();
        C5881a c5881a = new C5881a(this, interfaceC5766G);
        ((HashMap) this.f33444d).put(interfaceC5766G, c5881a);
        return m21478r((Context) this.f33441a, (ILogger) this.f33442b, c5832d, c5881a);
    }

    @Override // io.sentry.InterfaceC5769H
    /* renamed from: d */
    public void mo21391d(InterfaceC5766G interfaceC5766G) {
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) ((HashMap) this.f33444d).remove(interfaceC5766G);
        if (networkCallback != null) {
            ((C5832D) this.f33443c).getClass();
            Context context = (Context) this.f33441a;
            ILogger iLogger = (ILogger) this.f33442b;
            ConnectivityManager connectivityManagerM21477o = m21477o(context, iLogger);
            if (connectivityManagerM21477o == null) {
                return;
            }
            try {
                connectivityManagerM21477o.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.mo21406d(EnumC6069n1.WARNING, "unregisterNetworkCallback failed", th);
            }
        }
    }

    /* renamed from: e */
    public void m21479e(AbstractC5811V0 abstractC5811V0, C5782L0 c5782l0) {
        if (c5782l0 != null) {
            if (abstractC5811V0.f33419d == null) {
                abstractC5811V0.f33419d = c5782l0.f33308d;
            }
            if (abstractC5811V0.f33424i == null) {
                abstractC5811V0.f33424i = c5782l0.f33306b;
            }
            AbstractMap abstractMap = abstractC5811V0.f33420e;
            ConcurrentHashMap concurrentHashMap = c5782l0.f33311g;
            if (abstractMap == null) {
                abstractC5811V0.f33420e = new HashMap(new HashMap(AbstractC6003a.m21732A(concurrentHashMap)));
            } else {
                for (Map.Entry entry : AbstractC6003a.m21732A(concurrentHashMap).entrySet()) {
                    if (!abstractC5811V0.f33420e.containsKey(entry.getKey())) {
                        abstractC5811V0.f33420e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = abstractC5811V0.f33428m;
            C5815W1 c5815w1 = c5782l0.f33310f;
            if (list == null) {
                abstractC5811V0.f33428m = new ArrayList(new ArrayList(c5815w1));
            } else if (!c5815w1.isEmpty()) {
                list.addAll(c5815w1);
                Collections.sort(list, (C5817X0) this.f33443c);
            }
            AbstractMap abstractMap2 = abstractC5811V0.f33430o;
            ConcurrentHashMap concurrentHashMap2 = c5782l0.f33312h;
            if (abstractMap2 == null) {
                abstractC5811V0.f33430o = new HashMap(new HashMap(concurrentHashMap2));
            } else {
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (!abstractC5811V0.f33430o.containsKey(entry2.getKey())) {
                        abstractC5811V0.f33430o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Iterator it = new C6087c(c5782l0.f33319o).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object key = entry3.getKey();
                C6087c c6087c = abstractC5811V0.f33417b;
                if (!c6087c.containsKey(key)) {
                    c6087c.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    /* renamed from: f */
    public C6042c m21480f(AbstractC5811V0 abstractC5811V0, ArrayList arrayList, C5792O1 c5792o1, C5821Y1 c5821y1, C5761E0 c5761e0) {
        C6104t c6104t;
        ArrayList arrayList2 = new ArrayList();
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        if (abstractC5811V0 != null) {
            InterfaceC5801S serializer = c5759d1.getSerializer();
            Charset charset = C6022g1.f34163d;
            AbstractC6003a.m21735D(serializer, "ISerializer is required.");
            C6059l1 c6059l1 = new C6059l1(new CallableC7043vw(serializer, 11, abstractC5811V0));
            arrayList2.add(new C6022g1(new C6025h1(EnumC6062m1.resolve(abstractC5811V0), new CallableC6010d1(c6059l1, 2), "application/json", (String) null, (String) null), new CallableC6010d1(c6059l1, 3)));
            c6104t = abstractC5811V0.f33416a;
        } else {
            c6104t = null;
        }
        if (c5792o1 != null) {
            arrayList2.add(C6022g1.m21780b(c5759d1.getSerializer(), c5792o1));
        }
        if (c5761e0 != null) {
            long maxTraceFileSize = c5759d1.getMaxTraceFileSize();
            InterfaceC5801S serializer2 = c5759d1.getSerializer();
            Charset charset2 = C6022g1.f34163d;
            File file = c5761e0.f33238a;
            C6059l1 c6059l12 = new C6059l1(new CallableC6019f1(file, maxTraceFileSize, c5761e0, serializer2));
            arrayList2.add(new C6022g1(new C6025h1(EnumC6062m1.Profile, new CallableC6010d1(c6059l12, 0), "application-json", file.getName(), (String) null), new CallableC6010d1(c6059l12, 1)));
            if (c6104t == null) {
                c6104t = new C6104t(c5761e0.f33260w);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5825a c5825a = (C5825a) it.next();
                InterfaceC5801S serializer3 = c5759d1.getSerializer();
                ILogger logger = c5759d1.getLogger();
                long maxAttachmentSize = c5759d1.getMaxAttachmentSize();
                Charset charset3 = C6022g1.f34163d;
                C6059l1 c6059l13 = new C6059l1(new CallableC6019f1(c5825a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C6022g1(new C6025h1(EnumC6062m1.Attachment, new CallableC6010d1(c6059l13, 12), c5825a.f33470d, c5825a.f33469c, c5825a.f33471e), new CallableC6010d1(c6059l13, 13)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new C6042c(new C5987c1(c6104t, c5759d1.getSdkVersion(), c5821y1), arrayList2);
    }

    /* renamed from: g */
    public C6042c m21481g(final C5765F1 c5765f1, final C5776J0 c5776j0, C5821Y1 c5821y1, final boolean z) {
        ArrayList arrayList = new ArrayList();
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        final InterfaceC5801S serializer = c5759d1.getSerializer();
        final ILogger logger = c5759d1.getLogger();
        Charset charset = C6022g1.f34163d;
        final File file = c5765f1.f33272p;
        C6059l1 c6059l1 = new C6059l1(new Callable() { // from class: io.sentry.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC5801S interfaceC5801S = serializer;
                C5765F1 c5765f12 = c5765f1;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C6022g1.f34163d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            interfaceC5801S.mo21461e(c5765f12, bufferedWriter);
                            linkedHashMap.put(EnumC6062m1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            C5776J0 c5776j02 = c5776j0;
                            if (c5776j02 != null) {
                                interfaceC5801S.mo21461e(c5776j02, bufferedWriter);
                                linkedHashMap.put(EnumC6062m1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrM21733B = AbstractC6003a.m21733B(10485760L, file2.getPath());
                                if (bArrM21733B.length > 0) {
                                    linkedHashMap.put(EnumC6062m1.ReplayVideo.getItemType(), bArrM21733B);
                                }
                            }
                            byte[] bArrM21781g = C6022g1.m21781g(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        iLogger.mo21406d(EnumC6069n1.ERROR, "Could not serialize replay recording", th);
                        if (file2 != null) {
                            if (z2) {
                                AbstractC6003a.m21744c(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                AbstractC6003a.m21744c(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new C6022g1(new C6025h1(EnumC6062m1.ReplayVideo, new CallableC6010d1(c6059l1, 6), (String) null, (String) null, (String) null), new CallableC6010d1(c6059l1, 8)));
        return new C6042c(new C5987c1(c5765f1.f33416a, c5759d1.getSessionReplay().f33295m, c5821y1), arrayList);
    }

    /* renamed from: h */
    public C6104t m21482h(C6042c c6042c, C6193y c6193y) {
        if (c6193y == null) {
            c6193y = new C6193y();
        }
        try {
            c6193y.m21926a();
            return m21490s(c6042c, c6193y);
        } catch (IOException e) {
            ((C5759D1) this.f33441a).getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to capture envelope.", e);
            return C6104t.f34442b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02ca  */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Throwable] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.C6104t m21483i(io.sentry.C6039i1 r12, io.sentry.C5782L0 r13, io.sentry.C6193y r14) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5820Y0.m21483i(io.sentry.i1, io.sentry.L0, io.sentry.y):io.sentry.protocol.t");
    }

    /* renamed from: j */
    public C6104t m21484j(C5765F1 c5765f1, C5782L0 c5782l0, C6193y c6193y) {
        C6087c c6087c;
        C5795P1 c5795p1Mo21427i;
        if (c6193y == null) {
            c6193y = new C6193y();
        }
        if (m21491t(c5765f1, c6193y) && c5782l0 != null) {
            if (c5765f1.f33419d == null) {
                c5765f1.f33419d = c5782l0.f33308d;
            }
            if (c5765f1.f33424i == null) {
                c5765f1.f33424i = c5782l0.f33306b;
            }
            AbstractMap abstractMap = c5765f1.f33420e;
            ConcurrentHashMap concurrentHashMap = c5782l0.f33311g;
            if (abstractMap == null) {
                c5765f1.f33420e = new HashMap(new HashMap(AbstractC6003a.m21732A(concurrentHashMap)));
            } else {
                for (Map.Entry entry : AbstractC6003a.m21732A(concurrentHashMap).entrySet()) {
                    if (!c5765f1.f33420e.containsKey(entry.getKey())) {
                        c5765f1.f33420e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            Iterator it = new C6087c(c5782l0.f33319o).entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c6087c = c5765f1.f33417b;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!c6087c.containsKey(entry2.getKey())) {
                    c6087c.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            InterfaceC5807U interfaceC5807U = c5782l0.f33305a;
            if (interfaceC5807U != null && (c5795p1Mo21427i = interfaceC5807U.mo21427i()) != null) {
                interfaceC5807U = c5795p1Mo21427i;
            }
            if (c6087c.m21849a() == null) {
                if (interfaceC5807U == null) {
                    c6087c.m21851c(C5824Z1.m21492a(c5782l0.f33321q));
                } else {
                    c6087c.m21851c(interfaceC5807U.mo21432n());
                }
            }
        }
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Capturing session replay: %s", c5765f1.f33416a);
        C6104t c6104t = C6104t.f34442b;
        C6104t c6104t2 = c5765f1.f33416a;
        if (c6104t2 != null) {
            c6104t = c6104t2;
        }
        Iterator<InterfaceC6165u> it2 = c5759d1.getEventProcessors().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC6165u next = it2.next();
            try {
                c5765f1 = next.mo21517a(c5765f1, c6193y);
            } catch (Throwable th) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (c5765f1 == null) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                c5759d1.getClientReportRecorder().mo21727a(EnumC6000d.EVENT_PROCESSOR, EnumC6051j.Replay);
                break;
            }
        }
        if (c5765f1 != null) {
            c5759d1.getBeforeSendReplay();
        }
        if (c5765f1 == null) {
            return C6104t.f34442b;
        }
        C5821Y1 c5821y1M21703f = null;
        if (c5782l0 != null) {
            try {
                InterfaceC5807U interfaceC5807U2 = c5782l0.f33305a;
                if (interfaceC5807U2 != null) {
                    c5821y1M21703f = interfaceC5807U2.mo21419a();
                } else {
                    C5985c c5985c = (C5985c) c5782l0.m21417h(new C6119c(c5759d1, c5782l0)).f25480c;
                    if (c5985c != null) {
                        c5821y1M21703f = c5985c.m21703f();
                    }
                }
            } catch (IOException e) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.WARNING, e, "Capturing event %s failed.", c6104t);
                return C6104t.f34442b;
            }
        }
        C6042c c6042cM21481g = m21481g(c5765f1, c6193y.f34744f, c5821y1M21703f, InterfaceC6027b.class.isInstance(AbstractC6003a.m21758r(c6193y)));
        c6193y.m21926a();
        ((InterfaceC6154f) this.f33442b).mo21862T(c6042cM21481g, c6193y);
        return c6104t;
    }

    /* renamed from: k */
    public void m21485k(C5792O1 c5792o1, C6193y c6193y) {
        AbstractC6003a.m21735D(c5792o1, "Session is required.");
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        String str = c5792o1.f33359m;
        if (str == null || str.isEmpty()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            InterfaceC5801S serializer = c5759d1.getSerializer();
            C6102r sdkVersion = c5759d1.getSdkVersion();
            AbstractC6003a.m21735D(serializer, "Serializer is required.");
            m21482h(new C6042c(null, sdkVersion, C6022g1.m21780b(serializer, c5792o1)), c6193y);
        } catch (IOException e) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to capture session.", e);
        }
    }

    /* renamed from: l */
    public C6104t m21486l(C6078A c6078a, C5821Y1 c5821y1, C5782L0 c5782l0, C6193y c6193y, C5761E0 c5761e0) {
        C6078A c6078aM21489q = c6078a;
        C6193y c6193y2 = c6193y == null ? new C6193y() : c6193y;
        if (m21491t(c6078a, c6193y2) && c5782l0 != null) {
            c6193y2.f34740b.addAll(new CopyOnWriteArrayList(c5782l0.f33320p));
        }
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        ILogger logger = c5759d1.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        logger.mo21407k(enumC6069n1, "Capturing transaction: %s", c6078aM21489q.f33416a);
        C6104t c6104t = C6104t.f34442b;
        C6104t c6104t2 = c6078aM21489q.f33416a;
        C6104t c6104t3 = c6104t2 != null ? c6104t2 : c6104t;
        if (m21491t(c6078a, c6193y2)) {
            m21479e(c6078a, c5782l0);
            if (c5782l0 != null) {
                c6078aM21489q = m21489q(c6078a, c6193y2, c5782l0.f33313i);
            }
            if (c6078aM21489q == null) {
                c5759d1.getLogger().mo21407k(enumC6069n1, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c6078aM21489q != null) {
            c6078aM21489q = m21489q(c6078aM21489q, c6193y2, c5759d1.getEventProcessors());
        }
        if (c6078aM21489q == null) {
            c5759d1.getLogger().mo21407k(enumC6069n1, "Transaction was dropped by Event processors.", new Object[0]);
            return c6104t;
        }
        ArrayList arrayList = c6078aM21489q.f34280s;
        int size = arrayList.size();
        c5759d1.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            c5759d1.getLogger().mo21407k(enumC6069n1, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            c5759d1.getClientReportRecorder().mo21729g(EnumC6000d.BEFORE_SEND, EnumC6051j.Span, i);
        }
        try {
            ArrayList arrayListM21476n = m21476n(c6193y2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListM21476n.iterator();
            while (it.hasNext()) {
                ((C5825a) it.next()).getClass();
            }
            C6042c c6042cM21480f = m21480f(c6078aM21489q, arrayList2, null, c5821y1, c5761e0);
            c6193y2.m21926a();
            return c6042cM21480f != null ? m21490s(c6042cM21480f, c6193y2) : c6104t3;
        } catch (C6016b | IOException e) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.WARNING, e, "Capturing transaction %s failed.", c6104t3);
            return C6104t.f34442b;
        }
    }

    /* renamed from: m */
    public void m21487m(boolean z) throws IOException {
        long shutdownTimeoutMillis;
        InterfaceC6154f interfaceC6154f = (InterfaceC6154f) this.f33442b;
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            ((InterfaceC5778K) this.f33444d).close();
        } catch (IOException e) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to close the metrics aggregator.", e);
        }
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = c5759d1.getShutdownTimeoutMillis();
            } catch (IOException e2) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.WARNING, "Failed to close the connection to the Sentry Server.", e2);
            }
        }
        interfaceC6154f.mo21866t(shutdownTimeoutMillis);
        interfaceC6154f.mo21863b(z);
        for (InterfaceC6165u interfaceC6165u : c5759d1.getEventProcessors()) {
            if (interfaceC6165u instanceof Closeable) {
                try {
                    ((Closeable) interfaceC6165u).close();
                } catch (IOException e3) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to close the event processor {}.", interfaceC6165u, e3);
                }
            }
        }
    }

    /* renamed from: p */
    public C6039i1 m21488p(C6039i1 c6039i1, C6193y c6193y, List list) {
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC6165u interfaceC6165u = (InterfaceC6165u) it.next();
            try {
                boolean z = interfaceC6165u instanceof C5912u;
                boolean zIsInstance = InterfaceC6027b.class.isInstance(AbstractC6003a.m21758r(c6193y));
                if (zIsInstance && z) {
                    c6039i1 = ((C5912u) interfaceC6165u).mo21519c(c6039i1, c6193y);
                } else if (!zIsInstance && !z) {
                    c6039i1 = interfaceC6165u.mo21519c(c6039i1, c6193y);
                }
            } catch (Throwable th) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC6165u.getClass().getName());
            }
            if (c6039i1 == null) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Event was dropped by a processor: %s", interfaceC6165u.getClass().getName());
                c5759d1.getClientReportRecorder().mo21727a(EnumC6000d.EVENT_PROCESSOR, EnumC6051j.Error);
                break;
            }
        }
        return c6039i1;
    }

    /* renamed from: q */
    public C6078A m21489q(C6078A c6078a, C6193y c6193y, List list) {
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC6165u interfaceC6165u = (InterfaceC6165u) it.next();
            int size = c6078a.f34280s.size();
            try {
                c6078a = interfaceC6165u.mo21521e(c6078a, c6193y);
            } catch (Throwable th) {
                c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC6165u.getClass().getName());
            }
            int size2 = c6078a == null ? 0 : c6078a.f34280s.size();
            if (c6078a == null) {
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Transaction was dropped by a processor: %s", interfaceC6165u.getClass().getName());
                InterfaceC6002f clientReportRecorder = c5759d1.getClientReportRecorder();
                EnumC6000d enumC6000d = EnumC6000d.EVENT_PROCESSOR;
                clientReportRecorder.mo21727a(enumC6000d, EnumC6051j.Transaction);
                c5759d1.getClientReportRecorder().mo21729g(enumC6000d, EnumC6051j.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), interfaceC6165u.getClass().getName());
                c5759d1.getClientReportRecorder().mo21729g(EnumC6000d.EVENT_PROCESSOR, EnumC6051j.Span, i);
            }
        }
        return c6078a;
    }

    /* renamed from: s */
    public C6104t m21490s(C6042c c6042c, C6193y c6193y) {
        C5759D1 c5759d1 = (C5759D1) this.f33441a;
        InterfaceC6167u1 beforeEnvelopeCallback = c5759d1.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.f33400c.submit(new O91(spotlightIntegration, 21, c6042c));
                } catch (RejectedExecutionException e) {
                    spotlightIntegration.f33399b.mo21406d(EnumC6069n1.WARNING, "Spotlight envelope submission rejected.", e);
                }
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        ((InterfaceC6154f) this.f33442b).mo21862T(c6042c, c6193y);
        C6104t c6104t = ((C5987c1) c6042c.f34198b).f34090a;
        return c6104t != null ? c6104t : C6104t.f34442b;
    }

    /* renamed from: t */
    public boolean m21491t(AbstractC5811V0 abstractC5811V0, C6193y c6193y) {
        if (AbstractC6003a.m21737F(c6193y)) {
            return true;
        }
        ((C5759D1) this.f33441a).getLogger().mo21407k(EnumC6069n1.DEBUG, "Event was cached so not applying scope: %s", abstractC5811V0.f33416a);
        return false;
    }

    public C5820Y0(Boolean bool, Double d, Boolean bool2, Double d2) {
        this.f33441a = bool;
        this.f33442b = d;
        this.f33443c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f33444d = d2;
    }

    public C5820Y0(Context context, ILogger iLogger, C5832D c5832d) {
        Context applicationContext = context.getApplicationContext();
        this.f33441a = applicationContext != null ? applicationContext : context;
        this.f33442b = iLogger;
        this.f33443c = c5832d;
        this.f33444d = new HashMap();
    }

    public C5820Y0(C5759D1 c5759d1) throws IllegalArgumentException {
        Object runnableC6112q0;
        this.f33443c = new C5817X0();
        this.f33441a = c5759d1;
        InterfaceC5813W transportFactory = c5759d1.getTransportFactory();
        if (transportFactory instanceof C6197z0) {
            transportFactory = new C6180v0(5);
            c5759d1.setTransportFactory(transportFactory);
        }
        C6114r c6114rRetrieveParsedDsn = c5759d1.retrieveParsedDsn();
        URI uri = c6114rRetrieveParsedDsn.f34510c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(c5759d1.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(c6114rRetrieveParsedDsn.f34509b);
        String str = c6114rRetrieveParsedDsn.f34508a;
        sb.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String string2 = sb.toString();
        String sentryClientName = c5759d1.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.f33442b = transportFactory.mo21474n(c5759d1, new C6042c(string, map));
        if (c5759d1.isEnableMetrics()) {
            runnableC6112q0 = new RunnableC6112q0(c5759d1, this);
        } else {
            runnableC6112q0 = C6066d.f34245a;
        }
        this.f33444d = runnableC6112q0;
    }
}
