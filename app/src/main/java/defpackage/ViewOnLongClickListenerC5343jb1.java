package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: jb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC5343jb1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static ViewOnLongClickListenerC5343jb1 k;
    public static ViewOnLongClickListenerC5343jb1 l;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final RunnableC4376ib1 d;
    public final RunnableC4376ib1 e;
    public int f;
    public int g;
    public C5534kb1 h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [ib1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ib1] */
    public ViewOnLongClickListenerC5343jb1(View view, CharSequence charSequence) {
        final int i = 0;
        this.d = new Runnable(this) { // from class: ib1
            public final /* synthetic */ ViewOnLongClickListenerC5343jb1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.e = new Runnable(this) { // from class: ib1
            public final /* synthetic */ ViewOnLongClickListenerC5343jb1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC7661vk1.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? AbstractC7279tk1.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb1) {
        ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb12 = k;
        if (viewOnLongClickListenerC5343jb12 != null) {
            viewOnLongClickListenerC5343jb12.a.removeCallbacks(viewOnLongClickListenerC5343jb12.d);
        }
        k = viewOnLongClickListenerC5343jb1;
        if (viewOnLongClickListenerC5343jb1 != null) {
            viewOnLongClickListenerC5343jb1.a.postDelayed(viewOnLongClickListenerC5343jb1.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb1 = l;
        View view = this.a;
        if (viewOnLongClickListenerC5343jb1 == this) {
            l = null;
            C5534kb1 c5534kb1 = this.h;
            if (c5534kb1 != null) {
                View view2 = (View) c5534kb1.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c5534kb1.a).getSystemService("window")).removeView(view2);
                }
                this.h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (k == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            ViewOnLongClickListenerC5343jb1 viewOnLongClickListenerC5343jb1 = l;
            if (viewOnLongClickListenerC5343jb1 != null) {
                viewOnLongClickListenerC5343jb1.a();
            }
            l = this;
            this.i = z;
            C5534kb1 c5534kb1 = new C5534kb1(view.getContext());
            this.h = c5534kb1;
            int width = this.f;
            int i3 = this.g;
            boolean z2 = this.i;
            View view2 = (View) c5534kb1.b;
            ViewParent parent = view2.getParent();
            Context context = (Context) c5534kb1.a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c5534kb1.c).setText(this.b);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c5534kb1.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView == null) {
                str2 = "window";
            } else {
                Rect rect = (Rect) c5534kb1.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c5534kb1.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c5534kb1.f;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
                str2 = str;
            }
            ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC4376ib1 runnableC4376ib1 = this.e;
            view.removeCallbacks(runnableC4376ib1);
            view.postDelayed(runnableC4376ib1, j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            kb1 r4 = r3.h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.i
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.j = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            kb1 r4 = r3.h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.j
            if (r1 != 0) goto L66
            int r1 = r3.f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.c
            if (r1 > r2) goto L66
            int r1 = r3.g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f = r4
            r3.g = r5
            r3.j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnLongClickListenerC5343jb1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
