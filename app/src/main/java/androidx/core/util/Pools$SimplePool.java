package androidx.core.util;

import p000.InterfaceC9979kC0;
import p000.O90;

/* loaded from: classes.dex */
public class Pools$SimplePool implements InterfaceC9979kC0 {

    /* renamed from: a */
    public final Object[] f16107a;

    /* renamed from: b */
    public int f16108b;

    public Pools$SimplePool(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f16107a = new Object[i];
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: d */
    public boolean mo4580d(Object obj) {
        Object[] objArr;
        boolean z;
        O90.m5968f(obj, "instance");
        int i = this.f16108b;
        int i2 = 0;
        while (true) {
            objArr = this.f16107a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f16108b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f16108b = i3 + 1;
        return true;
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: i */
    public Object mo4581i() {
        int i = this.f16108b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f16107a;
        Object obj = objArr[i2];
        O90.m5966d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f16108b--;
        return obj;
    }
}
