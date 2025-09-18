package defpackage;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: Ok1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143Ok1 extends AbstractC1455Sk1 {
    public final boolean i;

    public C1143Ok1(InterfaceC5297jM0 interfaceC5297jM0, Method method, boolean z) {
        super(interfaceC5297jM0, "boolean", method);
        this.i = z;
    }

    @Override // defpackage.AbstractC1455Sk1
    public final Object a(Context context, Object obj) {
        return obj == null ? this.i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }
}
