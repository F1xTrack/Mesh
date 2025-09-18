package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* renamed from: mm0 */
/* loaded from: classes.dex */
public final class C5948mm0 extends Drawable implements Drawable.Callback, Animatable {
    public static final boolean S;
    public static final List T;
    public static final ThreadPoolExecutor U;
    public Canvas A;
    public Rect B;
    public RectF C;
    public C1520Tg0 D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public Matrix J;
    public boolean K;
    public EnumC7738w9 L;
    public final Semaphore M;
    public Handler N;
    public RunnableC5375jm0 O;
    public final RunnableC5375jm0 P;
    public float Q;
    public int R;
    public C1847Xl0 a;
    public final ChoreographerFrameCallbackC7856wm0 b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public C5772lr0 g;
    public String h;
    public U41 i;
    public Map j;
    public String k;
    public SW l;
    public C5450k91 m;
    public final C1562Tu0 n;
    public boolean o;
    public boolean p;
    public C4246hw q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public XQ0 w;
    public boolean x;
    public final Matrix y;
    public Bitmap z;

    static {
        S = Build.VERSION.SDK_INT <= 25;
        T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        U = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7666vm0());
    }

    public C5948mm0() {
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = new ChoreographerFrameCallbackC7856wm0();
        this.b = choreographerFrameCallbackC7856wm0;
        this.c = true;
        this.d = false;
        this.e = false;
        this.R = 1;
        this.f = new ArrayList();
        this.n = new C1562Tu0(19);
        this.o = false;
        this.p = true;
        this.r = KotlinVersion.MAX_COMPONENT_VALUE;
        this.v = false;
        this.w = XQ0.a;
        this.x = false;
        this.y = new Matrix();
        this.K = false;
        MG mg = new MG(3, this);
        this.M = new Semaphore(1);
        this.P = new RunnableC5375jm0(this, 1);
        this.Q = -3.4028235E38f;
        choreographerFrameCallbackC7856wm0.addUpdateListener(mg);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final C0971Mf0 c0971Mf0, final ColorFilter colorFilter, final ES1 es1) {
        C4246hw c4246hw = this.q;
        if (c4246hw == null) {
            this.f.add(new InterfaceC5757lm0() { // from class: hm0
                @Override // defpackage.InterfaceC5757lm0
                public final void run() {
                    this.a.a(c0971Mf0, colorFilter, es1);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c0971Mf0 == C0971Mf0.c) {
            c4246hw.h(colorFilter, es1);
        } else {
            InterfaceC1049Nf0 interfaceC1049Nf0 = c0971Mf0.b;
            if (interfaceC1049Nf0 != null) {
                interfaceC1049Nf0.h(colorFilter, es1);
            } else {
                ArrayList arrayList = new ArrayList();
                this.q.c(c0971Mf0, 0, arrayList, new C0971Mf0(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C0971Mf0) arrayList.get(i)).b.h(colorFilter, es1);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == InterfaceC6902rm0.z) {
                v(this.b.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (this.c) {
            if (context == null) {
                return true;
            }
            C6987sD c6987sD = AbstractC0667Ih1.a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            return;
        }
        VH vh = AbstractC1988Zg0.a;
        Rect rect = c1847Xl0.k;
        C4246hw c4246hw = new C4246hw(this, new C1910Yg0(Collections.emptyList(), c1847Xl0, "__container", -1L, 1, -1L, null, Collections.emptyList(), new P4(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), c1847Xl0.j, c1847Xl0);
        this.q = c4246hw;
        if (this.t) {
            c4246hw.r(true);
        }
        this.q.J = this.p;
    }

    public final void d() {
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        if (choreographerFrameCallbackC7856wm0.m) {
            choreographerFrameCallbackC7856wm0.cancel();
            if (!isVisible()) {
                this.R = 1;
            }
        }
        this.a = null;
        this.q = null;
        this.g = null;
        this.Q = -3.4028235E38f;
        choreographerFrameCallbackC7856wm0.l = null;
        choreographerFrameCallbackC7856wm0.j = -2.1474836E9f;
        choreographerFrameCallbackC7856wm0.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1847Xl0 c1847Xl0;
        C4246hw c4246hw = this.q;
        if (c4246hw == null) {
            return;
        }
        EnumC7738w9 enumC7738w9 = this.L;
        if (enumC7738w9 == null) {
            enumC7738w9 = EnumC7738w9.a;
        }
        boolean z = enumC7738w9 == EnumC7738w9.b;
        ThreadPoolExecutor threadPoolExecutor = U;
        Semaphore semaphore = this.M;
        RunnableC5375jm0 runnableC5375jm0 = this.P;
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (c4246hw.I == choreographerFrameCallbackC7856wm0.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (c4246hw.I != choreographerFrameCallbackC7856wm0.a()) {
                        threadPoolExecutor.execute(runnableC5375jm0);
                    }
                }
                throw th;
            }
        }
        if (z && (c1847Xl0 = this.a) != null) {
            float f = this.Q;
            float fA = choreographerFrameCallbackC7856wm0.a();
            this.Q = fA;
            if (Math.abs(fA - f) * c1847Xl0.b() >= 50.0f) {
                v(choreographerFrameCallbackC7856wm0.a());
            }
        }
        if (this.e) {
            try {
                if (this.x) {
                    m(canvas, c4246hw);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC7281tl0.a.getClass();
            }
        } else if (this.x) {
            m(canvas, c4246hw);
        } else {
            g(canvas);
        }
        this.K = false;
        if (z) {
            semaphore.release();
            if (c4246hw.I == choreographerFrameCallbackC7856wm0.a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC5375jm0);
        }
    }

    public final void e() {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            return;
        }
        XQ0 xq0 = this.w;
        int i = Build.VERSION.SDK_INT;
        boolean z = c1847Xl0.o;
        int i2 = c1847Xl0.p;
        int iOrdinal = xq0.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.x = z2;
    }

    public final void g(Canvas canvas) {
        C4246hw c4246hw = this.q;
        C1847Xl0 c1847Xl0 = this.a;
        if (c4246hw == null || c1847Xl0 == null) {
            return;
        }
        Matrix matrix = this.y;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / c1847Xl0.k.width(), r3.height() / c1847Xl0.k.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        c4246hw.f(canvas, matrix, this.r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            return -1;
        }
        return c1847Xl0.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            return -1;
        }
        return c1847Xl0.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public final U41 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.i == null) {
            Drawable.Callback callback = getCallback();
            SW sw = this.l;
            U41 u41 = new U41();
            u41.a = new C0788Jw();
            u41.b = new HashMap();
            u41.c = new HashMap();
            u41.f = ".ttf";
            u41.e = sw;
            if (callback instanceof View) {
                u41.d = ((View) callback).getContext().getAssets();
            } else {
                AbstractC7281tl0.b("LottieDrawable must be inside of a view for images to work.");
                u41.d = null;
            }
            this.i = u41;
            String str = this.k;
            if (str != null) {
                u41.f = str;
            }
        }
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.K) {
            return;
        }
        this.K = true;
        if ((!S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return j();
    }

    public final boolean j() {
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        if (choreographerFrameCallbackC7856wm0 == null) {
            return false;
        }
        return choreographerFrameCallbackC7856wm0.m;
    }

    public final void k() {
        this.f.clear();
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        choreographerFrameCallbackC7856wm0.l(true);
        Iterator it = choreographerFrameCallbackC7856wm0.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC7856wm0);
        }
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void l() {
        if (this.q == null) {
            this.f.add(new C5566km0(this, 1));
            return;
        }
        e();
        boolean zB = b(h());
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        if (zB || choreographerFrameCallbackC7856wm0.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC7856wm0.m = true;
                boolean zI = choreographerFrameCallbackC7856wm0.i();
                Iterator it = choreographerFrameCallbackC7856wm0.b.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC7856wm0, zI);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC7856wm0);
                    }
                }
                choreographerFrameCallbackC7856wm0.m((int) (choreographerFrameCallbackC7856wm0.i() ? choreographerFrameCallbackC7856wm0.e() : choreographerFrameCallbackC7856wm0.h()));
                choreographerFrameCallbackC7856wm0.f = 0L;
                choreographerFrameCallbackC7856wm0.i = 0;
                if (choreographerFrameCallbackC7856wm0.m) {
                    choreographerFrameCallbackC7856wm0.l(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC7856wm0);
                }
                this.R = 1;
            } else {
                this.R = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = T.iterator();
        C7478un0 c7478un0D = null;
        while (it2.hasNext()) {
            c7478un0D = this.a.d((String) it2.next());
            if (c7478un0D != null) {
                break;
            }
        }
        if (c7478un0D != null) {
            o((int) c7478un0D.b);
        } else {
            o((int) (choreographerFrameCallbackC7856wm0.d < 0.0f ? choreographerFrameCallbackC7856wm0.h() : choreographerFrameCallbackC7856wm0.e()));
        }
        choreographerFrameCallbackC7856wm0.l(true);
        choreographerFrameCallbackC7856wm0.j(choreographerFrameCallbackC7856wm0.i());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.graphics.Canvas r10, defpackage.C4246hw r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5948mm0.m(android.graphics.Canvas, hw):void");
    }

    public final void n() {
        if (this.q == null) {
            this.f.add(new C5566km0(this, 0));
            return;
        }
        e();
        boolean zB = b(h());
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        if (zB || choreographerFrameCallbackC7856wm0.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC7856wm0.m = true;
                choreographerFrameCallbackC7856wm0.l(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC7856wm0);
                choreographerFrameCallbackC7856wm0.f = 0L;
                if (choreographerFrameCallbackC7856wm0.i() && choreographerFrameCallbackC7856wm0.h == choreographerFrameCallbackC7856wm0.h()) {
                    choreographerFrameCallbackC7856wm0.m(choreographerFrameCallbackC7856wm0.e());
                } else if (!choreographerFrameCallbackC7856wm0.i() && choreographerFrameCallbackC7856wm0.h == choreographerFrameCallbackC7856wm0.e()) {
                    choreographerFrameCallbackC7856wm0.m(choreographerFrameCallbackC7856wm0.h());
                }
                Iterator it = choreographerFrameCallbackC7856wm0.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC7856wm0);
                }
                this.R = 1;
            } else {
                this.R = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (choreographerFrameCallbackC7856wm0.d < 0.0f ? choreographerFrameCallbackC7856wm0.h() : choreographerFrameCallbackC7856wm0.e()));
        choreographerFrameCallbackC7856wm0.l(true);
        choreographerFrameCallbackC7856wm0.j(choreographerFrameCallbackC7856wm0.i());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void o(int i) {
        if (this.a == null) {
            this.f.add(new C4026gm0(this, i, 2));
        } else {
            this.b.m(i);
        }
    }

    public final void p(int i) {
        if (this.a == null) {
            this.f.add(new C4026gm0(this, i, 0));
            return;
        }
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        choreographerFrameCallbackC7856wm0.n(choreographerFrameCallbackC7856wm0.j, i + 0.99f);
    }

    public final void q(String str) {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            this.f.add(new C3644em0(this, str, 1));
            return;
        }
        C7478un0 c7478un0D = c1847Xl0.d(str);
        if (c7478un0D == null) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Cannot find marker with name ", str, "."));
        }
        p((int) (c7478un0D.b + c7478un0D.c));
    }

    public final void r(final int i, final int i2) {
        if (this.a == null) {
            this.f.add(new InterfaceC5757lm0() { // from class: fm0
                @Override // defpackage.InterfaceC5757lm0
                public final void run() {
                    this.a.r(i, i2);
                }
            });
        } else {
            this.b.n(i, i2 + 0.99f);
        }
    }

    public final void s(String str) {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            this.f.add(new C3644em0(this, str, 0));
            return;
        }
        C7478un0 c7478un0D = c1847Xl0.d(str);
        if (c7478un0D == null) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Cannot find marker with name ", str, "."));
        }
        int i = (int) c7478un0D.b;
        r(i, ((int) c7478un0D.c) + i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC7281tl0.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.R;
            if (i == 2) {
                l();
            } else if (i == 3) {
                n();
            }
        } else if (this.b.m) {
            k();
            this.R = 3;
        } else if (zIsVisible) {
            this.R = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        ChoreographerFrameCallbackC7856wm0 choreographerFrameCallbackC7856wm0 = this.b;
        choreographerFrameCallbackC7856wm0.l(true);
        choreographerFrameCallbackC7856wm0.j(choreographerFrameCallbackC7856wm0.i());
        if (isVisible()) {
            return;
        }
        this.R = 1;
    }

    public final void t(int i) {
        if (this.a == null) {
            this.f.add(new C4026gm0(this, i, 1));
        } else {
            this.b.n(i, (int) r0.k);
        }
    }

    public final void u(String str) {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            this.f.add(new C3644em0(this, str, 2));
            return;
        }
        C7478un0 c7478un0D = c1847Xl0.d(str);
        if (c7478un0D == null) {
            throw new IllegalArgumentException(AbstractC8235ym.k("Cannot find marker with name ", str, "."));
        }
        t((int) c7478un0D.b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(float f) {
        C1847Xl0 c1847Xl0 = this.a;
        if (c1847Xl0 == null) {
            this.f.add(new C4407im0(this, f, 2));
        } else {
            this.b.m(AbstractC2215as0.e(c1847Xl0.l, c1847Xl0.m, f));
        }
    }
}
