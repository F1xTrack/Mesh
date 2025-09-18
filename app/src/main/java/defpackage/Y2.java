package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Y2 extends T2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Z2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ L2 d;

    public /* synthetic */ Y2(Z2 z2, String str, L2 l2, int i) {
        this.a = i;
        this.b = z2;
        this.c = str;
        this.d = l2;
    }

    @Override // defpackage.T2
    public final void a(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                Z2 z2 = this.b;
                LinkedHashMap linkedHashMap = z2.b;
                String str = this.c;
                Object obj2 = linkedHashMap.get(str);
                L2 l2 = this.d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + l2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = z2.d;
                arrayList.add(str);
                try {
                    z2.b(iIntValue, l2, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                Z2 z22 = this.b;
                LinkedHashMap linkedHashMap2 = z22.b;
                String str2 = this.c;
                Object obj3 = linkedHashMap2.get(str2);
                L2 l22 = this.d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + l22 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = z22.d;
                arrayList2.add(str2);
                try {
                    z22.b(iIntValue2, l22, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }

    public void b() {
        this.b.f(this.c);
    }
}
