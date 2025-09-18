package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;

/* renamed from: Kg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0818Kg extends AbstractC7886ww0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0818Kg(boolean z, int i) {
        super(z);
        this.b = i;
    }

    @Override // defpackage.AbstractC1512Td1
    public ExpectedType b() {
        return new ExpectedType(EnumC2044Zz.n);
    }

    @Override // defpackage.AbstractC1512Td1
    public boolean c() {
        switch (this.b) {
            case 0:
                return this instanceof C0658Ie1;
            default:
                return super.c();
        }
    }

    @Override // defpackage.AbstractC7886ww0
    public final Object d(Object obj, C7 c7) {
        switch (this.b) {
            case 0:
                O90.f(obj, "value");
                return g((JavaScriptTypedArray) obj);
            default:
                O90.f(obj, "value");
                return obj instanceof Dynamic ? f((Dynamic) obj) : e(obj);
        }
    }

    public abstract Object e(Object obj);

    public abstract Object f(Dynamic dynamic);

    public abstract InterfaceC0502Ge1 g(JavaScriptTypedArray javaScriptTypedArray);
}
