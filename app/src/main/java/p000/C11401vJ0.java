package p000;

import android.text.Spannable;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* renamed from: vJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11401vJ0 {

    /* renamed from: a */
    public final ArrayList f44327a;

    public C11401vJ0(ClickableSpan[] clickableSpanArr, Spannable spannable) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < clickableSpanArr.length; i++) {
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                C11273uJ0 c11273uJ0 = new C11273uJ0();
                c11273uJ0.f43645a = spannable.subSequence(spanStart, spanEnd).toString();
                c11273uJ0.f43646b = spanStart;
                c11273uJ0.f43647c = spanEnd;
                c11273uJ0.f43648d = (clickableSpanArr.length - 1) - i;
                arrayList.add(c11273uJ0);
            }
        }
        this.f44327a = arrayList;
    }
}
