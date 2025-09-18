package p000;

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
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.burnweb.rnsendintent.RNSendIntentModule;
import com.dieam.reactnativepushnotification.modules.RNPushNotificationListenerService;
import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
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

/* renamed from: XZ */
/* loaded from: classes.dex */
public final class RunnableC1483XZ implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f13849a;

    /* renamed from: b */
    public final Object f13850b;

    /* renamed from: c */
    public final Object f13851c;

    public /* synthetic */ RunnableC1483XZ(Object obj, int i, Object obj2) {
        this.f13849a = i;
        this.f13850b = obj;
        this.f13851c = obj2;
    }

    /* renamed from: a */
    private final void m9083a() {
        try {
            ((Runnable) this.f13851c).run();
            synchronized (((ExecutorC6865t6) this.f13850b).f42834d) {
                ((ExecutorC6865t6) this.f13850b).m24838c();
            }
        } catch (Throwable th) {
            synchronized (((ExecutorC6865t6) this.f13850b).f42834d) {
                ((ExecutorC6865t6) this.f13850b).m24838c();
                throw th;
            }
        }
    }

    /* renamed from: b */
    private final void m9084b() {
        synchronized (((C11218tt1) this.f13851c).f43402c) {
            ((InterfaceC8244Rx0) ((C11218tt1) this.f13851c).f43403d).onFailure(((C8499Wu1) this.f13850b).mo8874d());
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws ExecutionException, SR1 {
        InterfaceC7346Aq0 interfaceC7346Aq0;
        Iterator it;
        float f;
        View view = null;
        switch (this.f13849a) {
            case 0:
                InterfaceC0980PZ interfaceC0980PZ = (InterfaceC0980PZ) this.f13851c;
                try {
                    interfaceC0980PZ.onSuccess(AbstractC8301Sz1.m7482e((InterfaceFutureC7800Jj0) this.f13850b));
                    return;
                } catch (Error e) {
                    e = e;
                    interfaceC0980PZ.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    interfaceC0980PZ.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    if (cause == null) {
                        interfaceC0980PZ.onFailure(e3);
                        return;
                    } else {
                        interfaceC0980PZ.onFailure(cause);
                        return;
                    }
                }
            case 1:
                C6527o2 c6527o2 = (C6527o2) this.f13851c;
                MenuC7450Cq0 menuC7450Cq0 = c6527o2.f38692c;
                if (menuC7450Cq0 != null && (interfaceC7346Aq0 = menuC7450Cq0.f1706e) != null) {
                    interfaceC7346Aq0.mo347k(menuC7450Cq0);
                }
                View view2 = (View) c6527o2.f38697h;
                if (view2 != null && view2.getWindowToken() != null) {
                    C6338l2 c6338l2 = (C6338l2) this.f13850b;
                    if (c6338l2.m7121b()) {
                        c6527o2.f38708s = c6338l2;
                    } else if (c6338l2.f10449e != null) {
                        c6338l2.m7123d(0, 0, false, false);
                        c6527o2.f38708s = c6338l2;
                    }
                }
                c6527o2.f38710u = null;
                return;
            case 2:
                ((Application) this.f13850b).unregisterActivityLifecycleCallbacks((C0318F2) this.f13851c);
                return;
            case 3:
                CA0 ca0M17563C = ((C9108dO1) this.f13850b).m17563C();
                if (ca0M17563C == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((C6741rP) this.f13851c).m24328c(ca0M17563C);
                return;
            case 4:
                EQ1 eq1 = (EQ1) ((C11287uQ0) this.f13850b).f43693a;
                if (eq1 != null) {
                    eq1.mo2268d((Typeface) this.f13851c);
                    return;
                }
                return;
            case 5:
                CodePushNativeModule codePushNativeModule = (CodePushNativeModule) this.f13851c;
                try {
                    QK0 qk0 = (QK0) this.f13850b;
                    UN1.m7998b(qk0.f9583s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                    qk0.m6643n();
                    codePushNativeModule.mCodePush.m6468e();
                    return;
                } catch (Exception unused) {
                    codePushNativeModule.loadBundleLegacy();
                    return;
                }
            case 6:
                ArrayList arrayList = (ArrayList) this.f13850b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C1463XF c1463xf = (C1463XF) this.f13851c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1463xf.f13641n.remove(arrayList);
                        return;
                    }
                    C1337VF c1337vf = (C1337VF) it2.next();
                    c1463xf.getClass();
                    OO0 oo0 = c1337vf.f12460a;
                    View view3 = oo0 == null ? view : oo0.f8408a;
                    OO0 oo02 = c1337vf.f12461b;
                    View view4 = oo02 != null ? oo02.f8408a : view;
                    ArrayList arrayList2 = c1463xf.f13645r;
                    long j = c1463xf.f44852f;
                    if (view3 != null) {
                        ViewPropertyAnimator duration = view3.animate().setDuration(j);
                        arrayList2.add(c1337vf.f12460a);
                        duration.translationX(c1337vf.f12464e - c1337vf.f12462c);
                        duration.translationY(c1337vf.f12465f - c1337vf.f12463d);
                        it = it2;
                        f = 0.0f;
                        duration.alpha(0.0f).setListener(new C1274UF(c1463xf, c1337vf, duration, view3, 0)).start();
                    } else {
                        it = it2;
                        f = 0.0f;
                    }
                    if (view4 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view4.animate();
                        arrayList2.add(c1337vf.f12461b);
                        viewPropertyAnimatorAnimate.translationX(f).translationY(f).setDuration(j).alpha(1.0f).setListener(new C1274UF(c1463xf, c1337vf, viewPropertyAnimatorAnimate, view4, 1)).start();
                    }
                    it2 = it;
                    view = null;
                }
            case 7:
                C1210TE c1210teM7634G = C1210TE.m7634G();
                int i = C7191yH.f46163d;
                C8383Uo1 c8383Uo1 = (C8383Uo1) this.f13850b;
                c1210teM7634G.getClass();
                ((C7191yH) this.f13851c).f46164a.mo8316e(c8383Uo1);
                return;
            case 8:
                J11 j11 = (J11) this.f13850b;
                j11.f5261a.m2490a();
                synchronized (j11.f5262b) {
                    synchronized (((C0466HO) this.f13851c)) {
                        try {
                            C0403GO c0403go = ((C0466HO) this.f13851c).f4256a;
                            J11 j112 = (J11) this.f13850b;
                            c0403go.getClass();
                            if (c0403go.f3728a.contains(new C0340FO(j112, AbstractC11984zu1.f47093c))) {
                                ((C0466HO) this.f13851c).f4277v.m4303b();
                                C0466HO c0466ho = (C0466HO) this.f13851c;
                                J11 j113 = (J11) this.f13850b;
                                c0466ho.getClass();
                                try {
                                    j113.m4127l(c0466ho.f4277v, c0466ho.f4273r, c0466ho.f4280y);
                                    ((C0466HO) this.f13851c).m3397j((J11) this.f13850b);
                                } catch (Throwable th) {
                                    throw new C0174Cl(th);
                                }
                            }
                            ((C0466HO) this.f13851c).m3391d();
                        } finally {
                        }
                    }
                }
                return;
            case 9:
                ComponentCallbacks2C1874a componentCallbacks2C1874aM10883a = ComponentCallbacks2C1874a.m10883a(((Activity) this.f13850b).getApplicationContext());
                componentCallbacks2C1874aM10883a.getClass();
                AbstractC7381Bh1.m802a();
                componentCallbacks2C1874aM10883a.f17775c.m26538g(0L);
                componentCallbacks2C1874aM10883a.f17774b.mo322r();
                componentCallbacks2C1874aM10883a.f17777e.m26539a();
                ((Promise) this.f13851c).resolve(null);
                return;
            case 10:
                ((C0619Jp) this.f13850b).m4423C((C11747y20) this.f13851c);
                return;
            case 11:
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = (InterfaceFutureC7800Jj0) this.f13850b;
                if (!interfaceFutureC7800Jj0.isCancelled()) {
                    RU0 ru0 = (RU0) this.f13851c;
                    InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) ru0.f10201a.getContext().mo937g(C7564Ev0.f2962e);
                    if (interfaceC8044Ob0 != null ? interfaceC8044Ob0.isActive() : true) {
                        try {
                            ru0.resumeWith(interfaceFutureC7800Jj0.get());
                            return;
                        } catch (ExecutionException e4) {
                            Throwable cause2 = e4.getCause();
                            if (cause2 == null) {
                                throw e4;
                            }
                            ru0.resumeWith(RQ1.m7015b(cause2));
                            return;
                        }
                    }
                }
                throw new CancellationException("ListenableFuture<V> has been canceled!");
            case 12:
                ((C1881a) this.f13851c).m10934k((AbstractC6550oP) this.f13850b);
                return;
            case 13:
                QK0 qk0M6302a = ((MainApplication) ((IJ0) ((RNPushNotificationListenerService) ((G10) this.f13851c).f3531b).getApplication())).f41951a.m6302a();
                ReactContext reactContextM6636f = qk0M6302a.m6636f();
                if (reactContextM6636f != null) {
                    G10.m2882w((G10) this.f13851c, (ReactApplicationContext) reactContextM6636f, (Bundle) this.f13850b);
                    return;
                }
                qk0M6302a.m6632a(new C8706aI0(this, qk0M6302a, 2));
                if (qk0M6302a.f9583s) {
                    return;
                }
                qk0M6302a.m6635d();
                return;
            case 14:
                Activity activity = (Activity) this.f13850b;
                ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
                RNScreenshotPreventModule rNScreenshotPreventModule = (RNScreenshotPreventModule) this.f13851c;
                viewGroup.removeView(rNScreenshotPreventModule.overlayLayout);
                if (rNScreenshotPreventModule.secureFlagWasSet) {
                    activity.getWindow().setFlags(8192, 8192);
                    rNScreenshotPreventModule.secureFlagWasSet = false;
                    return;
                }
                return;
            case 15:
                ((RNSendIntentModule) this.f13851c).reactContext.startActivity((Intent) this.f13850b);
                return;
            case 16:
                C0471HT c0471ht = ((HandlerC9241eR0) this.f13851c).f26709a.f45950q;
                C8040Nz0 c8040Nz0 = (C8040Nz0) this.f13850b;
                c8040Nz0.getClass();
                c8040Nz0.getCause();
                c0471ht.getClass();
                c8040Nz0.getCause();
                return;
            case 17:
                ((C0619Jp) this.f13851c).m4423C((C4115gQ) this.f13850b);
                return;
            case 18:
                m9083a();
                return;
            case 19:
                C11583wk1 c11583wk1 = ((SwipeDismissBehavior) this.f13851c).f18083a;
                if (c11583wk1 == null || !c11583wk1.m25681g()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                ((View) this.f13850b).postOnAnimation(this);
                return;
            case 20:
                ((Activity) this.f13850b).getWindow().setAttributes((WindowManager.LayoutParams) this.f13851c);
                return;
            case 21:
                C8999ca1 c8999ca1 = ((C8871ba1) this.f13851c).f17077c;
                Pair pair = (Pair) this.f13850b;
                AbstractC1237Tf abstractC1237Tf = (AbstractC1237Tf) pair.first;
                RD0 rd0 = (RD0) pair.second;
                c8999ca1.getClass();
                ((C7027vg) rd0).f44475c.mo743a(rd0, "ThrottlingProducer", null);
                c8999ca1.f17627a.mo312a(new C8871ba1(c8999ca1, abstractC1237Tf), rd0);
                return;
            case 22:
                if (((RunnableC7395Bo1) this.f13851c).f1036a.f37381a instanceof C1132S) {
                    return;
                }
                try {
                    C6495nX c6495nX = (C6495nX) ((C11687xZ0) this.f13850b).get();
                    if (c6495nX == null) {
                        throw new IllegalStateException("Worker was marked important (" + ((RunnableC7395Bo1) this.f13851c).f1038c.f12136c + ") but did not provide ForegroundInfo");
                    }
                    C1210TE c1210teM7634G2 = C1210TE.m7634G();
                    int i2 = RunnableC7395Bo1.f1035g;
                    String str = ((RunnableC7395Bo1) this.f13851c).f1038c.f12136c;
                    c1210teM7634G2.getClass();
                    RunnableC7395Bo1 runnableC7395Bo1 = (RunnableC7395Bo1) this.f13851c;
                    C11687xZ0 c11687xZ0 = runnableC7395Bo1.f1036a;
                    C7499Do1 c7499Do1 = runnableC7395Bo1.f1040e;
                    Context context = runnableC7395Bo1.f1037b;
                    UUID id = runnableC7395Bo1.f1039d.getId();
                    c7499Do1.getClass();
                    C11687xZ0 c11687xZ02 = new C11687xZ0();
                    c7499Do1.f2256a.m9154x(new RunnableC7447Co1(c7499Do1, c11687xZ02, id, c6495nX, context, 0));
                    c11687xZ0.m25923l(c11687xZ02);
                    return;
                } catch (Throwable th2) {
                    ((RunnableC7395Bo1) this.f13851c).f1036a.m25922k(th2);
                    return;
                }
            case 23:
                if (((RunnableC9290ep1) this.f13851c).f26907q.f37381a instanceof C1132S) {
                    return;
                }
                try {
                    ((C11687xZ0) this.f13850b).get();
                    C1210TE c1210teM7634G3 = C1210TE.m7634G();
                    int i3 = RunnableC9290ep1.f26890s;
                    String str2 = ((RunnableC9290ep1) this.f13851c).f26895e.f12136c;
                    c1210teM7634G3.getClass();
                    RunnableC9290ep1 runnableC9290ep1 = (RunnableC9290ep1) this.f13851c;
                    runnableC9290ep1.f26907q.m25923l(runnableC9290ep1.f26896f.startWork());
                    return;
                } catch (Throwable th3) {
                    ((RunnableC9290ep1) this.f13851c).f26907q.m25922k(th3);
                    return;
                }
            case 24:
                m9084b();
                return;
            case 25:
                T81 t81 = (T81) this.f13850b;
                try {
                    t81.m7577b(((Callable) this.f13851c).call());
                    return;
                } catch (Exception e5) {
                    t81.m7576a(e5);
                    return;
                }
            case 26:
                ((OQ1) this.f13850b).zzd();
                if (C4049fN.m18225p()) {
                    ((OQ1) this.f13850b).mo6071p0().m25412E1(this);
                    return;
                }
                boolean z = ((VA1) this.f13851c).f12396c != 0;
                ((VA1) this.f13851c).f12396c = 0L;
                if (z) {
                    ((VA1) this.f13851c).mo185c();
                    return;
                }
                return;
            case 27:
                C11519wE1 c11519wE1 = (C11519wE1) this.f13851c;
                try {
                    Task task = (Task) c11519wE1.f44723c.then((Task) this.f13850b);
                    if (task == null) {
                        c11519wE1.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC1215TJ executorC1215TJ = Y81.f14172b;
                    task.mo11138e(executorC1215TJ, c11519wE1);
                    task.mo11137d(executorC1215TJ, c11519wE1);
                    task.mo11134a(executorC1215TJ, c11519wE1);
                    return;
                } catch (C10143lU0 e6) {
                    if (e6.getCause() instanceof Exception) {
                        c11519wE1.f44724d.m18388o((Exception) e6.getCause());
                        return;
                    } else {
                        c11519wE1.f44724d.m18388o(e6);
                        return;
                    }
                } catch (Exception e7) {
                    c11519wE1.f44724d.m18388o(e7);
                    return;
                }
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C10910rT1 c10910rT1 = (C10910rT1) this.f13850b;
                Context context2 = (Context) c10910rT1.f41678b;
                String string = C10910rT1.m24364K(context2).getString(CommonUrlParts.APP_SET_ID, null);
                long j2 = C10910rT1.m24364K((Context) c10910rT1.f41678b).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? 33696000000L + j2 : -1L;
                S81 s81 = (S81) this.f13851c;
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
                        C10910rT1.m24365L(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", DefaultClock.getInstance().currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context2.getPackageName());
                            if (strValueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(strValueOf2);
                            }
                            throw new SR1("Failed to store the app set ID creation time.");
                        }
                    } catch (SR1 e8) {
                        s81.m7183a(e8);
                        return;
                    }
                } else {
                    try {
                        C10910rT1.m24365L(context2);
                    } catch (SR1 e9) {
                        s81.m7183a(e9);
                        return;
                    }
                }
                s81.m7184b(new C0952P7(string, 1));
                return;
            default:
                C8989cV1 c8989cV1M6946j = RI1.m6946j(((AppMeasurementDynamiteService) this.f13851c).f18050a);
                c8989cV1M6946j.m10744F1(new RunnableC1192Sx(c8989cV1M6946j, c8989cV1M6946j.m10752N1(false), (InterfaceC11266uF1) this.f13850b, 27, false));
                return;
        }
    }

    public String toString() {
        switch (this.f13849a) {
            case 0:
                return RunnableC1483XZ.class.getSimpleName() + StringUtils.COMMA + ((InterfaceC0980PZ) this.f13851c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC1483XZ(Object obj, Object obj2, boolean z, int i) {
        this.f13849a = i;
        this.f13851c = obj;
        this.f13850b = obj2;
    }

    public RunnableC1483XZ(C6741rP c6741rP) {
        this.f13849a = 3;
        this.f13851c = c6741rP;
        this.f13850b = new C9108dO1(20, false);
    }

    public RunnableC1483XZ(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f13849a = 19;
        this.f13851c = swipeDismissBehavior;
        this.f13850b = view;
    }
}
