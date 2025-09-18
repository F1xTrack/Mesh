package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: Jd1 */
/* loaded from: classes2.dex */
public final class C0733Jd1 extends N9 {
    public static final CC0 b = new CC0(29);
    public static final C0733Jd1 c = new C0733Jd1(MN.a);

    public C0733Jd1(List list) {
        this.a = HN.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L5 l5 = (L5) it.next();
            l5.getClass();
            String strA = BP0.a.b(L5.class).a();
            O90.c(strA);
            int iW0 = b.W0(strA);
            int iB = this.a.b();
            if (iB != 0) {
                if (iB == 1) {
                    AbstractC7735w8 abstractC7735w8 = this.a;
                    O90.d(abstractC7735w8, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C5220iy0 c5220iy0 = (C5220iy0) abstractC7735w8;
                    int i = c5220iy0.b;
                    if (i == iW0) {
                        this.a = new C5220iy0(iW0, l5);
                    } else {
                        C8305z8 c8305z8 = new C8305z8();
                        c8305z8.a = new Object[20];
                        c8305z8.b = 0;
                        this.a = c8305z8;
                        c8305z8.d(i, c5220iy0.a);
                    }
                }
                this.a.d(iW0, l5);
            } else {
                this.a = new C5220iy0(iW0, l5);
            }
        }
    }
}
