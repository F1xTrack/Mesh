package p000;

import android.content.ComponentName;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.activity.C1690a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.ipc.BaseIPCClient;
import com.p019vk.push.core.ipc.BaseIPCClient$BindingResult$Ok;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadJob;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.C3858B;
import io.appmetrica.analytics.impl.C4382B0;
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
public final /* synthetic */ class RunnableC6720r4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f41325a;

    /* renamed from: b */
    public final /* synthetic */ Object f41326b;

    /* renamed from: c */
    public final /* synthetic */ Object f41327c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC6720r4(BaseIPCClient baseIPCClient, InterfaceC6497nZ interfaceC6497nZ) {
        this.f41325a = 13;
        this.f41326b = baseIPCClient;
        this.f41327c = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Vg0, nZ] */
    /* renamed from: a */
    private final void m24153a() {
        BaseIPCClient baseIPCClient = (BaseIPCClient) this.f41326b;
        ?? r1 = (AbstractC8418Vg0) this.f41327c;
        BaseIPCClient.Companion companion = BaseIPCClient.INSTANCE;
        O90.m5968f(baseIPCClient, "this$0");
        Set set = baseIPCClient.f20448k;
        O90.m5967e(set, "runningRequests");
        synchronized (set) {
            try {
                Set set2 = baseIPCClient.f20448k;
                O90.m5967e(set2, "runningRequests");
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    r1.invoke(it.next());
                }
                baseIPCClient.f20448k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m24154b() {
        C6937uF c6937uF = (C6937uF) this.f41326b;
        InterfaceC6972uo interfaceC6972uo = (InterfaceC6972uo) this.f41327c;
        synchronized (c6937uF.f43616a) {
            try {
                ((HashSet) c6937uF.f43618c).remove(interfaceC6972uo);
                if (((HashSet) c6937uF.f43618c).isEmpty()) {
                    ((C0300El) c6937uF.f43620e).getClass();
                    ((C0300El) c6937uF.f43620e).m2375b(null);
                    c6937uF.f43620e = null;
                    c6937uF.f43619d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private final void m24155c() {
        C7162xp c7162xp = (C7162xp) this.f41326b;
        C0300El c0300El = (C0300El) this.f41327c;
        if (c7162xp.f45807f != null) {
            Executor executor = c7162xp.f45805d;
            if (executor instanceof ExecutorC6512no) {
                ExecutorC6512no executorC6512no = (ExecutorC6512no) executor;
                synchronized (executorC6512no.f38513a) {
                    try {
                        if (!executorC6512no.f38514b.isShutdown()) {
                            executorC6512no.f38514b.shutdown();
                        }
                    } finally {
                    }
                }
            }
            c7162xp.f45807f.quit();
        }
        c0300El.m2375b(null);
    }

    /* renamed from: d */
    private final void m24156d() {
        InterfaceC6227jH interfaceC6227jH;
        C7466Cy0 c7466Cy0 = (C7466Cy0) this.f41326b;
        InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) this.f41327c;
        if (c7466Cy0.f1787b != C7466Cy0.f1785d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (c7466Cy0) {
            interfaceC6227jH = c7466Cy0.f1786a;
            c7466Cy0.f1786a = null;
            c7466Cy0.f1787b = interfaceC9347fG0;
        }
        interfaceC6227jH.mo410h(interfaceC9347fG0);
    }

    /* renamed from: e */
    private final void m24157e() {
        C8628Zh0 c8628Zh0 = (C8628Zh0) this.f41326b;
        InterfaceC9347fG0 interfaceC9347fG0 = (InterfaceC9347fG0) this.f41327c;
        synchronized (c8628Zh0) {
            try {
                if (c8628Zh0.f15095b == null) {
                    c8628Zh0.f15094a.add(interfaceC9347fG0);
                } else {
                    c8628Zh0.f15095b.add(interfaceC9347fG0.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41325a) {
            case 0:
                X11 x11 = (X11) this.f41326b;
                x11.getClass();
                ((InterfaceC9713i70) this.f41327c).mo504k(x11);
                return;
            case 1:
                C1761b3 c1761b3 = (C1761b3) this.f41326b;
                O90.m5968f(c1761b3, "$listener");
                AbstractActivityC4221i6 abstractActivityC4221i6 = (AbstractActivityC4221i6) this.f41327c;
                O90.m5968f(abstractActivityC4221i6, "$activity");
                c1761b3.m10417a(abstractActivityC4221i6);
                return;
            case 2:
                C4238iN c4238iN = (C4238iN) this.f41326b;
                O90.m5968f(c4238iN, "this$0");
                AbstractActivityC4221i6 abstractActivityC4221i62 = (AbstractActivityC4221i6) this.f41327c;
                O90.m5968f(abstractActivityC4221i62, "$activity");
                Iterator it = ((CopyOnWriteArrayList) c4238iN.f29113b).iterator();
                while (it.hasNext()) {
                    ((C1761b3) it.next()).m10417a(abstractActivityC4221i62);
                }
                return;
            case 3:
                Runnable runnable = (Runnable) this.f41327c;
                ExecutorC6865t6 executorC6865t6 = (ExecutorC6865t6) this.f41326b;
                executorC6865t6.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC6865t6.m24838c();
                }
            case 4:
                C7731Ia1 c7731Ia1 = AppStartTrace.f18480v;
                AppStartTrace appStartTrace = (AppStartTrace) this.f41326b;
                appStartTrace.getClass();
                appStartTrace.f18485b.m9557c((C7629Gb1) ((C7473Db1) this.f41327c).m23920l(), EnumC3909d8.FOREGROUND_BACKGROUND);
                return;
            case 5:
                CC0 cc0 = (CC0) this.f41326b;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1012, new C6539oE(c1514y3M26333P, (String) this.f41327c, 3));
                return;
            case 6:
                C7967Mo1 c7967Mo1 = (C7967Mo1) this.f41326b;
                c7967Mo1.getClass();
                AbstractC7806Jm0.m4412f("Recorder");
                Throwable th = (Throwable) this.f41327c;
                if (th instanceof C0604Ja) {
                    ((C1372Vo) c7967Mo1.f7362a).mo3020b(th);
                    return;
                }
                return;
            case 7:
                C0541Ia c0541Ia = (C0541Ia) this.f41326b;
                int iM26247x = AbstractC7222ym.m26247x(c0541Ia.f4999g);
                if (iM26247x != 0 && iM26247x != 1) {
                    if (iM26247x == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                C6549oO c6549oO = c0541Ia.f5004l;
                C6549oO c6549oO2 = (C6549oO) this.f41327c;
                if (c6549oO != c6549oO2) {
                    c0541Ia.m3939b(c6549oO2);
                    return;
                }
                return;
            case 8:
                C0300El c0300El = (C0300El) this.f41327c;
                C0541Ia c0541Ia2 = (C0541Ia) this.f41326b;
                c0541Ia2.getClass();
                try {
                    int iM26247x2 = AbstractC7222ym.m26247x(c0541Ia2.f4999g);
                    if (iM26247x2 == 0 || iM26247x2 == 1) {
                        c0541Ia2.m3939b(null);
                        c0541Ia2.f4997e.f5253b.getAndSet(true);
                        C7156xj c7156xj = c0541Ia2.f4996d;
                        if (!c7156xj.f45747b.getAndSet(true)) {
                            c7156xj.f45749d.execute(new RunnableC7030vj(c7156xj, 3));
                        }
                        c0541Ia2.m3941d();
                        AbstractC7806Jm0.m4412f("AudioSource");
                        c0541Ia2.f4999g = 3;
                    }
                    c0300El.m2375b(null);
                    return;
                } catch (Throwable th2) {
                    c0300El.m2377d(th2);
                    return;
                }
            case 9:
                ((C9491gO0) ((C7967Mo1) this.f41327c).f7363b).f27750c0 = ((C0541Ia) this.f41326b).f5012t;
                return;
            case 10:
                C3858B.m17385a((C3858B) this.f41326b, (OnFetchCompleteListener) this.f41327c);
                return;
            case 11:
                C4382B0.m19214a((C4382B0) this.f41326b, (PluginErrorDetails) this.f41327c);
                return;
            case 12:
                ((BackgroundDownloadJob) this.f41326b).lambda$doWork$0((BackgroundDownloadInitializer) this.f41327c);
                return;
            case 13:
                m24153a();
                return;
            case 14:
                BaseIPCClient.Companion companion = BaseIPCClient.INSTANCE;
                BaseIPCClient baseIPCClient = (BaseIPCClient) this.f41326b;
                O90.m5968f(baseIPCClient, "this$0");
                C10189lr0 c10189lr0 = (C10189lr0) this.f41327c;
                O90.m5968f(c10189lr0, "$service");
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Sleeping 1000 ms before next bind attempt", null, 2, null);
                SystemClock.sleep(1000L);
                AppInfo appInfo = (AppInfo) c10189lr0.f37323b;
                boolean zM5963a = O90.m5963a(baseIPCClient.m13746d(appInfo, (ComponentName) c10189lr0.f37324c), BaseIPCClient$BindingResult$Ok.INSTANCE);
                Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "bindService to " + appInfo.getPackageName() + " result: " + zM5963a, null, 2, null);
                if (zM5963a) {
                    return;
                }
                Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Failed to bind again. Giving up.", null, 2, null);
                C1679ag c1679ag = new C1679ag(baseIPCClient, 1);
                Set set = baseIPCClient.f20448k;
                O90.m5967e(set, "runningRequests");
                if (set.isEmpty()) {
                    return;
                }
                baseIPCClient.f20447j.submit(new RunnableC6720r4(baseIPCClient, c1679ag));
                return;
            case 15:
                C6573om c6573om = (C6573om) this.f41326b;
                AbstractC8301Sz1.m7490m(AbstractC11797yQ1.m26149b(new C4263im(c6573om, c6573om.m23552m())), (C0300El) this.f41327c);
                return;
            case 16:
                C6384lm c6384lm = ((C6573om) this.f41326b).f39252x;
                HashSet hashSet = (HashSet) c6384lm.f37285b;
                AbstractC6511nn abstractC6511nn = (AbstractC6511nn) this.f41327c;
                hashSet.remove(abstractC6511nn);
                ((ArrayMap) c6384lm.f37286c).remove(abstractC6511nn);
                return;
            case 17:
                C6447mm c6447mm = (C6447mm) this.f41326b;
                c6447mm.getClass();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = (HashSet) c6447mm.f37864b;
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    InterfaceC6510nm interfaceC6510nm = (InterfaceC6510nm) it2.next();
                    if (interfaceC6510nm.mo2326c((TotalCaptureResult) this.f41327c)) {
                        hashSet2.add(interfaceC6510nm);
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                hashSet3.removeAll(hashSet2);
                return;
            case 18:
                ((Surface) this.f41326b).release();
                ((SurfaceTexture) this.f41327c).release();
                return;
            case 19:
                C0175Cm c0175Cm = (C0175Cm) this.f41326b;
                c0175Cm.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = (String) this.f41327c;
                sb.append(str);
                sb.append(" INACTIVE");
                c0175Cm.m1347u(sb.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0175Cm.f1622a.f43693a;
                if (linkedHashMap.containsKey(str)) {
                    C9530gh1 c9530gh1 = (C9530gh1) linkedHashMap.get(str);
                    c9530gh1.f27940f = false;
                    if (!c9530gh1.f27939e) {
                        linkedHashMap.remove(str);
                    }
                }
                c0175Cm.m1325L();
                return;
            case 20:
                ((InterfaceC11558wY0) this.f41326b).mo10586a((C11812yY0) this.f41327c);
                return;
            case 21:
                ((C6573om) this.f41326b).m23549j((C1244Tm) this.f41327c);
                return;
            case 22:
                m24154b();
                return;
            case 23:
                m24155c();
                return;
            case 24:
                AbstractActivityC0499Hv abstractActivityC0499Hv = (AbstractActivityC0499Hv) this.f41326b;
                O90.m5968f(abstractActivityC0499Hv, "this$0");
                C1690a c1690a = (C1690a) this.f41327c;
                O90.m5968f(c1690a, "$dispatcher");
                abstractActivityC0499Hv.getLifecycle().mo2368a(new C7168xv(c1690a, 0, abstractActivityC0499Hv));
                return;
            case 25:
                m24156d();
                return;
            case 26:
                m24157e();
                return;
            case 27:
                InterfaceC9049cx0 interfaceC9049cx0 = (InterfaceC9049cx0) this.f41327c;
                C0186Cx c0186Cx = (C0186Cx) this.f41326b;
                c0186Cx.getClass();
                try {
                    interfaceC9049cx0.mo2107a(c0186Cx.f1781a.f3071b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    interfaceC9049cx0.onError(e);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List<AbstractC0752Lx> list = (List) this.f41326b;
                AbstractC1633Zx abstractC1633Zx = (AbstractC1633Zx) this.f41327c;
                O90.m5968f(abstractC1633Zx, "this$0");
                for (AbstractC0752Lx abstractC0752Lx : list) {
                    Object obj = abstractC1633Zx.f15238d;
                    abstractC0752Lx.f6940d = obj;
                    abstractC0752Lx.m5160d(abstractC0752Lx.f6941e, obj);
                }
                return;
            default:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f41326b;
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) this.f41327c;
                O90.m5968f(constraintTrackingWorker, "this$0");
                synchronized (constraintTrackingWorker.f16596b) {
                    try {
                        if (constraintTrackingWorker.f16597c) {
                            C11687xZ0 c11687xZ0 = constraintTrackingWorker.f16598d;
                            O90.m5967e(c11687xZ0, "future");
                            int i2 = AbstractC3898cy.f25730a;
                            c11687xZ0.m25921j(new C7904Lj0());
                        } else {
                            constraintTrackingWorker.f16598d.m25923l(interfaceFutureC7800Jj0);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC6720r4(Object obj, int i, Object obj2) {
        this.f41325a = i;
        this.f41326b = obj;
        this.f41327c = obj2;
    }
}
