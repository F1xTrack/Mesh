package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: f10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9314f10 implements InterfaceC10011kS0, InterfaceC10483o80 {

    /* renamed from: a */
    public final Drawable f27013a;

    /* renamed from: b */
    public final /* synthetic */ int f27014b;

    public C9314f10(Drawable drawable, int i) {
        this.f27014b = i;
        IL1.m3830d(drawable, "Argument must not be null");
        this.f27013a = drawable;
    }

    @Override // p000.InterfaceC10011kS0
    /* renamed from: a */
    public final Class mo4302a() {
        switch (this.f27014b) {
            case 0:
                return C9186e10.class;
            case 1:
                return this.f27013a.getClass();
            default:
                return C8483Wm1.class;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final Object get() {
        Drawable drawable = this.f27013a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p000.InterfaceC10011kS0
    public final int getSize() {
        switch (this.f27014b) {
            case 0:
                C10082l10 c10082l10 = (C10082l10) ((C9186e10) this.f27013a).f26481a.f17293b;
                C10348n41 c10348n41 = c10082l10.f36805a;
                return (c10348n41.f38079j.length * 4) + c10348n41.f38073d.limit() + c10348n41.f38078i.length + c10082l10.f36818n;
            case 1:
                Drawable drawable = this.f27013a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C9025cn1 c9025cn1 = (C9025cn1) ((C8483Wm1) this.f27013a).f13400a.f17293b;
                return c9025cn1.f17749a.f12031b.getSizeInBytes() + c9025cn1.f17762n;
        }
    }

    @Override // p000.InterfaceC10483o80
    public void initialize() {
        switch (this.f27014b) {
            case 0:
                ((C10082l10) ((C9186e10) this.f27013a).f26481a.f17293b).f36816l.prepareToDraw();
                break;
            case 1:
            default:
                Drawable drawable = this.f27013a;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof C9186e10) {
                        ((C10082l10) ((C9186e10) drawable).f26481a.f17293b).f36816l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
            case 2:
                ((C9025cn1) ((C8483Wm1) this.f27013a).f13400a.f17293b).f17760l.prepareToDraw();
                break;
        }
    }

    @Override // p000.InterfaceC10011kS0
    public final void recycle() {
        C11967zm0 c11967zm0;
        C11967zm0 c11967zm02;
        C11967zm0 c11967zm03;
        switch (this.f27014b) {
            case 0:
                C9186e10 c9186e10 = (C9186e10) this.f27013a;
                c9186e10.stop();
                c9186e10.f26484d = true;
                C10082l10 c10082l10 = (C10082l10) c9186e10.f26481a.f17293b;
                c10082l10.f36807c.clear();
                Bitmap bitmap = c10082l10.f36816l;
                if (bitmap != null) {
                    c10082l10.f36809e.mo319i(bitmap);
                    c10082l10.f36816l = null;
                }
                c10082l10.f36810f = false;
                C9698i10 c9698i10 = c10082l10.f36813i;
                JR0 jr0 = c10082l10.f36808d;
                if (c9698i10 != null) {
                    jr0.clear(c9698i10);
                    c10082l10.f36813i = null;
                }
                C9698i10 c9698i102 = c10082l10.f36815k;
                if (c9698i102 != null) {
                    jr0.clear(c9698i102);
                    c10082l10.f36815k = null;
                }
                C9698i10 c9698i103 = c10082l10.f36817m;
                if (c9698i103 != null) {
                    jr0.clear(c9698i103);
                    c10082l10.f36817m = null;
                }
                C10348n41 c10348n41 = c10082l10.f36805a;
                c10348n41.f38081l = null;
                byte[] bArr = c10348n41.f38078i;
                C7967Mo1 c7967Mo1 = c10348n41.f38072c;
                if (bArr != null && (c11967zm03 = (C11967zm0) c7967Mo1.f7363b) != null) {
                    c11967zm03.m26546h(bArr);
                }
                int[] iArr = c10348n41.f38079j;
                if (iArr != null && (c11967zm02 = (C11967zm0) c7967Mo1.f7363b) != null) {
                    c11967zm02.m26546h(iArr);
                }
                Bitmap bitmap2 = c10348n41.f38082m;
                if (bitmap2 != null) {
                    ((InterfaceC6443mi) c7967Mo1.f7362a).mo319i(bitmap2);
                }
                c10348n41.f38082m = null;
                c10348n41.f38073d = null;
                c10348n41.f38088s = null;
                byte[] bArr2 = c10348n41.f38074e;
                if (bArr2 != null && (c11967zm0 = (C11967zm0) c7967Mo1.f7363b) != null) {
                    c11967zm0.m26546h(bArr2);
                }
                c10082l10.f36814j = true;
                break;
            case 1:
                break;
            default:
                C8483Wm1 c8483Wm1 = (C8483Wm1) this.f27013a;
                c8483Wm1.stop();
                c8483Wm1.f13403d = true;
                C9025cn1 c9025cn1 = (C9025cn1) c8483Wm1.f13400a.f17293b;
                c9025cn1.f17751c.clear();
                Bitmap bitmap3 = c9025cn1.f17760l;
                if (bitmap3 != null) {
                    c9025cn1.f17753e.mo319i(bitmap3);
                    c9025cn1.f17760l = null;
                }
                c9025cn1.f17754f = false;
                C8639Zm1 c8639Zm1 = c9025cn1.f17757i;
                JR0 jr02 = c9025cn1.f17752d;
                if (c8639Zm1 != null) {
                    jr02.clear(c8639Zm1);
                    c9025cn1.f17757i = null;
                }
                C8639Zm1 c8639Zm12 = c9025cn1.f17759k;
                if (c8639Zm12 != null) {
                    jr02.clear(c8639Zm12);
                    c9025cn1.f17759k = null;
                }
                C8639Zm1 c8639Zm13 = c9025cn1.f17761m;
                if (c8639Zm13 != null) {
                    jr02.clear(c8639Zm13);
                    c9025cn1.f17761m = null;
                }
                c9025cn1.f17749a.m8141c();
                c9025cn1.f17758j = true;
                break;
        }
    }

    /* renamed from: b */
    private final void m18153b() {
    }
}
