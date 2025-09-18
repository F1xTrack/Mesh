package io.sentry;

import io.sentry.protocol.C5158d;
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

/* renamed from: io.sentry.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5147n0 implements InterfaceC5173u, Closeable {
    public final D1 a;
    public final io.sentry.internal.debugmeta.c b;
    public final com.yandex.metrica.e c;
    public volatile B d = null;

    public C5147n0(D1 d1) {
        io.sentry.config.a.D(d1, "The SentryOptions is required.");
        this.a = d1;
        I1 i1 = new I1(d1, 0);
        this.c = new com.yandex.metrica.e(i1);
        this.b = new io.sentry.internal.debugmeta.c(i1, d1);
    }

    @Override // io.sentry.InterfaceC5173u
    public final F1 a(F1 f1, C5185y c5185y) throws ExecutionException, InterruptedException, TimeoutException {
        if (f1.h == null) {
            f1.h = "java";
        }
        if (j(f1, c5185y)) {
            f(f1);
            io.sentry.protocol.r rVar = this.a.getSessionReplay().m;
            if (rVar != null) {
                f1.c = rVar;
            }
        }
        return f1;
    }

    @Override // io.sentry.InterfaceC5173u
    public final C5133i1 c(C5133i1 c5133i1, C5185y c5185y) throws ExecutionException, InterruptedException, TimeoutException {
        ArrayList arrayList;
        Thread threadCurrentThread;
        io.sentry.protocol.j jVar;
        boolean z;
        if (c5133i1.h == null) {
            c5133i1.h = "java";
        }
        Throwable cause = c5133i1.j;
        if (cause != null) {
            com.yandex.metrica.e eVar = this.c;
            eVar.getClass();
            ArrayDeque arrayDeque = new ArrayDeque();
            HashSet hashSet = new HashSet();
            while (cause != null && hashSet.add(cause)) {
                if (cause instanceof io.sentry.exception.a) {
                    io.sentry.exception.a aVar = (io.sentry.exception.a) cause;
                    io.sentry.protocol.j jVar2 = aVar.a;
                    Throwable th = aVar.b;
                    threadCurrentThread = aVar.c;
                    z = aVar.d;
                    cause = th;
                    jVar = jVar2;
                } else {
                    threadCurrentThread = Thread.currentThread();
                    jVar = null;
                    z = false;
                }
                arrayDeque.addFirst(com.yandex.metrica.e.x(cause, jVar, Long.valueOf(threadCurrentThread.getId()), ((I1) eVar.a).a(cause.getStackTrace(), jVar != null && Boolean.FALSE.equals(jVar.d)), z));
                cause = cause.getCause();
            }
            c5133i1.t = new C5135j0(new ArrayList(arrayDeque));
        }
        g(c5133i1);
        D1 d1 = this.a;
        Map mapA = d1.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = c5133i1.y;
            if (abstractMap == null) {
                c5133i1.y = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (j(c5133i1, c5185y)) {
            f(c5133i1);
            C5135j0 c5135j0 = c5133i1.s;
            if ((c5135j0 != null ? c5135j0.a : null) == null) {
                C5135j0 c5135j02 = c5133i1.t;
                ArrayList<io.sentry.protocol.s> arrayList2 = c5135j02 == null ? null : c5135j02.a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.s sVar : arrayList2) {
                        if (sVar.f != null && sVar.d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(sVar.d);
                        }
                    }
                }
                boolean zIsAttachThreads = d1.isAttachThreads();
                io.sentry.internal.debugmeta.c cVar = this.b;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(io.sentry.config.a.r(c5185y))) {
                    Object objR = io.sentry.config.a.r(c5185y);
                    boolean zC = objR instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objR).c() : false;
                    cVar.getClass();
                    c5133i1.s = new C5135j0(cVar.b(Thread.getAllStackTraces(), arrayList, zC));
                } else if (d1.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !io.sentry.hints.d.class.isInstance(io.sentry.config.a.r(c5185y)))) {
                    cVar.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread2 = Thread.currentThread();
                    map.put(threadCurrentThread2, threadCurrentThread2.getStackTrace());
                    c5133i1.s = new C5135j0(cVar.b(map, null, false));
                }
            }
        }
        return c5133i1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != null) {
            this.d.f.shutdown();
        }
    }

    @Override // io.sentry.InterfaceC5173u
    public final io.sentry.protocol.A e(io.sentry.protocol.A a, C5185y c5185y) throws ExecutionException, InterruptedException, TimeoutException {
        if (a.h == null) {
            a.h = "java";
        }
        g(a);
        if (j(a, c5185y)) {
            f(a);
        }
        return a;
    }

    public final void f(V0 v0) throws ExecutionException, InterruptedException, TimeoutException {
        if (v0.f == null) {
            v0.f = this.a.getRelease();
        }
        if (v0.g == null) {
            v0.g = this.a.getEnvironment();
        }
        if (v0.k == null) {
            v0.k = this.a.getServerName();
        }
        if (this.a.isAttachServerName() && v0.k == null) {
            if (this.d == null) {
                synchronized (this) {
                    try {
                        if (this.d == null) {
                            if (B.i == null) {
                                B.i = new B();
                            }
                            this.d = B.i;
                        }
                    } finally {
                    }
                }
            }
            if (this.d != null) {
                B b = this.d;
                if (b.c < System.currentTimeMillis() && b.d.compareAndSet(false, true)) {
                    b.a();
                }
                v0.k = b.b;
            }
        }
        if (v0.l == null) {
            v0.l = this.a.getDist();
        }
        if (v0.c == null) {
            v0.c = this.a.getSdkVersion();
        }
        AbstractMap abstractMap = v0.e;
        D1 d1 = this.a;
        if (abstractMap == null) {
            v0.e = new HashMap(new HashMap(d1.getTags()));
        } else {
            for (Map.Entry<String, String> entry : d1.getTags().entrySet()) {
                if (!v0.e.containsKey(entry.getKey())) {
                    v0.a(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.E e = v0.i;
        if (e == null) {
            e = new io.sentry.protocol.E();
            v0.i = e;
        }
        if (e.e == null && this.a.isSendDefaultPii()) {
            e.e = "{{auto}}";
        }
    }

    public final void g(V0 v0) {
        ArrayList arrayList = new ArrayList();
        D1 d1 = this.a;
        if (d1.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(d1.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : d1.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C5158d c5158d = v0.n;
        if (c5158d == null) {
            c5158d = new C5158d();
        }
        List list = c5158d.b;
        if (list == null) {
            c5158d.b = new ArrayList(arrayList);
        } else {
            list.addAll(arrayList);
        }
        v0.n = c5158d;
    }

    public final boolean j(V0 v0, C5185y c5185y) {
        if (io.sentry.config.a.F(c5185y)) {
            return true;
        }
        this.a.getLogger().k(EnumC5148n1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", v0.a);
        return false;
    }
}
