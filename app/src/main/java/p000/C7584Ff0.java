package p000;

import android.app.Activity;
import com.facebook.react.bridge.BaseJavaModule;
import java.util.HashSet;
import kotlin.jvm.functions.Function2;

/* renamed from: Ff0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7584Ff0 extends AbstractC8418Vg0 implements Function2 {

    /* renamed from: e */
    public final /* synthetic */ int f3377e;

    /* renamed from: f */
    public final /* synthetic */ C7636Gf0 f3378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7584Ff0(C7636Gf0 c7636Gf0, int i) {
        super(2);
        this.f3377e = i;
        this.f3378f = c7636Gf0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws C8180Qr0 {
        switch (this.f3377e) {
            case 0:
                Object[] objArr = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE0 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE0, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str = (String) objArr[0];
                try {
                    C6489nR c6489nRM3119d = C7636Gf0.m3119d(this.f3378f);
                    O90.m5968f(str, "tag");
                    Activity activityM23137c = c6489nRM3119d.m23137c();
                    HashSet hashSet = c6489nRM3119d.f38309a;
                    if (hashSet.isEmpty()) {
                        activityM23137c.runOnUiThread(new RunnableC7239z2(activityM23137c, 5));
                    }
                    hashSet.add(str);
                    interfaceC11518wE0.mo8104b(true);
                } catch (C7248zB unused) {
                    interfaceC11518wE0.mo8108f(new C6861t2(0));
                }
                break;
            default:
                Object[] objArr2 = (Object[]) obj;
                InterfaceC11518wE0 interfaceC11518wE02 = (InterfaceC11518wE0) obj2;
                O90.m5968f(objArr2, "<name for destructuring parameter 0>");
                O90.m5968f(interfaceC11518wE02, BaseJavaModule.METHOD_TYPE_PROMISE);
                String str2 = (String) objArr2[0];
                try {
                    C6489nR c6489nRM3119d2 = C7636Gf0.m3119d(this.f3378f);
                    O90.m5968f(str2, "tag");
                    Activity activityM23137c2 = c6489nRM3119d2.m23137c();
                    HashSet hashSet2 = c6489nRM3119d2.f38309a;
                    if (hashSet2.size() == 1 && hashSet2.contains(str2)) {
                        activityM23137c2.runOnUiThread(new RunnableC7239z2(activityM23137c2, 4));
                    }
                    hashSet2.remove(str2);
                    interfaceC11518wE02.mo8104b(true);
                } catch (C7248zB unused2) {
                    interfaceC11518wE02.mo8108f(new C6861t2(1));
                }
                break;
        }
        return C8313Tf1.f11463a;
    }
}
