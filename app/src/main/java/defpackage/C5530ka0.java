package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: ka0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5530ka0 extends AbstractC7456ug {
    public final int c;
    public final int d;
    public O01 e;

    public C5530ka0(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        this.c = 2;
        this.d = i;
    }

    @Override // defpackage.AbstractC7456ug, defpackage.InterfaceC6604qC0
    public final InterfaceC4213hl b() {
        if (this.e == null) {
            this.e = new O01("i" + this.c + "r" + this.d);
        }
        return this.e;
    }

    @Override // defpackage.AbstractC7456ug
    public final void c(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.c, this.d);
    }
}
