package p000;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: jf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9910jf1 extends AbstractC11700xf1 {

    /* renamed from: b */
    public final /* synthetic */ int f35311b = 1;

    /* renamed from: c */
    public final /* synthetic */ C11827yf1 f35312c;

    /* renamed from: d */
    public final Object f35313d;

    /* renamed from: e */
    public final Serializable f35314e;

    /* renamed from: f */
    public final Object f35315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9910jf1(C11827yf1 c11827yf1, S91 s91, int i, String str, NM0 nm0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(i);
        this.f35312c = c11827yf1;
        this.f35313d = s91;
        this.f35314e = str;
        this.f35315f = nm0;
        MT1.m5370a(i, "createView");
    }

    @Override // p000.InterfaceC11318uf1
    public final void execute() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f35311b) {
            case 0:
                int i = this.f45729a;
                MT1.m5372c(i, "createView");
                this.f35312c.f46385b.createView((S91) this.f35313d, i, (String) this.f35314e, (NM0) this.f35315f);
                break;
            default:
                this.f35312c.f46385b.manageChildren(this.f45729a, (int[]) this.f35313d, (C8581Yj1[]) this.f35314e, (int[]) this.f35315f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9910jf1(C11827yf1 c11827yf1, int i, int[] iArr, C8581Yj1[] c8581Yj1Arr, int[] iArr2) {
        super(i);
        this.f35312c = c11827yf1;
        this.f35313d = iArr;
        this.f35314e = c8581Yj1Arr;
        this.f35315f = iArr2;
    }
}
