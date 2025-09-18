package p000;

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
import androidx.media3.p002ui.DefaultTimeBar;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.mes.dnevnik.R;

/* renamed from: pi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10683pi0 extends FrameLayout {

    /* renamed from: A */
    public final Drawable f40287A;

    /* renamed from: B */
    public final Drawable f40288B;

    /* renamed from: C */
    public final float f40289C;

    /* renamed from: D */
    public final float f40290D;

    /* renamed from: E */
    public final String f40291E;

    /* renamed from: F */
    public final String f40292F;

    /* renamed from: G */
    public IB0 f40293G;

    /* renamed from: H */
    public boolean f40294H;

    /* renamed from: I */
    public boolean f40295I;

    /* renamed from: J */
    public boolean f40296J;

    /* renamed from: K */
    public boolean f40297K;

    /* renamed from: L */
    public boolean f40298L;

    /* renamed from: M */
    public int f40299M;

    /* renamed from: N */
    public int f40300N;

    /* renamed from: O */
    public int f40301O;

    /* renamed from: P */
    public boolean f40302P;

    /* renamed from: Q */
    public boolean f40303Q;

    /* renamed from: R */
    public boolean f40304R;

    /* renamed from: S */
    public boolean f40305S;

    /* renamed from: T */
    public boolean f40306T;

    /* renamed from: U */
    public long f40307U;

    /* renamed from: V */
    public long[] f40308V;

    /* renamed from: W */
    public boolean[] f40309W;

    /* renamed from: a */
    public final ViewOnClickListenerC10427ni0 f40310a;

    /* renamed from: a0 */
    public final long[] f40311a0;

    /* renamed from: b */
    public final CopyOnWriteArrayList f40312b;

    /* renamed from: b0 */
    public final boolean[] f40313b0;

    /* renamed from: c */
    public final View f40314c;

    /* renamed from: c0 */
    public long f40315c0;

    /* renamed from: d */
    public final View f40316d;

    /* renamed from: d0 */
    public long f40317d0;

    /* renamed from: e */
    public final View f40318e;

    /* renamed from: f */
    public final View f40319f;

    /* renamed from: g */
    public final View f40320g;

    /* renamed from: h */
    public final View f40321h;

    /* renamed from: i */
    public final ImageView f40322i;

    /* renamed from: j */
    public final ImageView f40323j;

    /* renamed from: k */
    public final View f40324k;

    /* renamed from: l */
    public final TextView f40325l;

    /* renamed from: m */
    public final TextView f40326m;

    /* renamed from: n */
    public final InterfaceC10028ka1 f40327n;

    /* renamed from: o */
    public final StringBuilder f40328o;

    /* renamed from: p */
    public final Formatter f40329p;

    /* renamed from: q */
    public final C7315Aa1 f40330q;

    /* renamed from: r */
    public final C7367Ba1 f40331r;

    /* renamed from: s */
    public final RunnableC10171li0 f40332s;

    /* renamed from: t */
    public final RunnableC10171li0 f40333t;

    /* renamed from: u */
    public final Drawable f40334u;

    /* renamed from: v */
    public final Drawable f40335v;

    /* renamed from: w */
    public final Drawable f40336w;

    /* renamed from: x */
    public final String f40337x;

    /* renamed from: y */
    public final String f40338y;

    /* renamed from: z */
    public final String f40339z;

    static {
        AbstractC10953rp0.m24489a("media3.ui");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [li0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [li0] */
    public C10683pi0(Context context) {
        super(context, null, 0);
        this.f40296J = true;
        this.f40299M = 5000;
        this.f40301O = 0;
        this.f40300N = 200;
        this.f40307U = -9223372036854775807L;
        this.f40302P = true;
        this.f40303Q = true;
        this.f40304R = true;
        this.f40305S = true;
        this.f40306T = false;
        this.f40312b = new CopyOnWriteArrayList();
        this.f40330q = new C7315Aa1();
        this.f40331r = new C7367Ba1();
        StringBuilder sb = new StringBuilder();
        this.f40328o = sb;
        this.f40329p = new Formatter(sb, Locale.getDefault());
        this.f40308V = new long[0];
        this.f40309W = new boolean[0];
        this.f40311a0 = new long[0];
        this.f40313b0 = new boolean[0];
        ViewOnClickListenerC10427ni0 viewOnClickListenerC10427ni0 = new ViewOnClickListenerC10427ni0(this);
        this.f40310a = viewOnClickListenerC10427ni0;
        final int i = 0;
        this.f40332s = new Runnable(this) { // from class: li0

            /* renamed from: b */
            public final /* synthetic */ C10683pi0 f37259b;

            {
                this.f37259b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f37259b.m23847i();
                        break;
                    default:
                        this.f37259b.m23839a();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f40333t = new Runnable(this) { // from class: li0

            /* renamed from: b */
            public final /* synthetic */ C10683pi0 f37259b;

            {
                this.f37259b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f37259b.m23847i();
                        break;
                    default:
                        this.f37259b.m23839a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.exo_legacy_player_control_view, this);
        setDescendantFocusability(262144);
        InterfaceC10028ka1 interfaceC10028ka1 = (InterfaceC10028ka1) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC10028ka1 != null) {
            this.f40327n = interfaceC10028ka1;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, null);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.f40327n = defaultTimeBar;
        } else {
            this.f40327n = null;
        }
        this.f40325l = (TextView) findViewById(R.id.exo_duration);
        this.f40326m = (TextView) findViewById(R.id.exo_position);
        InterfaceC10028ka1 interfaceC10028ka12 = this.f40327n;
        if (interfaceC10028ka12 != null) {
            ((DefaultTimeBar) interfaceC10028ka12).f16402x.add(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.f40318e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f40319f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.f40314c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f40316d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.f40321h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.f40320g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f40322i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f40323j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC10427ni0);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.f40324k = viewFindViewById8;
        setShowVrButton(false);
        m23844f(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f40289C = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f40290D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f40334u = AbstractC7485Dh1.m1836u(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.f40335v = AbstractC7485Dh1.m1836u(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.f40336w = AbstractC7485Dh1.m1836u(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.f40287A = AbstractC7485Dh1.m1836u(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.f40288B = AbstractC7485Dh1.m1836u(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.f40337x = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f40338y = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f40339z = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f40291E = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f40292F = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f40317d0 = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m23839a() {
        if (m23841c()) {
            setVisibility(8);
            Iterator it = this.f40312b.iterator();
            while (it.hasNext()) {
                ((C10251mK0) it.next()).f37637a.f41559a.f43826o.invoke(Boolean.valueOf(getVisibility() == 0));
            }
            removeCallbacks(this.f40332s);
            removeCallbacks(this.f40333t);
            this.f40307U = -9223372036854775807L;
        }
    }

    /* renamed from: b */
    public final void m23840b() {
        RunnableC10171li0 runnableC10171li0 = this.f40333t;
        removeCallbacks(runnableC10171li0);
        if (this.f40299M <= 0) {
            this.f40307U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.f40299M;
        this.f40307U = jUptimeMillis + j;
        if (this.f40294H) {
            postDelayed(runnableC10171li0, j);
        }
    }

    /* renamed from: c */
    public final boolean m23841c() {
        return getVisibility() == 0;
    }

    /* renamed from: d */
    public final void m23842d() {
        View view;
        View view2;
        boolean zM1813a0 = AbstractC7485Dh1.m1813a0(this.f40293G, this.f40296J);
        if (zM1813a0 && (view2 = this.f40318e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zM1813a0 || (view = this.f40319f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        IB0 ib0 = this.f40293G;
        if (ib0 == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            if (!super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
        } else if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((C1474XQ) ib0).m9014K1() != 4) {
                    AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) ib0;
                    C1474XQ c1474xq = (C1474XQ) abstractC1259U0;
                    c1474xq.m9035g2();
                    abstractC1259U0.m7848q1(12, c1474xq.f13744v);
                }
            } else if (keyCode == 89) {
                AbstractC1259U0 abstractC1259U02 = (AbstractC1259U0) ib0;
                C1474XQ c1474xq2 = (C1474XQ) abstractC1259U02;
                c1474xq2.m9035g2();
                abstractC1259U02.m7848q1(11, -c1474xq2.f13742u);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (AbstractC7485Dh1.m1813a0(ib0, this.f40296J)) {
                        AbstractC7485Dh1.m1794I(ib0);
                    } else {
                        AbstractC7485Dh1.m1793H(ib0);
                    }
                } else if (keyCode == 87) {
                    ((AbstractC1259U0) ib0).m7847p1();
                } else if (keyCode == 88) {
                    ((AbstractC1259U0) ib0).m7849r1();
                } else if (keyCode == 126) {
                    AbstractC7485Dh1.m1794I(ib0);
                } else if (keyCode == 127) {
                    AbstractC7485Dh1.m1793H(ib0);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f40333t);
        } else if (motionEvent.getAction() == 1) {
            m23840b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void m23843e() {
        View view;
        View view2;
        if (!m23841c()) {
            setVisibility(0);
            Iterator it = this.f40312b.iterator();
            while (it.hasNext()) {
                ((C10251mK0) it.next()).f37637a.f41559a.f43826o.invoke(Boolean.valueOf(getVisibility() == 0));
            }
            m23846h();
            m23845g();
            m23848j();
            m23849k();
            m23850l();
            boolean zM1813a0 = AbstractC7485Dh1.m1813a0(this.f40293G, this.f40296J);
            if (zM1813a0 && (view2 = this.f40318e) != null) {
                view2.requestFocus();
            } else if (!zM1813a0 && (view = this.f40319f) != null) {
                view.requestFocus();
            }
            m23842d();
        }
        m23840b();
    }

    /* renamed from: f */
    public final void m23844f(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f40289C : this.f40290D);
        view.setVisibility(z ? 0 : 8);
    }

    /* renamed from: g */
    public final void m23845g() {
        boolean zM7840i1;
        boolean zM7840i12;
        boolean zM7840i13;
        boolean zM7840i14;
        boolean zM7840i15;
        if (m23841c() && this.f40294H) {
            IB0 ib0 = this.f40293G;
            if (ib0 != null) {
                AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) ib0;
                zM7840i1 = abstractC1259U0.m7840i1(5);
                zM7840i13 = abstractC1259U0.m7840i1(7);
                zM7840i14 = abstractC1259U0.m7840i1(11);
                zM7840i15 = abstractC1259U0.m7840i1(12);
                zM7840i12 = abstractC1259U0.m7840i1(9);
            } else {
                zM7840i1 = false;
                zM7840i12 = false;
                zM7840i13 = false;
                zM7840i14 = false;
                zM7840i15 = false;
            }
            m23844f(this.f40314c, this.f40304R, zM7840i13);
            m23844f(this.f40321h, this.f40302P, zM7840i14);
            m23844f(this.f40320g, this.f40303Q, zM7840i15);
            m23844f(this.f40316d, this.f40305S, zM7840i12);
            InterfaceC10028ka1 interfaceC10028ka1 = this.f40327n;
            if (interfaceC10028ka1 != null) {
                interfaceC10028ka1.setEnabled(zM7840i1);
            }
        }
    }

    public IB0 getPlayer() {
        return this.f40293G;
    }

    public int getRepeatToggleModes() {
        return this.f40301O;
    }

    public boolean getShowShuffleButton() {
        return this.f40306T;
    }

    public int getShowTimeoutMs() {
        return this.f40299M;
    }

    public boolean getShowVrButton() {
        View view = this.f40324k;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: h */
    public final void m23846h() {
        boolean z;
        boolean z2;
        if (m23841c() && this.f40294H) {
            boolean zM1813a0 = AbstractC7485Dh1.m1813a0(this.f40293G, this.f40296J);
            View view = this.f40318e;
            boolean z3 = true;
            if (view != null) {
                z = !zM1813a0 && view.isFocused();
                z2 = AbstractC7485Dh1.f2166a < 21 ? z : !zM1813a0 && AbstractC10299mi0.m22920a(view);
                view.setVisibility(zM1813a0 ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f40319f;
            if (view2 != null) {
                z |= zM1813a0 && view2.isFocused();
                if (AbstractC7485Dh1.f2166a < 21) {
                    z3 = z;
                } else if (!zM1813a0 || !AbstractC10299mi0.m22920a(view2)) {
                    z3 = false;
                }
                z2 |= z3;
                view2.setVisibility(zM1813a0 ? 8 : 0);
            }
            if (z) {
                boolean zM1813a02 = AbstractC7485Dh1.m1813a0(this.f40293G, this.f40296J);
                if (zM1813a02 && view != null) {
                    view.requestFocus();
                } else if (!zM1813a02 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                m23842d();
            }
        }
    }

    /* renamed from: i */
    public final void m23847i() {
        long jM9004A1;
        long jM9039z1;
        if (m23841c() && this.f40294H) {
            IB0 ib0 = this.f40293G;
            if (ib0 != null) {
                long j = this.f40315c0;
                C1474XQ c1474xq = (C1474XQ) ib0;
                c1474xq.m9035g2();
                jM9004A1 = c1474xq.m9004A1(c1474xq.f13743u1) + j;
                jM9039z1 = c1474xq.m9039z1() + this.f40315c0;
            } else {
                jM9004A1 = 0;
                jM9039z1 = 0;
            }
            boolean z = jM9004A1 != this.f40317d0;
            this.f40317d0 = jM9004A1;
            TextView textView = this.f40326m;
            if (textView != null && !this.f40298L && z) {
                textView.setText(AbstractC7485Dh1.m1789D(this.f40328o, this.f40329p, jM9004A1));
            }
            InterfaceC10028ka1 interfaceC10028ka1 = this.f40327n;
            if (interfaceC10028ka1 != null) {
                interfaceC10028ka1.setPosition(jM9004A1);
                interfaceC10028ka1.setBufferedPosition(jM9039z1);
            }
            RunnableC10171li0 runnableC10171li0 = this.f40332s;
            removeCallbacks(runnableC10171li0);
            int iM9014K1 = ib0 == null ? 1 : ((C1474XQ) ib0).m9014K1();
            if (ib0 != null) {
                C1474XQ c1474xq2 = (C1474XQ) ((AbstractC1259U0) ib0);
                if (c1474xq2.m9014K1() == 3 && c1474xq2.m9013J1()) {
                    c1474xq2.m9035g2();
                    if (c1474xq2.f13743u1.f636n == 0) {
                        long jMin = Math.min(interfaceC10028ka1 != null ? interfaceC10028ka1.getPreferredUpdateDelay() : 1000L, 1000 - (jM9004A1 % 1000));
                        C1474XQ c1474xq3 = (C1474XQ) ib0;
                        c1474xq3.m9035g2();
                        float f = c1474xq3.f13743u1.f637o.f1239a;
                        postDelayed(runnableC10171li0, AbstractC7485Dh1.m1826k(f > 0.0f ? (long) (jMin / f) : 1000L, this.f40300N, 1000L));
                        return;
                    }
                }
            }
            if (iM9014K1 == 4 || iM9014K1 == 1) {
                return;
            }
            postDelayed(runnableC10171li0, 1000L);
        }
    }

    /* renamed from: j */
    public final void m23848j() {
        ImageView imageView;
        if (m23841c() && this.f40294H && (imageView = this.f40322i) != null) {
            if (this.f40301O == 0) {
                m23844f(imageView, false, false);
                return;
            }
            IB0 ib0 = this.f40293G;
            String str = this.f40337x;
            Drawable drawable = this.f40334u;
            if (ib0 == null) {
                m23844f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m23844f(imageView, true, true);
            C1474XQ c1474xq = (C1474XQ) ib0;
            c1474xq.m9035g2();
            int i = c1474xq.f13694F;
            if (i == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i == 1) {
                imageView.setImageDrawable(this.f40335v);
                imageView.setContentDescription(this.f40338y);
            } else if (i == 2) {
                imageView.setImageDrawable(this.f40336w);
                imageView.setContentDescription(this.f40339z);
            }
            imageView.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final void m23849k() {
        ImageView imageView;
        if (m23841c() && this.f40294H && (imageView = this.f40323j) != null) {
            IB0 ib0 = this.f40293G;
            if (!this.f40306T) {
                m23844f(imageView, false, false);
                return;
            }
            String str = this.f40292F;
            Drawable drawable = this.f40288B;
            if (ib0 == null) {
                m23844f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m23844f(imageView, true, true);
            C1474XQ c1474xq = (C1474XQ) ib0;
            c1474xq.m9035g2();
            if (c1474xq.f13695G) {
                drawable = this.f40287A;
            }
            imageView.setImageDrawable(drawable);
            c1474xq.m9035g2();
            if (c1474xq.f13695G) {
                str = this.f40291E;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23850l() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10683pi0.m23850l():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40294H = true;
        long j = this.f40307U;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m23839a();
            } else {
                postDelayed(this.f40333t, jUptimeMillis);
            }
        } else if (m23841c()) {
            m23840b();
        }
        m23846h();
        m23845g();
        m23848j();
        m23849k();
        m23850l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40294H = false;
        removeCallbacks(this.f40332s);
        removeCallbacks(this.f40333t);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(p000.IB0 r5) {
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
            p000.YN1.m9281f(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            XQ r0 = (p000.C1474XQ) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f13738s
            if (r0 != r1) goto L20
        L1f:
            r2 = r3
        L20:
            p000.YN1.m9278c(r2)
            IB0 r0 = r4.f40293G
            if (r0 != r5) goto L28
            return
        L28:
            ni0 r1 = r4.f40310a
            if (r0 == 0) goto L31
            XQ r0 = (p000.C1474XQ) r0
            r0.m9020R1(r1)
        L31:
            r4.f40293G = r5
            if (r5 == 0) goto L3f
            XQ r5 = (p000.C1474XQ) r5
            r1.getClass()
            Uj0 r5 = r5.f13730m
            r5.m8129a(r1)
        L3f:
            r4.m23846h()
            r4.m23845g()
            r4.m23848j()
            r4.m23849k()
            r4.m23850l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10683pi0.setPlayer(IB0):void");
    }

    public void setRepeatToggleModes(int i) {
        this.f40301O = i;
        IB0 ib0 = this.f40293G;
        if (ib0 != null) {
            C1474XQ c1474xq = (C1474XQ) ib0;
            c1474xq.m9035g2();
            int i2 = c1474xq.f13694F;
            if (i == 0 && i2 != 0) {
                ((C1474XQ) this.f40293G).m9027Y1(0);
            } else if (i == 1 && i2 == 2) {
                ((C1474XQ) this.f40293G).m9027Y1(1);
            } else if (i == 2 && i2 == 1) {
                ((C1474XQ) this.f40293G).m9027Y1(2);
            }
        }
        m23848j();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f40303Q = z;
        m23845g();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.f40295I = z;
        m23850l();
    }

    public void setShowNextButton(boolean z) {
        this.f40305S = z;
        m23845g();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.f40296J = z;
        m23846h();
    }

    public void setShowPreviousButton(boolean z) {
        this.f40304R = z;
        m23845g();
    }

    public void setShowRewindButton(boolean z) {
        this.f40302P = z;
        m23845g();
    }

    public void setShowShuffleButton(boolean z) {
        this.f40306T = z;
        m23849k();
    }

    public void setShowTimeoutMs(int i) {
        this.f40299M = i;
        if (m23841c()) {
            m23840b();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f40324k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f40300N = AbstractC7485Dh1.m1825j(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f40324k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m23844f(view, getShowVrButton(), onClickListener != null);
        }
    }

    public void setProgressUpdateListener(InterfaceC10555oi0 interfaceC10555oi0) {
    }
}
