package p000;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* renamed from: ka0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10027ka0 extends AbstractC6964ug {

    /* renamed from: c */
    public final int f36547c;

    /* renamed from: d */
    public final int f36548d;

    /* renamed from: e */
    public O01 f36549e;

    public C10027ka0(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        this.f36547c = 2;
        this.f36548d = i;
    }

    @Override // p000.AbstractC6964ug, p000.InterfaceC10747qC0
    /* renamed from: b */
    public final InterfaceC4199hl mo22219b() {
        if (this.f36549e == null) {
            this.f36549e = new O01("i" + this.f36547c + "r" + this.f36548d);
        }
        return this.f36549e;
    }

    @Override // p000.AbstractC6964ug
    /* renamed from: c */
    public final void mo22220c(Bitmap bitmap) {
        NativeBlurFilter.m10907a(bitmap, this.f36547c, this.f36548d);
    }
}
