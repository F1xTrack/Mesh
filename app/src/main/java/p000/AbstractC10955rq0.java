package p000;

import android.util.SparseIntArray;

/* renamed from: rq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10955rq0 extends AbstractC6901tg {

    /* renamed from: j */
    public final int[] f41927j;

    public AbstractC10955rq0(InterfaceC11848yq0 interfaceC11848yq0, C9211eC0 c9211eC0, InterfaceC9339fC0 interfaceC9339fC0) {
        super(interfaceC11848yq0, c9211eC0, interfaceC9339fC0);
        SparseIntArray sparseIntArray = c9211eC0.f26592c;
        sparseIntArray.getClass();
        this.f41927j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f41927j;
            if (i >= iArr.length) {
                this.f43206b.getClass();
                this.f43213i.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: e */
    public final void mo1968e(Object obj) {
        InterfaceC10827qq0 interfaceC10827qq0 = (InterfaceC10827qq0) obj;
        interfaceC10827qq0.getClass();
        interfaceC10827qq0.close();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: h */
    public final int mo1969h(int i) {
        if (i <= 0) {
            throw new C6838sg(Integer.valueOf(i));
        }
        for (int i2 : this.f41927j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: i */
    public final int mo1970i(Object obj) {
        InterfaceC10827qq0 interfaceC10827qq0 = (InterfaceC10827qq0) obj;
        interfaceC10827qq0.getClass();
        return interfaceC10827qq0.getSize();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: m */
    public final boolean mo22096m(Object obj) {
        ((InterfaceC10827qq0) obj).getClass();
        return !r1.isClosed();
    }

    @Override // p000.AbstractC6901tg
    /* renamed from: j */
    public final int mo1971j(int i) {
        return i;
    }
}
