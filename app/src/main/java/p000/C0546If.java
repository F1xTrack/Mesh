package p000;

/* renamed from: If */
/* loaded from: classes.dex */
public final class C0546If extends AbstractC0815Mx {

    /* renamed from: g */
    public int f5066g;

    /* renamed from: h */
    public int f5067h;

    /* renamed from: i */
    public C0609Jf f5068i;

    @Override // p000.AbstractC0815Mx
    /* renamed from: f */
    public final void mo3961f(C3960dy c3960dy, boolean z) {
        int i = this.f5066g;
        this.f5067h = i;
        if (z) {
            if (i == 5) {
                this.f5067h = 1;
            } else if (i == 6) {
                this.f5067h = 0;
            }
        } else if (i == 5) {
            this.f5067h = 0;
        } else if (i == 6) {
            this.f5067h = 1;
        }
        if (c3960dy instanceof C0609Jf) {
            ((C0609Jf) c3960dy).f5662f0 = this.f5067h;
        }
    }

    public int getMargin() {
        return this.f5068i.f5664h0;
    }

    public int getType() {
        return this.f5066g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f5068i.f5663g0 = z;
    }

    public void setDpMargin(int i) {
        this.f5068i.f5664h0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f5068i.f5664h0 = i;
    }

    public void setType(int i) {
        this.f5066g = i;
    }
}
