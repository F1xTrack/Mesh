package p000;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* renamed from: kb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10029kb0 extends AbstractC11606ww0 {

    /* renamed from: b */
    public final /* synthetic */ int f36558b;

    /* renamed from: c */
    public final InterfaceC11317uf0 f36559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10029kb0(InterfaceC11317uf0 interfaceC11317uf0, int i) {
        super(interfaceC11317uf0.mo8537e());
        this.f36558b = i;
        switch (i) {
            case 1:
                O90.m5968f(interfaceC11317uf0, "type");
                super(interfaceC11317uf0.mo8537e());
                this.f36559c = interfaceC11317uf0;
                break;
            default:
                O90.m5968f(interfaceC11317uf0, "type");
                this.f36559c = interfaceC11317uf0;
                break;
        }
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        switch (this.f36558b) {
            case 0:
                return new ExpectedType(EnumC1635Zz.f15262t);
            default:
                return new ExpectedType(EnumC1635Zz.f15261s, EnumC1635Zz.f15246d);
        }
    }

    @Override // p000.AbstractC8309Td1
    /* renamed from: c */
    public final boolean mo3314c() {
        switch (this.f36558b) {
        }
        return false;
    }

    @Override // p000.AbstractC11606ww0
    /* renamed from: d */
    public final Object mo4700d(Object obj, C0134C7 c0134c7) throws C6861t2 {
        SharedObject sharedObject;
        switch (this.f36558b) {
            case 0:
                O90.m5968f(obj, "value");
                JavaScriptFunction javaScriptFunction = (JavaScriptFunction) obj;
                if (((C7376Bf0) AbstractC7167xu.m25955A(this.f36559c.mo8538h())).f969b != null) {
                    return javaScriptFunction;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                O90.m5968f(obj, "value");
                int iAsInt = obj instanceof Dynamic ? ((Dynamic) obj).asInt() : ((Integer) obj).intValue();
                if (c0134c7 == null) {
                    throw new C6861t2(6);
                }
                C1356VY c1356vy = c0134c7.f1203h;
                synchronized (c1356vy) {
                    Pair pair = (Pair) ((LinkedHashMap) c1356vy.f12613d).get(new C10720q01(iAsInt));
                    sharedObject = pair != null ? (SharedObject) pair.f36702a : null;
                }
                if (sharedObject != null) {
                    return sharedObject;
                }
                InterfaceC11317uf0 interfaceC11317uf0 = this.f36559c;
                O90.m5968f(interfaceC11317uf0, "sharedType");
                throw new C6861t2("Cannot convert provided JavaScriptObject to the '" + interfaceC11317uf0 + "', because it doesn't contain valid id", (Throwable) null);
        }
    }
}
