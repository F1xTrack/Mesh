package p000;

import java.util.Map;

/* loaded from: classes.dex */
public final class D30 extends C8988cV0 {

    /* renamed from: H */
    public final Map f1809H;

    /* renamed from: I */
    public C0589JL f1810I;

    public D30(C6224jE c6224jE, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, Map map) {
        super(c6224jE, interfaceC1091RL, c0903ol);
        this.f1809H = map;
    }

    @Override // p000.C8988cV0
    /* renamed from: n */
    public final C6686qX mo1523n(C6686qX c6686qX) {
        C0589JL c0589jl;
        C0589JL c0589jl2 = this.f1810I;
        if (c0589jl2 == null) {
            c0589jl2 = c6686qX.f40978q;
        }
        if (c0589jl2 != null && (c0589jl = (C0589JL) this.f1809H.get(c0589jl2.f5487c)) != null) {
            c0589jl2 = c0589jl;
        }
        C7660Gr0 c7660Gr0 = c6686qX.f40972k;
        C7660Gr0 c7660Gr02 = null;
        if (c7660Gr0 == null) {
            c7660Gr0 = c7660Gr02;
        } else {
            InterfaceC7556Er0[] interfaceC7556Er0Arr = c7660Gr0.f3928a;
            int length = interfaceC7556Er0Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                InterfaceC7556Er0 interfaceC7556Er0 = interfaceC7556Er0Arr[i2];
                if ((interfaceC7556Er0 instanceof AD0) && "com.apple.streaming.transportStreamTimestamp".equals(((AD0) interfaceC7556Er0).f109b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    InterfaceC7556Er0[] interfaceC7556Er0Arr2 = new InterfaceC7556Er0[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            interfaceC7556Er0Arr2[i < i2 ? i : i - 1] = interfaceC7556Er0Arr[i];
                        }
                        i++;
                    }
                    c7660Gr02 = new C7660Gr0(interfaceC7556Er0Arr2);
                }
                c7660Gr0 = c7660Gr02;
            }
        }
        if (c0589jl2 != c6686qX.f40978q || c7660Gr0 != c6686qX.f40972k) {
            C6623pX c6623pXM24020a = c6686qX.m24020a();
            c6623pXM24020a.f40165p = c0589jl2;
            c6623pXM24020a.f40159j = c7660Gr0;
            c6686qX = new C6686qX(c6623pXM24020a);
        }
        return super.mo1523n(c6686qX);
    }
}
