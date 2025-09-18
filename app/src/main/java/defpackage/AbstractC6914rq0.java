package defpackage;

import android.util.SparseIntArray;

/* renamed from: rq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6914rq0 extends AbstractC7265tg {
    public final int[] j;

    public AbstractC6914rq0(InterfaceC8248yq0 interfaceC8248yq0, C3536eC0 c3536eC0, InterfaceC3727fC0 interfaceC3727fC0) {
        super(interfaceC8248yq0, c3536eC0, interfaceC3727fC0);
        SparseIntArray sparseIntArray = c3536eC0.c;
        sparseIntArray.getClass();
        this.j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                this.b.getClass();
                this.i.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC7265tg
    public final void e(Object obj) {
        InterfaceC6724qq0 interfaceC6724qq0 = (InterfaceC6724qq0) obj;
        interfaceC6724qq0.getClass();
        interfaceC6724qq0.close();
    }

    @Override // defpackage.AbstractC7265tg
    public final int h(int i) {
        if (i <= 0) {
            throw new C7074sg(Integer.valueOf(i));
        }
        for (int i2 : this.j) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // defpackage.AbstractC7265tg
    public final int i(Object obj) {
        InterfaceC6724qq0 interfaceC6724qq0 = (InterfaceC6724qq0) obj;
        interfaceC6724qq0.getClass();
        return interfaceC6724qq0.getSize();
    }

    @Override // defpackage.AbstractC7265tg
    public final boolean m(Object obj) {
        ((InterfaceC6724qq0) obj).getClass();
        return !r1.isClosed();
    }

    @Override // defpackage.AbstractC7265tg
    public final int j(int i) {
        return i;
    }
}
