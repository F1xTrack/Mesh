package p000;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class X01 extends AbstractC8315Tg1 implements Z01, InterfaceC7737Id1 {
    @Override // p000.AbstractC8315Tg1
    /* renamed from: U */
    public abstract X01 mo250P(boolean z);

    @Override // p000.AbstractC8315Tg1
    /* renamed from: a0 */
    public abstract X01 mo252T(C7789Jd1 c7789Jd1);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C6417mI.f37619e.m22768x((InterfaceC7116x5) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo3797E());
        if (!mo3800u().isEmpty()) {
            AbstractC7167xu.m25961G(mo3800u(), sb, ", ", "<", ">", null, 112);
        }
        if (mo3798G()) {
            sb.append("?");
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
