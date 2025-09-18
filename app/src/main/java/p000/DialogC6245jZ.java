package p000;

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

/* renamed from: jZ */
/* loaded from: classes.dex */
public final class DialogC6245jZ extends Dialog {

    /* renamed from: a */
    public final C4053fR f35223a;

    /* renamed from: b */
    public final C10891rK0 f35224b;

    /* renamed from: c */
    public final C10683pi0 f35225c;

    /* renamed from: d */
    public final C0767MB f35226d;

    /* renamed from: e */
    public final C3961dz f35227e;

    /* renamed from: f */
    public ViewGroup f35228f;

    /* renamed from: g */
    public final FrameLayout f35229g;

    /* renamed from: h */
    public final Handler f35230h;

    /* renamed from: i */
    public final RunnableC0296Eh f35231i;

    /* renamed from: j */
    public final Integer f35232j;

    /* renamed from: k */
    public final Boolean f35233k;

    /* renamed from: l */
    public final Boolean f35234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC6245jZ(Context context, C4053fR c4053fR, C10891rK0 c10891rK0, C10683pi0 c10683pi0, C0767MB c0767mb, C3961dz c3961dz) {
        C8485Wn1 c8537Xn1;
        super(context, R.style.Theme.Black.NoTitleBar);
        O90.m5968f(context, "context");
        O90.m5968f(c4053fR, "exoPlayerView");
        O90.m5968f(c10891rK0, "reactExoplayerView");
        O90.m5968f(c3961dz, "controlsConfig");
        this.f35223a = c4053fR;
        this.f35224b = c10891rK0;
        this.f35225c = c10683pi0;
        this.f35226d = c0767mb;
        this.f35227e = c3961dz;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35229g = frameLayout;
        this.f35230h = new Handler(Looper.getMainLooper());
        this.f35231i = new RunnableC0296Eh(this);
        setContentView(frameLayout, m22069a());
        Window window = getWindow();
        if (window != null) {
            C10641pN0 c10641pN0 = new C10641pN0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                C8641Zn1 c8641Zn1 = new C8641Zn1(window.getInsetsController(), c10641pN0);
                c8641Zn1.f15132d = window;
                c8537Xn1 = c8641Zn1;
            } else {
                c8537Xn1 = i >= 26 ? new C8537Xn1(window, c10641pN0) : new C8485Wn1(window, c10641pN0);
            }
            this.f35232j = Integer.valueOf(c8537Xn1.mo8861b());
            View decorView = window.getDecorView();
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(decorView);
            boolean z = false;
            this.f35233k = Boolean.valueOf(c8433Vn1M18871a != null && c8433Vn1M18871a.f12756a.mo5841o(2));
            C8433Vn1 c8433Vn1M18871a2 = AbstractC9664hk1.m18871a(window.getDecorView());
            if (c8433Vn1M18871a2 != null && c8433Vn1M18871a2.f12756a.mo5841o(1)) {
                z = true;
            }
            this.f35234l = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static FrameLayout.LayoutParams m22069a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        return layoutParams;
    }

    /* renamed from: b */
    public static void m22070b(C8771ao1 c8771ao1, int i, Boolean bool, Boolean bool2, Integer num) {
        if (bool != null) {
            if (bool.equals(bool2)) {
                bool = null;
            }
            if (bool != null) {
                if (!bool.booleanValue()) {
                    c8771ao1.m10339b(i);
                    return;
                }
                c8771ao1.m10338a(i);
                if (num != null) {
                    c8771ao1.f16606a.mo8864h(num.intValue());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m22071c(C10683pi0 c10683pi0, boolean z) {
        ImageButton imageButton = (ImageButton) c10683pi0.findViewById(ru.mes.dnevnik.R.id.exo_fullscreen);
        if (imageButton != null) {
            int i = z ? ru.mes.dnevnik.R.drawable.exo_icon_fullscreen_exit : ru.mes.dnevnik.R.drawable.exo_icon_fullscreen_enter;
            String string = z ? getContext().getString(ru.mes.dnevnik.R.string.exo_controls_fullscreen_exit_description) : getContext().getString(ru.mes.dnevnik.R.string.exo_controls_fullscreen_enter_description);
            O90.m5965c(string);
            imageButton.setImageResource(i);
            imageButton.setContentDescription(string);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35224b.getPreventsDisplaySleepDuringVideoPlayback()) {
            this.f35230h.post(this.f35231i);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C4053fR c4053fR = this.f35223a;
        ViewGroup viewGroup = (ViewGroup) c4053fR.getParent();
        this.f35228f = viewGroup;
        if (viewGroup != null) {
            viewGroup.removeView(c4053fR);
        }
        FrameLayout frameLayout = this.f35229g;
        frameLayout.addView(c4053fR, m22069a());
        C10683pi0 c10683pi0 = this.f35225c;
        if (c10683pi0 != null) {
            m22071c(c10683pi0, true);
            ViewGroup viewGroup2 = this.f35228f;
            if (viewGroup2 != null) {
                viewGroup2.removeView(c10683pi0);
            }
            frameLayout.addView(c10683pi0, m22069a());
        }
        Window window = getWindow();
        C3961dz c3961dz = this.f35227e;
        if (window != null) {
            Boolean boolValueOf = Boolean.valueOf(c3961dz.f26466j);
            Boolean boolValueOf2 = Boolean.valueOf(c3961dz.f26467k);
            C8771ao1 c8771ao1 = new C8771ao1(window, window.getDecorView());
            m22070b(c8771ao1, 2, boolValueOf, this.f35233k, 2);
            m22070b(c8771ao1, 1, boolValueOf2, this.f35234l, null);
        }
        if (c3961dz.f26467k) {
            LinearLayout linearLayout = c10683pi0 != null ? (LinearLayout) c10683pi0.findViewById(ru.mes.dnevnik.R.id.exo_live_container) : null;
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                O90.m5966d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 40;
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f35230h.removeCallbacks(this.f35231i);
        FrameLayout frameLayout = this.f35229g;
        C4053fR c4053fR = this.f35223a;
        frameLayout.removeView(c4053fR);
        ViewGroup viewGroup = this.f35228f;
        if (viewGroup != null) {
            viewGroup.addView(c4053fR, m22069a());
        }
        C10683pi0 c10683pi0 = this.f35225c;
        if (c10683pi0 != null) {
            m22071c(c10683pi0, false);
            frameLayout.removeView(c10683pi0);
            ViewGroup viewGroup2 = this.f35228f;
            if (viewGroup2 != null) {
                viewGroup2.addView(c10683pi0, m22069a());
            }
        }
        ViewGroup viewGroup3 = this.f35228f;
        if (viewGroup3 != null) {
            viewGroup3.requestLayout();
        }
        this.f35228f = null;
        this.f35226d.m5283a();
        Window window = getWindow();
        if (window != null) {
            Integer num = this.f35232j;
            Boolean bool = this.f35233k;
            Boolean bool2 = this.f35234l;
            C8771ao1 c8771ao1 = new C8771ao1(window, window.getDecorView());
            m22070b(c8771ao1, 2, bool, this.f35233k, num);
            m22070b(c8771ao1, 1, bool2, this.f35234l, null);
        }
    }
}
