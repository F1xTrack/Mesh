package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;
import java.util.UUID;

/* renamed from: gw0 */
/* loaded from: classes.dex */
public abstract class AbstractC4056gw0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public AbstractC4056gw0(FrameLayout frameLayout, C4303iD0 c4303iD0) {
        this.a = false;
        this.c = frameLayout;
        this.d = c4303iD0;
    }

    public abstract void a(C1155Oo1 c1155Oo1);

    public AbstractC1389Ro1 b() {
        AbstractC1389Ro1 abstractC1389Ro1C = c();
        C4061gy c4061gy = ((C1623Uo1) this.c).j;
        boolean z = (Build.VERSION.SDK_INT >= 24 && !c4061gy.h.isEmpty()) || c4061gy.d || c4061gy.b || c4061gy.c;
        C1623Uo1 c1623Uo1 = (C1623Uo1) this.c;
        if (c1623Uo1.q) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (c1623Uo1.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        O90.e(uuidRandomUUID, "randomUUID()");
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        O90.e(string, "id.toString()");
        C1623Uo1 c1623Uo12 = (C1623Uo1) this.c;
        O90.f(c1623Uo12, "other");
        int i = c1623Uo12.b;
        String str = c1623Uo12.d;
        C8317zC c8317zC = new C8317zC(c1623Uo12.e);
        C8317zC c8317zC2 = new C8317zC(c1623Uo12.f);
        long j = c1623Uo12.g;
        long j2 = c1623Uo12.h;
        long j3 = c1623Uo12.i;
        C4061gy c4061gy2 = c1623Uo12.j;
        O90.f(c4061gy2, "other");
        this.c = new C1623Uo1(string, i, c1623Uo12.c, str, c8317zC, c8317zC2, j, j2, j3, new C4061gy(c4061gy2.a, c4061gy2.b, c4061gy2.c, c4061gy2.d, c4061gy2.e, c4061gy2.f, c4061gy2.g, c4061gy2.h), c1623Uo12.k, c1623Uo12.l, c1623Uo12.m, c1623Uo12.n, c1623Uo12.o, c1623Uo12.p, c1623Uo12.q, c1623Uo12.r, c1623Uo12.s, 524288, 0);
        return abstractC1389Ro1C;
    }

    public abstract AbstractC1389Ro1 c();

    public abstract String d();

    public abstract View e();

    public abstract Bitmap f();

    public abstract void g();

    public abstract void h();

    public abstract void i(Z61 z61, C4290i9 c4290i9);

    public void j() {
        View viewE = e();
        if (viewE == null || !this.a) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        C4303iD0 c4303iD0 = (C4303iD0) this.d;
        c4303iD0.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            AbstractC0759Jm0.f("PreviewTransform");
            return;
        }
        if (c4303iD0.f()) {
            if (viewE instanceof TextureView) {
                ((TextureView) viewE).setTransform(c4303iD0.d());
            } else {
                Display display = viewE.getDisplay();
                boolean z = false;
                boolean z2 = (!c4303iD0.g || display == null || display.getRotation() == c4303iD0.e) ? false : true;
                boolean z3 = c4303iD0.g;
                if (!z3) {
                    if ((!z3 ? c4303iD0.c : -AbstractC4346iR1.d(c4303iD0.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    AbstractC0759Jm0.f("PreviewTransform");
                }
            }
            RectF rectFE = c4303iD0.e(size, layoutDirection);
            viewE.setPivotX(0.0f);
            viewE.setPivotY(0.0f);
            viewE.setScaleX(rectFE.width() / c4303iD0.a.getWidth());
            viewE.setScaleY(rectFE.height() / c4303iD0.a.getHeight());
            viewE.setTranslationX(rectFE.left - viewE.getLeft());
            viewE.setTranslationY(rectFE.top - viewE.getTop());
        }
    }

    public abstract InterfaceFutureC0750Jj0 k();

    public AbstractC4056gw0(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        O90.e(uuidRandomUUID, "randomUUID()");
        this.b = uuidRandomUUID;
        String string = ((UUID) this.b).toString();
        O90.e(string, "id.toString()");
        this.c = new C1623Uo1(string, 0, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC7287tn0.b(1));
        J8.B(strArr, linkedHashSet);
        this.d = linkedHashSet;
    }

    public AbstractC4056gw0() {
        this.a = false;
    }
}
