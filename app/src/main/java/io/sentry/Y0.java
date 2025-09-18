package io.sentry;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import defpackage.CallableC7695vw;
import defpackage.O91;
import io.sentry.android.core.C5103u;
import io.sentry.protocol.C5157c;
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

/* loaded from: classes2.dex */
public final class Y0 implements H {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public Y0(Boolean bool, Double d) {
        this(bool, d, Boolean.FALSE, null);
    }

    public static ArrayList n(C5185y c5185y) {
        ArrayList arrayList = new ArrayList(c5185y.b);
        C5081a c5081a = c5185y.c;
        if (c5081a != null) {
            arrayList.add(c5081a);
        }
        C5081a c5081a2 = c5185y.d;
        if (c5081a2 != null) {
            arrayList.add(c5081a2);
        }
        C5081a c5081a3 = c5185y.e;
        if (c5081a3 != null) {
            arrayList.add(c5081a3);
        }
        return arrayList;
    }

    public static ConnectivityManager o(Context context, ILogger iLogger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            iLogger.k(EnumC5148n1.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
        }
        return connectivityManager;
    }

    public static boolean r(Context context, ILogger iLogger, io.sentry.android.core.D d, ConnectivityManager.NetworkCallback networkCallback) {
        d.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            iLogger.k(EnumC5148n1.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerO = o(context, iLogger);
        if (connectivityManagerO == null) {
            return false;
        }
        if (!io.sentry.config.a.u(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.k(EnumC5148n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            connectivityManagerO.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.WARNING, "registerDefaultNetworkCallback failed", th);
            return false;
        }
    }

    @Override // io.sentry.H
    public String a() {
        io.sentry.android.core.D d = (io.sentry.android.core.D) this.c;
        Context context = (Context) this.a;
        ILogger iLogger = (ILogger) this.b;
        ConnectivityManager connectivityManagerO = o(context, iLogger);
        String str = null;
        if (connectivityManagerO != null) {
            if (io.sentry.config.a.u(context, "android.permission.ACCESS_NETWORK_STATE")) {
                try {
                    d.getClass();
                    Network activeNetwork = connectivityManagerO.getActiveNetwork();
                    if (activeNetwork == null) {
                        iLogger.k(EnumC5148n1.INFO, "Network is null and cannot check network status", new Object[0]);
                    } else {
                        NetworkCapabilities networkCapabilities = connectivityManagerO.getNetworkCapabilities(activeNetwork);
                        if (networkCapabilities == null) {
                            iLogger.k(EnumC5148n1.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
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
                    iLogger.d(EnumC5148n1.ERROR, "Failed to retrieve network info", th);
                }
            } else {
                iLogger.k(EnumC5148n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            }
        }
        return str;
    }

    @Override // io.sentry.H
    public F b() {
        F f;
        Context context = (Context) this.a;
        ILogger iLogger = (ILogger) this.b;
        ConnectivityManager connectivityManagerO = o(context, iLogger);
        if (connectivityManagerO == null) {
            return F.UNKNOWN;
        }
        if (!io.sentry.config.a.u(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.k(EnumC5148n1.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return F.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerO.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                iLogger.k(EnumC5148n1.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                f = F.DISCONNECTED;
            } else {
                f = activeNetworkInfo.isConnected() ? F.CONNECTED : F.DISCONNECTED;
            }
            return f;
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.WARNING, "Could not retrieve Connection Status", th);
            return F.UNKNOWN;
        }
    }

    @Override // io.sentry.H
    public boolean c(G g) {
        io.sentry.android.core.D d = (io.sentry.android.core.D) this.c;
        d.getClass();
        io.sentry.android.core.internal.util.a aVar = new io.sentry.android.core.internal.util.a(this, g);
        ((HashMap) this.d).put(g, aVar);
        return r((Context) this.a, (ILogger) this.b, d, aVar);
    }

    @Override // io.sentry.H
    public void d(G g) {
        ConnectivityManager.NetworkCallback networkCallback = (ConnectivityManager.NetworkCallback) ((HashMap) this.d).remove(g);
        if (networkCallback != null) {
            ((io.sentry.android.core.D) this.c).getClass();
            Context context = (Context) this.a;
            ILogger iLogger = (ILogger) this.b;
            ConnectivityManager connectivityManagerO = o(context, iLogger);
            if (connectivityManagerO == null) {
                return;
            }
            try {
                connectivityManagerO.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th) {
                iLogger.d(EnumC5148n1.WARNING, "unregisterNetworkCallback failed", th);
            }
        }
    }

    public void e(V0 v0, L0 l0) {
        if (l0 != null) {
            if (v0.d == null) {
                v0.d = l0.d;
            }
            if (v0.i == null) {
                v0.i = l0.b;
            }
            AbstractMap abstractMap = v0.e;
            ConcurrentHashMap concurrentHashMap = l0.g;
            if (abstractMap == null) {
                v0.e = new HashMap(new HashMap(io.sentry.config.a.A(concurrentHashMap)));
            } else {
                for (Map.Entry entry : io.sentry.config.a.A(concurrentHashMap).entrySet()) {
                    if (!v0.e.containsKey(entry.getKey())) {
                        v0.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            List list = v0.m;
            W1 w1 = l0.f;
            if (list == null) {
                v0.m = new ArrayList(new ArrayList(w1));
            } else if (!w1.isEmpty()) {
                list.addAll(w1);
                Collections.sort(list, (X0) this.c);
            }
            AbstractMap abstractMap2 = v0.o;
            ConcurrentHashMap concurrentHashMap2 = l0.h;
            if (abstractMap2 == null) {
                v0.o = new HashMap(new HashMap(concurrentHashMap2));
            } else {
                for (Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (!v0.o.containsKey(entry2.getKey())) {
                        v0.o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            Iterator it = new C5157c(l0.o).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object key = entry3.getKey();
                C5157c c5157c = v0.b;
                if (!c5157c.containsKey(key)) {
                    c5157c.put((String) entry3.getKey(), entry3.getValue());
                }
            }
        }
    }

    public io.sentry.internal.debugmeta.c f(V0 v0, ArrayList arrayList, O1 o1, Y1 y1, E0 e0) {
        io.sentry.protocol.t tVar;
        ArrayList arrayList2 = new ArrayList();
        D1 d1 = (D1) this.a;
        if (v0 != null) {
            S serializer = d1.getSerializer();
            Charset charset = C5127g1.d;
            io.sentry.config.a.D(serializer, "ISerializer is required.");
            C5142l1 c5142l1 = new C5142l1(new CallableC7695vw(serializer, 11, v0));
            arrayList2.add(new C5127g1(new C5130h1(EnumC5145m1.resolve(v0), new CallableC5118d1(c5142l1, 2), "application/json", (String) null, (String) null), new CallableC5118d1(c5142l1, 3)));
            tVar = v0.a;
        } else {
            tVar = null;
        }
        if (o1 != null) {
            arrayList2.add(C5127g1.b(d1.getSerializer(), o1));
        }
        if (e0 != null) {
            long maxTraceFileSize = d1.getMaxTraceFileSize();
            S serializer2 = d1.getSerializer();
            Charset charset2 = C5127g1.d;
            File file = e0.a;
            C5142l1 c5142l12 = new C5142l1(new CallableC5124f1(file, maxTraceFileSize, e0, serializer2));
            arrayList2.add(new C5127g1(new C5130h1(EnumC5145m1.Profile, new CallableC5118d1(c5142l12, 0), "application-json", file.getName(), (String) null), new CallableC5118d1(c5142l12, 1)));
            if (tVar == null) {
                tVar = new io.sentry.protocol.t(e0.w);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5081a c5081a = (C5081a) it.next();
                S serializer3 = d1.getSerializer();
                ILogger logger = d1.getLogger();
                long maxAttachmentSize = d1.getMaxAttachmentSize();
                Charset charset3 = C5127g1.d;
                C5142l1 c5142l13 = new C5142l1(new CallableC5124f1(c5081a, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new C5127g1(new C5130h1(EnumC5145m1.Attachment, new CallableC5118d1(c5142l13, 12), c5081a.d, c5081a.c, c5081a.e), new CallableC5118d1(c5142l13, 13)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new io.sentry.internal.debugmeta.c(new C5115c1(tVar, d1.getSdkVersion(), y1), arrayList2);
    }

    public io.sentry.internal.debugmeta.c g(final F1 f1, final J0 j0, Y1 y1, final boolean z) {
        ArrayList arrayList = new ArrayList();
        D1 d1 = (D1) this.a;
        final S serializer = d1.getSerializer();
        final ILogger logger = d1.getLogger();
        Charset charset = C5127g1.d;
        final File file = f1.p;
        C5142l1 c5142l1 = new C5142l1(new Callable() { // from class: io.sentry.e1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                S s = serializer;
                F1 f12 = f1;
                File file2 = file;
                ILogger iLogger = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C5127g1.d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            s.e(f12, bufferedWriter);
                            linkedHashMap.put(EnumC5145m1.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            J0 j02 = j0;
                            if (j02 != null) {
                                s.e(j02, bufferedWriter);
                                linkedHashMap.put(EnumC5145m1.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrB = io.sentry.config.a.B(10485760L, file2.getPath());
                                if (bArrB.length > 0) {
                                    linkedHashMap.put(EnumC5145m1.ReplayVideo.getItemType(), bArrB);
                                }
                            }
                            byte[] bArrG = C5127g1.g(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        iLogger.d(EnumC5148n1.ERROR, "Could not serialize replay recording", th);
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.config.a.c(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.config.a.c(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new C5127g1(new C5130h1(EnumC5145m1.ReplayVideo, new CallableC5118d1(c5142l1, 6), (String) null, (String) null, (String) null), new CallableC5118d1(c5142l1, 8)));
        return new io.sentry.internal.debugmeta.c(new C5115c1(f1.a, d1.getSessionReplay().m, y1), arrayList);
    }

    public io.sentry.protocol.t h(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) {
        if (c5185y == null) {
            c5185y = new C5185y();
        }
        try {
            c5185y.a();
            return s(cVar, c5185y);
        } catch (IOException e) {
            ((D1) this.a).getLogger().d(EnumC5148n1.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.t.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02ca  */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.protocol.t i(io.sentry.C5133i1 r12, io.sentry.L0 r13, io.sentry.C5185y r14) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.Y0.i(io.sentry.i1, io.sentry.L0, io.sentry.y):io.sentry.protocol.t");
    }

    public io.sentry.protocol.t j(F1 f1, L0 l0, C5185y c5185y) {
        C5157c c5157c;
        P1 p1I;
        if (c5185y == null) {
            c5185y = new C5185y();
        }
        if (t(f1, c5185y) && l0 != null) {
            if (f1.d == null) {
                f1.d = l0.d;
            }
            if (f1.i == null) {
                f1.i = l0.b;
            }
            AbstractMap abstractMap = f1.e;
            ConcurrentHashMap concurrentHashMap = l0.g;
            if (abstractMap == null) {
                f1.e = new HashMap(new HashMap(io.sentry.config.a.A(concurrentHashMap)));
            } else {
                for (Map.Entry entry : io.sentry.config.a.A(concurrentHashMap).entrySet()) {
                    if (!f1.e.containsKey(entry.getKey())) {
                        f1.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            Iterator it = new C5157c(l0.o).entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c5157c = f1.b;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if (!c5157c.containsKey(entry2.getKey())) {
                    c5157c.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            U u = l0.a;
            if (u != null && (p1I = u.i()) != null) {
                u = p1I;
            }
            if (c5157c.a() == null) {
                if (u == null) {
                    c5157c.c(Z1.a(l0.q));
                } else {
                    c5157c.c(u.n());
                }
            }
        }
        D1 d1 = (D1) this.a;
        d1.getLogger().k(EnumC5148n1.DEBUG, "Capturing session replay: %s", f1.a);
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        io.sentry.protocol.t tVar2 = f1.a;
        if (tVar2 != null) {
            tVar = tVar2;
        }
        Iterator<InterfaceC5173u> it2 = d1.getEventProcessors().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC5173u next = it2.next();
            try {
                f1 = next.a(f1, c5185y);
            } catch (Throwable th) {
                d1.getLogger().c(EnumC5148n1.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (f1 == null) {
                d1.getLogger().k(EnumC5148n1.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                d1.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC5134j.Replay);
                break;
            }
        }
        if (f1 != null) {
            d1.getBeforeSendReplay();
        }
        if (f1 == null) {
            return io.sentry.protocol.t.b;
        }
        Y1 y1F = null;
        if (l0 != null) {
            try {
                U u2 = l0.a;
                if (u2 != null) {
                    y1F = u2.a();
                } else {
                    C5113c c5113c = (C5113c) l0.h(new io.sentry.react.c(d1, l0)).c;
                    if (c5113c != null) {
                        y1F = c5113c.f();
                    }
                }
            } catch (IOException e) {
                d1.getLogger().c(EnumC5148n1.WARNING, e, "Capturing event %s failed.", tVar);
                return io.sentry.protocol.t.b;
            }
        }
        io.sentry.internal.debugmeta.c cVarG = g(f1, c5185y.f, y1F, io.sentry.hints.b.class.isInstance(io.sentry.config.a.r(c5185y)));
        c5185y.a();
        ((io.sentry.transport.f) this.b).T(cVarG, c5185y);
        return tVar;
    }

    public void k(O1 o1, C5185y c5185y) {
        io.sentry.config.a.D(o1, "Session is required.");
        D1 d1 = (D1) this.a;
        String str = o1.m;
        if (str == null || str.isEmpty()) {
            d1.getLogger().k(EnumC5148n1.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            S serializer = d1.getSerializer();
            io.sentry.protocol.r sdkVersion = d1.getSdkVersion();
            io.sentry.config.a.D(serializer, "Serializer is required.");
            h(new io.sentry.internal.debugmeta.c(null, sdkVersion, C5127g1.b(serializer, o1)), c5185y);
        } catch (IOException e) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Failed to capture session.", e);
        }
    }

    public io.sentry.protocol.t l(io.sentry.protocol.A a, Y1 y1, L0 l0, C5185y c5185y, E0 e0) {
        io.sentry.protocol.A aQ = a;
        C5185y c5185y2 = c5185y == null ? new C5185y() : c5185y;
        if (t(a, c5185y2) && l0 != null) {
            c5185y2.b.addAll(new CopyOnWriteArrayList(l0.p));
        }
        D1 d1 = (D1) this.a;
        ILogger logger = d1.getLogger();
        EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
        logger.k(enumC5148n1, "Capturing transaction: %s", aQ.a);
        io.sentry.protocol.t tVar = io.sentry.protocol.t.b;
        io.sentry.protocol.t tVar2 = aQ.a;
        io.sentry.protocol.t tVar3 = tVar2 != null ? tVar2 : tVar;
        if (t(a, c5185y2)) {
            e(a, l0);
            if (l0 != null) {
                aQ = q(a, c5185y2, l0.i);
            }
            if (aQ == null) {
                d1.getLogger().k(enumC5148n1, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (aQ != null) {
            aQ = q(aQ, c5185y2, d1.getEventProcessors());
        }
        if (aQ == null) {
            d1.getLogger().k(enumC5148n1, "Transaction was dropped by Event processors.", new Object[0]);
            return tVar;
        }
        ArrayList arrayList = aQ.s;
        int size = arrayList.size();
        d1.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            d1.getLogger().k(enumC5148n1, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            d1.getClientReportRecorder().g(io.sentry.clientreport.d.BEFORE_SEND, EnumC5134j.Span, i);
        }
        try {
            ArrayList arrayListN = n(c5185y2);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListN.iterator();
            while (it.hasNext()) {
                ((C5081a) it.next()).getClass();
            }
            io.sentry.internal.debugmeta.c cVarF = f(aQ, arrayList2, null, y1, e0);
            c5185y2.a();
            return cVarF != null ? s(cVarF, c5185y2) : tVar3;
        } catch (io.sentry.exception.b | IOException e) {
            d1.getLogger().c(EnumC5148n1.WARNING, e, "Capturing transaction %s failed.", tVar3);
            return io.sentry.protocol.t.b;
        }
    }

    public void m(boolean z) throws IOException {
        long shutdownTimeoutMillis;
        io.sentry.transport.f fVar = (io.sentry.transport.f) this.b;
        D1 d1 = (D1) this.a;
        d1.getLogger().k(EnumC5148n1.INFO, "Closing SentryClient.", new Object[0]);
        try {
            ((K) this.d).close();
        } catch (IOException e) {
            d1.getLogger().d(EnumC5148n1.WARNING, "Failed to close the metrics aggregator.", e);
        }
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = d1.getShutdownTimeoutMillis();
            } catch (IOException e2) {
                d1.getLogger().d(EnumC5148n1.WARNING, "Failed to close the connection to the Sentry Server.", e2);
            }
        }
        fVar.t(shutdownTimeoutMillis);
        fVar.b(z);
        for (InterfaceC5173u interfaceC5173u : d1.getEventProcessors()) {
            if (interfaceC5173u instanceof Closeable) {
                try {
                    ((Closeable) interfaceC5173u).close();
                } catch (IOException e3) {
                    d1.getLogger().k(EnumC5148n1.WARNING, "Failed to close the event processor {}.", interfaceC5173u, e3);
                }
            }
        }
    }

    public C5133i1 p(C5133i1 c5133i1, C5185y c5185y, List list) {
        D1 d1 = (D1) this.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5173u interfaceC5173u = (InterfaceC5173u) it.next();
            try {
                boolean z = interfaceC5173u instanceof C5103u;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(io.sentry.config.a.r(c5185y));
                if (zIsInstance && z) {
                    c5133i1 = ((C5103u) interfaceC5173u).c(c5133i1, c5185y);
                } else if (!zIsInstance && !z) {
                    c5133i1 = interfaceC5173u.c(c5133i1, c5185y);
                }
            } catch (Throwable th) {
                d1.getLogger().c(EnumC5148n1.ERROR, th, "An exception occurred while processing event by processor: %s", interfaceC5173u.getClass().getName());
            }
            if (c5133i1 == null) {
                d1.getLogger().k(EnumC5148n1.DEBUG, "Event was dropped by a processor: %s", interfaceC5173u.getClass().getName());
                d1.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC5134j.Error);
                break;
            }
        }
        return c5133i1;
    }

    public io.sentry.protocol.A q(io.sentry.protocol.A a, C5185y c5185y, List list) {
        D1 d1 = (D1) this.a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5173u interfaceC5173u = (InterfaceC5173u) it.next();
            int size = a.s.size();
            try {
                a = interfaceC5173u.e(a, c5185y);
            } catch (Throwable th) {
                d1.getLogger().c(EnumC5148n1.ERROR, th, "An exception occurred while processing transaction by processor: %s", interfaceC5173u.getClass().getName());
            }
            int size2 = a == null ? 0 : a.s.size();
            if (a == null) {
                d1.getLogger().k(EnumC5148n1.DEBUG, "Transaction was dropped by a processor: %s", interfaceC5173u.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = d1.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, EnumC5134j.Transaction);
                d1.getClientReportRecorder().g(dVar, EnumC5134j.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                d1.getLogger().k(EnumC5148n1.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), interfaceC5173u.getClass().getName());
                d1.getClientReportRecorder().g(io.sentry.clientreport.d.EVENT_PROCESSOR, EnumC5134j.Span, i);
            }
        }
        return a;
    }

    public io.sentry.protocol.t s(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) {
        D1 d1 = (D1) this.a;
        InterfaceC5175u1 beforeEnvelopeCallback = d1.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) beforeEnvelopeCallback;
                try {
                    spotlightIntegration.c.submit(new O91(spotlightIntegration, 21, cVar));
                } catch (RejectedExecutionException e) {
                    spotlightIntegration.b.d(EnumC5148n1.WARNING, "Spotlight envelope submission rejected.", e);
                }
            } catch (Throwable th) {
                d1.getLogger().d(EnumC5148n1.ERROR, "The BeforeEnvelope callback threw an exception.", th);
            }
        }
        ((io.sentry.transport.f) this.b).T(cVar, c5185y);
        io.sentry.protocol.t tVar = ((C5115c1) cVar.b).a;
        return tVar != null ? tVar : io.sentry.protocol.t.b;
    }

    public boolean t(V0 v0, C5185y c5185y) {
        if (io.sentry.config.a.F(c5185y)) {
            return true;
        }
        ((D1) this.a).getLogger().k(EnumC5148n1.DEBUG, "Event was cached so not applying scope: %s", v0.a);
        return false;
    }

    public Y0(Boolean bool, Double d, Boolean bool2, Double d2) {
        this.a = bool;
        this.b = d;
        this.c = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.d = d2;
    }

    public Y0(Context context, ILogger iLogger, io.sentry.android.core.D d) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = iLogger;
        this.c = d;
        this.d = new HashMap();
    }

    public Y0(D1 d1) throws IllegalArgumentException {
        Object runnableC5163q0;
        this.c = new X0();
        this.a = d1;
        W transportFactory = d1.getTransportFactory();
        if (transportFactory instanceof C5189z0) {
            transportFactory = new C5177v0(5);
            d1.setTransportFactory(transportFactory);
        }
        r rVarRetrieveParsedDsn = d1.retrieveParsedDsn();
        URI uri = rVarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(d1.getSentryClientName());
        sb.append(",sentry_key=");
        sb.append(rVarRetrieveParsedDsn.b);
        String str = rVarRetrieveParsedDsn.a;
        sb.append((str == null || str.length() <= 0) ? "" : ",sentry_secret=".concat(str));
        String string2 = sb.toString();
        String sentryClientName = d1.getSentryClientName();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.b = transportFactory.n(d1, new io.sentry.internal.debugmeta.c(string, map));
        if (d1.isEnableMetrics()) {
            runnableC5163q0 = new RunnableC5163q0(d1, this);
        } else {
            runnableC5163q0 = io.sentry.metrics.d.a;
        }
        this.d = runnableC5163q0;
    }
}
