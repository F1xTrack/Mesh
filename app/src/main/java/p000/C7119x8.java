package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: x8 */
/* loaded from: classes.dex */
public class C7119x8 extends L01 implements Map {

    /* renamed from: h */
    public C6724r8 f45416h;

    /* renamed from: i */
    public C6867t8 f45417i;

    /* renamed from: j */
    public C6993v8 f45418j;

    public C7119x8(int i) {
        if (i == 0) {
            this.f6448a = AbstractC7500Dp0.f2262a;
            this.f6449b = AbstractC7500Dp0.f2264c;
        } else {
            m4821a(i);
        }
        this.f6450c = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6724r8 c6724r8 = this.f45416h;
        if (c6724r8 != null) {
            return c6724r8;
        }
        C6724r8 c6724r82 = new C6724r8(0, this);
        this.f45416h = c6724r82;
        return c6724r82;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C6867t8 c6867t8 = this.f45417i;
        if (c6867t8 != null) {
            return c6867t8;
        }
        C6867t8 c6867t82 = new C6867t8(this);
        this.f45417i = c6867t82;
        return c6867t82;
    }

    /* renamed from: n */
    public final boolean m25775n(Collection collection) {
        int i = this.f6450c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m4827i(i2))) {
                mo4829k(i2);
            }
        }
        return i != this.f6450c;
    }

    /* renamed from: o */
    public final Object[] m25776o(int i, Object[] objArr) {
        int i2 = this.f6450c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.f6449b[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4822b(map.size() + this.f6450c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C6993v8 c6993v8 = this.f45418j;
        if (c6993v8 != null) {
            return c6993v8;
        }
        C6993v8 c6993v82 = new C6993v8(this);
        this.f45418j = c6993v82;
        return c6993v82;
    }

    public C7119x8(C7119x8 c7119x8) {
        mo4828j(c7119x8);
    }
}
