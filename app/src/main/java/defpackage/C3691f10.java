package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: f10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3691f10 implements InterfaceC5506kS0, InterfaceC6210o80 {
    public final Drawable a;
    public final /* synthetic */ int b;

    public C3691f10(Drawable drawable, int i) {
        this.b = i;
        IL1.d(drawable, "Argument must not be null");
        this.a = drawable;
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Class a() {
        switch (this.b) {
            case 0:
                return C3500e10.class;
            case 1:
                return this.a.getClass();
            default:
                return C1773Wm1.class;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final Object get() {
        Drawable drawable = this.a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // defpackage.InterfaceC5506kS0
    public final int getSize() {
        switch (this.b) {
            case 0:
                C5613l10 c5613l10 = (C5613l10) ((C3500e10) this.a).a.b;
                C6008n41 c6008n41 = c5613l10.a;
                return (c6008n41.j.length * 4) + c6008n41.d.limit() + c6008n41.i.length + c5613l10.n;
            case 1:
                Drawable drawable = this.a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C2582cn1 c2582cn1 = (C2582cn1) ((C1773Wm1) this.a).a.b;
                return c2582cn1.a.b.getSizeInBytes() + c2582cn1.n;
        }
    }

    @Override // defpackage.InterfaceC6210o80
    public void initialize() {
        switch (this.b) {
            case 0:
                ((C5613l10) ((C3500e10) this.a).a.b).l.prepareToDraw();
                break;
            case 1:
            default:
                Drawable drawable = this.a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof C3500e10) {
                        ((C5613l10) ((C3500e10) drawable).a.b).l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
            case 2:
                ((C2582cn1) ((C1773Wm1) this.a).a.b).l.prepareToDraw();
                break;
        }
    }

    @Override // defpackage.InterfaceC5506kS0
    public final void recycle() {
        C8426zm0 c8426zm0;
        C8426zm0 c8426zm02;
        C8426zm0 c8426zm03;
        switch (this.b) {
            case 0:
                C3500e10 c3500e10 = (C3500e10) this.a;
                c3500e10.stop();
                c3500e10.d = true;
                C5613l10 c5613l10 = (C5613l10) c3500e10.a.b;
                c5613l10.c.clear();
                Bitmap bitmap = c5613l10.l;
                if (bitmap != null) {
                    c5613l10.e.i(bitmap);
                    c5613l10.l = null;
                }
                c5613l10.f = false;
                C4264i10 c4264i10 = c5613l10.i;
                JR0 jr0 = c5613l10.d;
                if (c4264i10 != null) {
                    jr0.clear(c4264i10);
                    c5613l10.i = null;
                }
                C4264i10 c4264i102 = c5613l10.k;
                if (c4264i102 != null) {
                    jr0.clear(c4264i102);
                    c5613l10.k = null;
                }
                C4264i10 c4264i103 = c5613l10.m;
                if (c4264i103 != null) {
                    jr0.clear(c4264i103);
                    c5613l10.m = null;
                }
                C6008n41 c6008n41 = c5613l10.a;
                c6008n41.l = null;
                byte[] bArr = c6008n41.i;
                C0999Mo1 c0999Mo1 = c6008n41.c;
                if (bArr != null && (c8426zm03 = (C8426zm0) c0999Mo1.b) != null) {
                    c8426zm03.h(bArr);
                }
                int[] iArr = c6008n41.j;
                if (iArr != null && (c8426zm02 = (C8426zm0) c0999Mo1.b) != null) {
                    c8426zm02.h(iArr);
                }
                Bitmap bitmap2 = c6008n41.m;
                if (bitmap2 != null) {
                    ((InterfaceC5935mi) c0999Mo1.a).i(bitmap2);
                }
                c6008n41.m = null;
                c6008n41.d = null;
                c6008n41.s = null;
                byte[] bArr2 = c6008n41.e;
                if (bArr2 != null && (c8426zm0 = (C8426zm0) c0999Mo1.b) != null) {
                    c8426zm0.h(bArr2);
                }
                c5613l10.j = true;
                break;
            case 1:
                break;
            default:
                C1773Wm1 c1773Wm1 = (C1773Wm1) this.a;
                c1773Wm1.stop();
                c1773Wm1.d = true;
                C2582cn1 c2582cn1 = (C2582cn1) c1773Wm1.a.b;
                c2582cn1.c.clear();
                Bitmap bitmap3 = c2582cn1.l;
                if (bitmap3 != null) {
                    c2582cn1.e.i(bitmap3);
                    c2582cn1.l = null;
                }
                c2582cn1.f = false;
                C2007Zm1 c2007Zm1 = c2582cn1.i;
                JR0 jr02 = c2582cn1.d;
                if (c2007Zm1 != null) {
                    jr02.clear(c2007Zm1);
                    c2582cn1.i = null;
                }
                C2007Zm1 c2007Zm12 = c2582cn1.k;
                if (c2007Zm12 != null) {
                    jr02.clear(c2007Zm12);
                    c2582cn1.k = null;
                }
                C2007Zm1 c2007Zm13 = c2582cn1.m;
                if (c2007Zm13 != null) {
                    jr02.clear(c2007Zm13);
                    c2582cn1.m = null;
                }
                c2582cn1.a.c();
                c2582cn1.j = true;
                break;
        }
    }

    private final void b() {
    }
}
