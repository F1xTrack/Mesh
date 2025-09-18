package defpackage;

import android.graphics.Bitmap;

/* renamed from: jj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5365jj extends AbstractC7265tg implements InterfaceC5744li {
    public C5365jj(C0396Ev0 c0396Ev0, C3536eC0 c3536eC0, C0474Fv0 c0474Fv0) {
        super(c0396Ev0, c3536eC0, c0474Fv0);
        c0396Ev0.getClass();
        c0474Fv0.getClass();
    }

    @Override // defpackage.AbstractC7265tg
    public final Object a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // defpackage.AbstractC7265tg
    public final void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // defpackage.AbstractC7265tg
    public final int i(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // defpackage.AbstractC7265tg
    public final Object k(C4207hj c4207hj) {
        Bitmap bitmap = (Bitmap) super.k(c4207hj);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // defpackage.AbstractC7265tg
    public final boolean m(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // defpackage.AbstractC7265tg
    public final int h(int i) {
        return i;
    }

    @Override // defpackage.AbstractC7265tg
    public final int j(int i) {
        return i;
    }
}
