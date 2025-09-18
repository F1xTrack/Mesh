package p000;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class G80 implements InterfaceC1145SC {

    /* renamed from: a */
    public final C11967zm0 f3598a;

    public G80(C11967zm0 c11967zm0) {
        this.f3598a = c11967zm0;
    }

    @Override // p000.InterfaceC1145SC
    /* renamed from: a */
    public final Class mo2927a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC1145SC
    /* renamed from: b */
    public final InterfaceC1208TC mo2928b(Object obj) {
        return new G10((InputStream) obj, this.f3598a);
    }
}
