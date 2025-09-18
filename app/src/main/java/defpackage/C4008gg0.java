package defpackage;

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
import com.facebook.react.views.view.a;
import java.util.WeakHashMap;

/* renamed from: gg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4008gg0 extends a {
    public final S91 a;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public C3990ga0 h;
    public boolean i;
    public boolean j;
    public final Rect k;
    public final C2226aw l;
    public VelocityTracker m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4008gg0(S91 s91) {
        super(s91);
        O90.f(s91, "reactContext");
        this.a = s91;
        this.h = new C3990ga0(1);
        this.j = true;
        this.k = new Rect();
        this.l = new C2226aw(5);
    }

    private final int getWindowHeight() {
        Rect bounds;
        WindowManager windowManager;
        Activity currentActivity = this.a.a.getCurrentActivity();
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
        C2204ao1 c2204ao1 = null;
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        Rect rect = this.k;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            UJ1.a(this, rect);
            this.e = rect.top;
        } else {
            C2226aw c2226aw = this.l;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                UJ1.a(this, rect);
                int i = rect.top - this.e;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(0.0f, i);
                VelocityTracker velocityTracker2 = this.m;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEventObtain);
                }
                float x = motionEventObtain.getX() - this.c;
                float y = motionEventObtain.getY() - this.d;
                if (!this.b) {
                    this.b = Math.abs(y) > Math.abs(x) && Math.abs(y) >= ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
                }
                if (this.b) {
                    if (((C5826m71) c2226aw.b) != null) {
                        if (this.f == 0) {
                            this.f = c2226aw.h();
                        }
                        C3990ga0 c3990ga0 = this.h;
                        ?? B = AbstractC3857ft1.b(y);
                        int windowHeight = getWindowHeight() - ((int) motionEvent.getRawY());
                        int iH = c2226aw.h();
                        int i2 = this.g;
                        ?? r2 = B;
                        switch (c3990ga0.a) {
                            case 0:
                                r2 = (windowHeight <= iH + i2 || B <= 0) ? B : false;
                                break;
                        }
                        if (r2 != 0) {
                            C5826m71 c5826m71 = (C5826m71) c2226aw.b;
                            if (c5826m71 == null) {
                                throw new IllegalStateException("Current WindowInsetsAnimationController is null.This should only be called if isAnimationInProgress() returns true");
                            }
                            AbstractC6001n22.a = true;
                            c2226aw.i(c5826m71.i().d - r2);
                        }
                    } else if (((CancellationSignal) c2226aw.d) == null) {
                        WeakHashMap weakHashMap = AbstractC6897rk1.a;
                        C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(this);
                        boolean z = c1698Vn1A != null && c1698Vn1A.a.o(8);
                        if (y >= 0.0f ? !(y <= 0.0f || !z || !this.j) : !(z || !this.i)) {
                            if (((C5826m71) c2226aw.b) != null) {
                                throw new IllegalStateException("Animation in progress. Can not start a new request to controlWindowInsetsAnimation()");
                            }
                            C1698Vn1 c1698Vn1A2 = AbstractC4212hk1.a(this);
                            if (c1698Vn1A2 != null && c1698Vn1A2.a.o(8)) {
                                z = true;
                            }
                            c2226aw.c = z;
                            c2226aw.d = new CancellationSignal();
                            c2226aw.e = null;
                            AbstractC6001n22.a = true;
                            if (Build.VERSION.SDK_INT >= 30) {
                                c2204ao1 = AbstractC5943mk1.c(this);
                            } else {
                                Context context = getContext();
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        break;
                                    }
                                    if (context instanceof Activity) {
                                        Window window = ((Activity) context).getWindow();
                                        if (window != null) {
                                            c2204ao1 = new C2204ao1(window, this);
                                        }
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                            }
                            if (c2204ao1 != null) {
                                c2204ao1.a.a(AbstractC1985Zf0.a, (CancellationSignal) c2226aw.d, (C1907Yf0) ((F71) c2226aw.f).getValue());
                            }
                        }
                    }
                    this.d = motionEvent.getY();
                    this.c = motionEvent.getX();
                    this.e = rect.top;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                VelocityTracker velocityTracker3 = this.m;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                VelocityTracker velocityTracker4 = this.m;
                if (velocityTracker4 != null) {
                    velocityTracker4.computeCurrentVelocity(500);
                }
                VelocityTracker velocityTracker5 = this.m;
                Float fValueOf = velocityTracker5 != null ? Float.valueOf(velocityTracker5.getYVelocity()) : null;
                if (((C5826m71) c2226aw.b) != null && this.f == c2226aw.h()) {
                    fValueOf = null;
                }
                C5826m71 c5826m712 = (C5826m71) c2226aw.b;
                if (c5826m712 == null) {
                    CancellationSignal cancellationSignal = (CancellationSignal) c2226aw.d;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                } else {
                    AbstractC6001n22.a = false;
                    J80 j80I = c5826m712.i();
                    C5996n11 c5996n11 = (C5996n11) c5826m712.b;
                    J80 j80C = J80.c(((WindowInsetsAnimationController) c5996n11.b).getShownStateInsets());
                    J80 j80C2 = J80.c(((WindowInsetsAnimationController) c5996n11.b).getHiddenStateInsets());
                    if (fValueOf != null) {
                        c2226aw.a(fValueOf, fValueOf.floatValue() < 0.0f);
                    } else {
                        int i3 = j80C.d;
                        int i4 = j80I.d;
                        if (i4 == i3) {
                            c5826m712.g(true);
                        } else if (i4 == j80C2.d) {
                            c5826m712.g(false);
                        } else if (((WindowInsetsAnimationController) c5996n11.b).getCurrentFraction() >= 0.15f) {
                            c2226aw.a(null, !c2226aw.c);
                        } else {
                            c2226aw.a(null, c2226aw.c);
                        }
                    }
                }
                l();
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                C5826m71 c5826m713 = (C5826m71) c2226aw.b;
                if (c5826m713 != null) {
                    c5826m713.g(c2226aw.c);
                }
                CancellationSignal cancellationSignal2 = (CancellationSignal) c2226aw.d;
                if (cancellationSignal2 != null) {
                    cancellationSignal2.cancel();
                }
                C8292z31 c8292z31 = (C8292z31) c2226aw.g;
                if (c8292z31 != null) {
                    c8292z31.a();
                }
                c2226aw.k();
                l();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void l() {
        this.b = false;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0;
        this.f = 0;
        this.k.setEmpty();
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.m = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void setInterpolator(String str) {
        O90.f(str, "interpolator");
        C3990ga0 c3990ga0 = (C3990ga0) AbstractC4199hg0.a.get(str);
        if (c3990ga0 == null) {
            c3990ga0 = new C3990ga0(1);
        }
        this.h = c3990ga0;
    }

    public final void setOffset(double d) {
        this.g = (int) (((float) d) * Resources.getSystem().getDisplayMetrics().density);
    }

    public final void setScrollKeyboardOffScreenWhenVisible(boolean z) {
        this.j = z;
    }

    public final void setScrollKeyboardOnScreenWhenNotVisible(boolean z) {
        this.i = z;
    }
}
