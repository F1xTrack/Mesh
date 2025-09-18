package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.ui.DefaultTimeBar;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.views.view.a;
import com.google.android.material.timepicker.e;
import com.google.android.material.timepicker.h;
import com.oblador.keychain.KeychainModule;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.c;
import com.vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class DE implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DE(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                NE ne = (NE) this.b;
                if (ne.k0 >= 300000) {
                    ((C0843Ko0) ne.s.b).b2 = true;
                    ne.k0 = 0L;
                    return;
                }
                return;
            case 1:
                C5848mF c5848mF = (C5848mF) this.b;
                if (c5848mF.c) {
                    return;
                }
                LL ll = c5848mF.b;
                if (ll != null) {
                    ll.d(c5848mF.a);
                }
                c5848mF.d.m.remove(c5848mF);
                c5848mF.c = true;
                return;
            case 2:
                ((C5466kF) this.b).d(null);
                return;
            case 3:
                ((T61) this.b).close();
                return;
            case 4:
                JG jg = (JG) this.b;
                jg.j = true;
                jg.a();
                return;
            case 5:
                int i = DefaultTimeBar.N;
                ((DefaultTimeBar) this.b).d(false);
                return;
            case 6:
                ((C0599Hl) this.b).cancel(true);
                return;
            case 7:
                O90.f((DevLoadingModule) this.b, "this$0");
                return;
            case 8:
                FC fc = (FC) this.b;
                O90.f(fc, "this$0");
                fc.a = false;
                return;
            case 9:
                C4329iM c4329iM = (C4329iM) this.b;
                boolean zIsPopupShowing = c4329iM.h.isPopupShowing();
                c4329iM.t(zIsPopupShowing);
                c4329iM.m = zIsPopupShowing;
                return;
            case 10:
                C5869mM c5869mM = (C5869mM) this.b;
                c5869mM.f = true;
                c5869mM.a();
                return;
            case 11:
                C1723Vw c1723Vw = (C1723Vw) ((C6045nH) this.b).d;
                if (c1723Vw != null) {
                    Iterator it = c1723Vw.values().iterator();
                    while (it.hasNext()) {
                        ((R61) it.next()).c();
                    }
                    return;
                }
                return;
            case 12:
                a aVar = (a) this.b;
                if (aVar == null) {
                    return;
                }
                ViewParent parent = aVar.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeView(aVar);
                return;
            case 13:
                ((C6639qO) this.b).b();
                return;
            case 14:
                C3771fR c3771fR = (C3771fR) this.b;
                O90.f(c3771fR, "this$0");
                c3771fR.measure(View.MeasureSpec.makeMeasureSpec(c3771fR.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c3771fR.getHeight(), 1073741824));
                c3771fR.layout(c3771fR.getLeft(), c3771fR.getTop(), c3771fR.getRight(), c3771fR.getBottom());
                return;
            case 15:
                C4359iW c4359iW = (C4359iW) this.b;
                O90.f(c4359iW, "this$0");
                c4359iW.m();
                return;
            case 16:
                ((C1304Qm0) this.b).x();
                return;
            case 17:
                N30 n30 = (N30) this.b;
                O90.f(n30, "this$0");
                n30.I();
                return;
            case 18:
                final InterfaceC5908mZ interfaceC5908mZ = (InterfaceC5908mZ) this.b;
                O90.f(interfaceC5908mZ, "$task");
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: Z50
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        InterfaceC5908mZ interfaceC5908mZ2 = interfaceC5908mZ;
                        O90.f(interfaceC5908mZ2, "$task");
                        interfaceC5908mZ2.invoke();
                        return false;
                    }
                });
                return;
            case 19:
                C6586q60 c6586q60 = (C6586q60) this.b;
                synchronized (c6586q60.u) {
                    try {
                        c6586q60.w = null;
                        InterfaceC3903g70 interfaceC3903g70 = c6586q60.v;
                        if (interfaceC3903g70 != null) {
                            c6586q60.v = null;
                            c6586q60.e(interfaceC3903g70);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 20:
                ((KeychainModule) this.b).internalWarmingBestCipher();
                return;
            case 21:
                C8423zl0 c8423zl0 = (C8423zl0) this.b;
                O90.f(c8423zl0, "this$0");
                c8423zl0.a(false);
                return;
            case 22:
                AbstractC0667Ih1.b((InputStream) this.b);
                return;
            case 23:
                AbstractC0667Ih1.b((ZipInputStream) this.b);
                return;
            case 24:
                ((C7475um0) this.b).d();
                return;
            case 25:
                Object obj = ((e) this.b).i;
                if (obj instanceof h) {
                    ((h) obj).d();
                    return;
                }
                return;
            case 26:
                C1172Ou0 c1172Ou0 = (C1172Ou0) this.b;
                c1172Ou0.getClass();
                try {
                    c1172Ou0.l = c1172Ou0.a.getNetworkCapabilities(c1172Ou0.k);
                    c1172Ou0.g();
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 27:
                ((DN0) this.b).e();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                c cVar = (c) this.b;
                C0090Ax0 c0090Ax0 = cVar.g;
                SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = c0090Ax0.c;
                OmicronConfig omicronConfig = cVar.c;
                long j = omicronConfig.g;
                TimeUnit timeUnit = C0090Ax0.g;
                boolean zShouldUpdate = sharedPreferencesUpdateTimetable.shouldUpdate(cVar.d, j, timeUnit);
                WorkManagerScheduledExecutor workManagerScheduledExecutor = c0090Ax0.f;
                if (zShouldUpdate || !workManagerScheduledExecutor.isActive()) {
                    workManagerScheduledExecutor.schedule(new C1724Vw0(2, cVar), omicronConfig.g, timeUnit);
                    return;
                }
                return;
            default:
                C5564kl1 c5564kl1 = (C5564kl1) this.b;
                c5564kl1.measure(View.MeasureSpec.makeMeasureSpec(c5564kl1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c5564kl1.getHeight(), 1073741824));
                c5564kl1.layout(c5564kl1.getLeft(), c5564kl1.getTop(), c5564kl1.getRight(), c5564kl1.getBottom());
                return;
        }
    }
}
