package p000;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* renamed from: zS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11928zS1 {
    /* renamed from: a */
    public static void m26440a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* renamed from: b */
    public static InterfaceC10059kq0 m26441b(String str, Iterable iterable) {
        C9931jq0 c9931jq0;
        O90.m5968f(str, "debugName");
        C11494w21 c11494w21 = new C11494w21();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c9931jq0 = C9931jq0.f35419b;
            if (!zHasNext) {
                break;
            }
            InterfaceC10059kq0 interfaceC10059kq0 = (InterfaceC10059kq0) it.next();
            if (interfaceC10059kq0 != c9931jq0) {
                if (interfaceC10059kq0 instanceof C3891cr) {
                    AbstractC0246Du.m1921n(c11494w21, ((C3891cr) interfaceC10059kq0).f25679c);
                } else {
                    c11494w21.add(interfaceC10059kq0);
                }
            }
        }
        int i = c11494w21.f44659a;
        return i != 0 ? i != 1 ? new C3891cr(str, (InterfaceC10059kq0[]) c11494w21.toArray(new InterfaceC10059kq0[0])) : (InterfaceC10059kq0) c11494w21.get(0) : c9931jq0;
    }
}
