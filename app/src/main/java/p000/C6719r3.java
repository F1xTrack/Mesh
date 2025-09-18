package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: r3 */
/* loaded from: classes.dex */
public final class C6719r3 implements InterfaceC7235yz {

    /* renamed from: a */
    public final InterfaceC7235yz f41308a;

    /* renamed from: b */
    public final float f41309b;

    public C6719r3(float f, InterfaceC7235yz interfaceC7235yz) {
        while (interfaceC7235yz instanceof C6719r3) {
            interfaceC7235yz = ((C6719r3) interfaceC7235yz).f41308a;
            f += ((C6719r3) interfaceC7235yz).f41309b;
        }
        this.f41308a = interfaceC7235yz;
        this.f41309b = f;
    }

    @Override // p000.InterfaceC7235yz
    /* renamed from: a */
    public final float mo22818a(RectF rectF) {
        return Math.max(0.0f, this.f41308a.mo22818a(rectF) + this.f41309b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6719r3)) {
            return false;
        }
        C6719r3 c6719r3 = (C6719r3) obj;
        return this.f41308a.equals(c6719r3.f41308a) && this.f41309b == c6719r3.f41309b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41308a, Float.valueOf(this.f41309b)});
    }
}
