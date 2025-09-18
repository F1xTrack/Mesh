package p000;

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
public final class ViewOnLongClickListenerC9902jb1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static ViewOnLongClickListenerC9902jb1 f35264k;

    /* renamed from: l */
    public static ViewOnLongClickListenerC9902jb1 f35265l;

    /* renamed from: a */
    public final View f35266a;

    /* renamed from: b */
    public final CharSequence f35267b;

    /* renamed from: c */
    public final int f35268c;

    /* renamed from: d */
    public final RunnableC9774ib1 f35269d;

    /* renamed from: e */
    public final RunnableC9774ib1 f35270e;

    /* renamed from: f */
    public int f35271f;

    /* renamed from: g */
    public int f35272g;

    /* renamed from: h */
    public C10030kb1 f35273h;

    /* renamed from: i */
    public boolean f35274i;

    /* renamed from: j */
    public boolean f35275j;

    /* JADX WARN: Type inference failed for: r0v0, types: [ib1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ib1] */
    public ViewOnLongClickListenerC9902jb1(View view, CharSequence charSequence) {
        final int i = 0;
        this.f35269d = new Runnable(this) { // from class: ib1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC9902jb1 f29363b;

            {
                this.f29363b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i) {
                    case 0:
                        this.f29363b.m22077c(false);
                        break;
                    default:
                        this.f29363b.m22076a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f35270e = new Runnable(this) { // from class: ib1

            /* renamed from: b */
            public final /* synthetic */ ViewOnLongClickListenerC9902jb1 f29363b;

            {
                this.f29363b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f29363b.m22077c(false);
                        break;
                    default:
                        this.f29363b.m22076a();
                        break;
                }
            }
        };
        this.f35266a = view;
        this.f35267b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC11456vk1.f44514a;
        this.f35268c = Build.VERSION.SDK_INT >= 28 ? AbstractC11200tk1.m24977a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f35275j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m22075b(ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb1) {
        ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb12 = f35264k;
        if (viewOnLongClickListenerC9902jb12 != null) {
            viewOnLongClickListenerC9902jb12.f35266a.removeCallbacks(viewOnLongClickListenerC9902jb12.f35269d);
        }
        f35264k = viewOnLongClickListenerC9902jb1;
        if (viewOnLongClickListenerC9902jb1 != null) {
            viewOnLongClickListenerC9902jb1.f35266a.postDelayed(viewOnLongClickListenerC9902jb1.f35269d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m22076a() {
        ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb1 = f35265l;
        View view = this.f35266a;
        if (viewOnLongClickListenerC9902jb1 == this) {
            f35265l = null;
            C10030kb1 c10030kb1 = this.f35273h;
            if (c10030kb1 != null) {
                View view2 = (View) c10030kb1.f36562b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c10030kb1.f36561a).getSystemService("window")).removeView(view2);
                }
                this.f35273h = null;
                this.f35275j = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f35264k == this) {
            m22075b(null);
        }
        view.removeCallbacks(this.f35270e);
    }

    /* renamed from: c */
    public final void m22077c(boolean z) throws Resources.NotFoundException {
        int height;
        int i;
        String str;
        int i2;
        String str2;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f35266a;
        if (view.isAttachedToWindow()) {
            m22075b(null);
            ViewOnLongClickListenerC9902jb1 viewOnLongClickListenerC9902jb1 = f35265l;
            if (viewOnLongClickListenerC9902jb1 != null) {
                viewOnLongClickListenerC9902jb1.m22076a();
            }
            f35265l = this;
            this.f35274i = z;
            C10030kb1 c10030kb1 = new C10030kb1(view.getContext());
            this.f35273h = c10030kb1;
            int width = this.f35271f;
            int i3 = this.f35272g;
            boolean z2 = this.f35274i;
            View view2 = (View) c10030kb1.f36562b;
            ViewParent parent = view2.getParent();
            Context context = (Context) c10030kb1.f36561a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c10030kb1.f36563c).setText(this.f35267b);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c10030kb1.f36564d;
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
                Rect rect = (Rect) c10030kb1.f36565e;
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
                int[] iArr = (int[]) c10030kb1.f36567g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c10030kb1.f36566f;
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
            if (this.f35274i) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC9774ib1 runnableC9774ib1 = this.f35270e;
            view.removeCallbacks(runnableC9774ib1);
            view.postDelayed(runnableC9774ib1, j2);
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
            kb1 r4 = r3.f35273h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f35274i
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f35266a
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
            r3.f35275j = r4
            r3.m22076a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            kb1 r4 = r3.f35273h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f35275j
            if (r1 != 0) goto L66
            int r1 = r3.f35271f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f35268c
            if (r1 > r2) goto L66
            int r1 = r3.f35272g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f35271f = r4
            r3.f35272g = r5
            r3.f35275j = r0
            m22075b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnLongClickListenerC9902jb1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f35271f = view.getWidth() / 2;
        this.f35272g = view.getHeight() / 2;
        m22077c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m22076a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
