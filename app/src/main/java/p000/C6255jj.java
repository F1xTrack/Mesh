package p000;

import android.graphics.Bitmap;

/* renamed from: jj */
/* loaded from: classes.dex */
public final class C6255jj extends AbstractC6901tg implements InterfaceC6380li {
    public C6255jj(C7564Ev0 c7564Ev0, C9211eC0 c9211eC0, C7616Fv0 c7616Fv0) {
        super(c7564Ev0, c9211eC0, c7616Fv0);
        c7564Ev0.getClass();
        c7616Fv0.getClass();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: a */
    public final Object mo1967a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: e */
    public final void mo1968e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: i */
    public final int mo1970i(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: k */
    public final Object mo22095k(C4197hj c4197hj) {
        Bitmap bitmap = (Bitmap) super.mo22095k(c4197hj);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: m */
    public final boolean mo22096m(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: h */
    public final int mo1969h(int i) {
        return i;
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: j */
    public final int mo1971j(int i) {
        return i;
    }
}
