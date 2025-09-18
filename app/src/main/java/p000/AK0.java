package p000;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class AK0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f169a;

    /* renamed from: b */
    public boolean f170b;

    /* renamed from: c */
    public int f171c;

    /* renamed from: d */
    public final /* synthetic */ KeyEvent.Callback f172d;

    public /* synthetic */ AK0(FrameLayout frameLayout, int i) {
        this.f169a = i;
        this.f172d = frameLayout;
        this.f170b = false;
        this.f171c = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyEvent.Callback callback = this.f172d;
        switch (this.f169a) {
            case 0:
                BK0 bk0 = (BK0) callback;
                if (!bk0.f735f) {
                    CM0.m1156i(bk0);
                    int i = this.f171c + 1;
                    this.f171c = i;
                    if (i < 3) {
                        if (bk0.f739j && !this.f170b) {
                            this.f170b = true;
                            bk0.m607f(0);
                        }
                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                        bk0.postOnAnimationDelayed(this, 20L);
                        break;
                    } else {
                        bk0.f740k = null;
                        if (bk0.f745p) {
                            CM0.m1148a(bk0, MW0.f7207f, 0.0f, 0.0f, false);
                            break;
                        }
                    }
                } else {
                    bk0.f735f = false;
                    this.f171c = 0;
                    WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                    bk0.postOnAnimationDelayed(this, 20L);
                    break;
                }
                break;
            case 1:
                ViewGroupOnHierarchyChangeListenerC10767qM0 viewGroupOnHierarchyChangeListenerC10767qM0 = (ViewGroupOnHierarchyChangeListenerC10767qM0) callback;
                if (!viewGroupOnHierarchyChangeListenerC10767qM0.f40814f) {
                    CM0.m1156i(viewGroupOnHierarchyChangeListenerC10767qM0);
                    int i2 = this.f171c + 1;
                    this.f171c = i2;
                    if (i2 < 3) {
                        if (viewGroupOnHierarchyChangeListenerC10767qM0.f40818j && !this.f170b) {
                            this.f170b = true;
                            viewGroupOnHierarchyChangeListenerC10767qM0.m23987e(0);
                        }
                        WeakHashMap weakHashMap3 = AbstractC10944rk1.f41842a;
                        viewGroupOnHierarchyChangeListenerC10767qM0.postOnAnimationDelayed(this, 20L);
                        break;
                    } else {
                        viewGroupOnHierarchyChangeListenerC10767qM0.f40819k = null;
                        if (viewGroupOnHierarchyChangeListenerC10767qM0.f40823o) {
                            CM0.m1148a(viewGroupOnHierarchyChangeListenerC10767qM0, MW0.f7207f, 0.0f, 0.0f, false);
                            break;
                        }
                    }
                } else {
                    viewGroupOnHierarchyChangeListenerC10767qM0.f40814f = false;
                    this.f171c = 0;
                    WeakHashMap weakHashMap4 = AbstractC10944rk1.f41842a;
                    viewGroupOnHierarchyChangeListenerC10767qM0.postOnAnimationDelayed(this, 20L);
                    break;
                }
                break;
            default:
                Activity activity = (Activity) callback;
                if (!activity.isFinishing()) {
                    Dialog dialog = new Dialog(activity, this.f171c);
                    NS1.f7793a = dialog;
                    boolean z = this.f170b;
                    if (z) {
                        dialog.getWindow().getDecorView().setSystemUiVisibility(768);
                    }
                    NS1.f7793a.setContentView(R.layout.launch_screen);
                    NS1.f7793a.setCancelable(false);
                    if (z) {
                        Dialog dialog2 = NS1.f7793a;
                        if (Build.VERSION.SDK_INT >= 28 && dialog2 != null && dialog2.getWindow() != null) {
                            dialog2.getWindow().addFlags(512);
                            WindowManager.LayoutParams attributes = dialog2.getWindow().getAttributes();
                            attributes.layoutInDisplayCutoutMode = 1;
                            dialog2.getWindow().setAttributes(attributes);
                        }
                    }
                    if (!NS1.f7793a.isShowing()) {
                        NS1.f7793a.show();
                        break;
                    }
                }
                break;
        }
    }

    public AK0(int i, Activity activity, boolean z) {
        this.f169a = 2;
        this.f172d = activity;
        this.f171c = i;
        this.f170b = z;
    }
}
