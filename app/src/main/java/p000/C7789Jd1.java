package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: Jd1 */
/* loaded from: classes2.dex */
public final class C7789Jd1 extends AbstractC0828N9 {

    /* renamed from: b */
    public static final CC0 f5652b = new CC0(29);

    /* renamed from: c */
    public static final C7789Jd1 f5653c = new C7789Jd1(C0779MN.f7117a);

    public C7789Jd1(List list) {
        this.f7533a = C0465HN.f4250a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0699L5 c0699l5 = (C0699L5) it.next();
            c0699l5.getClass();
            String strMo2806a = BP0.f799a.mo3846b(C0699L5.class).mo2806a();
            O90.m5965c(strMo2806a);
            int iM1048W0 = f5652b.m1048W0(strMo2806a);
            int iMo3381b = this.f7533a.mo3381b();
            if (iMo3381b != 0) {
                if (iMo3381b == 1) {
                    AbstractC7056w8 abstractC7056w8 = this.f7533a;
                    O90.m5966d(abstractC7056w8, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C9819iy0 c9819iy0 = (C9819iy0) abstractC7056w8;
                    int i = c9819iy0.f34823b;
                    if (i == iM1048W0) {
                        this.f7533a = new C9819iy0(iM1048W0, c0699l5);
                    } else {
                        C7245z8 c7245z8 = new C7245z8();
                        c7245z8.f46641a = new Object[20];
                        c7245z8.f46642b = 0;
                        this.f7533a = c7245z8;
                        c7245z8.mo3382d(i, c9819iy0.f34822a);
                    }
                }
                this.f7533a.mo3382d(iM1048W0, c0699l5);
            } else {
                this.f7533a = new C9819iy0(iM1048W0, c0699l5);
            }
        }
    }
}
