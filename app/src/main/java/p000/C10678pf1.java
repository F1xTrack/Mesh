package p000;

import com.facebook.react.bridge.Callback;

/* renamed from: pf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10678pf1 implements InterfaceC11318uf1 {

    /* renamed from: a */
    public final /* synthetic */ int f40268a;

    /* renamed from: b */
    public final int f40269b;

    /* renamed from: c */
    public final Callback f40270c;

    /* renamed from: d */
    public final /* synthetic */ C11827yf1 f40271d;

    public /* synthetic */ C10678pf1(C11827yf1 c11827yf1, int i, Callback callback, int i2) {
        this.f40268a = i2;
        this.f40271d = c11827yf1;
        this.f40269b = i;
        this.f40270c = callback;
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() {
        int i = this.f40269b;
        C11827yf1 c11827yf1 = this.f40271d;
        Callback callback = this.f40270c;
        switch (this.f40268a) {
            case 0:
                try {
                    c11827yf1.f46385b.measureInWindow(i, c11827yf1.f46384a);
                    callback.invoke(Float.valueOf(AbstractC11406vL1.m25402a(r2[0])), Float.valueOf(AbstractC11406vL1.m25402a(r2[1])), Float.valueOf(AbstractC11406vL1.m25402a(r2[2])), Float.valueOf(AbstractC11406vL1.m25402a(r2[3])));
                    break;
                } catch (C7720Hv0 unused) {
                    callback.invoke(new Object[0]);
                }
            default:
                try {
                    c11827yf1.f46385b.measure(i, c11827yf1.f46384a);
                    callback.invoke(0, 0, Float.valueOf(AbstractC11406vL1.m25402a(r2[2])), Float.valueOf(AbstractC11406vL1.m25402a(r2[3])), Float.valueOf(AbstractC11406vL1.m25402a(r2[0])), Float.valueOf(AbstractC11406vL1.m25402a(r2[1])));
                    break;
                } catch (C7720Hv0 unused2) {
                    callback.invoke(new Object[0]);
                    return;
                }
        }
    }
}
