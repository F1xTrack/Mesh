package defpackage;

import com.facebook.react.bridge.Dynamic;

/* renamed from: ww0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7886ww0 extends AbstractC1512Td1 {
    public final boolean a;

    public AbstractC7886ww0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.AbstractC1512Td1
    public final Object a(Object obj, C7 c7) throws C1319Qr0 {
        if (obj != null && (!(obj instanceof Dynamic) || !((Dynamic) obj).isNull())) {
            return d(obj, c7);
        }
        if (this.a) {
            return null;
        }
        throw new C1319Qr0(3);
    }

    public abstract Object d(Object obj, C7 c7);
}
