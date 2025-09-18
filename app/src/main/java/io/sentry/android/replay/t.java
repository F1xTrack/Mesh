package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.EnumC4205hi0;
import defpackage.LB;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class t implements ViewTreeObserver.OnDrawListener {
    public final u a;
    public final D1 b;
    public final com.yandex.metrica.e c;
    public final ScheduledExecutorService d;
    public final ReplayIntegration e;
    public WeakReference f;
    public final Object g;
    public final Object h;
    public final Bitmap i;
    public final Object j;
    public final Object k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;

    public t(u uVar, D1 d1, com.yandex.metrica.e eVar, ScheduledExecutorService scheduledExecutorService, ReplayIntegration replayIntegration) {
        O90.f(eVar, "mainLooperHandler");
        this.a = uVar;
        this.b = d1;
        this.c = eVar;
        this.d = scheduledExecutorService;
        this.e = replayIntegration;
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.c;
        this.g = LB.c(enumC4205hi0, C5109a.j);
        this.h = LB.c(enumC4205hi0, C5109a.k);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(uVar.a, uVar.b, Bitmap.Config.RGB_565);
        O90.e(bitmapCreateBitmap, "createBitmap(\n        co…tmap.Config.RGB_565\n    )");
        this.i = bitmapCreateBitmap;
        this.j = LB.c(enumC4205hi0, new s(this, 1));
        this.k = LB.c(enumC4205hi0, new s(this, 0));
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(true);
        this.n = new AtomicBoolean(false);
    }

    public final void a(View view) {
        O90.f(view, "root");
        WeakReference weakReference = this.f;
        b(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().addOnDrawListener(this);
        }
        this.l.set(true);
    }

    public final void b(View view) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        WeakReference weakReference = this.f;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.b.getLogger().k(EnumC5148n1.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.l.set(true);
        }
    }
}
