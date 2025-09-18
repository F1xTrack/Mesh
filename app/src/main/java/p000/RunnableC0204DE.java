package p000;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.p002ui.DefaultTimeBar;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.views.view.C1932a;
import com.google.android.material.timepicker.C1949e;
import com.google.android.material.timepicker.C1952h;
import com.oblador.keychain.KeychainModule;
import com.p019vk.push.core.remote.config.omicron.C2424c;
import com.p019vk.push.core.remote.config.omicron.OmicronConfig;
import com.p019vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.p019vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

/* renamed from: DE */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0204DE implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1902a;

    /* renamed from: b */
    public final /* synthetic */ Object f1903b;

    public /* synthetic */ RunnableC0204DE(int i, Object obj) {
        this.f1902a = i;
        this.f1903b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f1902a) {
            case 0:
                C0833NE c0833ne = (C0833NE) this.f1903b;
                if (c0833ne.f7635k0 >= 300000) {
                    ((C7862Ko0) c0833ne.f7644s.f3531b).f6309b2 = true;
                    c0833ne.f7635k0 = 0L;
                    return;
                }
                return;
            case 1:
                C6414mF c6414mF = (C6414mF) this.f1903b;
                if (c6414mF.f37587c) {
                    return;
                }
                InterfaceC0715LL interfaceC0715LL = c6414mF.f37586b;
                if (interfaceC0715LL != null) {
                    interfaceC0715LL.mo4951d(c6414mF.f37585a);
                }
                c6414mF.f37588d.f38204m.remove(c6414mF);
                c6414mF.f37587c = true;
                return;
            case 2:
                ((C6288kF) this.f1903b).mo4951d(null);
                return;
            case 3:
                ((T61) this.f1903b).close();
                return;
            case 4:
                C0584JG c0584jg = (C0584JG) this.f1903b;
                c0584jg.f5439j = true;
                c0584jg.m4266a();
                return;
            case 5:
                int i = DefaultTimeBar.f16365N;
                ((DefaultTimeBar) this.f1903b).m10139d(false);
                return;
            case 6:
                ((C0489Hl) this.f1903b).cancel(true);
                return;
            case 7:
                O90.m5968f((DevLoadingModule) this.f1903b, "this$0");
                return;
            case 8:
                C0328FC c0328fc = (C0328FC) this.f1903b;
                O90.m5968f(c0328fc, "this$0");
                c0328fc.f3086a = false;
                return;
            case 9:
                C4237iM c4237iM = (C4237iM) this.f1903b;
                boolean zIsPopupShowing = c4237iM.f29099h.isPopupShowing();
                c4237iM.m19005t(zIsPopupShowing);
                c4237iM.f29104m = zIsPopupShowing;
                return;
            case 10:
                C6421mM c6421mM = (C6421mM) this.f1903b;
                c6421mM.f37644f = true;
                c6421mM.m22808a();
                return;
            case 11:
                C1380Vw c1380Vw = (C1380Vw) ((C6479nH) this.f1903b).f38230d;
                if (c1380Vw != null) {
                    Iterator it = c1380Vw.values().iterator();
                    while (it.hasNext()) {
                        ((R61) it.next()).m6898c();
                    }
                    return;
                }
                return;
            case 12:
                C1932a c1932a = (C1932a) this.f1903b;
                if (c1932a == null) {
                    return;
                }
                ViewParent parent = c1932a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeView(c1932a);
                return;
            case 13:
                ((C6677qO) this.f1903b).m23995b();
                return;
            case 14:
                C4053fR c4053fR = (C4053fR) this.f1903b;
                O90.m5968f(c4053fR, "this$0");
                c4053fR.measure(View.MeasureSpec.makeMeasureSpec(c4053fR.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c4053fR.getHeight(), 1073741824));
                c4053fR.layout(c4053fR.getLeft(), c4053fR.getTop(), c4053fR.getRight(), c4053fR.getBottom());
                return;
            case 15:
                C4247iW c4247iW = (C4247iW) this.f1903b;
                O90.m5968f(c4247iW, "this$0");
                c4247iW.m6864m();
                return;
            case 16:
                ((C8170Qm0) this.f1903b).m6781x();
                return;
            case 17:
                N30 n30 = (N30) this.f1903b;
                O90.m5968f(n30, "this$0");
                n30.m5533I();
                return;
            case 18:
                final InterfaceC6434mZ interfaceC6434mZ = (InterfaceC6434mZ) this.f1903b;
                O90.m5968f(interfaceC6434mZ, "$task");
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: Z50
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        InterfaceC6434mZ interfaceC6434mZ2 = interfaceC6434mZ;
                        O90.m5968f(interfaceC6434mZ2, "$task");
                        interfaceC6434mZ2.invoke();
                        return false;
                    }
                });
                return;
            case 19:
                C10735q60 c10735q60 = (C10735q60) this.f1903b;
                synchronized (c10735q60.f40604u) {
                    try {
                        c10735q60.f40606w = null;
                        InterfaceC9457g70 interfaceC9457g70 = c10735q60.f40605v;
                        if (interfaceC9457g70 != null) {
                            c10735q60.f40605v = null;
                            c10735q60.mo22360e(interfaceC9457g70);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 20:
                ((KeychainModule) this.f1903b).internalWarmingBestCipher();
                return;
            case 21:
                C11965zl0 c11965zl0 = (C11965zl0) this.f1903b;
                O90.m5968f(c11965zl0, "this$0");
                c11965zl0.mo721a(false);
                return;
            case 22:
                AbstractC7745Ih1.m3973b((InputStream) this.f1903b);
                return;
            case 23:
                AbstractC7745Ih1.m3973b((ZipInputStream) this.f1903b);
                return;
            case 24:
                ((C11331um0) this.f1903b).m25235d();
                return;
            case 25:
                Object obj = ((C1949e) this.f1903b).f18403i;
                if (obj instanceof C1952h) {
                    ((C1952h) obj).m11291d();
                    return;
                }
                return;
            case 26:
                C8082Ou0 c8082Ou0 = (C8082Ou0) this.f1903b;
                c8082Ou0.getClass();
                try {
                    c8082Ou0.f8668l = c8082Ou0.f44035a.getNetworkCapabilities(c8082Ou0.f8667k);
                    c8082Ou0.m6183g();
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 27:
                ((DN0) this.f1903b).m1668e();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                C2424c c2424c = (C2424c) this.f1903b;
                C7360Ax0 c7360Ax0 = c2424c.f20541g;
                SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = c7360Ax0.f486c;
                OmicronConfig omicronConfig = c2424c.f47112c;
                long j = omicronConfig.f20511g;
                TimeUnit timeUnit = C7360Ax0.f483g;
                boolean zShouldUpdate = sharedPreferencesUpdateTimetable.shouldUpdate(c2424c.f47113d, j, timeUnit);
                WorkManagerScheduledExecutor workManagerScheduledExecutor = c7360Ax0.f489f;
                if (zShouldUpdate || !workManagerScheduledExecutor.isActive()) {
                    workManagerScheduledExecutor.schedule(new C8450Vw0(2, c2424c), omicronConfig.f20511g, timeUnit);
                    return;
                }
                return;
            default:
                C10050kl1 c10050kl1 = (C10050kl1) this.f1903b;
                c10050kl1.measure(View.MeasureSpec.makeMeasureSpec(c10050kl1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c10050kl1.getHeight(), 1073741824));
                c10050kl1.layout(c10050kl1.getLeft(), c10050kl1.getTop(), c10050kl1.getRight(), c10050kl1.getBottom());
                return;
        }
    }
}
