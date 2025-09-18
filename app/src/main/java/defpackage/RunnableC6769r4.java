package defpackage;

import android.content.ComponentName;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.activity.a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.ipc.BaseIPCClient$BindingResult$Ok;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadJob;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.impl.B0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: r4 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6769r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC6769r4(BaseIPCClient baseIPCClient, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = 13;
        this.b = baseIPCClient;
        this.c = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    private final void a() {
        BaseIPCClient baseIPCClient = (BaseIPCClient) this.b;
        ?? r1 = (AbstractC1676Vg0) this.c;
        BaseIPCClient.Companion companion = BaseIPCClient.INSTANCE;
        O90.f(baseIPCClient, "this$0");
        Set set = baseIPCClient.k;
        O90.e(set, "runningRequests");
        synchronized (set) {
            try {
                Set set2 = baseIPCClient.k;
                O90.e(set2, "runningRequests");
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    r1.invoke(it.next());
                }
                baseIPCClient.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        C7375uF c7375uF = (C7375uF) this.b;
        InterfaceC7480uo interfaceC7480uo = (InterfaceC7480uo) this.c;
        synchronized (c7375uF.a) {
            try {
                ((HashSet) c7375uF.c).remove(interfaceC7480uo);
                if (((HashSet) c7375uF.c).isEmpty()) {
                    ((C0365El) c7375uF.e).getClass();
                    ((C0365El) c7375uF.e).b(null);
                    c7375uF.e = null;
                    c7375uF.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        C8054xp c8054xp = (C8054xp) this.b;
        C0365El c0365El = (C0365El) this.c;
        if (c8054xp.f != null) {
            Executor executor = c8054xp.d;
            if (executor instanceof ExecutorC6144no) {
                ExecutorC6144no executorC6144no = (ExecutorC6144no) executor;
                synchronized (executorC6144no.a) {
                    try {
                        if (!executorC6144no.b.isShutdown()) {
                            executorC6144no.b.shutdown();
                        }
                    } finally {
                    }
                }
            }
            c8054xp.f.quit();
        }
        c0365El.b(null);
    }

    private final void d() {
        InterfaceC5281jH interfaceC5281jH;
        C0249Cy0 c0249Cy0 = (C0249Cy0) this.b;
        InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) this.c;
        if (c0249Cy0.b != C0249Cy0.d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (c0249Cy0) {
            interfaceC5281jH = c0249Cy0.a;
            c0249Cy0.a = null;
            c0249Cy0.b = interfaceC3739fG0;
        }
        interfaceC5281jH.h(interfaceC3739fG0);
    }

    private final void e() {
        C1991Zh0 c1991Zh0 = (C1991Zh0) this.b;
        InterfaceC3739fG0 interfaceC3739fG0 = (InterfaceC3739fG0) this.c;
        synchronized (c1991Zh0) {
            try {
                if (c1991Zh0.b == null) {
                    c1991Zh0.a.add(interfaceC3739fG0);
                } else {
                    c1991Zh0.b.add(interfaceC3739fG0.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                X11 x11 = (X11) this.b;
                x11.getClass();
                ((InterfaceC4285i70) this.c).k(x11);
                return;
            case 1:
                C2251b3 c2251b3 = (C2251b3) this.b;
                O90.f(c2251b3, "$listener");
                AbstractActivityC4281i6 abstractActivityC4281i6 = (AbstractActivityC4281i6) this.c;
                O90.f(abstractActivityC4281i6, "$activity");
                c2251b3.a(abstractActivityC4281i6);
                return;
            case 2:
                C4332iN c4332iN = (C4332iN) this.b;
                O90.f(c4332iN, "this$0");
                AbstractActivityC4281i6 abstractActivityC4281i62 = (AbstractActivityC4281i6) this.c;
                O90.f(abstractActivityC4281i62, "$activity");
                Iterator it = ((CopyOnWriteArrayList) c4332iN.b).iterator();
                while (it.hasNext()) {
                    ((C2251b3) it.next()).a(abstractActivityC4281i62);
                }
                return;
            case 3:
                Runnable runnable = (Runnable) this.c;
                ExecutorC7157t6 executorC7157t6 = (ExecutorC7157t6) this.b;
                executorC7157t6.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC7157t6.c();
                }
            case 4:
                C0646Ia1 c0646Ia1 = AppStartTrace.v;
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                appStartTrace.getClass();
                appStartTrace.b.c((C0493Gb1) ((C0259Db1) this.c).l(), EnumC3333d8.FOREGROUND_BACKGROUND);
                return;
            case 5:
                CC0 cc0 = (CC0) this.b;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1012, new C6227oE(y3P, (String) this.c, 3));
                return;
            case 6:
                C0999Mo1 c0999Mo1 = (C0999Mo1) this.b;
                c0999Mo1.getClass();
                AbstractC0759Jm0.f("Recorder");
                Throwable th = (Throwable) this.c;
                if (th instanceof C0722Ja) {
                    ((C1699Vo) c0999Mo1.a).b(th);
                    return;
                }
                return;
            case 7:
                C0644Ia c0644Ia = (C0644Ia) this.b;
                int iX = AbstractC8235ym.x(c0644Ia.g);
                if (iX != 0 && iX != 1) {
                    if (iX == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                C6257oO c6257oO = c0644Ia.l;
                C6257oO c6257oO2 = (C6257oO) this.c;
                if (c6257oO != c6257oO2) {
                    c0644Ia.b(c6257oO2);
                    return;
                }
                return;
            case 8:
                C0365El c0365El = (C0365El) this.c;
                C0644Ia c0644Ia2 = (C0644Ia) this.b;
                c0644Ia2.getClass();
                try {
                    int iX2 = AbstractC8235ym.x(c0644Ia2.g);
                    if (iX2 == 0 || iX2 == 1) {
                        c0644Ia2.b(null);
                        c0644Ia2.e.b.getAndSet(true);
                        C8036xj c8036xj = c0644Ia2.d;
                        if (!c8036xj.b.getAndSet(true)) {
                            c8036xj.d.execute(new RunnableC7656vj(c8036xj, 3));
                        }
                        c0644Ia2.d();
                        AbstractC0759Jm0.f("AudioSource");
                        c0644Ia2.g = 3;
                    }
                    c0365El.b(null);
                    return;
                } catch (Throwable th2) {
                    c0365El.d(th2);
                    return;
                }
            case 9:
                ((C3954gO0) ((C0999Mo1) this.c).b).c0 = ((C0644Ia) this.b).t;
                return;
            case 10:
                B.a((B) this.b, (OnFetchCompleteListener) this.c);
                return;
            case 11:
                B0.a((B0) this.b, (PluginErrorDetails) this.c);
                return;
            case 12:
                ((BackgroundDownloadJob) this.b).lambda$doWork$0((BackgroundDownloadInitializer) this.c);
                return;
            case 13:
                a();
                return;
            case 14:
                BaseIPCClient.Companion companion = BaseIPCClient.INSTANCE;
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.b;
                O90.f(baseIPCClient, "this$0");
                C5772lr0 c5772lr0 = (C5772lr0) this.c;
                O90.f(c5772lr0, "$service");
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Sleeping 1000 ms before next bind attempt", null, 2, null);
                SystemClock.sleep(1000L);
                AppInfo appInfo = (AppInfo) c5772lr0.b;
                boolean zA = O90.a(baseIPCClient.d(appInfo, (ComponentName) c5772lr0.c), BaseIPCClient$BindingResult$Ok.INSTANCE);
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "bindService to " + appInfo.getPackageName() + " result: " + zA, null, 2, null);
                if (zA) {
                    return;
                }
                Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Failed to bind again. Giving up.", null, 2, null);
                C2178ag c2178ag = new C2178ag(baseIPCClient, 1);
                Set set = baseIPCClient.k;
                O90.e(set, "runningRequests");
                if (set.isEmpty()) {
                    return;
                }
                baseIPCClient.j.submit(new RunnableC6769r4(baseIPCClient, c2178ag));
                return;
            case 15:
                C6329om c6329om = (C6329om) this.b;
                AbstractC1500Sz1.m(AbstractC8171yQ1.b(new C4406im(c6329om, c6329om.m())), (C0365El) this.c);
                return;
            case 16:
                C5756lm c5756lm = ((C6329om) this.b).x;
                HashSet hashSet = (HashSet) c5756lm.b;
                AbstractC6141nn abstractC6141nn = (AbstractC6141nn) this.c;
                hashSet.remove(abstractC6141nn);
                ((ArrayMap) c5756lm.c).remove(abstractC6141nn);
                return;
            case 17:
                C5947mm c5947mm = (C5947mm) this.b;
                c5947mm.getClass();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = (HashSet) c5947mm.b;
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    InterfaceC6138nm interfaceC6138nm = (InterfaceC6138nm) it2.next();
                    if (interfaceC6138nm.c((TotalCaptureResult) this.c)) {
                        hashSet2.add(interfaceC6138nm);
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                hashSet3.removeAll(hashSet2);
                return;
            case 18:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 19:
                C0212Cm c0212Cm = (C0212Cm) this.b;
                c0212Cm.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = (String) this.c;
                sb.append(str);
                sb.append(" INACTIVE");
                c0212Cm.u(sb.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0212Cm.a.a;
                if (linkedHashMap.containsKey(str)) {
                    C4012gh1 c4012gh1 = (C4012gh1) linkedHashMap.get(str);
                    c4012gh1.f = false;
                    if (!c4012gh1.e) {
                        linkedHashMap.remove(str);
                    }
                }
                c0212Cm.L();
                return;
            case 20:
                ((InterfaceC7814wY0) this.b).a((C8194yY0) this.c);
                return;
            case 21:
                ((C6329om) this.b).j((C1537Tm) this.c);
                return;
            case 22:
                b();
                return;
            case 23:
                c();
                return;
            case 24:
                AbstractActivityC0629Hv abstractActivityC0629Hv = (AbstractActivityC0629Hv) this.b;
                O90.f(abstractActivityC0629Hv, "this$0");
                a aVar = (a) this.c;
                O90.f(aVar, "$dispatcher");
                abstractActivityC0629Hv.getLifecycle().a(new C8072xv(aVar, 0, abstractActivityC0629Hv));
                return;
            case 25:
                d();
                return;
            case 26:
                e();
                return;
            case 27:
                InterfaceC3296cx0 interfaceC3296cx0 = (InterfaceC3296cx0) this.c;
                C0245Cx c0245Cx = (C0245Cx) this.b;
                c0245Cx.getClass();
                try {
                    interfaceC3296cx0.a(c0245Cx.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    interfaceC3296cx0.onError(e);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List<AbstractC0946Lx> list = (List) this.b;
                AbstractC2038Zx abstractC2038Zx = (AbstractC2038Zx) this.c;
                O90.f(abstractC2038Zx, "this$0");
                for (AbstractC0946Lx abstractC0946Lx : list) {
                    Object obj = abstractC2038Zx.d;
                    abstractC0946Lx.d = obj;
                    abstractC0946Lx.d(abstractC0946Lx.e, obj);
                }
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) this.c;
                O90.f(constraintTrackingWorker, "this$0");
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            C8007xZ0 c8007xZ0 = constraintTrackingWorker.d;
                            O90.e(c8007xZ0, "future");
                            int i2 = AbstractC3298cy.a;
                            c8007xZ0.j(new C0906Lj0());
                        } else {
                            constraintTrackingWorker.d.l(interfaceFutureC0750Jj0);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC6769r4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
