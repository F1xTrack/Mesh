package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p002ui.SubtitleView;
import java.util.List;

/* renamed from: fR */
/* loaded from: classes.dex */
public final class C4053fR extends FrameLayout {

    /* renamed from: a */
    public final Context f27188a;

    /* renamed from: b */
    public View f27189b;

    /* renamed from: c */
    public final View f27190c;

    /* renamed from: d */
    public final SubtitleView f27191d;

    /* renamed from: e */
    public final C1330V8 f27192e;

    /* renamed from: f */
    public final C3990eR f27193f;

    /* renamed from: g */
    public ExoPlayer f27194g;

    /* renamed from: h */
    public final ViewGroup.LayoutParams f27195h;

    /* renamed from: i */
    public FrameLayout f27196i;

    /* renamed from: j */
    public int f27197j;

    /* renamed from: k */
    public boolean f27198k;

    /* renamed from: l */
    public C9328f61 f27199l;

    /* renamed from: m */
    public boolean f27200m;

    /* renamed from: n */
    public final RunnableC0204DE f27201n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4053fR(Context context) {
        super(context, null, 0);
        O90.m5968f(context, "context");
        this.f27188a = context;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f27195h = layoutParams;
        this.f27197j = 1;
        this.f27199l = new C9328f61();
        this.f27193f = new C3990eR(this, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        C1330V8 c1330v8 = new C1330V8(context);
        this.f27192e = c1330v8;
        c1330v8.setLayoutParams(layoutParams2);
        View view = new View(context);
        this.f27190c = view;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(AbstractC0691Ky.m4783a(context, R.color.black));
        SubtitleView subtitleView = new SubtitleView(context, null);
        this.f27191d = subtitleView;
        subtitleView.setLayoutParams(layoutParams);
        subtitleView.m10142a();
        subtitleView.m10143b();
        m18237d(this.f27197j);
        c1330v8.addView(view, 1, layoutParams);
        if (this.f27199l.f27082f) {
            c1330v8.addView(subtitleView, layoutParams);
        }
        addViewInLayout(c1330v8, 0, layoutParams2);
        if (!this.f27199l.f27082f) {
            addViewInLayout(subtitleView, 1, layoutParams);
        }
        this.f27201n = new RunnableC0204DE(14, this);
    }

    /* renamed from: a */
    public static final void m18234a(C4053fR c4053fR, C9264ec1 c9264ec1) {
        c4053fR.getClass();
        if (c9264ec1 == null) {
            return;
        }
        P70 p70 = c9264ec1.f26779a;
        O90.m5967e(p70, "getGroups(...)");
        N70 n70ListIterator = p70.listIterator(0);
        while (n70ListIterator.hasNext()) {
            C9136dc1 c9136dc1 = (C9136dc1) n70ListIterator.next();
            if (c9136dc1.f26162b.f9689c == 2 && c9136dc1.f26161a > 0) {
                C6686qX c6686qXM17712a = c9136dc1.m17712a(0);
                O90.m5967e(c6686qXM17712a, "getTrackFormat(...)");
                int i = c6686qXM17712a.f40981t;
                int i2 = c6686qXM17712a.f40980s;
                if (i2 > 0 || i > 0) {
                    C1330V8 c1330v8 = c4053fR.f27192e;
                    c1330v8.getClass();
                    float f = c6686qXM17712a.f40984w;
                    int i3 = c6686qXM17712a.f40983v;
                    if (i3 == 90 || i3 == 270) {
                        c1330v8.setVideoAspectRatio(i2 != 0 ? (i * f) / i2 : 1.0f);
                        return;
                    } else {
                        c1330v8.setVideoAspectRatio(i != 0 ? (i2 * f) / i : 1.0f);
                        return;
                    }
                }
                return;
            }
        }
        c4053fR.m18236c();
    }

    /* renamed from: b */
    public final void m18235b() {
        ExoPlayer exoPlayer;
        View view = this.f27189b;
        if (view instanceof TextureView) {
            ExoPlayer exoPlayer2 = this.f27194g;
            if (exoPlayer2 != null) {
                TextureView textureView = (TextureView) view;
                C1474XQ c1474xq = (C1474XQ) exoPlayer2;
                c1474xq.m9035g2();
                if (textureView == null) {
                    c1474xq.m9037x1();
                    return;
                }
                c1474xq.m9022T1();
                c1474xq.f13711W = textureView;
                if (textureView.getSurfaceTextureListener() != null) {
                    AbstractC10872rA1.m24175h("Replacing existing SurfaceTextureListener.");
                }
                textureView.setSurfaceTextureListener(c1474xq.f13749y);
                SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    c1474xq.m9028Z1(null);
                    c1474xq.m9018P1(0, 0);
                    return;
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    c1474xq.m9028Z1(surface);
                    c1474xq.f13707S = surface;
                    c1474xq.m9018P1(textureView.getWidth(), textureView.getHeight());
                    return;
                }
            }
            return;
        }
        if (!(view instanceof SurfaceView) || (exoPlayer = this.f27194g) == null) {
            return;
        }
        SurfaceView surfaceView = (SurfaceView) view;
        C1474XQ c1474xq2 = (C1474XQ) exoPlayer;
        c1474xq2.m9035g2();
        boolean z = surfaceView instanceof C10217m31;
        SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = c1474xq2.f13749y;
        if (!z) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            c1474xq2.m9035g2();
            if (holder == null) {
                c1474xq2.m9037x1();
                return;
            }
            c1474xq2.m9022T1();
            c1474xq2.f13710V = true;
            c1474xq2.f13708T = holder;
            holder.addCallback(surfaceHolderCallbackC1285UQ);
            Surface surface2 = holder.getSurface();
            if (surface2 == null || !surface2.isValid()) {
                c1474xq2.m9028Z1(null);
                c1474xq2.m9018P1(0, 0);
                return;
            } else {
                c1474xq2.m9028Z1(surface2);
                Rect surfaceFrame = holder.getSurfaceFrame();
                c1474xq2.m9018P1(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        c1474xq2.m9022T1();
        c1474xq2.f13709U = (C10217m31) surfaceView;
        QB0 qb0M9038y1 = c1474xq2.m9038y1(c1474xq2.f13750z);
        YN1.m9281f(!qb0M9038y1.f9523g);
        qb0M9038y1.f9520d = 10000;
        C10217m31 c10217m31 = c1474xq2.f13709U;
        YN1.m9281f(true ^ qb0M9038y1.f9523g);
        qb0M9038y1.f9521e = c10217m31;
        qb0M9038y1.m6597c();
        c1474xq2.f13709U.f37437a.add(surfaceHolderCallbackC1285UQ);
        c1474xq2.m9028Z1(c1474xq2.f13709U.getVideoSurface());
        SurfaceHolder holder2 = surfaceView.getHolder();
        c1474xq2.f13710V = false;
        c1474xq2.f13708T = holder2;
        holder2.addCallback(surfaceHolderCallbackC1285UQ);
        Surface surface3 = c1474xq2.f13708T.getSurface();
        if (surface3 == null || !surface3.isValid()) {
            c1474xq2.m9018P1(0, 0);
        } else {
            Rect surfaceFrame2 = c1474xq2.f13708T.getSurfaceFrame();
            c1474xq2.m9018P1(surfaceFrame2.width(), surfaceFrame2.height());
        }
    }

    /* renamed from: c */
    public final void m18236c() {
        this.f27190c.setVisibility(this.f27198k ? 4 : 0);
    }

    /* renamed from: d */
    public final void m18237d(int i) {
        boolean z;
        this.f27197j = i;
        Context context = this.f27188a;
        if (i == 0) {
            if (this.f27189b instanceof TextureView) {
                z = false;
            } else {
                this.f27189b = new TextureView(context);
            }
            View view = this.f27189b;
            O90.m5966d(view, "null cannot be cast to non-null type android.view.TextureView");
            ((TextureView) view).setOpaque(false);
            z = z;
        } else if (i == 1 || i == 2) {
            if (this.f27189b instanceof SurfaceView) {
                z = false;
            } else {
                this.f27189b = new SurfaceView(context);
                z = true;
            }
            View view2 = this.f27189b;
            O90.m5966d(view2, "null cannot be cast to non-null type android.view.SurfaceView");
            ((SurfaceView) view2).setSecure(i == 2);
        } else {
            String str = "Unexpected texture view type: " + i;
            O90.m5968f(str, "msg");
            AbstractC10922rZ1.m24430d(str);
            if (AbstractC10922rZ1.f41734a <= 2) {
                new Exception().printStackTrace();
            }
            z = false;
        }
        if (z) {
            View view3 = this.f27189b;
            ViewGroup.LayoutParams layoutParams = this.f27195h;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
            C1330V8 c1330v8 = this.f27192e;
            if (c1330v8.getChildAt(0) != null) {
                c1330v8.removeViewAt(0);
            }
            c1330v8.addView(this.f27189b, 0, layoutParams);
            if (this.f27194g != null) {
                m18235b();
            }
        }
    }

    public List getAdOverlayInfos() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f27196i;
        YN1.m9280e(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public final boolean getAdsShown() {
        return this.f27200m;
    }

    public final View getSurfaceView() {
        return this.f27189b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(this.f27201n);
    }

    public final void setAdsShown(boolean z) {
        this.f27200m = z;
    }

    public final void setHideShutterView(boolean z) {
        this.f27198k = z;
        m18236c();
    }

    public final void setPlayer(ExoPlayer exoPlayer) {
        ExoPlayer exoPlayer2;
        if (O90.m5963a(this.f27194g, exoPlayer)) {
            return;
        }
        ExoPlayer exoPlayer3 = this.f27194g;
        C3990eR c3990eR = this.f27193f;
        if (exoPlayer3 != null) {
            ((C1474XQ) exoPlayer3).m9020R1(c3990eR);
            View view = this.f27189b;
            if (view instanceof TextureView) {
                ExoPlayer exoPlayer4 = this.f27194g;
                if (exoPlayer4 != null) {
                    TextureView textureView = (TextureView) view;
                    C1474XQ c1474xq = (C1474XQ) exoPlayer4;
                    c1474xq.m9035g2();
                    if (textureView != null && textureView == c1474xq.f13711W) {
                        c1474xq.m9037x1();
                    }
                }
            } else if ((view instanceof SurfaceView) && (exoPlayer2 = this.f27194g) != null) {
                SurfaceView surfaceView = (SurfaceView) view;
                C1474XQ c1474xq2 = (C1474XQ) exoPlayer2;
                c1474xq2.m9035g2();
                SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                c1474xq2.m9035g2();
                if (holder != null && holder == c1474xq2.f13708T) {
                    c1474xq2.m9037x1();
                }
            }
        }
        this.f27194g = exoPlayer;
        m18236c();
        if (exoPlayer != null) {
            m18235b();
            c3990eR.getClass();
            ((C1474XQ) exoPlayer).f13730m.m8129a(c3990eR);
        }
    }

    public final void setResizeMode(int i) {
        C1330V8 c1330v8 = this.f27192e;
        if (c1330v8.getResizeMode() != i) {
            c1330v8.setResizeMode(i);
            post(this.f27201n);
        }
    }

    public final void setShutterColor(int i) {
        this.f27190c.setBackgroundColor(i);
    }

    public final void setSubtitleStyle(C9328f61 c9328f61) {
        O90.m5968f(c9328f61, "style");
        SubtitleView subtitleView = this.f27191d;
        subtitleView.m10142a();
        subtitleView.m10143b();
        int i = c9328f61.f27077a;
        if (i > 0) {
            float f = i;
            Context context = subtitleView.getContext();
            float fApplyDimension = TypedValue.applyDimension(2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
            subtitleView.f16407c = 2;
            subtitleView.f16408d = fApplyDimension;
            subtitleView.m10144c();
        }
        int i2 = c9328f61.f27078b;
        int i3 = c9328f61.f27079c;
        subtitleView.setPadding(i2, i3, i3, c9328f61.f27080d);
        float f2 = c9328f61.f27081e;
        if (f2 == 0.0f) {
            subtitleView.setVisibility(8);
        } else {
            subtitleView.setAlpha(f2);
            subtitleView.setVisibility(0);
        }
        boolean z = this.f27199l.f27082f;
        boolean z2 = c9328f61.f27082f;
        if (z != z2) {
            ViewGroup.LayoutParams layoutParams = this.f27195h;
            C1330V8 c1330v8 = this.f27192e;
            if (z2) {
                removeViewInLayout(subtitleView);
                c1330v8.addView(subtitleView, layoutParams);
            } else {
                c1330v8.removeViewInLayout(subtitleView);
                addViewInLayout(subtitleView, 1, layoutParams, false);
            }
            requestLayout();
        }
        this.f27199l = c9328f61;
    }

    private static /* synthetic */ void getViewType$annotations() {
    }
}
