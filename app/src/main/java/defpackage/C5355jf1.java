package defpackage;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: jf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5355jf1 extends AbstractC8026xf1 {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ C8216yf1 c;
    public final Object d;
    public final Serializable e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5355jf1(C8216yf1 c8216yf1, S91 s91, int i, String str, NM0 nm0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(i);
        this.c = c8216yf1;
        this.d = s91;
        this.e = str;
        this.f = nm0;
        MT1.a(i, "createView");
    }

    @Override // defpackage.InterfaceC7455uf1
    public final void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.b) {
            case 0:
                int i = this.a;
                MT1.c(i, "createView");
                this.c.b.createView((S91) this.d, i, (String) this.e, (NM0) this.f);
                break;
            default:
                this.c.b.manageChildren(this.a, (int[]) this.d, (C1920Yj1[]) this.e, (int[]) this.f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5355jf1(C8216yf1 c8216yf1, int i, int[] iArr, C1920Yj1[] c1920Yj1Arr, int[] iArr2) {
        super(i);
        this.c = c8216yf1;
        this.d = iArr;
        this.e = c1920Yj1Arr;
        this.f = iArr2;
    }
}
