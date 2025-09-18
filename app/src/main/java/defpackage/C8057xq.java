package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: xq */
/* loaded from: classes.dex */
public final class C8057xq extends F9 {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8057xq(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.c = i;
        switch (i) {
            case 1:
                this.d = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.d = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.F9
    public final int i() {
        switch (this.c) {
            case 0:
                return this.d.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.o - carouselLayoutManager.D();
        }
    }

    @Override // defpackage.F9
    public final int k() {
        switch (this.c) {
            case 0:
                return this.d.E();
            default:
                return 0;
        }
    }

    @Override // defpackage.F9
    public final int l() {
        switch (this.c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.n - carouselLayoutManager.F();
            default:
                return this.d.n;
        }
    }

    @Override // defpackage.F9
    public final int m() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                if (carouselLayoutManager.E0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.F9
    public final int n() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.d.G();
        }
    }
}
