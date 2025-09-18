package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7542v7 extends C7351u7 {
    @Override // defpackage.C7351u7, defpackage.AbstractC7732w7
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.AbstractC7732w7
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
