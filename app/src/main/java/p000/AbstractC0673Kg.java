package p000;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;

/* renamed from: Kg */
/* loaded from: classes2.dex */
public abstract class AbstractC0673Kg extends AbstractC11606ww0 {

    /* renamed from: b */
    public final /* synthetic */ int f6250b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0673Kg(boolean z, int i) {
        super(z);
        this.f6250b = i;
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: b */
    public ExpectedType mo3313b() {
        return new ExpectedType(EnumC1635Zz.f15256n);
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: c */
    public boolean mo3314c() {
        switch (this.f6250b) {
            case 0:
                return this instanceof C7739Ie1;
            default:
                return super.mo3314c();
        }
    }

    @Override // p000.AbstractC11606ww0
    /* renamed from: d */
    public final Object mo4700d(Object obj, C0134C7 c0134c7) {
        switch (this.f6250b) {
            case 0:
                O90.m5968f(obj, "value");
                return mo3960g((JavaScriptTypedArray) obj);
            default:
                O90.m5968f(obj, "value");
                return obj instanceof Dynamic ? mo3316f((Dynamic) obj) : mo3315e(obj);
        }
    }

    /* renamed from: e */
    public abstract Object mo3315e(Object obj);

    /* renamed from: f */
    public abstract Object mo3316f(Dynamic dynamic);

    /* renamed from: g */
    public abstract InterfaceC7635Ge1 mo3960g(JavaScriptTypedArray javaScriptTypedArray);
}
