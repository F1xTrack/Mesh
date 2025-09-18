package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.DefaultTimeBar;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.mes.dnevnik.R;

/* renamed from: pi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6509pi0 extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public IB0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public long[] V;
    public boolean[] W;
    public final ViewOnClickListenerC6127ni0 a;
    public final long[] a0;
    public final CopyOnWriteArrayList b;
    public final boolean[] b0;
    public final View c;
    public long c0;
    public final View d;
    public long d0;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final InterfaceC5531ka1 n;
    public final StringBuilder o;
    public final Formatter p;
    public final C0022Aa1 q;
    public final C0100Ba1 r;
    public final RunnableC5745li0 s;
    public final RunnableC5745li0 t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public final String y;
    public final String z;

    static {
        AbstractC6911rp0.a("media3.ui");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [li0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [li0] */
    public C6509pi0(Context context) {
        super(context, null, 0);
        this.J = true;
        this.M = 5000;
        this.O = 0;
        this.N = 200;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        this.b = new CopyOnWriteArrayList();
        this.q = new C0022Aa1();
        this.r = new C0100Ba1();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.a0 = new long[0];
        this.b0 = new boolean[0];
        ViewOnClickListenerC6127ni0 viewOnClickListenerC6127ni0 = new ViewOnClickListenerC6127ni0(this);
        this.a = viewOnClickListenerC6127ni0;
        final int i = 0;
        this.s = new Runnable(this) { // from class: li0
            public final /* synthetic */ C6509pi0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.i();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.t = new Runnable(this) { // from class: li0
            public final /* synthetic */ C6509pi0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.i();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.exo_legacy_player_control_view, this);
        setDescendantFocusability(262144);
        InterfaceC5531ka1 interfaceC5531ka1 = (InterfaceC5531ka1) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC5531ka1 != null) {
            this.n = interfaceC5531ka1;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, null);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.n = defaultTimeBar;
        } else {
            this.n = null;
        }
        this.l = (TextView) findViewById(R.id.exo_duration);
        this.m = (TextView) findViewById(R.id.exo_position);
        InterfaceC5531ka1 interfaceC5531ka12 = this.n;
        if (interfaceC5531ka12 != null) {
            ((DefaultTimeBar) interfaceC5531ka12).x.add(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC6127ni0);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.k = viewFindViewById8;
        setShowVrButton(false);
        f(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.u = AbstractC0277Dh1.u(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.v = AbstractC0277Dh1.u(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.w = AbstractC0277Dh1.u(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.A = AbstractC0277Dh1.u(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.B = AbstractC0277Dh1.u(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.x = resources.getString(R.string.exo_controls_repeat_off_description);
        this.y = resources.getString(R.string.exo_controls_repeat_one_description);
        this.z = resources.getString(R.string.exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.d0 = -9223372036854775807L;
    }

    public final void a() {
        if (c()) {
            setVisibility(8);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((C5864mK0) it.next()).a.a.o.invoke(Boolean.valueOf(getVisibility() == 0));
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.U = -9223372036854775807L;
        }
    }

    public final void b() {
        RunnableC5745li0 runnableC5745li0 = this.t;
        removeCallbacks(runnableC5745li0);
        if (this.M <= 0) {
            this.U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.M;
        this.U = jUptimeMillis + j;
        if (this.H) {
            postDelayed(runnableC5745li0, j);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d() {
        View view;
        View view2;
        boolean zA0 = AbstractC0277Dh1.a0(this.G, this.J);
        if (zA0 && (view2 = this.e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zA0 || (view = this.f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        IB0 ib0 = this.G;
        if (ib0 == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            if (!super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
        } else if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((XQ) ib0).K1() != 4) {
                    U0 u0 = (U0) ib0;
                    XQ xq = (XQ) u0;
                    xq.g2();
                    u0.q1(12, xq.v);
                }
            } else if (keyCode == 89) {
                U0 u02 = (U0) ib0;
                XQ xq2 = (XQ) u02;
                xq2.g2();
                u02.q1(11, -xq2.u);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (AbstractC0277Dh1.a0(ib0, this.J)) {
                        AbstractC0277Dh1.I(ib0);
                    } else {
                        AbstractC0277Dh1.H(ib0);
                    }
                } else if (keyCode == 87) {
                    ((U0) ib0).p1();
                } else if (keyCode == 88) {
                    ((U0) ib0).r1();
                } else if (keyCode == 126) {
                    AbstractC0277Dh1.I(ib0);
                } else if (keyCode == 127) {
                    AbstractC0277Dh1.H(ib0);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        View view;
        View view2;
        if (!c()) {
            setVisibility(0);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((C5864mK0) it.next()).a.a.o.invoke(Boolean.valueOf(getVisibility() == 0));
            }
            h();
            g();
            j();
            k();
            l();
            boolean zA0 = AbstractC0277Dh1.a0(this.G, this.J);
            if (zA0 && (view2 = this.e) != null) {
                view2.requestFocus();
            } else if (!zA0 && (view = this.f) != null) {
                view.requestFocus();
            }
            d();
        }
        b();
    }

    public final void f(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.C : this.D);
        view.setVisibility(z ? 0 : 8);
    }

    public final void g() {
        boolean zI1;
        boolean zI12;
        boolean zI13;
        boolean zI14;
        boolean zI15;
        if (c() && this.H) {
            IB0 ib0 = this.G;
            if (ib0 != null) {
                U0 u0 = (U0) ib0;
                zI1 = u0.i1(5);
                zI13 = u0.i1(7);
                zI14 = u0.i1(11);
                zI15 = u0.i1(12);
                zI12 = u0.i1(9);
            } else {
                zI1 = false;
                zI12 = false;
                zI13 = false;
                zI14 = false;
                zI15 = false;
            }
            f(this.c, this.R, zI13);
            f(this.h, this.P, zI14);
            f(this.g, this.Q, zI15);
            f(this.d, this.S, zI12);
            InterfaceC5531ka1 interfaceC5531ka1 = this.n;
            if (interfaceC5531ka1 != null) {
                interfaceC5531ka1.setEnabled(zI1);
            }
        }
    }

    public IB0 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        boolean z;
        boolean z2;
        if (c() && this.H) {
            boolean zA0 = AbstractC0277Dh1.a0(this.G, this.J);
            View view = this.e;
            boolean z3 = true;
            if (view != null) {
                z = !zA0 && view.isFocused();
                z2 = AbstractC0277Dh1.a < 21 ? z : !zA0 && AbstractC5936mi0.a(view);
                view.setVisibility(zA0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= zA0 && view2.isFocused();
                if (AbstractC0277Dh1.a < 21) {
                    z3 = z;
                } else if (!zA0 || !AbstractC5936mi0.a(view2)) {
                    z3 = false;
                }
                z2 |= z3;
                view2.setVisibility(zA0 ? 8 : 0);
            }
            if (z) {
                boolean zA02 = AbstractC0277Dh1.a0(this.G, this.J);
                if (zA02 && view != null) {
                    view.requestFocus();
                } else if (!zA02 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                d();
            }
        }
    }

    public final void i() {
        long jA1;
        long jZ1;
        if (c() && this.H) {
            IB0 ib0 = this.G;
            if (ib0 != null) {
                long j = this.c0;
                XQ xq = (XQ) ib0;
                xq.g2();
                jA1 = xq.A1(xq.u1) + j;
                jZ1 = xq.z1() + this.c0;
            } else {
                jA1 = 0;
                jZ1 = 0;
            }
            boolean z = jA1 != this.d0;
            this.d0 = jA1;
            TextView textView = this.m;
            if (textView != null && !this.L && z) {
                textView.setText(AbstractC0277Dh1.D(this.o, this.p, jA1));
            }
            InterfaceC5531ka1 interfaceC5531ka1 = this.n;
            if (interfaceC5531ka1 != null) {
                interfaceC5531ka1.setPosition(jA1);
                interfaceC5531ka1.setBufferedPosition(jZ1);
            }
            RunnableC5745li0 runnableC5745li0 = this.s;
            removeCallbacks(runnableC5745li0);
            int iK1 = ib0 == null ? 1 : ((XQ) ib0).K1();
            if (ib0 != null) {
                XQ xq2 = (XQ) ((U0) ib0);
                if (xq2.K1() == 3 && xq2.J1()) {
                    xq2.g2();
                    if (xq2.u1.n == 0) {
                        long jMin = Math.min(interfaceC5531ka1 != null ? interfaceC5531ka1.getPreferredUpdateDelay() : 1000L, 1000 - (jA1 % 1000));
                        XQ xq3 = (XQ) ib0;
                        xq3.g2();
                        float f = xq3.u1.o.a;
                        postDelayed(runnableC5745li0, AbstractC0277Dh1.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.N, 1000L));
                        return;
                    }
                }
            }
            if (iK1 == 4 || iK1 == 1) {
                return;
            }
            postDelayed(runnableC5745li0, 1000L);
        }
    }

    public final void j() {
        ImageView imageView;
        if (c() && this.H && (imageView = this.i) != null) {
            if (this.O == 0) {
                f(imageView, false, false);
                return;
            }
            IB0 ib0 = this.G;
            String str = this.x;
            Drawable drawable = this.u;
            if (ib0 == null) {
                f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true, true);
            XQ xq = (XQ) ib0;
            xq.g2();
            int i = xq.F;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.v);
                imageView.setContentDescription(this.y);
            } else if (i == 2) {
                imageView.setImageDrawable(this.w);
                imageView.setContentDescription(this.z);
            }
            imageView.setVisibility(0);
        }
    }

    public final void k() {
        ImageView imageView;
        if (c() && this.H && (imageView = this.j) != null) {
            IB0 ib0 = this.G;
            if (!this.T) {
                f(imageView, false, false);
                return;
            }
            String str = this.F;
            Drawable drawable = this.B;
            if (ib0 == null) {
                f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            f(imageView, true, true);
            XQ xq = (XQ) ib0;
            xq.g2();
            if (xq.G) {
                drawable = this.A;
            }
            imageView.setImageDrawable(drawable);
            xq.g2();
            if (xq.G) {
                str = this.E;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6509pi0.l():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
        long j = this.U;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (c()) {
            b();
        }
        h();
        g();
        j();
        k();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(defpackage.IB0 r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            defpackage.YN1.f(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            XQ r0 = (defpackage.XQ) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.s
            if (r0 != r1) goto L20
        L1f:
            r2 = r3
        L20:
            defpackage.YN1.c(r2)
            IB0 r0 = r4.G
            if (r0 != r5) goto L28
            return
        L28:
            ni0 r1 = r4.a
            if (r0 == 0) goto L31
            XQ r0 = (defpackage.XQ) r0
            r0.R1(r1)
        L31:
            r4.G = r5
            if (r5 == 0) goto L3f
            XQ r5 = (defpackage.XQ) r5
            r1.getClass()
            Uj0 r5 = r5.m
            r5.a(r1)
        L3f:
            r4.h()
            r4.g()
            r4.j()
            r4.k()
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6509pi0.setPlayer(IB0):void");
    }

    public void setRepeatToggleModes(int i) {
        this.O = i;
        IB0 ib0 = this.G;
        if (ib0 != null) {
            XQ xq = (XQ) ib0;
            xq.g2();
            int i2 = xq.F;
            if (i == 0 && i2 != 0) {
                ((XQ) this.G).Y1(0);
            } else if (i == 1 && i2 == 2) {
                ((XQ) this.G).Y1(1);
            } else if (i == 2 && i2 == 1) {
                ((XQ) this.G).Y1(2);
            }
        }
        j();
    }

    public void setShowFastForwardButton(boolean z) {
        this.Q = z;
        g();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.I = z;
        l();
    }

    public void setShowNextButton(boolean z) {
        this.S = z;
        g();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.J = z;
        h();
    }

    public void setShowPreviousButton(boolean z) {
        this.R = z;
        g();
    }

    public void setShowRewindButton(boolean z) {
        this.P = z;
        g();
    }

    public void setShowShuffleButton(boolean z) {
        this.T = z;
        k();
    }

    public void setShowTimeoutMs(int i) {
        this.M = i;
        if (c()) {
            b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.N = AbstractC0277Dh1.j(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            f(view, getShowVrButton(), onClickListener != null);
        }
    }

    public void setProgressUpdateListener(InterfaceC6318oi0 interfaceC6318oi0) {
    }
}
