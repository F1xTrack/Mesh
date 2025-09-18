package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.a;
import com.facebook.react.uimanager.events.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class GR0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ GR0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
        ArrayList arrayList;
        synchronized (((C6045nH) this.b).a) {
            C6045nH c6045nH = (C6045nH) this.b;
            ArrayList arrayList2 = (ArrayList) c6045nH.d;
            arrayList = (ArrayList) c6045nH.c;
            c6045nH.d = arrayList;
            c6045nH.c = arrayList2;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((L) ((InterfaceC5854mH) ((ArrayList) ((C6045nH) this.b).d).get(i))).m();
        }
        ((ArrayList) ((C6045nH) this.b).d).clear();
    }

    private final void c() {
        Set setA;
        ReentrantReadWriteLock.ReadLock lock = ((C2542ca0) this.b).a.h.readLock();
        O90.e(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
            } catch (SQLiteException unused) {
                setA = SN.a;
            } catch (IllegalStateException unused2) {
                setA = SN.a;
            }
            if (((C2542ca0) this.b).a()) {
                if (((C2542ca0) this.b).e.compareAndSet(true, false)) {
                    if (((C2542ca0) this.b).a.g().M().A()) {
                        return;
                    }
                    XY xyM = ((C2542ca0) this.b).a.g().M();
                    xyM.n();
                    try {
                        setA = a();
                        xyM.U();
                        if (setA.isEmpty()) {
                            return;
                        }
                        C2542ca0 c2542ca0 = (C2542ca0) this.b;
                        synchronized (c2542ca0.i) {
                            Iterator it = c2542ca0.i.iterator();
                            while (true) {
                                SU0 su0 = (SU0) it;
                                if (su0.hasNext()) {
                                    ((AbstractC2352ba0) ((Map.Entry) su0.next()).getValue()).a(setA);
                                }
                            }
                        }
                    } finally {
                        xyM.p();
                    }
                }
            }
        } finally {
            lock.unlock();
            ((C2542ca0) this.b).getClass();
        }
    }

    public C6482pZ0 a() {
        C2542ca0 c2542ca0 = (C2542ca0) this.b;
        C6482pZ0 c6482pZ0 = new C6482pZ0();
        Cursor cursorL = c2542ca0.a.l(new C5266jC("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorL.moveToNext()) {
            try {
                c6482pZ0.add(Integer.valueOf(cursorL.getInt(0)));
            } finally {
            }
        }
        AbstractC2141aT1.a(cursorL, null);
        C6482pZ0 c6482pZ0A = AbstractC7627vZ0.a(c6482pZ0);
        if (!c6482pZ0A.a.isEmpty()) {
            if (((C2542ca0) this.b).g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C3414dZ c3414dZ = ((C2542ca0) this.b).g;
            if (c3414dZ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c3414dZ.m();
        }
        return c6482pZ0A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewD;
        int width;
        Object obj;
        switch (this.a) {
            case 0:
                JR0 jr0 = (JR0) this.b;
                jr0.lifecycle.k(jr0);
                return;
            case 1:
                C8096y2 c8096y2 = (C8096y2) this.b;
                while (!c8096y2.e) {
                    try {
                        c8096y2.b((C7906x2) c8096y2.c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            case 2:
                P3 p3 = (P3) this.b;
                if (p3.f) {
                    p3.b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                    p3.e.postDelayed(p3.d, 10000L);
                    return;
                }
                return;
            case 3:
                AppStartTrace appStartTrace = (AppStartTrace) this.b;
                if (appStartTrace.i == null) {
                    appStartTrace.r = true;
                    return;
                }
                return;
            case 4:
                ViewOnTouchListenerC0672Ij0 viewOnTouchListenerC0672Ij0 = (ViewOnTouchListenerC0672Ij0) this.b;
                if (viewOnTouchListenerC0672Ij0.o) {
                    boolean z = viewOnTouchListenerC0672Ij0.m;
                    C4186hc c4186hc = viewOnTouchListenerC0672Ij0.a;
                    if (z) {
                        viewOnTouchListenerC0672Ij0.m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c4186hc.e = jCurrentAnimationTimeMillis;
                        c4186hc.g = -1L;
                        c4186hc.f = jCurrentAnimationTimeMillis;
                        c4186hc.h = 0.5f;
                    }
                    if ((c4186hc.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c4186hc.g + c4186hc.i) || !viewOnTouchListenerC0672Ij0.e()) {
                        viewOnTouchListenerC0672Ij0.o = false;
                        return;
                    }
                    boolean z2 = viewOnTouchListenerC0672Ij0.n;
                    ListView listView = viewOnTouchListenerC0672Ij0.c;
                    if (z2) {
                        viewOnTouchListenerC0672Ij0.n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c4186hc.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = c4186hc.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c4186hc.f;
                    c4186hc.f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0672Ij0.q.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c4186hc.d));
                    WeakHashMap weakHashMap = AbstractC6897rk1.a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                C1447Si c1447Si = (C1447Si) this.b;
                c1447Si.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1447Si.e;
                C7851wk1 c7851wk1 = bottomSheetBehavior.M;
                if (c7851wk1 != null && c7851wk1.g()) {
                    c1447Si.a(c1447Si.b);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.H(c1447Si.b);
                        return;
                    }
                    return;
                }
            case 6:
                ((C0920Lo) this.b).q.g(EnumC0201Ci0.a);
                return;
            case 7:
                MJ0.a().c(4, new ChoreographerFrameCallbackC1636Ut(0, this));
                return;
            case 8:
                ((C2026Zt) this.b).d.e.restartAppInternal(false);
                return;
            case 9:
                C0710Iw c0710Iw = (C0710Iw) this.b;
                if (c0710Iw.a()) {
                    if (new Date(c0710Iw.n.currentTimeMillis()).before(c0710Iw.o.c().b)) {
                        c0710Iw.h();
                        return;
                    }
                    WU wu = (WU) c0710Iw.i;
                    C3892g32 c3892g32E = wu.e();
                    C3892g32 c3892g32D = wu.d();
                    C3892g32 c3892g32H = AbstractC3782fU1.h(c3892g32E, c3892g32D);
                    C4290i9 c4290i9 = new C4290i9(c0710Iw, c3892g32E, c3892g32D, 2);
                    ScheduledExecutorService scheduledExecutorService = c0710Iw.f;
                    C3892g32 c3892g32G = c3892g32H.g(scheduledExecutorService, c4290i9);
                    AbstractC3782fU1.h(c3892g32G).f(scheduledExecutorService, new C0515Gj(c0710Iw, 10, c3892g32G));
                    return;
                }
                return;
            case 10:
                QK0 qk0 = (QK0) this.b;
                UN1.b(qk0.s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                qk0.n();
                return;
            case 11:
                b();
                return;
            case 12:
                UiThreadUtil.assertOnUiThread();
                ((InterfaceC8136yF) this.b).a();
                return;
            case 13:
                g gVar = (g) this.b;
                gVar.mOnDismissListener.onDismiss(gVar.mDialog);
                return;
            case 14:
                Z4 z4 = (Z4) this.b;
                z4.a(true);
                z4.invalidateSelf();
                return;
            case 15:
                DL dl = (DL) this.b;
                int i = dl.b.o;
                int i2 = dl.a;
                boolean z3 = i2 == 3;
                EL el = dl.d;
                if (z3) {
                    viewD = el.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i;
                } else {
                    viewD = el.d(5);
                    width = el.getWidth() - i;
                }
                if (viewD != null) {
                    if (((!z3 || viewD.getLeft() >= width) && (z3 || viewD.getLeft() <= width)) || el.g(viewD) != 0) {
                        return;
                    }
                    BL bl = (BL) viewD.getLayoutParams();
                    dl.b.r(viewD, width, viewD.getTop());
                    bl.c = true;
                    el.invalidate();
                    View viewD2 = el.d(i2 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        el.b(viewD2);
                    }
                    if (el.r) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = el.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        el.getChildAt(i3).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    el.r = true;
                    return;
                }
                return;
            case 16:
                C2118aM c2118aM = (C2118aM) this.b;
                c2118aM.l = null;
                c2118aM.drawableStateChanged();
                return;
            case 17:
                ChoreographerFrameCallbackC7786wP choreographerFrameCallbackC7786wP = (ChoreographerFrameCallbackC7786wP) this.b;
                if (choreographerFrameCallbackC7786wP.b) {
                    return;
                }
                choreographerFrameCallbackC7786wP.b = true;
                if (ReactFeatureFlags.enableFabricRendererExclusively) {
                    return;
                }
                MJ0.a().c(4, ((a) choreographerFrameCallbackC7786wP.d).j);
                return;
            case 18:
                b bVar = (b) this.b;
                bVar.getClass();
                UiThreadUtil.assertOnUiThread();
                bVar.e.c = true;
                return;
            case 19:
                ChoreographerFrameCallbackC7786wP choreographerFrameCallbackC7786wP2 = (ChoreographerFrameCallbackC7786wP) this.b;
                if (choreographerFrameCallbackC7786wP2.b) {
                    return;
                }
                choreographerFrameCallbackC7786wP2.b = true;
                MJ0.a().c(4, ((b) choreographerFrameCallbackC7786wP2.d).e);
                return;
            case 20:
                FS fs = (FS) this.b;
                int i4 = fs.A;
                ValueAnimator valueAnimator = fs.z;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                fs.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 21:
                CU cu = (CU) this.b;
                Context context = cu.getContext();
                if (context == null) {
                    return;
                }
                cu.c.g(1);
                cu.c.f(context.getString(R.string.fingerprint_dialog_touch_sensor));
                return;
            case 22:
                ((f) this.b).d();
                return;
            case 23:
                ((o) this.b).x(true);
                return;
            case 24:
                ((InterfaceFutureC0750Jj0) this.b).cancel(true);
                return;
            case 25:
                C1857Xo1 c1857Xo1 = (C1857Xo1) this.b;
                if (((B20) c1857Xo1.d).a.getAndSet(null) != null) {
                    ((Handler) c1857Xo1.b).removeCallbacks((B20) c1857Xo1.d);
                    return;
                }
                return;
            case 26:
                O80 o80 = (O80) this.b;
                o80.getClass();
                o80.j();
                return;
            case 27:
                c();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C8227yj0 c8227yj0 = (C8227yj0) this.b;
                c8227yj0.b = null;
                c8227yj0.a = null;
                return;
            default:
                synchronized (((androidx.lifecycle.b) this.b).a) {
                    obj = ((androidx.lifecycle.b) this.b).f;
                    ((androidx.lifecycle.b) this.b).f = androidx.lifecycle.b.k;
                }
                ((androidx.lifecycle.b) this.b).j(obj);
                return;
        }
    }
}
