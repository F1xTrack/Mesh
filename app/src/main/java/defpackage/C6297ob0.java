package defpackage;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.NoSuchElementException;

/* renamed from: ob0 */
/* loaded from: classes2.dex */
public final class C6297ob0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ JavaScriptTypedArray f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6297ob0(JavaScriptTypedArray javaScriptTypedArray, int i) {
        super(0);
        this.e = i;
        this.f = javaScriptTypedArray;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return Integer.valueOf((int) this.f.getProperty("byteLength").getDouble());
            case 1:
                return Integer.valueOf((int) this.f.getProperty("byteOffset").getDouble());
            case 2:
                int rawKind = this.f.getRawKind();
                for (EnumC0580He1 enumC0580He1 : EnumC0580He1.values()) {
                    if (enumC0580He1.a == rawKind) {
                        return enumC0580He1;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            default:
                return Integer.valueOf((int) this.f.getProperty("length").getDouble());
        }
    }
}
