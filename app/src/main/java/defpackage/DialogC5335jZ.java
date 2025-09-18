package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* renamed from: jZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC5335jZ extends Dialog {
    public final C3771fR a;
    public final C6818rK0 b;
    public final C6509pi0 c;
    public final MB d;
    public final C3491dz e;
    public ViewGroup f;
    public final FrameLayout g;
    public final Handler h;
    public final RunnableC0353Eh i;
    public final Integer j;
    public final Boolean k;
    public final Boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC5335jZ(Context context, C3771fR c3771fR, C6818rK0 c6818rK0, C6509pi0 c6509pi0, MB mb, C3491dz c3491dz) {
        C1776Wn1 c1854Xn1;
        super(context, R.style.Theme.Black.NoTitleBar);
        O90.f(context, "context");
        O90.f(c3771fR, "exoPlayerView");
        O90.f(c6818rK0, "reactExoplayerView");
        O90.f(c3491dz, "controlsConfig");
        this.a = c3771fR;
        this.b = c6818rK0;
        this.c = c6509pi0;
        this.d = mb;
        this.e = c3491dz;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new RunnableC0353Eh(this);
        setContentView(frameLayout, a());
        Window window = getWindow();
        if (window != null) {
            C6446pN0 c6446pN0 = new C6446pN0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                C2010Zn1 c2010Zn1 = new C2010Zn1(window.getInsetsController(), c6446pN0);
                c2010Zn1.d = window;
                c1854Xn1 = c2010Zn1;
            } else {
                c1854Xn1 = i >= 26 ? new C1854Xn1(window, c6446pN0) : new C1776Wn1(window, c6446pN0);
            }
            this.j = Integer.valueOf(c1854Xn1.b());
            View decorView = window.getDecorView();
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(decorView);
            boolean z = false;
            this.k = Boolean.valueOf(c1698Vn1A != null && c1698Vn1A.a.o(2));
            C1698Vn1 c1698Vn1A2 = AbstractC4212hk1.a(window.getDecorView());
            if (c1698Vn1A2 != null && c1698Vn1A2.a.o(1)) {
                z = true;
            }
            this.l = Boolean.valueOf(z);
        }
    }

    public static FrameLayout.LayoutParams a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        return layoutParams;
    }

    public static void b(C2204ao1 c2204ao1, int i, Boolean bool, Boolean bool2, Integer num) {
        if (bool != null) {
            if (bool.equals(bool2)) {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    c2204ao1.b(i);
                    return;
                }
                c2204ao1.a(i);
                if (num != null) {
                    c2204ao1.a.h(num.intValue());
                }
            }
        }
    }

    public final void c(C6509pi0 c6509pi0, boolean z) {
        ImageButton imageButton = (ImageButton) c6509pi0.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen);
        if (imageButton != null) {
            int i = z ? ru.mes.dnevnik.R.drawable.exo_icon_fullscreen_exit : ru.mes.dnevnik.R.drawable.exo_icon_fullscreen_enter;
            String string = z ? getContext().getString(ru.mes.dnevnik.R.string.exo_controls_fullscreen_exit_description) : getContext().getString(ru.mes.dnevnik.R.string.exo_controls_fullscreen_enter_description);
            O90.c(string);
            imageButton.setImageResource(i);
            imageButton.setContentDescription(string);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b.getPreventsDisplaySleepDuringVideoPlayback()) {
            this.h.post(this.i);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C3771fR c3771fR = this.a;
        ViewGroup viewGroup = (ViewGroup) c3771fR.getParent();
        this.f = viewGroup;
        if (viewGroup != null) {
            viewGroup.removeView(c3771fR);
        }
        FrameLayout frameLayout = this.g;
        frameLayout.addView(c3771fR, a());
        C6509pi0 c6509pi0 = this.c;
        if (c6509pi0 != null) {
            c(c6509pi0, true);
            ViewGroup viewGroup2 = this.f;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c6509pi0);
            }
            frameLayout.addView(c6509pi0, a());
        }
        Window window = getWindow();
        C3491dz c3491dz = this.e;
        if (window != null) {
            Boolean boolValueOf = Boolean.valueOf(c3491dz.j);
            Boolean boolValueOf2 = Boolean.valueOf(c3491dz.k);
            C2204ao1 c2204ao1 = new C2204ao1(window, window.getDecorView());
            b(c2204ao1, 2, boolValueOf, this.k, 2);
            b(c2204ao1, 1, boolValueOf2, this.l, null);
        }
        if (c3491dz.k) {
            LinearLayout linearLayout = c6509pi0 != null ? (LinearLayout) c6509pi0.findViewById(ru.mes.dnevnik.R.id.exo_live_container) : null;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                O90.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 40;
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.h.removeCallbacks(this.i);
        FrameLayout frameLayout = this.g;
        C3771fR c3771fR = this.a;
        frameLayout.removeView(c3771fR);
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.addView(c3771fR, a());
        }
        C6509pi0 c6509pi0 = this.c;
        if (c6509pi0 != null) {
            c(c6509pi0, false);
            frameLayout.removeView(c6509pi0);
            ViewGroup viewGroup2 = this.f;
            if (viewGroup2 != null) {
                viewGroup2.addView(c6509pi0, a());
            }
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.requestLayout();
        }
        this.f = null;
        this.d.a();
        Window window = getWindow();
        if (window != null) {
            Integer num = this.j;
            Boolean bool = this.k;
            Boolean bool2 = this.l;
            C2204ao1 c2204ao1 = new C2204ao1(window, window.getDecorView());
            b(c2204ao1, 2, bool, this.k, num);
            b(c2204ao1, 1, bool2, this.l, null);
        }
    }
}
