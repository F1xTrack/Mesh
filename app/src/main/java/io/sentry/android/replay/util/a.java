package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import defpackage.AbstractC3857ft1;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class a implements d {
    public final TextLayoutResult a;
    public final boolean b;

    public a(TextLayoutResult textLayoutResult, boolean z) {
        O90.f(textLayoutResult, "layout");
        this.a = textLayoutResult;
        this.b = z;
    }

    @Override // io.sentry.android.replay.util.d
    public final int a(int i) {
        return AbstractC3857ft1.b(this.a.getLineTop(i));
    }

    @Override // io.sentry.android.replay.util.d
    public final float g(int i, int i2) {
        float horizontalPosition = this.a.getHorizontalPosition(i2, true);
        return (this.b || l() != 1) ? horizontalPosition : horizontalPosition - this.a.getLineLeft(i);
    }

    @Override // io.sentry.android.replay.util.d
    public final int i(int i) {
        return AbstractC3857ft1.b(this.a.getLineBottom(i));
    }

    @Override // io.sentry.android.replay.util.d
    public final int k(int i) {
        return this.a.getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.d
    public final int l() {
        return this.a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.d
    public final Integer o() {
        return null;
    }

    @Override // io.sentry.android.replay.util.d
    public final int p(int i) {
        return this.a.getLineEnd(i, true);
    }

    @Override // io.sentry.android.replay.util.d
    public final int v(int i) {
        return this.a.isLineEllipsized(i) ? 1 : 0;
    }
}
