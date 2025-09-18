package p000;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: v7 */
/* loaded from: classes.dex */
public final class C6992v7 extends C6929u7 {
    @Override // p000.C6929u7, p000.AbstractC7055w7
    /* renamed from: a */
    public void mo25115a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p000.AbstractC7055w7
    /* renamed from: b */
    public boolean mo25362b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
