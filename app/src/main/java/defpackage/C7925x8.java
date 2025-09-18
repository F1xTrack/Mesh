package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: x8 */
/* loaded from: classes.dex */
public class C7925x8 extends L01 implements Map {
    public C6781r8 h;
    public C7163t8 i;
    public C7545v8 j;

    public C7925x8(int i) {
        if (i == 0) {
            this.a = AbstractC0300Dp0.a;
            this.b = AbstractC0300Dp0.c;
        } else {
            a(i);
        }
        this.c = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6781r8 c6781r8 = this.h;
        if (c6781r8 != null) {
            return c6781r8;
        }
        C6781r8 c6781r82 = new C6781r8(0, this);
        this.h = c6781r82;
        return c6781r82;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C7163t8 c7163t8 = this.i;
        if (c7163t8 != null) {
            return c7163t8;
        }
        C7163t8 c7163t82 = new C7163t8(this);
        this.i = c7163t82;
        return c7163t82;
    }

    public final boolean n(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(i(i2))) {
                k(i2);
            }
        }
        return i != this.c;
    }

    public final Object[] o(int i, Object[] objArr) {
        int i2 = this.c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.b[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C7545v8 c7545v8 = this.j;
        if (c7545v8 != null) {
            return c7545v8;
        }
        C7545v8 c7545v82 = new C7545v8(this);
        this.j = c7545v82;
        return c7545v82;
    }

    public C7925x8(C7925x8 c7925x8) {
        j(c7925x8);
    }
}
