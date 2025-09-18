package p000;

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
public final class C10307mm0 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: S */
    public static final boolean f37866S;

    /* renamed from: T */
    public static final List f37867T;

    /* renamed from: U */
    public static final ThreadPoolExecutor f37868U;

    /* renamed from: A */
    public Canvas f37869A;

    /* renamed from: B */
    public Rect f37870B;

    /* renamed from: C */
    public RectF f37871C;

    /* renamed from: D */
    public C8314Tg0 f37872D;

    /* renamed from: E */
    public Rect f37873E;

    /* renamed from: F */
    public Rect f37874F;

    /* renamed from: G */
    public RectF f37875G;

    /* renamed from: H */
    public RectF f37876H;

    /* renamed from: I */
    public Matrix f37877I;

    /* renamed from: J */
    public Matrix f37878J;

    /* renamed from: K */
    public boolean f37879K;

    /* renamed from: L */
    public EnumC7057w9 f37880L;

    /* renamed from: M */
    public final Semaphore f37881M;

    /* renamed from: N */
    public Handler f37882N;

    /* renamed from: O */
    public RunnableC9923jm0 f37883O;

    /* renamed from: P */
    public final RunnableC9923jm0 f37884P;

    /* renamed from: Q */
    public float f37885Q;

    /* renamed from: R */
    public int f37886R;

    /* renamed from: a */
    public C8532Xl0 f37887a;

    /* renamed from: b */
    public final ChoreographerFrameCallbackC11586wm0 f37888b;

    /* renamed from: c */
    public final boolean f37889c;

    /* renamed from: d */
    public boolean f37890d;

    /* renamed from: e */
    public boolean f37891e;

    /* renamed from: f */
    public final ArrayList f37892f;

    /* renamed from: g */
    public C10189lr0 f37893g;

    /* renamed from: h */
    public String f37894h;

    /* renamed from: i */
    public U41 f37895i;

    /* renamed from: j */
    public Map f37896j;

    /* renamed from: k */
    public String f37897k;

    /* renamed from: l */
    public AbstractC1165SW f37898l;

    /* renamed from: m */
    public C9974k91 f37899m;

    /* renamed from: n */
    public final C8342Tu0 f37900n;

    /* renamed from: o */
    public boolean f37901o;

    /* renamed from: p */
    public boolean f37902p;

    /* renamed from: q */
    public C4210hw f37903q;

    /* renamed from: r */
    public int f37904r;

    /* renamed from: s */
    public boolean f37905s;

    /* renamed from: t */
    public boolean f37906t;

    /* renamed from: u */
    public boolean f37907u;

    /* renamed from: v */
    public boolean f37908v;

    /* renamed from: w */
    public XQ0 f37909w;

    /* renamed from: x */
    public boolean f37910x;

    /* renamed from: y */
    public final Matrix f37911y;

    /* renamed from: z */
    public Bitmap f37912z;

    static {
        f37866S = Build.VERSION.SDK_INT <= 25;
        f37867T = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f37868U = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC11459vm0());
    }

    public C10307mm0() {
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = new ChoreographerFrameCallbackC11586wm0();
        this.f37888b = choreographerFrameCallbackC11586wm0;
        this.f37889c = true;
        this.f37890d = false;
        this.f37891e = false;
        this.f37886R = 1;
        this.f37892f = new ArrayList();
        this.f37900n = new C8342Tu0(19);
        this.f37901o = false;
        this.f37902p = true;
        this.f37904r = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f37908v = false;
        this.f37909w = XQ0.f13751a;
        this.f37910x = false;
        this.f37911y = new Matrix();
        this.f37879K = false;
        C0772MG c0772mg = new C0772MG(3, this);
        this.f37881M = new Semaphore(1);
        this.f37884P = new RunnableC9923jm0(this, 1);
        this.f37885Q = -3.4028235E38f;
        choreographerFrameCallbackC11586wm0.addUpdateListener(c0772mg);
    }

    /* renamed from: f */
    public static void m22946f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: a */
    public final void m22947a(final C7948Mf0 c7948Mf0, final ColorFilter colorFilter, final ES1 es1) {
        C4210hw c4210hw = this.f37903q;
        if (c4210hw == null) {
            this.f37892f.add(new InterfaceC10179lm0() { // from class: hm0
                @Override // p000.InterfaceC10179lm0
                public final void run() {
                    this.f28570a.m22947a(c7948Mf0, colorFilter, es1);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c7948Mf0 == C7948Mf0.f7292c) {
            c4210hw.mo1746h(colorFilter, es1);
        } else {
            InterfaceC8000Nf0 interfaceC8000Nf0 = c7948Mf0.f7294b;
            if (interfaceC8000Nf0 != null) {
                interfaceC8000Nf0.mo1746h(colorFilter, es1);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f37903q.mo1743c(c7948Mf0, 0, arrayList, new C7948Mf0(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C7948Mf0) arrayList.get(i)).f7294b.mo1746h(colorFilter, es1);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == InterfaceC10947rm0.f41894z) {
                m22967v(this.f37888b.m25694a());
            }
        }
    }

    /* renamed from: b */
    public final boolean m22948b(Context context) {
        if (this.f37890d) {
            return true;
        }
        if (this.f37889c) {
            if (context == null) {
                return true;
            }
            C6809sD c6809sD = AbstractC7745Ih1.f5085a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m22949c() {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            return;
        }
        C1339VH c1339vh = AbstractC8626Zg0.f15087a;
        Rect rect = c8532Xl0.f13957k;
        C4210hw c4210hw = new C4210hw(this, new C8574Yg0(Collections.emptyList(), c8532Xl0, "__container", -1L, 1, -1L, null, Collections.emptyList(), new C0949P4(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), c8532Xl0.f13956j, c8532Xl0);
        this.f37903q = c4210hw;
        if (this.f37906t) {
            c4210hw.mo18917r(true);
        }
        this.f37903q.f28686J = this.f37902p;
    }

    /* renamed from: d */
    public final void m22950d() {
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        if (choreographerFrameCallbackC11586wm0.f45095m) {
            choreographerFrameCallbackC11586wm0.cancel();
            if (!isVisible()) {
                this.f37886R = 1;
            }
        }
        this.f37887a = null;
        this.f37903q = null;
        this.f37893g = null;
        this.f37885Q = -3.4028235E38f;
        choreographerFrameCallbackC11586wm0.f45094l = null;
        choreographerFrameCallbackC11586wm0.f45092j = -2.1474836E9f;
        choreographerFrameCallbackC11586wm0.f45093k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C8532Xl0 c8532Xl0;
        C4210hw c4210hw = this.f37903q;
        if (c4210hw == null) {
            return;
        }
        EnumC7057w9 enumC7057w9 = this.f37880L;
        if (enumC7057w9 == null) {
            enumC7057w9 = EnumC7057w9.f44698a;
        }
        boolean z = enumC7057w9 == EnumC7057w9.f44699b;
        ThreadPoolExecutor threadPoolExecutor = f37868U;
        Semaphore semaphore = this.f37881M;
        RunnableC9923jm0 runnableC9923jm0 = this.f37884P;
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (c4210hw.f28685I == choreographerFrameCallbackC11586wm0.m25694a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (c4210hw.f28685I != choreographerFrameCallbackC11586wm0.m25694a()) {
                        threadPoolExecutor.execute(runnableC9923jm0);
                    }
                }
                throw th;
            }
        }
        if (z && (c8532Xl0 = this.f37887a) != null) {
            float f = this.f37885Q;
            float fM25694a = choreographerFrameCallbackC11586wm0.m25694a();
            this.f37885Q = fM25694a;
            if (Math.abs(fM25694a - f) * c8532Xl0.m9111b() >= 50.0f) {
                m22967v(choreographerFrameCallbackC11586wm0.m25694a());
            }
        }
        if (this.f37891e) {
            try {
                if (this.f37910x) {
                    m22958m(canvas, c4210hw);
                } else {
                    m22952g(canvas);
                }
            } catch (Throwable unused2) {
                AbstractC11201tl0.f43239a.getClass();
            }
        } else if (this.f37910x) {
            m22958m(canvas, c4210hw);
        } else {
            m22952g(canvas);
        }
        this.f37879K = false;
        if (z) {
            semaphore.release();
            if (c4210hw.f28685I == choreographerFrameCallbackC11586wm0.m25694a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC9923jm0);
        }
    }

    /* renamed from: e */
    public final void m22951e() {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            return;
        }
        XQ0 xq0 = this.f37909w;
        int i = Build.VERSION.SDK_INT;
        boolean z = c8532Xl0.f13961o;
        int i2 = c8532Xl0.f13962p;
        int iOrdinal = xq0.ordinal();
        boolean z2 = false;
        if (iOrdinal != 1 && (iOrdinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
            z2 = true;
        }
        this.f37910x = z2;
    }

    /* renamed from: g */
    public final void m22952g(Canvas canvas) {
        C4210hw c4210hw = this.f37903q;
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c4210hw == null || c8532Xl0 == null) {
            return;
        }
        Matrix matrix = this.f37911y;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / c8532Xl0.f13957k.width(), r3.height() / c8532Xl0.f13957k.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        c4210hw.mo1745f(canvas, matrix, this.f37904r);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f37904r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            return -1;
        }
        return c8532Xl0.f13957k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            return -1;
        }
        return c8532Xl0.f13957k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final Context m22953h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: i */
    public final U41 m22954i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f37895i == null) {
            Drawable.Callback callback = getCallback();
            AbstractC1165SW abstractC1165SW = this.f37898l;
            U41 u41 = new U41();
            u41.f11644a = new C0626Jw();
            u41.f11645b = new HashMap();
            u41.f11646c = new HashMap();
            u41.f11649f = ".ttf";
            u41.f11648e = abstractC1165SW;
            if (callback instanceof View) {
                u41.f11647d = ((View) callback).getContext().getAssets();
            } else {
                AbstractC11201tl0.m24980b("LottieDrawable must be inside of a view for images to work.");
                u41.f11647d = null;
            }
            this.f37895i = u41;
            String str = this.f37897k;
            if (str != null) {
                u41.f11649f = str;
            }
        }
        return this.f37895i;
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
        if (this.f37879K) {
            return;
        }
        this.f37879K = true;
        if ((!f37866S || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m22955j();
    }

    /* renamed from: j */
    public final boolean m22955j() {
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        if (choreographerFrameCallbackC11586wm0 == null) {
            return false;
        }
        return choreographerFrameCallbackC11586wm0.f45095m;
    }

    /* renamed from: k */
    public final void m22956k() {
        this.f37892f.clear();
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        choreographerFrameCallbackC11586wm0.m25700l(true);
        Iterator it = choreographerFrameCallbackC11586wm0.f45085c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC11586wm0);
        }
        if (isVisible()) {
            return;
        }
        this.f37886R = 1;
    }

    /* renamed from: l */
    public final void m22957l() {
        if (this.f37903q == null) {
            this.f37892f.add(new C10051km0(this, 1));
            return;
        }
        m22951e();
        boolean zM22948b = m22948b(m22953h());
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        if (zM22948b || choreographerFrameCallbackC11586wm0.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC11586wm0.f45095m = true;
                boolean zM25697i = choreographerFrameCallbackC11586wm0.m25697i();
                Iterator it = choreographerFrameCallbackC11586wm0.f45084b.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC11586wm0, zM25697i);
                    } else {
                        animatorListener.onAnimationStart(choreographerFrameCallbackC11586wm0);
                    }
                }
                choreographerFrameCallbackC11586wm0.m25701m((int) (choreographerFrameCallbackC11586wm0.m25697i() ? choreographerFrameCallbackC11586wm0.m25695e() : choreographerFrameCallbackC11586wm0.m25696h()));
                choreographerFrameCallbackC11586wm0.f45088f = 0L;
                choreographerFrameCallbackC11586wm0.f45091i = 0;
                if (choreographerFrameCallbackC11586wm0.f45095m) {
                    choreographerFrameCallbackC11586wm0.m25700l(false);
                    Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC11586wm0);
                }
                this.f37886R = 1;
            } else {
                this.f37886R = 2;
            }
        }
        if (m22948b(m22953h())) {
            return;
        }
        Iterator it2 = f37867T.iterator();
        C11333un0 c11333un0M9113d = null;
        while (it2.hasNext()) {
            c11333un0M9113d = this.f37887a.m9113d((String) it2.next());
            if (c11333un0M9113d != null) {
                break;
            }
        }
        if (c11333un0M9113d != null) {
            m22960o((int) c11333un0M9113d.f43863b);
        } else {
            m22960o((int) (choreographerFrameCallbackC11586wm0.f45086d < 0.0f ? choreographerFrameCallbackC11586wm0.m25696h() : choreographerFrameCallbackC11586wm0.m25695e()));
        }
        choreographerFrameCallbackC11586wm0.m25700l(true);
        choreographerFrameCallbackC11586wm0.m25698j(choreographerFrameCallbackC11586wm0.m25697i());
        if (isVisible()) {
            return;
        }
        this.f37886R = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22958m(android.graphics.Canvas r10, p000.C4210hw r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10307mm0.m22958m(android.graphics.Canvas, hw):void");
    }

    /* renamed from: n */
    public final void m22959n() {
        if (this.f37903q == null) {
            this.f37892f.add(new C10051km0(this, 0));
            return;
        }
        m22951e();
        boolean zM22948b = m22948b(m22953h());
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        if (zM22948b || choreographerFrameCallbackC11586wm0.getRepeatCount() == 0) {
            if (isVisible()) {
                choreographerFrameCallbackC11586wm0.f45095m = true;
                choreographerFrameCallbackC11586wm0.m25700l(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC11586wm0);
                choreographerFrameCallbackC11586wm0.f45088f = 0L;
                if (choreographerFrameCallbackC11586wm0.m25697i() && choreographerFrameCallbackC11586wm0.f45090h == choreographerFrameCallbackC11586wm0.m25696h()) {
                    choreographerFrameCallbackC11586wm0.m25701m(choreographerFrameCallbackC11586wm0.m25695e());
                } else if (!choreographerFrameCallbackC11586wm0.m25697i() && choreographerFrameCallbackC11586wm0.f45090h == choreographerFrameCallbackC11586wm0.m25695e()) {
                    choreographerFrameCallbackC11586wm0.m25701m(choreographerFrameCallbackC11586wm0.m25696h());
                }
                Iterator it = choreographerFrameCallbackC11586wm0.f45085c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(choreographerFrameCallbackC11586wm0);
                }
                this.f37886R = 1;
            } else {
                this.f37886R = 3;
            }
        }
        if (m22948b(m22953h())) {
            return;
        }
        m22960o((int) (choreographerFrameCallbackC11586wm0.f45086d < 0.0f ? choreographerFrameCallbackC11586wm0.m25696h() : choreographerFrameCallbackC11586wm0.m25695e()));
        choreographerFrameCallbackC11586wm0.m25700l(true);
        choreographerFrameCallbackC11586wm0.m25698j(choreographerFrameCallbackC11586wm0.m25697i());
        if (isVisible()) {
            return;
        }
        this.f37886R = 1;
    }

    /* renamed from: o */
    public final void m22960o(int i) {
        if (this.f37887a == null) {
            this.f37892f.add(new C9539gm0(this, i, 2));
        } else {
            this.f37888b.m25701m(i);
        }
    }

    /* renamed from: p */
    public final void m22961p(int i) {
        if (this.f37887a == null) {
            this.f37892f.add(new C9539gm0(this, i, 0));
            return;
        }
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        choreographerFrameCallbackC11586wm0.m25702n(choreographerFrameCallbackC11586wm0.f45092j, i + 0.99f);
    }

    /* renamed from: q */
    public final void m22962q(String str) {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            this.f37892f.add(new C9283em0(this, str, 1));
            return;
        }
        C11333un0 c11333un0M9113d = c8532Xl0.m9113d(str);
        if (c11333un0M9113d == null) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Cannot find marker with name ", str, "."));
        }
        m22961p((int) (c11333un0M9113d.f43863b + c11333un0M9113d.f43864c));
    }

    /* renamed from: r */
    public final void m22963r(final int i, final int i2) {
        if (this.f37887a == null) {
            this.f37892f.add(new InterfaceC10179lm0() { // from class: fm0
                @Override // p000.InterfaceC10179lm0
                public final void run() {
                    this.f27377a.m22963r(i, i2);
                }
            });
        } else {
            this.f37888b.m25702n(i, i2 + 0.99f);
        }
    }

    /* renamed from: s */
    public final void m22964s(String str) {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            this.f37892f.add(new C9283em0(this, str, 0));
            return;
        }
        C11333un0 c11333un0M9113d = c8532Xl0.m9113d(str);
        if (c11333un0M9113d == null) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Cannot find marker with name ", str, "."));
        }
        int i = (int) c11333un0M9113d.f43863b;
        m22963r(i, ((int) c11333un0M9113d.f43864c) + i);
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
        this.f37904r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC11201tl0.m24980b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.f37886R;
            if (i == 2) {
                m22957l();
            } else if (i == 3) {
                m22959n();
            }
        } else if (this.f37888b.f45095m) {
            m22956k();
            this.f37886R = 3;
        } else if (zIsVisible) {
            this.f37886R = 1;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m22957l();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f37892f.clear();
        ChoreographerFrameCallbackC11586wm0 choreographerFrameCallbackC11586wm0 = this.f37888b;
        choreographerFrameCallbackC11586wm0.m25700l(true);
        choreographerFrameCallbackC11586wm0.m25698j(choreographerFrameCallbackC11586wm0.m25697i());
        if (isVisible()) {
            return;
        }
        this.f37886R = 1;
    }

    /* renamed from: t */
    public final void m22965t(int i) {
        if (this.f37887a == null) {
            this.f37892f.add(new C9539gm0(this, i, 1));
        } else {
            this.f37888b.m25702n(i, (int) r0.f45093k);
        }
    }

    /* renamed from: u */
    public final void m22966u(String str) {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            this.f37892f.add(new C9283em0(this, str, 2));
            return;
        }
        C11333un0 c11333un0M9113d = c8532Xl0.m9113d(str);
        if (c11333un0M9113d == null) {
            throw new IllegalArgumentException(AbstractC7222ym.m26234k("Cannot find marker with name ", str, "."));
        }
        m22965t((int) c11333un0M9113d.f43863b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public final void m22967v(float f) {
        C8532Xl0 c8532Xl0 = this.f37887a;
        if (c8532Xl0 == null) {
            this.f37892f.add(new C9795im0(this, f, 2));
        } else {
            this.f37888b.m25701m(AbstractC8778as0.m10353e(c8532Xl0.f13958l, c8532Xl0.f13959m, f));
        }
    }
}
