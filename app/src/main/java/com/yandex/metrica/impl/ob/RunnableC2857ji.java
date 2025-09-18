package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.huawei.hms.rn.push.constants.Core;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.ob.InterfaceC2758fi;
import com.yandex.metrica.impl.ob.M0;
import defpackage.AbstractC8235ym;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ji */
/* loaded from: classes2.dex */
public class RunnableC2857ji implements Runnable, InterfaceC2783gi {
    private final ServiceConnection a;
    private final Handler b;
    private final Runnable c;
    private final HashMap<String, InterfaceC2658bi> d;
    private final Context e;
    private volatile boolean f;
    private ServerSocket g;
    private Ei h;
    private C3166vn i;
    private final W0 j;
    private final M0.d k;
    private final Zh l;
    private final Zh m;
    private final InterfaceC2758fi n;
    private final C3266zn o;
    private final Vm<Ei, List<Integer>> p;
    private final Yh q;
    private final C2832ii r;
    private final String s;

    /* renamed from: com.yandex.metrica.impl.ob.ji$a */
    public class a implements ServiceConnection {
        public a(RunnableC2857ji runnableC2857ji) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            RunnableC2857ji.this.c();
            try {
                RunnableC2857ji.this.e.unbindService(RunnableC2857ji.this.a);
            } catch (Throwable unused) {
                RunnableC2857ji.this.j.reportEvent("socket_unbind_has_thrown_exception");
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC2857ji runnableC2857ji = RunnableC2857ji.this;
            RunnableC2857ji.a(runnableC2857ji, runnableC2857ji.h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$d */
    public class d extends HashMap<String, InterfaceC2658bi> {

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$a */
        public class a implements InterfaceC2658bi {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC2658bi
            public AbstractC2633ai a(Socket socket, Uri uri, C2808hi c2808hi) {
                RunnableC2857ji runnableC2857ji = RunnableC2857ji.this;
                return new Qh(socket, uri, runnableC2857ji, runnableC2857ji.h, RunnableC2857ji.this.q.a(), c2808hi);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$b */
        public class b implements InterfaceC2658bi {
            public b() {
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC2658bi
            public AbstractC2633ai a(Socket socket, Uri uri, C2808hi c2808hi) {
                RunnableC2857ji runnableC2857ji = RunnableC2857ji.this;
                return new C2708di(socket, uri, runnableC2857ji, runnableC2857ji.h, c2808hi);
            }
        }

        public d() {
            put("p", new a());
            put("i", new b());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC2857ji.f(RunnableC2857ji.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$f */
    public enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    public RunnableC2857ji(Context context, Qi qi, InterfaceC2758fi interfaceC2758fi, Vm<Ei, List<Integer>> vm, Wh wh, Wh wh2, String str) {
        this(context, qi, P0.i().h(), P0.i().s(), Oh.a(), new Zh("open", wh), new Zh("port_already_in_use", wh2), new Yh(context, qi), new C2832ii(), interfaceC2758fi, vm, str);
    }

    public static void f(RunnableC2857ji runnableC2857ji) {
        runnableC2857ji.getClass();
        Intent intent = new Intent(runnableC2857ji.e, (Class<?>) MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!runnableC2857ji.e.bindService(intent, runnableC2857ji.a, 1)) {
                runnableC2857ji.j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            runnableC2857ji.j.reportEvent("socket_bind_has_thrown_exception");
        }
        C3166vn c3166vnB = runnableC2857ji.o.b(runnableC2857ji);
        runnableC2857ji.i = c3166vnB;
        c3166vnB.start();
        runnableC2857ji.r.d();
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        Socket socketAccept;
        ServerSocket serverSocket;
        synchronized (this) {
            try {
                Ei ei = this.h;
                if (ei != null && a(ei) == f.SHOULD_RETRY) {
                    this.f = false;
                    long j = this.h.j;
                    C3061rn c3061rn = (C3061rn) this.o.b();
                    c3061rn.a(this.c);
                    c3061rn.a(this.c, j, TimeUnit.SECONDS);
                    return;
                }
                if (U2.a(26)) {
                    TrafficStats.setThreadStatsTag(40230);
                }
                if (this.g != null) {
                    while (this.f) {
                        synchronized (this) {
                            try {
                                socketAccept = null;
                                serverSocket = this.f ? this.g : null;
                            } finally {
                            }
                        }
                        if (serverSocket != null) {
                            try {
                                socketAccept = serverSocket.accept();
                                C2808hi c2808hi = new C2808hi(new Nm(), new Mm());
                                if (U2.a(26)) {
                                    TrafficStats.tagSocket(socketAccept);
                                }
                                new C2683ci(socketAccept, this, this.d, c2808hi).a();
                            } catch (Throwable unused) {
                                if (socketAccept != null) {
                                }
                            }
                            if (socketAccept != null) {
                                try {
                                    socketAccept.close();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    private synchronized void c(Ei ei) {
        if (!this.f && this.k.a(ei.f)) {
            this.f = true;
        }
    }

    public void a() {
        this.b.removeMessages(100);
        this.r.e();
    }

    public synchronized void b() {
        if (this.f) {
            a();
            Handler handler = this.b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.h.a));
            this.r.c();
        }
    }

    public synchronized void a(Qi qi) {
        try {
            Ei eiM = qi.M();
            synchronized (this) {
                if (eiM != null) {
                    c(eiM);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public RunnableC2857ji(Context context, Qi qi, M0 m0, C3266zn c3266zn, W0 w0, Zh zh, Zh zh2, Yh yh, C2832ii c2832ii, InterfaceC2758fi interfaceC2758fi, Vm<Ei, List<Integer>> vm, String str) {
        this.a = new a(this);
        this.b = new b(Looper.getMainLooper());
        this.c = new c();
        this.d = new d();
        this.e = context;
        this.j = w0;
        this.l = zh;
        this.m = zh2;
        this.n = interfaceC2758fi;
        this.p = vm;
        this.o = c3266zn;
        this.q = yh;
        this.r = c2832ii;
        String strK = AbstractC8235ym.k("[YandexUID", str, "Server]");
        this.s = strK;
        this.k = m0.a(new e(), c3266zn.b(), strK);
        b(qi.M());
        Ei ei = this.h;
        if (ei != null) {
            c(ei);
        }
    }

    public synchronized void c() {
        try {
            this.f = false;
            C3166vn c3166vn = this.i;
            if (c3166vn != null) {
                c3166vn.d();
                this.i = null;
            }
            ServerSocket serverSocket = this.g;
            if (serverSocket != null) {
                serverSocket.close();
                this.g = null;
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void a(RunnableC2857ji runnableC2857ji, Ei ei) {
        synchronized (runnableC2857ji) {
            if (ei != null) {
                runnableC2857ji.c(ei);
            }
        }
    }

    private synchronized f a(Ei ei) {
        f fVar;
        Integer next;
        Throwable th;
        InterfaceC2758fi.a e2;
        try {
            Iterator<Integer> it = this.p.a(ei).iterator();
            fVar = f.ORDINARY_FAIL;
            Integer num = null;
            while (this.g == null && it.hasNext()) {
                try {
                    next = it.next();
                    if (next != null) {
                        try {
                            this.g = this.n.a(next.intValue());
                            fVar = f.OK;
                            this.l.a(this, next.intValue(), ei);
                        } catch (InterfaceC2758fi.a e3) {
                            e2 = e3;
                            String message = e2.getMessage();
                            Throwable cause = e2.getCause();
                            if (cause != null && message != null) {
                                Map<String, Object> mapA = a(next);
                                ((HashMap) mapA).put(Core.Event.Result.EXCEPTION, Log.getStackTraceString(cause));
                                this.j.reportEvent(b(message), mapA);
                            }
                            num = next;
                        } catch (BindException unused) {
                            num = next;
                            fVar = f.SHOULD_RETRY;
                            this.m.a(this, num.intValue(), ei);
                        } catch (Throwable th2) {
                            th = th2;
                            Map<String, Object> mapA2 = a(next);
                            ((HashMap) mapA2).put(Core.Event.Result.EXCEPTION, Log.getStackTraceString(th));
                            this.j.reportEvent(b("open_error"), mapA2);
                            num = next;
                        }
                    }
                } catch (InterfaceC2758fi.a e4) {
                    next = num;
                    e2 = e4;
                } catch (BindException unused2) {
                } catch (Throwable th3) {
                    next = num;
                    th = th3;
                }
                num = next;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return fVar;
    }

    private void b(Ei ei) {
        this.h = ei;
        if (ei != null) {
            this.k.a(ei.e);
        }
    }

    public void b(int i, C2808hi c2808hi) {
        this.j.reportEvent(b("sync_succeed"), a(i, c2808hi));
    }

    public synchronized void b(Qi qi) {
        try {
            this.q.a(qi);
            Ei eiM = qi.M();
            if (eiM != null) {
                this.h = eiM;
                this.k.a(eiM.e);
                c(eiM);
            } else {
                c();
                b((Ei) null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String b(String str) {
        return AbstractC8235ym.v("socket_", str);
    }

    private Map<String, Object> a(Integer num) {
        HashMap map = new HashMap();
        map.put("port", num == null ? "" : String.valueOf(num));
        return map;
    }

    private Map<String, Object> a(int i, C2808hi c2808hi) {
        Map<String, Object> mapA = a(Integer.valueOf(i));
        HashMap map = (HashMap) mapA;
        map.put("idle_interval", Double.valueOf(this.r.b()));
        map.put("background_interval", Double.valueOf(this.r.a()));
        map.put("request_read_time", Long.valueOf(c2808hi.d()));
        map.put("response_form_time", Long.valueOf(c2808hi.e()));
        map.put("response_send_time", Long.valueOf(c2808hi.f()));
        return mapA;
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("uri", str2);
        this.j.reportEvent("socket_" + str, map);
    }

    public void a(String str) {
        this.j.reportEvent(b(str));
    }

    public void a(String str, Throwable th) {
        this.j.reportError(b(str), th);
    }

    public void a(String str, Integer num) {
        this.j.reportEvent(b(str), a(num));
    }

    public void a(Map<String, Object> map, int i, C2808hi c2808hi) {
        Map<String, Object> mapA = a(i, c2808hi);
        ((HashMap) mapA).put("params", map);
        this.j.reportEvent(b("reversed_sync_succeed"), mapA);
    }
}
