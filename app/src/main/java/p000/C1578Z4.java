package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;

/* renamed from: Z4 */
/* loaded from: classes.dex */
public final class C1578Z4 extends Drawable implements Drawable.Callback {

    /* renamed from: t */
    public static final /* synthetic */ int f14685t = 0;

    /* renamed from: a */
    public C1389W4 f14686a;

    /* renamed from: b */
    public Rect f14687b;

    /* renamed from: c */
    public Drawable f14688c;

    /* renamed from: d */
    public Drawable f14689d;

    /* renamed from: f */
    public boolean f14691f;

    /* renamed from: h */
    public boolean f14693h;

    /* renamed from: i */
    public GR0 f14694i;

    /* renamed from: j */
    public long f14695j;

    /* renamed from: k */
    public long f14696k;

    /* renamed from: l */
    public C1642a5 f14697l;

    /* renamed from: m */
    public C1389W4 f14698m;

    /* renamed from: n */
    public boolean f14699n;

    /* renamed from: o */
    public C1389W4 f14700o;

    /* renamed from: p */
    public AbstractC8717aN1 f14701p;

    /* renamed from: s */
    public boolean f14704s;

    /* renamed from: e */
    public int f14690e = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: g */
    public int f14692g = -1;

    /* renamed from: q */
    public int f14702q = -1;

    /* renamed from: r */
    public int f14703r = -1;

