package p000;

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
import androidx.fragment.app.AbstractC1733o;
import androidx.fragment.app.C1724f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;
import androidx.lifecycle.AbstractC1743b;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.events.C1930a;
import com.facebook.react.uimanager.events.C1931b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.perf.metrics.AppStartTrace;
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

    /* renamed from: a */
    public final /* synthetic */ int f3737a;

    /* renamed from: b */
    public final Object f3738b;

    public /* synthetic */ GR0(int i, Object obj) {
        this.f3737a = i;
        this.f3738b = obj;
    }

    /* renamed from: b */
    private final void m3061b() {
        ArrayList arrayList;
        synchronized (((C6479nH) this.f3738b).f38227a) {
            C6479nH c6479nH = (C6479nH) this.f3738b;
            ArrayList arrayList2 = (ArrayList) c6479nH.f38230d;
            arrayList = (ArrayList) c6479nH.f38229c;
            c6479nH.f38230d = arrayList;
            c6479nH.f38229c = arrayList2;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0693L) ((InterfaceC6416mH) ((ArrayList) ((C6479nH) this.f3738b).f38230d).get(i))).m4815m();
        }
        ((ArrayList) ((C6479nH) this.f3738b).f38230d).clear();
    }

    /* renamed from: c */
    private final void m3062c() {
        Set setM3063a;
        ReentrantReadWriteLock.ReadLock lock = ((C8998ca0) this.f3738b).f17615a.f40100h.readLock();
        O90.m5967e(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
            } catch (SQLiteException unused) {
                setM3063a = C1156SN.f10705a;
            } catch (IllegalStateException unused2) {
                setM3063a = C1156SN.f10705a;
            }
            if (((C8998ca0) this.f3738b).m10791a()) {
                if (((C8998ca0) this.f3738b).f17619e.compareAndSet(true, false)) {
                    if (((C8998ca0) this.f3738b).f17615a.m23794g().mo1557M().m9072A()) {
                        return;
                    }
                    C1482XY c1482xyMo1557M = ((C8998ca0) this.f3738b).f17615a.m23794g().mo1557M();
                    c1482xyMo1557M.m9078n();
                    try {
                        setM3063a = m3063a();
                        c1482xyMo1557M.m9076U();
                        if (setM3063a.isEmpty()) {
                            return;
                        }
                        C8998ca0 c8998ca0 = (C8998ca0) this.f3738b;
                        synchronized (c8998ca0.f17623i) {
                            Iterator it = c8998ca0.f17623i.iterator();
                            while (true) {
                                SU0 su0 = (SU0) it;
                                if (su0.hasNext()) {
                                    ((AbstractC8870ba0) ((Map.Entry) su0.next()).getValue()).m10461a(setM3063a);
                                }
                            }
                        }
                    } finally {
                        c1482xyMo1557M.m9080p();
                    }
                }
            }
        } finally {
            lock.unlock();
            ((C8998ca0) this.f3738b).getClass();
        }
    }

    /* renamed from: a */
    public C10665pZ0 m3063a() {
        C8998ca0 c8998ca0 = (C8998ca0) this.f3738b;
        C10665pZ0 c10665pZ0 = new C10665pZ0();
        Cursor cursorM23797l = c8998ca0.f17615a.m23797l(new C6222jC("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorM23797l.moveToNext()) {
            try {
                c10665pZ0.add(Integer.valueOf(cursorM23797l.getInt(0)));
            } finally {
            }
        }
        AbstractC8729aT1.m9749a(cursorM23797l, null);
        C10665pZ0 c10665pZ0M25450a = AbstractC11433vZ0.m25450a(c10665pZ0);
        if (!c10665pZ0M25450a.f40209a.isEmpty()) {
            if (((C8998ca0) this.f3738b).f17621g == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C3936dZ c3936dZ = ((C8998ca0) this.f3738b).f17621g;
            if (c3936dZ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c3936dZ.m17710m();
        }
        return c10665pZ0M25450a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewM2151d;
        int width;
        Object obj;
        switch (this.f3737a) {
            case 0:
                JR0 jr0 = (JR0) this.f3738b;
                jr0.lifecycle.mo1844k(jr0);
                return;
            case 1:
                C7176y2 c7176y2 = (C7176y2) this.f3738b;
                while (!c7176y2.f46042e) {
                    try {
                        c7176y2.m26035b((C7113x2) c7176y2.f46040c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                return;
            case 2:
                C0948P3 c0948p3 = (C0948P3) this.f3738b;
                if (c0948p3.f8809f) {
                    c0948p3.f8805b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                    c0948p3.f8808e.postDelayed(c0948p3.f8807d, 10000L);
                    return;
                }
                return;
            case 3:
                AppStartTrace appStartTrace = (AppStartTrace) this.f3738b;
                if (appStartTrace.f18492i == null) {
                    appStartTrace.f18501r = true;
                    return;
                }
                return;
            case 4:
                ViewOnTouchListenerC7748Ij0 viewOnTouchListenerC7748Ij0 = (ViewOnTouchListenerC7748Ij0) this.f3738b;
                if (viewOnTouchListenerC7748Ij0.f5110o) {
                    boolean z = viewOnTouchListenerC7748Ij0.f5108m;
                    C4190hc c4190hc = viewOnTouchListenerC7748Ij0.f5096a;
                    if (z) {
                        viewOnTouchListenerC7748Ij0.f5108m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c4190hc.f28476e = jCurrentAnimationTimeMillis;
                        c4190hc.f28478g = -1L;
                        c4190hc.f28477f = jCurrentAnimationTimeMillis;
                        c4190hc.f28479h = 0.5f;
                    }
                    if ((c4190hc.f28478g > 0 && AnimationUtils.currentAnimationTimeMillis() > c4190hc.f28478g + c4190hc.f28480i) || !viewOnTouchListenerC7748Ij0.m3980e()) {
                        viewOnTouchListenerC7748Ij0.f5110o = false;
                        return;
                    }
                    boolean z2 = viewOnTouchListenerC7748Ij0.f5109n;
                    ListView listView = viewOnTouchListenerC7748Ij0.f5098c;
                    if (z2) {
                        viewOnTouchListenerC7748Ij0.f5109n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c4190hc.f28477f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM18841a = c4190hc.m18841a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - c4190hc.f28477f;
                    c4190hc.f28477f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC7748Ij0.f5112q.scrollListBy((int) (j * ((fM18841a * 4.0f) + ((-4.0f) * fM18841a * fM18841a)) * c4190hc.f28475d));
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                C1177Si c1177Si = (C1177Si) this.f3738b;
                c1177Si.f10914c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1177Si.f10916e;
                C11583wk1 c11583wk1 = bottomSheetBehavior.f18102M;
                if (c11583wk1 != null && c11583wk1.m25681g()) {
                    c1177Si.m7419a(c1177Si.f10913b);
                    return;
                } else {
                    if (bottomSheetBehavior.f18101L == 2) {
                        bottomSheetBehavior.m11198H(c1177Si.f10913b);
                        return;
                    }
                    return;
                }
            case 6:
                ((C0743Lo) this.f3738b).f6872q.m10128g(EnumC7434Ci0.f1586a);
                return;
            case 7:
                MJ0.m5303a().m5305c(4, new ChoreographerFrameCallbackC1314Ut(0, this));
                return;
            case 8:
                ((C1629Zt) this.f3738b).f15196d.f16652e.restartAppInternal(false);
                return;
            case 9:
                C0563Iw c0563Iw = (C0563Iw) this.f3738b;
                if (c0563Iw.m4077a()) {
                    if (new Date(c0563Iw.f5223n.currentTimeMillis()).before(c0563Iw.f5224o.m5909c().f7407b)) {
                        c0563Iw.m4081h();
                        return;
                    }
                    C1415WU c1415wu = (C1415WU) c0563Iw.f5218i;
                    C9450g32 c9450g32M8790e = c1415wu.m8790e();
                    C9450g32 c9450g32M8789d = c1415wu.m8789d();
                    C9450g32 c9450g32M18247h = AbstractC9376fU1.m18247h(c9450g32M8790e, c9450g32M8789d);
                    C4224i9 c4224i9 = new C4224i9(c0563Iw, c9450g32M8790e, c9450g32M8789d, 2);
                    ScheduledExecutorService scheduledExecutorService = c0563Iw.f5215f;
                    C9450g32 c9450g32Mo11140g = c9450g32M18247h.mo11140g(scheduledExecutorService, c4224i9);
                    AbstractC9376fU1.m18247h(c9450g32Mo11140g).mo11139f(scheduledExecutorService, new C0424Gj(c0563Iw, 10, c9450g32Mo11140g));
                    return;
                }
                return;
            case 10:
                QK0 qk0 = (QK0) this.f3738b;
                UN1.m7998b(qk0.f9583s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
                qk0.m6643n();
                return;
            case 11:
                m3061b();
                return;
            case 12:
                UiThreadUtil.assertOnUiThread();
                ((InterfaceC7189yF) this.f3738b).mo5330a();
                return;
            case 13:
                DialogInterfaceOnCancelListenerC1725g dialogInterfaceOnCancelListenerC1725g = (DialogInterfaceOnCancelListenerC1725g) this.f3738b;
                dialogInterfaceOnCancelListenerC1725g.mOnDismissListener.onDismiss(dialogInterfaceOnCancelListenerC1725g.mDialog);
                return;
            case 14:
                C1578Z4 c1578z4 = (C1578Z4) this.f3738b;
                c1578z4.m9464a(true);
                c1578z4.invalidateSelf();
                return;
            case 15:
                C0211DL c0211dl = (C0211DL) this.f3738b;
                int i = c0211dl.f1973b.f45068o;
                int i2 = c0211dl.f1972a;
                boolean z3 = i2 == 3;
                AbstractC0274EL abstractC0274EL = c0211dl.f1975d;
                if (z3) {
                    viewM2151d = abstractC0274EL.m2151d(3);
                    width = (viewM2151d != null ? -viewM2151d.getWidth() : 0) + i;
                } else {
                    viewM2151d = abstractC0274EL.m2151d(5);
                    width = abstractC0274EL.getWidth() - i;
                }
                if (viewM2151d != null) {
                    if (((!z3 || viewM2151d.getLeft() >= width) && (z3 || viewM2151d.getLeft() <= width)) || abstractC0274EL.m2154g(viewM2151d) != 0) {
                        return;
                    }
                    C0085BL c0085bl = (C0085BL) viewM2151d.getLayoutParams();
                    c0211dl.f1973b.m25692r(viewM2151d, width, viewM2151d.getTop());
                    c0085bl.f758c = true;
                    abstractC0274EL.invalidate();
                    View viewM2151d2 = abstractC0274EL.m2151d(i2 == 3 ? 5 : 3);
                    if (viewM2151d2 != null) {
                        abstractC0274EL.m2149b(viewM2151d2);
                    }
                    if (abstractC0274EL.f2633r) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = abstractC0274EL.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        abstractC0274EL.getChildAt(i3).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    abstractC0274EL.f2633r = true;
                    return;
                }
                return;
            case 16:
                C1659aM c1659aM = (C1659aM) this.f3738b;
                c1659aM.f15478l = null;
                c1659aM.drawableStateChanged();
                return;
            case 17:
                ChoreographerFrameCallbackC7073wP choreographerFrameCallbackC7073wP = (ChoreographerFrameCallbackC7073wP) this.f3738b;
                if (choreographerFrameCallbackC7073wP.f44856b) {
                    return;
                }
                choreographerFrameCallbackC7073wP.f44856b = true;
                if (ReactFeatureFlags.enableFabricRendererExclusively) {
                    return;
                }
                MJ0.m5303a().m5305c(4, ((C1930a) choreographerFrameCallbackC7073wP.f44858d).f17950j);
                return;
            case 18:
                C1931b c1931b = (C1931b) this.f3738b;
                c1931b.getClass();
                UiThreadUtil.assertOnUiThread();
                c1931b.f17961e.f44857c = true;
                return;
            case 19:
                ChoreographerFrameCallbackC7073wP choreographerFrameCallbackC7073wP2 = (ChoreographerFrameCallbackC7073wP) this.f3738b;
                if (choreographerFrameCallbackC7073wP2.f44856b) {
                    return;
                }
                choreographerFrameCallbackC7073wP2.f44856b = true;
                MJ0.m5303a().m5305c(4, ((C1931b) choreographerFrameCallbackC7073wP2.f44858d).f17961e);
                return;
            case 20:
                C0344FS c0344fs = (C0344FS) this.f3738b;
                int i4 = c0344fs.f3228A;
                ValueAnimator valueAnimator = c0344fs.f3255z;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                c0344fs.f3228A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 21:
                C0157CU c0157cu = (C0157CU) this.f3738b;
                Context context = c0157cu.getContext();
                if (context == null) {
                    return;
                }
                c0157cu.f1394c.m6416g(1);
                c0157cu.f1394c.m6415f(context.getString(R.string.fingerprint_dialog_touch_sensor));
                return;
            case 22:
                ((C1724f) this.f3738b).m10027d();
                return;
            case 23:
                ((AbstractC1733o) this.f3738b).m10088x(true);
                return;
            case 24:
                ((InterfaceFutureC7800Jj0) this.f3738b).cancel(true);
                return;
            case 25:
                C8539Xo1 c8539Xo1 = (C8539Xo1) this.f3738b;
                if (((B20) c8539Xo1.f13983d).f522a.getAndSet(null) != null) {
                    ((Handler) c8539Xo1.f13981b).removeCallbacks((B20) c8539Xo1.f13983d);
                    return;
                }
                return;
            case 26:
                O80 o80 = (O80) this.f3738b;
                o80.getClass();
                o80.m5960j();
                return;
            case 27:
                m3062c();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C11834yj0 c11834yj0 = (C11834yj0) this.f3738b;
                c11834yj0.f46427b = null;
                c11834yj0.f46426a = null;
                return;
            default:
                synchronized (((AbstractC1743b) this.f3738b).f16316a) {
                    obj = ((AbstractC1743b) this.f3738b).f16321f;
                    ((AbstractC1743b) this.f3738b).f16321f = AbstractC1743b.f16315k;
                }
                ((AbstractC1743b) this.f3738b).mo2439j(obj);
                return;
        }
    }
}
