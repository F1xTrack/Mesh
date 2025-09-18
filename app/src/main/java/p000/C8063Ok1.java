package p000;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: Ok1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8063Ok1 extends AbstractC8271Sk1 {

    /* renamed from: i */
    public final boolean f8594i;

    public C8063Ok1(InterfaceC9871jM0 interfaceC9871jM0, Method method, boolean z) {
        super(interfaceC9871jM0, "boolean", method);
        this.f8594i = z;
    }

    @Override // p000.AbstractC8271Sk1
    /* renamed from: a */
    public final Object mo5830a(Context context, Object obj) {
        return obj == null ? this.f8594i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
    }
}
