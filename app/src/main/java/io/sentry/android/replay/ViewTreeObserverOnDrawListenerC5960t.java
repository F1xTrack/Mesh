package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.metrica.C2460e;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0705LB;
import p000.EnumC9659hi0;
import p000.O90;

/* renamed from: io.sentry.android.replay.t */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC5960t implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a */
    public final C5961u f34017a;

    /* renamed from: b */
    public final C5759D1 f34018b;

    /* renamed from: c */
    public final C2460e f34019c;

    /* renamed from: d */
    public final ScheduledExecutorService f34020d;

    /* renamed from: e */
    public final ReplayIntegration f34021e;

    /* renamed from: f */
    public WeakReference f34022f;

    /* renamed from: g */
    public final Object f34023g;

    /* renamed from: h */
    public final Object f34024h;

    /* renamed from: i */
    public final Bitmap f34025i;

    /* renamed from: j */
    public final Object f34026j;

    /* renamed from: k */
    public final Object f34027k;

    /* renamed from: l */
    public final AtomicBoolean f34028l;

    /* renamed from: m */
    public final AtomicBoolean f34029m;

    /* renamed from: n */
    public final AtomicBoolean f34030n;

    public ViewTreeObserverOnDrawListenerC5960t(C5961u c5961u, C5759D1 c5759d1, C2460e c2460e, ScheduledExecutorService scheduledExecutorService, ReplayIntegration replayIntegration) {
        O90.m5968f(c2460e, "mainLooperHandler");
        this.f34017a = c5961u;
        this.f34018b = c5759d1;
        this.f34019c = c2460e;
        this.f34020d = scheduledExecutorService;
        this.f34021e = replayIntegration;
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28539c;
        this.f34023g = AbstractC0705LB.m4916c(enumC9659hi0, C5924a.f33896j);
        this.f34024h = AbstractC0705LB.m4916c(enumC9659hi0, C5924a.f33897k);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c5961u.f34031a, c5961u.f34032b, Bitmap.Config.RGB_565);
        O90.m5967e(bitmapCreateBitmap, "createBitmap(\n        co…tmap.Config.RGB_565\n    )");
        this.f34025i = bitmapCreateBitmap;
        this.f34026j = AbstractC0705LB.m4916c(enumC9659hi0, new C5959s(this, 1));
        this.f34027k = AbstractC0705LB.m4916c(enumC9659hi0, new C5959s(this, 0));
        this.f34028l = new AtomicBoolean(false);
        this.f34029m = new AtomicBoolean(true);
        this.f34030n = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void m21675a(View view) {
        O90.m5968f(view, "root");
        WeakReference weakReference = this.f34022f;
        m21676b(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f34022f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f34022f = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().addOnDrawListener(this);
        }
        this.f34028l.set(true);
    }

    /* renamed from: b */
    public final void m21676b(View view) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        WeakReference weakReference = this.f34022f;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f34018b.getLogger().mo21407k(EnumC6069n1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.f34028l.set(true);
        }
    }
}
