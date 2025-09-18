package p000;

import android.view.View;

/* renamed from: xG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11649xG0 {

    /* renamed from: d */
    public static final C11649xG0 f45506d;

    /* renamed from: a */
    public final /* synthetic */ int f45507a;

    /* renamed from: b */
    public int f45508b;

    /* renamed from: c */
    public int f45509c;

    static {
        int i = 0;
        f45506d = new C11649xG0(i, i, 0);
    }

    public /* synthetic */ C11649xG0(int i) {
        this.f45507a = i;
    }

    /* renamed from: a */
    public void m25821a(int i) {
        int i2;
        int i3 = this.f45509c;
        if (i3 < i || (i2 = this.f45508b) <= 0) {
            AbstractC3929dS.m17688u("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f45509c), Integer.valueOf(this.f45508b));
        } else {
            this.f45508b = i2 - 1;
            this.f45509c = i3 - i;
        }
    }

    /* renamed from: b */
    public int m25822b() {
        int i = this.f45509c;
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

    /* renamed from: c */
    public void m25823c(OO0 oo0) {
        View view = oo0.f8408a;
        this.f45508b = view.getLeft();
        this.f45509c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.f45507a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(C11649xG0.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.f45508b);
                sb.append(", length = ");
                return AbstractC1374Vq.m8591j(sb, this.f45509c, "]");
            case 7:
                StringBuilder sb2 = new StringBuilder("GridSize{rows=");
                sb2.append(this.f45508b);
                sb2.append(", cols=");
                return AbstractC7222ym.m26235l(sb2, this.f45509c, '}');
            case 8:
                StringBuilder sb3 = new StringBuilder("Holder{row=");
                sb3.append(this.f45508b);
                sb3.append(", col=");
                return AbstractC7222ym.m26235l(sb3, this.f45509c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C11649xG0(int i, int i2, int i3) {
        this.f45507a = i3;
        this.f45508b = i;
        this.f45509c = i2;
    }
}
