package com.yandex.metrica.impl.p022ob;

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
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.p022ob.C2767M0;
import com.yandex.metrica.impl.p022ob.InterfaceC3264fi;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.ji */
/* loaded from: classes2.dex */
public class RunnableC3368ji implements Runnable, InterfaceC3290gi {

    /* renamed from: a */
    private final ServiceConnection f23767a;

    /* renamed from: b */
    private final Handler f23768b;

    /* renamed from: c */
    private final Runnable f23769c;

    /* renamed from: d */
    private final HashMap<String, InterfaceC3160bi> f23770d;

    /* renamed from: e */
    private final Context f23771e;

    /* renamed from: f */
    private volatile boolean f23772f;

    /* renamed from: g */
    private ServerSocket f23773g;

    /* renamed from: h */
    private C2585Ei f23774h;

    /* renamed from: i */
    private C3685vn f23775i;

    /* renamed from: j */
    private final InterfaceC3016W0 f23776j;

    /* renamed from: k */
    private final C2767M0.d f23777k;

    /* renamed from: l */
    private final C3108Zh f23778l;

    /* renamed from: m */
    private final C3108Zh f23779m;

    /* renamed from: n */
    private final InterfaceC3264fi f23780n;

    /* renamed from: o */
    private final C3789zn f23781o;

    /* renamed from: p */
    private final InterfaceC3013Vm<C2585Ei, List<Integer>> f23782p;

    /* renamed from: q */
    private final C3083Yh f23783q;

    /* renamed from: r */
    private final C3342ii f23784r;

    /* renamed from: s */
    private final String f23785s;

