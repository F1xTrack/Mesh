package defpackage;

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
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ AK0(FrameLayout frameLayout, int i) {
        this.a = i;
        this.d = frameLayout;
        this.b = false;
        this.c = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyEvent.Callback callback = this.d;
        switch (this.a) {
            case 0:
                BK0 bk0 = (BK0) callback;
                if (!bk0.f) {
                    CM0.i(bk0);
                    int i = this.c + 1;
                    this.c = i;
                    if (i < 3) {
                        if (bk0.j && !this.b) {
                            this.b = true;
                            bk0.f(0);
                        }
                        WeakHashMap weakHashMap = AbstractC6897rk1.a;
                        bk0.postOnAnimationDelayed(this, 20L);
                        break;
                    } else {
                        bk0.k = null;
                        if (bk0.p) {
                            CM0.a(bk0, MW0.f, 0.0f, 0.0f, false);
                            break;
                        }
                    }
                } else {
                    bk0.f = false;
                    this.c = 0;
                    WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                    bk0.postOnAnimationDelayed(this, 20L);
                    break;
                }
                break;
            case 1:
                ViewGroupOnHierarchyChangeListenerC6634qM0 viewGroupOnHierarchyChangeListenerC6634qM0 = (ViewGroupOnHierarchyChangeListenerC6634qM0) callback;
                if (!viewGroupOnHierarchyChangeListenerC6634qM0.f) {
                    CM0.i(viewGroupOnHierarchyChangeListenerC6634qM0);
                    int i2 = this.c + 1;
                    this.c = i2;
                    if (i2 < 3) {
                        if (viewGroupOnHierarchyChangeListenerC6634qM0.j && !this.b) {
                            this.b = true;
                            viewGroupOnHierarchyChangeListenerC6634qM0.e(0);
                        }
                        WeakHashMap weakHashMap3 = AbstractC6897rk1.a;
                        viewGroupOnHierarchyChangeListenerC6634qM0.postOnAnimationDelayed(this, 20L);
                        break;
                    } else {
                        viewGroupOnHierarchyChangeListenerC6634qM0.k = null;
                        if (viewGroupOnHierarchyChangeListenerC6634qM0.o) {
                            CM0.a(viewGroupOnHierarchyChangeListenerC6634qM0, MW0.f, 0.0f, 0.0f, false);
                            break;
                        }
                    }
                } else {
                    viewGroupOnHierarchyChangeListenerC6634qM0.f = false;
                    this.c = 0;
                    WeakHashMap weakHashMap4 = AbstractC6897rk1.a;
                    viewGroupOnHierarchyChangeListenerC6634qM0.postOnAnimationDelayed(this, 20L);
                    break;
                }
                break;
            default:
                Activity activity = (Activity) callback;
                if (!activity.isFinishing()) {
                    Dialog dialog = new Dialog(activity, this.c);
                    NS1.a = dialog;
                    boolean z = this.b;
                    if (z) {
                        dialog.getWindow().getDecorView().setSystemUiVisibility(768);
                    }
                    NS1.a.setContentView(R.layout.launch_screen);
                    NS1.a.setCancelable(false);
                    if (z) {
                        Dialog dialog2 = NS1.a;
                        if (Build.VERSION.SDK_INT >= 28 && dialog2 != null && dialog2.getWindow() != null) {
                            dialog2.getWindow().addFlags(512);
                            WindowManager.LayoutParams attributes = dialog2.getWindow().getAttributes();
                            attributes.layoutInDisplayCutoutMode = 1;
                            dialog2.getWindow().setAttributes(attributes);
                        }
                    }
                    if (!NS1.a.isShowing()) {
                        NS1.a.show();
                        break;
                    }
                }
                break;
        }
    }

    public AK0(int i, Activity activity, boolean z) {
        this.a = 2;
        this.d = activity;
        this.c = i;
        this.b = z;
    }
}
