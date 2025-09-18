package p000;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: u7 */
/* loaded from: classes.dex */
public class C6929u7 extends AbstractC7055w7 {
    @Override // p000.AbstractC7055w7
    /* renamed from: a */
    public void mo25115a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C7118x7.m25764e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
