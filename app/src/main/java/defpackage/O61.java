package defpackage;

import com.swmansion.reanimated.keyboard.WindowsInsetsManager;

/* loaded from: classes.dex */
public final /* synthetic */ class O61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ O61(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                R61 r61 = (R61) this.d;
                int i = r61.i;
                int i2 = this.b;
                boolean z2 = true;
                if (i != i2) {
                    r61.i = i2;
                    z = true;
                } else {
                    z = false;
                }
                int i3 = r61.h;
                int i4 = this.c;
                if (i3 != i4) {
                    r61.h = i4;
                } else {
                    z2 = z;
                }
                if (z2) {
                    r61.f();
                    break;
                }
                break;
            default:
                ((WindowsInsetsManager) this.d).lambda$updateInsets$1(this.b, this.c);
                break;
        }
    }
}
