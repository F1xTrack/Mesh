package defpackage;

import com.facebook.react.bridge.Callback;

/* renamed from: pf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6501pf1 implements InterfaceC7455uf1 {
    public final /* synthetic */ int a;
    public final int b;
    public final Callback c;
    public final /* synthetic */ C8216yf1 d;

    public /* synthetic */ C6501pf1(C8216yf1 c8216yf1, int i, Callback callback, int i2) {
        this.a = i2;
        this.d = c8216yf1;
        this.b = i;
        this.c = callback;
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() {
        int i = this.b;
        C8216yf1 c8216yf1 = this.d;
        Callback callback = this.c;
        switch (this.a) {
            case 0:
                try {
                    c8216yf1.b.measureInWindow(i, c8216yf1.a);
                    callback.invoke(Float.valueOf(AbstractC7586vL1.a(r2[0])), Float.valueOf(AbstractC7586vL1.a(r2[1])), Float.valueOf(AbstractC7586vL1.a(r2[2])), Float.valueOf(AbstractC7586vL1.a(r2[3])));
                    break;
                } catch (C0630Hv0 unused) {
                    callback.invoke(new Object[0]);
                }
            default:
                try {
                    c8216yf1.b.measure(i, c8216yf1.a);
                    callback.invoke(0, 0, Float.valueOf(AbstractC7586vL1.a(r2[2])), Float.valueOf(AbstractC7586vL1.a(r2[3])), Float.valueOf(AbstractC7586vL1.a(r2[0])), Float.valueOf(AbstractC7586vL1.a(r2[1])));
                    break;
                } catch (C0630Hv0 unused2) {
                    callback.invoke(new Object[0]);
                    return;
                }
        }
    }
}
