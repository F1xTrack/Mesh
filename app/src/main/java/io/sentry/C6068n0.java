package io.sentry;

import com.yandex.metrica.C2460e;
import io.sentry.config.AbstractC6003a;
import io.sentry.exception.C6015a;
import io.sentry.hints.InterfaceC6026a;
import io.sentry.hints.InterfaceC6029d;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6088d;
import io.sentry.protocol.C6094j;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6103s;
import io.sentry.protocol.DebugImage;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: io.sentry.n0 */
/* loaded from: classes2.dex */
public final class C6068n0 implements InterfaceC6165u, Closeable {

    /* renamed from: a */
    public final C5759D1 f34253a;

    /* renamed from: b */
    public final C6042c f34254b;

    /* renamed from: c */
    public final C2460e f34255c;

    /* renamed from: d */
    public volatile C5751B f34256d = null;

    public C6068n0(C5759D1 c5759d1) {
        AbstractC6003a.m21735D(c5759d1, "The SentryOptions is required.");
        this.f34253a = c5759d1;
        C5774I1 c5774i1 = new C5774I1(c5759d1, 0);
        this.f34255c = new C2460e(c5774i1);
        this.f34254b = new C6042c(c5774i1, c5759d1);
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) throws ExecutionException, InterruptedException, TimeoutException {
        if (c5765f1.f33423h == null) {
            c5765f1.f33423h = "java";
        }
        if (m21842j(c5765f1, c6193y)) {
            m21840f(c5765f1);
            C6102r c6102r = this.f34253a.getSessionReplay().f33295m;
            if (c6102r != null) {
                c5765f1.f33418c = c6102r;
            }
        }
        return c5765f1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    public final C6039i1 mo21519c(C6039i1 c6039i1, C6193y c6193y) throws ExecutionException, InterruptedException, TimeoutException {
        ArrayList arrayList;
        Thread threadCurrentThread;
        C6094j c6094j;
        boolean z;
        if (c6039i1.f33423h == null) {
            c6039i1.f33423h = "java";
        }
        Throwable cause = c6039i1.f33425j;
        if (cause != null) {
            C2460e c2460e = this.f34255c;
            c2460e.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (cause != null && hashSet.add(cause)) {
                if (cause instanceof C6015a) {
                    C6015a c6015a = (C6015a) cause;
                    C6094j c6094j2 = c6015a.f34139a;
                    Throwable th = c6015a.f34140b;
                    threadCurrentThread = c6015a.f34141c;
                    z = c6015a.f34142d;
                    cause = th;
                    c6094j = c6094j2;
                } else {
                    threadCurrentThread = Thread.currentThread();
                    c6094j = null;
                    z = false;
                }
                arrayDeque.addFirst(C2460e.m13802x(cause, c6094j, Long.valueOf(threadCurrentThread.getId()), ((C5774I1) c2460e.f20786a).m21402a(cause.getStackTrace(), c6094j != null && Boolean.FALSE.equals(c6094j.f34386d)), z));
                cause = cause.getCause();
            }
            c6039i1.f34190t = new C6052j0(new ArrayList(arrayDeque));
        }
        m21841g(c6039i1);
        C5759D1 c5759d1 = this.f34253a;
        Map mapMo21792a = c5759d1.getModulesLoader().mo21792a();
        if (mapMo21792a != null) {
            AbstractMap abstractMap = c6039i1.f34195y;
            if (abstractMap == null) {
                c6039i1.f34195y = new HashMap(mapMo21792a);
            } else {
                abstractMap.putAll(mapMo21792a);
            }
        }
        if (m21842j(c6039i1, c6193y)) {
            m21840f(c6039i1);
            C6052j0 c6052j0 = c6039i1.f34189s;
            if ((c6052j0 != null ? c6052j0.f34215a : null) == null) {
                C6052j0 c6052j02 = c6039i1.f34190t;
                ArrayList<C6103s> arrayList2 = c6052j02 == null ? null : c6052j02.f34215a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (C6103s c6103s : arrayList2) {
                        if (c6103s.f34440f != null && c6103s.f34438d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c6103s.f34438d);
                        }
                    }
                }
                boolean zIsAttachThreads = c5759d1.isAttachThreads();
                C6042c c6042c = this.f34254b;
                if (zIsAttachThreads || InterfaceC6026a.class.isInstance(AbstractC6003a.m21758r(c6193y))) {
                    Object objM21758r = AbstractC6003a.m21758r(c6193y);
                    boolean zMo21618c = objM21758r instanceof InterfaceC6026a ? ((InterfaceC6026a) objM21758r).mo21618c() : false;
                    c6042c.getClass();
                    c6039i1.f34189s = new C6052j0(c6042c.m21790b(Thread.getAllStackTraces(), arrayList, zMo21618c));
                } else if (c5759d1.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !InterfaceC6029d.class.isInstance(AbstractC6003a.m21758r(c6193y)))) {
                    c6042c.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread2 = Thread.currentThread();
                    map.put(threadCurrentThread2, threadCurrentThread2.getStackTrace());
                    c6039i1.f34189s = new C6052j0(c6042c.m21790b(map, null, false));
                }
            }
        }
        return c6039i1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f34256d != null) {
            this.f34256d.f33217f.shutdown();
        }
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) throws ExecutionException, InterruptedException, TimeoutException {
        if (c6078a.f33423h == null) {
            c6078a.f33423h = "java";
        }
        m21841g(c6078a);
        if (m21842j(c6078a, c6193y)) {
            m21840f(c6078a);
        }
        return c6078a;
    }

    /* renamed from: f */
    public final void m21840f(AbstractC5811V0 abstractC5811V0) throws ExecutionException, InterruptedException, TimeoutException {
        if (abstractC5811V0.f33421f == null) {
            abstractC5811V0.f33421f = this.f34253a.getRelease();
        }
        if (abstractC5811V0.f33422g == null) {
            abstractC5811V0.f33422g = this.f34253a.getEnvironment();
        }
        if (abstractC5811V0.f33426k == null) {
            abstractC5811V0.f33426k = this.f34253a.getServerName();
        }
        if (this.f34253a.isAttachServerName() && abstractC5811V0.f33426k == null) {
            if (this.f34256d == null) {
                synchronized (this) {
                    try {
                        if (this.f34256d == null) {
                            if (C5751B.f33211i == null) {
                                C5751B.f33211i = new C5751B();
                            }
                            this.f34256d = C5751B.f33211i;
                        }
                    } finally {
                    }
                }
            }
            if (this.f34256d != null) {
                C5751B c5751b = this.f34256d;
                if (c5751b.f33214c < System.currentTimeMillis() && c5751b.f33215d.compareAndSet(false, true)) {
                    c5751b.m21357a();
                }
                abstractC5811V0.f33426k = c5751b.f33213b;
            }
        }
        if (abstractC5811V0.f33427l == null) {
            abstractC5811V0.f33427l = this.f34253a.getDist();
        }
        if (abstractC5811V0.f33418c == null) {
            abstractC5811V0.f33418c = this.f34253a.getSdkVersion();
        }
        AbstractMap abstractMap = abstractC5811V0.f33420e;
        C5759D1 c5759d1 = this.f34253a;
        if (abstractMap == null) {
            abstractC5811V0.f33420e = new HashMap(new HashMap(c5759d1.getTags()));
        } else {
            for (Map.Entry<String, String> entry : c5759d1.getTags().entrySet()) {
                if (!abstractC5811V0.f33420e.containsKey(entry.getKey())) {
                    abstractC5811V0.m21473a(entry.getKey(), entry.getValue());
                }
            }
        }
        C6082E c6082e = abstractC5811V0.f33424i;
        if (c6082e == null) {
            c6082e = new C6082E();
            abstractC5811V0.f33424i = c6082e;
        }
        if (c6082e.f34292e == null && this.f34253a.isSendDefaultPii()) {
            c6082e.f34292e = "{{auto}}";
        }
    }

    /* renamed from: g */
    public final void m21841g(AbstractC5811V0 abstractC5811V0) {
        ArrayList arrayList = new ArrayList();
        C5759D1 c5759d1 = this.f34253a;
        if (c5759d1.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c5759d1.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c5759d1.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C6088d c6088d = abstractC5811V0.f33429n;
        if (c6088d == null) {
            c6088d = new C6088d();
        }
        List list = c6088d.f34329b;
        if (list == null) {
            c6088d.f34329b = new ArrayList(arrayList);
        } else {
            list.addAll(arrayList);
        }
        abstractC5811V0.f33429n = c6088d;
    }

    /* renamed from: j */
    public final boolean m21842j(AbstractC5811V0 abstractC5811V0, C6193y c6193y) {
        if (AbstractC6003a.m21737F(c6193y)) {
            return true;
        }
        this.f34253a.getLogger().mo21407k(EnumC6069n1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC5811V0.f33416a);
        return false;
    }
}