    /* renamed from: com.yandex.metrica.impl.ob.ji$a */
    public class a implements ServiceConnection {
        public a(RunnableC3368ji runnableC3368ji) {
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
            RunnableC3368ji.this.m16189c();
            try {
                RunnableC3368ji.this.f23771e.unbindService(RunnableC3368ji.this.f23767a);
            } catch (Throwable unused) {
                RunnableC3368ji.this.f23776j.reportEvent("socket_unbind_has_thrown_exception");
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC3368ji runnableC3368ji = RunnableC3368ji.this;
            RunnableC3368ji.m16170a(runnableC3368ji, runnableC3368ji.f23774h);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$d */
    public class d extends HashMap<String, InterfaceC3160bi> {

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$a */
        public class a implements InterfaceC3160bi {
            public a() {
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC3160bi
            /* renamed from: a */
            public AbstractC3134ai mo15693a(Socket socket, Uri uri, C3316hi c3316hi) {
                RunnableC3368ji runnableC3368ji = RunnableC3368ji.this;
                return new C2884Qh(socket, uri, runnableC3368ji, runnableC3368ji.f23774h, RunnableC3368ji.this.f23783q.m15513a(), c3316hi);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.ji$d$b */
        public class b implements InterfaceC3160bi {
            public b() {
            }

            @Override // com.yandex.metrica.impl.p022ob.InterfaceC3160bi
            /* renamed from: a */
            public AbstractC3134ai mo15693a(Socket socket, Uri uri, C3316hi c3316hi) {
                RunnableC3368ji runnableC3368ji = RunnableC3368ji.this;
                return new C3212di(socket, uri, runnableC3368ji, runnableC3368ji.f23774h, c3316hi);
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
            RunnableC3368ji.m16178f(RunnableC3368ji.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ji$f */
    public enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    public RunnableC3368ji(Context context, C2885Qi c2885Qi, InterfaceC3264fi interfaceC3264fi, InterfaceC3013Vm<C2585Ei, List<Integer>> interfaceC3013Vm, C3033Wh c3033Wh, C3033Wh c3033Wh2, String str) {
        this(context, c2885Qi, C2842P0.m14728i().m14738h(), C2842P0.m14728i().m14748s(), C2834Oh.m14711a(), new C3108Zh("open", c3033Wh), new C3108Zh("port_already_in_use", c3033Wh2), new C3083Yh(context, c2885Qi), new C3342ii(), interfaceC3264fi, interfaceC3013Vm, str);
    }

    /* renamed from: f */
    public static void m16178f(RunnableC3368ji runnableC3368ji) {
        runnableC3368ji.getClass();
        Intent intent = new Intent(runnableC3368ji.f23771e, (Class<?>) MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!runnableC3368ji.f23771e.bindService(intent, runnableC3368ji.f23767a, 1)) {
                runnableC3368ji.f23776j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            runnableC3368ji.f23776j.reportEvent("socket_bind_has_thrown_exception");
        }
        C3685vn c3685vnM17350b = runnableC3368ji.f23781o.m17350b(runnableC3368ji);
        runnableC3368ji.f23775i = c3685vnM17350b;
        c3685vnM17350b.start();
        runnableC3368ji.f23784r.m16096d();
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        Socket socketAccept;
        ServerSocket serverSocket;
        synchronized (this) {
            try {
                C2585Ei c2585Ei = this.f23774h;
                if (c2585Ei != null && m16167a(c2585Ei) == f.SHOULD_RETRY) {
                    this.f23772f = false;
                    long j = this.f23774h.f21131j;
                    C3581rn c3581rn = (C3581rn) this.f23781o.m17349b();
                    c3581rn.m16703a(this.f23769c);
                    c3581rn.m16705a(this.f23769c, j, TimeUnit.SECONDS);
                    return;
                }
                if (C2968U2.m15243a(26)) {
                    TrafficStats.setThreadStatsTag(40230);
                }
                if (this.f23773g != null) {
                    while (this.f23772f) {
                        synchronized (this) {
                            try {
                                socketAccept = null;
                                serverSocket = this.f23772f ? this.f23773g : null;
                            } finally {
                            }
                        }
                        if (serverSocket != null) {
                            try {
                                socketAccept = serverSocket.accept();
                                C3316hi c3316hi = new C3316hi(new C2814Nm(), new C2789Mm());
                                if (C2968U2.m15243a(26)) {
                                    TrafficStats.tagSocket(socketAccept);
                                }
                                new C3186ci(socketAccept, this, this.f23770d, c3316hi).m15712a();
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

    /* renamed from: c */
    private synchronized void m16175c(C2585Ei c2585Ei) {
        if (!this.f23772f && this.f23777k.m14578a(c2585Ei.f21127f)) {
            this.f23772f = true;
        }
    }

    /* renamed from: a */
    public void m16179a() {
        this.f23768b.removeMessages(100);
        this.f23784r.m16097e();
    }

    /* renamed from: b */
    public synchronized void m16186b() {
        if (this.f23772f) {
            m16179a();
            Handler handler = this.f23768b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f23774h.f21122a));
            this.f23784r.m16095c();
        }
    }

    /* renamed from: a */
    public synchronized void m16180a(C2885Qi c2885Qi) {
        try {
            C2585Ei c2585EiM14864M = c2885Qi.m14864M();
            synchronized (this) {
                if (c2585EiM14864M != null) {
                    m16175c(c2585EiM14864M);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public RunnableC3368ji(Context context, C2885Qi c2885Qi, C2767M0 c2767m0, C3789zn c3789zn, InterfaceC3016W0 interfaceC3016W0, C3108Zh c3108Zh, C3108Zh c3108Zh2, C3083Yh c3083Yh, C3342ii c3342ii, InterfaceC3264fi interfaceC3264fi, InterfaceC3013Vm<C2585Ei, List<Integer>> interfaceC3013Vm, String str) {
        this.f23767a = new a(this);
        this.f23768b = new b(Looper.getMainLooper());
        this.f23769c = new c();
        this.f23770d = new d();
        this.f23771e = context;
        this.f23776j = interfaceC3016W0;
        this.f23778l = c3108Zh;
        this.f23779m = c3108Zh2;
        this.f23780n = interfaceC3264fi;
        this.f23782p = interfaceC3013Vm;
        this.f23781o = c3789zn;
        this.f23783q = c3083Yh;
        this.f23784r = c3342ii;
        String strM26234k = AbstractC7222ym.m26234k("[YandexUID", str, "Server]");
        this.f23785s = strM26234k;
        this.f23777k = c2767m0.m14570a(new e(), c3789zn.m17349b(), strM26234k);
        m16173b(c2885Qi.m14864M());
        C2585Ei c2585Ei = this.f23774h;
        if (c2585Ei != null) {
            m16175c(c2585Ei);
        }
    }

    /* renamed from: c */
    public synchronized void m16189c() {
        try {
            this.f23772f = false;
            C3685vn c3685vn = this.f23775i;
            if (c3685vn != null) {
                c3685vn.m17100d();
                this.f23775i = null;
            }
            ServerSocket serverSocket = this.f23773g;
            if (serverSocket != null) {
                serverSocket.close();
                this.f23773g = null;
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public static void m16170a(RunnableC3368ji runnableC3368ji, C2585Ei c2585Ei) {
        synchronized (runnableC3368ji) {
            if (c2585Ei != null) {
                runnableC3368ji.m16175c(c2585Ei);
            }
        }
    }

    /* renamed from: a */
    private synchronized f m16167a(C2585Ei c2585Ei) {
        f fVar;
        Integer next;
        Throwable th;
        InterfaceC3264fi.a e2;
        try {
            Iterator<Integer> it = this.f23782p.mo13948a(c2585Ei).iterator();
            fVar = f.ORDINARY_FAIL;
            Integer num = null;
            while (this.f23773g == null && it.hasNext()) {
                try {
                    next = it.next();
                    if (next != null) {
                        try {
                            this.f23773g = this.f23780n.mo15022a(next.intValue());
                            fVar = f.OK;
                            this.f23778l.m15556a(this, next.intValue(), c2585Ei);
                        } catch (InterfaceC3264fi.a e3) {
                            e2 = e3;
                            String message = e2.getMessage();
                            Throwable cause = e2.getCause();
                            if (cause != null && message != null) {
                                Map<String, Object> mapM16169a = m16169a(next);
                                ((HashMap) mapM16169a).put(Core.Event.Result.EXCEPTION, Log.getStackTraceString(cause));
                                this.f23776j.reportEvent(m16172b(message), mapM16169a);
                            }
                            num = next;
                        } catch (BindException unused) {
                            num = next;
                            fVar = f.SHOULD_RETRY;
                            this.f23779m.m15556a(this, num.intValue(), c2585Ei);
                        } catch (Throwable th2) {
                            th = th2;
                            Map<String, Object> mapM16169a2 = m16169a(next);
                            ((HashMap) mapM16169a2).put(Core.Event.Result.EXCEPTION, Log.getStackTraceString(th));
                            this.f23776j.reportEvent(m16172b("open_error"), mapM16169a2);
                            num = next;
                        }
                    }
                } catch (InterfaceC3264fi.a e4) {
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

    /* renamed from: b */
    private void m16173b(C2585Ei c2585Ei) {
        this.f23774h = c2585Ei;
        if (c2585Ei != null) {
            this.f23777k.m14576a(c2585Ei.f21126e);
        }
    }

    /* renamed from: b */
    public void m16187b(int i, C3316hi c3316hi) {
        this.f23776j.reportEvent(m16172b("sync_succeed"), m16168a(i, c3316hi));
    }

    /* renamed from: b */
    public synchronized void m16188b(C2885Qi c2885Qi) {
        try {
            this.f23783q.m15514a(c2885Qi);
            C2585Ei c2585EiM14864M = c2885Qi.m14864M();
            if (c2585EiM14864M != null) {
                this.f23774h = c2585EiM14864M;
                this.f23777k.m14576a(c2585EiM14864M.f21126e);
                m16175c(c2585EiM14864M);
            } else {
                m16189c();
                m16173b((C2585Ei) null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    private String m16172b(String str) {
        return AbstractC7222ym.m26245v("socket_", str);
    }

    /* renamed from: a */
    private Map<String, Object> m16169a(Integer num) {
        HashMap map = new HashMap();
        map.put("port", num == null ? "" : String.valueOf(num));
        return map;
    }

    /* renamed from: a */
    private Map<String, Object> m16168a(int i, C3316hi c3316hi) {
        Map<String, Object> mapM16169a = m16169a(Integer.valueOf(i));
        HashMap map = (HashMap) mapM16169a;
        map.put("idle_interval", Double.valueOf(this.f23784r.m16094b()));
        map.put("background_interval", Double.valueOf(this.f23784r.m16093a()));
        map.put("request_read_time", Long.valueOf(c3316hi.m16053d()));
        map.put("response_form_time", Long.valueOf(c3316hi.m16054e()));
        map.put("response_send_time", Long.valueOf(c3316hi.m16055f()));
        return mapM16169a;
    }

    /* renamed from: a */
    public void m16183a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("uri", str2);
        this.f23776j.reportEvent("socket_" + str, map);
    }

    /* renamed from: a */
    public void m16181a(String str) {
        this.f23776j.reportEvent(m16172b(str));
    }

    /* renamed from: a */
    public void m16184a(String str, Throwable th) {
        this.f23776j.reportError(m16172b(str), th);
    }

    /* renamed from: a */
    public void m16182a(String str, Integer num) {
        this.f23776j.reportEvent(m16172b(str), m16169a(num));
    }

    /* renamed from: a */
    public void m16185a(Map<String, Object> map, int i, C3316hi c3316hi) {
        Map<String, Object> mapM16168a = m16168a(i, c3316hi);
        ((HashMap) mapM16168a).put("params", map);
        this.f23776j.reportEvent(m16172b("reversed_sync_succeed"), mapM16168a);
    }
}