    public C1578Z4(C1389W4 c1389w4, Resources resources) {
        m9471i(new C1389W4(c1389w4, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C1578Z4 m9463c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1578Z4.m9463c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):Z4");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9464a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f14691f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f14688c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f14695j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f14690e
            r3.setAlpha(r9)
            r13.f14695j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            W4 r10 = r13.f14686a
            int r10 = r10.f12989y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f14690e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f14695j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f14689d
            if (r9 == 0) goto L61
            long r10 = r13.f14696k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f14689d = r0
            r13.f14696k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            W4 r4 = r13.f14686a
            int r4 = r4.f12990z
            int r3 = r3 / r4
            int r4 = r13.f14690e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f14696k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            GR0 r14 = r13.f14694i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1578Z4.m9464a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        m9465b(theme);
        onStateChange(getState());
    }

    /* renamed from: b */
    public final void m9465b(Resources.Theme theme) {
        C1389W4 c1389w4 = this.f14686a;
        if (theme == null) {
            c1389w4.getClass();
            return;
        }
        c1389w4.m8662c();
        int i = c1389w4.f12972h;
        Drawable[] drawableArr = c1389w4.f12971g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && AbstractC4173hL.m18800b(drawable)) {
                AbstractC4173hL.m18799a(drawableArr[i2], theme);
                c1389w4.f12969e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c1389w4.f12966b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = c1389w4.f12967c;
            c1389w4.f12967c = i3;
            if (i4 != i3) {
                c1389w4.f12977m = false;
                c1389w4.f12974j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f14686a.canApplyTheme();
    }

    /* renamed from: d */
    public final void m9466d(Drawable drawable) {
        if (this.f14697l == null) {
            this.f14697l = new C1642a5();
        }
        C1642a5 c1642a5 = this.f14697l;
        c1642a5.f15304b = drawable.getCallback();
        drawable.setCallback(c1642a5);
        try {
            if (this.f14686a.f12989y <= 0 && this.f14691f) {
                drawable.setAlpha(this.f14690e);
            }
            C1389W4 c1389w4 = this.f14686a;
            if (c1389w4.f12957C) {
                drawable.setColorFilter(c1389w4.f12956B);
            } else {
                if (c1389w4.f12960F) {
                    AbstractC4173hL.m18806h(drawable, c1389w4.f12958D);
                }
                C1389W4 c1389w42 = this.f14686a;
                if (c1389w42.f12961G) {
                    AbstractC4173hL.m18807i(drawable, c1389w42.f12959E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14686a.f12987w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC4236iL.m19004b(drawable, AbstractC4236iL.m19003a(this));
            drawable.setAutoMirrored(this.f14686a.f12955A);
            Rect rect = this.f14687b;
            if (rect != null) {
                AbstractC4173hL.m18804f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C1642a5 c1642a52 = this.f14697l;
            Drawable.Callback callback = (Drawable.Callback) c1642a52.f15304b;
            c1642a52.f15304b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C1642a5 c1642a53 = this.f14697l;
            Drawable.Callback callback2 = (Drawable.Callback) c1642a53.f15304b;
            c1642a53.f15304b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f14689d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void m9467e() {
        boolean z;
        Drawable drawable = this.f14689d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f14689d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f14688c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14691f) {
                this.f14688c.setAlpha(this.f14690e);
            }
        }
        if (this.f14696k != 0) {
            this.f14696k = 0L;
            z = true;
        }
        if (this.f14695j != 0) {
            this.f14695j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public final Drawable m9468f() {
        if (!this.f14699n) {
            m9469g();
            C1389W4 c1389w4 = this.f14698m;
            c1389w4.f12963I = c1389w4.f12963I.clone();
            c1389w4.f12964J = c1389w4.f12964J.clone();
            this.f14699n = true;
        }
        return this;
    }

    /* renamed from: g */
    public final Drawable m9469g() {
        if (!this.f14693h && super.mutate() == this) {
            C1389W4 c1389w4 = new C1389W4(this.f14700o, this, null);
            c1389w4.f12963I = c1389w4.f12963I.clone();
            c1389w4.f12964J = c1389w4.f12964J.clone();
            m9471i(c1389w4);
            this.f14693h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14690e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14686a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        C1389W4 c1389w4 = this.f14686a;
        if (!c1389w4.f12985u) {
            c1389w4.m8662c();
            c1389w4.f12985u = true;
            int i = c1389w4.f12972h;
            Drawable[] drawableArr = c1389w4.f12971g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    c1389w4.f12986v = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    c1389w4.f12986v = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = c1389w4.f12986v;
        }
        if (!z) {
            return null;
        }
        this.f14686a.f12968d = getChangingConfigurations();
        return this.f14686a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f14688c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14687b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12976l) {
            if (!c1389w4.f12977m) {
                c1389w4.m8661b();
            }
            return c1389w4.f12979o;
        }
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12976l) {
            if (!c1389w4.f12977m) {
                c1389w4.m8661b();
            }
            return c1389w4.f12978n;
        }
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12976l) {
            if (!c1389w4.f12977m) {
                c1389w4.m8661b();
            }
            return c1389w4.f12981q;
        }
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12976l) {
            if (!c1389w4.f12977m) {
                c1389w4.m8661b();
            }
            return c1389w4.f12980p;
        }
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f14688c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12982r) {
            return c1389w4.f12983s;
        }
        c1389w4.m8662c();
        int i = c1389w4.f12972h;
        Drawable[] drawableArr = c1389w4.f12971g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        c1389w4.f12983s = opacity;
        c1389w4.f12982r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C1389W4 c1389w4 = this.f14686a;
        boolean padding = false;
        Rect rect2 = null;
        if (!c1389w4.f12973i) {
            Rect rect3 = c1389w4.f12975k;
            if (rect3 != null || c1389w4.f12974j) {
                rect2 = rect3;
            } else {
                c1389w4.m8662c();
                Rect rect4 = new Rect();
                int i = c1389w4.f12972h;
                Drawable[] drawableArr = c1389w4.f12971g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                c1389w4.f12974j = true;
                c1389w4.f12975k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f14688c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f14686a.f12955A && AbstractC4236iL.m19003a(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9470h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f14692g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            W4 r0 = r9.f14686a
            int r0 = r0.f12990z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f14689d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f14688c
            if (r0 == 0) goto L29
            r9.f14689d = r0
            W4 r0 = r9.f14686a
            int r0 = r0.f12990z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f14696k = r0
            goto L35
        L29:
            r9.f14689d = r4
            r9.f14696k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f14688c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            W4 r0 = r9.f14686a
            int r1 = r0.f12972h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m8663d(r10)
            r9.f14688c = r0
            r9.f14692g = r10
            if (r0 == 0) goto L5a
            W4 r10 = r9.f14686a
            int r10 = r10.f12989y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f14695j = r2
        L51:
            r9.m9466d(r0)
            goto L5a
        L55:
            r9.f14688c = r4
            r10 = -1
            r9.f14692g = r10
        L5a:
            long r0 = r9.f14695j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f14696k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            GR0 r10 = r9.f14694i
            if (r10 != 0) goto L75
            GR0 r10 = new GR0
            r1 = 14
            r10.<init>(r1, r9)
            r9.f14694i = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.m9464a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1578Z4.m9470h(int):boolean");
    }

    /* renamed from: i */
    public final void m9471i(C1389W4 c1389w4) {
        this.f14686a = c1389w4;
        int i = this.f14692g;
        if (i >= 0) {
            Drawable drawableM8663d = c1389w4.m8663d(i);
            this.f14688c = drawableM8663d;
            if (drawableM8663d != null) {
                m9466d(drawableM8663d);
            }
        }
        this.f14689d = null;
        this.f14698m = c1389w4;
        this.f14700o = c1389w4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4 != null) {
            c1389w4.f12982r = false;
            c1389w4.f12984t = false;
        }
        if (drawable != this.f14688c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f14686a.f12955A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* renamed from: j */
    public final boolean m9472j(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f14689d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f14688c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        m9467e();
        AbstractC8717aN1 abstractC8717aN1 = this.f14701p;
        if (abstractC8717aN1 != null) {
            abstractC8717aN1.mo8291h();
            this.f14701p = null;
            m9470h(this.f14702q);
            this.f14702q = -1;
            this.f14703r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14704s) {
            m9468f();
            C1389W4 c1389w4 = this.f14700o;
            c1389w4.f12963I = c1389w4.f12963I.clone();
            c1389w4.f12964J = c1389w4.f12964J.clone();
            this.f14704s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14689d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14688c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C1389W4 c1389w4 = this.f14686a;
        int i2 = this.f14692g;
        int i3 = c1389w4.f12972h;
        Drawable[] drawableArr = c1389w4.f12971g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zM19004b = AbstractC4236iL.m19004b(drawable, i);
                if (i4 == i2) {
                    z = zM19004b;
                }
            }
        }
        c1389w4.f12988x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f14689d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f14688c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1578Z4.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f14688c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f14691f && this.f14690e == i) {
            return;
        }
        this.f14691f = true;
        this.f14690e = i;
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            if (this.f14695j == 0) {
                drawable.setAlpha(i);
            } else {
                m9464a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12955A != z) {
            c1389w4.f12955A = z;
            Drawable drawable = this.f14688c;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1389W4 c1389w4 = this.f14686a;
        c1389w4.f12957C = true;
        if (c1389w4.f12956B != colorFilter) {
            c1389w4.f12956B = colorFilter;
            Drawable drawable = this.f14688c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        C1389W4 c1389w4 = this.f14686a;
        if (c1389w4.f12987w != z) {
            c1389w4.f12987w = z;
            Drawable drawable = this.f14688c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            AbstractC4173hL.m18803e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f14687b;
        if (rect == null) {
            this.f14687b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f14688c;
        if (drawable != null) {
            AbstractC4173hL.m18804f(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C1389W4 c1389w4 = this.f14686a;
        c1389w4.f12960F = true;
        if (c1389w4.f12958D != colorStateList) {
            c1389w4.f12958D = colorStateList;
            AbstractC4173hL.m18806h(this.f14688c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C1389W4 c1389w4 = this.f14686a;
        c1389w4.f12961G = true;
        if (c1389w4.f12959E != mode) {
            c1389w4.f12959E = mode;
            AbstractC4173hL.m18807i(this.f14688c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zM9472j = m9472j(z, z2);
        AbstractC8717aN1 abstractC8717aN1 = this.f14701p;
        if (abstractC8717aN1 != null && (zM9472j || z2)) {
            if (z) {
                abstractC8717aN1.mo8290g();
            } else {
                jumpToCurrentState();
            }
        }
        return zM9472j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f14688c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
