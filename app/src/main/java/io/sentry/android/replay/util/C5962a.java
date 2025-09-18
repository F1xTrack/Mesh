package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import p000.AbstractC9426ft1;
import p000.O90;

/* renamed from: io.sentry.android.replay.util.a */
/* loaded from: classes2.dex */
public final class C5962a implements InterfaceC5965d {

    /* renamed from: a */
    public final TextLayoutResult f34037a;

    /* renamed from: b */
    public final boolean f34038b;

    public C5962a(TextLayoutResult textLayoutResult, boolean z) {
        O90.m5968f(textLayoutResult, "layout");
        this.f34037a = textLayoutResult;
        this.f34038b = z;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: a */
    public final int mo13808a(int i) {
        return AbstractC9426ft1.m18304b(this.f34037a.getLineTop(i));
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: g */
    public final float mo13814g(int i, int i2) {
        float horizontalPosition = this.f34037a.getHorizontalPosition(i2, true);
        return (this.f34038b || mo13819l() != 1) ? horizontalPosition : horizontalPosition - this.f34037a.getLineLeft(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: i */
    public final int mo13816i(int i) {
        return AbstractC9426ft1.m18304b(this.f34037a.getLineBottom(i));
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: k */
    public final int mo13818k(int i) {
        return this.f34037a.getLineStart(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: l */
    public final int mo13819l() {
        return this.f34037a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: o */
    public final Integer mo13822o() {
        return null;
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: p */
    public final int mo13823p(int i) {
        return this.f34037a.getLineEnd(i, true);
    }

    @Override // io.sentry.android.replay.util.InterfaceC5965d
    /* renamed from: v */
    public final int mo13829v(int i) {
        return this.f34037a.isLineEllipsized(i) ? 1 : 0;
    }
}
