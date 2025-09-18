package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* renamed from: zS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8367zS1 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static InterfaceC5578kq0 b(String str, Iterable iterable) {
        C5387jq0 c5387jq0;
        O90.f(str, "debugName");
        C7718w21 c7718w21 = new C7718w21();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5387jq0 = C5387jq0.b;
            if (!zHasNext) {
                break;
            }
            InterfaceC5578kq0 interfaceC5578kq0 = (InterfaceC5578kq0) it.next();
            if (interfaceC5578kq0 != c5387jq0) {
                if (interfaceC5578kq0 instanceof C3277cr) {
                    AbstractC0314Du.n(c7718w21, ((C3277cr) interfaceC5578kq0).c);
                } else {
                    c7718w21.add(interfaceC5578kq0);
                }
            }
        }
        int i = c7718w21.a;
        return i != 0 ? i != 1 ? new C3277cr(str, (InterfaceC5578kq0[]) c7718w21.toArray(new InterfaceC5578kq0[0])) : (InterfaceC5578kq0) c7718w21.get(0) : c5387jq0;
    }
}
