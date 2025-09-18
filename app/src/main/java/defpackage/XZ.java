package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import com.bumptech.glide.a;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.killserver.screenshotprev.RNScreenshotPreventModule;
import com.microsoft.codepush.react.CodePushNativeModule;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes.dex */
public final class XZ implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ XZ(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        try {
            ((Runnable) this.c).run();
            synchronized (((ExecutorC7157t6) this.b).d) {
                ((ExecutorC7157t6) this.b).c();
            }
        } catch (Throwable th) {
            synchronized (((ExecutorC7157t6) this.b).d) {
                ((ExecutorC7157t6) this.b).c();
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((C7306tt1) this.c).c) {
            ((InterfaceC1415Rx0) ((C7306tt1) this.c).d).onFailure(((C1797Wu1) this.b).d());
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, SR1 {
        InterfaceC0069Aq0 interfaceC0069Aq0;
        Iterator it;
        float f;
        View view = null;
        switch (this.a) {
            case 0:
                PZ pz = (PZ) this.c;
                try {
                    pz.onSuccess(AbstractC1500Sz1.e((InterfaceFutureC0750Jj0) this.b));
                    return;
                } catch (Error e) {
                    e = e;
                    pz.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    pz.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    if (cause == null) {
                        pz.onFailure(e3);
                        return;
                    } else {
                        pz.onFailure(cause);
                        return;
                    }
                }
            case 1:
                C6189o2 c6189o2 = (C6189o2) this.c;
                MenuC0225Cq0 menuC0225Cq0 = c6189o2.c;
                if (menuC0225Cq0 != null && (interfaceC0069Aq0 = menuC0225Cq0.e) != null) {
                    interfaceC0069Aq0.k(menuC0225Cq0);
                }
                View view2 = (View) c6189o2.h;
                if (view2 != null && view2.getWindowToken() != null) {
                    C5616l2 c5616l2 = (C5616l2) this.b;
                    if (c5616l2.b()) {
                        c6189o2.s = c5616l2;
                    } else if (c5616l2.e != null) {
                        c5616l2.d(0, 0, false, false);
                        c6189o2.s = c5616l2;
                    }
                }
                c6189o2.u = null;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((F2) this.c);
                return;
            case 3:
                CA0 ca0C = ((C3383dO1) this.b).C();
                if (ca0C == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((C6832rP) this.c).c(ca0C);
                return;
            case 4:
                EQ1 eq1 = (EQ1) ((C7409uQ0) this.b).a;
                if (eq1 != null) {
                    eq1.d((Typeface) this.c);
                    return;
                }
                return;
            case 5:
                CodePushNativeModule codePushNativeModule = (CodePushNativeModule) this.c;
                try {
                    QK0 qk0 = (QK0) this.b;
                    UN1.b(qk0.s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                    qk0.n();
                    codePushNativeModule.mCodePush.e();
                    return;
                } catch (Exception unused) {
                    codePushNativeModule.loadBundleLegacy();
                    return;
                }
            case 6:
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    XF xf = (XF) this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        xf.n.remove(arrayList);
                        return;
                    }
                    VF vf = (VF) it2.next();
                    xf.getClass();
                    OO0 oo0 = vf.a;
                    View view3 = oo0 == null ? view : oo0.a;
                    OO0 oo02 = vf.b;
                    View view4 = oo02 != null ? oo02.a : view;
                    ArrayList arrayList2 = xf.r;
                    long j = xf.f;
                    if (view3 != null) {
                        ViewPropertyAnimator duration = view3.animate().setDuration(j);
                        arrayList2.add(vf.a);
                        duration.translationX(vf.e - vf.c);
                        duration.translationY(vf.f - vf.d);
                        it = it2;
                        f = 0.0f;
                        duration.alpha(0.0f).setListener(new UF(xf, vf, duration, view3, 0)).start();
                    } else {
                        it = it2;
                        f = 0.0f;
                    }
                    if (view4 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view4.animate();
                        arrayList2.add(vf.b);
                        viewPropertyAnimatorAnimate.translationX(f).translationY(f).setDuration(j).alpha(1.0f).setListener(new UF(xf, vf, viewPropertyAnimatorAnimate, view4, 1)).start();
                    }
                    it2 = it;
                    view = null;
                }
            case 7:
                TE teG = TE.G();
                int i = C8142yH.d;
                C1623Uo1 c1623Uo1 = (C1623Uo1) this.b;
                teG.getClass();
                ((C8142yH) this.c).a.e(c1623Uo1);
                return;
            case 8:
                J11 j11 = (J11) this.b;
                j11.a.a();
                synchronized (j11.b) {
                    synchronized (((HO) this.c)) {
                        try {
                            GO go = ((HO) this.c).a;
                            J11 j112 = (J11) this.b;
                            go.getClass();
                            if (go.a.contains(new FO(j112, AbstractC8451zu1.c))) {
                                ((HO) this.c).v.b();
                                HO ho = (HO) this.c;
                                J11 j113 = (J11) this.b;
                                ho.getClass();
                                try {
                                    j113.l(ho.v, ho.r, ho.y);
                                    ((HO) this.c).j((J11) this.b);
                                } catch (Throwable th) {
                                    throw new C0209Cl(th);
                                }
                            }
                            ((HO) this.c).d();
                        } finally {
                        }
                    }
                }
                return;
            case 9:
                a aVarA = a.a(((Activity) this.b).getApplicationContext());
                aVarA.getClass();
                AbstractC0121Bh1.a();
                aVarA.c.g(0L);
                aVarA.b.r();
                aVarA.e.a();
                ((Promise) this.c).resolve(null);
                return;
            case 10:
                ((C0767Jp) this.b).C((C8097y20) this.c);
                return;
            case 11:
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = (InterfaceFutureC0750Jj0) this.b;
                if (!interfaceFutureC0750Jj0.isCancelled()) {
                    RU0 ru0 = (RU0) this.c;
                    InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) ru0.a.getContext().g(C0396Ev0.e);
                    if (interfaceC1115Ob0 != null ? interfaceC1115Ob0.isActive() : true) {
                        try {
                            ru0.resumeWith(interfaceFutureC0750Jj0.get());
                            return;
                        } catch (ExecutionException e4) {
                            Throwable cause2 = e4.getCause();
                            if (cause2 == null) {
                                throw e4;
                            }
                            ru0.resumeWith(RQ1.b(cause2));
                            return;
                        }
                    }
                }
                throw new CancellationException("ListenableFuture<V> has been canceled!");
            case 12:
                ((com.facebook.react.animated.a) this.c).k((AbstractC6260oP) this.b);
                return;
            case 13:
                QK0 qk0A = ((MainApplication) ((IJ0) ((RNPushNotificationListenerService) ((G10) this.c).b).getApplication())).a.a();
                ReactContext reactContextF = qk0A.f();
                if (reactContextF != null) {
                    G10.w((G10) this.c, (ReactApplicationContext) reactContextF, (Bundle) this.b);
                    return;
                }
                qk0A.a(new C2107aI0(this, qk0A, 2));
                if (qk0A.s) {
                    return;
                }
                qk0A.d();
                return;
            case 14:
                Activity activity = (Activity) this.b;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
                RNScreenshotPreventModule rNScreenshotPreventModule = (RNScreenshotPreventModule) this.c;
                viewGroup.removeView(rNScreenshotPreventModule.overlayLayout);
                if (rNScreenshotPreventModule.secureFlagWasSet) {
                    activity.getWindow().setFlags(8192, 8192);
                    rNScreenshotPreventModule.secureFlagWasSet = false;
                    return;
                }
                return;
            case 15:
                ((RNSendIntentModule) this.c).reactContext.startActivity((Intent) this.b);
                return;
            case 16:
                HT ht = ((HandlerC3581eR0) this.c).a.q;
                C1109Nz0 c1109Nz0 = (C1109Nz0) this.b;
                c1109Nz0.getClass();
                c1109Nz0.getCause();
                ht.getClass();
                c1109Nz0.getCause();
                return;
            case 17:
                ((C0767Jp) this.c).C((C3959gQ) this.b);
                return;
            case 18:
                a();
                return;
            case 19:
                C7851wk1 c7851wk1 = ((SwipeDismissBehavior) this.c).a;
                if (c7851wk1 == null || !c7851wk1.g()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                ((View) this.b).postOnAnimation(this);
                return;
            case 20:
                ((Activity) this.b).getWindow().setAttributes((WindowManager.LayoutParams) this.c);
                return;
            case 21:
                C2543ca1 c2543ca1 = ((C2353ba1) this.c).c;
                Pair pair = (Pair) this.b;
                AbstractC1516Tf abstractC1516Tf = (AbstractC1516Tf) pair.first;
                RD0 rd0 = (RD0) pair.second;
                c2543ca1.getClass();
                ((C7647vg) rd0).c.a(rd0, "ThrottlingProducer", null);
                c2543ca1.a.a(new C2353ba1(c2543ca1, abstractC1516Tf), rd0);
                return;
            case 22:
                if (((RunnableC0142Bo1) this.c).a.a instanceof S) {
                    return;
                }
                try {
                    C6093nX c6093nX = (C6093nX) ((C8007xZ0) this.b).get();
                    if (c6093nX == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((RunnableC0142Bo1) this.c).c.c + ") but did not provide ForegroundInfo");
                    }
                    TE teG2 = TE.G();
                    int i2 = RunnableC0142Bo1.g;
                    String str = ((RunnableC0142Bo1) this.c).c.c;
                    teG2.getClass();
                    RunnableC0142Bo1 runnableC0142Bo1 = (RunnableC0142Bo1) this.c;
                    C8007xZ0 c8007xZ0 = runnableC0142Bo1.a;
                    C0298Do1 c0298Do1 = runnableC0142Bo1.e;
                    Context context = runnableC0142Bo1.b;
                    UUID id = runnableC0142Bo1.d.getId();
                    c0298Do1.getClass();
                    C8007xZ0 c8007xZ02 = new C8007xZ0();
                    c0298Do1.a.x(new RunnableC0220Co1(c0298Do1, c8007xZ02, id, c6093nX, context, 0));
                    c8007xZ0.l(c8007xZ02);
                    return;
                } catch (Throwable th2) {
                    ((RunnableC0142Bo1) this.c).a.k(th2);
                    return;
                }
            case 23:
                if (((RunnableC3654ep1) this.c).q.a instanceof S) {
                    return;
                }
                try {
                    ((C8007xZ0) this.b).get();
                    TE teG3 = TE.G();
                    int i3 = RunnableC3654ep1.s;
                    String str2 = ((RunnableC3654ep1) this.c).e.c;
                    teG3.getClass();
                    RunnableC3654ep1 runnableC3654ep1 = (RunnableC3654ep1) this.c;
                    runnableC3654ep1.q.l(runnableC3654ep1.f.startWork());
                    return;
                } catch (Throwable th3) {
                    ((RunnableC3654ep1) this.c).q.k(th3);
                    return;
                }
            case 24:
                b();
                return;
            case 25:
                T81 t81 = (T81) this.b;
                try {
                    t81.b(((Callable) this.c).call());
                    return;
                } catch (Exception e5) {
                    t81.a(e5);
                    return;
                }
            case 26:
                ((OQ1) this.b).zzd();
                if (C3759fN.p()) {
                    ((OQ1) this.b).p0().E1(this);
                    return;
                }
                boolean z = ((VA1) this.c).c != 0;
                ((VA1) this.c).c = 0L;
                if (z) {
                    ((VA1) this.c).c();
                    return;
                }
                return;
            case 27:
                C7755wE1 c7755wE1 = (C7755wE1) this.c;
                try {
                    Task task = (Task) c7755wE1.c.then((Task) this.b);
                    if (task == null) {
                        c7755wE1.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    TJ tj = Y81.b;
                    task.e(tj, c7755wE1);
                    task.d(tj, c7755wE1);
                    task.a(tj, c7755wE1);
                    return;
                } catch (C5703lU0 e6) {
                    if (e6.getCause() instanceof Exception) {
                        c7755wE1.d.o((Exception) e6.getCause());
                        return;
                    } else {
                        c7755wE1.d.o(e6);
                        return;
                    }
                } catch (Exception e7) {
                    c7755wE1.d.o(e7);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C6846rT1 c6846rT1 = (C6846rT1) this.b;
                Context context2 = (Context) c6846rT1.b;
                String string = C6846rT1.K(context2).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = C6846rT1.K((Context) c6846rT1.b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                S81 s81 = (S81) this.c;
                if (string == null || DefaultClock.getInstance().currentTimeMillis() > j3) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String strValueOf = String.valueOf(context2.getPackageName());
                            if (strValueOf.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(strValueOf);
                            }
                            throw new SR1("Failed to store the app set ID.");
                        }
                        C6846rT1.L(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context2.getPackageName());
                            if (strValueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(strValueOf2);
                            }
                            throw new SR1("Failed to store the app set ID creation time.");
                        }
                    } catch (SR1 e8) {
                        s81.a(e8);
                        return;
                    }
                } else {
                    try {
                        C6846rT1.L(context2);
                    } catch (SR1 e9) {
                        s81.a(e9);
                        return;
                    }
                }
                s81.b(new P7(string, 1));
                return;
            default:
                C2528cV1 c2528cV1J = RI1.j(((AppMeasurementDynamiteService) this.c).a);
                c2528cV1J.F1(new RunnableC1492Sx(c2528cV1J, c2528cV1J.N1(false), (InterfaceC7377uF1) this.b, 27, false));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return XZ.class.getSimpleName() + StringUtils.COMMA + ((PZ) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ XZ(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public XZ(C6832rP c6832rP) {
        this.a = 3;
        this.c = c6832rP;
        this.b = new C3383dO1(20, false);
    }

    public XZ(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 19;
        this.c = swipeDismissBehavior;
        this.b = view;
    }
}
