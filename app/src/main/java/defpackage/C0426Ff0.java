package defpackage;

import android.app.Activity;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.HashSet;
import kotlin.jvm.functions.Function2;

/* renamed from: Ff0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0426Ff0 extends AbstractC1676Vg0 implements Function2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ C0504Gf0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0426Ff0(C0504Gf0 c0504Gf0, int i) {
        super(2);
        this.e = i;
        this.f = c0504Gf0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws C1319Qr0 {
        switch (this.e) {
            case 0:
                Object[] objArr = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE0 = (InterfaceC7754wE0) obj2;
                O90.f(objArr, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str = (String) objArr[0];
                try {
                    C6075nR c6075nRD = C0504Gf0.d(this.f);
                    O90.f(str, "tag");
                    Activity activityC = c6075nRD.c();
                    HashSet hashSet = c6075nRD.a;
                    if (hashSet.isEmpty()) {
                        activityC.runOnUiThread(new RunnableC8286z2(activityC, 5));
                    }
                    hashSet.add(str);
                    interfaceC7754wE0.b(true);
                } catch (C8314zB unused) {
                    interfaceC7754wE0.f(new C7143t2(0));
                }
                break;
            default:
                Object[] objArr2 = (Object[]) obj;
                InterfaceC7754wE0 interfaceC7754wE02 = (InterfaceC7754wE0) obj2;
                O90.f(objArr2, "<name for destructuring parameter 0>");
                O90.f(interfaceC7754wE02, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str2 = (String) objArr2[0];
                try {
                    C6075nR c6075nRD2 = C0504Gf0.d(this.f);
                    O90.f(str2, "tag");
                    Activity activityC2 = c6075nRD2.c();
                    HashSet hashSet2 = c6075nRD2.a;
                    if (hashSet2.size() == 1 && hashSet2.contains(str2)) {
                        activityC2.runOnUiThread(new RunnableC8286z2(activityC2, 4));
                    }
                    hashSet2.remove(str2);
                    interfaceC7754wE02.b(true);
                } catch (C8314zB unused2) {
                    interfaceC7754wE02.f(new C7143t2(1));
                }
                break;
        }
        return C1518Tf1.a;
    }
}
