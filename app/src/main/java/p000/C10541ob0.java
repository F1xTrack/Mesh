package p000;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import java.util.NoSuchElementException;

/* renamed from: ob0 */
/* loaded from: classes2.dex */
public final class C10541ob0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f39110e;

    /* renamed from: f */
    public final /* synthetic */ JavaScriptTypedArray f39111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10541ob0(JavaScriptTypedArray javaScriptTypedArray, int i) {
        super(0);
        this.f39110e = i;
        this.f39111f = javaScriptTypedArray;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f39110e) {
            case 0:
                return Integer.valueOf((int) this.f39111f.getProperty("byteLength").getDouble());
            case 1:
                return Integer.valueOf((int) this.f39111f.getProperty("byteOffset").getDouble());
            case 2:
                int rawKind = this.f39111f.getRawKind();
                for (EnumC7687He1 enumC7687He1 : EnumC7687He1.values()) {
                    if (enumC7687He1.f4395a == rawKind) {
                        return enumC7687He1;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            default:
                return Integer.valueOf((int) this.f39111f.getProperty("length").getDouble());
        }
    }
}
