package p000;

import android.window.BackEvent;

/* renamed from: tf */
/* loaded from: classes.dex */
public final class C6900tf {

    /* renamed from: a */
    public final float f43192a;

    /* renamed from: b */
    public final float f43193b;

    /* renamed from: c */
    public final float f43194c;

    /* renamed from: d */
    public final int f43195d;

    public C6900tf(BackEvent backEvent) {
        O90.m5968f(backEvent, "backEvent");
        C1390W5 c1390w5 = C1390W5.f12991a;
        float fM8668d = c1390w5.m8668d(backEvent);
        float fM8669e = c1390w5.m8669e(backEvent);
        float fM8666b = c1390w5.m8666b(backEvent);
        int iM8667c = c1390w5.m8667c(backEvent);
        this.f43192a = fM8668d;
        this.f43193b = fM8669e;
        this.f43194c = fM8666b;
        this.f43195d = iM8667c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f43192a);
        sb.append(", touchY=");
        sb.append(this.f43193b);
        sb.append(", progress=");
        sb.append(this.f43194c);
        sb.append(", swipeEdge=");
        return AbstractC7222ym.m26235l(sb, this.f43195d, '}');
    }
}
