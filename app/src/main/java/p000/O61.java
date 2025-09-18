package p000;

import com.swmansion.reanimated.keyboard.WindowsInsetsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class O61 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8238a;

    /* renamed from: b */
    public final /* synthetic */ int f8239b;

    /* renamed from: c */
    public final /* synthetic */ int f8240c;

    /* renamed from: d */
    public final /* synthetic */ Object f8241d;

    public /* synthetic */ O61(Object obj, int i, int i2, int i3) {
        this.f8238a = i3;
        this.f8241d = obj;
        this.f8239b = i;
        this.f8240c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.f8238a) {
            case 0:
                R61 r61 = (R61) this.f8241d;
                int i = r61.f10010i;
                int i2 = this.f8239b;
                boolean z2 = true;
                if (i != i2) {
                    r61.f10010i = i2;
                    z = true;
                } else {
                    z = false;
                }
                int i3 = r61.f10009h;
                int i4 = this.f8240c;
                if (i3 != i4) {
                    r61.f10009h = i4;
                } else {
                    z2 = z;
                }
                if (z2) {
                    r61.m6901f();
                    break;
                }
                break;
            default:
                ((WindowsInsetsManager) this.f8241d).lambda$updateInsets$1(this.f8239b, this.f8240c);
                break;
        }
    }
}
