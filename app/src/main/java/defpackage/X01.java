package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class X01 extends AbstractC1521Tg1 implements Z01, InterfaceC0655Id1 {
    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: U */
    public abstract X01 P(boolean z);

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: a0 */
    public abstract X01 T(C0733Jd1 c0733Jd1);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C5857mI.e.x((InterfaceC7916x5) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(E());
        if (!u().isEmpty()) {
            AbstractC8069xu.G(u(), sb, ", ", "<", ">", null, 112);
        }
        if (G()) {
            sb.append("?");
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
