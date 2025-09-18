package defpackage;

import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* renamed from: kb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5533kb0 extends AbstractC7886ww0 {
    public final /* synthetic */ int b;
    public final InterfaceC7454uf0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5533kb0(InterfaceC7454uf0 interfaceC7454uf0, int i) {
        super(interfaceC7454uf0.e());
        this.b = i;
        switch (i) {
            case 1:
                O90.f(interfaceC7454uf0, "type");
                super(interfaceC7454uf0.e());
                this.c = interfaceC7454uf0;
                break;
            default:
                O90.f(interfaceC7454uf0, "type");
                this.c = interfaceC7454uf0;
                break;
        }
    }

    @Override // defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        switch (this.b) {
            case 0:
                return new ExpectedType(EnumC2044Zz.t);
            default:
                return new ExpectedType(EnumC2044Zz.s, EnumC2044Zz.d);
        }
    }

    @Override // defpackage.AbstractC1512Td1
    public final boolean c() {
        switch (this.b) {
        }
        return false;
    }

    @Override // defpackage.AbstractC7886ww0
    public final Object d(Object obj, C7 c7) throws C7143t2 {
        SharedObject sharedObject;
        switch (this.b) {
            case 0:
                O90.f(obj, "value");
                JavaScriptFunction javaScriptFunction = (JavaScriptFunction) obj;
                if (((C0114Bf0) AbstractC8069xu.A(this.c.h())).b != null) {
                    return javaScriptFunction;
                }
                throw new IllegalArgumentException("Required value was null.");
            default:
                O90.f(obj, "value");
                int iAsInt = obj instanceof Dynamic ? ((Dynamic) obj).asInt() : ((Integer) obj).intValue();
                if (c7 == null) {
                    throw new C7143t2(6);
                }
                VY vy = c7.h;
                synchronized (vy) {
                    Pair pair = (Pair) ((LinkedHashMap) vy.d).get(new C6565q01(iAsInt));
                    sharedObject = pair != null ? (SharedObject) pair.a : null;
                }
                if (sharedObject != null) {
                    return sharedObject;
                }
                InterfaceC7454uf0 interfaceC7454uf0 = this.c;
                O90.f(interfaceC7454uf0, "sharedType");
                throw new C7143t2("Cannot convert provided JavaScriptObject to the '" + interfaceC7454uf0 + "', because it doesn't contain valid id", (Throwable) null);
        }
    }
}
