package defpackage;

import android.view.View;

/* renamed from: xG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7950xG0 {
    public static final C7950xG0 d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new C7950xG0(i, i, 0);
    }

    public /* synthetic */ C7950xG0(int i) {
        this.a = i;
    }

    public void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 < i || (i2 = this.b) <= 0) {
            AbstractC3393dS.u("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.c), Integer.valueOf(this.b));
        } else {
            this.b = i2 - 1;
            this.c = i3 - i;
        }
    }

    public int b() {
        int i = this.c;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void c(OO0 oo0) {
        View view = oo0.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(C7950xG0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return AbstractC1705Vq.j(sb, this.c, "]");
            case 7:
                StringBuilder sb2 = new StringBuilder("GridSize{rows=");
                sb2.append(this.b);
                sb2.append(", cols=");
                return AbstractC8235ym.l(sb2, this.c, '}');
            case 8:
                StringBuilder sb3 = new StringBuilder("Holder{row=");
                sb3.append(this.b);
                sb3.append(", col=");
                return AbstractC8235ym.l(sb3, this.c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C7950xG0(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
