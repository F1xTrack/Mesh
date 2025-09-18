package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: Y2 */
/* loaded from: classes.dex */
public final class C1513Y2 extends AbstractC1198T2 {

    /* renamed from: a */
    public final /* synthetic */ int f14116a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1576Z2 f14117b;

    /* renamed from: c */
    public final /* synthetic */ String f14118c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0696L2 f14119d;

    public /* synthetic */ C1513Y2(AbstractC1576Z2 abstractC1576Z2, String str, AbstractC0696L2 abstractC0696L2, int i) {
        this.f14116a = i;
        this.f14117b = abstractC1576Z2;
        this.f14118c = str;
        this.f14119d = abstractC0696L2;
    }

    @Override // p000.AbstractC1198T2
    /* renamed from: a */
    public final void mo6082a(Object obj) throws Exception {
        switch (this.f14116a) {
            case 0:
                AbstractC1576Z2 abstractC1576Z2 = this.f14117b;
                LinkedHashMap linkedHashMap = abstractC1576Z2.f14651b;
                String str = this.f14118c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC0696L2 abstractC0696L2 = this.f14119d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0696L2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                ArrayList arrayList = abstractC1576Z2.f14653d;
                arrayList.add(str);
                try {
                    abstractC1576Z2.mo2446b(iIntValue, abstractC0696L2, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                AbstractC1576Z2 abstractC1576Z22 = this.f14117b;
                LinkedHashMap linkedHashMap2 = abstractC1576Z22.f14651b;
                String str2 = this.f14118c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC0696L2 abstractC0696L22 = this.f14119d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0696L22 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = abstractC1576Z22.f14653d;
                arrayList2.add(str2);
                try {
                    abstractC1576Z22.mo2446b(iIntValue2, abstractC0696L22, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }

    /* renamed from: b */
    public void m9206b() {
        this.f14117b.m9459f(this.f14118c);
    }
}
