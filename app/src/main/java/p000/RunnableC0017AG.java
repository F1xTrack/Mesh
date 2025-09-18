package p000;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Binder;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.C1740v;
import androidx.fragment.app.Fragment;
import io.appmetrica.analytics.impl.C4612Kb;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* renamed from: AG */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0017AG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f144a;

    /* renamed from: b */
    public final /* synthetic */ boolean f145b;

    /* renamed from: c */
    public final /* synthetic */ Object f146c;

    /* renamed from: d */
    public final /* synthetic */ Object f147d;

    public /* synthetic */ RunnableC0017AG(C1740v c1740v, C1740v c1740v2, boolean z, C7119x8 c7119x8) {
        this.f144a = 0;
        this.f146c = c1740v;
        this.f147d = c1740v2;
        this.f145b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f144a) {
            case 0:
                C1740v c1740v = (C1740v) this.f146c;
                C1740v c1740v2 = (C1740v) this.f147d;
                C0035AY c0035ay = AbstractC7019vY.f44407a;
                Fragment fragment = c1740v.f16279c;
                O90.m5968f(fragment, "inFragment");
                Fragment fragment2 = c1740v2.f16279c;
                O90.m5968f(fragment2, "outFragment");
                if (this.f145b) {
                    fragment2.getEnterTransitionCallback();
                    return;
                } else {
                    fragment.getEnterTransitionCallback();
                    return;
                }
            case 1:
                C0411GW c0411gw = (C0411GW) this.f146c;
                boolean z = this.f145b;
                C0300El c0300El = (C0300El) this.f147d;
                c0411gw.f3774a.m23549j(c0411gw.f3794u);
                c0411gw.f3793t = z;
                if (!c0411gw.f3777d) {
                    c0300El.m2377d(new C1434Wn("Camera is not active."));
                    return;
                }
                C0285EW c0285ew = new InterfaceC6510nm() { // from class: EW

                    /* renamed from: b */
                    public final /* synthetic */ long f2729b;

                    /* renamed from: c */
                    public final /* synthetic */ C0300El f2730c;

                    public /* synthetic */ C0285EW(long j, C0300El c0300El2) {
                        j = j;
                        c0300El = c0300El2;
                    }

                    @Override // p000.InterfaceC6510nm
                    /* renamed from: c */
                    public final boolean mo2326c(TotalCaptureResult totalCaptureResult) {
                        C0411GW c0411gw2 = c0411gw;
                        c0411gw2.getClass();
                        boolean z2 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
                        AbstractC7806Jm0.m4412f("FocusMeteringControl");
                        if (z2 != c0411gw2.f3793t || !C6573om.m23542i(totalCaptureResult, j)) {
                            return false;
                        }
                        AbstractC7806Jm0.m4412f("FocusMeteringControl");
                        c0300El.m2375b(null);
                        return true;
                    }
                };
                c0411gw.f3794u = c0285ew;
                c0411gw.f3774a.m23543a(c0285ew);
                return;
            case 2:
                C4612Kb.m19548a((C4612Kb) this.f146c, (LocationControllerObserver) this.f147d, this.f145b);
                return;
            case 3:
                Activity activity = (Activity) this.f146c;
                Object systemService = activity != null ? activity.getSystemService("input_method") : null;
                inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                EditText editText = (EditText) this.f147d;
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
                if (this.f145b) {
                    return;
                }
                editText.clearFocus();
                return;
            case 4:
                Context context = (Context) this.f146c;
                S81 s81 = (S81) this.f147d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = AbstractC10642pN1.m23769b(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (this.f145b) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        context.getPackageName();
                    }
                    return;
                } finally {
                    s81.m7186d(null);
                }
            default:
                ((C11182tb1) this.f146c).m24945a((C0300El) this.f147d, this.f145b);
                return;
        }
    }

    public /* synthetic */ RunnableC0017AG(Object obj, Object obj2, boolean z, int i) {
        this.f144a = i;
        this.f146c = obj;
        this.f147d = obj2;
        this.f145b = z;
    }

    public /* synthetic */ RunnableC0017AG(Object obj, boolean z, Object obj2, int i) {
        this.f144a = i;
        this.f146c = obj;
        this.f145b = z;
        this.f147d = obj2;
    }
}
