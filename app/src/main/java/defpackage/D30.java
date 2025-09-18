package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class D30 extends C2527cV0 {
    public final Map H;
    public JL I;

    public D30(C5272jE c5272jE, RL rl, OL ol, Map map) {
        super(c5272jE, rl, ol);
        this.H = map;
    }

    @Override // defpackage.C2527cV0
    public final C6666qX n(C6666qX c6666qX) {
        JL jl;
        JL jl2 = this.I;
        if (jl2 == null) {
            jl2 = c6666qX.q;
        }
        if (jl2 != null && (jl = (JL) this.H.get(jl2.c)) != null) {
            jl2 = jl;
        }
        C0540Gr0 c0540Gr0 = c6666qX.k;
        C0540Gr0 c0540Gr02 = null;
        if (c0540Gr0 == null) {
            c0540Gr0 = c0540Gr02;
        } else {
            InterfaceC0384Er0[] interfaceC0384Er0Arr = c0540Gr0.a;
            int length = interfaceC0384Er0Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                InterfaceC0384Er0 interfaceC0384Er0 = interfaceC0384Er0Arr[i2];
                if ((interfaceC0384Er0 instanceof AD0) && "com.apple.streaming.transportStreamTimestamp".equals(((AD0) interfaceC0384Er0).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    InterfaceC0384Er0[] interfaceC0384Er0Arr2 = new InterfaceC0384Er0[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            interfaceC0384Er0Arr2[i < i2 ? i : i - 1] = interfaceC0384Er0Arr[i];
                        }
                        i++;
                    }
                    c0540Gr02 = new C0540Gr0(interfaceC0384Er0Arr2);
                }
                c0540Gr0 = c0540Gr02;
            }
        }
        if (jl2 != c6666qX.q || c0540Gr0 != c6666qX.k) {
            C6475pX c6475pXA = c6666qX.a();
            c6475pXA.p = jl2;
            c6475pXA.j = c0540Gr0;
            c6666qX = new C6666qX(c6475pXA);
        }
        return super.n(c6666qX);
    }
}
