package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: xq */
/* loaded from: classes.dex */
public final class C7163xq extends AbstractC0325F9 {

    /* renamed from: c */
    public final /* synthetic */ int f45843c;

    /* renamed from: d */
    public final /* synthetic */ CarouselLayoutManager f45844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7163xq(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.f45843c = i;
        switch (i) {
            case 1:
                this.f45844d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f45844d = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.AbstractC0325F9
    /* renamed from: i */
    public final int mo2502i() {
        switch (this.f45843c) {
            case 0:
                return this.f45844d.f46827o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f45844d;
                return carouselLayoutManager.f46827o - carouselLayoutManager.m26410D();
        }
    }

    @Override // p000.AbstractC0325F9
    /* renamed from: k */
    public final int mo2503k() {
        switch (this.f45843c) {
            case 0:
                return this.f45844d.m26411E();
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC0325F9
    /* renamed from: l */
    public final int mo2504l() {
        switch (this.f45843c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f45844d;
                return carouselLayoutManager.f46826n - carouselLayoutManager.m26412F();
            default:
                return this.f45844d.f46826n;
        }
    }

    @Override // p000.AbstractC0325F9
    /* renamed from: m */
    public final int mo2505m() {
        switch (this.f45843c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f45844d;
                if (carouselLayoutManager.m11225E0()) {
                    return carouselLayoutManager.f46826n;
                }
                return 0;
        }
    }

    @Override // p000.AbstractC0325F9
    /* renamed from: n */
    public final int mo2506n() {
        switch (this.f45843c) {
            case 0:
                return 0;
            default:
                return this.f45844d.m26413G();
        }
    }
}
