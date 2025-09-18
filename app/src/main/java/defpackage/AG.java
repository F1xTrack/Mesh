package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class AG implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ AG(v vVar, v vVar2, boolean z, C7925x8 c7925x8) {
        this.a = 0;
        this.c = vVar;
        this.d = vVar2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v vVar = (v) this.c;
                v vVar2 = (v) this.d;
                AY ay = AbstractC7623vY.a;
                Fragment fragment = vVar.c;
                O90.f(fragment, "inFragment");
                Fragment fragment2 = vVar2.c;
                O90.f(fragment2, "outFragment");
                if (this.b) {
                    fragment2.getEnterTransitionCallback();
                    return;
                } else {
                    fragment.getEnterTransitionCallback();
                    return;
                }
            case 1:
                GW gw = (GW) this.c;
                boolean z = this.b;
                C0365El c0365El = (C0365El) this.d;
                gw.a.j(gw.u);
                gw.t = z;
                if (!gw.d) {
                    c0365El.d(new C1774Wn("Camera is not active."));
                    return;
                }
                EW ew = new InterfaceC6138nm() { // from class: EW
                    public final /* synthetic */ long b;
                    public final /* synthetic */ C0365El c;

                    public /* synthetic */ EW(long j, C0365El c0365El2) {
                        j = j;
                        c0365El = c0365El2;
                    }

                    @Override // defpackage.InterfaceC6138nm
                    public final boolean c(TotalCaptureResult totalCaptureResult) {
                        GW gw2 = gw;
                        gw2.getClass();
                        boolean z2 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        AbstractC0759Jm0.f("FocusMeteringControl");
                        if (z2 != gw2.t || !C6329om.i(totalCaptureResult, j)) {
                            return false;
                        }
                        AbstractC0759Jm0.f("FocusMeteringControl");
                        c0365El.b(null);
                        return true;
                    }
                };
                gw.u = ew;
                gw.a.a(ew);
                return;
            case 2:
                Kb.a((Kb) this.c, (LocationControllerObserver) this.d, this.b);
                return;
            case 3:
                Activity activity = (Activity) this.c;
                Object systemService = activity != null ? activity.getSystemService("input_method") : null;
                inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                EditText editText = (EditText) this.d;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
                if (this.b) {
                    return;
                }
                editText.clearFocus();
                return;
            case 4:
                Context context = (Context) this.c;
                S81 s81 = (S81) this.d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = AbstractC6447pN1.b(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.b) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    s81.d(null);
                }
            default:
                ((C7252tb1) this.c).a((C0365El) this.d, this.b);
                return;
        }
    }

    public /* synthetic */ AG(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ AG(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
