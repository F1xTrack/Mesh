package defpackage;

/* renamed from: If, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659If extends AbstractC1024Mx {
    public int g;
    public int h;
    public C0737Jf i;

    @Override // defpackage.AbstractC1024Mx
    public final void f(C3488dy c3488dy, boolean z) {
        int i = this.g;
        this.h = i;
        if (z) {
            if (i == 5) {
                this.h = 1;
            } else if (i == 6) {
                this.h = 0;
            }
        } else if (i == 5) {
            this.h = 0;
        } else if (i == 6) {
            this.h = 1;
        }
        if (c3488dy instanceof C0737Jf) {
            ((C0737Jf) c3488dy).f0 = this.h;
        }
    }

    public int getMargin() {
        return this.i.h0;
    }

    public int getType() {
        return this.g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.g0 = z;
    }

    public void setDpMargin(int i) {
        this.i.h0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i.h0 = i;
    }

    public void setType(int i) {
        this.g = i;
    }
}
