package p000;

import com.facebook.react.bridge.Dynamic;

/* renamed from: ww0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11606ww0 extends AbstractC8309Td1 {

    /* renamed from: a */
    public final boolean f45172a;

    public AbstractC11606ww0(boolean z) {
        this.f45172a = z;
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: a */
    public final Object mo7706a(Object obj, C0134C7 c0134c7) throws C8180Qr0 {
        if (obj != null && (!(obj instanceof Dynamic) || !((Dynamic) obj).isNull())) {
            return mo4700d(obj, c0134c7);
        }
        if (this.f45172a) {
            return null;
        }
        throw new C8180Qr0(3);
    }

    /* renamed from: d */
    public abstract Object mo4700d(Object obj, C0134C7 c0134c7);
}
