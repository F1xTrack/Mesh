package defpackage;

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
import androidx.media3.ui.SubtitleView;
import java.util.List;

/* renamed from: fR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3771fR extends FrameLayout {
    public final Context a;
    public View b;
    public final View c;
    public final SubtitleView d;
    public final V8 e;
    public final C3580eR f;
    public ExoPlayer g;
    public final ViewGroup.LayoutParams h;
    public FrameLayout i;
    public int j;
    public boolean k;
    public C3710f61 l;
    public boolean m;
    public final DE n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3771fR(Context context) {
        super(context, null, 0);
        O90.f(context, "context");
        this.a = context;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.h = layoutParams;
        this.j = 1;
        this.l = new C3710f61();
        this.f = new C3580eR(this, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        V8 v8 = new V8(context);
        this.e = v8;
        v8.setLayoutParams(layoutParams2);
        View view = new View(context);
        this.c = view;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(AbstractC0872Ky.a(context, R.color.black));
        SubtitleView subtitleView = new SubtitleView(context, null);
        this.d = subtitleView;
        subtitleView.setLayoutParams(layoutParams);
        subtitleView.a();
        subtitleView.b();
        d(this.j);
        v8.addView(view, 1, layoutParams);
        if (this.l.f) {
            v8.addView(subtitleView, layoutParams);
        }
        addViewInLayout(v8, 0, layoutParams2);
        if (!this.l.f) {
            addViewInLayout(subtitleView, 1, layoutParams);
        }
        this.n = new DE(14, this);
    }

    public static final void a(C3771fR c3771fR, C3615ec1 c3615ec1) {
        c3771fR.getClass();
        if (c3615ec1 == null) {
            return;
        }
        P70 p70 = c3615ec1.a;
        O90.e(p70, "getGroups(...)");
        N70 n70ListIterator = p70.listIterator(0);
        while (n70ListIterator.hasNext()) {
            C3425dc1 c3425dc1 = (C3425dc1) n70ListIterator.next();
            if (c3425dc1.b.c == 2 && c3425dc1.a > 0) {
                C6666qX c6666qXA = c3425dc1.a(0);
                O90.e(c6666qXA, "getTrackFormat(...)");
                int i = c6666qXA.t;
                int i2 = c6666qXA.s;
                if (i2 > 0 || i > 0) {
                    V8 v8 = c3771fR.e;
                    v8.getClass();
                    float f = c6666qXA.w;
                    int i3 = c6666qXA.v;
                    if (i3 == 90 || i3 == 270) {
                        v8.setVideoAspectRatio(i2 != 0 ? (i * f) / i2 : 1.0f);
                        return;
                    } else {
                        v8.setVideoAspectRatio(i != 0 ? (i2 * f) / i : 1.0f);
                        return;
                    }
                }
                return;
            }
        }
        c3771fR.c();
    }

    public final void b() {
        ExoPlayer exoPlayer;
        View view = this.b;
        if (view instanceof TextureView) {
            ExoPlayer exoPlayer2 = this.g;
            if (exoPlayer2 != null) {
                TextureView textureView = (TextureView) view;
                XQ xq = (XQ) exoPlayer2;
                xq.g2();
                if (textureView == null) {
                    xq.x1();
                    return;
                }
                xq.T1();
                xq.W = textureView;
                if (textureView.getSurfaceTextureListener() != null) {
                    AbstractC6789rA1.h("Replacing existing SurfaceTextureListener.");
                }
                textureView.setSurfaceTextureListener(xq.y);
                SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    xq.Z1(null);
                    xq.P1(0, 0);
                    return;
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    xq.Z1(surface);
                    xq.S = surface;
                    xq.P1(textureView.getWidth(), textureView.getHeight());
                    return;
                }
            }
            return;
        }
        if (!(view instanceof SurfaceView) || (exoPlayer = this.g) == null) {
            return;
        }
        SurfaceView surfaceView = (SurfaceView) view;
        XQ xq2 = (XQ) exoPlayer;
        xq2.g2();
        boolean z = surfaceView instanceof C5813m31;
        UQ uq = xq2.y;
        if (!z) {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            xq2.g2();
            if (holder == null) {
                xq2.x1();
                return;
            }
            xq2.T1();
            xq2.V = true;
            xq2.T = holder;
            holder.addCallback(uq);
            Surface surface2 = holder.getSurface();
            if (surface2 == null || !surface2.isValid()) {
                xq2.Z1(null);
                xq2.P1(0, 0);
                return;
            } else {
                xq2.Z1(surface2);
                Rect surfaceFrame = holder.getSurfaceFrame();
                xq2.P1(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        xq2.T1();
        xq2.U = (C5813m31) surfaceView;
        QB0 qb0Y1 = xq2.y1(xq2.z);
        YN1.f(!qb0Y1.g);
        qb0Y1.d = 10000;
        C5813m31 c5813m31 = xq2.U;
        YN1.f(true ^ qb0Y1.g);
        qb0Y1.e = c5813m31;
        qb0Y1.c();
        xq2.U.a.add(uq);
        xq2.Z1(xq2.U.getVideoSurface());
        SurfaceHolder holder2 = surfaceView.getHolder();
        xq2.V = false;
        xq2.T = holder2;
        holder2.addCallback(uq);
        Surface surface3 = xq2.T.getSurface();
        if (surface3 == null || !surface3.isValid()) {
            xq2.P1(0, 0);
        } else {
            Rect surfaceFrame2 = xq2.T.getSurfaceFrame();
            xq2.P1(surfaceFrame2.width(), surfaceFrame2.height());
        }
    }

    public final void c() {
        this.c.setVisibility(this.k ? 4 : 0);
    }

    public final void d(int i) {
        boolean z;
        this.j = i;
        Context context = this.a;
        if (i == 0) {
            if (this.b instanceof TextureView) {
                z = false;
            } else {
                this.b = new TextureView(context);
            }
            View view = this.b;
            O90.d(view, "null cannot be cast to non-null type android.view.TextureView");
            ((TextureView) view).setOpaque(false);
            z = z;
        } else if (i == 1 || i == 2) {
            if (this.b instanceof SurfaceView) {
                z = false;
            } else {
                this.b = new SurfaceView(context);
                z = true;
            }
            View view2 = this.b;
            O90.d(view2, "null cannot be cast to non-null type android.view.SurfaceView");
            ((SurfaceView) view2).setSecure(i == 2);
        } else {
            String str = "Unexpected texture view type: " + i;
            O90.f(str, "msg");
            AbstractC6864rZ1.d(str);
            if (AbstractC6864rZ1.a <= 2) {
                new Exception().printStackTrace();
            }
            z = false;
        }
        if (z) {
            View view3 = this.b;
            ViewGroup.LayoutParams layoutParams = this.h;
            if (view3 != null) {
                view3.setLayoutParams(layoutParams);
            }
            V8 v8 = this.e;
            if (v8.getChildAt(0) != null) {
                v8.removeViewAt(0);
            }
            v8.addView(this.b, 0, layoutParams);
            if (this.g != null) {
                b();
            }
        }
    }

    public List getAdOverlayInfos() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.i;
        YN1.e(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public final boolean getAdsShown() {
        return this.m;
    }

    public final View getSurfaceView() {
        return this.b;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        post(this.n);
    }

    public final void setAdsShown(boolean z) {
        this.m = z;
    }

    public final void setHideShutterView(boolean z) {
        this.k = z;
        c();
    }

    public final void setPlayer(ExoPlayer exoPlayer) {
        ExoPlayer exoPlayer2;
        if (O90.a(this.g, exoPlayer)) {
            return;
        }
        ExoPlayer exoPlayer3 = this.g;
        C3580eR c3580eR = this.f;
        if (exoPlayer3 != null) {
            ((XQ) exoPlayer3).R1(c3580eR);
            View view = this.b;
            if (view instanceof TextureView) {
                ExoPlayer exoPlayer4 = this.g;
                if (exoPlayer4 != null) {
                    TextureView textureView = (TextureView) view;
                    XQ xq = (XQ) exoPlayer4;
                    xq.g2();
                    if (textureView != null && textureView == xq.W) {
                        xq.x1();
                    }
                }
            } else if ((view instanceof SurfaceView) && (exoPlayer2 = this.g) != null) {
                SurfaceView surfaceView = (SurfaceView) view;
                XQ xq2 = (XQ) exoPlayer2;
                xq2.g2();
                SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                xq2.g2();
                if (holder != null && holder == xq2.T) {
                    xq2.x1();
                }
            }
        }
        this.g = exoPlayer;
        c();
        if (exoPlayer != null) {
            b();
            c3580eR.getClass();
            ((XQ) exoPlayer).m.a(c3580eR);
        }
    }

    public final void setResizeMode(int i) {
        V8 v8 = this.e;
        if (v8.getResizeMode() != i) {
            v8.setResizeMode(i);
            post(this.n);
        }
    }

    public final void setShutterColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public final void setSubtitleStyle(C3710f61 c3710f61) {
        O90.f(c3710f61, "style");
        SubtitleView subtitleView = this.d;
        subtitleView.a();
        subtitleView.b();
        int i = c3710f61.a;
        if (i > 0) {
            float f = i;
            Context context = subtitleView.getContext();
            float fApplyDimension = TypedValue.applyDimension(2, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
            subtitleView.c = 2;
            subtitleView.d = fApplyDimension;
            subtitleView.c();
        }
        int i2 = c3710f61.b;
        int i3 = c3710f61.c;
        subtitleView.setPadding(i2, i3, i3, c3710f61.d);
        float f2 = c3710f61.e;
        if (f2 == 0.0f) {
            subtitleView.setVisibility(8);
        } else {
            subtitleView.setAlpha(f2);
            subtitleView.setVisibility(0);
        }
        boolean z = this.l.f;
        boolean z2 = c3710f61.f;
        if (z != z2) {
            ViewGroup.LayoutParams layoutParams = this.h;
            V8 v8 = this.e;
            if (z2) {
                removeViewInLayout(subtitleView);
                v8.addView(subtitleView, layoutParams);
            } else {
                v8.removeViewInLayout(subtitleView);
                addViewInLayout(subtitleView, 1, layoutParams, false);
            }
            requestLayout();
        }
        this.l = c3710f61;
    }

    private static /* synthetic */ void getViewType$annotations() {
    }
}
