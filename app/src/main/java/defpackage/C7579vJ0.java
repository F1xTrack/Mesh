package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* renamed from: vJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7579vJ0 {
    public final ArrayList a;

    public C7579vJ0(ClickableSpan[] clickableSpanArr, Spannable spannable) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < clickableSpanArr.length; i++) {
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                C7388uJ0 c7388uJ0 = new C7388uJ0();
                c7388uJ0.a = spannable.subSequence(spanStart, spanEnd).toString();
                c7388uJ0.b = spanStart;
                c7388uJ0.c = spanEnd;
                c7388uJ0.d = (clickableSpanArr.length - 1) - i;
                arrayList.add(c7388uJ0);
            }
        }
        this.a = arrayList;
    }
}
