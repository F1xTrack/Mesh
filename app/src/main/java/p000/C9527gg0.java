package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsetsAnimationController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.facebook.react.views.view.C1932a;
import java.util.WeakHashMap;

/* renamed from: gg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9527gg0 extends C1932a {

    /* renamed from: a */
    public final S91 f27915a;

    /* renamed from: b */
    public boolean f27916b;

    /* renamed from: c */
    public float f27917c;

    /* renamed from: d */
    public float f27918d;

    /* renamed from: e */
    public int f27919e;

    /* renamed from: f */
    public int f27920f;

    /* renamed from: g */
    public int f27921g;

    /* renamed from: h */
    public C9515ga0 f27922h;

    /* renamed from: i */
    public boolean f27923i;

    /* renamed from: j */
    public boolean f27924j;

    /* renamed from: k */
    public final Rect f27925k;

    /* renamed from: l */
    public final C1753aw f27926l;

    /* renamed from: m */
    public VelocityTracker f27927m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9527gg0(S91 s91) {
        super(s91);
        O90.m5968f(s91, "reactContext");
        this.f27915a = s91;
        this.f27922h = new C9515ga0(1);
        this.f27924j = true;
        this.f27925k = new Rect();
        this.f27926l = new C1753aw(5);
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        Activity currentActivity = this.f27915a.f10602a.getCurrentActivity();
        WindowMetrics currentWindowMetrics = (currentActivity == null || (windowManager = currentActivity.getWindowManager()) == null) ? null : windowManager.getCurrentWindowMetrics();
        if (currentWindowMetrics == null || (bounds = currentWindowMetrics.getBounds()) == null) {
            return 0;
        }
        return bounds.height();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r2v46, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v58 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C8771ao1 c8771ao1 = null;
        if (this.f27927m == null) {
            this.f27927m = VelocityTracker.obtain();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Rect rect = this.f27925k;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            VelocityTracker velocityTracker = this.f27927m;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            this.f27917c = motionEvent.getX();
            this.f27918d = motionEvent.getY();
            UJ1.m7984a(this, rect);
            this.f27919e = rect.top;
        } else {
            C1753aw c1753aw = this.f27926l;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                UJ1.m7984a(this, rect);
                int i = rect.top - this.f27919e;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(0.0f, i);
                VelocityTracker velocityTracker2 = this.f27927m;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                }
                float x = motionEventObtain.getX() - this.f27917c;
                float y = motionEventObtain.getY() - this.f27918d;
                if (!this.f27916b) {
                    this.f27916b = Math.abs(y) > Math.abs(x) && Math.abs(y) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
                }
                if (this.f27916b) {
                    if (((C10226m71) c1753aw.f16682b) != null) {
                        if (this.f27920f == 0) {
                            this.f27920f = c1753aw.m10389h();
                        }
                        C9515ga0 c9515ga0 = this.f27922h;
                        ?? M18304b = AbstractC9426ft1.m18304b(y);
                        int windowHeight = getWindowHeight() - ((int) motionEvent.getRawY());
                        int iM10389h = c1753aw.m10389h();
                        int i2 = this.f27921g;
                        ?? r2 = M18304b;
                        switch (c9515ga0.f27854a) {
                            case 0:
                                r2 = (windowHeight <= iM10389h + i2 || M18304b <= 0) ? M18304b : false;
                                break;
                        }
                        if (r2 != 0) {
                            C10226m71 c10226m71 = (C10226m71) c1753aw.f16682b;
                            if (c10226m71 == null) {
                                throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
                            }
                            AbstractC10343n22.f38062a = true;
                            c1753aw.m10390i(c10226m71.m22682i().f5355d - r2);
                        }
                    } else if (((CancellationSignal) c1753aw.f16684d) == null) {
                        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                        C8433Vn1 c8433Vn1M18871a = AbstractC9664hk1.m18871a(this);
                        boolean z = c8433Vn1M18871a != null && c8433Vn1M18871a.f12756a.mo5841o(8);
                        if (y >= 0.0f ? !(y <= 0.0f || !z || !this.f27924j) : !(z || !this.f27923i)) {
                            if (((C10226m71) c1753aw.f16682b) != null) {
                                throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
                            }
                            C8433Vn1 c8433Vn1M18871a2 = AbstractC9664hk1.m18871a(this);
                            if (c8433Vn1M18871a2 != null && c8433Vn1M18871a2.f12756a.mo5841o(8)) {
                                z = true;
                            }
                            c1753aw.f16683c = z;
                            c1753aw.f16684d = new CancellationSignal();
                            c1753aw.f16685e = null;
                            AbstractC10343n22.f38062a = true;
                            if (Build.VERSION.SDK_INT >= 30) {
                                c8771ao1 = AbstractC10304mk1.m22939c(this);
                            } else {
                                Context context = getContext();
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        break;
                                    }
                                    if (context instanceof Activity) {
                                        Window window = ((Activity) context).getWindow();
                                        if (window != null) {
                                            c8771ao1 = new C8771ao1(window, this);
                                        }
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                            }
                            if (c8771ao1 != null) {
                                c8771ao1.f16606a.mo8860a(AbstractC8624Zf0.f15082a, (CancellationSignal) c1753aw.f16684d, (C8572Yf0) ((F71) c1753aw.f16686f).getValue());
                            }
                        }
                    }
                    this.f27918d = motionEvent.getY();
                    this.f27917c = motionEvent.getX();
                    this.f27919e = rect.top;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                VelocityTracker velocityTracker3 = this.f27927m;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                VelocityTracker velocityTracker4 = this.f27927m;
                if (velocityTracker4 != null) {
                    velocityTracker4.computeCurrentVelocity(500);
                }
                VelocityTracker velocityTracker5 = this.f27927m;
                Float fValueOf = velocityTracker5 != null ? Float.valueOf(velocityTracker5.getYVelocity()) : null;
                if (((C10226m71) c1753aw.f16682b) != null && this.f27920f == c1753aw.m10389h()) {
                    fValueOf = null;
                }
                C10226m71 c10226m712 = (C10226m71) c1753aw.f16682b;
                if (c10226m712 == null) {
                    CancellationSignal cancellationSignal = (CancellationSignal) c1753aw.f16684d;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                } else {
                    AbstractC10343n22.f38062a = false;
                    J80 j80M22682i = c10226m712.m22682i();
                    C10339n11 c10339n11 = (C10339n11) c10226m712.f37493b;
                    J80 j80M4202c = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getShownStateInsets());
                    J80 j80M4202c2 = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getHiddenStateInsets());
                    if (fValueOf != null) {
                        c1753aw.m10384a(fValueOf, fValueOf.floatValue() < 0.0f);
                    } else {
                        int i3 = j80M4202c.f5355d;
                        int i4 = j80M22682i.f5355d;
                        if (i4 == i3) {
                            c10226m712.m22680g(true);
                        } else if (i4 == j80M4202c2.f5355d) {
                            c10226m712.m22680g(false);
                        } else if (((WindowInsetsAnimationController) c10339n11.f38046b).getCurrentFraction() >= 0.15f) {
                            c1753aw.m10384a(null, !c1753aw.f16683c);
                        } else {
                            c1753aw.m10384a(null, c1753aw.f16683c);
                        }
                    }
                }
                m18595l();
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                C10226m71 c10226m713 = (C10226m71) c1753aw.f16682b;
                if (c10226m713 != null) {
                    c10226m713.m22680g(c1753aw.f16683c);
                }
                CancellationSignal cancellationSignal2 = (CancellationSignal) c1753aw.f16684d;
                if (cancellationSignal2 != null) {
                    cancellationSignal2.cancel();
                }
                C11878z31 c11878z31 = (C11878z31) c1753aw.f16687g;
                if (c11878z31 != null) {
                    c11878z31.m26307a();
                }
                c1753aw.m10392k();
                m18595l();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: l */
    public final void m18595l() {
        this.f27916b = false;
        this.f27917c = 0.0f;
        this.f27918d = 0.0f;
        this.f27919e = 0;
        this.f27920f = 0;
        this.f27925k.setEmpty();
        VelocityTracker velocityTracker = this.f27927m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f27927m = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void setInterpolator(String str) {
        O90.m5968f(str, "interpolator");
        C9515ga0 c9515ga0 = (C9515ga0) AbstractC9655hg0.f28521a.get(str);
        if (c9515ga0 == null) {
            c9515ga0 = new C9515ga0(1);
        }
        this.f27922h = c9515ga0;
    }

    public final void setOffset(double d) {
        this.f27921g = (int) (((float) d) * Resources.getSystem().getDisplayMetrics().density);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z) {
        this.f27924j = z;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z) {
        this.f27923i = z;
    }
}
