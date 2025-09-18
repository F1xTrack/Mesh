package p000;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class K70 extends AbstractC0442H0 implements Serializable {

    /* renamed from: a */
    public final Object f5909a;

    /* renamed from: b */
    public final Object f5910b;

    public K70(Object obj, Object obj2) {
        this.f5909a = obj;
        this.f5910b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5909a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5910b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
