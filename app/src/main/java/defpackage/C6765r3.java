package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: r3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6765r3 implements InterfaceC8274yz {
    public final InterfaceC8274yz a;
    public final float b;

    public C6765r3(float f, InterfaceC8274yz interfaceC8274yz) {
        while (interfaceC8274yz instanceof C6765r3) {
            interfaceC8274yz = ((C6765r3) interfaceC8274yz).a;
            f += ((C6765r3) interfaceC8274yz).b;
        }
        this.a = interfaceC8274yz;
        this.b = f;
    }

    @Override // defpackage.InterfaceC8274yz
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6765r3)) {
            return false;
        }
        C6765r3 c6765r3 = (C6765r3) obj;
        return this.a.equals(c6765r3.a) && this.b == c6765r3.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
